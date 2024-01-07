import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Base64;

public class jpgToBin {

    public static void main(String[] args)  throws Exception{
        //System.out.println(encodeImage("C:\\Users\\LENOVO\\Downloads\\komi.jpg",
        //        "C:\\Users\\LENOVO\\Downloads\\img.txt"));

        //decodeImage("C:\\Users\\LENOVO\\Downloads\\img.txt",
        //        "C:\\Users\\LENOVO\\Downloads\\img.jpg");
    }
    public static String encodeImage(String imgPath, String savePath) throws Exception{
        FileInputStream imageStream = new FileInputStream(imgPath);
        byte[] data = imageStream.readAllBytes();
        String imageString = Base64.getEncoder().encodeToString(data);

        FileWriter fileWriter = new FileWriter(savePath);

        fileWriter.write(imageString);

        fileWriter.close();
        imageStream.close();

        return imageString;
    };

    public static void decodeImage(String txtPath, String savePath) throws Exception{
        FileInputStream inputStream = new FileInputStream(txtPath);

        byte[] data = Base64.getDecoder().decode(new String(inputStream.readAllBytes()));
        FileOutputStream fileOutPutStream = new FileOutputStream(savePath);
        fileOutPutStream.write(data);
        fileOutPutStream.close();
        inputStream.close();
    }

}
