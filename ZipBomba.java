package zipbomba;



public class ZipBomba {
    
    private static final int watki = 10;

    
    public static void main(String[] args){
        new ZipBomba();
    }

    public ZipBomba(){
        Thread[] watek = new Thread[watki];

        
        for(int j = 0; j<watki; j++){
           watek[j] = new Thread(new RandomBinaryFile());
        }
        
        for(int i = 0; i<watki; i++){
           watek[i].start();
        }
   
    }
    
}
