import java.io.*;
import java.util.Scanner;

public class TestScannerDelete {
    private static File file;

    public static void main(String[] args) throws IOException {
        String currentPath = new File(".").getCanonicalPath();
        file = new File(currentPath + "\\tempAdd.txt");
        removeFirstLine(String.valueOf(file));

    }
    public static void removeFirstLine(String fileName) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
        //Initial write position
        long writePosition = raf.getFilePointer();
        raf.readLine();
        // Shift the next lines upwards.
        long readPosition = raf.getFilePointer();

        byte[] buff = new byte[1024];
        int n;
        while (-1 != (n = raf.read(buff))) {
            raf.seek(writePosition);
            raf.write(buff, 0, n);
            readPosition += n;
            writePosition += n;
            raf.seek(readPosition);
        }
        raf.setLength(writePosition);
        raf.close();
    }
}
