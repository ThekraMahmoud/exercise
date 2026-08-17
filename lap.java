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
            for (int i=1;i<=10;i++){
                    System.out.println(i+"*"+in+"="+i*in);
            }

        

//3
        double r =s.nextInt();
        double o=3.14;
        double area=o*r*r;
        double primeter=2*o*area;
        System.out.println("number of r");
        System.out.println("The radius"+area);
        System.out.println("tha Perimeter is"+primeter);





            //4
        int count=1;
        double res=0;
        int i=1;
        System.out.println("enter the count number");
        count=s.nextInt();
        do {
         System.out.println("enter the integer");
         int n =s.nextInt();
         res=res+n;
         i++;
     } while (i<=count);
        System.out.println("the average :"+res/count);

// int io =0;
//             System.out.println("number");
//             int n4= s.nextInt();
//             while (io<=n4) {
//                     io++;
//                     System.out.println("number");
//                     int n3 = s.nextInt();
//                     System.out.println("The sum of numbers =");
//                     System.out.println(n3 + n3);
//             }





        //ex5

        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        if (n1+n2==n3){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

          //   System.out.println("number1");
          //   int number1=s.nextInt();
          // System.out.println("number2");
          //   int number2=s.nextInt();
          //   System.out.println("number3");
          //   int number3=s.nextInt();

          //   int sum1=number1+number2;
          //   if (sum1==number3){
          //           System.out.println("The sum of number 1 + number2 is equal the number3 "+number3);
          //   }else {
          //           System.out.println("The sum of number 1 + number2 is  NOT equal the number3"+number3);

          //   }




        

            //ex6

              System.out.println("Enter a String");
        String inout=s.nextLine();
        int i=0;
        int res=0;
        for (i=inout.length()-1;i>=0;i--){
            System.out.print(inout.charAt(i));
        }



    //ex7
            int i =0;
        while (i<=3){
            System.out.println("enter number");
            int e=s.nextInt();
            if (e==0){
                System.out.println("zero");
            }else if(e%2==0){
                System.out.println("evan");
            } else if (e%2!=0) {
                System.out.println("odd");
            }
            i++;
        }



             //ex8
          System.out.println("Enter tha centigrade ");
      double c=s.nextDouble();
      double f=(c*1.8)+32;
        System.out.println("tha convert C to F ="+f);


//
        //ex9
             System.out.println("enter tha text");
        String text=s.nextLine();
        System.out.println("Enter the index");
        int indexx=s.nextInt();
        System.out.println(text.charAt(indexx));





//10
        System.out.println("the width");
        double width= s.nextDouble();
        System.out.println("the height");
        double height=s.nextDouble();

        double Area=width*height;
        double preimeter =2*(width+height);
        System.out.println("Area = "+Area);
        System.out.println("preimeter = "+preimeter);




       //11

 System.out.println("number1");
        int num1=s.nextInt();
        System.out.println("number2");
        int num2=s.nextInt();

       if(num2!=num1){
        System.out.println(num2+"!="+num1);}
       if (num2<num1){
            System.out.println(num2+"<"+num1);
        } else if(num2>num1){
            System.out.println(num2+">"+num1);
        } else{
            System.out.println(num2+"="+num1);

        }

            }

        else if (numm1<numm2) {
            System.out.println(numm1 + "<" + numm2);
            System.out.println(numm1 + "<=" + numm2);
            System.out.println(numm1 + "!=" + numm2);

        }else {
            System.out.println("numm1=numm2");


}





//12
        System.out.println("input second");
        int second=s.nextInt();
        int hours=second/3600;
        int minutes=(second%3600)/60;
        second=second%60;
        System.out.println(hours+":"+minutes+":"+second);


        //13
       System.out.println("Enter number1");
        int number1=s.nextInt();
        System.out.println("Enter number2");
        int number2=s.nextInt();
        System.out.println("Enter number3");
        int number3=s.nextInt();
        System.out.println("Enter number4");
        int number4=s.nextInt();
        if (number1==number2 && number3==number4 && number1==number3) {
            System.out.println("Numbers are equal !");
        }  else {
            System.out.println("Numbers NOT equaL");
        }


       //14
 System.out.println("enter number");
int parsone=s.nextInt();

if (parsone==0){
    System.out.println("the number is Zero"+parsone);
}else if (parsone>0){
    System.out.println("th number is positive "+parsone);
}else if (parsone<0){
    System.out.println("th number is negative"+parsone);

        }


//15
int i=0;
       int t ;
       int time;
       int  p=0;
       int n=0;
       int z=0;
       int exit=0;
       System.out.println("Enter the number ");
      do{
            time =s.nextInt();
           if (time==0){
               z=z+1;
           }
           else if(time>0){
              p=p+1;
           }
           else if (time<0) {
           n=n+1;
           }
          i++;
      }
      while(time!=exit);
       System.out.println("positives"+p);
       System.out.println("zero"+ z);
       System.out.println("nagitive"+ n);;
       System.out.println("BYE bye");







//16
              System.out.println("enter number");
        int d=s.nextInt();
        int raves=0;
        while (d!=0){
           int degt=d%10;
           raves=raves*10+degt;
           d=d/10;
        }
        System.out.println(raves);

    
//ex17
        System.out.println("Enter number");
        int i = 0;
        int[] value = new int[4];
        int large=0;
        int smail = 0;

        while (i <= 3) {
            value[i] = s.nextInt();
            System.out.println(Arrays.toString(value));

            if (i == 0) {
                large = value[i];
                smail = value[i];
            } else {

                if (value[i] > large) {
                    large = value[i];
                }
                if (value[i] < smail) {
                    smail = value[i];
                }


            }
            i++;
        }
        System.out.println("the large is " + large);
        System.out.println("the large is " + smail);



        //18

     System.out.println("Enter the text");
        String text = s.nextLine();
        int a;
        int indexa = 0;
        int indexa1 = 0;
        for (int aa = 0; aa < text.length(); aa++) {
            char ch=text.charAt(aa);
            if (ch=='a'){
                indexa++;
                System.out.print(indexa);
        
            }


        }




}





//




