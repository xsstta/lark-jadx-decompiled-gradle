package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.C69294l;

public final class PackageFragmentProviderImpl implements PackageFragmentProvider {
    private final Collection<PackageFragmentDescriptor> packageFragments;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> */
    /* JADX WARN: Multi-variable type inference failed */
    public PackageFragmentProviderImpl(Collection<? extends PackageFragmentDescriptor> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "packageFragments");
        this.packageFragments = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public List<PackageFragmentDescriptor> getPackageFragments(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        for (T t : this.packageFragments) {
            if (Intrinsics.areEqual(t.getFqName(), fqName)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public Collection<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        Intrinsics.checkParameterIsNotNull(function1, "nameFilter");
        return C69294l.m266144h(C69294l.m266131a(C69294l.m266140e(CollectionsKt.asSequence(this.packageFragments), PackageFragmentProviderImpl$getSubPackagesOf$1.INSTANCE), (Function1) new PackageFragmentProviderImpl$getSubPackagesOf$2(fqName)));
    }
}
