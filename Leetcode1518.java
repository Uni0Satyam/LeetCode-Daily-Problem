public class Leetcode1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int maxFilledBottle = numBottles;
        int emptyBottle = numBottles;
        while (emptyBottle >= numExchange) {
            int newBottles = emptyBottle / numExchange;
            maxFilledBottle += newBottles;
            emptyBottle = emptyBottle % numExchange + newBottles;
        }
        return maxFilledBottle;
    }
}
