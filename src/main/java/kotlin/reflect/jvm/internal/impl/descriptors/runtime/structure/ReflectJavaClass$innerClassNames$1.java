package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class ReflectJavaClass$innerClassNames$1 extends Lambda implements Function1<Class<?>, Boolean> {
    public static final ReflectJavaClass$innerClassNames$1 INSTANCE = new ReflectJavaClass$innerClassNames$1();

    ReflectJavaClass$innerClassNames$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Boolean invoke(Class<?> cls) {
        return Boolean.valueOf(invoke(cls));
    }

    public final boolean invoke(Class<?> cls) {
        Intrinsics.checkExpressionValueIsNotNull(cls, "it");
        String simpleName = cls.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "it.simpleName");
        if (simpleName.length() == 0) {
            return true;
        }
        return false;
    }
}
