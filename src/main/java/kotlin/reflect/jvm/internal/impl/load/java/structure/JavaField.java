package kotlin.reflect.jvm.internal.impl.load.java.structure;

public interface JavaField extends JavaMember {
    boolean getHasConstantNotNullInitializer();

    JavaType getType();

    boolean isEnumEntry();
}
