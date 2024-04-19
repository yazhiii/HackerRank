import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        Integer count;

        List<Integer> result = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for (String a:stringList)
        {
            count=map.get(a);
            map.put(a,count==null?1:count+1);
        }
        for (String a:queries)
        {
            count=map.get(a);
            result.add(count==null?0:count);
        }
        return result;



    }

}

