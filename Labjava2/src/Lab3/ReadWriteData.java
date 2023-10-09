package Lab3;

import java.io.*;


public class ReadWriteData {
    public void readData(){
        try {
            File f = new File("text.txt");
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            while ((i = bis.read())!= -1){
                System.out.println((char) i);

            }
            System.out.println("");
            fis.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void writeData(String str){
        //chuyển chuỗi thành byte
        byte[]b = str.getBytes();
        try {
            FileOutputStream fos = new FileOutputStream("text.txt");
            fos.write(b);
            fos.flush();
            fos.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ReadWriteData d = new ReadWriteData();
        d.readData();
        d.writeData("hom nay hoc java.io");
    }

}
