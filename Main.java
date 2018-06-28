import java.util.Arrays;
import java.util.Scanner;

class Main {

	
    public static void main(String[] args){
	Scanner  scan = new Scanner(System.in);
	int length = scan.nextInt();
	int[] arr = new int[length];
	for (int i = 0; i<length; i++){
		arr[i]=scan.nextInt();
	} 
	int max = arr[0];
         for(int i=1; i<arr.length; i++){
    		int dif  = max - arr[i];
	 	int sign = dif>>>31;
                max = max- sign*dif;	
         }
              System.out.println(max);

    }
}



