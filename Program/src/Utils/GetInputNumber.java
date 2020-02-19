package Utils;

import java.io.IOException;

public class GetInputNumber extends GetInputString {
    public static int getInt() throws IOException {
        String input = getString();
        return Integer.parseInt(input);
    }
}
