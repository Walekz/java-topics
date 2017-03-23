import java.util.Map;
import java.util.HashMap;

public class MapCollection {

  private Map<String, Integer> map = new HashMap<String, Integer>();

  private Map<String, Integer> fillMap(){
    map.put("Martin",5);
    map.put("josdem",4);
    map.put("Octavio",3);
    return map;
  }

  private Integer getScore(String player){
    return map.get(player);
  }

  public static void main(String args[]){
    MapCollection mapCollection = new MapCollection();
    Map<String, Integer> result = mapCollection.fillMap();
    for(Map.Entry<String, Integer> entity : result.entrySet()){
      System.out.println("key: " + entity.getKey() + " value: " + entity.getValue());
    }

    Integer playerScore = mapCollection.getScore("Martin");
    System.out.println("Martin has this score: " + playerScore);
  }

}
