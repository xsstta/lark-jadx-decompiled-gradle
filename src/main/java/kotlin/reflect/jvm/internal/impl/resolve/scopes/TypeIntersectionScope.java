package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class TypeIntersectionScope extends AbstractScopeAdapter {
    public static final Companion Companion = new Companion(null);
    private final ChainedMemberScope workerScope;

    @JvmStatic
    public static final MemberScope create(String str, Collection<? extends KotlinType> collection) {
        return Companion.create(str, collection);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final MemberScope create(String str, Collection<? extends KotlinType> collection) {
            Intrinsics.checkParameterIsNotNull(str, "message");
            Intrinsics.checkParameterIsNotNull(collection, "types");
            Collection<? extends KotlinType> collection2 = collection;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getMemberScope());
            }
            ChainedMemberScope chainedMemberScope = new ChainedMemberScope(str, arrayList);
            if (collection.size() <= 1) {
                return chainedMemberScope;
            }
            return new TypeIntersectionScope(chainedMemberScope, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    public ChainedMemberScope getWorkerScope() {
        return this.workerScope;
    }

    private TypeIntersectionScope(ChainedMemberScope chainedMemberScope) {
        this.workerScope = chainedMemberScope;
    }

    public /* synthetic */ TypeIntersectionScope(ChainedMemberScope chainedMemberScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(chainedMemberScope);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        return OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedFunctions(name, lookupLocation), TypeIntersectionScope$getContributedFunctions$1.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        return OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedVariables(name, lookupLocation), TypeIntersectionScope$getContributedVariables$1.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(descriptorKindFilter, "kindFilter");
        Intrinsics.checkParameterIsNotNull(function1, "nameFilter");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : super.getContributedDescriptors(descriptorKindFilter, function1)) {
            if (t instanceof CallableDescriptor) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        if (list != null) {
            return CollectionsKt.plus(OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list, TypeIntersectionScope$getContributedDescriptors$2.INSTANCE), (Iterable) list2);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
    }
}
