/*
In this we will see how to swap sum of given two number :
__________________________________________________________
Question : Given two number a and b. Swap the two given values using sum and difference method :
__________________________________________________________________________________________________
Approach :
 */
import java.util.Scanner;
public class Main {
    static void sum(int a , int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("NOW printing the value after swapping : ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY :");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("ENTER THE VALUE THAT WILL STORE IN VARIABLE :");
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println("print the original value of array : " + arr[i]);
        }
        System.out.println("ENTER THE INDEX VALUE YOU WISH TO SWAP :");
        int i = sc.nextInt();
        int j = sc.nextInt();
        sum(arr[i] , arr[j]);
    }
}