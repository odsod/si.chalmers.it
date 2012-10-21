Pass 5: Exceptions & Swing
==========================

Att kasta eller att inte kasta
------------------------------

### Diskutera

Vad är skillnaden mellan:

+ Checked exceptions
+ Runtime exceptions

### Avgör

Vilka av följande metoder går att kompilera?

    private void printALine1(String filename) {
      try {
        Scanner sc = new Scanner(new File(filename));
        System.out.println(sc.nextLine());
      } catch (IOException e) {
        System.out.println("Oops.");
      }
    }

    private void printALine2(String filename) throws FileNotFoundException {
      Scanner sc = new Scanner(new File(filename));
      System.out.println(sc.nextLine());
    }

    private void printALine3(String filename) {
      try {
        Scanner sc = new Scanner(new File(filename));
        System.out.println(sc.nextLine());
      } catch (Exception e) {
        throw new UnsupportedOperationException();
      }
    }

### stackoverflow.com

En användare på stackoverflow ställer följande fråga:

> *I have exceptions created for every condition that my application does not expect.*
> *`UserNameNotValidException`, `PasswordNotCorrectException`, etc.*
> *However I was told I should not create exceptions for those conditions.* 
> *In my UML those ARE exceptions to the main flow, so why should it not be an exception?*
> *Any guidance or best practices for creating exceptions?*

Vad svarar ni?

Rita en ram
-----------
*Tentauppgift: 2007-12-18, Erland, 8p/60p*

Skriv ett program som ritar figuren nedan. 

![Ram](ram.png)

När man drar i förstora-rutan så skall de två rektanglarna ändra storlek.

Rita i en panel (dvs en klass för detta) och skriv ett huvudprogram som inte får ärva en `JFrame` (men du skall använda en såklart). 

Föredragen startstorlek skall vara `340x340`.

Koda en boll 
------------
*Tentauppgift: 2006-12-22, Erland, 8p/60p*

Du skall skriva en klass `BallShape` som implementerar interfacet `Shape` och som är en boll med röd färg. 

En boll har förutom egenskaperna i `Shape` en radie. 

Konstruktorn skall ta `x` , `y` och `radie` som parametrar. 

Det räcker om du implementerar interfacet, konstruktorn och getter/setter för radien.

    public interface Shape {
        // drawing color
        public void setColor(Color c);
        // width and height of the component
        // i.e. size of smallest enclosing rectangle
        public int getWidth();
        public int getHeight();
        // position of upper left corner
        public int getX();
        public int getY();
        public void draw(Graphics g);
    }

Rita en boll
------------
*Tentauppgift: 2006-12-22, Erland, 10p/60p*

Antag nu att du skall åstadkomma figuren nedan. 

![Boll](ball.png)

Den röda bollen från förra uppgiften ligger i en `JPanel` (`BallPanel` se nästa uppgift, antag att `BallPanel` finns i denna uppgiften) och nedanför den ligger en `JLabel` och en `JSlider`. 

När man flyttar slidern så ändras cirkelns radie, minsta värde kan vara `10` och största `100` på slidern, det aktuella värdet i figuren är `30` på såväl cirkel som slider. 

Slidern skapas här men ändringar i slidern hanteras i `BallPanel` (som alltså skall lyssna på dessa).

En slider fungerar ungefär som en knapp men använder en `ChangeListener` istället för en `ActionListener` och metoden `stateChanged(ChangeEvent e)` istället för `actionPerformed(ActionEvent e)`. 

Den här klassen innehåller också en main metod som du också skriver. Döp klassen till `BallFrame`.

Gör en panel
------------
*Tentauppgift: 2006-12-22, Erland, 12p/60p*

Nu är det dags för panelen i vilken bollen ritas upp (`BallPanel`). 

Konstruktorn skall ta vidd och höjd som parametrar och den skapar en boll. 

Klassen lyssnar också på ändringar i slidern och ändrar cirkelns storlek när detta sker. Också ritar den upp sig.

(Tänk på att en `ChangeEvent` kan bero på andra saker än en ändring i slidern).

Lite observation
----------------

Givet klassen `Clock`, skriv ett program som i ett fönster kontinuerligt visar vad klockan är!

    public class Clock extends Observable implements ActionListener {
        private final Timer timer;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock() {
            timer = new Timer(1000, this);
            timer.setRepeats(true);
            hours = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            minutes = Calendar.getInstance().get(Calendar.MINUTE);
            seconds = Calendar.getInstance().get(Calendar.SECOND);
            timer.start();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == timer) { 
                seconds += 1;
                minutes += seconds / 60;
                seconds = seconds % 60;
                hours += minutes / 60;
                minutes = minutes % 60;
                setChanged();
                notifyObservers();
            }
        }

        public int getHours() { return hours; }
        public int getMinutes() { return minutes; }
        public int getSeconds() { return seconds; }    
    }

Tips:

+ `Observable` har en metod: `public void addObserver(Observer o)`
+ `Observer` är ett interface som har en metod: `public void update(Observable o, Object arg)`
