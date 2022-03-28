import java.util.Arrays;
import java.util.List;

public class AllInclusive {
    public static boolean containAllRots(String string, List<String> arr) {
        if (string.equals("")) {
            return true;
        }
        for (int i = 0; i < string.length(); i++) {
            String newString = "";
            System.out.println(newString += string.substring(i) + string.substring(0, i));
            if (arr.contains(newString += string.substring(i) + string.substring(0, i))) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        List<String> arr = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        System.out.println(arr.contains("bsjq"));
        System.out.println(containAllRots("bsjq", arr));
    }

}