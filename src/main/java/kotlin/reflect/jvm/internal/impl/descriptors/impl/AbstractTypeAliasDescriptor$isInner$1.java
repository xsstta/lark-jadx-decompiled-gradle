package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

final class AbstractTypeAliasDescriptor$isInner$1 extends Lambda implements Function1<UnwrappedType, Boolean> {
    final /* synthetic */ AbstractTypeAliasDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AbstractTypeAliasDescriptor$isInner$1(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        super(1);
        this.this$0 = abstractTypeAliasDescriptor;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Boolean invoke(UnwrappedType unwrappedType) {
        return Boolean.valueOf(invoke(unwrappedType));
    }

    public final boolean invoke(UnwrappedType unwrappedType) {
        boolean z;
        Intrinsics.checkExpressionValueIsNotNull(unwrappedType, ShareHitPoint.f121869d);
        if (KotlinTypeKt.isError(unwrappedType)) {
            return false;
        }
        ClassifierDescriptor declarationDescriptor = unwrappedType.getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof TypeParameterDescriptor) || !(!Intrinsics.areEqual(((TypeParameterDescriptor) declarationDescriptor).getContainingDeclaration(), this.this$0))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }
}
