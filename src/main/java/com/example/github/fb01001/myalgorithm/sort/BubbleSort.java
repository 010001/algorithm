package com.example.github.fb01001.myalgorithm.sort;

public class BubbleSort {
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
        int[] result = new BubbleSort().sort(list);

        for (int a = 0 ; a < result.length ; a++){
            System.out.println(result[a]);
        }
    }
    public int[] sort(int[] list){
        for(int i = 0; i < list.length ; i++){
            if(i == 0){
                continue;
            }
            for(int j = i-1; j >= 0;j--){
                if(list[j] > list[i]){
                    int tmp = list[j];
                    list[j] = list[i];
                    list[i] = tmp;
                }
            }
        }
        return list;
    }
}
