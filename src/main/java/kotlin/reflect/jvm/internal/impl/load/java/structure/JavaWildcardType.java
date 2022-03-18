package kotlin.reflect.jvm.internal.impl.load.java.structure;

public interface JavaWildcardType extends JavaType {
    JavaType getBound();

    boolean isExtends();
}
