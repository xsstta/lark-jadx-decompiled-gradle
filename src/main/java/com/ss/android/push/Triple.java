package com.ss.android.push;

import java.io.Serializable;

public abstract class Triple<L, M, R> implements Serializable, Comparable<Triple<L, M, R>> {
    private static final long serialVersionUID = 1;

    public abstract L getLeft();

    public abstract M getMiddle();

    public abstract R getRight();

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getLeft() == null) {
            i = 0;
        } else {
            i = getLeft().hashCode();
        }
        if (getMiddle() == null) {
            i2 = 0;
        } else {
            i2 = getMiddle().hashCode();
        }
        int i4 = i ^ i2;
        if (getRight() != null) {
            i3 = getRight().hashCode();
        }
        return i4 ^ i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append((Object) getLeft());
        sb.append(',');
        sb.append((Object) getMiddle());
        sb.append(',');
        sb.append((Object) getRight());
        sb.append(')');
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((Triple) ((Triple) obj));
    }

    public String toString(String str) {
        return String.format(str, getLeft(), getMiddle(), getRight());
    }

    public int compareTo(Triple<L, M, R> triple) {
        int compareTo = getLeft().compareTo(triple.getLeft());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = getMiddle().compareTo(triple.getMiddle());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return getRight().compareTo(triple.getRight());
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        if (!equals(getLeft(), triple.getLeft()) || !equals(getMiddle(), triple.getMiddle()) || !equals(getRight(), triple.getRight())) {
            return false;
        }
        return true;
    }

    private boolean equals(Object obj, Object obj2) {
        if (obj == null || obj2 == null || (obj != obj2 && !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static <L, M, R> Triple<L, M, R> of(L l, M m, R r) {
        return new ImmutableTriple(l, m, r);
    }
}
