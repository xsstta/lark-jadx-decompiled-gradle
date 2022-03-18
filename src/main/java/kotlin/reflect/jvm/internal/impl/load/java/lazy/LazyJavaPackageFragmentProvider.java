package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.List;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;

public final class LazyJavaPackageFragmentProvider implements PackageFragmentProvider {

    /* renamed from: c */
    public final LazyJavaResolverContext f173265c;
    private final CacheWithNotNullValues<FqName, LazyJavaPackageFragment> packageFragments;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public List<LazyJavaPackageFragment> getPackageFragments(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return CollectionsKt.listOfNotNull(getPackageFragment(fqName));
    }

    public LazyJavaPackageFragmentProvider(JavaResolverComponents javaResolverComponents) {
        Intrinsics.checkParameterIsNotNull(javaResolverComponents, "components");
        LazyJavaResolverContext lazyJavaResolverContext = new LazyJavaResolverContext(javaResolverComponents, TypeParameterResolver.EMPTY.INSTANCE, LazyKt.lazyOf(null));
        this.f173265c = lazyJavaResolverContext;
        this.packageFragments = lazyJavaResolverContext.getStorageManager().createCacheWithNotNullValues();
    }

    private final LazyJavaPackageFragment getPackageFragment(FqName fqName) {
        JavaPackage findPackage = this.f173265c.getComponents().getFinder().findPackage(fqName);
        if (findPackage != null) {
            return this.packageFragments.computeIfAbsent(fqName, new LazyJavaPackageFragmentProvider$getPackageFragment$1(this, findPackage));
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public List<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1) {
        List<FqName> list;
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        Intrinsics.checkParameterIsNotNull(function1, "nameFilter");
        LazyJavaPackageFragment packageFragment = getPackageFragment(fqName);
        if (packageFragment != null) {
            list = packageFragment.getSubPackageFqNames$descriptors_jvm();
        } else {
            list = null;
        }
        if (list != null) {
            return list;
        }
        return CollectionsKt.emptyList();
    }
}
