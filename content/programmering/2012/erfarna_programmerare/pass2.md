Pass 2: Klasser och nyckelord
=============================

Statiska instansvariabler
-------------------------

Vad skrivs ut när följande program exekveras?

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

Lite viktiga skillnader
-----------------------

Förklara skillnaden mellan följande begrepp:

+ klass *vs.* objekt
+ instansvariabel *vs.* klassvariabel
+ instansmetod *vs.* klassmetod
+ `private` *vs.* `public` (*vs.* `protected`)
+ `int` *vs.* `Integer`
+ `equals()` *vs.* `==`
+ `interface` *vs.* `abstract class`

Lite fler begrepp
-----------------

Förklara innebörden av följande begrepp:

+ `final`
+ konstruktor
+ getter
+ setter
+ gränssnitt

Cirklar
-------

Skriv en klass som representerar en cirkel. Cirkeln ska ha en position och en storlek. 

Det skall finnas:

+ En konstruktor
+ Metoder för att ändra och läsa av koordinaterna och storleken. 
+ En metod för att kolla om en punkt befinner sig inne i cirkeln
+ En metod för att kolla cirkeln skär (överlappar) en annan cirkel

Lyckliga tal
------------
*Tenta: 2007-12-17, Erland*

Ett positivt heltal `N` kallas lyckligt (happy) om följande förfarande leder till talet `1` :

*Upprepa: `N` = summan av kvadraterna på siffrorna i `N`*

Till exempel är `440` ett lyckligt tal, eftersom:

`440 -> 16 + 16 + 0 = 32 -> 9 + 4 = 13 -> 1 + 9 = 10 -> 1`

Positiva heltal som inte leder till `1` kallas olyckliga. De leder istället till `4` som vid fortsatt iteration ger en cykel:

`4 -> 16 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4`

### sumOfSqr 

Skriv en metod 

    public static int sumOfSqr(int n)

...som ger efterföljaren till n enligt processen ovan. Det får förutsättas att resultatet är mindre än det största tillåtna heltalet. (`Integer.MAX_VALUE`).

### isHappy 

Skriv en metod 

    public static boolean isHappy(int n) 
    
...som avgör om talet `n` är lyckligt eller ej. Det får förutsättas att antingen `1` eller `4` nås. Utnyttja metoden ovan.

### sumOfSqr (rekursiv)

Skriv en rekursiv variant av `sumOfSqr`.

### isHappy (rekursiv)

Skriv en rekursiv variant av `isHappy`.

### Fullständigt program 

Skriv ett fullständigt program som bestämmer och skriver ut antalet lyckliga tal mindre än `1000`.
