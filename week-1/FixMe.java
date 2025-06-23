import java.util.ArrayList;
import java.util.List;

public class FixMe {
    public static void main(String[] args) {
        // Test the method with different inputs
        // 1. Added '()' brackets to ArrayList when creating it
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(-1);
        list.add(3);
        list.add(-4);
        list.add(-5);
        list.add(6);

        // list up to here contains [1, 2, -1, 3, -4, -5, 6]
        removeNegatives(list);
        // list should contain [1, 2, 3, 6]
        System.out.println(list);
        
        // 2. Added '}' to close the main method, before we define the removeNegatives method
    }

    /**
     * The method removes all elements smaller than zero from the list
     * @param list the list from which elements are removed
     */
    public static void removeNegatives(ArrayList<Integer> list) {
        int index = 0;
        // 3. added '()' brackets to while loop's condition
        while (index < list.size()) {
            int element = list.get(index);
            // fixed the logic from '>' to '<'
            // because check for negative values, then remove from the list
            if (element < 0) {
                // 4. fixed typo: 'inde' to 'index'
                list.remove(index);
            } else {
                index++;
            }
        }
    }
}