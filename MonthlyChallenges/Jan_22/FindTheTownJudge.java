import java.util.HashSet;

class FindTownJudge {
    public int findJudge(int n, int[][] trust) {
        if(trust== null || trust.length == 0 || trust[0].length == 0)
            return -1;

        HashSet<Integer> hs = new HashSet<>();
        int l = trust[0].length;

        for(int i=0; i< l;i++){
            if(!hs.contains(trust[i][0]))
                hs.add(trust[i][0]);
        }

        for(int i=1 ; i<=n;i++){
            if(!hs.contains(i))
                return i;
        }
        return -1;
    }
}