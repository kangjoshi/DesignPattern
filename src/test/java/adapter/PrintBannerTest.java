package adapter;

import org.junit.Test;

public class PrintBannerTest{

    @Test
    public void printTest() {
        Print print = new PrintBanner("Good Life");

        print.printStrong();
        print.printWeak();
    }


}