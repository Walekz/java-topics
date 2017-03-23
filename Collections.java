import java.util.List;
import java.util.ArrayList;

public class Collections {

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
    Collections collections = new Collections();
    List<Integer> result = collections.listNumbers();
    for(Integer value : result){
      System.out.println("Number: " + value);
    }
  }

}
