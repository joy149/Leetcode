package gs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PredictTheOutput {

//    public static void main(String[] args) {
//        List<Short> A = new ArrayList<>();
//
//        for (short i = 0 ; i < 100; i++) {
//            A.add(i);
//
//            if (A.size() > 1) {
//                A.remove(A.size()-1);
//            }
//        }
//        System.out.println(A);
//    }
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = Arrays.asList("A", "B", "C", "D", "E");
        list1.addAll(list2);
        for (int i = 0; i<list1.size(); i++) {
            if (list1.get(i).equals("B"))
                list1.remove(i);
        }
        System.out.println(list1);

    }
}
