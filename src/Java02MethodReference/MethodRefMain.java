package Java02MethodReference;

@FunctionalInterface
interface SAM {
    void display(String str);
}

public class MethodRefMain {

    public static void main(String[] args) {

        //static method reference
        SAM print = System.out::println;
        print.display("Hello world !");
    }





}
