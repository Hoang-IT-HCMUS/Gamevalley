import java.io.FileInputStream;
import java.util.Base64;

public class jpgToBin {

    public static void main(String[] args)  throws Exception{
        //System.out.println(encodeImage("C:\\Users\\LENOVO\\Downloads\\komi.jpg"));

        //byte[] data = decodeImage("C:\\Users\\LENOVO\\Downloads\\img.txt");
    }
    public static String encodeImage(String imgPath) throws Exception{
        FileInputStream imageStream = new FileInputStream(imgPath);
        byte[] data = imageStream.readAllBytes();
        String imageString = Base64.getEncoder().encodeToString(data);

        imageStream.close();
        return imageString;
    };

    public static byte[] decodeImage(String txtPath) throws Exception{
        FileInputStream inputStream = new FileInputStream(txtPath);

        byte[] data = Base64.getDecoder().decode(new String(inputStream.readAllBytes()));
        inputStream.close();
        return data;
    }

}
