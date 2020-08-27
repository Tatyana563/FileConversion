import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ReadAndWriteImage
{
    public static void main(String[] args)
    {
        File file = new File("/home/tatyana/Downloads/index.jpeg");

        BufferedImage image = null;

        try
        {
            image = ImageIO.read(file);

            ImageIO.write(image, "png", new File("/home/tatyana/Downloads/index2.png"));

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("done");
    }
}