package org.example.seminar1.containers;

import org.example.seminar1.models.Task;

import java.util.ArrayList;
import java.util.List;

public class StackContainer implements Container {
    //LastInFirstOut
    private final List<Task> stack = new ArrayList<>(); //final = nu mai putem atribui alta instanta
    //private Task[] arr_stack = new Task[]; //tip primitiv, mai rapid decat wrapper

    @Override
    public Task remove() {
        return stack.remove(size() - 1);
    }

    @Override
    public void add(Task task) {
        stack.add(task);
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
