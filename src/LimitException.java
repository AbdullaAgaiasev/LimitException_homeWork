public class LimitException extends Throwable{

    private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }
    public LimitException(String message) {
        super(message);
    }


    public double getRemainingAmount() {
        return remainingAmount;
    }

}
