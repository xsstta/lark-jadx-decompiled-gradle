package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* access modifiers changed from: package-private */
public final class JvmBuiltIns$settings$2 extends Lambda implements Function0<JvmBuiltInsSettings> {
    final /* synthetic */ StorageManager $storageManager;
    final /* synthetic */ JvmBuiltIns this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    JvmBuiltIns$settings$2(JvmBuiltIns jvmBuiltIns, StorageManager storageManager) {
        super(0);
        this.this$0 = jvmBuiltIns;
        this.$storageManager = storageManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final JvmBuiltInsSettings invoke() {
        ModuleDescriptorImpl builtInsModule = this.this$0.getBuiltInsModule();
        Intrinsics.checkExpressionValueIsNotNull(builtInsModule, "builtInsModule");
        return new JvmBuiltInsSettings(builtInsModule, this.$storageManager, new Function0<ModuleDescriptor>(this) {
            /* class kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$settings$2.C691451 */
            final /* synthetic */ JvmBuiltIns$settings$2 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ModuleDescriptor invoke() {
                ModuleDescriptor moduleDescriptor = this.this$0.this$0.ownerModuleDescriptor;
                if (moduleDescriptor != null) {
                    return moduleDescriptor;
                }
                throw new AssertionError("JvmBuiltins has not been initialized properly");
            }
        }, new Function0<Boolean>(this) {
            /* class kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$settings$2.C691462 */
            final /* synthetic */ JvmBuiltIns$settings$2 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'boolean' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                if (this.this$0.this$0.ownerModuleDescriptor != null) {
                    return this.this$0.this$0.isAdditionalBuiltInsFeatureSupported;
                }
                throw new AssertionError("JvmBuiltins has not been initialized properly");
            }
        });
    }
}
