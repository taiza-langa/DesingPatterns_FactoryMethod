public class ExelReportFactory extends ReportFactory{

    @Override
    public Report creatReport() {
        return new ExelReport();
    }
}
