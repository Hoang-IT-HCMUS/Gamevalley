package dev.Group08.GameValley.Service;

import java.io.FileInputStream;
import java.util.Base64;

public class CodecService {

    public static String encodeImage(String imgPath) throws Exception {
        FileInputStream imageStream = new FileInputStream(imgPath);
        byte[] data = imageStream.readAllBytes();
        String imageString = Base64.getEncoder().encodeToString(data);

        imageStream.close();
        return imageString;
    };

    public static byte[] decodeImage(String imageString) throws Exception {
        return Base64.getDecoder().decode(imageString);
    }

}
