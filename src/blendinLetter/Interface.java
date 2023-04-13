package blendinLetter;

import java.util.Scanner;

public class Interface {
	
	public static void main(String[] args) {
		String comando;
		boolean encerrado = false;
		Decodify translate = new Decodify();
		Scanner read = new Scanner(System.in);
		do {
			try {
				System.out.println("======= Carta de Blendin =======\n\n1 - Traduzir Carta de Blendin.\n2 - Inserir mensagem codificada.\n3 - Inserir palavra-chave.\n4 - Codificar mensagem.\n5 - Mostrar código.\n6 - Mostrar texto traduzido.\n7 - Sair do algoritmo.\n\nComando: ");
				comando = read.nextLine();
				if(comando.equalsIgnoreCase("1")) {
					translate.setCode("Dtá, Qmheme i Epjrp! \nSfcv é s Tamahac. Mfxgj dvzwclb rg pvb hw 1883, t mfggclv ikhi pejii \nae whxrvscçi dyw ju qms rprkmt igé zgrêa. (Ciyjmv ikhi vhwxi qs xxtzi \n'Ndtgefsw Asnpurrlt Pnvs d Xnwkplb 3', idt é wovavigóvad xnvs riysmgwf hs \npknhwbqn hg imztg). Kwpêw hgwienttzifim gie bcvxsh xrvyjvgek, t lrtgxa qsk \npkbrltkvqwcbbw vd Mfxjpvueytlbr, upzn, im cãw pydew isuêh! \n\nMaxãg d yhi srwaxwrmh jgx qfwg: smcsah lb Kddjaej, tc imjtq plsrwge hdz gij \nemehasw hqs qigedwi qi yaiqmssweik eiee vjif gjxiaçek. Pxrwsg lr xwg zrgmemeevd \nury lgioedww (zyaiw tvsiw csj xafs, ackyykxdr), qwja psdtonw gukveah kbrlxvhejpu \nzi uwizefsw csj pxrpaswf qsalbwgh. Igé s hgóxemg qmoê hg imztg bm plsbiie vt \nJyefsqa Wwb Izmyda! Isuêh anfwb w dyw é kqiij pafme? \n\nTvdyscbb im tagenp xrrkpvqs wb kbqg tc qejxi gyvd xnvs hme vwhxrmlplb \ntwaw Oitê sw Gieew, hq upzn ikfcvwaiw rq xdzze vt bemscohpg pxnvwrmh rgh \nuryk hwalgh m qmkhm dyw ewqms vieefiqe umt w Oitê sw Gieew ayfri zeah \nur mfrwzsvpzve. Ljlb umt mh tjtkvwski sertz rvs pxrvlpz fys bãw! Ayfri sya \nbcvxg qwz ie iwzej smpmkõta fst ezrwkãd, m oie, d zrwld dbgêk hioie! Fcnrvd \nipsjsmv eijmyi lgqnryjtb ikiccmvd bvrzp cfevd w zim rwetg eiee nxiwej cw gieew \nr hwhbeyag w hrakmewg xvgiagw r elé d Jrfê vd Brqhd! \n\nXbv kdzgi, g Qmoê hg Imztg cãw rwlá tfnxsbmaxw... bwexg. Kiv pwkie qaa \niask eiee sh ahek bwyiujtnw kt zrggcagmljqeie, t yhefsw vwkd ipsfimpij, ttr \nzsx nvgsg uhmld mzfmgznhg da nkwcbrw vd brqhd bnqtéb abfjtdvzwgiz, tgxa \nfó qsclnq hgwwiçõwh pbpgvznjarif rsh uvwkõta cijxobwsh. Unw g Awytz t w \nQyfsoeif uqpejpu syjxwfsk rwz s ijm ry xxh! \n\nAeljznpetvgi, ahab wavvvjari dyw tagá eudvgiutvqs mbi peçssi \nvrltzqmetvfmgciy ggb itifimf xwcbnrvd ur pgriymrpz cejp yhi wj arns ecamvd. \nUnw xdq gyvd cz qsa-maxwclvhg. \n\nP útgmep kbmkp yhi wj yhijd é qe tsgie rs riqiap, maxãg bm rwudvqm fd \nxnwkplb. Jgx lvzwgbvhg ewe ye imztg kme e hpqfeytu, psfkmewsg kbq xxohvsh \npvwlógqpek, kqfmlpz b efda 50 r ehgmahwg i qefçpz gaahb.(Gsjrq b xggvbdwaw \nr jafcrm ktu nrvpz csj jun wwbiae). \n\nWj yhijxi psfwmpij d drpzd wrwlt bnqtéb, unw ijiahg ucv tsgi yá ehpzrga \npkvhwcbnpetvgi fp neifim qi mb beie t uvrzp nvxs sw gieew fi hpzgmm tu \n50 civpçwf.(Euww dyw d beie ewqi ltz feívd lbw lgqylgh. mftwgw dyw xafs fãd \nmaxjt xnvs p pvwlógqn!). \n\nHw iwqe xdzze, kó fcrvap lvdwg xnvs cãw fi hgmbgmeieie rwzmyd! Rá \npsfhmtya bm rrljzzej rwz e hdxhpsçãd, m psfhmtya ju rqhgmts udvpijiiahg \ngmyókada qi tdtfs. Lpuoéq udvgvsx cze vdmaçe hdxhpsg ln étgri qe udzemvp lb \nsmgw, rwldc nhggiahg iwqe whan rghbnpyxi! Bfjxonhg ewe xgsi n ebjln, i kt iykmb \nitifim qs ltucs nxme tjdkhvsg xbv exu, qmyp i rpwh yhi ndkêf rãg hioie sm aevp!\n\nJyifsqa Fdtvweexv Opsclvr, 1883\n");
					//Há um erro no nome Blendin, quando se fala no Blendin Sem Amigos tem um "a" ao invés de um "e", na palavra triângulo está faltando acentuação, no entanto, esse são erros do livro, não do algoritmo.
					translate.setKeyword("PINES");
					System.out.println("A carta de Blendin foi traduzida!\nUse o comando no menu para mostra-la.\nPressione [ENTER] para prosseguir.");
					comando = read.nextLine();
				}
				else if(comando.equalsIgnoreCase("2")){
					System.out.println("Insira o código à ser decifrado:");
					comando = read.next();
					translate.setCode(comando);
					System.out.println("Código definido com sucesso!\n");
					System.out.println("\nPressione [ENTER] para prosseguir.");
					comando = read.nextLine();
				}
				else if(comando.equalsIgnoreCase("3")){
					boolean isValid;
					System.out.println("Obs: a palavra-chave só pode conter letras e sem acentuação.\nDigite a palavra-chave:");
					comando = read.next();
					isValid = translate.checkKeyword(comando);
					if(isValid){
						translate.setKeyword(comando);
						System.out.println("Palavra-chave definida com sucesso!\n");
						System.out.println("\nPressione [ENTER] para prosseguir.");
						comando = read.nextLine();
					}
					else {
						System.out.println("Palavra-chave inválida!\nCertifique-se que a palavra-chave só contêm letras, não tem acentuação e nem 'ç'.\n");
						System.out.println("\nPressione [ENTER] para prosseguir.");
						comando = read.nextLine();
					}
				}
				else if(comando.equalsIgnoreCase("4")){
					System.out.println("Digite a mensagem à ser codificada:");
					String mensagem = read.next();
					System.out.println("Digite a palavra-chave:");
					String palavraChave = read.next();
					translate.setCode(translate.codify(mensagem, palavraChave));
					System.out.println("Código definido com sucesso!\nPressione [ENTER] para prosseguir.");
					comando = read.nextLine();
				}
				else if(comando.equalsIgnoreCase("5")) {
					System.out.println(translate.getCode());
					System.out.println("\nPressione [ENTER] para prosseguir.");
					comando = read.nextLine();
				}
				else if(comando.equalsIgnoreCase("6")){
					translate.formula();
					System.out.println(translate.getText());
					System.out.println("\nSe o texto não foi o resultado esperado certifique-se de que o código e a palavra-chave estão certos.\nPressione [ENTER] para prosseguir.");
					comando = read.nextLine();
				}
				else if(comando.equalsIgnoreCase("7")) {
					System.out.println("Tem certeza que deseja encerrar o algoritmo?\n\n0 - não\n1 - sim\n\nComando:");
					comando = read.nextLine();
					if(comando.equalsIgnoreCase("1")){
						encerrado = true;
					}
				}
				else {
					System.out.println("ERRO!\nComando inválido.\nPressione [ENTER] para prosseguir");
					comando = read.nextLine();
				}
			}
			catch(Exception a) {
				System.out.println("ERRO!\nDicas:\nSiga as instruções para dar o comando correto.\nCertifique-se que a mensagem codificada e a palavra-chave foram preenchidas e tente de novo.\nPressione [ENTER] para prosseguir");
				comando = read.nextLine();
			}
		}while(encerrado == false);	
	}
}