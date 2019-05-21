package com.github.mouse0w0.observable.value;

public interface ObservableNumberValue<T extends Number> extends ObservableValue<T> {

    byte getByte();

    short getShort();

    int getInt();

    long getLong();

    float getFloat();

    double getDouble();

}
