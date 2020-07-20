package adapter;

public class Banner {
    private String title;
    private StringBuilder sb;

    public Banner(String title) {
        this.title = title;
        this.sb = new StringBuilder();
    }

    private void clear() {
        sb.delete(0, sb.length());
    }

    public void showWithBrackets() {
        sb.append("(").append(title).append(")");
        System.out.println(sb.toString());
        clear();
    }

    public void showWithAsters() {
        sb.append("*").append(title).append("*");
        System.out.println(sb.toString());
        clear();
    }
}
