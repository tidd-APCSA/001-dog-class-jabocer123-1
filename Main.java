public class Main {
  public static void main(String[] args) {
     Dog Danny = new Dog("Danny", "Brown", "Great Dane", 12.3, true);
     Dog Dorito = new Dog("Dorito", "Orange", "Hound", 2.4, false);
     Dog Benjamin = new Dog("Benjamin", "Grey", "Pit Bull", 4.5, true);

    System.out.println(Danny.toString());
    System.out.println(Dorito.toString());
    System.out.println(Benjamin.toString());
  }
}