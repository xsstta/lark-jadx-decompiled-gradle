package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class ModuleDependenciesImpl implements ModuleDependencies {
    private final List<ModuleDescriptorImpl> allDependencies;
    private final List<ModuleDescriptorImpl> expectedByDependencies;
    private final Set<ModuleDescriptorImpl> modulesWhoseInternalsAreVisible;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public List<ModuleDescriptorImpl> getAllDependencies() {
        return this.allDependencies;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public List<ModuleDescriptorImpl> getExpectedByDependencies() {
        return this.expectedByDependencies;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public Set<ModuleDescriptorImpl> getModulesWhoseInternalsAreVisible() {
        return this.modulesWhoseInternalsAreVisible;
    }

    public ModuleDependenciesImpl(List<ModuleDescriptorImpl> list, Set<ModuleDescriptorImpl> set, List<ModuleDescriptorImpl> list2) {
        Intrinsics.checkParameterIsNotNull(list, "allDependencies");
        Intrinsics.checkParameterIsNotNull(set, "modulesWhoseInternalsAreVisible");
        Intrinsics.checkParameterIsNotNull(list2, "expectedByDependencies");
        this.allDependencies = list;
        this.modulesWhoseInternalsAreVisible = set;
        this.expectedByDependencies = list2;
    }
}
