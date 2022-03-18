package org.koin.core.registry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.C70041b;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.InstanceContext;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.scope.Scope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JE\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00182\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\u0004\u0018\u0001`\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"J\u001f\u0010#\u001a\u00020!2\u0010\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0%H\u0000¢\u0006\u0002\b'J\u0019\u0010(\u001a\u00020!2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030&H\u0000¢\u0006\u0002\b*J\r\u0010+\u001a\u00020!H\u0000¢\u0006\u0002\b,J \u0010-\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010)\u001a\u0006\u0012\u0002\b\u00030&H\u0002J\u001e\u0010.\u001a\u00020/2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\u0004\u0018\u0001`\u001dH\u0002J\u0019\u00100\u001a\u00020!2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030&H\u0000¢\u0006\u0002\b1J)\u00102\u001a\b\u0012\u0004\u0012\u0002H403\"\b\b\u0000\u00104*\u00020\u00012\n\u00105\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0000¢\u0006\u0002\b6J9\u00107\u001a\u0004\u0018\u0001H4\"\u0004\b\u0000\u001042\n\u00108\u001a\u00060\tj\u0002`\n2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\u0004\u0018\u0001`\u001dH\u0000¢\u0006\u0004\b9\u0010:J\u001a\u0010;\u001a\u00020!2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030&2\u0006\u0010<\u001a\u00020=J(\u0010>\u001a\u00020!2\n\u0010?\u001a\u00060\tj\u0002`\n2\n\u0010@\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010<\u001a\u00020=H\u0002J \u0010A\u001a\u00020!2\n\u0010?\u001a\u00060\tj\u0002`\n2\n\u0010@\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002R:\u0010\u0007\u001a.\u0012\b\u0012\u00060\tj\u0002`\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\bj\u0016\u0012\b\u0012\u00060\tj\u0002`\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b`\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0011\u001a\u0016\u0012\b\u0012\u00060\tj\u0002`\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006B"}, d2 = {"Lorg/koin/core/registry/InstanceRegistry;", "", "_koin", "Lorg/koin/core/Koin;", "_scope", "Lorg/koin/core/scope/Scope;", "(Lorg/koin/core/Koin;Lorg/koin/core/scope/Scope;)V", "_instances", "Ljava/util/HashMap;", "", "Lorg/koin/core/definition/IndexKey;", "Lorg/koin/core/instance/InstanceFactory;", "Lkotlin/collections/HashMap;", "get_koin", "()Lorg/koin/core/Koin;", "get_scope", "()Lorg/koin/core/scope/Scope;", "instances", "", "getInstances", "()Ljava/util/Map;", "bind", "S", "primaryType", "Lkotlin/reflect/KClass;", "secondaryType", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "bind$koin_core", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "close", "", "close$koin_core", "create", "definitions", "", "Lorg/koin/core/definition/BeanDefinition;", "create$koin_core", "createDefinition", "definition", "createDefinition$koin_core", "createEagerInstances", "createEagerInstances$koin_core", "createInstanceFactory", "defaultInstanceContext", "Lorg/koin/core/instance/InstanceContext;", "dropDefinition", "dropDefinition$koin_core", "getAll", "", "T", "clazz", "getAll$koin_core", "resolveInstance", "indexKey", "resolveInstance$koin_core", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "saveDefinition", "override", "", "saveInstance", "key", "factory", "saveInstanceIfPossible", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.f.a */
public final class InstanceRegistry {

    /* renamed from: a */
    private final HashMap<String, InstanceFactory<?>> f175045a = new HashMap<>();

    /* renamed from: b */
    private final Koin f175046b;

    /* renamed from: c */
    private final Scope f175047c;

    /* renamed from: a */
    public final Map<String, InstanceFactory<?>> mo246673a() {
        return this.f175045a;
    }

    /* renamed from: b */
    public final void mo246677b() {
        Collection<InstanceFactory<?>> values = this.f175045a.values();
        Intrinsics.checkExpressionValueIsNotNull(values, "_instances.values");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            it.next().mo246630a();
        }
        this.f175045a.clear();
    }

    /* renamed from: c */
    public final void mo246678c() {
        ArrayList arrayList = new ArrayList();
        for (T t : mo246673a().values()) {
            if (t instanceof SingleInstanceFactory) {
                arrayList.add(t);
            }
        }
        ArrayList<SingleInstanceFactory> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((SingleInstanceFactory) obj).mo246634b().mo246652g().mo246661a()) {
                arrayList2.add(obj);
            }
        }
        for (SingleInstanceFactory dVar : arrayList2) {
            dVar.mo246629a(new InstanceContext(this.f175046b, this.f175047c, null, 4, null));
        }
    }

    /* renamed from: a */
    private final InstanceContext m268678a(Function0<DefinitionParameters> function0) {
        return new InstanceContext(this.f175046b, this.f175047c, function0);
    }

    /* renamed from: a */
    public final void mo246674a(Set<? extends BeanDefinition<?>> set) {
        Intrinsics.checkParameterIsNotNull(set, "definitions");
        for (T t : set) {
            if (this.f175046b.mo246617b().mo246690a(Level.DEBUG)) {
                if (this.f175047c.mo246703e().mo246714d()) {
                    Logger b = this.f175046b.mo246617b();
                    b.mo246689a("- " + ((Object) t));
                } else {
                    Logger b2 = this.f175046b.mo246617b();
                    b2.mo246689a(this.f175047c + " -> " + ((Object) t));
                }
            }
            mo246676a((BeanDefinition<?>) t, false);
        }
    }

    /* renamed from: a */
    public final void mo246675a(BeanDefinition<?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "definition");
        mo246676a(aVar, false);
    }

    public InstanceRegistry(Koin aVar, Scope aVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "_koin");
        Intrinsics.checkParameterIsNotNull(aVar2, "_scope");
        this.f175046b = aVar;
        this.f175047c = aVar2;
    }

    /* renamed from: a */
    private final void m268680a(String str, InstanceFactory<?> cVar) {
        if (!this.f175045a.containsKey(str)) {
            this.f175045a.put(str, cVar);
        }
    }

    /* renamed from: a */
    private final InstanceFactory<?> m268679a(Koin aVar, BeanDefinition<?> aVar2) {
        int i = C70043b.f175048a[aVar2.mo246649e().ordinal()];
        if (i == 1) {
            return new SingleInstanceFactory(aVar, aVar2);
        }
        if (i == 2) {
            return new FactoryInstanceFactory(aVar, aVar2);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public final <T> T mo246672a(String str, Function0<DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(str, "indexKey");
        InstanceFactory<?> cVar = this.f175045a.get(str);
        T t = cVar != null ? (T) cVar.mo246629a(m268678a(function0)) : null;
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    /* renamed from: a */
    public final void mo246676a(BeanDefinition<?> aVar, boolean z) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(aVar, "definition");
        if (aVar.mo246652g().mo246662b() || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        InstanceFactory<?> a = m268679a(this.f175046b, aVar);
        m268681a(C70041b.m268672a(aVar.mo246646b(), aVar.mo246647c()), a, z2);
        for (T t : aVar.mo246651f()) {
            if (z2) {
                m268681a(C70041b.m268672a(t, aVar.mo246647c()), a, z2);
            } else {
                m268680a(C70041b.m268672a(t, aVar.mo246647c()), a);
            }
        }
    }

    /* renamed from: a */
    private final void m268681a(String str, InstanceFactory<?> cVar, boolean z) {
        if (!this.f175045a.containsKey(str) || z) {
            this.f175045a.put(str, cVar);
            return;
        }
        throw new IllegalStateException(("InstanceRegistry already contains index '" + str + '\'').toString());
    }
}
