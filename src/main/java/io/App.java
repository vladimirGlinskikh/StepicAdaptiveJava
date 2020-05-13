package io;

import java.io.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws IOException {
        OutputStream dst = new ByteArrayOutputStream();
        dst = new LogOS("After", dst);
        dst = new BufferedOutputStream(dst, 2);
        dst = new LogOS("Before", dst);

        dst.write(1);
        dst.write(2);
        dst.write(3);
        dst.write(4);
        dst.write(5);
        dst.flush();
        dst.close();
    }
}

class LogOS extends OutputStream {
    private final String name;
    private final OutputStream impl;

    LogOS(String name, OutputStream impl) {
        this.name = name;
        this.impl = impl;
    }

    @Override
    public void write(int b) throws IOException {
        System.out.println(name + ":write(" + b + ")");
        impl.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        System.out.println(name + ":write(" + Arrays.toString(b) + ")");
        impl.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        System.out.println(name + ":write(" + Arrays.toString(b) + ", " + off + ", " + len + ")");
        impl.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        System.out.println(name + "flush");
        impl.flush();
    }

    @Override
    public void close() throws IOException {
        System.out.println(name + "close");
        impl.close();
    }
}
