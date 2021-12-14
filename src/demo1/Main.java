package demo1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
//        strings.add("b");
//        strings.add("a");
//        strings.add("d");
//        strings.add("r");
//        strings.add("c");
//        strings.add("f");
//        strings.add("h");
//        strings.add("m");
//        strings.add("g");
//        strings.add("v");
//        strings.add("j");
//        strings.add("i");
//        strings.add("l");
//        strings.add("k");
//        strings.add("w");
//        strings.add("y");
//        strings.add("e");
//        strings.add("x");
//        strings.add("n");
//        strings.add("t");
//        strings.add("p");
//        strings.add("z");
//        strings.add("o");
//        strings.add("q");
//        strings.add("s");
//        strings.add("u");


        // // // a->z
//        strings.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int i = o1.compareToIgnoreCase(o2);
////                int i = o1.compareTo(o2);   // no case ignore
//                return i;
//            }
//        });


        // // // z->a
//        strings.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int j = o2.compareToIgnoreCase(o1);
////                int j = o1.compareTo(o2);   // no case ignore
//                return j;
//            }
//        });
//        System.out.println(strings);

        strings.add("hello");
        strings.add("world");
        strings.add("ok");
        strings.add("anna");
        strings.add("lesson");
        strings.add("sun");
        strings.add("one");
        strings.add("love");
        strings.add("item");
        strings.add("a");
        strings.add("banana");
        strings.add("apple");



        for (String string : strings) {
            if (string.length() <= 4) {
                System.out.println(string);
            }
        }


    }
}
