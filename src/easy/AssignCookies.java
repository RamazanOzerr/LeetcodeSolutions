package easy;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int pointerG = 0;
        int pointerS = 0;
        int lengthG = g.length;
        int lengthS = s.length;
        int contentNum = 0;
        while(pointerG < lengthG && pointerS < lengthS){
            if(s[pointerS] >= g[pointerG]){
                contentNum++;
                pointerS++;
                pointerG++;
            } else {
                pointerS++;
            }
        }
        return contentNum;
    }
}
