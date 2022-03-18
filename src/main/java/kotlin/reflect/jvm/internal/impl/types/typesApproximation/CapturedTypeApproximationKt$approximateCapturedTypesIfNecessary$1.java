package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* access modifiers changed from: package-private */
public final class CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1 extends Lambda implements Function1<UnwrappedType, Boolean> {
    public static final CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1 INSTANCE = new CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1();

    CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Boolean invoke(UnwrappedType unwrappedType) {
        return Boolean.valueOf(invoke(unwrappedType));
    }

    public final boolean invoke(UnwrappedType unwrappedType) {
        Intrinsics.checkExpressionValueIsNotNull(unwrappedType, "it");
        return CapturedTypeConstructorKt.isCaptured(unwrappedType);
    }
}
