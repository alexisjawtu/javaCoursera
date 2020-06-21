public class hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        myFirst me = new myFirst (3,4);
        System.out.println(me.dni);
    }
    public static class myFirst {

        public int dni;

        public myFirst(int a, int b) {

            this.dni = a - b;

        }
    }
}