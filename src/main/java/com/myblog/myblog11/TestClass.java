package com.myblog.myblog11;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static org.hibernate.internal.util.collections.ArrayHelper.forEach;

public class TestClass {

    public static void main(String[] args) {

        //predicate function interface
        //even number check
//        Predicate<Integer> val= x->x%2==0;
//        boolean result = val.test(10);
//        System.out.println(result);


        //check name is same or not

//        Predicate<String> val= str->str.equals("yogesh");
//        boolean result = val.test("prathwin");
//        System.out.println(result);

        //even numbers

//        List<Integer> number = Arrays.asList(10, 15, 22, 34, 55, 68);
//        List<Integer> evennumbers = number.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(evennumbers);


        //odd numbers

//        List<Integer> number = Arrays.asList(10, 15, 25, 32, 33, 23, 44);
//        List<Integer> oddnum = number.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
//        System.out.println(oddnum);


        //give me the name letter start with letter m

//        List<String> name = Arrays.asList("mike", "yogesh", "kavya", "madin", "melbin", "manasvi");
//        List<String> names = name.stream().filter(x -> x.startsWith("m")).collect(Collectors.toList());
//        System.out.println(names);


        //how many times mike as occured given coolection

//        List<String> name = Arrays.asList("mike", "manavi", "melbin", "mike");
//        List<String> names = name.stream().filter(x -> x.equals("mike")).collect(Collectors.toList());
//        System.out.println(names);


        //how many letter ends with n

//        List<String> name = Arrays.asList("mike", "manavi", "melbin", "mike","nadin");
//        List<String> names = name.stream().filter(x -> x.endsWith("n")).collect(Collectors.toList());
//        System.out.println(names);


        //function functional interface

        //count the letter
//        Function<String,Integer> result=str->str.length();
//        Integer val = result.apply("mike");
//        System.out.println(val);

        // add numbers to 30

//        Function<Integer,Integer> result=i->i+10;
//        Integer val = result.apply(30);
//        System.out.println(val);


        //given number add 10 to every number

//        List<Integer> num = Arrays.asList(10, 20, 30, 40);
//        List<Integer> newNumber = num.stream().map(i -> i + 10).collect(Collectors.toList());
//        System.out.println(newNumber);

        //convert the name into upper case

//        List<String> name = Arrays.asList("yogesh","love","kavya");
//        List<String> names = name.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(names);

//        //convert the name into lowercase


//        List<String> name = Arrays.asList("YOGESH","LOVE","KAVYA");
//        List<String> names = name.stream().map(i -> i.toLowerCase()).collect(Collectors.toList());
//        System.out.println(names);

        //how to sort the data in strings
//
//        List<String> name = Arrays.asList("mike", "yogesh", "charvi", "prathwin", "manasvi", "kavya");
//        List<String> names = name.stream().sorted().collect(Collectors.toList());
//        System.out.println(names);

        // how to sort the numbers

//        List<Integer> num = Arrays.asList(10, 3, 7, 23, 123, 534, 4444, 2, 34, 555);
//        List<Integer> sortNum = num.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortNum);


        //find the duplicate value

//        List<Integer> num = Arrays.asList(10, 10, 4, 4, 5, 5, 6, 7, 6, 7, 8, 3, 4);
//        List<Integer> newNum = num.stream().distinct().collect(Collectors.toList());
//        System.out.println(newNum);


        //consumer functional interface

//        Consumer<Integer> result= num-> System.out.println(num);
//        result.accept(100);


        //foreach comes for consumer functional interface

//        List<String> names = Arrays.asList("mike", "adam", "stalin");
//        Consumer<String> val =name-> System.out.println(name);
//        names.forEach(val);


        //supplier functional interface

//        Supplier<Integer> x=()->new Random().nextInt(500);
//        Integer y = x.get();
//        System.out.println(y);


      //find give me objects in which the employee age>18
//
//        List<Employee> employees = Arrays.asList(new Employee("mike", 15, "bangalore"),
//                new Employee("adam", 20, "chennai"),
//                new Employee("yogesh", 33, "bnglore"));
//
//        List<Employee> emps = employees.stream().filter(emp -> emp.getAge() > 18).collect(Collectors.toList());
//
//        for (Employee e:emps){
//            System.out.println(e.getName());
//            System.out.println(e.getCity());
//            System.out.println(e.getAge());
//        }

//
//        List<String> name = Arrays.asList("adam", "aswin", "arun", "man", "yoge", "kj");
//        List<String> names = name.stream().filter(n -> n.startsWith("a")).collect(Collectors.toList());
//        System.out.println(names);

//        List<Integer> num = Arrays.asList(2, 4, 3, 5, 6, 8, 7);
//        List<Integer> squrenum = num.stream().filter(n -> n % 2 == 0).map(n1 -> n1 * n1).collect(Collectors.toList());
//        System.out.println(squrenum);


//        List<Employee> employee = Arrays.asList(new Employee("mike", 18, "bangalore"),
//                new Employee("yogesh", 23, "bangalore"),
//                new Employee("charu", 15, "mumbai"),
//                new Employee("prth", 33, "mydore"));
//        Map<String, List<Employee>> citys = employee.stream().collect(Collectors.groupingBy(e -> e.getCity()));
//        System.out.println(citys);


        List<Employee> emp = Arrays.asList(new Employee("mike", 18, "bangalore"),
                new Employee("yogesh", 23, "bangalore"),
                new Employee("charu", 15, "mumbai"),
                new Employee("prth", 15, "mydore"));

        Map<Integer, List<Employee>> collect = emp.stream().collect(Collectors.groupingBy(e -> e.getAge()));
        System.out.println(collect);
    }
}
