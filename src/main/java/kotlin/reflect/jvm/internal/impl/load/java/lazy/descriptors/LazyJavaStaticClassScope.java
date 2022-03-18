package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.am;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {
    private final JavaClass jClass;
    private final LazyJavaClassDescriptor ownerDescriptor;

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public LazyJavaClassDescriptor getOwnerDescriptor() {
        return this.ownerDescriptor;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.jClass, LazyJavaStaticClassScope$computeMemberIndex$1.INSTANCE);
    }

    private final PropertyDescriptor getRealOriginal(PropertyDescriptor propertyDescriptor) {
        CallableMemberDescriptor.Kind kind = propertyDescriptor.getKind();
        Intrinsics.checkExpressionValueIsNotNull(kind, "this.kind");
        if (kind.isReal()) {
            return propertyDescriptor;
        }
        Collection<? extends PropertyDescriptor> overriddenDescriptors = propertyDescriptor.getOverriddenDescriptors();
        Intrinsics.checkExpressionValueIsNotNull(overriddenDescriptors, "this.overriddenDescriptors");
        Collection<? extends PropertyDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (T t : collection) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            arrayList.add(getRealOriginal(t));
        }
        return (PropertyDescriptor) CollectionsKt.single(CollectionsKt.distinct(arrayList));
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<Name> computeClassNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(descriptorKindFilter, "kindFilter");
        return am.m265687a();
    }

    private final Set<SimpleFunctionDescriptor> getStaticFunctionsFromJavaSuperClasses(Name name, ClassDescriptor classDescriptor) {
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(classDescriptor);
        if (parentJavaStaticClassScope != null) {
            return CollectionsKt.toSet(parentJavaStaticClassScope.getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return am.m265687a();
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<Name> computePropertyNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(descriptorKindFilter, "kindFilter");
        Set<Name> mutableSet = CollectionsKt.toMutableSet(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).getFieldNames());
        flatMapJavaStaticSupertypesScopes(getOwnerDescriptor(), mutableSet, LazyJavaStaticClassScope$computePropertyNames$1$1.INSTANCE);
        return mutableSet;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<Name> computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Set<Name> set;
        Intrinsics.checkParameterIsNotNull(descriptorKindFilter, "kindFilter");
        Set<Name> mutableSet = CollectionsKt.toMutableSet(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).getMethodNames());
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(getOwnerDescriptor());
        if (parentJavaStaticClassScope != null) {
            set = parentJavaStaticClassScope.getFunctionNames();
        } else {
            set = null;
        }
        if (set == null) {
            set = am.m265687a();
        }
        mutableSet.addAll(set);
        if (this.jClass.isEnum()) {
            mutableSet.addAll(CollectionsKt.listOf((Object[]) new Name[]{DescriptorUtils.ENUM_VALUE_OF, DescriptorUtils.ENUM_VALUES}));
        }
        return mutableSet;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(Collection<SimpleFunctionDescriptor> collection, Name name) {
        Intrinsics.checkParameterIsNotNull(collection, "result");
        Intrinsics.checkParameterIsNotNull(name, "name");
        Collection<? extends SimpleFunctionDescriptor> resolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, getStaticFunctionsFromJavaSuperClasses(name, getOwnerDescriptor()), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkExpressionValueIsNotNull(resolveOverridesForStaticMembers, "resolveOverridesForStati….overridingUtil\n        )");
        collection.addAll(resolveOverridesForStaticMembers);
        if (!this.jClass.isEnum()) {
            return;
        }
        if (Intrinsics.areEqual(name, DescriptorUtils.ENUM_VALUE_OF)) {
            SimpleFunctionDescriptor createEnumValueOfMethod = DescriptorFactory.createEnumValueOfMethod(getOwnerDescriptor());
            Intrinsics.checkExpressionValueIsNotNull(createEnumValueOfMethod, "createEnumValueOfMethod(ownerDescriptor)");
            collection.add(createEnumValueOfMethod);
        } else if (Intrinsics.areEqual(name, DescriptorUtils.ENUM_VALUES)) {
            SimpleFunctionDescriptor createEnumValuesMethod = DescriptorFactory.createEnumValuesMethod(getOwnerDescriptor());
            Intrinsics.checkExpressionValueIsNotNull(createEnumValuesMethod, "createEnumValuesMethod(ownerDescriptor)");
            collection.add(createEnumValuesMethod);
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredProperties(Name name, Collection<PropertyDescriptor> collection) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(collection, "result");
        Set flatMapJavaStaticSupertypesScopes = flatMapJavaStaticSupertypesScopes(getOwnerDescriptor(), new LinkedHashSet(), new LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1(name));
        if (!collection.isEmpty()) {
            Collection<? extends PropertyDescriptor> resolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, flatMapJavaStaticSupertypesScopes, collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
            Intrinsics.checkExpressionValueIsNotNull(resolveOverridesForStaticMembers, "resolveOverridesForStati…ingUtil\n                )");
            collection.addAll(resolveOverridesForStaticMembers);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : flatMapJavaStaticSupertypesScopes) {
            PropertyDescriptor realOriginal = getRealOriginal((PropertyDescriptor) obj);
            Object obj2 = linkedHashMap.get(realOriginal);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(realOriginal, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            CollectionsKt.addAll(arrayList, DescriptorResolverUtils.resolveOverridesForStaticMembers(name, (Collection) entry.getValue(), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil()));
        }
        collection.addAll(arrayList);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(LazyJavaResolverContext lazyJavaResolverContext, JavaClass javaClass, LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(lazyJavaResolverContext);
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(javaClass, "jClass");
        Intrinsics.checkParameterIsNotNull(lazyJavaClassDescriptor, "ownerDescriptor");
        this.jClass = javaClass;
        this.ownerDescriptor = lazyJavaClassDescriptor;
    }

    private final <R> Set<R> flatMapJavaStaticSupertypesScopes(ClassDescriptor classDescriptor, Set<R> set, Function1<? super MemberScope, ? extends Collection<? extends R>> function1) {
        DFS.dfs(CollectionsKt.listOf(classDescriptor), LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1.INSTANCE, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(classDescriptor, set, function1));
        return set;
    }
}
