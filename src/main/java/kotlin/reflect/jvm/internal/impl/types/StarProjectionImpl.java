package kotlin.reflect.jvm.internal.impl.types;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public final class StarProjectionImpl extends TypeProjectionBase {
    private final Lazy _type$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new StarProjectionImpl$_type$2(this));
    public final TypeParameterDescriptor typeParameter;

    private final KotlinType get_type() {
        return (KotlinType) this._type$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean isStarProjection() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public Variance getProjectionKind() {
        return Variance.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public KotlinType getType() {
        return get_type();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public TypeProjection refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public StarProjectionImpl(TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.checkParameterIsNotNull(typeParameterDescriptor, "typeParameter");
        this.typeParameter = typeParameterDescriptor;
    }
}
