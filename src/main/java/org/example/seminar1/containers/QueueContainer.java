package org.example.seminar1.containers;

import org.example.seminar1.models.Task;

import java.util.ArrayList;
import java.util.List;

public class QueueContainer extends LFIFO{
    private final List<Task> queue = new ArrayList<>();
    @Override
    public Task remove() {
        return queue.remove(queue.size() - 1);
    }

    @Override
    public void add(Task task) {
        queue.add(queue.size() - 1, task);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
