package Blind75.Medium;
import java.util.*;
public class EncodeDecodeString {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.length()).append("/").append(str);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < s.length()){
            int slash = s.indexOf("/", i);
            int size = Integer.valueOf(s.substring(i, slash));
            i = slash + size + 1;
            res.add(s.substring(slash+1, i));
        }
        return res;
    }
}
