import java.util.ArrayList;

public class Person {

  private String name;
  private int age;
  public String hi = "teststring";

  public Person(String inputName, int inputAge) {
    name = inputName;
    age = inputAge;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGreeting() {
    return "Hi! My name is " + name + " and I am " + age + " years old";
  }

  public static void main(String[] args) {
    Person somebody = new Person("Jimmy", 54);
    System.out.println(somebody.getGreeting());
    ArrayList
  }
}
