package org.koin.core.scope;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
public final class Scope$injectOrNull$1 extends Lambda implements Function0<T> {
    final /* synthetic */ Function0 $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Scope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Scope$injectOrNull$1(Scope aVar, Qualifier aVar2, Function0 function0) {
        super(0);
        this.this$0 = aVar;
        this.$qualifier = aVar2;
        this.$parameters = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        Scope aVar = this.this$0;
        Qualifier aVar2 = this.$qualifier;
        Function0<DefinitionParameters> function0 = this.$parameters;
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) aVar.mo246694a(Reflection.getOrCreateKotlinClass(Object.class), aVar2, function0);
    }
}
