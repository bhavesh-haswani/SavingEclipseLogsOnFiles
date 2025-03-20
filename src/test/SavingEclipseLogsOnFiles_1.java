package test;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class SavingEclipseLogsOnFiles_1 {

	public static void main(String[] args) {
		
        try {
            PrintStream out = new PrintStream(new FileOutputStream("C:\\Bhavesh\\Workspace\\SaveEclipseLogsOnFiles\\logs\\output.txt"));
            System.setOut(out);
            System.setErr(out);
        } catch (Exception e) {
            e.printStackTrace();
        }

	    System.out.println("This will be written to the file. ");
		
	}

}
