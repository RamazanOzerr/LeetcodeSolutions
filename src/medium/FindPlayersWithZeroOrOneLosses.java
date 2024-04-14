package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FindPlayersWithZeroOrOneLosses {
    public List<List<Integer>> findWinners(int[][] matches) {

        HashSet<Integer> winners = new HashSet<>();
        HashSet<Integer> losers = new HashSet<>();
        HashSet<Integer> lostMore = new HashSet<>();

        for(int i = 0; i < matches.length; i++){
            int winner = matches[i][0];
            int loser = matches[i][1];
            if(!losers.contains(winner) && !lostMore.contains(winner)){
                winners.add(winner);
            }

            if(losers.contains(loser)){
                lostMore.add(loser);
                losers.remove(loser);
            } else {
                if(!lostMore.contains(loser)) losers.add(loser);
            }

            winners.remove(loser);
        }

        List<Integer> winnersList = new ArrayList<>();
        List<Integer> losersList = new ArrayList<>();
        for(int i : winners){
            winnersList.add(i);
        }
        for(int i : losers){
            losersList.add(i);
        }
        Collections.sort(winnersList);
        Collections.sort(losersList);
        List<List<Integer>> resList = new ArrayList<>();
        resList.add(winnersList);
        resList.add(losersList);
        return resList;
    }
}
