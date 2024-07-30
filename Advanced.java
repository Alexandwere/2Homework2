package homework2;

import java.math.BigDecimal;

public class Advanced {
    public static void main(String[] args) {
        double sausagePrice = 800;
        double hamPrice = 350;
        double porkNeckPrice = 500;

        int volumeSausage = 2000;
        int volumeHam = 8511;
        int volumePorkNeck = 6988;

        int costPriceSausage = 412;
        int costPriceHam = 275;
        int costPricePorkNeck = 311;

        if (volumeSausage >= 1000 && volumeSausage <2000) {
            costPriceSausage = 408;
        } else if (volumeSausage >= 2000) {
            costPriceSausage = 404;
        }

        if (volumePorkNeck >= 500) {
            costPricePorkNeck = 299;
        }

        BigDecimal income = BigDecimal.valueOf
                (volumeSausage * sausagePrice + volumeHam * hamPrice + volumePorkNeck * porkNeckPrice);
        BigDecimal expenses = BigDecimal.valueOf(volumeSausage * costPriceSausage
                + volumeHam * costPriceHam
                + volumePorkNeck * costPricePorkNeck + 1_000_000);
        BigDecimal revenue = income.subtract(expenses);
        BigDecimal tax;

        if (revenue.compareTo(BigDecimal.valueOf(1_000_000)) <= 0) {
            tax = revenue.multiply(BigDecimal.valueOf(0.08));
        } else if (revenue.compareTo(BigDecimal.valueOf(1_000_000)) == 1
                && revenue.compareTo(BigDecimal.valueOf(2_000_000)) <= 0) {
            tax = revenue.subtract(BigDecimal.valueOf(1_000_000)).multiply(BigDecimal.valueOf(0.1))
                    .add(BigDecimal.valueOf(80_000));
        } else {
            tax = revenue.subtract(BigDecimal.valueOf(2_000_000)).multiply(BigDecimal.valueOf(0.13))
                    .add(BigDecimal.valueOf(180_000));
        }
        BigDecimal profit = revenue.subtract(tax);
        System.out.println("Чистая прибыль (после налогов) составляет "+ profit + " руб.");
    }
}
