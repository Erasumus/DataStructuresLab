import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class TaskRunner {

    // Метод для выполнения задачи инверсии HashMap
    public static void runMapInversionTask() {
        System.out.println("Инверсия HashMap:");

        HashMap<Integer, String> integerToStringMap = new HashMap<>();
        integerToStringMap.put(1, "One");
        integerToStringMap.put(2, "Two");
        integerToStringMap.put(3, "Three");
        System.out.println("Исходная карта:" + "\n" + integerToStringMap);

        try {
            HashMap<String, Integer> stringToIntegerMap = MapUtils.invertMap(integerToStringMap);
            System.out.println("Инвертированная карта:" + "\n" + stringToIntegerMap);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    // Метод для выполнения задачи измерения времени доступа к элементам списков
    public static void runListAccessTimeMeasurement() {
        System.out.println("\nИзмерение времени доступа к элементам списка:");

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ListUtils.fillList(arrayList, 1_000_000);
        ListUtils.fillList(linkedList, 1_000_000);

        long arrayListTime = ListUtils.measureRandomAccessTime(arrayList, 1000);
        System.out.println("ArrayList время доступа: " + formatSeconds(ListUtils.convertToSeconds(arrayListTime)) + " с");

        long linkedListTime = ListUtils.measureRandomAccessTime(linkedList, 1000);
        System.out.println("LinkedList время доступа: " + formatSeconds(ListUtils.convertToSeconds(linkedListTime)) + " с");
    }

    private static String formatSeconds(double seconds) {
        if (seconds == 0.0) {
            throw new IllegalArgumentException("Время не может быть равно нулю");
        }
        DecimalFormat df = new DecimalFormat("#.####");
        return df.format(seconds);
    }

    // Метод для выполнения задачи удаления дубликатов из списка
    public static void runListDuplicateRemovalTask() {
        System.out.println("\nУдаление дубликатов из списка:");

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");

        System.out.println("Исходный список:" + "\n" + list);

        try {
            ListUtils.removeDuplicates(list);
            System.out.println("Список без дубликатов:" + "\n" + list);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}