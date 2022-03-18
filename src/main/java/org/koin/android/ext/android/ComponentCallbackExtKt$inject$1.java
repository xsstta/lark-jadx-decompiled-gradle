package org.koin.android.ext.android;

import android.content.ComponentCallbacks;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
public final class ComponentCallbackExtKt$inject$1 extends Lambda implements Function0<T> {
    final /* synthetic */ Function0 $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ ComponentCallbacks $this_inject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComponentCallbackExtKt$inject$1(ComponentCallbacks componentCallbacks, Qualifier aVar, Function0 function0) {
        super(0);
        this.$this_inject = componentCallbacks;
        this.$qualifier = aVar;
        this.$parameters = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        ComponentCallbacks componentCallbacks = this.$this_inject;
        Qualifier aVar = this.$qualifier;
        Function0<DefinitionParameters> function0 = this.$parameters;
        Scope d = C70033a.m268606a(componentCallbacks).mo246615a().mo246686d();
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) d.mo246699b(Reflection.getOrCreateKotlinClass(Object.class), aVar, function0);
    }
}
