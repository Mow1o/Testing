package Testejä;
import java.util.*;
import java.util.Set;

class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        
      Set<String> set = new HashSet<String>();
      set.addAll(Arrays.asList(names1));
      set.addAll(Arrays.asList(names2));
      String[] result = new String[set.size()]; // Set size is 4
      set.toArray(result); //
      
      
      return result;
      
      

      
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}