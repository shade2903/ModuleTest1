package com.company;

import javafx.print.Collation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
   static int arr[] = {100, -1, 22, -1, 99, 0, -1, -1, 73, 22};
   static int newArr[]= {100, -1, 22, -1, 99, 0, -1, -1, 73, 22};


    public static void main(String[] args) {
        int j = 0;
        ArrayList<Integer> list = new ArrayList();
        for(int i =0; i < arr.length; i++){
            if(arr[i]!=-1){
                list.add(arr[i]);
            }

        }
        Collections.sort(list);
               for(int i = 0; i<newArr.length; i++){
            if(newArr[i]!=-1){
                newArr[i]=list.get(j);
                j++;
            }
        }
        for(int x: arr){
            System.out.print(x+", ");
        }
        System.out.println();

        for(int x: newArr){
            System.out.print(x+", ");
        }

    }
}
