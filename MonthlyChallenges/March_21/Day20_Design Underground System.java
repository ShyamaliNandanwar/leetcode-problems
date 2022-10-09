import java.util.HashMap;

class UndergroundSystem {
    HashMap<Integer,String> ci = new HashMap<>();
    HashMap<String, Double[]> avg = new HashMap<>();
    public UndergroundSystem() {
        
    }
    
    public void checkIn(int id, String stationName, int t) {
        ci.put(id, stationName+"-"+t);
    }
    
    public void checkOut(int id, String stationName, int t) {
        
        String temp[] = ci.get(id).split("-");
        int time = Integer.parseInt(temp[1]);
        String key=temp[0]+stationName;
        if(!avg.containsKey(key))
            avg.put(temp[0]+stationName,new Double[]{(double)1, (double)t-time});
        else{
            Double n[] = avg.get(key);
            Double val=((n[0]*n[1])+(t-time))/(n[0]+1);
            avg.replace(temp[0]+stationName, new Double[]{n[0]+1,val});
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        return avg.get(startStation+endStation)[1];
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */