package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin._Assertions;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.am;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.platform.TargetPlatform;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.checker.Ref;

public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {
    private final KotlinBuiltIns builtIns;
    private final Map<ModuleDescriptor.Capability<?>, Object> capabilities;
    public ModuleDependencies dependencies;
    private boolean isValid;
    public PackageFragmentProvider packageFragmentProviderForModuleContent;
    private final Lazy packageFragmentProviderForWholeModuleWithDependencies$delegate;
    private final MemoizedFunctionToNotNull<FqName, PackageViewDescriptor> packages;
    private final TargetPlatform platform;
    private final Name stableName;
    public final StorageManager storageManager;

    public ModuleDescriptorImpl(Name name, StorageManager storageManager2, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform) {
        this(name, storageManager2, kotlinBuiltIns, targetPlatform, null, null, 48, null);
    }

    private final CompositePackageFragmentProvider getPackageFragmentProviderForWholeModuleWithDependencies() {
        return (CompositePackageFragmentProvider) this.packageFragmentProviderForWholeModuleWithDependencies$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public KotlinBuiltIns getBuiltIns() {
        return this.builtIns;
    }

    public boolean isValid() {
        return this.isValid;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return ModuleDescriptor.DefaultImpls.getContainingDeclaration(this);
    }

    public final boolean isInitialized() {
        if (this.packageFragmentProviderForModuleContent != null) {
            return true;
        }
        return false;
    }

    public final String getId() {
        String name = getName().toString();
        Intrinsics.checkExpressionValueIsNotNull(name, "name.toString()");
        return name;
    }

    public final PackageFragmentProvider getPackageFragmentProvider() {
        assertValid();
        return getPackageFragmentProviderForWholeModuleWithDependencies();
    }

    public void assertValid() {
        if (!isValid()) {
            throw new InvalidModuleException("Accessing invalid module descriptor " + this);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public List<ModuleDescriptor> getExpectedByModules() {
        ModuleDependencies moduleDependencies = this.dependencies;
        if (moduleDependencies != null) {
            return moduleDependencies.getExpectedByDependencies();
        }
        throw new AssertionError("Dependencies of module " + getId() + " were not set");
    }

    public final void setDependencies(List<ModuleDescriptorImpl> list) {
        Intrinsics.checkParameterIsNotNull(list, "descriptors");
        setDependencies(list, am.m265687a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public <T> T getCapability(ModuleDescriptor.Capability<T> capability) {
        Intrinsics.checkParameterIsNotNull(capability, "capability");
        T t = (T) this.capabilities.get(capability);
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public PackageViewDescriptor getPackage(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        assertValid();
        return this.packages.invoke(fqName);
    }

    public final void initialize(PackageFragmentProvider packageFragmentProvider) {
        Intrinsics.checkParameterIsNotNull(packageFragmentProvider, "providerForModuleContent");
        boolean z = !isInitialized();
        if (!_Assertions.f173221a || z) {
            this.packageFragmentProviderForModuleContent = packageFragmentProvider;
            return;
        }
        throw new AssertionError("Attempt to initialize module " + getId() + " twice");
    }

    public final void setDependencies(ModuleDependencies moduleDependencies) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(moduleDependencies, "dependencies");
        if (this.dependencies == null) {
            z = true;
        } else {
            z = false;
        }
        if (!_Assertions.f173221a || z) {
            this.dependencies = moduleDependencies;
            return;
        }
        throw new AssertionError("Dependencies of " + getId() + " were already set");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkParameterIsNotNull(moduleDescriptor, "targetModule");
        if (Intrinsics.areEqual(this, moduleDescriptor)) {
            return true;
        }
        ModuleDependencies moduleDependencies = this.dependencies;
        if (moduleDependencies == null) {
            Intrinsics.throwNpe();
        }
        if (!CollectionsKt.contains(moduleDependencies.getModulesWhoseInternalsAreVisible(), moduleDescriptor) && !getExpectedByModules().contains(moduleDescriptor) && !moduleDescriptor.getExpectedByModules().contains(this)) {
            return false;
        }
        return true;
    }

    public final void setDependencies(ModuleDescriptorImpl... moduleDescriptorImplArr) {
        Intrinsics.checkParameterIsNotNull(moduleDescriptorImplArr, "descriptors");
        setDependencies(C69043h.m265786k(moduleDescriptorImplArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        Intrinsics.checkParameterIsNotNull(declarationDescriptorVisitor, "visitor");
        return (R) ModuleDescriptor.DefaultImpls.accept(this, declarationDescriptorVisitor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public Collection<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        Intrinsics.checkParameterIsNotNull(function1, "nameFilter");
        assertValid();
        return getPackageFragmentProvider().getSubPackagesOf(fqName, function1);
    }

    public final void setDependencies(List<ModuleDescriptorImpl> list, Set<ModuleDescriptorImpl> set) {
        Intrinsics.checkParameterIsNotNull(list, "descriptors");
        Intrinsics.checkParameterIsNotNull(set, "friends");
        setDependencies(new ModuleDependenciesImpl(list, set, CollectionsKt.emptyList()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(Name name, StorageManager storageManager2, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform, Map<ModuleDescriptor.Capability<?>, ? extends Object> map, Name name2) {
        super(Annotations.Companion.getEMPTY(), name);
        Intrinsics.checkParameterIsNotNull(name, "moduleName");
        Intrinsics.checkParameterIsNotNull(storageManager2, "storageManager");
        Intrinsics.checkParameterIsNotNull(kotlinBuiltIns, "builtIns");
        Intrinsics.checkParameterIsNotNull(map, "capabilities");
        this.storageManager = storageManager2;
        this.builtIns = kotlinBuiltIns;
        this.platform = targetPlatform;
        this.stableName = name2;
        if (name.isSpecial()) {
            Map<ModuleDescriptor.Capability<?>, Object> mutableMap = MapsKt.toMutableMap(map);
            this.capabilities = mutableMap;
            mutableMap.put(KotlinTypeRefinerKt.getREFINER_CAPABILITY(), new Ref(null));
            this.isValid = true;
            this.packages = storageManager2.createMemoizedFunction(new ModuleDescriptorImpl$packages$1(this));
            this.packageFragmentProviderForWholeModuleWithDependencies$delegate = LazyKt.lazy(new ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + name);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ModuleDescriptorImpl(kotlin.reflect.jvm.internal.impl.name.Name r10, kotlin.reflect.jvm.internal.impl.storage.StorageManager r11, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r12, kotlin.reflect.jvm.internal.impl.platform.TargetPlatform r13, java.util.Map r14, kotlin.reflect.jvm.internal.impl.name.Name r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 8
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r0 = r1
            kotlin.reflect.jvm.internal.impl.platform.TargetPlatform r0 = (kotlin.reflect.jvm.internal.impl.platform.TargetPlatform) r0
            r6 = r0
            goto L_0x000b
        L_0x000a:
            r6 = r13
        L_0x000b:
            r0 = r16 & 16
            if (r0 == 0) goto L_0x0015
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r7 = r0
            goto L_0x0016
        L_0x0015:
            r7 = r14
        L_0x0016:
            r0 = r16 & 32
            if (r0 == 0) goto L_0x001f
            r0 = r1
            kotlin.reflect.jvm.internal.impl.name.Name r0 = (kotlin.reflect.jvm.internal.impl.name.Name) r0
            r8 = r0
            goto L_0x0020
        L_0x001f:
            r8 = r15
        L_0x0020:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl.<init>(kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.storage.StorageManager, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns, kotlin.reflect.jvm.internal.impl.platform.TargetPlatform, java.util.Map, kotlin.reflect.jvm.internal.impl.name.Name, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
