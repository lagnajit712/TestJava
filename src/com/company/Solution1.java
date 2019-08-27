package com.company;
import java.util.*;

class Solution1 {
    public String solution(String s) {
        if(s.isEmpty()||s==null){
            s="*";
        }
        char c = s.charAt(0);
        if(c >= 'A' && c <= 'Z') {  // please fix condition
            return "upper";
        } else if(c >= 'a' && c <= 'z'){  // please fix condition
            return "lower";
        } else if (c >= '0' && c <= '9'){  // please fix condition
            return "digit";
        } else {
            return "other";
        }
    }
}