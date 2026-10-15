public class Main {
    public static void main(String[] args) {
        String s = "programming";
        for (int i = 0; i < s.length(); i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++)
                if (s.charAt(i) == s.charAt(j)) {
                    
                    seen = true; 
                    break; }
            if (!seen) {
                int count = 0;
                for (int j = 0; j < s.length(); j++)
                    if (s.charAt(i) == s.charAt(j)) 
                        count++;
                if (count > 1) System.out.println(s.charAt(i));
            }
        }
    }
}
