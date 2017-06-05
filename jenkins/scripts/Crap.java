import java.io.IOException;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

public class Crap {
     public static void main(String[] args) throws IOException {
         for (String arg : args) {
             doZipShit(arg);
         }
     }

     private static void doZipShit(String arg) throws IOException {
         String o = new
JarFile(arg).getManifest().getMainAttributes().getValue("Plugin-Dependencies");
         if (o != null) {
             System.out.println(o);
         }
     }
}
