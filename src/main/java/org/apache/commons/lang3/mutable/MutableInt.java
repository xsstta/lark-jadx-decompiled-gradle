package org.apache.commons.lang3.mutable;

import org.apache.commons.lang3.math.C69883a;

public class MutableInt extends Number implements Comparable<MutableInt> {
    private static final long serialVersionUID = 512176391864L;
    private int value;

    public double doubleValue() {
        return (double) this.value;
    }

    public float floatValue() {
        return (float) this.value;
    }

    public long longValue() {
        return (long) this.value;
    }

    public MutableInt() {
    }

    public int hashCode() {
        return this.value;
    }

    public int intValue() {
        return this.value;
    }

    public void decrement() {
        this.value--;
    }

    public int decrementAndGet() {
        int i = this.value - 1;
        this.value = i;
        return i;
    }

    public int getAndDecrement() {
        int i = this.value;
        this.value = i - 1;
        return i;
    }

    public int getAndIncrement() {
        int i = this.value;
        this.value = i + 1;
        return i;
    }

    public Integer getValue() {
        return Integer.valueOf(this.value);
    }

    public void increment() {
        this.value++;
    }

    public int incrementAndGet() {
        int i = this.value + 1;
        this.value = i;
        return i;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public Integer toInteger() {
        return Integer.valueOf(intValue());
    }

    public void setValue(int i) {
        this.value = i;
    }

    public MutableInt(int i) {
        this.value = i;
    }

    public void add(int i) {
        this.value += i;
    }

    public int addAndGet(int i) {
        int i2 = this.value + i;
        this.value = i2;
        return i2;
    }

    public int getAndAdd(int i) {
        int i2 = this.value;
        this.value = i + i2;
        return i2;
    }

    public void setValue(Number number) {
        this.value = number.intValue();
    }

    public void subtract(int i) {
        this.value -= i;
    }

    public MutableInt(Number number) {
        this.value = number.intValue();
    }

    public void add(Number number) {
        this.value += number.intValue();
    }

    public int addAndGet(Number number) {
        int intValue = this.value + number.intValue();
        this.value = intValue;
        return intValue;
    }

    public int compareTo(MutableInt mutableInt) {
        return C69883a.m268186a(this.value, mutableInt.value);
    }

    public int getAndAdd(Number number) {
        int i = this.value;
        this.value = number.intValue() + i;
        return i;
    }

    public void subtract(Number number) {
        this.value -= number.intValue();
    }

    public MutableInt(String str) throws NumberFormatException {
        this.value = Integer.parseInt(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MutableInt) || this.value != ((MutableInt) obj).intValue()) {
            return false;
        }
        return true;
    }
}
