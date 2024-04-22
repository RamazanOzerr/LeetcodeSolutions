package medium;

import java.util.*;

public class DisplayTableOfFoodOrdersInARestaurant {
    public List<List<String>> displayTable(List<List<String>> orders) {

        TreeMap<Integer, TreeMap<String, Integer>> ordersMap = new TreeMap<>();
        HashSet<String> foodSet = new HashSet<>();
        for(List<String> l : orders){
            TreeMap<String, Integer> currMap;
            int currTableNum = Integer.parseInt(l.get(1));
            String currFood = l.get(2);

            if(!foodSet.contains(currFood)) foodSet.add(currFood);

            if(ordersMap.containsKey(currTableNum)){
                currMap = ordersMap.get(currTableNum);
                if(currMap.containsKey(currFood)){
                    int tempFreq = currMap.get(currFood);
                    currMap.put(currFood, ++tempFreq);
                } else {
                    currMap.put(currFood, 1);
                }

            } else {
                currMap = new TreeMap<>();
                currMap.put(currFood, 1);
            }
            ordersMap.put(currTableNum, currMap);
        }

        for(int tableNum : ordersMap.keySet()){
            TreeMap<String, Integer> currMap = ordersMap.get(tableNum);
            for(String food : foodSet){
                if(!currMap.containsKey(food)){
                    currMap.put(food, 0);
                }
            }
        }

        List<List<String>> resList = new ArrayList<>();
        List<String> foodList = new ArrayList<>();
        foodList.add("Table");
        List<String> foodListTemp = new ArrayList<>(foodSet);
        Collections.sort(foodListTemp);
        for(String f : foodListTemp){
            foodList.add(f);
        }
        resList.add(foodList);
        for(int tableNum : ordersMap.keySet()){
            List<String> currList = new ArrayList<>();
            currList.add(String.valueOf(tableNum));
            TreeMap<String, Integer> foodMap = ordersMap.get(tableNum);
            for(String foodName : foodMap.keySet()){
                currList.add(String.valueOf(foodMap.get(foodName)));
            }
            resList.add(currList);
        }
        return resList;


    }
}
