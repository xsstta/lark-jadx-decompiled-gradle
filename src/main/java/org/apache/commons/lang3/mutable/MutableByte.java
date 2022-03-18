package org.apache.commons.lang3.mutable;

import org.apache.commons.lang3.math.C69883a;

public class MutableByte extends Number implements Comparable<MutableByte> {
    private static final long serialVersionUID = -1585823265;
    private byte value;

    public double doubleValue() {
        return (double) this.value;
    }

    public float floatValue() {
        return (float) this.value;
    }

    public long longValue() {
        return (long) this.value;
    }

    public MutableByte() {
    }

    public byte byteValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public int intValue() {
        return this.value;
    }

    public void decrement() {
        this.value = (byte) (this.value - 1);
    }

    public byte decrementAndGet() {
        byte b = (byte) (this.value - 1);
        this.value = b;
        return b;
    }

    public byte getAndDecrement() {
        byte b = this.value;
        this.value = (byte) (b - 1);
        return b;
    }

    public byte getAndIncrement() {
        byte b = this.value;
        this.value = (byte) (b + 1);
        return b;
    }

    public Byte getValue() {
        return Byte.valueOf(this.value);
    }

    public void increment() {
        this.value = (byte) (this.value + 1);
    }

    public byte incrementAndGet() {
        byte b = (byte) (this.value + 1);
        this.value = b;
        return b;
    }

    public String toString() {
        return String.valueOf((int) this.value);
    }

    public Byte toByte() {
        return Byte.valueOf(byteValue());
    }

    public void setValue(byte b) {
        this.value = b;
    }

    public MutableByte(byte b) {
        this.value = b;
    }

    public void add(byte b) {
        this.value = (byte) (this.value + b);
    }

    public byte addAndGet(byte b) {
        byte b2 = (byte) (this.value + b);
        this.value = b2;
        return b2;
    }

    public byte getAndAdd(byte b) {
        byte b2 = this.value;
        this.value = (byte) (b + b2);
        return b2;
    }

    public void setValue(Number number) {
        this.value = number.byteValue();
    }

    public void subtract(byte b) {
        this.value = (byte) (this.value - b);
    }

    public MutableByte(Number number) {
        this.value = number.byteValue();
    }

    public void add(Number number) {
        this.value = (byte) (this.value + number.byteValue());
    }

    public byte addAndGet(Number number) {
        byte byteValue = (byte) (this.value + number.byteValue());
        this.value = byteValue;
        return byteValue;
    }

    public int compareTo(MutableByte mutableByte) {
        return C69883a.m268185a(this.value, mutableByte.value);
    }

    public byte getAndAdd(Number number) {
        byte b = this.value;
        this.value = (byte) (number.byteValue() + b);
        return b;
    }

    public void subtract(Number number) {
        this.value = (byte) (this.value - number.byteValue());
    }

    public MutableByte(String str) throws NumberFormatException {
        this.value = Byte.parseByte(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MutableByte) || this.value != ((MutableByte) obj).byteValue()) {
            return false;
        }
        return true;
    }
}
