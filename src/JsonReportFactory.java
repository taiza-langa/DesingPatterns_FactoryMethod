public class JsonReportFactory extends ReportFactory{

    @Override
    public Report creatReport() {
        return new JsonReport();
    }
}
