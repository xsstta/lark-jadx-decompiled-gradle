package com.ss.android.lark.mail.impl.validator.base;

import java.io.Serializable;
import java.util.Set;

public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    public abstract T or(AbstractC43895k<? extends T> kVar);

    public abstract T or(T t);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(AbstractC43884d<? super T, V> dVar);

    Optional() {
    }

    public static <T> Optional<T> absent() {
        return C43864a.withType();
    }

    public static <T> Optional<T> fromNullable(T t) {
        if (t == null) {
            return absent();
        }
        return new C43887g(t);
    }

    public static <T> Optional<T> of(T t) {
        return new C43887g(C43886f.m173939a(t));
    }
}
