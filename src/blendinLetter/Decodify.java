package blendinLetter;

import java.util.ArrayList;
import java.util.Arrays;

public class Decodify {
	
	private String code;
	private String keyword;
	private String text;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	private ArrayList <String> lowerAlphabet = new ArrayList<String>(Arrays.asList(" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
	private ArrayList <String> upperAlphabet = new ArrayList<String>(Arrays.asList(" ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
	private ArrayList <String> exception = new ArrayList<String>(Arrays.asList(" ", ".", ",", "!", "?", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "á", "é", "í", "ó", "ú", "â", "ê", "î", "ô", "û", "ã", "õ", "ç", "(", ")", ":", ";", "'", "-", "+", "*", "/", "\n", "%", "@", "$", "¢", "£", "[", "]", "{", "}"));
	
	public void formula(){
		//Legenda:
		//keywordLetter: é a letra da palavra-chave que vai ser tirado o valor para fazer a a tradução.
		//KeywordLetterLocation: é a localização dessa letra na palavra-chave.
		int codeSize = this.code.length();
		String keywordLetter, codeLetter, textLetter = "";
		int keywordLetterLocation = 0, keywordLetterValue = 0, codeLetterValue = 0, textLetterValue;
		boolean isException, isUpper = true;
		this.text = "";
		for(int i = 0; i < codeSize; i++){
			isException = false;
			keywordLetter = String.valueOf(this.keyword.charAt(keywordLetterLocation));
			codeLetter = String.valueOf(this.code.charAt(i));
			
			//Determinar se a letra atual é uma exceção.
			for(int x = 0; x < this.exception.size(); x++){
				if(codeLetter.equalsIgnoreCase(exception.get(x))){
					isException = true;
				}
			}
			
			if(isException == true) {
				this.text += codeLetter;
			}
			
			else if (isException == false){
				//Achar o valor da letra do código e da palavra-chave.
				if(lowerAlphabet.contains(codeLetter)) {
					codeLetterValue = this.lowerAlphabet.indexOf(codeLetter) + 1 + 26;
					isUpper = false;
				}
				if(upperAlphabet.contains(codeLetter)) {
					codeLetterValue = this.upperAlphabet.indexOf(codeLetter) + 1 + 26;
					isUpper = true;
				}
				if(lowerAlphabet.contains(keywordLetter)) {
					keywordLetterValue = this.lowerAlphabet.indexOf(keywordLetter);
				}
				if(upperAlphabet.contains(keywordLetter)) {
					keywordLetterValue = this.upperAlphabet.indexOf(keywordLetter);
				}
				
				//Definir a letra traduzida.
				textLetterValue = codeLetterValue - keywordLetterValue;
				if(isUpper == true){
					textLetter = this.upperAlphabet.get(textLetterValue);
				}
				if(isUpper == false){
					textLetter = this.lowerAlphabet.get(textLetterValue);
				}
				this.text += textLetter;
				
				//Fazer mudar a letra da palavra-chave.
				if(keywordLetterLocation >= this.keyword.length() - 1){
					keywordLetterLocation = 0;
				}
				else{
					keywordLetterLocation++;
				}
			}
		}
	}
	
	public boolean checkKeyword(String keyword) {
		boolean validKeyword = true;
		for(int i = 0; i < keyword.length(); i++){
			String keywordLetter = String.valueOf(keyword.charAt(i));
			if(!this.lowerAlphabet.contains(keywordLetter) && !this.upperAlphabet.contains(keywordLetter)){
				validKeyword = false;
			}
		}
		return validKeyword;
	}
	
	public String codify(String message, String keyword){
		int codeSize = message.length();
		String keywordLetter, messageLetter, codeLetter = "";
		int keywordLetterLocation = 0, keywordLetterValue = 0, messageLetterValue = 0, codeLetterValue;
		boolean isException, isUpper = true;
		code = "";
		for(int i = 0; i < codeSize; i++){
			isException = false;
			keywordLetter = String.valueOf(keyword.charAt(keywordLetterLocation));
			messageLetter = String.valueOf(message.charAt(i));
			
			for(int x = 0; x < this.exception.size(); x++){
				if(messageLetter.equalsIgnoreCase(exception.get(x))){
					isException = true;
				}
			}
			
			if(isException == true) {
				code += messageLetter;
			}
			
			else if (isException == false){
				if(lowerAlphabet.contains(messageLetter)) {
					messageLetterValue = this.lowerAlphabet.indexOf(messageLetter);
					isUpper = false;
				}
				if(upperAlphabet.contains(messageLetter)) {
					messageLetterValue = this.upperAlphabet.indexOf(messageLetter);
					isUpper = true;
				}
				if(lowerAlphabet.contains(keywordLetter)) {
					keywordLetterValue = this.lowerAlphabet.indexOf(keywordLetter) + 26 - 1;
				}
				if(upperAlphabet.contains(keywordLetter)) {
					keywordLetterValue = this.upperAlphabet.indexOf(keywordLetter) + 26 - 1;
				}
				
				codeLetterValue = messageLetterValue + keywordLetterValue;
				if(isUpper == true){
					codeLetter = this.upperAlphabet.get(codeLetterValue);
				}
				if(isUpper == false){
					codeLetter = this.lowerAlphabet.get(codeLetterValue);
				}
				code += codeLetter;
				
				if(keywordLetterLocation >= keyword.length() - 1){
					keywordLetterLocation = 0;
				}
				else{
					keywordLetterLocation++;
				}
			}
		}
		return code;
	}
}