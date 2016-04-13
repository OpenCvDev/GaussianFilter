
package gaussianfilter;

import org.opencv.core.Core;
//import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;
public class GaussianFilter {
public static void main( String[] args )
{
try {
System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
Mat source = Highgui.imread("digital_image_processing.jpg",
Highgui.CV_LOAD_IMAGE_COLOR);
Mat destination = new Mat(source.rows(),source.cols(),source.type());
Imgproc.GaussianBlur(source, destination,new Size(45,45), 0);
Highgui.imwrite("Gaussian45.jpg", destination);
} catch (Exception e) {
System.out.println("Error: " + e.getMessage());
}
}
}