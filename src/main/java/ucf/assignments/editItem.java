package ucf.assignments;

import java.util.Scanner;

public class editItem {
    public static void editDescription(int itemNum) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the new description: ");
        App.list.list[itemNum + 1][0] = sc.nextLine();
        System.out.print("\nDone!\n");

    }


    public static void changeDueDate(int itemNum) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the new due date: ");
        App.list.list[itemNum + 1][1] = sc.nextLine();
        System.out.print("\nDone!\n");

    }

    public static void changeStatus(int num,int itemNum){
        if(num == 1){
            App.list.list[itemNum +1][2] = "complete";
        } else if(num == 2){
            App.list.list[itemNum +1][2] = "incomplete";
        }
    }
}