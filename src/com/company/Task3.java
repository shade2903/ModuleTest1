package com.company;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        ArrayList<Character> list = new ArrayList();
        String str = "RRRRRRRRRBBBBBBBBBBBBBBBBBBBBRRRRRRRRRRUURRRRRRRBBBBBBBBBBBRRURRRRRRRRRRRUUUUUUUUUUUUUUUUUUUUUUUUUURRRRRRRRRRLLLLLLLLLLLBBBBBBBBBBBBBBBBBBBBBLLLLLLLLLLLLLLLUUUULLLLLLUUUUUUUUUUBBBBUUUULLLLLLLLLLLLLLLLUUUUUUUUURRRRR";
        char[][] pole = new char[50][50];
        pole[1][19] = 'A';
        pole[2][49] = 'C';
        pole[9][9] = 'H';
        pole[7][39] = 'I';
        pole[0][1] = 'M';
        pole[42][16] = 'O';
        pole[13][17] = 'R';
        pole[19][19] = 'S';
        pole[30][15] = 'W';
        pole[23][26] = 'Z';


        for (char x : str.toCharArray()) {
            switch (x) {
                case 'U':
                    j--;

                    break;
                case 'B':
                    j++;

                    break;
                case 'R':
                    i++;

                    break;
                case 'L':
                    i--;

                    break;

            }
            if (pole[j][i] != 0) {
                if (list.contains(pole[j][i])) {
                    System.out.println(pole[j][i]);
                }
                list.add(pole[j][i]);


            }
        }

    }
}


