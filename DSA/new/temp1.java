import java.util.ArrayList;

import java.util.List;
import java.util.Arrays;

public class temp1 {

    public static void main(String[] args) {
      new p().show();
    }
} 
class p{
  List<List<Integer>> set=new ArrayList<>();
  void B(List<Integer> k)
  {
    if(!set.contains(k.getLast()%3))
      set.add(k);
    else B()
  }
  void show()
  {
    List<Integer> l=new ArrayList<>();
    l.add(13);
    B(l);
    
    for(List<Integer> L :set)
    {
      System.out.println(L);
    }
  }
}