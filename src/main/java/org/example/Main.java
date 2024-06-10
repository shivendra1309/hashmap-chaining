package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMapChaining<Integer, String> hs = new HashMapChaining<>();
        hs.put(1, "Memory");
        hs.put(2, "Bias");
        hs.put(3, "Java");
        hs.put(4, "Stocks");
        hs.put(5, "Mutual Funds");
        hs.put(14, "Data");
        hs.put(23, "Thread");
        hs.put(34, "POJO");
        hs.put(45, "Support");
        hs.put(57, "Advantages");


        System.out.println(hs.get(1));

        hs.remove(1);

        System.out.println(hs.get(1));
        System.out.println(hs.get(14));
        System.out.println(hs.get(57));


    }
}