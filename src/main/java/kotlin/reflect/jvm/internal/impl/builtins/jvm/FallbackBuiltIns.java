package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

final class FallbackBuiltIns extends KotlinBuiltIns {
    public static final Companion Companion = new Companion(null);
    public static final KotlinBuiltIns Instance = new FallbackBuiltIns();

    public static final class Companion {
        private Companion() {
        }

        public final KotlinBuiltIns getInstance() {
            return FallbackBuiltIns.Instance;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public PlatformDependentDeclarationFilter.All getPlatformDependentDeclarationFilter() {
        return PlatformDependentDeclarationFilter.All.INSTANCE;
    }

    private FallbackBuiltIns() {
        super(new LockBasedStorageManager("FallbackBuiltIns"));
        createBuiltInsModule(true);
    }
}
