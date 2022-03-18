package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

public interface JavaPrimitiveType extends JavaType {
    PrimitiveType getType();
}
