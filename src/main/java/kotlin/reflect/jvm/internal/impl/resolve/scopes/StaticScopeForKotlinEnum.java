package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.List;
import kotlin._Assertions;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

public final class StaticScopeForKotlinEnum extends MemberScopeImpl {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;"))};
    public final ClassDescriptor containingClass;
    private final NotNullLazyValue functions$delegate;

    private final List<SimpleFunctionDescriptor> getFunctions() {
        return (List) StorageKt.getValue(this.functions$delegate, this, $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Void getContributedClassifier(Name name, LookupLocation lookupLocation) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public List<SimpleFunctionDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(descriptorKindFilter, "kindFilter");
        Intrinsics.checkParameterIsNotNull(function1, "nameFilter");
        return getFunctions();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ArrayList<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        ArrayList<SimpleFunctionDescriptor> arrayList = new ArrayList<>(1);
        for (T t : getFunctions()) {
            if (Intrinsics.areEqual(t.getName(), name)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public StaticScopeForKotlinEnum(StorageManager storageManager, ClassDescriptor classDescriptor) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        Intrinsics.checkParameterIsNotNull(classDescriptor, "containingClass");
        this.containingClass = classDescriptor;
        if (classDescriptor.getKind() == ClassKind.ENUM_CLASS) {
            z = true;
        } else {
            z = false;
        }
        if (!_Assertions.f173221a || z) {
            this.functions$delegate = storageManager.createLazyValue(new StaticScopeForKotlinEnum$functions$2(this));
            return;
        }
        throw new AssertionError("Class should be an enum: " + classDescriptor);
    }
}
