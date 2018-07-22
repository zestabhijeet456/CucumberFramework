package misecellneous;

import java.net.JarURLConnection;
import java.net.URL;
import java.util.jar.JarEntry;

public class Jarcreation {
  public static void main(String[] argv) throws Exception {
    URL url = new URL("jar:file:/c://my.jar!/");
    JarURLConnection conn = (JarURLConnection) url.openConnection();

    JarEntry jarEntry = conn.getJarEntry();
  }
}