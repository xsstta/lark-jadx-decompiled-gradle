package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

public class DelegatedTypeSubstitution extends TypeSubstitution {
    private final TypeSubstitution substitution;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateCapturedTypes() {
        return this.substitution.approximateCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.substitution.approximateContravariantCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return this.substitution.isEmpty();
    }

    public DelegatedTypeSubstitution(TypeSubstitution typeSubstitution) {
        Intrinsics.checkParameterIsNotNull(typeSubstitution, "substitution");
        this.substitution = typeSubstitution;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public Annotations filterAnnotations(Annotations annotations) {
        Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        return this.substitution.filterAnnotations(annotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public TypeProjection get(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "key");
        return this.substitution.get(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public KotlinType prepareTopLevelType(KotlinType kotlinType, Variance variance) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "topLevelType");
        Intrinsics.checkParameterIsNotNull(variance, "position");
        return this.substitution.prepareTopLevelType(kotlinType, variance);
    }
}
