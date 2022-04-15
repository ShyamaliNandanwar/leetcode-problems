/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    List<Integer> li ;
    int idx=0;
    public NestedIterator(List<NestedInteger> nestedList) {
        li = new ArrayList<>();
    
        helper(nestedList);
        idx=0;
    }
    public void helper(List<NestedInteger> nestedList){
        for(int i=0; i< nestedList.size();i++){
            NestedInteger n = nestedList.get(i);
            if(n.isInteger())
                li.add(n.getInteger());
            else{
                List<NestedInteger> l = n.getList();
                 helper(l);
            }
        }
    }
    
    @Override
    public Integer next() {
        int n = li.get(0);
        li.remove(0);
        return new Integer(n);
    }

    @Override
    public boolean hasNext() {
        if(li.isEmpty())
            return false;
        return true;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */