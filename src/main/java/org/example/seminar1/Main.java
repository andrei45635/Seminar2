package org.example.seminar1;

import org.example.seminar1.factories.Strategy;
import org.example.seminar1.models.Message;
import org.example.seminar1.models.MessageTask;
import org.example.seminar1.models.Task;
import org.example.seminar1.runners.DelayTaskRunner;
import org.example.seminar1.runners.PrinterTaskRunner;
import org.example.seminar1.runners.StrategyTaskRunner;
import org.example.seminar1.runners.TaskRunner;
import org.example.seminar1.sorters.AbstractSorter;
import org.example.seminar1.sorters.BubbleSort;
import org.example.seminar1.sorters.QuickSort;
import org.example.seminar1.sorters.SortingTask;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testMessage();
        testTaskRunner(args);
        testSorters();
        testQuickSorter();
    }

    private static void testMessage() {
        List<Task> tasks = taskCreator();
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    private static void testSorters() {
        int[] numere1 = {11, 2, 5, 3, 16, 12, 10};
        AbstractSorter bubble_sorter = new BubbleSort(numere1);
        SortingTask sorter1 = new SortingTask("2", "d2", bubble_sorter);
        sorter1.execute();
    }

    private static void testQuickSorter(){
        int[] numere2 = {14, 11, 2, 5, 76, 1, 3};
        AbstractSorter quick_sorter = new QuickSort(numere2);
        SortingTask sorter2 = new SortingTask("3", "d3", quick_sorter);
        sorter2.execute();
    }

    private static List<Task> taskCreator() {
        Message message1 = new Message("hello", "mircea", "fenesan", LocalDateTime.now());
        Task task1 = new MessageTask("1", "d1", message1);

        Message message2 = new Message("hello", "mircea", "fenesan", LocalDateTime.now());
        Task task2 = new MessageTask("2", "d2", message2);

        Message message3 = new Message("hello", "mircea", "fenesan", LocalDateTime.now());
        Task task3 = new MessageTask("3", "d3", message3);

        Message message4 = new Message("hello", "mircea", "fenesan", LocalDateTime.now());
        Task task4 = new MessageTask("4", "d4", message4);

        Message message5 = new Message("hello", "mircea", "fenesan", LocalDateTime.now());
        Task task5 = new MessageTask("5", "d5", message5);

        List<Task> tasks = new LinkedList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        return tasks;
    }

    private static void testTaskRunner(String[] args) {
        List<Task> tasks1 = taskCreator();
        List<Task> tasks2 = taskCreator();
        List<Task> tasks3 = taskCreator();

        if (args.length != 1) {
            System.out.println("Introduceti doar o strategie!\n");
            return;
        }

        Strategy strat = Strategy.valueOf(args[0]);

        TaskRunner strategyTaskRunner = new StrategyTaskRunner(strat);
        TaskRunner delayTaskRunner = new DelayTaskRunner(strategyTaskRunner);
        TaskRunner printerTaskRunner = new PrinterTaskRunner(strategyTaskRunner);

        for (Task task : tasks1) {
            strategyTaskRunner.addTask(task);
        }

        System.out.println("Strategy Task Runner: ");
        strategyTaskRunner.executeAll();

        for (Task task : tasks2) {
            printerTaskRunner.addTask(task);
        }

        System.out.println("Printer Task Runner: ");
        printerTaskRunner.executeAll();

        for (Task task : tasks3) {
            delayTaskRunner.addTask(task);
        }

        System.out.println("Delay Task Runner: ");
        delayTaskRunner.executeAll();
    }
}
