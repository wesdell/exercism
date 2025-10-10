public class SalaryCalculator {

    public static int MIN_BONUS = 10;
    public static int MAX_BONUS = 13;
    public static double FINE = 0.15;
    public static double SALARY_MULTIPLIER = 1.0;
    public static double BASE_SALARY = 1000.00;
    public static double MAX_SALARY = 2000.00;
    
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? SALARY_MULTIPLIER : SALARY_MULTIPLIER - FINE;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold < 20 ? MIN_BONUS : MAX_BONUS;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = BASE_SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return salary < MAX_SALARY ? salary : MAX_SALARY;
    }
    
}
