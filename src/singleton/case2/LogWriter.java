package singleton.case2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class LogWriter {
    private static LogWriter singleton = new LogWriter();
    private static BufferedWriter bw;

    public LogWriter() {
        try {
            bw = new BufferedWriter(new FileWriter("log.txt"));
        } catch (Exception e) {

        }
    }

    public static LogWriter getInstance() {
        return singleton;
    }

    public synchronized void log(String str) {
        try {
            bw.write(str + "\n");
 gi           bw.flush();
        } catch(Exception e) {

        }
    }

    @Override
    protected void finalize() {
        try {
            super.finalize();
            bw.close();
        } catch (Throwable ex) {

        }
    }

    public final class Cleaner {

    }


}
