import java.util.*;

public class CollatzSequence {

    public static long getNumberWithMostSteps(List<Integer> numbers) {
        HashMap<Long, Long> numberAndCount = new HashMap<>();

        numbers.stream().forEach(number -> {

            long input = !((long) number <= 0 || (long) number > 1000000) ? (long) number : 0;
            long count = 0;
            while (input > 1) {
                if (input % 2 == 0) input = input / 2;
                else input = (3 * input) + 1;
                count++;
            }
            numberAndCount.put(Long.valueOf(number), count);

        });

        return maxUsingIteration(numberAndCount);
    }

    public static <K, V extends Comparable<V>> K maxUsingIteration(Map<K, V> map) {
        Map.Entry<K, V> maxEntry = null;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue()
                    .compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }


}
