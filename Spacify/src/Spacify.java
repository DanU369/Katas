public class Spacify {
    public static String spacify(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr+=str.charAt(i)+" ";
        }
        return newStr;
    }

    public static void main(String[] args) {
        String ceva="ceva";
        System.out.println(spacify(ceva));

    }
}
