package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;

/* access modifiers changed from: package-private */
public final class ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2 extends Lambda implements Function0<CompositePackageFragmentProvider> {
    final /* synthetic */ ModuleDescriptorImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2(ModuleDescriptorImpl moduleDescriptorImpl) {
        super(0);
        this.this$0 = moduleDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CompositePackageFragmentProvider invoke() {
        ModuleDependencies moduleDependencies = this.this$0.dependencies;
        if (moduleDependencies != null) {
            List<ModuleDescriptorImpl> allDependencies = moduleDependencies.getAllDependencies();
            boolean contains = allDependencies.contains(this.this$0);
            if (!_Assertions.f173221a || contains) {
                List<ModuleDescriptorImpl> list = allDependencies;
                for (T t : list) {
                    boolean isInitialized = t.isInitialized();
                    if (_Assertions.f173221a && !isInitialized) {
                        throw new AssertionError("Dependency module " + t.getId() + " was not initialized by the time contents of dependent module " + this.this$0.getId() + " were queried");
                    }
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    PackageFragmentProvider packageFragmentProvider = it.next().packageFragmentProviderForModuleContent;
                    if (packageFragmentProvider == null) {
                        Intrinsics.throwNpe();
                    }
                    arrayList.add(packageFragmentProvider);
                }
                return new CompositePackageFragmentProvider(arrayList);
            }
            throw new AssertionError("Module " + this.this$0.getId() + " is not contained in his own dependencies, this is probably a misconfiguration");
        }
        throw new AssertionError("Dependencies of module " + this.this$0.getId() + " were not set before querying module content");
    }
}
