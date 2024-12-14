package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStreamExamples {

    public void extractUniqueEvenNumber(List<Integer> nums){
        System.out.println("output of extractUniqueEvenNumber:" +nums.stream().distinct().filter(n->n%2==0).collect(Collectors.toList()));
    }
    public void sortList(List<Integer> nums){
        System.out.println("output of sortList:"+nums.stream().sorted().collect(Collectors.toCollection(ArrayList::new)));
    }
    public void calculateAverageOfList(List nums){
        System.out.println("output of calculateAverageOfList:"+nums.stream().collect(Collectors.averagingDouble(num->Double.parseDouble(""+num))));
    }
    public void sumEven(List<Integer> nums){
        System.out.println("output of sumEven ex1:"
                +nums.stream().filter(x->x%2==0).collect(Collectors.summingInt(num->num)));
        System.out.println("output of sumEven ex2:"
                +nums.stream().filter(x->x%2==0).reduce(0,(a,b)->a+b));
    }

    public void findMaximum(List<Integer> nums){
        System.out.println("output of findMaximum ex1:"
        +nums.stream().mapToInt(Integer::intValue).max());
        System.out.println("output of findMaximum ex2:"
                +nums.stream().reduce(Integer.MIN_VALUE,Integer::max));
    }

    public void findSecondHigest(List<Integer> nums){
        System.out.println("output of findSecondHigest ex1:"
                +nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());

    }
}
