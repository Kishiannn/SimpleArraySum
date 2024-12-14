package simplearraysum;

import java.util.Scanner;


public class SimpleArraySum {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int size = scan.nextInt();
       
       int[] array = new int[size];
       
       for(int i = 0; i < size; i++){
        array[i] = scan.nextInt();
       }
       
       int sum = 0;
       for(int number: array){
           sum += number;
       }
       System.out.println(sum);
    }
    
}
