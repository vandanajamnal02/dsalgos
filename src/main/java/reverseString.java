public class reverseString {

    public static void main(String args[]){
        String str = "Helloy";
        char[] s = str.toCharArray();
        reverseString(s);
        System.out.println(s);

    }

    public static void reverseString(char[] s) {
        int size = s.length;
        System.out.println("size : "+size);
        if(size==0){
            System.out.println("no elements");
        }
             for(int i = 0; i <=size/2;i++) {
                 int back_index = s.length-1-i;
                 char temp = s[i];
                 s[i] = s[(s.length-1)-i];
                 s[(s.length-1)-i] = temp;
             }
         }

    }

