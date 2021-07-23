package com.company;



import java.io.*;
import java.util.Random;

public class Task4 {
    private static int player1=0;
    private static int player2=0;
    private static String  str = "PVR";
    public static void main(String[] args) throws IOException {



        getMessage();





    }
    private static void play() throws IOException {
        FileWriter fw = new FileWriter("result.txt");
        MyPlayer myPlayer1 = new MyPlayer("1"+result(),fw);
        MyPlayer myPlayer2 = new MyPlayer("2"+result(),fw);
        myPlayer1.start();
        myPlayer2.start();

        try {
            myPlayer1.join();
            myPlayer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fw.close();

    }

    private static String  result(){
        Random r = new Random();
        int index = r.nextInt(3);
        return "" + str.charAt(index);



//        System.out.println(str.charAt(r.nextInt()));
    }
    private static void referi() throws IOException {
        FileReader fr = new FileReader("result.txt");
        char[] content = new char[4];
        fr.read(content);
        fr.close();

        if(content[1]=='P'&&content[3]=='R'){
           player1++;

        }else if(content[1]=='S'&&content[3]=='P'){
            player1++;

        }
         else if (content[1]=='R'&&content[3]=='S') {
            player1++;

        }
        else if (content[1] == content[3]){


        } else {

            player2++;

        }



    }
    public static void getMessage() throws IOException {
        while (player1!=10&&player2!=10){
            play();
            referi();
            System.out.println(player1);
            System.out.println(player2);

        }
        if(player1==10){
            System.out.println(String.format("Победил первый %d, второй проиграл %d",player1,player2));
        }
        if(player2==10){
            System.out.println(String.format("Победил второй %d, первый проиграл %d",player1,player2));
        }


    }


}
