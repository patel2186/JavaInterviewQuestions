package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ComplexStreamExample {

    public void fetchHighestSalaryEmpId(){
        Map<Integer,String> firstMap=new HashMap<Integer,String>();
        firstMap.put(1,"Mahesh");
        firstMap.put(2,"Akash");
        firstMap.put(3,"Mayank");
        firstMap.put(4,"Darshan");

        Map<String,Integer> secondMap=new HashMap<String,Integer>();
        secondMap.put("Mahesh",4000);
        secondMap.put("Akash",6000);
        secondMap.put("Mayank",7000);
        secondMap.put("Darshan",1000);
        /**
         *         problem
         * using two maps and get the id of person having second highest salary
         */
        String secondHighestSalaryEmp = secondMap.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .skip(secondMap.size()-2)
                .map(s->s.getKey())
                .findFirst().orElse("");
        Integer id = firstMap.entrySet().stream().filter(s->s.getValue().equals(secondHighestSalaryEmp))
                .map(s->s.getKey()).findFirst().orElse(0);

        System.out.println(id);

    }


    public void joiningTwoArrays(){
        int[] array1 = {2,1,9,7,5};
        int[] array2 = {5,4,8,3,1,7};

        Arrays.stream(IntStream.concat(Arrays.stream(array1),Arrays.stream(array2))
                .distinct()
                .sorted()
                .toArray()).forEach(i->System.out.print(i+" "));


    }
}
