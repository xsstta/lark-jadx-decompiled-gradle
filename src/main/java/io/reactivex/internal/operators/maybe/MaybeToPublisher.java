package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC68990l;
import io.reactivex.functions.Function;
import org.p3511d.AbstractC70020b;

public enum MaybeToPublisher implements Function<AbstractC68990l<Object>, AbstractC70020b<Object>> {
    INSTANCE;

    public static <T> Function<AbstractC68990l<T>, AbstractC70020b<T>> instance() {
        return INSTANCE;
    }

    public AbstractC70020b<Object> apply(AbstractC68990l<Object> lVar) throws Exception {
        return new C68642e(lVar);
    }
}
