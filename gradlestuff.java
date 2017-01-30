
import java.util.*;



public class gradlestuff{


	public static void main(String[] args){

		
		boolean valid = false;
		String arg0 = args[0];
		arg0 = arg0.toLowerCase();
		if (!(arg0.equals("triangle") || arg0.equals("lazy"))){
			
			System.exit(1);
		}
		if (!args[1) instanceof int){
			System.exit(2);
		}
		if (args[1] < 0){
			System.exit(2);
		}

		if (args[0].equals("triangle")){
			triangle(args[1]);
		}
		if (args[0].equals("lazy")){
			lazy(args[1]);
		}



	}

	public static int lazy(int n){

		int temp = n * n;
		temp += n + 2;
		temp /=2;
		return temp;

	}
}