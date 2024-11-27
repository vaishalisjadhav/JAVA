import java.util.*;
public class arraylist {
public static void main(String[]args) {
	
	  ArrayList arrayList=new ArrayList();
      arrayList.add(20);
      arrayList.add("HELOO");
      arrayList.add(1, "Vaishali");
      arrayList.add("Good Afternoon");
      System.out.println(arrayList);
      arrayList.remove(1);
      System.out.println(arrayList);
      arrayList.remove(1);
      System.out.println(arrayList);
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      arrayList.add(n);
      System.out.println(arrayList);
	}
}