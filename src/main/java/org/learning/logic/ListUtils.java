package org.learning.logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListUtils {

    private ListUtils(){
        throw new InstantiationError("Utility class cannot be instantiate");
    }

    /**
     * Check if the given integer list is in ascending order
     * @param list the input list to check
     * @return true if the given list is in ascending order, false otherwise
     */
    public static boolean isListAscendingOrder(List<Integer> list){
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
    public static boolean isListAscendingOrderStreamVersion(List<Integer> list){
        if(list==null || list.size()<=1)
            return true;
        return IntStream.range(0, list.size()-1).allMatch(index -> list.get(index) == null || list.get(index+1)==null || list.get(index) < list.get(index +1));
    }

    /**
     * Check if the given integer list is in ascending order (another stream implementation
     * @param list the input list to check
     * @return true if the given list is in ascending or descending order, false otherwise
     */
    public static boolean isListOrderedStreamVersion(List<Integer> list){
        if(list==null) {
            return true;
        }
        List<Integer> notNullElementStream = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
        Supplier<Stream<Integer>> stream = () -> list.stream().filter(Objects::nonNull);
        if(Objects.equals(stream.get().sorted().collect(Collectors.toList()), notNullElementStream))
            return true;
        else return Objects.equals(stream.get().sorted(Comparator.reverseOrder()).collect(Collectors.toList()), notNullElementStream);
    }

    public static void sortListJDKVersion(List<Integer> list){
        Collections.sort(list);
    }

}
