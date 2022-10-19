public class Day_24_To_Lower_Case
{

    public String toLowerCase(String s) {
        String res = "";
        for (char c : s.toCharArray()) {
            // int t = (int)c;
            if (c >= 65 && c <= 90)
                res = res + (char) (c + 32);
            else
                res = res + c;

        }
        return res;
    }

}
