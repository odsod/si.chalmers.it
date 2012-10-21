Pass 1: Loopar och villkorssatser
=================================

Enklare loopar
-------------------

Vad blir outputen av följande program?

    public class ForLoopar {

      for (int i = 1; i <= 5; i++) {
        System.out.println(i * i);
      }  

      for (int i = 1; i <= 10; i++) {
        if(i % 2 == 0) {
          System.out.println(i);
        }
      }

      for (int i = 1; i <= 3; i++) {
        for(int j = 3; j >= 1; j--) {
          System.out.println(i * j);
        }
      }

      for (int i = 3; i >= 1; i--) {
        for(int j = 3; j >= 1; j--) {
          System.out.println(i * j);
        }
      }

      for (int i = 1; i <= 5; i++) {
        if(i%2 == 0) {
          for(int j = 1; j <= 3; j++) {
            System.out.println(i * j);
          }
        }
      }
    }

Klurigare loopar
---------------------

### Refaktorering

Skriv om följande `do while ()` loop till en `while ()` loop:

    public class DoWhile {

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

### Lite diskussion

Hur vet man om man bör använda en `for` loop eller en `while` loop?

### Lite mera diskussion

Hur vet man om man bör använda en `if () else` sats eller en `switch () case` sats?

Lite Fibonacci
--------------

Fibonaccis talföljd: 

`0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...`

Matematisk definition:

`fib(0) = 0`

`fib(1) = 1`

`fib(n) = fib(n-1) + fib(n-2)`

Skriv ett program som skriver ut de 10 första fibonacci-talen.

Diofantiska ekvationer
----------------------
*Tentauppgift*

En ekvation på formen `Ax + By + Cz = D`, där `A`, `B`, `C` och `D` är heltal kallas för en diofantisk ekvation.

Ekvationen kan ha noll eller flera lösningar. Vi är i denna uppgift bara intresserade av ekvationer i vilka `A`, `B`, `C` och `D` är heltal som är större än noll och vi söker bara sådana lösningar där `x`, `y` och `z` alla är heltal större än eller lika med noll. Därmed vet vi t.ex. att `x <= D/A`. 

Skriv ett program som läser in de fyra talen `A`, `B`, `C` och `D` och sedan skriver ut alla lösningar enligt ovan och slutligen även antalet lösningar.
