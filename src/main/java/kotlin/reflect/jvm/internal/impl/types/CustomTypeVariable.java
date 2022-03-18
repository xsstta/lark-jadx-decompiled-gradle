package kotlin.reflect.jvm.internal.impl.types;

public interface CustomTypeVariable {
    boolean isTypeVariable();

    KotlinType substitutionResult(KotlinType kotlinType);
}
