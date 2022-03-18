package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.am;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

public class DeserializedPackageMemberScope extends DeserializedMemberScope {
    private final PackageFragmentDescriptor packageDescriptor;
    private final FqName packageFqName;

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public void addEnumEntryDescriptors(Collection<DeclarationDescriptor> collection, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(collection, "result");
        Intrinsics.checkParameterIsNotNull(function1, "nameFilter");
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public Set<Name> getNonDeclaredFunctionNames() {
        return am.m265687a();
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public Set<Name> getNonDeclaredVariableNames() {
        return am.m265687a();
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public ClassId createClassId(Name name) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        return new ClassId(this.packageFqName, name);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasClass(kotlin.reflect.jvm.internal.impl.name.Name r6) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            boolean r0 = super.hasClass(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0045
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r0 = r5.getC()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r0 = r0.getComponents()
            java.lang.Iterable r0 = r0.getFictitiousClassDescriptorFactories()
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0028
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0028
        L_0x0026:
            r6 = 0
            goto L_0x0041
        L_0x0028:
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0026
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory r3 = (kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory) r3
            kotlin.reflect.jvm.internal.impl.name.FqName r4 = r5.packageFqName
            boolean r3 = r3.shouldCreateClass(r4, r6)
            if (r3 == 0) goto L_0x002c
            r6 = 1
        L_0x0041:
            if (r6 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope.hasClass(kotlin.reflect.jvm.internal.impl.name.Name):boolean");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        recordLookup(name, lookupLocation);
        return super.getContributedClassifier(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public void recordLookup(Name name, LookupLocation lookupLocation) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, this.packageDescriptor, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public List<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(descriptorKindFilter, "kindFilter");
        Intrinsics.checkParameterIsNotNull(function1, "nameFilter");
        Collection<DeclarationDescriptor> computeDescriptors = computeDescriptors(descriptorKindFilter, function1, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories = getC().getComponents().getFictitiousClassDescriptorFactories();
        ArrayList arrayList = new ArrayList();
        for (ClassDescriptorFactory classDescriptorFactory : fictitiousClassDescriptorFactories) {
            CollectionsKt.addAll(arrayList, classDescriptorFactory.getAllContributedClassesIfPossible(this.packageFqName));
        }
        return CollectionsKt.plus((Collection) computeDescriptors, (Iterable) arrayList);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DeserializedPackageMemberScope(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor r16, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r17, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r18, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion r19, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource r20, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r21, kotlin.jvm.functions.Function0<? extends java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name>> r22) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope.<init>(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents, kotlin.jvm.functions.Function0):void");
    }
}
