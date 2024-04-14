package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> resList = new ArrayList<>();
        Queue<Integer> que = new PriorityQueue<>();
        for(int i = 1; i < 10; i++){
            que.add(i);
        }

        while(!que.isEmpty()){
            int head = que.remove();
            if(head > high){
                continue;
            }
            if(head >= low && head <= high){
                resList.add(head);
            }

            int ones = head % 10;
            if(ones < 9){ // we will add +1 to ones, so if ones is 9, it will be 10 and 10 is not a digit
                que.add(head * 10 + ones + 1);
            }
        }
        return resList;

    }

}
