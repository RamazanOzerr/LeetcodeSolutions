package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetRandomO1 {
    private HashSet<Integer> set;
    private List<Integer> list;
    private Random random;

    public InsertDeleteGetRandomO1() {
        set = new HashSet<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(set.contains(val)) return false;
        set.add(val);
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!set.contains(val)) return false;
        set.remove(val);
        list.remove((Integer) val);
        return true;
    }

    public int getRandom() {
        int randomNumber = random.nextInt(getSize());
        return list.get(randomNumber);
    }

    private int getSize(){
        return set.size();
    }
}
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
