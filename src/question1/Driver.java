package question1;

import java.util.LinkedList;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        FloorConstruction floorConstruction = new FloorConstruction();

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
        floorConstruction.getFloorInfo(list, false, 1);
    }
}
