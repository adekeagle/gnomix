import text.TextMainView;

import java.io.IOException;

public class gnomixApp {
    public static void main(String[] args) throws IOException {
        System.out.println("System do zarządzania zbiorami bibliotecznymi");
        TextMainView textMainView = new TextMainView();
        textMainView.init();
    }
}
