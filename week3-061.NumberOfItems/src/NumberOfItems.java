import java.util.ArrayList;

public class NumberOfItems {

    // implement here the method countItems
    public static int countItems(ArrayList<String> printed){
        int i = 0;
        for(String name : printed){
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Moi");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items on the list:");
        // You can remove the comment from below when the method is done
        System.out.println(countItems(list));
    }

}
