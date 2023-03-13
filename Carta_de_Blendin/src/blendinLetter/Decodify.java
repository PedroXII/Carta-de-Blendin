package blendinLetter;

import java.util.ArrayList;
import java.util.Arrays;

public class Decodify {
	
	private String code;
	private String keyword;
	private String keywordText;
	private String text;
	
	public String getKeywordText() {
		return keywordText;
	}

	public void setKeywordText(String keywordText) {
		this.keywordText = keywordText;
	}

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

	private ArrayList <String> alphabet = new ArrayList<String>(Arrays.asList(" ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
	
	public void formula(){
		ArrayList <String> exception = new ArrayList<String>(Arrays.asList(" ", ".", ",", "!", "?", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "á", "é", "í", "ó", "ú", "â", "ê", "î", "ô", "û", "ã", "õ", "ç", "(", ")", ":", ";", "'", "-", "+", "*", "/", "\n"));
		int keywordValue, codeValue, keywordTextIndex = 0;
		for(int i = 0; i < this.code.length(); i++) {
			boolean itsException = false;
			for(int x = 0; x < exception.size(); x++){
				if(String.valueOf(this.code.charAt(i)).equalsIgnoreCase(exception.get(x))){
					itsException = true;
				}
			}
			if (itsException == true && i > 0){
				this.text += String.valueOf(this.code.charAt(i));
			}
			else if (itsException == true && i == 0){
				this.text = String.valueOf(this.code.charAt(i));
			}
			else {
				codeValue = this.alphabet.indexOf(String.valueOf(this.code.charAt(i))) + 26 + 1;
				keywordValue = this.alphabet.indexOf(String.valueOf(this.keywordText.charAt(keywordTextIndex)));
				int textValue = codeValue - keywordValue;
				String translated = this.alphabet.get(textValue);
				if(i == 0 && itsException == false) {
					this.text = translated;
					keywordTextIndex++;
				}
				else if(itsException == false && i > 0){
					this.text += translated;
					keywordTextIndex++;
				}
			}
		}
	}
	
	public void keywordTextGenerator() {
		int keywordActualLetter = 0;
		for(int i = 0; i < this.code.length(); i++){
			if(i == 0) {
				this.keywordText = String.valueOf(this.keyword.charAt(keywordActualLetter));
				if(keywordActualLetter >= this.keyword.length() - 1){
					keywordActualLetter = 0;
				}
				else {
					keywordActualLetter++;
				}
			}
			else {
				this.keywordText += this.keyword.charAt(keywordActualLetter);
				if(keywordActualLetter >= this.keyword.length() - 1){
					keywordActualLetter = 0;
				}
				else {
					keywordActualLetter++;
				}
			}
		}
	}
	
}