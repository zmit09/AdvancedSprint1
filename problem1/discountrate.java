public class DiscountRate {
    private static double serviceDiscountPremium = 0.20;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.10;
    private static double productDiscount = 0.10;

    public static double getServiceDiscountRate(String memberType) {
        switch (memberType.toLowerCase()) {
            case "premium":
                return serviceDiscountPremium;
            case "gold":
                return serviceDiscountGold;
            case "silver":
                return serviceDiscountSilver;
            default:
                return 0.0;
        }
    }

    public static double getProductDiscountRate() {
        return productDiscount;
    }
}
