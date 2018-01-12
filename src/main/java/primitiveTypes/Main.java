package primitiveTypes;

import java.io.*;

/**
 * Created by Vladimir Glinskikh on 26.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        streamsOfBytes();
        convert(System.in, System.out);
    }

    private static void streamsOfBytes() throws IOException {
        byte[] bytes = new byte[]{65, 13, 10, 10, 13};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(10);

        convert(new ByteArrayInputStream(bytes), byteArrayOutputStream);
        byte[] bytes1 = byteArrayOutputStream.toByteArray();
        for (int i : bytes1) {
            System.out.println(i);
        }
    }

    private static void convert(InputStream inputStream, OutputStream outputStream) throws IOException {
        int buferOne = inputStream.read();
        int buferTwo;

        while (buferOne != -1) {
            buferTwo = inputStream.read();
            if (!(buferTwo == 10 && buferOne == 13)) {
                outputStream.write(buferOne);
            }
            buferOne = buferTwo;
        }
        outputStream.flush();
    }
}
