package org.example;


import org.example.streamOnObjects.EmployeeUtility;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FunctionalExample functionalExample = new FunctionalExample();
        functionalExample.writeFunctionalExample();

        List<Integer> list1 = Arrays.asList(4,25,7,95,3,2,7,1,43,7,8,8,1,4,92,0);
        SimpleStreamExamples simpleStreamExamples = new SimpleStreamExamples();
        simpleStreamExamples.extractUniqueEvenNumber(list1);
        simpleStreamExamples.sortList(list1);
        simpleStreamExamples.calculateAverageOfList(list1);
        simpleStreamExamples.sumEven(list1);
        simpleStreamExamples.findMaximum(list1);
        simpleStreamExamples.findSecondHigest(list1);
        simpleStreamExamples.charCount();

        //complex stream example
        ComplexStreamExample complexStreamExample = new ComplexStreamExample();
        complexStreamExample.fetchHighestSalaryEmpId();

        complexStreamExample.joiningTwoArrays();

        //stream operations on object
        EmployeeUtility employeeUtility = new EmployeeUtility();
        employeeUtility.getCityEmployeeCount();
        employeeUtility.sortedEmployees();

    }


}