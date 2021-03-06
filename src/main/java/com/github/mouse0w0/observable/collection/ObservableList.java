package com.github.mouse0w0.observable.collection;

import java.util.Collections;
import java.util.List;

public interface ObservableList<E> extends List<E> {

    void addChangeListener(ListChangeListener<? super E> listener);

    void removeChangeListener(ListChangeListener<? super E> listener);

    default boolean addAll(E... elements) {
        return Collections.addAll(this, elements);
    }
}
