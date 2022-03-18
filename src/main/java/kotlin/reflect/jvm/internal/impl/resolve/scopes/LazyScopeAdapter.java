package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;

public final class LazyScopeAdapter extends AbstractScopeAdapter {
    private final NotNullLazyValue<MemberScope> scope;

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    public MemberScope getWorkerScope() {
        return (MemberScope) this.scope.invoke();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyScopeAdapter(NotNullLazyValue<? extends MemberScope> notNullLazyValue) {
        Intrinsics.checkParameterIsNotNull(notNullLazyValue, "scope");
        this.scope = notNullLazyValue;
    }
}
