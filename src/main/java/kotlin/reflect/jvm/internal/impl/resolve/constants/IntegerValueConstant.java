package kotlin.reflect.jvm.internal.impl.resolve.constants;

public abstract class IntegerValueConstant<T> extends ConstantValue<T> {
    protected IntegerValueConstant(T t) {
        super(t);
    }
}
