import java.io.IOException;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

public class HPIDependencyList {
     public static void main(String[] args) throws IOException {
         for (String arg : args) {
             parseManifestForDependencies(arg);
         }
     }

     private static void parseManifestForDependencies(String arg) throws IOException {
         String o = new
JarFile(arg).getManifest().getMainAttributes().getValue("Plugin-Dependencies");
         if (o != null) {
             System.out.println(o);
         }
     }
}
