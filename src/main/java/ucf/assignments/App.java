/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
package ucf.assignments;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class App {
    public class list{
        static String[][] list=  new String[100][100];
        static int items=0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//rows are due date
//columns are items

//testing adding and item
        System.out.print("Enter item amounts: ");
        int items = sc.nextInt();
        newItem(items);

        System.out.print("\ndescription: "+list.list[1][0]+"\ndate : "+list.list[1][1]+"\nstatus : "+list.list[1][2]);


//testing remove item
        removeItem(1);
        System.out.print("\ndescription: "+list.list[1][0]+"\ndate : "+list.list[1][1]+"\nstatus : "+list.list[1][2]);

    }


    public static void newItem(int addamnt){
        Scanner sc = new Scanner(System.in);
        for(int i =1;i<=addamnt;i++){
            if(list.list[i][0] == null){
                String descript = sc.nextLine();
                list.list[i][0]= descript;
                String dueDate = sc.nextLine();
                list.list[i][1]= dueDate;
                list.list[i][2] = "incomplete";
                list.items++;
                System.out.print("\nItem has been added to list!\n");
            }else
                i++;

        }
    }

    public static void removeItem(int itemNum){
        if((list.list[itemNum][1] == null) || (list.list[itemNum][1] == null)){
            System.out.print("\nItem is already removed");
        } else
            list.list[itemNum][0] = null;
        list.list[itemNum][1] = null;
        list.list[itemNum][2] = null;
        list.items--;
        System.out.print("\nItem has been removed");

    }




}

