public class StatTest {
  public static void main(String[] s) {
    EnKlass a = new EnKlass(1, 2, 3);
    EnKlass b = new EnKlass(4, 5, 6);
    System.out.println(a);
    System.out.println(b);
  }
}

class EnKlass {
  private int x, y;
  private static int z;

  public EnKlass(int a, int b, int c) {
    x = a;
    y = b;
    z = c;
  }

  public String toString() {
    return x + " " + y + " " + z;
  }
}
