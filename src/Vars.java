import java.util.Scanner;
public class Vars{
    Scanner scanner=new Scanner(System.in);
            String name;
    int age;
    String hobby;
    public int getAge() {
        System.out.println("Input age.");
        return scanner.nextInt();
    }

    public String getHobby() {
        System.out.println("Input hobby.");
        return scanner.nextLine();
    }
    public String getName() {
        System.out.println("Input Name.");
        return scanner.nextLine();
    }

    public Vars(){
        this.age=getAge();
        this.hobby=getHobby();
        this.name=getName();
    }
    public String toString(){
        return this.name+", a bright "+this.age+" year old, who likes to "+this.hobby;
    }
}
