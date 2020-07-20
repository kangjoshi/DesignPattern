package adapter;

public class PrintBanner implements Print {

    private Banner banner;

    public PrintBanner(String title) {
        this.banner = new Banner(title);
    }

    @Override
    public void printWeak() {
        banner.showWithBrackets();
    }

    @Override
    public void printStrong() {
        banner.showWithAsters();
    }
}

