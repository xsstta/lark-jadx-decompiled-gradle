package kotlin.reflect.jvm.internal.impl.types;

public interface SubtypingRepresentatives {
    KotlinType getSubTypeRepresentative();

    KotlinType getSuperTypeRepresentative();

    boolean sameTypeConstructor(KotlinType kotlinType);
}
