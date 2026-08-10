public void main(String[] args) {

 //Thekra Mahmoud Shami

     Scanner input = new Scanner(System.in);

    // Exercise 1

    System.out.println("Enter the weight :");
    double weight = input.nextDouble();

    System.out.println("Enter the height : ");
    double height = input.nextDouble();

    System.out.println("The BMI resalt :");
    System.out.println(weight/(height*height));
    double bmi = input.nextDouble();


    // Exercise 2 //التوتل لاتها نسبة مئوية فهي ثابته فتركتها في الكود بدل من ان يدخلها اليوزر

    System.out.println("Enter the Obatines Marks :");
    double obatinesMarks = input.nextDouble();
    double total =(obatinesMarks/100)*100;
    System.out.println("WOW Total Marks is :"+total+"%");


    // Exercise 3

    System.out.println("how much money do you want to transfer in USD?");
    double usd =input.nextDouble();

    System.out.println("Enter the EUR Rate to one$");
    double eur = input.nextDouble();

    double result = usd*eur;
    System.out.println("Conversion result " + result);



    // Exercise 4

 System.out.println("Enter text");

 StringBuilder text = new StringBuilder();
 text.append(input.nextLine());

 System.out.println("Text Reverse :"+text.reverse());
 System.out.println("Text Length :"+text.length());



    // Exercise 5

     System.out.println( "Enter the Book text");
     String book =input.nextLine();
// use the substring function used to take values between the ranges
     System.out.println(book.substring(10,20));//start index 10 ,, End index 20 , the quick brown for jumps over the lazy dog



    // Exercise 6
    System.out.println("Enter Your Email plase");
    String email=input.nextLine();

    System.out.println("Enter KeyWord");
    String keyword=input.nextLine();

    System.out.println(email.replaceAll(keyword,"the"+" "+keyword+" "+"is keyword"));



    // Exercise 7


System.out.println("how i can help you");
System.out.println("Please enter the text : ");
String text1=input.nextLine();


System.out.println("Enter the old char ");
String oldchar=input.nextLine();

System.out.println("Enter the new char ");
String newchar=input.nextLine();

System.out.println(text1.replace(oldchar,newchar));




    // Exercise 8


System.out.println("enter a first String");
String value1 = input.nextLine();
value1 = value1.toLowerCase();

System.out.println("enter a Second String");
String value2 = input.nextLine();
value2 = value2.toLowerCase();

System.out.println(value1.equals(value2) +" "+"Tha value1 equals value2 ");





}
