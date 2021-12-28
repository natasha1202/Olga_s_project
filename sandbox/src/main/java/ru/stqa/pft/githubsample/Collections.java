package ru.stqa.pft.githubsample;

import java.util.Arrays;
import java.util.List;


public class Collections {
    public static void main(String[] args) {
        String[] langs = {"Java", "C#", "Python", "PHP"};

        List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");


        for (String l : languages) {
            System.out.println("Я хочу выучить " + l);
        }
    }
}
