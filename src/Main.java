public class Main {
    public static void main(String[] args) {
        String text1 = "Hi, my name is Ana";
        String text2 = "Nice to meet you";

        System.out.println(confrontaStringhe(text1,text2));
    }
    public static String confrontaStringhe(String text1, String text2) {
        StringBuilder risultato = new StringBuilder();

        if (text1.equals(text2)) {
            risultato.append("Le stringhe sono uguali");
        } else {
            risultato.append("Le stringhe sono diverse");
        }
        return risultato.toString();
    }
}