package kotlin.reflect.jvm.internal.impl.storage;

/* access modifiers changed from: package-private */
public class SingleThreadValue<T> {
    private final Thread thread = Thread.currentThread();
    private final T value;

    public boolean hasValue() {
        if (this.thread == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public T getValue() {
        if (hasValue()) {
            return this.value;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    SingleThreadValue(T t) {
        this.value = t;
    }
}
