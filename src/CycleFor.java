public class CycleFor {

    public static void print4Multiple(int i) {
        if (i % 4 == 0) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            print4Multiple(i);
        }
    }
}