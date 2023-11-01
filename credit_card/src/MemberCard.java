public class MemberCard {
    private static final int POINTS2CASH100 = 800;
    private static final int BAHT2POINTS = 25;
    private long memberId;
    private double totalPurchaseAmount;
    private int totalPoints;
    private int usagePoints;

    public MemberCard(long memberId) {
        this.memberId = memberId;
    }

    public long getMemberId() {
        return memberId;
    }

    public double getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getUsagePoints() {
        return usagePoints;
    }
    public void addPoints(double purchaseAmount) {
        int point = (int)purchaseAmount / BAHT2POINTS;
        totalPoints +=point;
    }
    public void buy(double purchaseAmount) {
        totalPurchaseAmount += purchaseAmount;
        addPoints(purchaseAmount);
    }
    public int redeem() {
        if (totalPoints >= POINTS2CASH100) {
            usagePoints += POINTS2CASH100;
            totalPoints -= POINTS2CASH100;
            return 100;
        } else {
            return 0;
        }
    }
    public int getRemainingPoint() {
        return totalPoints;
    }
    public int getNumberOfRedeem() {
        return usagePoints / POINTS2CASH100;
    }

    @Override
    public String toString() {
        return "MemberCard{" +
                "memberId=" + memberId +
                ", totalPurchaseAmount=" + totalPurchaseAmount +
                ", totalPoints=" + totalPoints +
                ", usagePoints=" + usagePoints +
                ", numberOfRedeem=" + getNumberOfRedeem() +
                '}';
    }
}
