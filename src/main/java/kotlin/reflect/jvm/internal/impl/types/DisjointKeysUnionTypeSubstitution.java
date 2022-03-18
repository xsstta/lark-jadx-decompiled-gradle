package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

public final class DisjointKeysUnionTypeSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion(null);
    private final TypeSubstitution first;
    private final TypeSubstitution second;

    @JvmStatic
    public static final TypeSubstitution create(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        return Companion.create(typeSubstitution, typeSubstitution2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final TypeSubstitution create(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
            Intrinsics.checkParameterIsNotNull(typeSubstitution, "first");
            Intrinsics.checkParameterIsNotNull(typeSubstitution2, "second");
            if (typeSubstitution.isEmpty()) {
                return typeSubstitution2;
            }
            if (typeSubstitution2.isEmpty()) {
                return typeSubstitution;
            }
            return new DisjointKeysUnionTypeSubstitution(typeSubstitution, typeSubstitution2, null);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateCapturedTypes() {
        if (this.first.approximateCapturedTypes() || this.second.approximateCapturedTypes()) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        if (this.first.approximateContravariantCapturedTypes() || this.second.approximateContravariantCapturedTypes()) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public Annotations filterAnnotations(Annotations annotations) {
        Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        return this.second.filterAnnotations(this.first.filterAnnotations(annotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public TypeProjection get(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "key");
        TypeProjection typeProjection = this.first.get(kotlinType);
        if (typeProjection != null) {
            return typeProjection;
        }
        return this.second.get(kotlinType);
    }

    private DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        this.first = typeSubstitution;
        this.second = typeSubstitution2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public KotlinType prepareTopLevelType(KotlinType kotlinType, Variance variance) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "topLevelType");
        Intrinsics.checkParameterIsNotNull(variance, "position");
        return this.second.prepareTopLevelType(this.first.prepareTopLevelType(kotlinType, variance), variance);
    }

    public /* synthetic */ DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeSubstitution, typeSubstitution2);
    }
}
