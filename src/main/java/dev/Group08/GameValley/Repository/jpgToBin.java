import java.io.FileInputStream;
import java.util.Base64;

public class jpgToBin {

    public static void main(String[] args)  throws Exception{
        //String temp = encodeImage("C:\\Users\\LENOVO\\Downloads\\komi.jpg");

        //byte[] data = decodeImage(temp);
    }
    public static String encodeImage(String imgPath) throws Exception{
        FileInputStream imageStream = new FileInputStream(imgPath);
        byte[] data = imageStream.readAllBytes();
        String imageString = Base64.getEncoder().encodeToString(data);

        imageStream.close();
        return imageString;
    };

    public static byte[] decodeImage(String imageString) throws Exception{
        byte[] data = Base64.getDecoder().decode(imageString);

        return data;
    }

}
