package org.example.seminar1.containers;

import org.example.seminar1.models.Task;

import java.util.ArrayList;
import java.util.List;

public abstract class LFIFO implements Container {
    protected final List<Task> list = new ArrayList<>();
    @Override
    public abstract Task remove();

    @Override
    public void add(Task task){
        list.add(task);
    }

    @Override
    public int size(){
        return list.size();
    }

    @Override
    public boolean isEmpty(){
        return size() == 0;
    }
}
