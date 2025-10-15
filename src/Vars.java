import java.util.Scanner;
public class Vars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String myName = input.nextLine();
        System.out.println("enter your age");
        String myAge = input.nextLine();
        System.out.println("enter your house address");
        String myHouseAddress = input.nextLine();
        System.out.println("enter your current school/job");
        String mySchoolOrJob = input.nextLine();
        System.out.println("enter your nickname");
        String myNickname = input.nextLine();
        System.out.println("enter your earnings in dollars, if none, enter 0");
        String mySalary = input.nextLine();
        System.out.println("Hello, my name is "+myName+". I am "+myAge+" years old. I live at "+myHouseAddress+". My nickname is "+myNickname+" I go to school or work at "+mySchoolOrJob+", Where I earn "+mySalary+" dollars.");
    }
}
