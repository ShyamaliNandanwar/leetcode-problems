class PairsDivBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] arr = new int[60];
        int count = 0;

        for(int i=0; i<time.length; i++) {
            int rem = time[i]%60;
            int req = (rem==0) ? 0 : 60-rem; //Required number to make it divisible
            if(arr[req]>0){
                count = count + arr[req];
            }
            arr[rem] = arr[rem]+1;
        }
        return count;
    }
}