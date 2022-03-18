package org.apache.commons.lang3.tuple;

import java.io.Serializable;
import java.util.Objects;
import org.apache.commons.lang3.builder.C69866a;

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
        return "(" + ((Object) getLeft()) + "," + ((Object) getMiddle()) + "," + ((Object) getRight()) + ")";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((Triple) ((Triple) obj));
    }

    public String toString(String str) {
        return String.format(str, getLeft(), getMiddle(), getRight());
    }

    public int compareTo(Triple<L, M, R> triple) {
        return new C69866a().mo245170a(getLeft(), triple.getLeft()).mo245170a(getMiddle(), triple.getMiddle()).mo245170a(getRight(), triple.getRight()).mo245163a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        if (!Objects.equals(getLeft(), triple.getLeft()) || !Objects.equals(getMiddle(), triple.getMiddle()) || !Objects.equals(getRight(), triple.getRight())) {
            return false;
        }
        return true;
    }

    public static <L, M, R> Triple<L, M, R> of(L l, M m, R r) {
        return new ImmutableTriple(l, m, r);
    }
}
