import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollatzSequence {

    public static long calc(List<Integer> nums) {
        HashMap<Long, Long> numsMap = new HashMap<>();
        for (Integer n : nums) {
            long input = !((long) n <= 0 || (long) n > 1000000) ? (long) n : 0;
            long count = 0;
            while (input > 1) {
                if (input % 2 == 0) {
                    input = input / 2;
                }
                else {
                    input = (3 * input) + 1;
                }
                count++;
            }
            numsMap.put(Long.valueOf(n), count);
        }
        Map.Entry<Long, Long> count = null;
        for (Map.Entry<Long, Long> entry : ((Map<Long, Long>) numsMap).entrySet()) {
            if (count == null || entry.getValue().compareTo(count.getValue()) > 0) {
                count = entry;
            }
        }
        return count.getKey();
    }


}
