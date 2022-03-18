package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;

public final class NewCapturedType extends SimpleType implements CapturedTypeMarker {
    private final Annotations annotations;
    private final CaptureStatus captureStatus;
    private final NewCapturedTypeConstructor constructor;
    private final boolean isMarkedNullable;
    private final UnwrappedType lowerType;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public NewCapturedTypeConstructor getConstructor() {
        return this.constructor;
    }

    public final UnwrappedType getLowerType() {
        return this.lowerType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        MemberScope createErrorScope = ErrorUtils.createErrorScope("No member resolution should be done on captured type!", true);
        Intrinsics.checkExpressionValueIsNotNull(createErrorScope, "ErrorUtils.createErrorSc…on captured type!\", true)");
        return createErrorScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.SimpleType
    public NewCapturedType makeNullableAsSpecified(boolean z) {
        return new NewCapturedType(this.captureStatus, getConstructor(), this.lowerType, getAnnotations(), z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.SimpleType
    public NewCapturedType replaceAnnotations(Annotations annotations2) {
        Intrinsics.checkParameterIsNotNull(annotations2, "newAnnotations");
        return new NewCapturedType(this.captureStatus, getConstructor(), this.lowerType, annotations2, isMarkedNullable());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public NewCapturedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        UnwrappedType unwrappedType;
        Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
        CaptureStatus captureStatus2 = this.captureStatus;
        NewCapturedTypeConstructor refine = getConstructor().refine(kotlinTypeRefiner);
        UnwrappedType unwrappedType2 = this.lowerType;
        if (unwrappedType2 != null) {
            unwrappedType = kotlinTypeRefiner.refineType(unwrappedType2).unwrap();
        } else {
            unwrappedType = null;
        }
        return new NewCapturedType(captureStatus2, refine, unwrappedType, getAnnotations(), isMarkedNullable());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewCapturedType(CaptureStatus captureStatus2, UnwrappedType unwrappedType, TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        this(captureStatus2, new NewCapturedTypeConstructor(typeProjection, null, null, typeParameterDescriptor, 6, null), unwrappedType, null, false, 24, null);
        Intrinsics.checkParameterIsNotNull(captureStatus2, "captureStatus");
        Intrinsics.checkParameterIsNotNull(typeProjection, "projection");
        Intrinsics.checkParameterIsNotNull(typeParameterDescriptor, "typeParameter");
    }

    public NewCapturedType(CaptureStatus captureStatus2, NewCapturedTypeConstructor newCapturedTypeConstructor, UnwrappedType unwrappedType, Annotations annotations2, boolean z) {
        Intrinsics.checkParameterIsNotNull(captureStatus2, "captureStatus");
        Intrinsics.checkParameterIsNotNull(newCapturedTypeConstructor, "constructor");
        Intrinsics.checkParameterIsNotNull(annotations2, "annotations");
        this.captureStatus = captureStatus2;
        this.constructor = newCapturedTypeConstructor;
        this.lowerType = unwrappedType;
        this.annotations = annotations2;
        this.isMarkedNullable = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NewCapturedType(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r7, kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r8, kotlin.reflect.jvm.internal.impl.types.UnwrappedType r9, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 8
            if (r13 == 0) goto L_0x000a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion r10 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r10 = r10.getEMPTY()
        L_0x000a:
            r4 = r10
            r10 = r12 & 16
            if (r10 == 0) goto L_0x0012
            r11 = 0
            r5 = 0
            goto L_0x0013
        L_0x0012:
            r5 = r11
        L_0x0013:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType.<init>(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus, kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
