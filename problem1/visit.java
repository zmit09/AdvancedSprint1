public class Visit {
    private Customer customer;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, double serviceExpense, double productExpense) {
        this.customer = customer;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public double getTotalExpense() {
        double serviceDiscount = DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = DiscountRate.getProductDiscountRate();
        double totalServiceExpense = serviceExpense - (serviceExpense * serviceDiscount);
        double totalProductExpense = productExpense - (productExpense * productDiscount);
        return totalServiceExpense + totalProductExpense;
    }
}
