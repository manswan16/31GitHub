package gitChallenge31.GitChallenge31;

public class StringReverse {
    public static void main(String[] args) {

        String word = "AICHU";

        for (int i = word.length()-1; i >= 0; i--) {

            System.out.print( word.charAt(i));
        }
    }
}
