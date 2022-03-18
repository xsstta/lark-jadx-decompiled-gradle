package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

public final class NewCapturedTypeConstructor implements CapturedTypeConstructor {
    private final Lazy _supertypes$delegate;
    private final NewCapturedTypeConstructor original;
    private final TypeProjection projection;
    public Function0<? extends List<? extends UnwrappedType>> supertypesComputation;
    private final TypeParameterDescriptor typeParameter;

    private final List<UnwrappedType> get_supertypes() {
        return (List) this._supertypes$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public ClassifierDescriptor getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
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
    public List<UnwrappedType> getSupertypes() {
        List<UnwrappedType> list = get_supertypes();
        if (list != null) {
            return list;
        }
        return CollectionsKt.emptyList();
    }

    public int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.original;
        if (newCapturedTypeConstructor != null) {
            return newCapturedTypeConstructor.hashCode();
        }
        return super.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinType type = getProjection().getType();
        Intrinsics.checkExpressionValueIsNotNull(type, "projection.type");
        return TypeUtilsKt.getBuiltIns(type);
    }

    public String toString() {
        return "CapturedType(" + getProjection() + ')';
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
            NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.original;
            if (newCapturedTypeConstructor2 == null) {
                newCapturedTypeConstructor2 = this;
            }
            NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.original;
            if (newCapturedTypeConstructor3 != null) {
                newCapturedTypeConstructor = newCapturedTypeConstructor3;
            }
            if (newCapturedTypeConstructor2 == newCapturedTypeConstructor) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
    }

    public final void initializeSupertypes(List<? extends UnwrappedType> list) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(list, "supertypes");
        if (this.supertypesComputation == null) {
            z = true;
        } else {
            z = false;
        }
        if (!_Assertions.f173221a || z) {
            this.supertypesComputation = new NewCapturedTypeConstructor$initializeSupertypes$2(list);
            return;
        }
        throw new AssertionError("Already initialized! oldValue = " + this.supertypesComputation + ", newValue = " + list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public NewCapturedTypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        NewCapturedTypeConstructor$refine$$inlined$let$lambda$1 newCapturedTypeConstructor$refine$$inlined$let$lambda$1;
        Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection refine = getProjection().refine(kotlinTypeRefiner);
        Intrinsics.checkExpressionValueIsNotNull(refine, "projection.refine(kotlinTypeRefiner)");
        if (this.supertypesComputation != null) {
            newCapturedTypeConstructor$refine$$inlined$let$lambda$1 = new NewCapturedTypeConstructor$refine$$inlined$let$lambda$1(this, kotlinTypeRefiner);
        } else {
            newCapturedTypeConstructor$refine$$inlined$let$lambda$1 = null;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.original;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(refine, newCapturedTypeConstructor$refine$$inlined$let$lambda$1, newCapturedTypeConstructor, this.typeParameter);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor(TypeProjection typeProjection, final List<? extends UnwrappedType> list, NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this(typeProjection, new Function0<List<? extends UnwrappedType>>() {
            /* class kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor.C692761 */

            /* Return type fixed from 'java.util.List<kotlin.reflect.jvm.internal.impl.types.UnwrappedType>' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public final List<? extends UnwrappedType> invoke() {
                return list;
            }
        }, newCapturedTypeConstructor, null, 8, null);
        Intrinsics.checkParameterIsNotNull(typeProjection, "projection");
        Intrinsics.checkParameterIsNotNull(list, "supertypes");
    }

    public NewCapturedTypeConstructor(TypeProjection typeProjection, Function0<? extends List<? extends UnwrappedType>> function0, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.checkParameterIsNotNull(typeProjection, "projection");
        this.projection = typeProjection;
        this.supertypesComputation = function0;
        this.original = newCapturedTypeConstructor;
        this.typeParameter = typeParameterDescriptor;
        this._supertypes$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new NewCapturedTypeConstructor$_supertypes$2(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, List list, NewCapturedTypeConstructor newCapturedTypeConstructor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, list, (i & 4) != 0 ? null : newCapturedTypeConstructor);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, Function0 function0, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : newCapturedTypeConstructor, (i & 8) != 0 ? null : typeParameterDescriptor);
    }
}
