import java.util.ArrayList;

public class ArrrrayList {
    public static void main(String[] args) {
        ArrayList<Object> aList = new ArrayList<>();
        
        aList.add(20);            
        aList.add("HELOO");       
        aList.add(1, "JHI");      
        aList.add("HELOO");       

        aList.set(1, "HI");       
        aList.remove(2);          
        
        System.out.println("Size of the list: " + aList.size());
        System.out.println("Element at index 2: " + aList.get(2));
        System.out.println("Contents of the list: " + aList);
    }
}
