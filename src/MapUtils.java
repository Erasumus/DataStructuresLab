import java.util.HashMap;
import java.util.Map;

public class MapUtils {
    /**
     * Метод инвертирует ключи и значения в HashMap.
     * @param originalMap исходный HashMap с ключами Integer и значениями String
     * @return новый HashMap с ключами String и значениями Integer
     * @throws IllegalArgumentException если исходный HashMap пуст
     */
    public static HashMap<String, Integer> invertMap(HashMap<Integer, String> originalMap) {
        if (originalMap == null || originalMap.isEmpty()) {
            throw new IllegalArgumentException("Исходный HashMap не должен быть пустым или null");
        }

        HashMap<String, Integer> invertedMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : originalMap.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }

        return invertedMap;
    }
}
