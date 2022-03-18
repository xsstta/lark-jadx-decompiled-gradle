package org.koin.core.registry;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.error.NoScopeDefFoundException;
import org.koin.core.error.ScopeAlreadyCreatedException;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.core.scope.ScopeDefinition;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0002J\r\u0010\"\u001a\u00020!H\u0000¢\u0006\u0002\b#J\r\u0010$\u001a\u00020!H\u0000¢\u0006\u0002\b%J\r\u0010&\u001a\u00020!H\u0000¢\u0006\u0002\b'J&\u0010(\u001a\u00020\u00062\n\u0010)\u001a\u00060\u0013j\u0002`\u00172\u0006\u0010*\u001a\u00020+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0001J&\u0010(\u001a\u00020\u00062\n\u0010)\u001a\u00060\u0013j\u0002`\u00172\u0006\u0010-\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020\fH\u0002J\u0010\u00100\u001a\u00020!2\u0006\u0010-\u001a\u00020\fH\u0002J\u0010\u00101\u001a\u00020!2\u0006\u0010-\u001a\u00020\fH\u0002J\u0016\u00102\u001a\u00020!2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\f04H\u0002J\u000e\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020\u0006J\u0012\u00105\u001a\u00020!2\n\u0010)\u001a\u00060\u0013j\u0002`\u0017J\u0014\u00107\u001a\u0004\u0018\u00010\u00062\n\u0010)\u001a\u00060\u0013j\u0002`\u0017J\u0010\u00108\u001a\u00020!2\u0006\u00109\u001a\u00020:H\u0002J\u001b\u0010;\u001a\u00020!2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020:0=H\u0000¢\u0006\u0002\b>J\u0010\u0010?\u001a\u00020!2\u0006\u0010/\u001a\u00020\fH\u0002J\u0006\u0010@\u001a\u00020AJ\u0010\u0010B\u001a\u00020!2\u0006\u0010-\u001a\u00020\fH\u0002J\u0010\u0010C\u001a\u00020!2\u0006\u0010-\u001a\u00020\fH\u0002J\u0014\u0010D\u001a\u00020!2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020:0=J\u000e\u0010D\u001a\u00020!2\u0006\u00109\u001a\u00020:R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R2\u0010\u0011\u001a&\u0012\b\u0012\u00060\u0013j\u0002`\u0014\u0012\u0004\u0012\u00020\f0\u0012j\u0012\u0012\b\u0012\u00060\u0013j\u0002`\u0014\u0012\u0004\u0012\u00020\f`\u0015X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0016\u001a&\u0012\b\u0012\u00060\u0013j\u0002`\u0017\u0012\u0004\u0012\u00020\u00060\u0012j\u0012\u0012\b\u0012\u00060\u0013j\u0002`\u0017\u0012\u0004\u0012\u00020\u0006`\u0015X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\bR!\u0010\u001a\u001a\u0012\u0012\b\u0012\u00060\u0013j\u0002`\u0014\u0012\u0004\u0012\u00020\f0\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR!\u0010\u001e\u001a\u0012\u0012\b\u0012\u00060\u0013j\u0002`\u0017\u0012\u0004\u0012\u00020\u00060\u001b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006E"}, d2 = {"Lorg/koin/core/registry/ScopeRegistry;", "", "_koin", "Lorg/koin/core/Koin;", "(Lorg/koin/core/Koin;)V", "_rootScope", "Lorg/koin/core/scope/Scope;", "get_rootScope", "()Lorg/koin/core/scope/Scope;", "set_rootScope", "(Lorg/koin/core/scope/Scope;)V", "_rootScopeDefinition", "Lorg/koin/core/scope/ScopeDefinition;", "get_rootScopeDefinition", "()Lorg/koin/core/scope/ScopeDefinition;", "set_rootScopeDefinition", "(Lorg/koin/core/scope/ScopeDefinition;)V", "_scopeDefinitions", "Ljava/util/HashMap;", "", "Lorg/koin/core/qualifier/QualifierValue;", "Lkotlin/collections/HashMap;", "_scopes", "Lorg/koin/core/scope/ScopeID;", "rootScope", "getRootScope", "scopeDefinitions", "", "getScopeDefinitions", "()Ljava/util/Map;", "scopes", "getScopes", "clearScopes", "", "close", "close$koin_core", "createRootScope", "createRootScope$koin_core", "createRootScopeDefinition", "createRootScopeDefinition$koin_core", "createScope", "scopeId", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", ShareHitPoint.f121868c, "scopeDefinition", "declareDefinitions", "definition", "declareInstances", "declareScope", "declareScopes", "list", "", "deleteScope", "scope", "getScopeOrNull", "loadModule", "module", "Lorg/koin/core/module/Module;", "loadModules", "modules", "", "loadModules$koin_core", "mergeDefinitions", "size", "", "unloadDefinitions", "unloadInstances", "unloadModules", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.f.d */
public final class ScopeRegistry {

    /* renamed from: a */
    private final HashMap<String, ScopeDefinition> f175051a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<String, Scope> f175052b = new HashMap<>();

    /* renamed from: c */
    private ScopeDefinition f175053c;

    /* renamed from: d */
    private Scope f175054d;

    /* renamed from: e */
    private final Koin f175055e;

    /* renamed from: c */
    public final Scope mo246685c() {
        return this.f175054d;
    }

    /* renamed from: b */
    public final Map<String, Scope> mo246684b() {
        return this.f175052b;
    }

    /* renamed from: a */
    public final Map<String, ScopeDefinition> mo246680a() {
        return this.f175051a;
    }

    /* renamed from: d */
    public final Scope mo246686d() {
        Scope aVar = this.f175054d;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("No root scoped initialized".toString());
    }

    /* renamed from: e */
    public final void mo246687e() {
        ScopeDefinition b = ScopeDefinition.f175066b.mo246718b();
        this.f175051a.put(ScopeDefinition.f175066b.mo246717a().getValue(), b);
        this.f175053c = b;
    }

    /* renamed from: f */
    public final void mo246688f() {
        if (this.f175054d == null) {
            this.f175054d = mo246681a("-Root-", ScopeDefinition.f175066b.mo246717a(), (Object) null);
        }
    }

    /* renamed from: a */
    private final void m268693a(ScopeDefinition cVar) {
        m268695c(cVar);
        m268694b(cVar);
    }

    public ScopeRegistry(Koin aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "_koin");
        this.f175055e = aVar;
    }

    /* renamed from: a */
    private final void m268691a(List<ScopeDefinition> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m268693a((ScopeDefinition) it.next());
        }
    }

    /* renamed from: c */
    private final void m268695c(ScopeDefinition cVar) {
        if (mo246680a().containsKey(cVar.mo246713c().getValue())) {
            m268696d(cVar);
        } else {
            this.f175051a.put(cVar.mo246713c().getValue(), cVar.mo246712b());
        }
    }

    /* renamed from: a */
    private final void m268692a(Module aVar) {
        m268693a(aVar.mo246637a());
        m268691a((List<ScopeDefinition>) aVar.mo246640c());
    }

    /* renamed from: b */
    private final void m268694b(ScopeDefinition cVar) {
        Collection<Scope> values = this.f175052b.values();
        Intrinsics.checkExpressionValueIsNotNull(values, "_scopes.values");
        ArrayList<Scope> arrayList = new ArrayList();
        for (T t : values) {
            if (Intrinsics.areEqual(t.mo246703e(), cVar)) {
                arrayList.add(t);
            }
        }
        for (Scope aVar : arrayList) {
            aVar.mo246698a(cVar);
        }
    }

    /* renamed from: d */
    private final void m268696d(ScopeDefinition cVar) {
        ScopeDefinition cVar2 = mo246680a().get(cVar.mo246713c().getValue());
        if (cVar2 != null) {
            Iterator<T> it = cVar.mo246709a().iterator();
            while (it.hasNext()) {
                ScopeDefinition.m268731a(cVar2, it.next(), false, 2, null);
            }
            return;
        }
        throw new IllegalStateException(("Scope definition '" + cVar + "' not found in " + this.f175051a).toString());
    }

    /* renamed from: a */
    public final void mo246682a(Iterable<Module> iterable) {
        Intrinsics.checkParameterIsNotNull(iterable, "modules");
        for (Module aVar : iterable) {
            if (!aVar.mo246639b()) {
                m268692a(aVar);
                aVar.mo246638a(true);
            } else {
                Logger b = this.f175055e.mo246617b();
                b.mo246692c("module '" + aVar + "' already loaded!");
            }
        }
    }

    /* renamed from: a */
    public final void mo246683a(Scope aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "scope");
        this.f175052b.remove(aVar.mo246702d());
    }

    /* renamed from: a */
    private final Scope m268690a(String str, ScopeDefinition cVar, Object obj) {
        List<Scope> list;
        Scope aVar = new Scope(str, cVar, this.f175055e, obj);
        Scope aVar2 = this.f175054d;
        if (aVar2 == null || (list = CollectionsKt.listOf(aVar2)) == null) {
            list = CollectionsKt.emptyList();
        }
        aVar.mo246697a(list);
        return aVar;
    }

    /* renamed from: a */
    public final Scope mo246681a(String str, Qualifier aVar, Object obj) {
        Intrinsics.checkParameterIsNotNull(str, "scopeId");
        Intrinsics.checkParameterIsNotNull(aVar, "qualifier");
        if (!mo246684b().containsKey(str)) {
            ScopeDefinition cVar = mo246680a().get(aVar.getValue());
            if (cVar != null) {
                Scope a = m268690a(str, cVar, obj);
                this.f175052b.put(str, a);
                return a;
            }
            throw new NoScopeDefFoundException("No Scope Definition found for qualifer '" + aVar.getValue() + '\'');
        }
        throw new ScopeAlreadyCreatedException("Scope with id '" + str + "' is already created");
    }
}
