package org.koin.core.scope;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.C70041b;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.InstanceRegistry;
import org.koin.p3514b.C70034a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\nJ?\u0010#\u001a\u0002H$\"\u0004\b\u0000\u0010$2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030&2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`+¢\u0006\u0002\u0010,J6\u0010#\u001a\u0002H$\"\u0006\b\u0000\u0010$\u0018\u0001\"\u0006\b\u0001\u0010-\u0018\u00012\u0016\b\n\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`+H\b¢\u0006\u0002\u0010.J\r\u0010/\u001a\u000200H\u0000¢\u0006\u0002\b1J\u0006\u00102\u001a\u000200J\r\u00103\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0001HÆ\u0003J7\u00107\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u001b\u00108\u001a\u0002002\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00000:H\u0000¢\u0006\u0002\b;J\r\u0010<\u001a\u000200H\u0000¢\u0006\u0002\b=JN\u0010>\u001a\u000200\"\n\b\u0000\u0010?\u0018\u0001*\u00020\u00012\u0006\u0010@\u001a\u0002H?2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\u0014\b\u0002\u0010C\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030&\u0018\u00010:2\b\b\u0002\u0010D\u001a\u00020\u0010H\b¢\u0006\u0002\u0010EJ\u000e\u0010F\u001a\u0002002\u0006\u0010G\u001a\u00020\u0006J\u0013\u0010H\u001a\u00020\u00102\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003JA\u0010J\u001a\u0004\u0018\u0001H?\"\u0004\b\u0000\u0010?2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030&2\b\u0010A\u001a\u0004\u0018\u00010B2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`+H\u0002¢\u0006\u0002\u0010LJC\u0010M\u001a\u0002H?\"\u0004\b\u0000\u0010?2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030N2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`+H\u0007¢\u0006\u0002\u0010OJA\u0010M\u001a\u0002H?\"\u0004\b\u0000\u0010?2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030&2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`+¢\u0006\u0002\u0010LJ:\u0010M\u001a\u0002H?\"\u0006\b\u0000\u0010?\u0018\u00012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\u0016\b\n\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`+H\b¢\u0006\u0002\u0010PJ\u001b\u0010Q\u001a\b\u0012\u0004\u0012\u0002H?0:\"\n\b\u0000\u0010?\u0018\u0001*\u00020\u0001H\bJ\"\u0010Q\u001a\b\u0012\u0004\u0012\u0002H?0:\"\b\b\u0000\u0010?*\u00020\u00012\n\u0010K\u001a\u0006\u0012\u0002\b\u00030&J!\u0010R\u001a\u0004\u0018\u0001H?\"\u0004\b\u0000\u0010?2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030&H\u0002¢\u0006\u0002\u0010SJ\u0006\u0010T\u001a\u00020\bJE\u0010U\u001a\u0004\u0018\u0001H?\"\u0004\b\u0000\u0010?2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030&2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`+H\u0007¢\u0006\u0002\u0010LJ<\u0010U\u001a\u0004\u0018\u0001H?\"\u0006\b\u0000\u0010?\u0018\u00012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\u0016\b\n\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`+H\b¢\u0006\u0002\u0010PJ\u000e\u0010V\u001a\u00020\u00032\u0006\u0010W\u001a\u00020\u0003J\u0016\u0010V\u001a\u00020\u00032\u0006\u0010W\u001a\u00020\u00032\u0006\u0010X\u001a\u00020\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u00032\u0006\u0010W\u001a\u00020\u0003J\u0012\u0010Z\u001a\u00020\u00002\n\u0010[\u001a\u00060\u0003j\u0002`\u0004J\u001a\u0010\\\u001a\u0002H?\"\n\b\u0000\u0010?\u0018\u0001*\u00020\u0001H\b¢\u0006\u0002\u0010\u001dJ\t\u0010]\u001a\u00020^HÖ\u0001J;\u0010_\u001a\b\u0012\u0004\u0012\u0002H?0`\"\u0006\b\u0000\u0010?\u0018\u00012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\u0016\b\n\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`+H\bJ=\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H?0`\"\u0006\b\u0000\u0010?\u0018\u00012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\u0016\b\n\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`+H\bJ\u001f\u0010b\u001a\u0002002\u0012\u0010c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000d\"\u00020\u0000¢\u0006\u0002\u0010eJ\u000e\u0010f\u001a\u0002002\u0006\u0010G\u001a\u00020\u0006J\u000e\u0010g\u001a\u0002002\u0006\u0010h\u001a\u00020\rJ?\u0010i\u001a\u0002H?\"\u0004\b\u0000\u0010?2\b\u0010A\u001a\u0004\u0018\u00010B2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030&2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`+H\u0002¢\u0006\u0002\u0010jJ\u001e\u0010k\u001a\u00020l2\b\u0010A\u001a\u0004\u0018\u00010B2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030&H\u0002J\b\u0010m\u001a\u00020\u0003H\u0016J\u001f\u0010n\u001a\u0002002\u0012\u0010c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000d\"\u00020\u0000¢\u0006\u0002\u0010eR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00000\fj\b\u0012\u0004\u0012\u00020\u0000`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006o"}, d2 = {"Lorg/koin/core/scope/Scope;", "", "id", "", "Lorg/koin/core/scope/ScopeID;", "_scopeDefinition", "Lorg/koin/core/scope/ScopeDefinition;", "_koin", "Lorg/koin/core/Koin;", "_source", "(Ljava/lang/String;Lorg/koin/core/scope/ScopeDefinition;Lorg/koin/core/Koin;Ljava/lang/Object;)V", "_callbacks", "Ljava/util/ArrayList;", "Lorg/koin/core/scope/ScopeCallback;", "Lkotlin/collections/ArrayList;", "_closed", "", "_instanceRegistry", "Lorg/koin/core/registry/InstanceRegistry;", "get_instanceRegistry", "()Lorg/koin/core/registry/InstanceRegistry;", "get_koin", "()Lorg/koin/core/Koin;", "_linkedScope", "get_linkedScope", "()Ljava/util/ArrayList;", "get_scopeDefinition", "()Lorg/koin/core/scope/ScopeDefinition;", "get_source", "()Ljava/lang/Object;", "closed", "getClosed", "()Z", "getId", "()Ljava/lang/String;", "bind", "S", "primaryType", "Lkotlin/reflect/KClass;", "secondaryType", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "P", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "clear", "", "clear$koin_core", "close", "component1", "component2", "component3", "component4", "copy", "create", "links", "", "create$koin_core", "createEagerInstances", "createEagerInstances$koin_core", "declare", "T", "instance", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "secondaryTypes", "override", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;Z)V", "dropInstances", "scopeDefinition", "equals", "other", "findInOtherScope", "clazz", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "get", "Ljava/lang/Class;", "(Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getAll", "getFromSource", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getKoin", "getOrNull", "getProperty", "key", "defaultValue", "getPropertyOrNull", "getScope", "scopeID", "getSource", "hashCode", "", "inject", "Lkotlin/Lazy;", "injectOrNull", "linkTo", "scopes", "", "([Lorg/koin/core/scope/Scope;)V", "loadDefinitions", "registerCallback", "callback", "resolveInstance", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "throwDefinitionNotFound", "", "toString", "unlink", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.scope.a */
public final class Scope {

