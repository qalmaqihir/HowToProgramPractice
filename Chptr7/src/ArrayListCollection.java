import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> items=new ArrayList<>();
        items.add("red");
        items.add(0,"yellow");
        System.out.print("Display list contents with counter-controlled loop: ");
        for (int i=0;i<items.size();i++){
            System.out.printf("%s ",items.get(i));
        }
        display(items,"%nDisplay List contents with enchanced for statement: ");
        items.add("green");
        items.add("yellow");
        display(items,"%nList with two new elements: ");
        items.remove("yellow");
        display(items,"%nRemove first instance of yellow: ");

        items.remove(1);
        display(items,"%nRemove item at index 1: ");
        System.out.printf("\"red\" is %s in the list%n ",items.contains("red")? "":"not");

        System.out.printf("Size: %s%n", items.size());
    }
    public static void display(ArrayList<String> items, String header){
        System.out.printf(header);
        for (String i:items  ) {
            System.out.printf("%s ", i);
        }
        System.out.println();

    }


}
