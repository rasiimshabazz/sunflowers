import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollatzSequence {

    public static long getNumberWithMostSteps(List<Integer> numbers) {
        HashMap<Long, Long> numbersAndCounts = new HashMap<>();
        for (Integer number : numbers) {
            long input = !((long) number <= 0 || (long) number > 1000000) ? (long) number : 0;
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
            numbersAndCounts.put(Long.valueOf(number), count);
        }
        Map.Entry<Long, Long> maxCountByNumber = null;
        for (Map.Entry<Long, Long> entry : ((Map<Long, Long>) numbersAndCounts).entrySet()) {
            if (maxCountByNumber == null || entry.getValue().compareTo(maxCountByNumber.getValue()) > 0) {
                maxCountByNumber = entry;
            }
        }
        return maxCountByNumber.getKey();
    }


}
