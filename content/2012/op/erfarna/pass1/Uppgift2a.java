public class Uppgift2a {

  public static void main (String[] args) {
    do {
      double ran = Math.random();
      if (ran < 0.5) {
        System.out.println(ran);
        n += 1;
      }
    } while (ran < 0.5);
  }
}
