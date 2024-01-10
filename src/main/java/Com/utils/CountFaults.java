package Com.utils;
import java.util.*;

public class CountFaults {
    public static int countFaultsOf(int n, List<String> logs) {
        // Write your code here
        int replacedCount=0;
        System.out.println("m="+logs.size());
        System.out.println(logs);
        Map<String, Integer> map = new HashMap<>();
        

        for(int j=0;j<=logs.size()-1;j++)
        {
            String l = logs.get(j);
            String[] p= l.split(" ");
            if(map.get(p[0])==null && p[1].equalsIgnoreCase("error"))
            {
                map.put(p[0],1);
            }
            else if(map.get(p[0])!=null && p[1].equalsIgnoreCase("success") )
            {
                map.put(p[0],0);
            }
            else if(map.get(p[0])!=null && p[1].equalsIgnoreCase("error") )
            {
                map.put(p[0],map.get(p[0]+1));
            }


            if(map.get(p[0])!=null && map.get(p[0])>=3){
                replacedCount =replacedCount+1;
            }

        }
        System.out.println(map);
        return replacedCount;

    }

}

