package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

public interface NameResolver {
    String getQualifiedClassName(int i);

    String getString(int i);

    boolean isLocalClassName(int i);
}
