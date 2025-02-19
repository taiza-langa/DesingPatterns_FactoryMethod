# APP FACTORY METHOD

Este projeto implementa o padrão **Factory Method** para a geração de relatórios em diferentes formatos: **Excel, JSON e PDF**. 

## 📌 Tecnologias
- **Java**
- **Padrão Factory Method**

## 📁 Estrutura do Projeto
- `Report.java` → Interface base para os relatórios.
- `ExcelReport.java`, `JsonReport.java`, `PdfReport.java` → Implementações específicas de relatórios.
- `ReportFactory.java` → Interface para as fábricas de relatórios.
- `ExcelReportFactory.java`, `JsonReportFactory.java`, `PdfReportFactory.java` → Fábricas concretas para criar os relatórios correspondentes.
- `App.java` → Classe principal para testar a criação dos relatórios.
