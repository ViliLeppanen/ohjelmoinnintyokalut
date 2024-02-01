public class Pisin {
    public static void main(String[] args) {

        String currentpisin = "";

        for (String x : args) {
            if (x.length() > currentpisin.length()) {
                currentpisin = x;
            }
        }
        if (currentpisin == ""){
            System.out.printf("Ei parametreja");
        } else {
            System.out.println(currentpisin);
        }
    }
}