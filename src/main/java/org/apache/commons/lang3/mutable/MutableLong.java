package org.apache.commons.lang3.mutable;

import org.apache.commons.lang3.math.C69883a;

public class MutableLong extends Number implements Comparable<MutableLong> {
    private static final long serialVersionUID = 62986528375L;
    private long value;

    public double doubleValue() {
        return (double) this.value;
    }

    public float floatValue() {
        return (float) this.value;
    }

    public int intValue() {
        return (int) this.value;
    }

    public MutableLong() {
    }

    public long longValue() {
        return this.value;
    }

    public void decrement() {
        this.value--;
    }

    public long decrementAndGet() {
        long j = this.value - 1;
        this.value = j;
        return j;
    }

    public long getAndIncrement() {
        long j = this.value;
        this.value = 1 + j;
        return j;
    }

    public Long getValue() {
        return Long.valueOf(this.value);
    }

    public void increment() {
        this.value++;
    }

    public long incrementAndGet() {
        long j = this.value + 1;
        this.value = j;
        return j;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public long getAndDecrement() {
        long j = this.value;
        this.value = j - 1;
        return j;
    }

    public int hashCode() {
        long j = this.value;
        return (int) (j ^ (j >>> 32));
    }

    public Long toLong() {
        return Long.valueOf(longValue());
    }

    public void setValue(long j) {
        this.value = j;
    }

    public MutableLong(long j) {
        this.value = j;
    }

    public void add(long j) {
        this.value += j;
    }

    public long addAndGet(long j) {
        long j2 = this.value + j;
        this.value = j2;
        return j2;
    }

    public long getAndAdd(long j) {
        long j2 = this.value;
        this.value = j + j2;
        return j2;
    }

    public void setValue(Number number) {
        this.value = number.longValue();
    }

    public void subtract(long j) {
        this.value -= j;
    }

    public MutableLong(Number number) {
        this.value = number.longValue();
    }

    public void add(Number number) {
        this.value += number.longValue();
    }

    public long addAndGet(Number number) {
        long longValue = this.value + number.longValue();
        this.value = longValue;
        return longValue;
    }

    public int compareTo(MutableLong mutableLong) {
        return C69883a.m268187a(this.value, mutableLong.value);
    }

    public long getAndAdd(Number number) {
        long j = this.value;
        this.value = number.longValue() + j;
        return j;
    }

    public void subtract(Number number) {
        this.value -= number.longValue();
    }

    public MutableLong(String str) throws NumberFormatException {
        this.value = Long.parseLong(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MutableLong) || this.value != ((MutableLong) obj).longValue()) {
            return false;
        }
        return true;
    }
}
