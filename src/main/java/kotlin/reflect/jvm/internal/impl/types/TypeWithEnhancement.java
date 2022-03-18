package kotlin.reflect.jvm.internal.impl.types;

public interface TypeWithEnhancement {
    KotlinType getEnhancement();

    UnwrappedType getOrigin();
}
