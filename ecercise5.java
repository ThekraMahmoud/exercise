import java.util.Scanner;

public class ecercise5 {

    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        //Example1
        System.out.println("For comparison Enter Tha 3 number");
        System.out.println("number 1");
        int num1=s.nextInt();
        System.out.println("number 2");
        int num2=s.nextInt();
        System.out.println("number 3");
        int num3=s.nextInt();
        int small= smaallest(10,20,30);
        System.out.println(small);



        //Example 2
        System.out.println("Enter a number to check if Positive or Negative or Zero");
        int num=s.nextInt();
        check(num);


        //Example 3
        System.out.println("Enter PassWord Pleas");
        String password=s.nextLine();
        if(passwordLength(password)&&rules(password)){
            System.out.println("Tha valid input");
        }else {
            System.out.println("inValid input");

        }
    }

    //Example1
    static int smaallest(int num1,int num2,int num3){
        if(num1<num2&&num1<num3){
            return num1;
        } else if (num2<num1&&num2<num3) {
             return num2     ;
        }else{
            return num3  ;
        }
    }
    //Example 2
    static int check(int epn){
        if(epn>0){
            System.out.println("Positive");
        } else if (epn<0) {
            System.out.println("Negative");
        }else {
            System.out.println("zero");
        }
        return epn;
    }

    //Example3
    static boolean passwordLength(String password) {
        return password.length()>=10;
    }
    static boolean rules(String password){
            return password.matches("[a-zA-Z0-9]+");
    }



}