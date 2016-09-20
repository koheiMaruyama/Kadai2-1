package Kuku;

public class kuku {
	public static void main(String args[]){
		
		int k1 = 1;
		int k2 = 1;
		String hyoji = "";
		
		for( ; k1 <=  9 ;){
			k2 = 1 ;
			for(; k2 <= 9;){
				
				hyoji = String.valueOf(k1 * k2);
				if(hyoji.length() == 1) {
					hyoji = " " + hyoji;
					
				}
				if(k2 == 9 ){
					System.out.println(hyoji);
				}
				else{
					System.out.print(hyoji + " ");
					
				}
					
				k2++;
			}
			k1++;
		}
		
	}
}
