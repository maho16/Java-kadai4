package org.example;



import java.util.List;


public class Main {

    public static void main(String[] args) {

        //リスト作る
        List<String> colors = List.of("black","gray","green","blue","white");

        //eを含む
        colors.stream().filter(color -> color.contains("e")).forEach(System.out::println);

        //５文字の
        colors.stream().filter(color -> color.length() == 5).forEach(System.out::println);

        //並び替える
        colors.stream().sorted().forEach(System.out::println);

        //大文字に変換
        colors.stream().map(String::toUpperCase).forEach(System.out::println);



        //int型
        List<Integer> numbers = List.of(1, 6, 3, 5, 8, 4 , 2, 7);

        //並び替え
        numbers.stream().sorted().forEach(System.out::println);

        //偶数のみ
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);

    }


}