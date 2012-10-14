Pass 4: Swing och repetition
============================

Lite repetition
---------------

### Diskussion

Hur vet man om man behöver skapa en klass, subklass, inre klass, abstrakt klass eller interface? 

### Exempel

Ge korta exempel för vardera av ovanstående fall!

Lite uppmjukande Swing
----------------------

    import java.awt.*;
    import javax.swing.*;

    public class LiteSwing implements ActionListener {

      private JFrame  fonstret;
      private JButton knapp1;
      private JButton knapp2;

      public LiteSwing() {
        fonstret = new JFrame();
        fonstret.setTitle("Uppgift 1");
        knapp1 = new JButton();
        knapp1.setText("Knapp 1");
        knapp1.addActionListener(this);
        knapp2 = new JButton();
        knapp2.setText("Knapp 2");
        knapp2.addActionListener(this);
        fonstret.setLayout(new GridLayout(2,1));
        fonstret.add(knapp1);
        fonstret.add(knapp2);
        fonstret.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fonstret.pack();
        fonstret.setVisible(true);
      }

      public void actionPerformed(ActionEvent e) {
        System.out.println("Du tryckte pa en knapp!");
        if (e.getSource() == knapp1) {
          System.out.println("Trololol!");
        }
      }

      public static void main(String[] args) {
        new LiteSwing();
      }

    }

### Konstruktorn
    
Förklara rad för rad vad som händer när konstruktorn exekveras.
	
### Knapparna
    
Vad skrivs ut när man trycker på *"Knapp 1"* respektive *"Knapp 2"*?
	
### Fönstret 

Rita hur fönstret ser ut när programmet körs!
	
Kombinatorik
------------

Kombinatorik är ett område inom diskret matematik som spelar en stor roll för datavetenskapen. En kombination `nCk` beskriver på hur många sätt man kan välja `k` element ur en mängd med `n` element.

T.ex är `3C2 = 3` då det finns `3` sätt att välja `2` element ur en mängd med `3` element vilket visas nedan:
	
Mängd med tre element: `{A,B,C}`

Delmängder med två element: `{A,B},{A,C},{B,C}`.

`nCk` kan definieras rekursivt genom:

`nC0 = nCn = 1`

`nCk = (n-1)C(k-1) + (n-1)Ck`, `n,k >= 0`, `n >= k`

### Rekursion

Skriv en metod som beräknar kombinationen `nCk` rekursivt.

### Bättre rekursion
	
För stora värden på `n` och `k` kommer anroppet `nCk = (n-1)C(k-1) + (n-1)Ck` att utföra väldigt många identiska delberäkningar (rekursiva anrop).  

Finns det något sätt att undvika detta?

Liknande labben? ''Tentauppgift: 2006-12-19, Erland, 14p/40p''
--------------------------------------------------------------

En klass med följande gränssnitt finns tillgänglig.

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

I denna uppgift kan du förutsätta en klass `DigitImplementation` som implementerar detta gränssnitt.

    public class DigitImplementation extends Digit {
        /* ... */
    }
{:.prettyprint}

Du skall nu skriva en klass, `DigitalCounter`, som ser ut som figuren till vänster nedan och som använder sig av den färdiga klassen `DigitImplementation`.

![Hela programmet](/2012/op/erfarna/pass4/tentadigit2.png) ![Ensam siffra](/2012/op/erfarna/pass4/tentadigit.png) 

Klassen skall, förutom konstruktor och `actionPerformed`, innehålla följande metod:

    // outputs a number in the range 0..99.
    // when nbr<0 outputs 99, when nbr>99 outputs 0
    public void outputNumber(int nbr);
{:.prettyprint}

När man klickar på *"down"* skall talet som visas minskas med ett och när man klickar på *“up”* ökas med ett, bägge med *“wraparound”* dvs `up(99)` blir `0` osv. Knappen *“zero”* nollställer räknaren och *“exit”* avslutar programmet.

En miniräknare ''Tentauppgift: 2008-12-16, Erland, 21p/60p''
------------------------------------------------------------

Skriv ett program som fungerar som en enkel kalkylator enligt figuren nedan:

![Miniräknare](/2012/op/erfarna/pass4/tentacounter.png)

När man skriver in tal i de 2 första textfälten och klickar på *"Add"*, *"Subtract"*, *"Multiply"* eller *"Divide"* så utförs motsvarande operation och resultatet skrivs i *"Result"*-fältet. 

Om man inte skriver in något tal eller ett felaktigt tal i *"Number 1"* eller *"Number 2"* så skall en exception kastas och fångas. 

Programmet skall ha en metod enligt:

    public void calculate(char operator) 
{:.prettyprint}
    
...som läser talen från textfälten, kastar ev. en exception (men du fångar den där du anropar `calculate`), utför operationen `operator` och skriver resultatet.

Liseberg
--------

Alla har vi varit på Liseberg och spelat Whack-A-Mole. Det är ett spel där man skall banka på saker som ploppar upp ur hål. 

Skriv ett enkelt program som simulerar detta spel.

*Tips:*

+ Konstruera ett rutnät av knappar som man kan trycka på
+ JButton har en metod `public void setEnabled(boolean enabled)`
+ `javax.swing.Timer` kommer väl till hands
