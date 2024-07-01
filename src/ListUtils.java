import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashSet;

public class ListUtils {
    /**
     * Заполняет список случайными элементами.
     * @param list список для заполнения
     * @param size количество элементов
     */
    public static void fillList(List<Integer> list, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }
    }

    /**
     * Замеряет время случайного доступа к элементам списка.
     * @param list список для измерения
     * @param accessCount количество случайных доступов
     * @return время в наносекундах
     */
    public static long measureRandomAccessTime(List<Integer> list, int accessCount) {
        Random random = new Random();
        long startTime = System.nanoTime();

        try {
            for (int i = 0; i < accessCount; i++) {
                int index = random.nextInt(list.size());
                list.get(index); // Доступ к случайному элементу
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами: " + e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.out.println("Некорректная операция: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Что-то пошло не так: " + e.getMessage());
        }

        long endTime = System.nanoTime();
        return endTime - startTime; // Возвращаем время в наносекундах
    }

    /**
     * Удаляет дубликаты из ArrayList строк.
     * @param list список строк, из которого нужно удалить дубликаты
     */
    public static void removeDuplicates(ArrayList<String> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Список не должен быть пустым");
        }

        HashSet<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
    }

    /**
     * Конвертирует время из наносекунд в секунды.
     * @param time время в наносекундах
     * @return время в секундах
     */
    public static double convertToSeconds(long time) {
        if (time == 0) {
            throw new IllegalArgumentException("Время не может быть равно нулю");
        }
        return time / 1_000_000_000.0; // Делим на 1_000_000_000 для перевода в секунды
    }
}
