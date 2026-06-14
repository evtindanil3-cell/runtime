package taskDis.newTasks.FourTask.twoTask;

public class Main {
    static void main(String[] args) {
        TaxService taxService = new TaxService();

        Bill[] payments = new Bill[] {
                new Bill(1000.0, new IncomeTaxType(), taxService),
                new Bill(10000.0, new VATaxType(), taxService),
                new Bill(50000.0, new ProgressiveTaxType(), taxService),
                new Bill(200000.0, new ProgressiveTaxType(), taxService)
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
