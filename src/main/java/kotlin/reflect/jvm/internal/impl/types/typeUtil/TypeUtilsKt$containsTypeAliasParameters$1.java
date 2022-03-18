package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* access modifiers changed from: package-private */
public final class TypeUtilsKt$containsTypeAliasParameters$1 extends Lambda implements Function1<UnwrappedType, Boolean> {
    public static final TypeUtilsKt$containsTypeAliasParameters$1 INSTANCE = new TypeUtilsKt$containsTypeAliasParameters$1();

    TypeUtilsKt$containsTypeAliasParameters$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Boolean invoke(UnwrappedType unwrappedType) {
        return Boolean.valueOf(invoke(unwrappedType));
    }

    public final boolean invoke(UnwrappedType unwrappedType) {
        Intrinsics.checkParameterIsNotNull(unwrappedType, "it");
        ClassifierDescriptor declarationDescriptor = unwrappedType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor != null) {
            return TypeUtilsKt.isTypeAliasParameter(declarationDescriptor);
        }
        return false;
    }
}
