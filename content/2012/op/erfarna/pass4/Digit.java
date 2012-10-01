import java.awt.*;

public abstract class Digit {

// prefered, but not mandatory, colors
// color is set in Digit by calling getForeground()
// so users of the class can set color by calling setForeground
public static final Color greenDigit = Color.green;
public static final Color redDigit = Color.red;
public static final Color backgroundColor = Color.black;

public Digit() {/* sets the digit to 0 */}
public Digit(int n) {/* sets the digit to n */}
abstract public void setNumber(int n); // sets the digit to n
abstract public int getNumber(); // returns the current digit
abstract public void paintComponent(Graphics g); // repaints the digit

}
