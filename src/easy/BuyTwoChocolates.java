package easy;

import java.util.Arrays;

public class BuyTwoChocolates {
    // possible solution
    /*
    sort the array and get the min two prices
    if the amount is more than the money return money
    */
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int leftOver = money - (prices[0] + prices[1]);
        if(leftOver < 0){
            return money;
        } return leftOver;
    }
}
