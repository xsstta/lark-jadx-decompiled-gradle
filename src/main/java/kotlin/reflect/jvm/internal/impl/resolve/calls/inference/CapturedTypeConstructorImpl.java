package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Collection;
import java.util.List;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;

public final class CapturedTypeConstructorImpl implements CapturedTypeConstructor {
    private NewCapturedTypeConstructor newTypeConstructor;
    private final TypeProjection projection;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Void getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public final NewCapturedTypeConstructor getNewTypeConstructor() {
        return this.newTypeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public TypeProjection getProjection() {
        return this.projection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = getProjection().getType().getConstructor().getBuiltIns();
        Intrinsics.checkExpressionValueIsNotNull(builtIns, "projection.type.constructor.builtIns");
        return builtIns;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + getProjection() + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> getSupertypes() {
        SimpleType simpleType;
        if (getProjection().getProjectionKind() == Variance.OUT_VARIANCE) {
            simpleType = getProjection().getType();
        } else {
            simpleType = getBuiltIns().getNullableAnyType();
        }
        Intrinsics.checkExpressionValueIsNotNull(simpleType, "if (projection.projectio… builtIns.nullableAnyType");
        return CollectionsKt.listOf(simpleType);
    }

    public final void setNewTypeConstructor(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.newTypeConstructor = newCapturedTypeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public CapturedTypeConstructorImpl refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection refine = getProjection().refine(kotlinTypeRefiner);
        Intrinsics.checkExpressionValueIsNotNull(refine, "projection.refine(kotlinTypeRefiner)");
        return new CapturedTypeConstructorImpl(refine);
    }

    public CapturedTypeConstructorImpl(TypeProjection typeProjection) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(typeProjection, "projection");
        this.projection = typeProjection;
        if (getProjection().getProjectionKind() != Variance.INVARIANT) {
            z = true;
        } else {
            z = false;
        }
        if (_Assertions.f173221a && !z) {
            throw new AssertionError("Only nontrivial projections can be captured, not: " + getProjection());
        }
    }
}
