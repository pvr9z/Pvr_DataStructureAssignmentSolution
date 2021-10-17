package question1;

import java.util.LinkedList;
import java.util.Scanner;

public class FloorConstruction {

    static void getFloorInfo(LinkedList<Integer> list, boolean day, int value) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the total no of floors in the building");
        int size = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("enter the floor size given on day :" + (i + 1));
            list.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println("The order of construction is as follows\n");
        getFloorInfo(list, false, 1);
    }
}
