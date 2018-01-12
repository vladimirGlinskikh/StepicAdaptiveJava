package primitiveTypes;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by Vladimir Glinskikh on 27.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class MainOne {

    public static void main(String[] args) throws IOException {
        System.out.println("5.3 Потоки символов – Шаг 12");
        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        String str = readAsString(inputStream, Charset.forName("ASCII"));
        System.out.println(str);

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        String s;
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter stringWriter = new StringWriter();
        int x;
        while ((x = reader.read()) != -1) {
            stringWriter.write(x);
        }
        s = stringWriter.toString();
        return s;
    }
}
