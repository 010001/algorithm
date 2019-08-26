package com.example.github.fb01001.myalgorithm.sort;

import java.util.Arrays;
import java.util.Collections;

/**
 * 分治法排序
 */
public class DivideAndConquerSort {
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
        int[] result = new DivideAndConquerSort().splitSort(list);

        for (int a = 0 ; a < result.length ; a++){
            System.out.println(result[a]);
        }
    }

    public int[] splitSort(int[] list){
        int[] resultList = null;
        int left = 0;
        int mid = 0;
        int right = 0;
        if(list.length == 2){
            if(list[0] > list[1]){
                resultList = new int[]{list[1],list[0]};
            } else {
                resultList = new int[]{list[0],list[1]};
            }
        } else if(list.length <= 1){
            resultList = list;
        } else {
            left = 1;
            right = list.length;
            mid = (left + right + 1) / 2 ;
            int[] leftList = new int[mid];
            int[] rightList = new int[list.length- mid];
            for(int i = 0 ; i < list.length;i++){
                if(i <= mid-1){
                    leftList[i] = list[i];
                } else {
                    rightList[i-mid] = list[i];
                }
            }
            // 分解
            int[] tmp01 = splitSort(leftList);
            int[] tmp02 = splitSort(rightList);
            // 合并
            if(null == tmp01){
                resultList = tmp02;
            } else if(null == tmp02){
                resultList = tmp01;
            } else {
                int[] connectList = new int[tmp01.length + tmp02.length];
                int a = 0;
                int b = 0;
                for(int k = 0; k < connectList.length;k++){
                    if(a < tmp01.length && b < tmp02.length ){
                        if(tmp01[a] <= tmp02[b]){
                            connectList[k] = tmp01[a];
                            a++;
                        } else {
                            connectList[k] = tmp02[b];
                            b++;
                        }
                    } else {
                        if(a == tmp01.length){
                            connectList[k] = tmp02[b];
                            b++;
                        } else {
                            connectList[k] = tmp01[a];
                            a++;
                        }
                    }
                }
                resultList = connectList;
            }
        }
        return resultList;
    }
}
