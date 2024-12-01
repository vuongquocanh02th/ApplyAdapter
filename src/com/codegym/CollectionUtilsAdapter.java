package com.codegym;
import java.util.*;


public class CollectionUtilsAdapter {
    //Su dung thu vien CollectionUtils de tim max trong Set<Integer>
    public static int findMaxInSet(Set<Integer> set){
        //Chuyen doi Set thanh List
        List<Integer> list = new ArrayList<>(set);
        //Su dung thu vien CollectionUtils de tim Max trong List
        CollectionUtils collectionUtils = new CollectionUtils();
        return collectionUtils.findMax(list);

    }

}
