import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exercise4 {
    public static void main (String[]arges) {

        Scanner s = new Scanner(System.in);
        //Example1

//        int tool = s.nextInt();
//        int i = 0;
//        int[] number = new int[tool];
//
//        System.out.println(" Can You Please Enter The Lingth of Array ");
//
//        for (i = 0; i < number.length; i++) {
//            System.out.println(" Enter number "+i);
//            number[i]=s.nextInt();
//        }
//        if (number[0] == number[tool-1] ) {
//            System.out.println(true);
//        } else if (number[0] !=number [tool-1]){
//            System.out.println(false);
//
//        }


        //Example 2

//        System.out.println("Enter Tha Array Number");
//        int num=s.nextInt();
//        int[] find=new int[num];
//        int i;
//        for( i=0;i<find.length;i++){
//            System.out.println("Enter Number"+i);
//            find[i]=s.nextInt();
//        }
//        int sum=0;
//          double average=0;
//        int large=find[0];
//        for(int avr:find){
//            sum= sum+avr;
//            average=sum/find.length;
//
//            if(avr>large){
//                large= avr;
//            }
//        }
//        System.out.println("Tha Value in Array "+Arrays.toString(find));
//        System.out.println("The sum "+ sum);
//        System.out.println("The average "+average);
//        System.out.println("The large Number is "+large);


//Example3

        System.out.println("Enter number of Array");
        int i = 0;
        int num = s.nextInt();
        int[] bettwen = new int[num];
        int large = bettwen[0];
//        int small=bettwen[0];
        for (int value : bettwen) {
            System.out.println("number " + i);
            int input = s.nextInt();
            bettwen[i] = input;
            {
//                if (small > input) {
//                    small = input;

            }
            if (large < input) {
                large = input;
            }
            i++;
        }
        System.out.println("Array Value" + Arrays.toString(bettwen));
        System.out.println("The large value = " + large);
//        System.out.println("The small value = " + small);


//4


        















    }}