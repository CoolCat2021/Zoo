import java.util.Scanner;
class Tester {
  public static void main(String[] args) {
  String name;
  String realm;
  String gender;
  int numLegs;
  Scanner scan = new Scanner(System.in);

  System.out.println("Please enter the name of the animal: ");
  name = scan.nextLine();
  System.out.println("Please enter the realm of the animal: ");
  realm = scan.nextLine();
  System.out.println("Please enter the gender of the animal: ");
  gender = scan.nextLine();
  System.out.println("Please enter the number of legs the animal has: ");
  numLegs = scan.nextInt();
  Animal a1 = new Animal(name, realm, gender, numLegs);
  Animal a2 = new Animal();
  System.out.println(a1.toString());
  System.out.println(a2.toString());

  }
}
