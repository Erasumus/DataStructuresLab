public class Main {
    public static void main(String[] args) {
        // Запускаем задачу инверсии HashMap из класса TaskRunner
        TaskRunner.runMapInversionTask();
        // Запускаем задачу измерения времени доступа к элементам списков из класса TaskRunner
        TaskRunner.runListAccessTimeMeasurement();
        // Запускаем задачу удаления дубликатов из списка из класса TaskRunner
        TaskRunner.runListDuplicateRemovalTask();
    }
}
