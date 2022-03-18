package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Reflection;

public final class ClassicTypeCheckerContextKt {
    public static final String errorMessage(Object obj) {
        return "ClassicTypeCheckerContext couldn't handle " + Reflection.getOrCreateKotlinClass(obj.getClass()) + ' ' + obj;
    }
}
