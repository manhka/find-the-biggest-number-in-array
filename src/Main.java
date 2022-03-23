import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("i will find the biggest element in this array");
        int[] arr= new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter some number to create an array and find the biggest number");
        int i=0;
        while(i<arr.length){
            arr[i]=sc.nextInt();
            i++;
        }
        Arrays.sort(arr);
        System.out.println("the biggest number in this array is:" +arr[arr.length-1]);
    }
}
