import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //EX1


        //EX2

//       int numberOfText=0;
////        String a="";
//
//        switch(numberOfText){
//            case 1:
//                String a ="First";
//             System.out.println(a);
//            break;
//
//            case 2:
//
//             a ="Scond" ;
//             System.out.println(a);
//              break;
//
//            case 3:
//             a="Three";
//             System.out.println(a);
//             break;
//
//        }

//        System.out.println("Ex2");
//        int i = 0;
//        int na=0;
//        if (na>=0) {
//            System.out.println("How number of reverse do You wont ? Most be enter number");
//             na=sc.nextInt();
//             sc.nextLine();
//            do {
////                for(numberOfText=1;numberOfText<=3;numberOfText++){
//                StringBuilder text = new StringBuilder();
//                System.out.println("Enter the text to revise");
////                System.out.println("Enter the"+numberOfText+"text to revise");
//
//
//                text.append(sc.nextLine());
//                System.out.println("Th revise is " + '\n' + text.reverse()+'\n'+"############");
//                i++;
//
//            }while (i <= na);
//            System.out.println("THINK YOU **!");
//        }
//

//        System.out.println("Ex3##########################3");
//        //EX3
//
//        System.out.println("If you wont learning Malt table use these program");
//        int enterValue=sc.nextInt();
//        for (int i1=0;i1<=10;i1++){
//            System.out.println("------------------------------");
//            System.out.println(enterValue+"          *        "+i1+"   =   "+enterValue*i1);
//            System.out.println("------------------------------");
//
//        }
                                                                                                                                                                                                                                                                            System.out.println("If you wont learning Malt table use these program");




  System.out.println("Ex4##########################");


            int i4=1;
            System.out.println("enter number1");
            int number1=sc.nextInt();

            System.out.println("enter number2");
            int number2=sc.nextInt();

            System.out.println("select the number wont to use");
            int select =sc.nextInt();
            sc.nextLine();

        int resalt=1;
                 if (select == 1) {
       for (i4=1;i4<=number2;i4++){
        resalt=resalt*number1;
           System.out.println(resalt);


       }
                 } else if (select == 2) {
//                      System.out.println(number2);
                     for (i4=1;i4<=number1;i4++){
                         resalt=resalt*number1;
                         System.out.println(resalt);

                     }





    }
    }
}
