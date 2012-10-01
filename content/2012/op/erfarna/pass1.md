Pass 1: Loopar och villkorssatser
=================================

Enklare loopar
-------------------

Vad blir outputen av följande program?

ForLoopar.java

Klurigare loopar
---------------------

### Refaktorering

Skriv om följande `do while ()` loop till en `while ()` loop:

DoWhile.java

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

Diofantiska ekvationer ''Tentauppgift''
---------------------------------------

En ekvation på formen `Ax + By + Cz = D`, där `A`, `B`, `C` och `D` är heltal kallas för en diofantisk ekvation.

Ekvationen kan ha noll eller flera lösningar. Vi är i denna uppgift bara intresserade av ekvationer i vilka `A`, `B`, `C` och `D` är heltal som är större än noll och vi söker bara sådana lösningar där `x`, `y` och `z` alla är heltal större än eller lika med noll. Därmed vet vi t.ex. att `x <= D/A`. 

Skriv ett program som läser in de fyra talen `A`, `B`, `C` och `D` och sedan skriver ut alla lösningar enligt ovan och slutligen även antalet lösningar.
