package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    private static final int MAXIMUMVALUE=1000000000;
    private static final int MINIMUMVALUE=0;
    public int solution(int A, int B) {
        int count=0;
        if(A>MINIMUMVALUE && A<=MAXIMUMVALUE && B>MINIMUMVALUE && B<=MAXIMUMVALUE && A<=B){
            for(int i= A;i<=B;i++){
                int n=(int)Math.sqrt(i);
                if(n*(n+1)==i){
                    count=count+1;
                }
            }

        }else{
            return 0;
        }
        return count;
    }

    public int solutionB(int A, int B) {
        int count=0;
        List<Integer> list= new ArrayList<Integer>();
        if(A>MINIMUMVALUE && A<=MAXIMUMVALUE && B>MINIMUMVALUE && B<=MAXIMUMVALUE && A<=B){
            for(int i= A;i<=B;i++) {
                list.add(i);
            }
            count=(int)list.stream().filter(i -> ((int)Math.sqrt(i)) * (((int)Math.sqrt(i))+1)==i).count();
        }else{
            return 0;
        }
        return count;
    }
}
