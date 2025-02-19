public abstract class ReportFactory {
    public abstract Report creatReport();

    public void genereteReport() {
        Report report = creatReport();
        report.generate();
    }
}
