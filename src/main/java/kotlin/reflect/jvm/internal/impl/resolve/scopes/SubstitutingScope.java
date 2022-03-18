package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

public final class SubstitutingScope implements MemberScope {
    private final Lazy _allDescriptors$delegate = LazyKt.lazy(new SubstitutingScope$_allDescriptors$2(this));
    private Map<DeclarationDescriptor, DeclarationDescriptor> substitutedDescriptors;
    private final TypeSubstitutor substitutor;
    public final MemberScope workerScope;

    private final Collection<DeclarationDescriptor> get_allDescriptors() {
        return (Collection) this._allDescriptors$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return this.workerScope.getVariableNames();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Collection<? extends D extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends DeclarationDescriptor> Collection<D> substitute(Collection<? extends D> collection) {
        if (this.substitutor.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet newLinkedHashSetWithExpectedSize = CollectionsKt.newLinkedHashSetWithExpectedSize(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            newLinkedHashSetWithExpectedSize.add(substitute((DeclarationDescriptor) it.next()));
        }
        return newLinkedHashSetWithExpectedSize;
    }

    private final <D extends DeclarationDescriptor> D substitute(D d) {
        if (this.substitutor.isEmpty()) {
            return d;
        }
        if (this.substitutedDescriptors == null) {
            this.substitutedDescriptors = new HashMap();
        }
        Map<DeclarationDescriptor, DeclarationDescriptor> map = this.substitutedDescriptors;
        if (map == null) {
            Intrinsics.throwNpe();
        }
        DeclarationDescriptorNonRoot declarationDescriptorNonRoot = map.get(d);
        if (declarationDescriptorNonRoot == null) {
            if (d instanceof Substitutable) {
                DeclarationDescriptorNonRoot substitute = ((Substitutable) d).substitute(this.substitutor);
                if (substitute != null) {
                    declarationDescriptorNonRoot = substitute;
                    map.put(d, declarationDescriptorNonRoot);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, " + "but " + d + " substitution fails");
                }
            } else {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d).toString());
            }
        }
        D d2 = (D) declarationDescriptorNonRoot;
        if (d2 != null) {
            return d2;
        }
        throw new TypeCastException("null cannot be cast to non-null type D");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(descriptorKindFilter, "kindFilter");
        Intrinsics.checkParameterIsNotNull(function1, "nameFilter");
        return get_allDescriptors();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        ClassifierDescriptor contributedClassifier = this.workerScope.getContributedClassifier(name, lookupLocation);
        if (contributedClassifier != null) {
            return (ClassifierDescriptor) substitute(contributedClassifier);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        return substitute(this.workerScope.getContributedFunctions(name, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        return substitute(this.workerScope.getContributedVariables(name, lookupLocation));
    }

    public SubstitutingScope(MemberScope memberScope, TypeSubstitutor typeSubstitutor) {
        Intrinsics.checkParameterIsNotNull(memberScope, "workerScope");
        Intrinsics.checkParameterIsNotNull(typeSubstitutor, "givenSubstitutor");
        this.workerScope = memberScope;
        TypeSubstitution substitution = typeSubstitutor.getSubstitution();
        Intrinsics.checkExpressionValueIsNotNull(substitution, "givenSubstitutor.substitution");
        this.substitutor = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(substitution, false, 1, null).buildSubstitutor();
    }
}
