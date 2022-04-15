class MyCircularQueue {
    int cq[]=null;
    int r=0;
    int f=0;
    boolean isElePresent = false;
    public MyCircularQueue(int k) {
        cq = new int[k];
        isElePresent = false;
        Arrays.fill(cq,-1);
    }
    
    public boolean enQueue(int value) {
        if(isEmpty()){  //queue empty
            cq[r]=value;
            r = r+1;
            isElePresent=true;
        }else if(isFull()){ //queue full
            return false;
        }else{
            cq[r]=value;
            r = (r+1)%cq.length;
            //isElePresent=true;
        }
        return isElePresent;
    }
    
    public boolean deQueue() {
         if(isEmpty()) //queue empty
             return false;
       // System.out.println("f=" + f);
        cq[f]=-1;
        f = (f+1)%cq.length;
        if(f==r )
           isElePresent = false; 
        return true;
    }
    
    public int Front() {
        return cq[f%cq.length];
    }
    
    public int Rear() {
        
        if(r==0)
            return cq[cq.length-1];
        return cq[(r-1)%cq.length];
    }
    
    public boolean isEmpty() {
        return !isElePresent;
    }
    
    public boolean isFull() {
        if(f==r && isElePresent)
            return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */