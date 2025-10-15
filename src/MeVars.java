import java.util.Scanner;
public class MeVars{
    Scanner scanner=new Scanner(System.in);
            String name;
    int age;
    String hobby;
    public int getAge() {
        System.out.println("Input age.");
        return scanner.nextInt();
    }

    public String getHobby() {
        return scanner.nextLine();
    }
    public String getName(){
        return scanner.nextLine();
    }

    public MeVars(){
        this.age=getAge();
        this.hobby=getHobby();
        this.name=getName();
    }
}
