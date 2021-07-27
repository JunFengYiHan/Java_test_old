package leetcode.sort.前K个高频单词;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 柒
 * Date: 2021-07-26
 * Time: 17:01
 */
public class TestDemo {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        //将所有元素都放入map集合中
        for (String data:words) {
            map.put(data,map.getOrDefault(data,0) + 1);
        }
        ArrayList<String> arrayList = new ArrayList<>(map.keySet());//将key放入
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1 = map.get(o1);
                int n2 = map.get(o2);
                if (n1==n2) {
                    return  o1.compareTo(o2);
                }
                return n2-n1;
            }
        });
        return arrayList.subList(0,4);
    }
}
