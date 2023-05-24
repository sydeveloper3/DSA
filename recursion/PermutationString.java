public class PermutationString {
    static void per(String str, String pem, int index)

    {
        if (str.length() == 0) {
            System.out.println(pem);
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char currentchar = str.charAt(i);
            String newstring = str.substring(0, i) + str.substring(i + 1);
            per(newstring, pem + currentchar, index + 1);
        }

    }

    public static void main(String[] args) {

        per("abc", "", 0);
    }

}
