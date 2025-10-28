package com.coursedesign.demo.a28objectsortcomparator;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("zhangsan", 19),
                new Person("lisi", 18),
                new Person("wangwu", 21)
        );

        persons.sort( (o1,o2) -> Integer.compare(o1.getAge(), o2.getAge() ));

        System.out.println( persons);
    }
}
