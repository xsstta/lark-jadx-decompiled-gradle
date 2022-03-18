package org.koin.core.module;

import java.util.ArrayList;
import kotlin.Metadata;
import org.koin.core.definition.Options;
import org.koin.core.scope.ScopeDefinition;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005JX\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0017\"\u0006\b\u0000\u0010\u0018\u0018\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u0004\u001a\u00020\u00032)\b\b\u0010\u001b\u001a#\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002H\u00180\u001cj\b\u0012\u0004\u0012\u0002H\u0018`\u001f¢\u0006\u0002\b H\bJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u0003J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00000%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000%H\u0002J\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00000%2\u0006\u0010'\u001a\u00020\u0000H\u0002J'\u0010(\u001a\u00020)2\u0006\u0010\u0019\u001a\u00020\u001a2\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020)0+¢\u0006\u0002\b J*\u0010(\u001a\u00020)\"\u0006\b\u0000\u0010\u0018\u0018\u00012\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020)0+¢\u0006\u0002\b H\bJb\u0010-\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0017\"\u0006\b\u0000\u0010\u0018\u0018\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032)\b\b\u0010\u001b\u001a#\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002H\u00180\u001cj\b\u0012\u0004\u0012\u0002H\u0018`\u001f¢\u0006\u0002\b H\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u000bR!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006."}, d2 = {"Lorg/koin/core/module/Module;", "", "createAtStart", "", "override", "(ZZ)V", "getCreateAtStart", "()Z", "<set-?>", "isLoaded", "setLoaded$koin_core", "(Z)V", "otherScopes", "Ljava/util/ArrayList;", "Lorg/koin/core/scope/ScopeDefinition;", "Lkotlin/collections/ArrayList;", "getOtherScopes", "()Ljava/util/ArrayList;", "getOverride", "rootScope", "getRootScope", "()Lorg/koin/core/scope/ScopeDefinition;", "factory", "Lorg/koin/core/definition/BeanDefinition;", "T", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "makeOptions", "Lorg/koin/core/definition/Options;", "createdAtStart", "plus", "", "modules", "module", "scope", "", "scopeSet", "Lkotlin/Function1;", "Lorg/koin/dsl/ScopeDSL;", "single", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.c.a */
public final class Module {

    /* renamed from: a */
    private final ScopeDefinition f175023a = ScopeDefinition.f175066b.mo246718b();

    /* renamed from: b */
    private boolean f175024b;

    /* renamed from: c */
    private final ArrayList<ScopeDefinition> f175025c = new ArrayList<>();

    /* renamed from: d */
    private final boolean f175026d;

    /* renamed from: e */
    private final boolean f175027e;

    /* renamed from: a */
    public final ScopeDefinition mo246637a() {
        return this.f175023a;
    }

    /* renamed from: b */
    public final boolean mo246639b() {
        return this.f175024b;
    }

    /* renamed from: c */
    public final ArrayList<ScopeDefinition> mo246640c() {
        return this.f175025c;
    }

    /* renamed from: a */
    public final void mo246638a(boolean z) {
        this.f175024b = z;
    }

    public Module(boolean z, boolean z2) {
        this.f175026d = z;
        this.f175027e = z2;
    }

    /* renamed from: a */
    public final Options mo246636a(boolean z, boolean z2) {
        boolean z3;
        boolean z4 = false;
        if (this.f175026d || z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f175027e || z) {
            z4 = true;
        }
        return new Options(z3, z4);
    }

    /* renamed from: a */
    public static /* synthetic */ Options m268650a(Module aVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return aVar.mo246636a(z, z2);
    }
}
