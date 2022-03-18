package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

public final class NullDefaultValue extends AnnotationDefaultValue {
    public static final NullDefaultValue INSTANCE = new NullDefaultValue();

    private NullDefaultValue() {
        super(null);
    }
}
