package com.company;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num = Sc.nextInt();
//        int count = 0;
//        int space = 0;
        int chars = num;
        for(int i = 0; i<num; i++){
            for(int j = 0; j<chars; j++){
                System.out.print(" *");
            }
//            for(int k = 0; k<space; k++){
//                System.out.print(" ");
//            }
            System.out.print("\n");
            chars--;
//            space++;
        }
    }
}
