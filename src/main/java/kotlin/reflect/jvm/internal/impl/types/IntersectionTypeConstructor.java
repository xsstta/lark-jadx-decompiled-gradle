package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public final class IntersectionTypeConstructor implements TypeConstructor {
    private final int hashCode;
    private final LinkedHashSet<KotlinType> intersectedTypes;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public ClassifierDescriptor getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public int hashCode() {
        return this.hashCode;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> getSupertypes() {
        return this.intersectedTypes;
    }

    public String toString() {
        return makeDebugNameForIntersectionType(this.intersectedTypes);
    }

    public final MemberScope createScopeForKotlinType() {
        TypeIntersectionScope.Companion companion = TypeIntersectionScope.Companion;
        return companion.create("member scope for intersection type " + this, this.intersectedTypes);
    }

    public final SimpleType createType() {
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(Annotations.Companion.getEMPTY(), this, CollectionsKt.emptyList(), false, createScopeForKotlinType(), new IntersectionTypeConstructor$createType$1(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = this.intersectedTypes.iterator().next().getConstructor().getBuiltIns();
        Intrinsics.checkExpressionValueIsNotNull(builtIns, "intersectedTypes.iterato…xt().constructor.builtIns");
        return builtIns;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntersectionTypeConstructor)) {
            return false;
        }
        return Intrinsics.areEqual(this.intersectedTypes, ((IntersectionTypeConstructor) obj).intersectedTypes);
    }

    public IntersectionTypeConstructor(Collection<? extends KotlinType> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "typesToIntersect");
        boolean z = !collection.isEmpty();
        if (!_Assertions.f173221a || z) {
            LinkedHashSet<KotlinType> linkedHashSet = new LinkedHashSet<>(collection);
            this.intersectedTypes = linkedHashSet;
            this.hashCode = linkedHashSet.hashCode();
            return;
        }
        throw new AssertionError("Attempt to create an empty intersection");
    }

    private final String makeDebugNameForIntersectionType(Iterable<? extends KotlinType> iterable) {
        return CollectionsKt.joinToString$default(CollectionsKt.sortedWith(iterable, new IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1()), " & ", "{", "}", 0, null, null, 56, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public IntersectionTypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
        LinkedHashSet<KotlinType> linkedHashSet = this.intersectedTypes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedHashSet, 10));
        Iterator<T> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().refine(kotlinTypeRefiner));
        }
        return new IntersectionTypeConstructor(arrayList);
    }
}
