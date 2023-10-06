package Com.utils;

import java.util.*;
public class RemovingOddElements {
    public static void removeOddElementfromArray(List<Integer>arr){

        Iterator<Integer> itr= arr.iterator();
        while(itr.hasNext())
        {
            int j = itr.next();
            if(j%2!=0)
            {
                itr.remove();

            }
        }

        System.out.println(arr);

    }


}
