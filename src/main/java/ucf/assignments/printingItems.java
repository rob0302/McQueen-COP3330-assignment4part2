package ucf.assignments;

public class printingItems {

    public static void printItems(){
        for(int i =1; i<101;i++){

            if(App.list.list[i][0] == null)
                continue;

            System.out.print("\ndescription: "+ App.list.list[i][0]+"\ndate : "+ App.list.list[i][1]+"\nstatus : "+ App.list.list[i][2]);
        }
    }

    public static void printIncoomplete(){
        for(int i =1;i<101;i++){
            if(App.list.list[i][0] == null){
                continue;
            }else if(App.list.list[i][2] == "incomplete"){
                System.out.print("\ndescription: "+ App.list.list[i][0]+"\ndate : "+ App.list.list[i][1]+"\nstatus : "+ App.list.list[i][2]);
            }

        }
    }
    public static void printComplete(){
        for(int i =1;i<101;i++){
            if(App.list.list[i][0] == null){
                continue;
            }else if(App.list.list[i][2] == "complete"){
                System.out.print("\ndescription: "+ App.list.list[i][0]+"\ndate : "+ App.list.list[i][1]+"\nstatus : "+ App.list.list[i][2]);
            }

        }
    }
}
