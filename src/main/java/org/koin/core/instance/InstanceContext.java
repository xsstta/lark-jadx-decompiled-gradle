package org.koin.core.instance;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.scope.Scope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0002\u0010\nR\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lorg/koin/core/instance/InstanceContext;", "", "koin", "Lorg/koin/core/Koin;", "scope", "Lorg/koin/core/scope/Scope;", "_parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/Koin;Lorg/koin/core/scope/Scope;Lkotlin/jvm/functions/Function0;)V", "getKoin", "()Lorg/koin/core/Koin;", "parameters", "getParameters", "()Lorg/koin/core/parameter/DefinitionParameters;", "getScope", "()Lorg/koin/core/scope/Scope;", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.b.b */
public final class InstanceContext {

    /* renamed from: a */
    private final DefinitionParameters f175015a;

    /* renamed from: b */
    private final Koin f175016b;

    /* renamed from: c */
    private final Scope f175017c;

    /* renamed from: d */
    private final Function0<DefinitionParameters> f175018d;

    /* renamed from: a */
    public final DefinitionParameters mo246631a() {
        return this.f175015a;
    }

    /* renamed from: b */
    public final Scope mo246632b() {
        return this.f175017c;
    }

    public InstanceContext(Koin aVar, Scope aVar2, Function0<DefinitionParameters> function0) {
        DefinitionParameters a;
        Intrinsics.checkParameterIsNotNull(aVar, "koin");
        Intrinsics.checkParameterIsNotNull(aVar2, "scope");
        this.f175016b = aVar;
        this.f175017c = aVar2;
        this.f175018d = function0;
        this.f175015a = (function0 == null || (a = function0.invoke()) == null) ? C70039b.m268660a() : a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstanceContext(Koin aVar, Scope aVar2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, (i & 4) != 0 ? null : function0);
    }
}
