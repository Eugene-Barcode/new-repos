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