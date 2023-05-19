import java.util.Scanner;

public class Class {
    public static void main(String args[]) {
        boolean opened=true;
        boolean closed=false;
        boolean passedAllDoors=false;
        int countDoor=0;

        if (opened){
            System.out.println("the first door is opened ");
            countDoor=countDoor+1;
        } if (opened){
            System.out.println("the second  door is opened ");
            countDoor=countDoor+1;
        } if (opened){
            System.out.println("the third  door is opened ");
            countDoor=countDoor+1;
        } if (opened){
            System.out.println("the fourth door is opened ");
            countDoor=countDoor+1;
        } if (opened){
            System.out.println("the fifth  door is opened ");
            countDoor=countDoor+1;
        } if (opened){
            System.out.println("the sixth  door is opened ");
            countDoor=countDoor+1;
        }
        if (countDoor==6){
            passedAllDoors=true;
        }
if (passedAllDoors){
    System.out.println("you win !!!");
}

    }
}
//second project 
//automatic score calculation
import java.util.Scanner;

public class Class1 {
    public static void main(String args[]) {
//automatic score calculation
      Scanner scan=new Scanner(System.in);
        System.out.println(" enter your grade");
        int n= scan.nextInt();
        if (n>=90 && n<=100){
            System.out.println(" <A> "+" good job");
        } else if (n>=80 && n<=90) {
            System.out.println("<B>"+ " good");
        }else if (n>=70 && n<=80) {
            System.out.println("<C>"+" you must doing hw");
        }else if (n>=60 && n<=70) {
            System.out.println("<D>"+"no comment");
        }else if (n>=50 && n<=60) {
            System.out.println("<F>"+" stay after class");
        }else if (n>=0 && n<=50) {
            System.out.println("this number is not");
        } else  {
            System.out.println(" please try again ");

    }

    }

}

