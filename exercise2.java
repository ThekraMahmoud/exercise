import java.util.Random;

public static void main (String [] args){

    Scanner input=new Scanner(System.in);

    System.out.println("#######################################");
    // Exercise 1

    System.out.println(" To Use Tha App Plase Enter th role , (admin),(superuser),(user)");
    String role=input.nextLine();
    role=role.trim();
    //conditional

    if (role.equalsIgnoreCase("admin")){
        System.out.println("Welcome\nYou are Administrator");
    }

    else if (role.equalsIgnoreCase("Superuser")){
        System.out.println("Welcome\nYou are Superuser");
    }

    else if (role.equalsIgnoreCase("user")){
    System.out.println("Welcome\nYou are User");
    }


    System.out.println("#######################################");
    // Exercise 2

    System.out.println("To Comper , Enter the Number please , Most Be Three Numbers");
    System.out.println(" Enter the First Number please");
    int number1=input.nextInt();

    System.out.println("Enter the Second Number please");
    int number2=input.nextInt();

    System.out.println("Enter the last Number ^__^");
    int number3=input.nextInt();

    //condition
    if (number1 > number2 &&number1 >number3) {
      System.out.println(number1 + " is Grater Thin" + " number2 " + number2 +" and number3 "+ number3);
      }

      else if (number2>number1 &&number2>number3){
          System.out.println(number2 + " is Grater" + " number3 " + number3 +" and number1 "+ number1);
      }

      else if (number3>number1 && number3>number2){
          System.out.println(number3 + " is Grater" + " number2 " + number2 +" and number1 "+ number1);


      }
else {
    System.out.println("Tha Numbers are Equal");
    }


    System.out.println("#######################################");
    // Exercise 3



    System.out.println(" To Help You , Enter A Number Form 1-7 To Representing The Days of The Week : ");
    Random r=new Random();
    int week =r.nextInt(7);

    switch(week) {
        case 1:
            System.out.println(" Sunday ");
            break;
        case 2:
            System.out.println(" Monday ");
            break;
        case 3:
            System.out.println(" Tuesday ");
            break;
        case 4:
            System.out.println(" Wednesday");
            break;

        case 5:
            System.out.println(" Thursday ");
            break;

        case 6:
            System.out.println(" Friday ");

        case 7:
            System.out.println(" Saturday ");
            break;

        default:
            System.out.println(" Invalid Week");

         System.out.println("Today is your lucky day"+week);


     }
    System.out.println("Have a nice day"+'\n' +"Thanks for using our program");

//         if (week==1) {
//             System.out.println("The Day is Sunday " + week);
//         }
//         else if (week==2) {
//             System.out.println("The Day is Monday " + week);
//         }
//         else if (week==3) {
//             System.out.println("The Day is Tuesday " + week);
//         }
//         else if (week==4) {
//             System.out.println("The Day is Wednesday " + week);
//         }
//         else if (week==5) {
//             System.out.println("The Day is Thursday " + week);
//         }
//         else if (week==6) {
//         System.out.println("The Day is Friday " + week);
//         }
//         else if (week==7) {
//             System.out.println("The Day is Saturday " + week);
//         }
//         else {
//             System.out.println("Invalid input");
//         }
//         System.out.println("Have a nice day"+'\n' +"Thanks for using our program");
//

    System.out.println("#######################################");
    // Exercise 4

    System.out.println("Hello im happe to halp you,\n Please Enter your Grade");
    double grade=input.nextDouble();

    if (grade>=90 &&grade<=100){
        System.out.println("Your grade is "+grade +'\n'+"Wow you got a A!");
    }
    else if (grade>=80&&grade<=89){
        System.out.println("Your grade is B!" +'\n'+"The Numeric Score :"+grade+"%");
    }
    else if (grade>=70&&grade<=79){
        System.out.println("You got a C!"+'\n'+"The Numeric Score :"+grade+"%");
    }
    else if (grade>=60&&grade<=69){
        System.out.println("You got a F!"+'\n'+"The Numeric Score :"+grade+"%");
    }
    else if (grade<=59){
        System.out.println("Your Failed ^_^"+'\n'+"The Numeric Score :"+grade+"%");
    }
    else{
    System.out.println("Invalid input");
    }

    System.out.println("#######################################");
    // Exercise 5


   System.out.println("hello ,  do you wont Know age categorise \n Jest enter your age to Start :");
      int age=input.nextInt();

      if (age<13){
           System.out.println("Ohh you are Cute child !~");
        }

       else if (age>13 &&age<19){
         System.out.println("You are Teenager \n lave a good live ");
        }

       else if (age>20){
        System.out.println("You are Adult \n i hope you have a nise day");
       }

       System.out.println("################################\nGoodbye !");
}




