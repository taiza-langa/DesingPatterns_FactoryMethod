public class PdfReportFactory extends ReportFactory{

    @Override
    public Report creatReport() {
        return new PdfReport();
    }
}
