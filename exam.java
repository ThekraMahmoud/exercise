import java.util.ArrayList;
import java.util.Scanner;

public class exam {
    public static void main(String[] args){





        // 1 .Write a Java program that accept three numbers from the user and print the largest number .
        Scanner s=new Scanner(System.in);

        System.out.println("Enter num1");
        int num1=s.nextInt();
        System.out.println("Enter num1");
        int num2=s.nextInt();
        System.out.println("Enter num1");
        int num3=s.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println("Thw large number is "+num1);
        }else if(num2>num1&&num2>num3){
            System.out.println("Thw large number is "+num2);}
        else if(num3>num1&&num3>num2){
            System.out.println("Thw large number is "+num3);
        }



      // 2. Write a Java program that accept a String and a number from the user, then print the character at the given index( the number) .
        System.out.println("Enter String");
        s.nextLine();
        String str=s.nextLine();
        System.out.println("Enter number of index");
        int numIndex=s.nextInt();
        for (int i=0;i<str.length();i++) {
        }
        System.out.println(""+str.charAt(numIndex));





       // 3.Write a Java program that allows the user to enter numbers repeatedly until they choose to stop, then displays the total sum of all entered numbers.

        int SmeNum=0;
        int i=0;
        int sum=0;
        while (SmeNum!=-1){
            System.out.println("Enter a number");
             SmeNum=s.nextInt();

             if (SmeNum!=-1) {
                 sum = sum + SmeNum;
             }
        }
        System.out.println("Tha sum of numbers "+sum);





        //4.Write a Java program to determine whether each number in a given array is positive or negative.

int[]arr={10,-21,30,31,-25};
 for(int ii=0;ii<arr.length;ii++){
     if (arr[ii]>0){
         System.out.println(arr[ii]+" is positive");
     }else {
         System.out.println(arr[ii]+" is negative");
     }

 }




        //5. Write a Java program to find the shortest word in a given array of strings
        String[]word={"Tuwaiq","Bootcamp","Student","JAVA",};
        int w0= word[0].length();
        for (int iii=0;iii<word.length;iii++) {
            for (int l = word[iii].length(); l>=0; l++) {
                if (w0 > l) {
                    w0 = l;
                    System.out.println(word[iii]);
                }
            }
        }

//        ArrayList<String>arrl=new ArrayList<>();
//        arrl.add("Tuwaiq");
//        arrl.add("Bootcamp");
//        arrl.add("JAVA");
//        System.out.println( arrl.get(2));


        }}
