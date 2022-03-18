package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* access modifiers changed from: package-private */
public final class SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1 extends Lambda implements Function1<UnwrappedType, Boolean> {
    public static final SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1 INSTANCE = new SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1();

    SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Boolean invoke(UnwrappedType unwrappedType) {
        return Boolean.valueOf(invoke(unwrappedType));
    }

    public final boolean invoke(UnwrappedType unwrappedType) {
        ClassifierDescriptor declarationDescriptor = unwrappedType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(declarationDescriptor, "it.constructor.declarati… ?: return@contains false");
        if (!Intrinsics.areEqual(declarationDescriptor.getName(), JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME().shortName()) || !Intrinsics.areEqual(DescriptorUtilsKt.fqNameOrNull(declarationDescriptor), JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME())) {
            return false;
        }
        return true;
    }
}
