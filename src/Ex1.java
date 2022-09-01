import java.util.*;

public class Ex1 {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,6,4,5,5,7);
        System.out.println(Collections.binarySearch(list,5));
        System.out.println(list.indexOf(5));

        /**
         * stack
         */

        Stack<Integer> stack=new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);

        System.out.println(stack.pop());
        System.out.println(stack);

        /**
         * LinkedHashSet
         */

        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(2);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);
    }
}
