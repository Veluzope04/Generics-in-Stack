// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Stack<String> s1 = new Stack<>(5);
        s1.push("AA");
        s1.push("BB");
        s1.push("CC");
        s1.push("DD");
        s1.push("EE");

        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}