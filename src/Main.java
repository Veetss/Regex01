public class Main {
    public static void main(String[] args) {
        String a = "I Like to code near the Lake with my friend Luke";

        String b = a.replaceAll("L[^u]ke", "BLA");

        System.out.println(b);
    }
}