package org.example.seminar1.containers;

import org.example.seminar1.models.Task;

public abstract class LFIFO implements Container {
    @Override
    public abstract Task remove();

    @Override
    public abstract void add(Task task);

    @Override
    public abstract int size();

    @Override
    public abstract boolean isEmpty();
}
