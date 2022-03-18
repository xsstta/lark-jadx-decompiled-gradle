package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

public final class JvmBuiltIns extends KotlinBuiltIns {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltIns.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSettings;"))};
    public boolean isAdditionalBuiltInsFeatureSupported = true;
    public ModuleDescriptor ownerModuleDescriptor;
    private final NotNullLazyValue settings$delegate;

    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Kind.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            iArr[Kind.FALLBACK.ordinal()] = 3;
        }
    }

    public final JvmBuiltInsSettings getSettings() {
        return (JvmBuiltInsSettings) StorageKt.getValue(this.settings$delegate, this, $$delegatedProperties[0]);
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return getSettings();
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return getSettings();
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public List<ClassDescriptorFactory> getClassDescriptorFactories() {
        Iterable<ClassDescriptorFactory> classDescriptorFactories = super.getClassDescriptorFactories();
        Intrinsics.checkExpressionValueIsNotNull(classDescriptorFactories, "super.getClassDescriptorFactories()");
        StorageManager storageManager = getStorageManager();
        Intrinsics.checkExpressionValueIsNotNull(storageManager, "storageManager");
        ModuleDescriptorImpl builtInsModule = getBuiltInsModule();
        Intrinsics.checkExpressionValueIsNotNull(builtInsModule, "builtInsModule");
        return CollectionsKt.plus(classDescriptorFactories, new JvmBuiltInClassDescriptorFactory(storageManager, builtInsModule, null, 4, null));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(StorageManager storageManager, Kind kind) {
        super(storageManager);
        Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        Intrinsics.checkParameterIsNotNull(kind, "kind");
        this.settings$delegate = storageManager.createLazyValue(new JvmBuiltIns$settings$2(this, storageManager));
        int i = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i == 2) {
            createBuiltInsModule(false);
        } else if (i == 3) {
            createBuiltInsModule(true);
        }
    }

    public final void initialize(ModuleDescriptor moduleDescriptor, boolean z) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(moduleDescriptor, "moduleDescriptor");
        if (this.ownerModuleDescriptor == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!_Assertions.f173221a || z2) {
            this.ownerModuleDescriptor = moduleDescriptor;
            this.isAdditionalBuiltInsFeatureSupported = z;
            return;
        }
        throw new AssertionError("JvmBuiltins repeated initialization");
    }
}
