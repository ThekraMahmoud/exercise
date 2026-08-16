import java.util.Scanner;
public class exercise3 {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);


        //Exercise1
for (int i=0;i<=100;i++)
{
     if (i % 3 == 0) {
         System.out.println("fizz "+i);
    } else if (i % 5 == 0) {
        System.out.println("Buzz "+i);
    }else if(i%3==0&&i%5==0){
        System.out.println("FizzBuzz "+i);
    }
}











        //Exercise2
        System.out.println("How many time wont to revise Your text");
        int time=s.nextInt();
        int t=0;
        do {
            t++;
            StringBuilder in = new StringBuilder();
            s.nextLine();

            System.out.println("Enter the String "+t+":");
            in.append(s.nextLine());
            System.out.println("The revise of Text " + in.reverse());
        }while (t<time);
        System.out.println("THINK YOU , BYY BYE" );

        
        // Another Solve to Exercise 2
//     System.out.println("Enter the String :");
//     String in=s.nextLine();
//     for (int b=in.length()-1;b>=0;b--)
//     {
//         System.out.print(in.charAt(b));
//     }


        
        
        
        
        
        
        //Exercise3
     System.out.println("To Calculate the factory please enter a number");
     int d=s.nextInt();
     int resalt =1;
     for( int a=d;a>=1;a--){
         resalt=resalt*a;
     }
     System.out.println(resalt);



        //   Exercise4
     System.out.println("Enter the Number one to Start");
     int num1=s.nextInt();
     System.out.println("Enter the Number Tow Please");
     int num2=s.nextInt();

     int resalt=1;
     int c;

     for(c=1;c<=num2;c++) {
         resalt = resalt * num1;
     }
     if (num2 < num1) {
         System.out.println(resalt);
     }
     for (c = 1; c <= num1; c++) {
             resalt = resalt * num2;
     }
     if (num1 < num2) {
         System.out.println(resalt);
     }


        //Example5
     System.out.println("How math time do Wont to test ?");
     int test=s.nextInt();

         int end =0;
         int res=0;
         int res1=0;

         do {
         System.out.println("Enter The Numbers?");
         int add = s.nextInt();
         if (add % 2 == 0) {
             res = res + add;
             System.out.println("The number is even");
         } else if (add % 2 != 0) {
             res1 = res1 + add;
             System.out.println("The number is odd");
         }
         end++;
     } while (end <=test);
     System.out.println( "The Add of evan number in "+res);
     System.out.println( "The Add of odd number in "+res1);



//Example 6
//
        
     System.out.println("Enter Number ");
     int positive = s.nextInt();
     int p = 1;
     int as = 0;

     if (positive <= 0) {
         System.out.println("pleas Enter the positive value");
         positive = s.nextInt();

     for (p = positive; p > 0; p--) {
         if (p % 2 != 0) {
             System.out.println("the number is prime " + p);
         } else {
             System.out.println("the number NOT a prime " + p);
         }
     }
 }






        //Example 7

        int week=0;
        int day=0;
        Random random = new Random();
        int randomeWeek=0;
        int randomedey=0;
        for ( week = 0; week <= 4; week++) {
            randomeWeek = random.nextInt(4) + 1;
            for (day = 1; day <= 7; day++) {
                randomedey = random.nextInt(7) + 1;
            }
        }
            System.out.println("the week " + randomeWeek);
            System.out.println("the day " + randomedey);

        // int dayInWeek = 0;
        // int week = 0;

        // do {
        //     System.out.println("Select week Form 1-4");
        //     int user = s.nextInt();

        //     for (int day = 1; day <= 7; day++) {
        //         dayInWeek = dayInWeek + day;
        //         if (day == 1) {
        //             System.out.println("----------------- ");
        //             System.out.println("The| Day is |Sunday ");
        //         } else if (day == 2) {
        //             System.out.println("----------------- ");
        //             System.out.println("The| Day is  |Monday ");
        //         } else if (day == 3) {
        //             System.out.println("----------------- ");
        //             System.out.println("The| Day is |Tuesday ");
        //         } else if (day == 4) {
        //             System.out.println("----------------- ");
        //             System.out.println("The| Day is |Wednesday ");
        //         } else if (day == 5) {
        //             System.out.println("----------------- ");
        //             System.out.println("The| Day is |Thursday ");
        //         } else if (day == 6) {
        //             System.out.println("----------------- ");
        //             System.out.println("The| Day is |Friday ");
        //         } else if (day == 7) {
        //             System.out.println("The| Day is |Saturday ");
        //         } else {
        //             System.out.println("Invalid input");
        //         }
        //     }

        // } while (week >= 4);




        
        
        
//Example 8

        String revase="";
        System.out.println("Enter your Text");
        String enterWord=s.nextLine();
        for(int w=enterWord.length()-1;w>=0;w--){
             revase=revase+enterWord.charAt(w);
        }

        String orginal="";
        for (int r=revase.length()-1;r>=0;r--) {
            orginal=orginal+revase.charAt(r);

            if(enterWord.equals(orginal)){
                System.out.println(true);
            }

       }
        // System.out.println("Enter your Text");
        // String enterWord=s.nextLine();
        // for(int w=enterWord.length()-1;w>=0;w--){
        //     System.out.print(enterWord.charAt(w));
        }

        
        
        
    }

}

























