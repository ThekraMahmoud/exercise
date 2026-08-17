import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exercise4 {
    public static void main (String[]arges) {

        Scanner s = new Scanner(System.in);

        
        //Example1
       int i = 0;
       System.out.println(" Can You Please Enter The Lingth of Array ");
       int tool = s.nextInt();
       // int[] number = new int[tool];
       for (i = 0; i < number.length; i++) {
           System.out.println(" Enter number "+i);
           number[i]=s.nextInt();
       }
       if (number[0] == number[tool-1] ) {
           System.out.println(true);
       } else if (number[0] !=number [tool-1]){
           System.out.println(false);

       }


        //Example 2
      System.out.println("Enter Tha Array Number");
        int num=s.nextInt();
        int[] find=new int[num];
        int[] sumLarge=new int[find.length];
        int i;
        for( i=0;i<find.length;i++){
            System.out.println("Enter Number"+i);
            find[i]=s.nextInt();}
        int sum=0;
        double average=0;
        int large=find[0];
        for(int avr:find) {
            sum = sum + avr;
            average = (double) sum / find.length;
            int j=0;
            for (int val : find) {
                if (val > average) {
                    sumLarge[j]=val;
                    j++;
                }

            }
        }            System.out.println("The large Number is " + Arrays.toString(sumLarge));

            // System.out.println("Tha Value in Array " + Arrays.toString(find));
            // System.out.println("The sum " + sum);
            // System.out.println("The average " + average);
            // System.out.println("The large Number is " + sumLarge);



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


//Example 4

       int i=0;

       System.out.println("Enter The Element number");
       int num=s.nextInt();
       int []swap=new int[num];
       for(int Element1:swap)
       {
           System.out.println("Enter Number "+i);
           swap[i]=s.nextInt();
 i++;  
       }
       System.out.println("Original Array"+Arrays.toString(swap));
       int tamp=swap[0];
       swap[0]=swap[swap.length-1];
       swap[swap.length-1]=tamp;
       System.out.println("After chang index 0 and List index "+Arrays.toString(swap));



//Example 5


        int i=0;
        int k=0;
        int j=0;
        System.out.println("Enter your Number");
        int number=s.nextInt();
        int []rank=new int[number];
        int []odd=new int[rank.length];
        int []even=new int[rank.length];
        int []addArray=new int[rank.length];

        for(int al:rank) {
            System.out.println("number" + i);
            rank[i] = s.nextInt();
            
        if(rank[i]%2!=0){
            odd[j]=rank[i];
            j++;
        }
        else {
            even[k]=rank[i];
            k++;
        }
            i++;}
        for(int ra=0;ra<j;ra++){
           addArray[ra]=odd[ra];
        }
        for(int rb=0;rb<k;rb++){
            addArray[j]=even[rb];
            j++;
        }
        System.out.println(Arrays.toString(addArray));





//Example 6
System.out.println("number of Array");
int number=s.nextInt();
int [] arr1=new int[number];
int [] arr2=new int[number];
int i=0;
        boolean t =true;
     for( i=0;i<arr1.length;i++) {
         System.out.println("Enter n of Array 1 ) " + i);
         arr1[i] = s.nextInt();
     }
    for (i = 0; i < arr2.length; i++) {
        System.out.println("Enter n of Array 2 )" + i);
        arr2[i] = s.nextInt();

        if (arr1[i]!= arr2[i]) {
            System.out.println(false);
            break;

        }System.out.println(t);

     }

}
        








    }}
