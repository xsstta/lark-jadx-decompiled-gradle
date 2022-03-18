package kotlin.reflect.jvm.internal.impl.types;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public abstract class AbstractTypeConstructor implements TypeConstructor {
    private final NotNullLazyValue<Supertypes> supertypes;

    /* access modifiers changed from: protected */
    public abstract Collection<KotlinType> computeSupertypes();

    /* access modifiers changed from: protected */
    public KotlinType defaultSupertypeIfEmpty() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public abstract ClassifierDescriptor getDeclarationDescriptor();

    /* access modifiers changed from: protected */
    public abstract SupertypeLoopChecker getSupertypeLoopChecker();

    /* access modifiers changed from: protected */
    public void reportScopesLoopError(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, ShareHitPoint.f121869d);
    }

    /* access modifiers changed from: protected */
    public void reportSupertypeLoopError(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, ShareHitPoint.f121869d);
    }

    /* access modifiers changed from: private */
    public static final class Supertypes {
        private final Collection<KotlinType> allSupertypes;
        private List<? extends KotlinType> supertypesWithoutCycles = CollectionsKt.listOf(ErrorUtils.ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES);

        public final Collection<KotlinType> getAllSupertypes() {
            return this.allSupertypes;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType>, java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> */
        public final List<KotlinType> getSupertypesWithoutCycles() {
            return this.supertypesWithoutCycles;
        }

        public final void setSupertypesWithoutCycles(List<? extends KotlinType> list) {
            Intrinsics.checkParameterIsNotNull(list, "<set-?>");
            this.supertypesWithoutCycles = list;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> */
        /* JADX WARN: Multi-variable type inference failed */
        public Supertypes(Collection<? extends KotlinType> collection) {
            Intrinsics.checkParameterIsNotNull(collection, "allSupertypes");
            this.allSupertypes = collection;
        }
    }

    /* access modifiers changed from: private */
    public final class ModuleViewTypeConstructor implements TypeConstructor {
        public final KotlinTypeRefiner kotlinTypeRefiner;
        private final Lazy refinedSupertypes$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new AbstractTypeConstructor$ModuleViewTypeConstructor$refinedSupertypes$2(this));
        final /* synthetic */ AbstractTypeConstructor this$0;

        private final List<KotlinType> getRefinedSupertypes() {
            return (List) this.refinedSupertypes$delegate.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public ClassifierDescriptor getDeclarationDescriptor() {
            return this.this$0.getDeclarationDescriptor();
        }

        public int hashCode() {
            return this.this$0.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return this.this$0.isDenotable();
        }

        public String toString() {
            return this.this$0.toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = this.this$0.getBuiltIns();
            Intrinsics.checkExpressionValueIsNotNull(builtIns, "this@AbstractTypeConstructor.builtIns");
            return builtIns;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> parameters = this.this$0.getParameters();
            Intrinsics.checkExpressionValueIsNotNull(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<KotlinType> getSupertypes() {
            return getRefinedSupertypes();
        }

        public boolean equals(Object obj) {
            return this.this$0.equals(obj);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner2) {
            Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner2, "kotlinTypeRefiner");
            return this.this$0.refine(kotlinTypeRefiner2);
        }

        public ModuleViewTypeConstructor(AbstractTypeConstructor abstractTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner2) {
            Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner2, "kotlinTypeRefiner");
            this.this$0 = abstractTypeConstructor;
            this.kotlinTypeRefiner = kotlinTypeRefiner2;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<KotlinType> getSupertypes() {
        return ((Supertypes) this.supertypes.invoke()).getSupertypesWithoutCycles();
    }

    /* access modifiers changed from: protected */
    public Collection<KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new ModuleViewTypeConstructor(this, kotlinTypeRefiner);
    }

    public AbstractTypeConstructor(StorageManager storageManager) {
        Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        this.supertypes = storageManager.createLazyValueWithPostCompute(new AbstractTypeConstructor$supertypes$1(this), AbstractTypeConstructor$supertypes$2.INSTANCE, new AbstractTypeConstructor$supertypes$3(this));
    }

    public final Collection<KotlinType> computeNeighbours(TypeConstructor typeConstructor, boolean z) {
        TypeConstructor typeConstructor2;
        List plus;
        if (!(typeConstructor instanceof AbstractTypeConstructor)) {
            typeConstructor2 = null;
        } else {
            typeConstructor2 = typeConstructor;
        }
        AbstractTypeConstructor abstractTypeConstructor = (AbstractTypeConstructor) typeConstructor2;
        if (abstractTypeConstructor != null && (plus = CollectionsKt.plus((Collection) ((Supertypes) abstractTypeConstructor.supertypes.invoke()).getAllSupertypes(), (Iterable) abstractTypeConstructor.getAdditionalNeighboursInSupertypeGraph(z))) != null) {
            return plus;
        }
        Collection<KotlinType> supertypes2 = typeConstructor.getSupertypes();
        Intrinsics.checkExpressionValueIsNotNull(supertypes2, "supertypes");
        return supertypes2;
    }
}
