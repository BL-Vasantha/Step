import java.util.Arrays;

public class  Student {
    int id;
    String name;
    String branch;
//    Student(int id,    String name, String branch){
//        this.id= id;
//        this.name=name;
//        this.branch =branch;
//    }

    public static String welcome(){
        return "ram";
    }


    public static void main(String[] args) {
       String name = welcome();
        System.out.println(name);
    }


}
