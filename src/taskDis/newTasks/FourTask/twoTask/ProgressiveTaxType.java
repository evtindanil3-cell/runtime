package taskDis.newTasks.FourTask.twoTask;

class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        if (amount <= 100_000.0) {
            return amount * 0.10;
        } else {
            return amount * 0.15;
        }
    }
}
