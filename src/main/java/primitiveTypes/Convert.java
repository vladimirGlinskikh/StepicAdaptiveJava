package primitiveTypes;

/**
 * Created by Vladimir Glinskikh on 27.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Convert {
    public static void main(String[] args) {
        String s = "Ы";
        byte [] b = s.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.print(((int)b[i] ^ -1<<8)+" ");
        }
    }
}