    /* renamed from: a */
    private final ArrayList<Scope> f175057a = new ArrayList<>();

    /* renamed from: b */
    private final InstanceRegistry f175058b;

    /* renamed from: c */
    private final ArrayList<ScopeCallback> f175059c;

    /* renamed from: d */
    private boolean f175060d;

    /* renamed from: e */
    private final String f175061e;

    /* renamed from: f */
    private final ScopeDefinition f175062f;

    /* renamed from: g */
    private final Koin f175063g;

    /* renamed from: h */
    private final Object f175064h;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        Scope aVar = (Scope) obj;
        return Intrinsics.areEqual(this.f175061e, aVar.f175061e) && Intrinsics.areEqual(this.f175062f, aVar.f175062f) && Intrinsics.areEqual(this.f175063g, aVar.f175063g) && Intrinsics.areEqual(this.f175064h, aVar.f175064h);
    }

    public int hashCode() {
        String str = this.f175061e;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ScopeDefinition cVar = this.f175062f;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Koin aVar = this.f175063g;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Object obj = this.f175064h;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode3 + i;
    }

    /* renamed from: d */
    public final String mo246702d() {
        return this.f175061e;
    }

    /* renamed from: e */
    public final ScopeDefinition mo246703e() {
        return this.f175062f;
    }

    /* renamed from: f */
    public final Koin mo246705f() {
        return this.f175063g;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: org.koin.core.scope.a$a */
    public static final class C70045a extends Lambda implements Function0<T> {
        final /* synthetic */ KClass $clazz;
        final /* synthetic */ Function0 $parameters;
        final /* synthetic */ Qualifier $qualifier;
        final /* synthetic */ Scope this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70045a(Scope aVar, Qualifier aVar2, KClass kClass, Function0 function0) {
            super(0);
            this.this$0 = aVar;
            this.$qualifier = aVar2;
            this.$clazz = kClass;
            this.$parameters = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) this.this$0.mo246695a(this.$qualifier, this.$clazz, this.$parameters);
        }
    }

    /* renamed from: a */
    public final void mo246696a() {
        if (this.f175062f.mo246714d()) {
            this.f175058b.mo246678c();
        }
    }

    /* renamed from: b */
    public final void mo246700b() {
        synchronized (this) {
            mo246701c();
            this.f175063g.mo246615a().mo246683a(this);
            Unit unit = Unit.INSTANCE;
        }
    }

    public String toString() {
        return "['" + this.f175061e + "']";
    }

    /* renamed from: c */
    public final void mo246701c() {
        synchronized (this) {
            this.f175060d = true;
            if (this.f175063g.mo246617b().mo246690a(Level.DEBUG)) {
                Logger b = this.f175063g.mo246617b();
                b.mo246691b("closing scope:'" + this.f175061e + '\'');
            }
            Iterator<T> it = this.f175059c.iterator();
            while (it.hasNext()) {
                it.next().mo246708a(this);
            }
            this.f175059c.clear();
            this.f175058b.mo246677b();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    private final <T> T m268716a(KClass<?> kClass) {
        if (!kClass.isInstance(this.f175064h)) {
            return null;
        }
        T t = (T) this.f175064h;
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    /* renamed from: a */
    public final void mo246697a(List<Scope> list) {
        Intrinsics.checkParameterIsNotNull(list, "links");
        this.f175058b.mo246674a(this.f175062f.mo246709a());
        this.f175057a.addAll(list);
    }

    /* renamed from: a */
    public final void mo246698a(ScopeDefinition cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "scopeDefinition");
        Iterator<T> it = cVar.mo246709a().iterator();
        while (it.hasNext()) {
            this.f175058b.mo246675a((BeanDefinition<?>) it.next());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r5 != null) goto L_0x001d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void m268717a(org.koin.core.qualifier.Qualifier r5, kotlin.reflect.KClass<?> r6) {
        /*
            r4 = this;
            r0 = 39
            if (r5 == 0) goto L_0x001b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " & qualifier:'"
            r1.append(r2)
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            if (r5 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            java.lang.String r5 = ""
        L_0x001d:
            org.koin.core.error.NoBeanDefFoundException r1 = new org.koin.core.error.NoBeanDefFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No definition found for class:'"
            r2.append(r3)
            java.lang.String r6 = org.koin.p3514b.C70034a.m268608a(r6)
            r2.append(r6)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = ". Check your definitions!"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.scope.Scope.m268717a(org.koin.core.e.a, kotlin.reflect.KClass):java.lang.Void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T m268718c(kotlin.reflect.KClass<?> r4, org.koin.core.qualifier.Qualifier r5, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> r6) {
        /*
            r3 = this;
            java.util.ArrayList<org.koin.core.scope.a> r0 = r3.f175057a
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0007:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            org.koin.core.scope.a r1 = (org.koin.core.scope.Scope) r1
            java.lang.Object r1 = r1.mo246694a(r4, r5, r6)
            if (r1 == 0) goto L_0x0007
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.scope.Scope.m268718c(kotlin.reflect.KClass, org.koin.core.e.a, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    /* renamed from: a */
    public final <T> T mo246694a(KClass<?> kClass, Qualifier aVar, Function0<DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        try {
            return (T) mo246699b(kClass, aVar, function0);
        } catch (Exception unused) {
            Logger b = this.f175063g.mo246617b();
            b.mo246692c("Can't get instance for " + C70034a.m268608a(kClass));
            return null;
        }
    }

    /* renamed from: a */
    public final <T> T mo246695a(Qualifier aVar, KClass<?> kClass, Function0<DefinitionParameters> function0) {
        if (!this.f175060d) {
            Object a = this.f175058b.mo246672a(C70041b.m268672a(kClass, aVar), function0);
            if (a == null) {
                a = (T) m268718c(kClass, aVar, function0);
            }
            if (a == null) {
                a = (T) m268716a(kClass);
            }
            if (a != null) {
                return (T) a;
            }
            m268717a(aVar, kClass);
            throw null;
        }
        throw new ClosedScopeException("Scope '" + this.f175061e + "' is closed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r1 != null) goto L_0x0030;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo246699b(kotlin.reflect.KClass<?> r6, org.koin.core.qualifier.Qualifier r7, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> r8) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.scope.Scope.mo246699b(kotlin.reflect.KClass, org.koin.core.e.a, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    public Scope(String str, ScopeDefinition cVar, Koin aVar, Object obj) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(cVar, "_scopeDefinition");
        Intrinsics.checkParameterIsNotNull(aVar, "_koin");
        this.f175061e = str;
        this.f175062f = cVar;
        this.f175063g = aVar;
        this.f175064h = obj;
        this.f175058b = new InstanceRegistry(aVar, this);
        this.f175059c = new ArrayList<>();
    }
}
