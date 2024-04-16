package medium;

import java.util.*;

public class InvalidTransactions {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> list = Arrays.asList(transactions);
        Map<String,List<String[]>> map = new HashMap<>();//name: list
        Set<String> set = new HashSet<>();// avoid duplication
        for(int i = 0; i< list.size();i++){
            String[] ss= list.get(i).split(",");

            //constrain 1: amount bigger than 1000
            if(Integer.parseInt(ss[2])>1000) {
                set.add(list.get(i));
                //continue;
            }
            if(!map.containsKey(ss[0])) {
                List<String[]> curr = new ArrayList<>();
                curr.add(ss);
                map.put(ss[0],curr);
            }else{
                map.get(ss[0]).add(ss);
            }
            for(String[] c: map.get(ss[0])){
                if(c[0].equals(ss[0]) && Math.abs((Integer.parseInt(c[1])-Integer.parseInt(ss[1])))<=60 && !c[3].equals(ss[3])){
                    set.add(c[0]+","+c[1]+","+c[2]+","+c[3]);
                    set.add(ss[0]+","+ss[1]+","+ss[2]+","+ss[3]);
                    //break;
                }

            }
        }
        //original list may contain duplication
        Map<String,Integer> cntmap = new HashMap<>();
        for(String cnts:transactions){
            if(cntmap.containsKey(cnts)) cntmap.put(cnts,cntmap.get(cnts)+1);
            else cntmap.put(cnts,1);
        }
        List<String> ans = new ArrayList<String>(set);
        for(String cs:cntmap.keySet()){
            if(ans.contains(cs) && (cntmap.get(cs)-1)>0){
                for(int i = cntmap.get(cs)-1; i>0;i--){
                    ans.add(cs);
                }
            }
        }
        return ans;
    }
}
