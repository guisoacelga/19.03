public class ToUpperCase {
    public static void main(String[] args) {
        String str = "Words start with capital letters";
        System.out.println("El string original es: " + str);
        System.out.println("El string con mayúsculas es: " + toUpperCase(str));
    }

    public static String toUpperCase(String str){
        char c = ' ';

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == c){
                newStr = newStr + str.charAt(i);
                newStr = newStr + Character.toUpperCase(str.charAt(i+1));
                i++;
            } else {
                newStr = newStr + str.charAt(i);
            }
        }

        return newStr;
    }
}
