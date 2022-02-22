package by.it.katsal.jd_01_12;

import java.util.*;

public class TaskA2 {
    public static void main(String[] args) {
        Integer[] left = {1,2,3,4,5,5,6,6,7,8};
        List<Integer> listLeft = Arrays.asList(left);
        List<Integer> listRight = Arrays.asList(4,4,5,5,8,9,7);
        Set <Integer> leftSet = new HashSet<>(listLeft);
        Set <Integer> rightSet = new TreeSet<>(listRight ) ;
        System.out.printf("Left set=%s%n", leftSet );
        System.out.printf("Right set=%s%n", rightSet );

        Set <Integer> union = getUnion(leftSet,rightSet );
        System.out.printf("union set=%s%n", union  );
        System.out.printf("Left set=%s%n", leftSet );
        System.out.printf("Right set=%s%n", rightSet );


        Set <Integer> cross = getCrossUnion(leftSet,rightSet );
        System.out.printf("cross set=%s%n", cross );
        System.out.printf("Left set=%s%n", leftSet );
        System.out.printf("Right set=%s%n", rightSet );
    }

    private static Set<Integer> getUnion(Set<Integer> leftSet, Set<Integer> rightSet) {
        HashSet<Integer> result = new HashSet<>(leftSet);
        leftSet.addAll(rightSet ) ;
        return result  ;
    }

    private static Set<Integer> getCrossUnion(Set<Integer> leftSet, Set<Integer> rightSet) {

        HashSet<Integer> result = new HashSet<>(leftSet);
        leftSet.retainAll(rightSet ) ;
        return result  ;
    }
}
