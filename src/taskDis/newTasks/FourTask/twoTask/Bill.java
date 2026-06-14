package taskDis.newTasks.FourTask.twoTask;

class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {

        double taxAmount = taxType.calculateTaxFor(this.amount);
        taxService.payOut(taxAmount);
    }
}
