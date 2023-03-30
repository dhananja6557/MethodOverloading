public class Add {
    static int add(int a, int b) {
        int c = a + b;
        return c;
    }
    static double add(double a, double b) {
        return a + b;
    }
    static class TestOverloading {
        public static void main(String[] args) {
            System.out.println(Add.add(11,11));
            System.out.println(Add.add(11.25,11.85));
        }
    }
}
