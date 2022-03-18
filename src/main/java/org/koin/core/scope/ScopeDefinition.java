package org.koin.core.scope;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.p3520e.C70042b;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 (2\u00020\u0001:\u0001(B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012 \b\u0002\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b`\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0000J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\bJ\u001c\u0010\u001a\u001a\u00020\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\b2\b\b\u0002\u0010\u001b\u001a\u00020\u0005JX\u0010\u001c\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\n\b\u0000\u0010\u001d\u0018\u0001*\u00020\u00012\u0006\u0010\u001e\u001a\u0002H\u001d2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030!\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020\u0005H\b¢\u0006\u0002\u0010#J\r\u0010$\u001a\u00020\u0016H\u0000¢\u0006\u0002\b%J\u000e\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0000R&\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b`\tX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006)"}, d2 = {"Lorg/koin/core/scope/ScopeDefinition;", "", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "isRoot", "", "_definitions", "Ljava/util/HashSet;", "Lorg/koin/core/definition/BeanDefinition;", "Lkotlin/collections/HashSet;", "(Lorg/koin/core/qualifier/Qualifier;ZLjava/util/HashSet;)V", "definitions", "", "getDefinitions", "()Ljava/util/Set;", "()Z", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "copy", "equals", "other", "hashCode", "", "remove", "", "beanDefinition", "save", "forceOverride", "saveNewDefinition", "T", "instance", "secondaryTypes", "", "Lkotlin/reflect/KClass;", "override", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;Z)Lorg/koin/core/definition/BeanDefinition;", "size", "size$koin_core", "unloadDefinitions", "scopeDefinition", "Companion", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.scope.c */
public final class ScopeDefinition {

    /* renamed from: a */
    public static final StringQualifier f175065a = C70042b.m268677b("-Root-");

    /* renamed from: b */
    public static final Companion f175066b = new Companion(null);

    /* renamed from: c */
    private final Qualifier f175067c;

    /* renamed from: d */
    private final boolean f175068d;

    /* renamed from: e */
    private final HashSet<BeanDefinition<?>> f175069e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lorg/koin/core/scope/ScopeDefinition$Companion;", "", "()V", "ROOT_SCOPE_ID", "", "ROOT_SCOPE_QUALIFIER", "Lorg/koin/core/qualifier/StringQualifier;", "getROOT_SCOPE_QUALIFIER", "()Lorg/koin/core/qualifier/StringQualifier;", "rootDefinition", "Lorg/koin/core/scope/ScopeDefinition;", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: org.koin.core.scope.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final StringQualifier mo246717a() {
            return ScopeDefinition.f175065a;
        }

        /* renamed from: b */
        public final ScopeDefinition mo246718b() {
            return new ScopeDefinition(mo246717a(), true, null, 4, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final Qualifier mo246713c() {
        return this.f175067c;
    }

    /* renamed from: d */
    public final boolean mo246714d() {
        return this.f175068d;
    }

    /* renamed from: a */
    public final Set<BeanDefinition<?>> mo246709a() {
        return this.f175069e;
    }

    /* renamed from: b */
    public final ScopeDefinition mo246712b() {
        ScopeDefinition cVar = new ScopeDefinition(this.f175067c, this.f175068d, new HashSet());
        cVar.f175069e.addAll(mo246709a());
        return cVar;
    }

    public int hashCode() {
        return (this.f175067c.hashCode() * 31) + Boolean.valueOf(this.f175068d).hashCode();
    }

    /* renamed from: a */
    public final void mo246710a(BeanDefinition<?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "beanDefinition");
        this.f175069e.remove(aVar);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            ScopeDefinition cVar = (ScopeDefinition) obj;
            if (!(!Intrinsics.areEqual(this.f175067c, cVar.f175067c)) && this.f175068d == cVar.f175068d) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.koin.core.scope.ScopeDefinition");
    }

    /* renamed from: a */
    public final void mo246711a(BeanDefinition<?> aVar, boolean z) {
        T t;
        Intrinsics.checkParameterIsNotNull(aVar, "beanDefinition");
        if (mo246709a().contains(aVar)) {
            if (aVar.mo246652g().mo246662b() || z) {
                this.f175069e.remove(aVar);
            } else {
                Iterator<T> it = mo246709a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t, aVar)) {
                        break;
                    }
                }
                throw new DefinitionOverrideException("Definition '" + aVar + "' try to override existing definition. Please use override option or check for definition '" + ((Object) t) + '\'');
            }
        }
        this.f175069e.add(aVar);
    }

    public ScopeDefinition(Qualifier aVar, boolean z, HashSet<BeanDefinition<?>> hashSet) {
        Intrinsics.checkParameterIsNotNull(aVar, "qualifier");
        Intrinsics.checkParameterIsNotNull(hashSet, "_definitions");
        this.f175067c = aVar;
        this.f175068d = z;
        this.f175069e = hashSet;
    }

    /* renamed from: a */
    public static /* synthetic */ void m268731a(ScopeDefinition cVar, BeanDefinition aVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        cVar.mo246711a(aVar, z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScopeDefinition(Qualifier aVar, boolean z, HashSet hashSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new HashSet() : hashSet);
    }
}
