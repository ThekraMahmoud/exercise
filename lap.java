    public static void main(String[] args) {


    //1
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number1");
        int n1 = s.nextInt();
        System.out.println("Enter the number2");
        int n2=s.nextInt();
        int sum=n1+n2;
        int mult=n1*n2;
        int sub=n1-n2;
        int div=n1/n2;
        System.out.println(n1+"+"+n2+"="+sum);
        System.out.println(n1+"*"+n2+"="+mult);
        System.out.println(n1+"-"+n2+"="+sub);
        System.out.println(n1+"/"+n2+"="+div);


        //2
            System.out.println("Enter the number to mult in 10");
            int in=s.nextInt();
//            int i=1;
            for (int i=1;i<=10;i++){
                    System.out.println(i+"*"+in+"="+i*in);

            }


            double r=3.14;
            int p =s.nextInt();
//            int  p2 =*r;




            //4

int io =0;
            System.out.println("number");
            int n4= s.nextInt();
            while (io<=n4) {
                    io++;
                    System.out.println("number");
                    int n3 = s.nextInt();
                    System.out.println("The sum of numbers =");
                    System.out.println(n3 + n3);
            }
//
            System.out.println("number1");
            int number1=s.nextInt();
          System.out.println("number2");
            int number2=s.nextInt();
            System.out.println("number3");
            int number3=s.nextInt();

            int sum1=number1+number2;
            if (sum1==number3){
                    System.out.println("The sum of number 1 + number2 is equal the number3 "+number3);
            }else {
                    System.out.println("The sum of number 1 + number2 is  NOT equal the number3"+number3);

            }

            //ex6

            System.out.println("enter text");
            StringBuilder str=new StringBuilder();
StringBuilder rev=new StringBuilder();
       rev.append(s.nextLine());

            System.out.println("the revesrs"+rev.reverse());



                  7
            int im=1;
            System.out.println("enter numberto return");
            int  num9=s.nextInt();
         do {
            System.out.println("enter number:");
          int  num0=s.nextInt();

          if (num0%2==0){
                  System.out.println("is evan"+num0);
          }
          else {
                  System.out.println("is odd"+num0);

       num9++;   }}while (im>=num9);


             //ex8
            System.out.println("enter tha temperature in C");
            double f=s.nextDouble();
            double c=(9/5)+32;
            System.out.println("the convert Form C to F = "+c/f);

//
        //ex9
            System.out.println("enter the text");
            String ch= s.nextLine();

           int ch1= ch.length();
            System.out.println("length is "+ch1);

            System.out.println("enter the index number");
            int ind= s.nextInt();

            System.out.println("the index char is "+ch.charAt(ind));




//10
        System.out.println("enter th width");
        double width=s.nextDouble();

        System.out.println("enter th height");
        double height=s.nextDouble();

        double area=width*height;
        System.out.println("area  ="+area);
        double perimeter=2*(width+height);
        System.out.println(" perimeter 2"+"*"+width+height+ "="+ perimeter);


       //11

//
        int i=0;
        System.out.println("Enter the first number");
        int numm1= s.nextInt();
        System.out.println("Enter the second number");
        int numm2= s.nextInt();

        if (numm2<numm1) {
            System.out.println(numm2 + "<" + numm1);
            System.out.println(numm2 + "<=" + numm1);
            System.out.println(numm2 + "!=" + numm1);


            }

        else if (numm1<numm2) {
            System.out.println(numm1 + "<" + numm2);
            System.out.println(numm1 + "<=" + numm2);
            System.out.println(numm1 + "!=" + numm2);

        }else {
            System.out.println("numm1=numm2");


}

        System.out.println("input second");
        int second=s.nextInt();
        int hours=second/3600;
        int minutes=(second%3600)/60;
        second=second%60;
        System.out.println(hours+":"+minutes+":"+second);

//


        System.out.println("enter tha number 1");
        int d1=s.nextInt();
//        System.out.println("enter tha number 1");
        int d2=s.nextInt();
        System.out.println("enter tha number 1");
        int d3=s.nextInt();
        System.out.println("enter tha number 1");
        int d4=s.nextInt();
//

        //13
        int im=0;
        int d2=s.nextInt();
        while (im<4){
            System.out.println("enter tha number ");
            d2=s.nextInt();

            im++;
        }
        if (d2==d2){
            System.out.println("Numbers is equal!");
        }
        else {
            System.out.println("Numbers is Not equal!");

        }


       //14
        System.out.println("enter the number");
        int yu= s.nextInt();

        if(yu>0){
            System.out.println("positive");

        }else if(yu<0){
            System.out.println("negative");
        }
        else if(yu==0){
            System.out.println("Zero");
        }


//15

//
        System.out.println("enter number");
        int uo=s.nextInt();
        if (uo==-1){
            System.out.println("bay");
        }
        int ip=0;
        do{
           // System.out.println(uo + "");

            if (uo%2==0) {
                while (uo%2==0)

                System.out.println(uo + uo+"positives");
            }
            else if(uo%2!=0) {
                System.out.println("negatives"+uo+uo);

            } else if(uo==0){
                System.out.println("zero");
            }
        }while ((ip==uo));








//16
        System.out.println("enter tha number ");
        int d3=s.nextInt();
        int res=1;
       for(int iii=d3;d3%10==0;iii--)  {
            res=res+iii;
            res++;
       }


        int iop= s.nextInt();
while (iop>=3){
    System.out.println("enter the number");
    iop++;
    int rr=0;
    for (rr=0;rr<iop;iop++){
        int r3=rr+iop;

        System.out.println("the large num"+r3);
    }




        //18





      Scanner s = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = s.nextLine();
        int a;
        int indexa = 0;
        int indexa1 = 0;
        for (int aa = 0; aa <= text.length(); aa++) {
            char ch=text.charAt(aa);

            if (ch=='a'){
                indexa++;
                System.out.print(indexa);
            }


        }




}





//




