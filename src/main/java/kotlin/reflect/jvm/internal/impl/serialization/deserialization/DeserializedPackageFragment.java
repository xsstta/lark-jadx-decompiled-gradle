package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

public abstract class DeserializedPackageFragment extends PackageFragmentDescriptorImpl {
    private final StorageManager storageManager;

    public abstract ClassDataFinder getClassDataFinder();

    public abstract void initialize(DeserializationComponents deserializationComponents);

    public boolean hasTopLevelClass(Name name) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        MemberScope memberScope = getMemberScope();
        if (!(memberScope instanceof DeserializedMemberScope) || !((DeserializedMemberScope) memberScope).getClassNames$deserialization().contains(name)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragment(FqName fqName, StorageManager storageManager2, ModuleDescriptor moduleDescriptor) {
        super(moduleDescriptor, fqName);
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        Intrinsics.checkParameterIsNotNull(storageManager2, "storageManager");
        Intrinsics.checkParameterIsNotNull(moduleDescriptor, "module");
        this.storageManager = storageManager2;
    }
}
