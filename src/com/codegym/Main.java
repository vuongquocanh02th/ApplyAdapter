package com.codegym;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Tạo một Set<Integer>
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(5);
        numberSet.add(30);

        // Sử dụng CollectionUtilsAdapter để tìm giá trị lớn nhất trong Set
        int maxNumber = CollectionUtilsAdapter.findMaxInSet(numberSet);

        // In kết quả
        System.out.println("The largest number in the set is: " + maxNumber);
    }
}
