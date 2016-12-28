package zipbomba;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RandomBinaryFile implements Runnable{
    
    int liczbaBajtow = 1048576;


    @Override
    public void run() {
//      new ZipBomba();//Ta linia może być niebezpieczna
        
        Random losownik = new Random();
        DataOutputStream zapis = null;
        try {
            zapis = new DataOutputStream(new FileOutputStream("smieci/data"+losownik.nextLong()));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RandomBinaryFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i = 0; i<liczbaBajtow;i++){
            try {
                zapis.writeByte(losownik.nextInt());
            } catch (IOException ex) {
                Logger.getLogger(RandomBinaryFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
