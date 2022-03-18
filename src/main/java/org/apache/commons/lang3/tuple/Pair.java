package org.apache.commons.lang3.tuple;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.builder.C69866a;

public abstract class Pair<L, R> implements Serializable, Comparable<Pair<L, R>>, Map.Entry<L, R> {
    private static final long serialVersionUID = 4954918890077093841L;

    public abstract L getLeft();

    public abstract R getRight();

    @Override // java.util.Map.Entry
    public final L getKey() {
        return getLeft();
    }

    @Override // java.util.Map.Entry
    public R getValue() {
        return getRight();
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getKey() == null) {
            i = 0;
        } else {
            i = getKey().hashCode();
        }
        if (getValue() != null) {
            i2 = getValue().hashCode();
        }
        return i ^ i2;
    }

    public String toString() {
        return "(" + ((Object) getLeft()) + ',' + ((Object) getRight()) + ')';
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((Pair) ((Pair) obj));
    }

    public String toString(String str) {
        return String.format(str, getLeft(), getRight());
    }

    public int compareTo(Pair<L, R> pair) {
        return new C69866a().mo245170a(getLeft(), pair.getLeft()).mo245170a(getRight(), pair.getRight()).mo245163a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!Objects.equals(getKey(), entry.getKey()) || !Objects.equals(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public static <L, R> Pair<L, R> of(L l, R r) {
        return new ImmutablePair(l, r);
    }
}
