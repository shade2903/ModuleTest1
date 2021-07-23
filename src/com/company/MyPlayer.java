package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MyPlayer extends Thread {



        public MyPlayer(String name, FileWriter fw){

        super(()->{

            synchronized (fw) {
                try {


                    fw.append(""+name);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        },name);

    }



}
