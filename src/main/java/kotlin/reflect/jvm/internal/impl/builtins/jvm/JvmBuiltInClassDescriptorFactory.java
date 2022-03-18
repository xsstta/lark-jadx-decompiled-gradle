package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.collections.am;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    public static final ClassId CLONEABLE_CLASS_ID;
    public static final Name CLONEABLE_NAME;
    public static final Companion Companion = new Companion(null);
    public static final FqName KOTLIN_FQ_NAME = KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME;
    private final NotNullLazyValue cloneable$delegate;
    public final Function1<ModuleDescriptor, DeclarationDescriptor> computeContainingDeclaration;
    public final ModuleDescriptor moduleDescriptor;

    private final ClassDescriptorImpl getCloneable() {
        return (ClassDescriptorImpl) StorageKt.getValue(this.cloneable$delegate, this, $$delegatedProperties[0]);
    }

    public static final class Companion {
        private Companion() {
        }

        public final ClassId getCLONEABLE_CLASS_ID() {
            return JvmBuiltInClassDescriptorFactory.CLONEABLE_CLASS_ID;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Name shortName = KotlinBuiltIns.FQ_NAMES.cloneable.shortName();
        Intrinsics.checkExpressionValueIsNotNull(shortName, "KotlinBuiltIns.FQ_NAMES.cloneable.shortName()");
        CLONEABLE_NAME = shortName;
        ClassId classId = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.cloneable.toSafe());
        Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(KotlinB…NAMES.cloneable.toSafe())");
        CLONEABLE_CLASS_ID = classId;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public ClassDescriptor createClass(ClassId classId) {
        Intrinsics.checkParameterIsNotNull(classId, "classId");
        if (Intrinsics.areEqual(classId, CLONEABLE_CLASS_ID)) {
            return getCloneable();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "packageFqName");
        if (Intrinsics.areEqual(fqName, KOTLIN_FQ_NAME)) {
            return am.m265686a(getCloneable());
        }
        return am.m265687a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(FqName fqName, Name name) {
        Intrinsics.checkParameterIsNotNull(fqName, "packageFqName");
        Intrinsics.checkParameterIsNotNull(name, "name");
        if (!Intrinsics.areEqual(name, CLONEABLE_NAME) || !Intrinsics.areEqual(fqName, KOTLIN_FQ_NAME)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, ? extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> */
    /* JADX WARN: Multi-variable type inference failed */
    public JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor2, Function1<? super ModuleDescriptor, ? extends DeclarationDescriptor> function1) {
        Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        Intrinsics.checkParameterIsNotNull(moduleDescriptor2, "moduleDescriptor");
        Intrinsics.checkParameterIsNotNull(function1, "computeContainingDeclaration");
        this.moduleDescriptor = moduleDescriptor2;
        this.computeContainingDeclaration = function1;
        this.cloneable$delegate = storageManager.createLazyValue(new JvmBuiltInClassDescriptorFactory$cloneable$2(this, storageManager));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor2, (i & 4) != 0 ? C691441.INSTANCE : function1);
    }
}
