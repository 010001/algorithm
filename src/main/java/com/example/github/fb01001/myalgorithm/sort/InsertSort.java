package com.example.github.fb01001.myalgorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* 插入排序
* */
public class InsertSort {
    public static void main(String[] args) {
        int[] list = new int[10];
        list[0] = 1;
        list[1] = 3;
        list[2] = 4;
        list[3] = 2;
        list[4] = 1;
        list[5] = 6;
        list[6] = 8;
        list[7] = 2;
        list[8] = 3;
        list[9] = 5;
        int[] result = new InsertSort().sort(list);

        for (int a = 0 ; a < result.length ; a++){
            System.out.println(result[a]);
        }

    }

    public int[] sort(int[] list){
        int[] result = Arrays.copyOf(list,list.length);
        for(int i = 0; i < list.length ; i++){
            if(i == 0){
                result[i] = list[i];
                continue;
            }
            boolean falg = false;
            for(int j = 0; j < i; j++) {
                if (result[i-1] < list[i]){
                    result[i] = list[i];
                } else {
                    if(result[j] >= list[i]){
                        for(int k = i ; k >= j+1; k--){
                            result[k] = result[k-1];
                        }
                        result[j] = list[i];
                        break;
                    }
                }
            }
        }

        return result;
    }
}
