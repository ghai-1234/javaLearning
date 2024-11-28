package Arrays;

public class ReverseWordsInTheStrings {
    public static void main(String[] args) {
        String a = "the sky is blue";
        System.out.println(a.substring(2,6));
       // System.out.println(reverseWords(a));
    }
        public static String reverseWords(String s) {
            s = s.trim();
            String[] str = s.split("\\s+");
            int i = 0, j = str.length - 1;
            while(j>i) {
                swap(str,i,j);
                i++;
                j--;
            }

            StringBuilder b = new StringBuilder();
            for(String c : str) {
                b.append(c);
                b.append(" ");
            }
            return b.toString().trim();
        }

        public static void swap(String[] str,int i , int j ) {
            String temp = "";
            temp = str[i];
            str[i]= str[j];
            str[j] = temp;
        }


}
