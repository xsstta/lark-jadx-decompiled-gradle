package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public final class LazyWrappedType extends WrappedType {
    public final Function0<KotlinType> computation;
    private final NotNullLazyValue<KotlinType> lazyValue;
    private final StorageManager storageManager;

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public boolean isComputed() {
        return this.lazyValue.isComputed();
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public KotlinType getDelegate() {
        return (KotlinType) this.lazyValue.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public LazyWrappedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.storageManager, new LazyWrappedType$refine$1(this, kotlinTypeRefiner));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(StorageManager storageManager2, Function0<? extends KotlinType> function0) {
        Intrinsics.checkParameterIsNotNull(storageManager2, "storageManager");
        Intrinsics.checkParameterIsNotNull(function0, "computation");
        this.storageManager = storageManager2;
        this.computation = function0;
        this.lazyValue = storageManager2.createLazyValue(function0);
    }
}
