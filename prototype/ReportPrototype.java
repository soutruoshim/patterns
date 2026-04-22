package patterns.prototype;

public class ReportPrototype implements IPrototype {
    private String reportName;
    private int pages;
    private String author;

    public ReportPrototype(String reportName, int pages, String author) {
        this.reportName = reportName;
        this.pages = pages;
        this.author = author;
    }

    public ReportPrototype(ReportPrototype other) {
        this.reportName = other.reportName;
        this.pages = other.pages;
        this.author = other.author;
    }

    @Override
    public IPrototype Clone() {
        return new ReportPrototype(this);
    }

    @Override
    public String toString() {
        return "ReportPrototype{reportName='" + reportName + "', pages=" + pages + ", author='" + author + "'}";
    }
}

