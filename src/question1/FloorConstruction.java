package question1;

import java.util.LinkedList;

public class FloorConstruction {

    public void getFloorInfo(LinkedList<Integer> list, boolean day, int value) {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(list.size())) {
                    for (int j = 1; j <= i + 1; j++) {
                        if (!day) System.out.println("\nDay :" + j);
                        else System.out.println("\nDay :" + value++);
                    }
                    for (int k = i; k >= 0; k--) {
                        System.out.print(list.get(k) + " ");
                        list.remove(k);
                    }
                    value += i + 1;
                    getFloorInfo(list, true, value);
                }
            }
        }
    }
}
