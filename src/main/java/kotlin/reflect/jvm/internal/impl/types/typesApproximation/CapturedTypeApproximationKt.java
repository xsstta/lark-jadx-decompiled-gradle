package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;

public final class CapturedTypeApproximationKt {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Variance.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            int[] iArr2 = new int[Variance.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[Variance.IN_VARIANCE.ordinal()] = 1;
            iArr2[Variance.OUT_VARIANCE.ordinal()] = 2;
        }
    }

    private static final TypeProjection substituteCapturedTypesWithProjections(TypeProjection typeProjection) {
        TypeSubstitutor create = TypeSubstitutor.create(new CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1());
        Intrinsics.checkExpressionValueIsNotNull(create, "TypeSubstitutor.create(o…ojection\n        }\n    })");
        return create.substituteWithoutApproximation(typeProjection);
    }

    private static final ApproximationBounds<TypeArgument> approximateProjection(TypeArgument typeArgument) {
        ApproximationBounds<KotlinType> approximateCapturedTypes = approximateCapturedTypes(typeArgument.getInProjection());
        ApproximationBounds<KotlinType> approximateCapturedTypes2 = approximateCapturedTypes(typeArgument.getOutProjection());
        return new ApproximationBounds<>(new TypeArgument(typeArgument.getTypeParameter(), approximateCapturedTypes.component2(), approximateCapturedTypes2.component1()), new TypeArgument(typeArgument.getTypeParameter(), approximateCapturedTypes.component1(), approximateCapturedTypes2.component2()));
    }

    private static final TypeProjection toTypeProjection(TypeArgument typeArgument) {
        boolean isConsistent = typeArgument.isConsistent();
        if (!_Assertions.f173221a || isConsistent) {
            CapturedTypeApproximationKt$toTypeProjection$2 capturedTypeApproximationKt$toTypeProjection$2 = new CapturedTypeApproximationKt$toTypeProjection$2(typeArgument);
            if (Intrinsics.areEqual(typeArgument.getInProjection(), typeArgument.getOutProjection())) {
                return new TypeProjectionImpl(typeArgument.getInProjection());
            }
            if (KotlinBuiltIns.isNothing(typeArgument.getInProjection()) && typeArgument.getTypeParameter().getVariance() != Variance.IN_VARIANCE) {
                return new TypeProjectionImpl(capturedTypeApproximationKt$toTypeProjection$2.invoke(Variance.OUT_VARIANCE), typeArgument.getOutProjection());
            }
            if (KotlinBuiltIns.isNullableAny(typeArgument.getOutProjection())) {
                return new TypeProjectionImpl(capturedTypeApproximationKt$toTypeProjection$2.invoke(Variance.IN_VARIANCE), typeArgument.getInProjection());
            }
            return new TypeProjectionImpl(capturedTypeApproximationKt$toTypeProjection$2.invoke(Variance.OUT_VARIANCE), typeArgument.getOutProjection());
        }
        DescriptorRenderer withOptions = DescriptorRenderer.Companion.withOptions(CapturedTypeApproximationKt$toTypeProjection$1$descriptorRenderer$1.INSTANCE);
        throw new AssertionError("Only consistent enhanced type projection can be converted to type projection, but " + '[' + withOptions.render(typeArgument.getTypeParameter()) + ": <" + withOptions.renderType(typeArgument.getInProjection()) + ", " + withOptions.renderType(typeArgument.getOutProjection()) + ">]" + " was found");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.KotlinType> approximateCapturedTypes(kotlin.reflect.jvm.internal.impl.types.KotlinType r8) {
        /*
        // Method dump skipped, instructions count: 440
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.approximateCapturedTypes(kotlin.reflect.jvm.internal.impl.types.KotlinType):kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds");
    }

    public static final TypeProjection approximateCapturedTypesIfNecessary(TypeProjection typeProjection, boolean z) {
        if (typeProjection == null) {
            return null;
        }
        if (typeProjection.isStarProjection()) {
            return typeProjection;
        }
        KotlinType type = typeProjection.getType();
        Intrinsics.checkExpressionValueIsNotNull(type, "typeProjection.type");
        if (!TypeUtils.contains(type, CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1.INSTANCE)) {
            return typeProjection;
        }
        Variance projectionKind = typeProjection.getProjectionKind();
        Intrinsics.checkExpressionValueIsNotNull(projectionKind, "typeProjection.projectionKind");
        if (projectionKind == Variance.OUT_VARIANCE) {
            return new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getUpper());
        }
        if (z) {
            return new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getLower());
        }
        return substituteCapturedTypesWithProjections(typeProjection);
    }

    private static final KotlinType replaceTypeArguments(KotlinType kotlinType, List<TypeArgument> list) {
        boolean z;
        if (kotlinType.getArguments().size() == list.size()) {
            z = true;
        } else {
            z = false;
        }
        if (!_Assertions.f173221a || z) {
            List<TypeArgument> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(toTypeProjection(it.next()));
            }
            return TypeSubstitutionKt.replace$default(kotlinType, arrayList, (Annotations) null, 2, (Object) null);
        }
        throw new AssertionError("Incorrect type arguments " + list);
    }

    private static final TypeArgument toTypeArgument(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        int i = WhenMappings.$EnumSwitchMapping$0[TypeSubstitutor.combine(typeParameterDescriptor.getVariance(), typeProjection).ordinal()];
        if (i == 1) {
            KotlinType type = typeProjection.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, ShareHitPoint.f121869d);
            KotlinType type2 = typeProjection.getType();
            Intrinsics.checkExpressionValueIsNotNull(type2, ShareHitPoint.f121869d);
            return new TypeArgument(typeParameterDescriptor, type, type2);
        } else if (i == 2) {
            KotlinType type3 = typeProjection.getType();
            Intrinsics.checkExpressionValueIsNotNull(type3, ShareHitPoint.f121869d);
            SimpleType nullableAnyType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType();
            Intrinsics.checkExpressionValueIsNotNull(nullableAnyType, "typeParameter.builtIns.nullableAnyType");
            return new TypeArgument(typeParameterDescriptor, type3, nullableAnyType);
        } else if (i == 3) {
            SimpleType nothingType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType();
            Intrinsics.checkExpressionValueIsNotNull(nothingType, "typeParameter.builtIns.nothingType");
            KotlinType type4 = typeProjection.getType();
            Intrinsics.checkExpressionValueIsNotNull(type4, ShareHitPoint.f121869d);
            return new TypeArgument(typeParameterDescriptor, nothingType, type4);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
