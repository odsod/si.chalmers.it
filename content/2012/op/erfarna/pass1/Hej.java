public class Uppgift1 {

    for(int i = 1; i <= 5; i++) {
        System.out.println(i * i);
    }  

    for(int i = 1; i <= 10; i++) {
        if(i % 2 == 0) {
            System.out.println(i);
        }
    }

    for(int i = 1; i <= 3; i++) {
        for(int j = 3; j >= 1; j--) {
            System.out.println(i * j);
        }
    }

    for(int i = 3; i >= 1; i--) {
        for(int j = 3; j >= 1; j--) {
            System.out.println(i * j);
        }
    }

    for(int i = 1; i <= 5; i++) {
        if(i%2 == 0) {
            for(int j = 1; j <= 3; j++) {
                System.out.println(i * j);
            }
        }
    }

}
