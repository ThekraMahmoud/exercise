import jdk.swing.interop.SwingInterOpUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ecercise6 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        //Example 1
try {
   System.out.println("number one");
   int n1 = s.nextInt();
   System.out.println("number tow");
   int n2 = s.nextInt();
   int sum=n1+n2;
   int mult=n1*n2;
   int sub=n1-n2;
   int div=n1/n2;
   System.out.println(n1+"+"+n2+"="+sum);
   System.out.println(n1+"*"+n2+"="+mult);
   System.out.println(n1+"-"+n2+"="+sub);
   System.out.println(n1+"/"+n2+"="+div);

}   catch (InputMismatchException e){
   System.out.println("jast number");
}   catch (ArithmeticException e){
   System.out.println(e.getMessage());
}


        //Example 2
       System.out.println("Enter number to multiplication");
       try {
           int mult = s.nextInt();
           mult(mult);
       }  catch (InputMismatchException e) {
           System.out.println("Most be Enter number");
       }

//   Example 3
       System.out.println("Enter Radius value to account area and perimeter of a circle");
       try {
           double r=s.nextInt();
           area( r);
           perimeter(r);
       } catch (InputMismatchException e) {
           System.out.println("fild inpout");
       }



        //Example 4
       int sum = 0;
       int count = 0;
       System.out.println("Enter number of time ");
       try {
           int numOFtime = s.nextInt();
           for (int i = 1; i <= numOFtime; i++) {
               System.out.println("Enter number"+i);
               int num1 = s.nextInt();
               sum = sum + num1;
               count++;
           }
           System.out.println("Tha average is "+sum/count);
       }  catch (InputMismatchException e){
           System.out.println("fild inpout");
       }


        //Example 5
       try {
           System.out.println("Enter number 1");
           int num1 = s.nextInt();
           System.out.println("Enter number 2");
           int num2 = s.nextInt();
           System.out.println("Enter number 3");
           int num3 = s.nextInt();
           vs(num1,num2,num3);

       }catch (InputMismatchException e){
           System.out.println("fild inpout");
       }


        //Example 6
     System.out.println("Enter String ");
     String text=s.nextLine();
     reverse(text);

        Example7
       try {
           System.out.println("Enter number to test");
           int num1 = s.nextInt();
           test(num1);
       }catch (InputMismatchException e){
           System.out.println("fild inpout");
       }


        //Example8

       System.out.println("Enter tha centigrade");
       try {
           double c = s.nextDouble();
           convert(c);
       }catch (InputMismatchException e){
           System.out.println("fild input");
       }


        //Example9
       System.out.println("Enter a text");
       String str=s.nextLine();
       System.out.println("Enter indx");
       try {
           int ind = s.nextInt();
           stingIndex(str, ind);
       } catch ( InputMismatchException e) {
           System.out.println("Mst be Enter number of index");
       }catch (StringIndexOutOfBoundsException e){
           System.out.println("The index out of length  , Start for 0 to :"+ (str.length()-1));
       }


        //Example 10

       try {

   System.out.println("Enter a Width");
   double Width = s.nextDouble();
   System.out.println("Enter a Height");
   double Height = s.nextDouble();
   rectangle(Width, Height);
}catch (InputMismatchException e){
   System.out.println("Most be Enter number");
}


//Example 11

       int a;
       int b;
       while (true) {
           try {
               System.out.println("Enter First number");
                a = s.nextInt();

           } catch (InputMismatchException e) {
               System.out.println("JAST allow a Number\n");
               s.nextLine();
               continue;
           }
               try {
                   System.out.println("Enter Second number");
                    b = s.nextInt();
                    break;
               } catch (InputMismatchException ei) {
                   System.out.println("JAST allow a Number\n");
                   s.nextLine();

                   }
           }  towNumber(a,b);



        //Example 12


       while (true) {
           try {
               System.out.println("Enter second please");
               int second = s.nextInt();
               hours(second);
           } catch (InputMismatchException e) {
               System.out.println("jast allow number");
           s.nextLine();
           }

       }


        //example 13
       int num1=0;
       int num2=0;
       int num3=0;
      while (true) {
          try {
              System.out.println("Enter number one");
               num1 = s.nextInt();
              System.out.println("Enter number tow");
               num2 = s.nextInt();
              System.out.println("Enter number Three");
               num3 = s.nextInt();
               break;
          } catch (InputMismatchException e){
              System.out.println("Most be Enter Number !!!");
              s.nextLine();
          }
      }
vsNumber(num1,num2,num3);



