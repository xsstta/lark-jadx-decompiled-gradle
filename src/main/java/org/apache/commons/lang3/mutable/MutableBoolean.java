package org.apache.commons.lang3.mutable;

import java.io.Serializable;
import org.apache.commons.lang3.C69858b;

public class MutableBoolean implements Serializable, Comparable<MutableBoolean> {
    private static final long serialVersionUID = -4830728138360036487L;
    private boolean value;

    public void setFalse() {
        this.value = false;
    }

    public void setTrue() {
        this.value = true;
    }

    public MutableBoolean() {
    }

    public boolean booleanValue() {
        return this.value;
    }

    public boolean isTrue() {
        return this.value;
    }

    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }

    public boolean isFalse() {
        return !this.value;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public int hashCode() {
        Boolean bool;
        if (this.value) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        return bool.hashCode();
    }

    public Boolean toBoolean() {
        return Boolean.valueOf(booleanValue());
    }

    public void setValue(boolean z) {
        this.value = z;
    }

    public MutableBoolean(boolean z) {
        this.value = z;
    }

    public void setValue(Boolean bool) {
        this.value = bool.booleanValue();
    }

    public MutableBoolean(Boolean bool) {
        this.value = bool.booleanValue();
    }

    public int compareTo(MutableBoolean mutableBoolean) {
        return C69858b.m268108a(this.value, mutableBoolean.value);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MutableBoolean) || this.value != ((MutableBoolean) obj).booleanValue()) {
            return false;
        }
        return true;
    }
}
