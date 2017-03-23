import java.util.List;
import java.util.ArrayList;

public class ListCollection {

  private List<Integer> listNumbers(){
    List<Integer> list = new ArrayList<Integer>();
    list.add(5);
    list.add(3);
    list.add(7);
    list.add(9);
    list.add(1);
    return list;
  }

  public static void main(String args[]){
    ListCollection collection = new ListCollection();
    List<Integer> result = collection.listNumbers();
    for(Integer value : result){
      System.out.println("Number: " + value);
    }
  }

}
