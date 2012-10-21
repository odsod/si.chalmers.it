Pass 3: API och Strängar
========================

Ersätting
---------

Skriv en metod: 

    public static String replaceWord(String s, String w1, String w2)

...som ersätter alla förekomster av `w1` i en sträng med `w2`.

Räkning
-------

### Bokstäver

Skriv en metod som räknar antalet bokstäver (a-ö, A-Ö) i en sträng.

### Ord

Skriv en metod som räknar antalet ord i en sträng.

Sökning
-------

### Bokstäver


Skriv en metod: 

    public static int charOccurrences(String s, char c)

...som räknar hur många gånger en given bokstav förekommer i en sträng.

### Ord

Skriv en metod:

    public static int wordOccurences(String s, String word)

...som räknar hur många gånger ett givet ord förekommer i en sträng.

Tecken
------

Skriv en metod: 

    public static boolean containsSameChars(String s1, String s2)

...som kollar om två strängar innehåller exakt samma tecken.

*Exempel:* 

    System.out.println(containsSameChars("baba", "abab")); // => true
    System.out.println(containsSameChars("ab", "bab"));    // => false

Permutationer
-------------

Skriv en metod: 
    
    public static String[] charPermutations(String s)

...som genererar alla permutationer av alla tecken i en sträng.

*Exempel:* 

    System.out.println(charPermutations("oj")); // => ["oj", "jo"]
