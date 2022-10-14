package org.example.seminar1.runners;

import org.example.seminar1.utils.Utils;

import java.time.LocalDateTime;


public class PrinterTaskRunner extends AbstractTaskRunner{

    public PrinterTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }

    @Override
    public void executeOneTask() {
        taskRunner.executeOneTask();
        showTimeOfExec();
    }

    private static void showTimeOfExec() {
        System.out.println("Black Mesa incident at: " + LocalDateTime.now().format(Utils.DATE_TIME_FORMATTER));
    }


}
