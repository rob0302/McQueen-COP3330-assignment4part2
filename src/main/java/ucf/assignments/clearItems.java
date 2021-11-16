package ucf.assignments;

public class clearItems {

    public static void clearList(){
        for(int i =1;i< App.list.items;){
            App.list.list[i][0] = null;
            App.list.list[i][1] = null;
            App.list.list[i][2] = null;
        }
        App.list.items =0;
    }
}
