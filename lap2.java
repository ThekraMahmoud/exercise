import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lap2 {

    public static void main() {
        Scanner s = new Scanner(System.in);

//Example 1 ;

//        System.out.println("Enter number of Array wont to Add");
//        int num = s.nextInt();
//        s.nextLine();
//        String[] arr = new String[num];
//int i=0;
//        for ( i = 0; i < num; i++) {
//            System.out.println("Enter a String " + i);
//            arr[i] = s.nextLine();
//        }
////نبغا نمر ع كل المصفوفه وكل قيمه يجيب طولها
//        int smail=arr[0].length();
//        for(  i=0;i< arr.length;i++) {
//            if (smail < arr[i].length()) {
//                smail = arr[i].length();
//            }
//        }
//            for ( i = 0; i < num; i++) {
//                if (smail == arr[i].length()) {
//                    System.out.print("The longest word ");
//                    System.out.print("["+arr[i]+"]");
//
//                }
//
//            }


        //Example 2
//        System.out.println("Enter length of array");
//        int num1=s.nextInt();
//        int []num=new int[num1];
//        int i =0;
//        for (i=0;i<num1;i++){
//            System.out.println("Enter number "+i);
//            num[i]=s.nextInt();
//        }
//        System.out.println("Enter Value wont to find  ");
//        int numtest=s.nextInt();
//        int count =0;
//        for(i=0;i<num1;i++){
//            if (numtest==num[i]){
//                count++;
//            }
//        }
//        System.out.println("the number Wont to find "+numtest+" occurs "+count+" times");
//


        //Example 3
//int []arr={1,4,17,7,25,3,100};
////تاخذ قيمة i وتمشيه في اللوب الثانيه
//for(int i=0;i<arr.length -1;i++) {
//    //تبدا تقارن قيمة i  بلانكس صفر مع ثاني قيمه وتمشيه اذا كان اقل تحغظ بمتغير وتغير مكانته
//    for (int j = i + 1; j < arr.length; j++) {
//        if (arr[i] < arr[j]) {
//            int tamp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = tamp;
//        }
//    }
//}
//System.out.println("Enter number of large Element wont to see");
//int k = s.nextInt();
//for ( int i = 0; i < k; i++) {
//    System.out.println(arr[i]);}
//


//Example 4
//        int[] arr = {5, 4, 3, 2, 1,2,3,4,5};
//        int i;
//
//        for (i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1-i];
//            arr[arr.length - 1-i] = temp;
//        }
//        for (int j=0;j<arr.length;j++){
//            System.out.print(arr[j]);
//        }


//Example 5


//        ArrayList<Integer> al=new ArrayList<>()      ;
//        int chouse;
//        do{
//            System.out.println("1.Accept Element ");
//            System.out.println("2.Display Element ");
//            System.out.println("3.Search Element ");
//            System.out.println("4.sort Element ");
//            System.out.println("5.Stop ");
//             chouse=s.nextInt();
//            switch (chouse){
//                case 1:
//                    System.out.println("Enter number of Element");
//                    int n=s.nextInt();
//                    for (int o=0;o<n;o++){
//                    System.out.println("Enter Element");
//                    int str=s.nextInt();
//                    al.add(str);}
//                    break;
//
//                case 2:
//                    System.out.println(al);
//                    break;
//
//                case 3:
//                    System.out.println("Enter number of Element");
//
//                    int surch=s.nextInt();
//                    if(al.contains(surch)){
//                    System.out.println("find");
//                    break;
//                }else {
//                        System.out.println("not find");
//                    }
//
//
//
//                case 4:
//                    al.sort((a,b)->a -b);
//                    System.out.println(al);
//                    break;
//
//
//                    case 5:
//                        System.out.println("Exit");
//
//                }
//
//
//
//
//
//        }while (chouse!=5);
//
//
//


//Example 6
//        System.out.println("Enter tha min value");
//        int min=s.nextInt();
//        System.out.println("Enter tha max value");
//        int max=s.nextInt();
//        random(min,max);
//        System.out.println("Enter tha number of random");
//        int n=s.nextInt();
//        for(int i=0;i<n;i++){
//            System.out.print(random(min,max)+"-");
//        }




//Example 7


        System.out.println("Enter your password");
        String password=s.nextLine();


        int totalscor=checLength(password)+
        checkuppelowrcase(password)+
        chekspecialCharacters(password);
        if(totalscor>=8){
            System.out.println("Password Strong");
        }else if(totalscor>=5){
            System.out.println("Password moderately");
        }else {
            System.out.println("Password weak");
        }




        //Example 8

        System.out.println("Enter number of Fibonacci terms:");
        int n=s.nextInt();
        fibonacci(n);



    }
    //Example 6
//    static int random(int min,int max) {
//        Random r = new Random();
//        return r.nextInt(max-min +1)+min;
//    }


    //Example 7

    static int checLength(String Password) {
        if (Password.length() <= 5)
            return 0;
        else if (Password.length() <= 7)
            return 2;
        else
            return 3;
    }

    static int chekspecialCharacters(String Password) {
        for (int i = 0; i < Password.length(); i++) {
            if (!Character.isLetterOrDigit(Password.charAt(i)))
                return 2;
        }
        return 0;
    }

    static int checkuppelowrcase(String Password){
        boolean ub=false;
        boolean lw=false;

        for(int i =0;i<Password.length();i++){
            if(Character.isUpperCase(Password.charAt(i)))
             ub=true;

            if(Character.isLowerCase(Password.charAt(i)))
                lw=true;
        }
        if(ub&&lw)
            return 3;
        return 0;
    }

    //Example 8

    static void fibonacci(int n){
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.println(a+"");
            int c=a+b;
            a=b;
            b=c;

        }
    }




}



