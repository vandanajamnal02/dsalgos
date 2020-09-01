public class reverseSecond {
    public static void main(String args[]) {

        String s1 = "Let's take LeetCode contest";
        String qwerties = reverseString(s1);
        System.out.println(qwerties);
    }

    public static String reverseString(String s) {

        String[] s2 = s.split(" ");
        String s1 = "";
        for (int i = 0; i < s2.length; i++) {
            if(i==0){
                s1 = reverseWords(s2[i]);
            }
        else{
                s1 = s1 + " " + reverseWords(s2[i]);
            }

        }
        return s1;
    }

    public static String reverseWords(String word) {
        int size = word.length() - 1;
        char arr[] = new char[word.length()];

        for (int i = 0; i <= size; i++, size--) {
            char tmp = word.charAt(i);
            arr[i] = word.charAt(size);
            arr[size] = tmp;
        }

        return new String(arr);

    }
}
