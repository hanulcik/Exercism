public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return (daysSkipped >= 5) ? 0.85 : 1;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return (productsSold > 20) ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        return (productsSold * multiplierPerProductsSold(productsSold));
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = ((multiplierPerDaysSkipped(daysSkipped) * 1000) + bonusForProductSold(productsSold));
        if (salary > 2000) salary = 2000;
        return salary;
    }
}
