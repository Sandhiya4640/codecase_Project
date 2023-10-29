package basicprg;
import java.util.Random;
import java.util.Scanner;
public class number_guessing_game {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Random r=new Random();
		int ran=r.nextInt(100)+1;
		int attempt=5;
		System.out.println(ran);
		System.out.println("Number guessing game!");
		System.out.println("You have only 5 attempts");
		System.out.println("Guess any number between 1 to 100:");
		Scanner sc=new Scanner(System.in);
	    int uran=sc.nextInt();
	   
	    
	    if (ran==uran) 
	    {
		System.out.println("YOU WON THE GAME!");
		}
	    else
	    {
         while(ran!=uran && attempt>1) {
        	 if(ran < uran) {
        		 System.out.println("YOUR GUESSED NUMBER IS HIGH");
        		 attempt--;
        		 System.out.println("You have "+attempt+" attempts");
        	 }
        	 else{
        		 System.out.println("YOUR GUESSED NUMBER IS LOW ");
        		 attempt--;
        		 System.out.println("You have "+attempt+" attempts");
        	 }
        	 uran=sc.nextInt();
        	
         }
         if (ran==uran){
  		System.out.println("YOU WON THE GAME!");
  		}
         else {
        	 System.out.println("Game over");
         }
	    }
	}
}
	   

