package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInputString {
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
