package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

public final class EmptyPackageFragmentDescriptor extends PackageFragmentDescriptorImpl {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public MemberScope.Empty getMemberScope() {
        return MemberScope.Empty.INSTANCE;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmptyPackageFragmentDescriptor(ModuleDescriptor moduleDescriptor, FqName fqName) {
        super(moduleDescriptor, fqName);
        Intrinsics.checkParameterIsNotNull(moduleDescriptor, "module");
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
    }
}
