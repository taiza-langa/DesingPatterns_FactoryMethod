public class App {
    public static void main(String[] args) throws Exception {
        ReportFactory pdfFactory = new PdfReportFactory();
        pdfFactory.genereteReport(); // Output: Gerando relatório em PDF

        ReportFactory exelFactory = new ExelReportFactory();
        exelFactory.genereteReport(); // Output: Gerando relatório em exel

        ReportFactory jsonFactory = new JsonReportFactory();
        jsonFactory.genereteReport(); // Output: Gerando relatório em json
    }
}
