package app;

public class CalcCostDelivery extends CalcCostBase {
    // Вартість доставки
    private final static double deliveryPrice = 7; // add initialization

    // Розрахунок вартості товару,
    // з урахуванням вартості доставки
    @Override
    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice()  // correct a typo
                + deliveryPrice;
    }
}
