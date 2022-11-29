// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


class Solution {
    public int solution(int N, String S) {
        // write your code in Java SE 8

            String[] seats = S.split(" ");
            HashMap<Integer, List<String>> map = new HashMap();
            if (S.equals("")){
                return N * 2;
            }
            for (int i=0; i<seats.length; i++){
                Integer row = Integer.parseInt(seats[i].substring(0,1));
                String col = seats[i].substring(1,2);
                map.putIfAbsent(row, new ArrayList());
                map.get(row).add(col);
            }
                int res = (N - map.size()) * 2 -2 ;
                for (Integer rowSeat: map.keySet()){
                    boolean left = true,
                            right = true,
                            middle = true;
                            for(String colSeat: map.get(rowSeat)){
                                    if(colSeat.compareTo("B") >= 0 &&
                                    colSeat.compareTo("E")<= 0){
                                        left = false;
                                    }
                                    if(colSeat.compareTo("D") >= 0 &&
                                    colSeat.compareTo("G")<= 0){
                                        middle = false;
                                    }
                                    if(colSeat.compareTo("F") >= 0 &&
                                    colSeat.compareTo("J")<= 0){
                                        right = false;
                                    }

                                    if(left && right){
                                        res += 2;
                                    }else if(left||right||middle){
                                        res += 1;
                                    }
                            }
                }
        return res;
    }
}
