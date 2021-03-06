package com.github.mouse0w0.observable.value;

import java.util.Objects;

public class SimpleMutableLongValue extends ObservableValueBase<Long> implements MutableLongValue {

    private long value;
    private UnmodifiableLongValue unmodifiableLongValue;

    public SimpleMutableLongValue() {
    }

    public SimpleMutableLongValue(long value) {
        this.value = value;
    }

    @Override
    public void set(long value) {
        if (this.value == value) {
            return;
        }
        long oldValue = this.value;
        this.value = value;
        fireValueChangedEvent(oldValue, value);
    }

    @Override
    public void setValue(Long value) {
        Objects.requireNonNull(value);
        set(value);
    }

    @Override
    public ObservableLongValue toUnmodifiable() {
        if (unmodifiableLongValue == null)
            unmodifiableLongValue = new UnmodifiableLongValue();
        return unmodifiableLongValue;
    }

    @Override
    public long get() {
        return value;
    }

    @Override
    public byte getByte() {
        return (byte) value;
    }

    @Override
    public short getShort() {
        return (short) value;
    }

    @Override
    public int getInt() {
        return (int) value;
    }

    @Override
    public long getLong() {
        return value;
    }

    @Override
    public float getFloat() {
        return value;
    }

    @Override
    public double getDouble() {
        return value;
    }

    @Override
    public Long getValue() {
        return get();
    }

    @Override
    public String toString() {
        return "SimpleMutableLongValue{" +
                "value=" + value +
                '}';
    }

    private class UnmodifiableLongValue implements ObservableLongValue {
        @Override
        public long get() {
            return SimpleMutableLongValue.this.get();
        }

        @Override
        public byte getByte() {
            return SimpleMutableLongValue.this.getByte();
        }

        @Override
        public short getShort() {
            return SimpleMutableLongValue.this.getShort();
        }

        @Override
        public int getInt() {
            return SimpleMutableLongValue.this.getInt();
        }

        @Override
        public long getLong() {
            return SimpleMutableLongValue.this.getLong();
        }

        @Override
        public float getFloat() {
            return SimpleMutableLongValue.this.getFloat();
        }

        @Override
        public double getDouble() {
            return SimpleMutableLongValue.this.getDouble();
        }

        @Override
        public Long getValue() {
            return SimpleMutableLongValue.this.getValue();
        }

        @Override
        public void addChangeListener(ValueChangeListener<? super Long> listener) {
            SimpleMutableLongValue.this.addChangeListener(listener);
        }

        @Override
        public void removeChangeListener(ValueChangeListener<? super Long> listener) {
            SimpleMutableLongValue.this.removeChangeListener(listener);
        }

        @Override
        public String toString() {
            return "UnmodifiableLongValue{" +
                    "value=" + value +
                    '}';
        }
    }
}
