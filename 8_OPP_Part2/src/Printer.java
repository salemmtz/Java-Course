public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if (tonerLevel > 100) {
            this.tonerLevel = 100;
        } else if (tonerLevel < 0) {
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int addToner(int tonerAmount) {
        int tempAmount = tonerAmount + this.tonerLevel;
        if (tempAmount > 100 || tonerAmount < 0) return -1;

        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = duplex ? (pages/2) + pages%2  : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }
}
