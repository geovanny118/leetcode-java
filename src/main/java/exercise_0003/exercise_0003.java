package exercise_0003;

public class exercise_0003 {
    public static void main( String[] args )
    {
        System.out.println( "LeetCode Exercise 0003" );
        String s = "aab";
        int result = lengthOfLongestSubstring(s);
        //print result
        System.out.println(result);
    }

    static int lengthOfLongestSubstring(String s) {
        char[] arreglo = s.toCharArray();
        StringBuilder salida = new StringBuilder();
        int contador = 0;

        for (char c : arreglo) {
            CharSequence charSequence = String.valueOf(c);

            if (!salida.toString().contains(charSequence)) {
                salida.append(c);
            } else {
                if (salida.length() > contador) {
                    contador = salida.length();
                }

                salida = new StringBuilder(String.valueOf(c));
            }
        }

        if(contador == 0) {
            contador = salida.length();
        }

        if(s.isEmpty()){
            return 0;
        }else if(s.equals(" ")){
            return 1;
        }

        return contador;
    }
}
