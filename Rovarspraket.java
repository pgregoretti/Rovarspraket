//https://www.reddit.com/r/dailyprogrammer/comments/341c03/20150427_challenge_212_easy_r%C3%B6varspr%C3%A5ket/
public class Rovarspraket {

	public static void main(String[] args) {
		robberSpeak("Jag talar Rövarspråket!");
		robberSpeak("I'm speaking Robber's language!");
		robberSpeak("Tre Kronor är världens bästa ishockeylag.");

	}

	public static void robberSpeak(String str){
		String robberStr = "";
		
		for(int i=0; i<str.length(); i++){
			if("bcdfghjklmnpqrstvwxyz".contains(str.toLowerCase().charAt(i)+"")){
				robberStr += str.charAt(i) + "o" + str.toLowerCase().charAt(i);
			} else {
				robberStr += str.charAt(i) + "";
			}
		}
		
		System.out.println(robberStr);
		
	}
	
}
