import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //EX1


        //EX2

        int numberOfText = 0;
        String ae = "";

        switch (numberOfText) {
            case 1:
                String a = "First";
                System.out.println(a);
                break;

            case 2:

                a = "Scond";
                System.out.println(a);
                break;

            case 3:
                a = "Three";
                System.out.println(a);
                break;

        }

        System.out.println("Ex2");
        int i = 0;
        int na = 0;
        if (na >= 0) {
            System.out.println("How number of reverse do You wont ? Most be enter number");
            na = sc.nextInt();
            sc.nextLine();
            do {
                for (numberOfText = 1; numberOfText <= 3; numberOfText++) {
                    StringBuilder text = new StringBuilder();
                    System.out.println("Enter the text to revise");
                    System.out.println("Enter the" + numberOfText + "text to revise");


                    text.append(sc.nextLine());
                    System.out.println("Th revise is " + '\n' + text.reverse() + '\n' + "############");
                    i++;

                }

            }while (i <= na) ;
            System.out.println("THINK YOU **!");


            System.out.println("Ex3##########################3");
            //EX3

            System.out.println("If you wont learning Malt table use these program");
            int enterValue = sc.nextInt();
            for (int i1 = 0; i1 <= 10; i1++) {
                System.out.println("------------------------------");
                System.out.println(enterValue + "          *        " + i1 + "   =   " + enterValue * i1);
                System.out.println("------------------------------");

            }
            System.out.println("If you wont learning Malt table use these program");


            System.out.println("Ex4##########################");


            int i4 = 1;
            System.out.println("enter number1");
            int number1 = sc.nextInt();

            System.out.println("enter number2");
            int number2 = sc.nextInt();

            System.out.println("select the number wont to use");
            int select = sc.nextInt();
            sc.nextLine();

            int resalt = 1;
            if (select == 1) {
                for (i4 = 1; i4 <= number2; i4++) {
                    resalt = resalt * number1;
                    System.out.println(resalt);


                }
            } else if (select == 2) {
                System.out.println(number2);
                for (i4 = 1; i4 <= number1; i4++) {
                    resalt = resalt * number1;
                    System.out.println(resalt);

                }


                // }


//        System.out.println("enter number2");
//        int num2=sc.nextInt();
//


//        System.out.println(num1+num1);

//        int i5=0;
//       int enter1=sc.nextInt();


//
                System.out.println("Ex5##########################");
                System.out.println("How math time do Wont to test ?");
                int i = 0;
                int i5 = sc.nextInt();
                int odd = 0;
                int evan = 0;

                do {
                    System.out.println("enter number");
                    int num1 = sc.nextInt();
                    if (num1 % 2 == 0) {
                        evan = num1 + evan;
                    } else if (num1 % 2 != 0) {
                        odd = odd + num1;
                    }

                    System.out.println("the some of Evan number is :" + evan);
                    System.out.println("the some of odd number is :" + odd);
                    i++;


                } while (i <= i5);


                System.out.println("Ex6##########################");

                System.out.println("Enter integer value");
                int num7 = sc.nextInt();
                int p;
                int totel = 0;
                for (p = 1; p <= num7; p++) {
                    if (num7 % p == 0) {
                        totel++;
                        System.out.println("The prime number of " + p + " = " + totel);
                    } else {
                        System.out.println("not");
                    }
                }
                if (totel <= 2) {
                    System.out.println("Th prime factor is  " + totel);
                } else {
                    System.out.println("Th  factor is  " + totel + " so is not prime factor");

                }


                System.out.println("Ex7##########################");


                int ii = 0;
                int day;
                do {
                    System.out.println("Select Week");
                    int week = sc.nextInt();
                    System.out.println("Th week is:" + week);
                    System.out.println("###############################");

                    if (week <= 5) {
                        for (day = 1; day <= 7; day++) {
                            System.out.println("Th day is:" + day);
                            if (day == 1) {
                                System.out.println("----------------- ");
                                System.out.println("The| Day is |Sunday ");
                            } else if (day == 2) {
                                System.out.println("----------------- ");
                                System.out.println("The| Day is  |Monday ");
                            } else if (day == 3) {
                                System.out.println("----------------- ");
                                System.out.println("The| Day is |Tuesday ");
                            } else if (day == 4) {
                                System.out.println("----------------- ");
                                System.out.println("The| Day is |Wednesday ");
                            } else if (day == 5) {
                                System.out.println("----------------- ");
                                System.out.println("The| Day is |Thursday ");
                            } else if (day == 6) {
                                System.out.println("----------------- ");
                                System.out.println("The| Day is |Friday ");
                            } else if (day == 7) {
                                System.out.println("The| Day is |Saturday ");
                            } else {
                                System.out.println("Invalid input");
                            }

                        }
                    }
                    System.out.println("Have a nice day" + '\n' + "Thanks for using our program");
                    ii++;
                }
                while (ii <= 5);


                System.out.println("Ex8##########################3");

                int a1;
//       int e=text5;
                System.out.println("Enter the text");
                String text5 = sc.nextLine();
//        System.out.println(text5);

                for (a1 = text5.length() - 1; a1 >= 0; a1--) {
                    System.out.println("the palndeome is");
                    System.out.print(text5.charAt(a1));

                }
//         for (a=0;a<text5.length();a++)  {
//             System.out.println(text5.charAt(a));
//             System.out.println(text5);


            }

//        for(a=0;a<text5.length()/2;a++){
//            if (text5.length()!=text5.charAt(a)){
//                text5.charAt(a);a--;
//                System.out.println(text5);
//            }
//


//            System.out.println(text5.charAt(a));


        }
    }}





