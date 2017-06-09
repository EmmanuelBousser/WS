package org.helloworldmvc.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DAOHelloWorld {

    private static String FileName = "helloworld.txt";
    private static DAOHelloWorld instance = null;
    private String helloWorldMessage = "";

    private DAOHelloWorld(){
        readFile();

    }

    public static DAOHelloWorld getInstance() {
        if (instance == null)
            instance = new DAOHelloWorld();
        return instance;
    }

    public static void setInstance(DAOHelloWorld instance) {
        DAOHelloWorld.instance = instance;
    }

    public String getHelloWorldMessage() {
        return helloWorldMessage;
    }

    public void setHelloWorldMessage(String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }
    private void readFile(){
          FileInputStream File = null;
          int n = 0;

            try{
                File = new FileInputStream(new File(FileName));

                byte[] lecture = new byte[1];



                while ((n = File.read(lecture))>=0){
                    for(byte bit:lecture)
//                        System.out.print((char)bit);

                        helloWorldMessage+=(char)bit ; 


                }

                lecture = new byte[1];

            }catch (FileNotFoundException e){
                e.printStackTrace();

            }catch (IOException e){
                e.printStackTrace();

            }finally{
                try{
                    if (File!=null){
                        File.close();
                    }
                } catch(IOException e){
                    e.printStackTrace();
                }
            }

        }
}
