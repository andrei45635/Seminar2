package org.example.seminar1.factories;

import org.example.seminar1.containers.Container;
import org.example.seminar1.containers.StackContainer;
import org.example.seminar1.models.Task;

public class TaskContainerFactory implements Factory {

    private final static TaskContainerFactory taskContainerFactory = new TaskContainerFactory();

    private TaskContainerFactory(){}

    public static TaskContainerFactory getInstance(){
        return taskContainerFactory;
    }

    @Override
    public Container createContainer(Strategy strategy) {
        //TODO: add FIFO (queue)
        if (strategy == Strategy.LIFO) {
            return new StackContainer();
        }
        return null;
    }
}
