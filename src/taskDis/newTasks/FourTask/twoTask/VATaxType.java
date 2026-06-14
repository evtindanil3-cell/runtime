package taskDis.newTasks.FourTask.twoTask;

class VATaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        return amount * 0.18;
    }
}