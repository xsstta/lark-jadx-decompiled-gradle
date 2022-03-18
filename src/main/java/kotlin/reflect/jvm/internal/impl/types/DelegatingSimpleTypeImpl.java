package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

public abstract class DelegatingSimpleTypeImpl extends DelegatingSimpleType {
    private final SimpleType delegate;

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public SimpleType getDelegate() {
        return this.delegate;
    }

    public DelegatingSimpleTypeImpl(SimpleType simpleType) {
        Intrinsics.checkParameterIsNotNull(simpleType, "delegate");
        this.delegate = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.SimpleType
    public SimpleType makeNullableAsSpecified(boolean z) {
        if (z == isMarkedNullable()) {
            return this;
        }
        return getDelegate().makeNullableAsSpecified(z).replaceAnnotations(getAnnotations());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.SimpleType
    public DelegatingSimpleTypeImpl replaceAnnotations(Annotations annotations) {
        Intrinsics.checkParameterIsNotNull(annotations, "newAnnotations");
        if (annotations != getAnnotations()) {
            return new AnnotatedSimpleType(this, annotations);
        }
        return this;
    }
}
