import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Dog zawg = new Dog();

    zawg.setName("clifford");
    zawg.setColor("red");

    String address = zawg.toString(); 
    /* without toString(), this returns an error 
    (though it is alwasy called on System.out.print())*/

    System.out.println(zawg.equals("Dog@3d012ddd"));
    System.out.println(zawg.toString().equals("Dog@3d012ddd"));
  }
}
