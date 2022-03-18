package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.collections.C69043h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

/* access modifiers changed from: package-private */
public final class ReflectClassUtilKt$parameterizedTypeArguments$2 extends Lambda implements Function1<ParameterizedType, Sequence<? extends Type>> {
    public static final ReflectClassUtilKt$parameterizedTypeArguments$2 INSTANCE = new ReflectClassUtilKt$parameterizedTypeArguments$2();

    ReflectClassUtilKt$parameterizedTypeArguments$2() {
        super(1);
    }

    public final Sequence<Type> invoke(ParameterizedType parameterizedType) {
        Intrinsics.checkParameterIsNotNull(parameterizedType, "it");
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkExpressionValueIsNotNull(actualTypeArguments, "it.actualTypeArguments");
        return C69043h.m265792q(actualTypeArguments);
    }
}
