import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;
import org.imgscalr.Scalr.Method;

public class ThumbnailExample {

    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();
        File f = new File("/home/tatyana/Downloads/index.jpeg");
        BufferedImage img = ImageIO.read(f); // load image

        BufferedImage thumbImg = Scalr.resize(img, Method.QUALITY, Scalr.Mode.AUTOMATIC,
                50,
                50, Scalr.OP_ANTIALIAS);
        //convert bufferedImage to outpurstream
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ImageIO.write(thumbImg,"jpg",os);

        File f2 = new File("/home/tatyana/Downloads/index3.jpeg");

        ImageIO.write(thumbImg, "jpg", f2);

        System.out.println("time is : " +(System.currentTimeMillis()-startTime));
    }
}

