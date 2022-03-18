package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class ScopesHolderForClass$scopeForOwnerModule$2 extends Lambda implements Function0<T> {
    final /* synthetic */ ScopesHolderForClass this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScopesHolderForClass$scopeForOwnerModule$2(ScopesHolderForClass scopesHolderForClass) {
        super(0);
        this.this$0 = scopesHolderForClass;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        return this.this$0.scopeFactory.invoke(this.this$0.kotlinTypeRefinerForOwnerModule);
    }
}