//Example 14

       System.out.println("Enter number to check ");
       try {
           int num = s.nextInt();
           number(num);
       }catch (InputMismatchException e1){
           System.out.println("Most Enter Number to chek");
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }


        //Example 15


       System.out.println("Enter number");
       while (true) {
           try {
              int  Enter = s.nextInt();
               testNumber(Enter);
           } catch (InputMismatchException e) {
               System.out.println(e.getMessage());
           }catch (Exception e){
               System.out.println(e.getMessage());
               break;
           }

       }



             //Example 16

       System.out.println("Enter number");
       try {
           int num = s.nextInt();
           output(num);
       }catch (InputMismatchException e){
           System.out.println("most Enter Number!!!!!!!#");
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }



        //Example 17
       int i=0;
       while (i <= 4) {

           try {
               System.out.println("Enter number");
               int a = s.nextInt();
               largeAndSmall(a);
               i++;

           } catch (InputMismatchException e) {
               System.out.println("Enter number");
           } catch (Exception e) {
               System.out.println(e.getMessage());
           }
     i++;  }




        //Example 18


        System.out.println("Enter text to find char a");
        try {
            String text = s.nextLine();
            aFind(text);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//End Main


    //Example 2 method

    static void mult(int mult) {
        try {
            if (mult <= 0) {
                throw new Exception("The value lass 1");
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println("The number " + i + "*" + mult + "=" + mult * i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
    //End 2


    //Example 3
    static void area(Double r) throws InputMismatchException {
        if (r > 0) {
            Double area = Math.PI * r * r;
            System.out.println("area account := " + area);
        } else {
            System.out.println("Radius most be grater thine zero");
        }

    }

    static void perimeter(double r) throws InputMismatchException {
        if (r > 0) {
            double perimeter = 2 * Math.PI * r;
            System.out.println("perimeter account := " + perimeter);
        } else {
            System.out.println("Radius most be grater thine zero");
        }
    }
    //End 3


    //Example 5
    public static boolean vs(int num1, int num2, int num3) {
        try {
            if ((num1 + num2 != num3)) {
                throw new Exception("The sum of number 1 and 2 most be equal == " + num3);
            }
            System.out.println(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;

    }
    //End 5;


    //Example 6
    static void reverse(String text) {
        int i = 0;
        for (i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
    //end6


    //Example 7
    static void test(int num1) {
        try {
            if (num1 == 0) {
                throw new Exception(" zero");
            } else if (num1 % 2 == 0) {
                throw new Exception("Evan");
            } else {
                throw new Exception("odd");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//end 7


    //Example 8

    static void convert(double c) {
        double f = (c * 18) + 32;
        System.out.println("tha convert C to F =" + f);

    }
//end 8


    //Example 9
    static void stingIndex(String str, int ind) {
        System.out.println(str.charAt(ind));
    }
//end9


    //Example 10
    static void rectangle(double whdth, double height) {
        try {
            double Area = whdth * height;
            double Perimeter = 2 * (whdth + height);
            throw new Exception("The Area " + Area + '\n'
                    + "The Perimeter " + Perimeter);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //end10


    //Example 11
    static void towNumber(int a, int b) {
        try {
            if (a == b) {
                throw new Exception("first number == Second number" + a + "=" + b);
            } else {
                throw new Exception("first number Not equal Second number" + a + "!=" + b);
            }
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
            try {
                if (a < b) {
                    throw new Exception("first number Lass thin Second number" + a + "<" + b);
                } else {
                    throw new Exception("first number Greater thin Second number" + a + "<" + b);
                }
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }

            try {
                if (a <= b) {
                    throw new Exception("first number Lass thin or equal  Second number" + a + "<=" + b);
                } else {
                    throw new Exception("first number Greater thin or equal  Second number" + a + "<=" + b);
                }

            } catch (Exception e3) {
                System.out.println(e3.getMessage());
            }
        }
    //end11


//Example 12


    public static void hours(int second){

        try {
            int hours = second / 3600;
            int minutes = (second % 3600) / 60;
            second = second % 60;
            throw new Exception(hours + ":" + minutes + ":" + second);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

//End 12





    //Example 13


    static void vsNumber(int num1,int num2,int num3){


            try {
                if (num1 == num3 && num2 == num1) {
                    throw new Exception("THE THREE NUMBER IS EQUULEUS TO GATHER");
                }else {
                    throw new Exception("THE THREE NUMBER IS (NOT) EQUULEUS TO GATHER");

                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
//end13


//Example 14
    public static void number  (int num) throws Exception{
        if (num==0){
            throw new Exception("num Equal 0 !");
        } else if (num>0) {
            throw new Exception("num is positive ");
        }else {
            throw new Exception("num is negative");
        }
    }

//end14

    //Example 15

    static int zero=0;
    static int postive=0;
    static int negative =0;
    static void testNumber(int Enter)throws Exception{
            if(Enter==-1) {
                System.out.println("postive " + postive);
                System.out.println("negative " + negative);
                System.out.println("zero " + zero);
                throw new Exception("Think You");
            }
            if (Enter==0){
                    zero++;
                }
                if (Enter>0){
                    postive++;
                }
                if(Enter<0){
                    negative++;
                }
        }

//end15

        //Example 16

static int rev=0;
    static void output(int num)throws Exception{

        while (num!=0){
            int degit=num%10;
            rev=rev*10+degit;
            num=num/10;
        }
        throw new Exception("The raves "+rev);

    }

//end16

    //Example 17

    static int large;
    static int small;
    static boolean first=true;
    static void largeAndSmall(int a) throws Exception{
         if(first){
          large=a;
           small=a;
          first=false;}
            if (a > large) {
                large = a;
            }if(a<small){
                small=a;}
      throw new Exception("The large "+large+"\nThe small "+small);
        }



    //Example 18

static int count=0;
    static void aFind(String text)throws Exception{

        for (int i=0;i<text.length();i++){
            char find=text.charAt(i);
            if(find=='a'){
                count++;
            }
        }
      throw new Exception("Tha char a is repeated :"+count);

    }


}









