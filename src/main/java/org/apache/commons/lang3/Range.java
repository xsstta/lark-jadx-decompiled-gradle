package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Comparator;

public final class Range<T> implements Serializable {
    private static final long serialVersionUID = 1;
    private final Comparator<T> comparator;
    private transient int hashCode;
    private final T maximum;
    private final T minimum;
    private transient String toString;

    public Comparator<T> getComparator() {
        return this.comparator;
    }

    public T getMaximum() {
        return this.maximum;
    }

    public T getMinimum() {
        return this.minimum;
    }

    public boolean isNaturalOrdering() {
        if (this.comparator == EnumC69852a.INSTANCE) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode2 = ((((629 + getClass().hashCode()) * 37) + this.minimum.hashCode()) * 37) + this.maximum.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public String toString() {
        if (this.toString == null) {
            this.toString = "[" + ((Object) this.minimum) + ".." + ((Object) this.maximum) + "]";
        }
        return this.toString;
    }

    public static <T extends Comparable<T>> Range<T> is(T t) {
        return between(t, t, null);
    }

    public boolean isAfter(T t) {
        if (t != null && this.comparator.compare(t, this.minimum) < 0) {
            return true;
        }
        return false;
    }

    public boolean isAfterRange(Range<T> range) {
        if (range == null) {
            return false;
        }
        return isAfter(range.maximum);
    }

    public boolean isBefore(T t) {
        if (t != null && this.comparator.compare(t, this.maximum) > 0) {
            return true;
        }
        return false;
    }

    public boolean isBeforeRange(Range<T> range) {
        if (range == null) {
            return false;
        }
        return isBefore(range.minimum);
    }

    public boolean isEndedBy(T t) {
        if (t != null && this.comparator.compare(t, this.maximum) == 0) {
            return true;
        }
        return false;
    }

    public boolean isStartedBy(T t) {
        if (t != null && this.comparator.compare(t, this.minimum) == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(T t) {
        if (t != null && this.comparator.compare(t, this.minimum) > -1 && this.comparator.compare(t, this.maximum) < 1) {
            return true;
        }
        return false;
    }

    public boolean containsRange(Range<T> range) {
        if (range != null && contains(range.minimum) && contains(range.maximum)) {
            return true;
        }
        return false;
    }

    public int elementCompareTo(T t) {
        C69882g.m268177a(t, "Element is null", new Object[0]);
        if (isAfter(t)) {
            return -1;
        }
        if (isBefore(t)) {
            return 1;
        }
        return 0;
    }

    public boolean isOverlappedBy(Range<T> range) {
        if (range == null) {
            return false;
        }
        if (range.contains(this.minimum) || range.contains(this.maximum) || contains(range.minimum)) {
            return true;
        }
        return false;
    }

    public String toString(String str) {
        return String.format(str, this.minimum, this.maximum, this.comparator);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Range range = (Range) obj;
        if (!this.minimum.equals(range.minimum) || !this.maximum.equals(range.maximum)) {
            return false;
        }
        return true;
    }

    public Range<T> intersectionWith(Range<T> range) {
        T t;
        T t2;
        if (!isOverlappedBy(range)) {
            throw new IllegalArgumentException(String.format("Cannot calculate intersection with non-overlapping range %s", range));
        } else if (equals(range)) {
            return this;
        } else {
            if (getComparator().compare(this.minimum, range.minimum) < 0) {
                t = range.minimum;
            } else {
                t = this.minimum;
            }
            if (getComparator().compare(this.maximum, range.maximum) < 0) {
                t2 = this.maximum;
            } else {
                t2 = range.maximum;
            }
            return between(t, t2, getComparator());
        }
    }

    /* renamed from: org.apache.commons.lang3.Range$a */
    private enum EnumC69852a implements Comparator {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static <T extends Comparable<T>> Range<T> between(T t, T t2) {
        return between(t, t2, null);
    }

    public static <T> Range<T> is(T t, Comparator<T> comparator2) {
        return between(t, t, comparator2);
    }

    public static <T> Range<T> between(T t, T t2, Comparator<T> comparator2) {
        return new Range<>(t, t2, comparator2);
    }

    private Range(T t, T t2, Comparator<T> comparator2) {
        if (t == null || t2 == null) {
            throw new IllegalArgumentException("Elements in a range must not be null: element1=" + ((Object) t) + ", element2=" + ((Object) t2));
        }
        if (comparator2 == null) {
            this.comparator = EnumC69852a.INSTANCE;
        } else {
            this.comparator = comparator2;
        }
        if (this.comparator.compare(t, t2) < 1) {
            this.minimum = t;
            this.maximum = t2;
            return;
        }
        this.minimum = t2;
        this.maximum = t;
    }
}
