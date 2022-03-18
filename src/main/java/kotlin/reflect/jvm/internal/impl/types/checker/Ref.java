package kotlin.reflect.jvm.internal.impl.types.checker;

public final class Ref<T> {
    private T value;

    public final T getValue() {
        return this.value;
    }

    public Ref(T t) {
        this.value = t;
    }
}
