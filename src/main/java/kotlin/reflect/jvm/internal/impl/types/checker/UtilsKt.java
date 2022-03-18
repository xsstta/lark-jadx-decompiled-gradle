package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;

public final class UtilsKt {
    private static final KotlinType approximate(KotlinType kotlinType) {
        return CapturedTypeApproximationKt.approximateCapturedTypes(kotlinType).getUpper();
    }

    private static final String debugInfo(TypeConstructor typeConstructor) {
        StringBuilder sb = new StringBuilder();
        UtilsKt$debugInfo$1$1 utilsKt$debugInfo$1$1 = new UtilsKt$debugInfo$1$1(sb);
        utilsKt$debugInfo$1$1.invoke("type: " + typeConstructor);
        utilsKt$debugInfo$1$1.invoke("hashCode: " + typeConstructor.hashCode());
        utilsKt$debugInfo$1$1.invoke("javaClass: " + typeConstructor.getClass().getCanonicalName());
        for (ClassifierDescriptor declarationDescriptor = typeConstructor.getDeclarationDescriptor(); declarationDescriptor != null; declarationDescriptor = declarationDescriptor.getContainingDeclaration()) {
            utilsKt$debugInfo$1$1.invoke("fqName: " + DescriptorRenderer.FQ_NAMES_IN_TYPES.render(declarationDescriptor));
            utilsKt$debugInfo$1$1.invoke("javaClass: " + declarationDescriptor.getClass().getCanonicalName());
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType findCorrespondingSupertype(kotlin.reflect.jvm.internal.impl.types.KotlinType r9, kotlin.reflect.jvm.internal.impl.types.KotlinType r10, kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks r11) {
        /*
        // Method dump skipped, instructions count: 307
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.UtilsKt.findCorrespondingSupertype(kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks):kotlin.reflect.jvm.internal.impl.types.KotlinType");
    }
}
