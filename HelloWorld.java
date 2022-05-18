public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello, git");
        System.out.println("The second commit");
        String name = "Eugene";
        String nickname = "Barcode";
        System.out.println(name + " " + nickname);
        System.out.println("Let the countdown begin");
        Counter.main();
    }
}


class Counter {
    public static void main () {
        int x = 10;
        while (x != 0) {
            System.out.println("Counting " + x);
            x -= 1;
        }
    }
}


class Pursuit {
    public static void main () {
        System.out.println("The warming sun returns again");
        System.out.println("And melts away the snow");
    }
}


class Storm {
    public static void main() {
        System.out.println("I am an eye of the storm");
        System.out.println("I am silent and strong");
    }
}