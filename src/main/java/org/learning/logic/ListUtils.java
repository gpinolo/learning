package org.learning.logic;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ListUtils {

    private ListUtils(){
        throw new InstantiationError("Utility class cannot be instantiate");
    }

    /**
     * Check if the given integer list is in ascending order
     * @param list the input list to check
     * @return true if the given list is in ascending order, false otherwise
     */
    public static boolean isListOrdered(List<Integer> list){
        if(list==null || list.size()<=1)
            return true;
        for (int i = 0; i < (list.size() - 1); i++) {
            Integer current = list.get(i);
            Integer next = list.get(i+1);
            if(current==null || next == null){
                continue;
            }
            if (current > next){
                return false;
            }
        }
        return true;
    }

    /**
     * Check if the given integer list is in ascending order (stream implementation)
     * @param list the input list to check
     * @return true if the given list is in ascending order, false otherwise
     */
    public static boolean isListOrderedStreamVersion(List<Integer> list){
        if(list==null || list.size()<=1)
            return true;
        return IntStream.range(0, list.size()-1).allMatch(index -> list.get(index) == null || list.get(index+1)==null || list.get(index) < list.get(index +1));
    }

    public static void sortListJDKVersion(List<Integer> list){
        Collections.sort(list);
    }

}
