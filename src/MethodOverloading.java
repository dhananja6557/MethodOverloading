public class MethodOverloading {
    void sum(int a, long b) {
        System.out.println(a * b);
    }
    void sum(int c, int d) {
        System.out.println(c + d);
    }

    protected void display(double a) {
        System.out.println("Data Type Double");
    }  
    private void display(String a) {
        System.out.println("Data Type String");
    }
    public static void main(String[] args) {
        MethodOverloading a = new MethodOverloading();
        MethodOverloading b = new MethodOverloading();
        a.sum(15, 235L);
        a.sum(10, 12);
        b.display("Test");
        b.display(1.5);
    }
}
