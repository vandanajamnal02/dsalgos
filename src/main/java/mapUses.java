import java.util.TreeMap;

public class mapUses {


        public static void main(String args[]) {
            int arr[] = {0,1,76,9,2,9};

            TreeMap<Integer,Integer> map = new TreeMap();
            for (int element: arr)
            {
                map.put(element,10);
            }
            map.forEach((k,v) -> System.out.println(k+" "+v));
        }



}
