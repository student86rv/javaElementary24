package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<User> list = new ArrayList<>();

        list.add(new User(1, "Alex"));
        list.add(new User(2, "Oleg"));
        list.add(new User(1, "Andrey"));
        list.add(new User(3, "Vlad"));
        list.add(new User(2, "Maria"));

        System.out.println(list);

        Set<User> set = new HashSet<>(list);

        list = new ArrayList<>(set);

        System.out.println(list);
    }
}
