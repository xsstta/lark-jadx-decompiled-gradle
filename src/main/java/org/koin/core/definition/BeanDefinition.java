package org.koin.core.definition;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.core.scope.ScopeDefinition;
import org.koin.p3514b.C70034a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012'\u0010\t\u001a#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\r¢\u0006\u0002\b\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0012\b\u0002\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0002\u0010\u0019J\u001e\u0010,\u001a\u00020-2\n\u0010.\u001a\u0006\u0012\u0002\b\u00030\u00062\n\u0010/\u001a\u0006\u0012\u0002\b\u00030\u0006J\t\u00100\u001a\u00020\u0004HÆ\u0003J\r\u00101\u001a\u0006\u0012\u0002\b\u00030\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J*\u00103\u001a#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\r¢\u0006\u0002\b\u000eHÆ\u0003J\t\u00104\u001a\u00020\u0010HÆ\u0003J\u0013\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0012HÆ\u0003J\t\u00106\u001a\u00020\u0014HÆ\u0003J\t\u00107\u001a\u00020\u0016HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018HÆ\u0003J \u0001\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2)\b\u0002\u0010\t\u001a#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0012\b\u0002\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018HÆ\u0001J\u0013\u0010:\u001a\u00020-2\b\u0010;\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010<\u001a\u00020-2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030\u0006J\b\u0010>\u001a\u00020?H\u0016J$\u0010@\u001a\u00020-2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010A\u001a\u00020BH\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR2\u0010\t\u001a#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\r¢\u0006\u0002\b\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001b\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006C"}, d2 = {"Lorg/koin/core/definition/BeanDefinition;", "T", "", "scopeDefinition", "Lorg/koin/core/scope/ScopeDefinition;", "primaryType", "Lkotlin/reflect/KClass;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "kind", "Lorg/koin/core/definition/Kind;", "secondaryTypes", "", "options", "Lorg/koin/core/definition/Options;", "properties", "Lorg/koin/core/definition/Properties;", "callbacks", "Lorg/koin/core/definition/Callbacks;", "(Lorg/koin/core/scope/ScopeDefinition;Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function2;Lorg/koin/core/definition/Kind;Ljava/util/List;Lorg/koin/core/definition/Options;Lorg/koin/core/definition/Properties;Lorg/koin/core/definition/Callbacks;)V", "getCallbacks", "()Lorg/koin/core/definition/Callbacks;", "getDefinition", "()Lkotlin/jvm/functions/Function2;", "getKind", "()Lorg/koin/core/definition/Kind;", "getOptions", "()Lorg/koin/core/definition/Options;", "getPrimaryType", "()Lkotlin/reflect/KClass;", "getProperties", "()Lorg/koin/core/definition/Properties;", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "getScopeDefinition", "()Lorg/koin/core/scope/ScopeDefinition;", "getSecondaryTypes", "()Ljava/util/List;", "canBind", "", "primary", "secondary", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hasType", "clazz", "hashCode", "", "is", "toString", "", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.definition.a */
public final class BeanDefinition<T> {

    /* renamed from: a */
    private final ScopeDefinition f175030a;

    /* renamed from: b */
    private final KClass<?> f175031b;

    /* renamed from: c */
    private final Qualifier f175032c;

    /* renamed from: d */
    private final Function2<Scope, DefinitionParameters, T> f175033d;

    /* renamed from: e */
    private final Kind f175034e;

    /* renamed from: f */
    private final List<KClass<?>> f175035f;

    /* renamed from: g */
    private final Options f175036g;

    /* renamed from: h */
    private final Properties f175037h;

    /* renamed from: i */
    private final Callbacks<T> f175038i;

    /* renamed from: a */
    public static /* synthetic */ BeanDefinition m268662a(BeanDefinition aVar, ScopeDefinition cVar, KClass kClass, Qualifier aVar2, Function2 kVar, Kind kind, List list, Options eVar, Properties fVar, Callbacks cVar2, int i, Object obj) {
        return aVar.mo246644a((i & 1) != 0 ? aVar.f175030a : cVar, (i & 2) != 0 ? aVar.f175031b : kClass, (i & 4) != 0 ? aVar.f175032c : aVar2, (i & 8) != 0 ? aVar.f175033d : kVar, (i & 16) != 0 ? aVar.f175034e : kind, (i & 32) != 0 ? aVar.f175035f : list, (i & 64) != 0 ? aVar.f175036g : eVar, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? aVar.f175037h : fVar, (i & DynamicModule.f58006b) != 0 ? aVar.f175038i : cVar2);
    }

    /* renamed from: a */
    public final BeanDefinition<T> mo246644a(ScopeDefinition cVar, KClass<?> kClass, Qualifier aVar, Function2<? super Scope, ? super DefinitionParameters, ? extends T> kVar, Kind kind, List<? extends KClass<?>> list, Options eVar, Properties fVar, Callbacks<T> cVar2) {
        Intrinsics.checkParameterIsNotNull(cVar, "scopeDefinition");
        Intrinsics.checkParameterIsNotNull(kClass, "primaryType");
        Intrinsics.checkParameterIsNotNull(kVar, "definition");
        Intrinsics.checkParameterIsNotNull(kind, "kind");
        Intrinsics.checkParameterIsNotNull(list, "secondaryTypes");
        Intrinsics.checkParameterIsNotNull(eVar, "options");
        Intrinsics.checkParameterIsNotNull(fVar, "properties");
        Intrinsics.checkParameterIsNotNull(cVar2, "callbacks");
        return new BeanDefinition<>(cVar, kClass, aVar, kVar, kind, list, eVar, fVar, cVar2);
    }

    /* renamed from: a */
    public final ScopeDefinition mo246645a() {
        return this.f175030a;
    }

    /* renamed from: b */
    public final KClass<?> mo246646b() {
        return this.f175031b;
    }

    /* renamed from: c */
    public final Qualifier mo246647c() {
        return this.f175032c;
    }

    /* renamed from: d */
    public final Function2<Scope, DefinitionParameters, T> mo246648d() {
        return this.f175033d;
    }

    /* renamed from: e */
    public final Kind mo246649e() {
        return this.f175034e;
    }

    /* renamed from: f */
    public final List<KClass<?>> mo246651f() {
        return this.f175035f;
    }

    /* renamed from: g */
    public final Options mo246652g() {
        return this.f175036g;
    }

    /* renamed from: h */
    public final Callbacks<T> mo246653h() {
        return this.f175038i;
    }

    public int hashCode() {
        int i;
        Qualifier aVar = this.f175032c;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + this.f175031b.hashCode()) * 31) + this.f175030a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0039, code lost:
        if (r2 != null) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.definition.BeanDefinition.toString():java.lang.String");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlin/reflect/KClass;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: org.koin.core.definition.a$a */
    static final class C70040a extends Lambda implements Function1<KClass<?>, String> {
        public static final C70040a INSTANCE = new C70040a();

        C70040a() {
            super(1);
        }

        public final String invoke(KClass<?> kClass) {
            Intrinsics.checkParameterIsNotNull(kClass, "it");
            return C70034a.m268608a(kClass);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            BeanDefinition aVar = (BeanDefinition) obj;
            if (!(!Intrinsics.areEqual(this.f175031b, aVar.f175031b)) && !(!Intrinsics.areEqual(this.f175032c, aVar.f175032c)) && !(!Intrinsics.areEqual(this.f175030a, aVar.f175030a))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.k<? super org.koin.core.scope.a, ? super org.koin.core.d.a, ? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends kotlin.reflect.KClass<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    public BeanDefinition(ScopeDefinition cVar, KClass<?> kClass, Qualifier aVar, Function2<? super Scope, ? super DefinitionParameters, ? extends T> kVar, Kind kind, List<? extends KClass<?>> list, Options eVar, Properties fVar, Callbacks<T> cVar2) {
        Intrinsics.checkParameterIsNotNull(cVar, "scopeDefinition");
        Intrinsics.checkParameterIsNotNull(kClass, "primaryType");
        Intrinsics.checkParameterIsNotNull(kVar, "definition");
        Intrinsics.checkParameterIsNotNull(kind, "kind");
        Intrinsics.checkParameterIsNotNull(list, "secondaryTypes");
        Intrinsics.checkParameterIsNotNull(eVar, "options");
        Intrinsics.checkParameterIsNotNull(fVar, "properties");
        Intrinsics.checkParameterIsNotNull(cVar2, "callbacks");
        this.f175030a = cVar;
        this.f175031b = kClass;
        this.f175032c = aVar;
        this.f175033d = kVar;
        this.f175034e = kind;
        this.f175035f = list;
        this.f175036g = eVar;
        this.f175037h = fVar;
        this.f175038i = cVar2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BeanDefinition(org.koin.core.scope.ScopeDefinition r14, kotlin.reflect.KClass r15, org.koin.core.qualifier.Qualifier r16, kotlin.jvm.functions.Function2 r17, org.koin.core.definition.Kind r18, java.util.List r19, org.koin.core.definition.Options r20, org.koin.core.definition.Properties r21, org.koin.core.definition.Callbacks r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x000c
            r1 = r2
            org.koin.core.e.a r1 = (org.koin.core.qualifier.Qualifier) r1
            r6 = r1
            goto L_0x000e
        L_0x000c:
            r6 = r16
        L_0x000e:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0018
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r9 = r1
            goto L_0x001a
        L_0x0018:
            r9 = r19
        L_0x001a:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0027
            org.koin.core.definition.e r1 = new org.koin.core.definition.e
            r3 = 3
            r4 = 0
            r1.<init>(r4, r4, r3, r2)
            r10 = r1
            goto L_0x0029
        L_0x0027:
            r10 = r20
        L_0x0029:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r3 = 1
            if (r1 == 0) goto L_0x0035
            org.koin.core.definition.f r1 = new org.koin.core.definition.f
            r1.<init>(r2, r3, r2)
            r11 = r1
            goto L_0x0037
        L_0x0035:
            r11 = r21
        L_0x0037:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0042
            org.koin.core.definition.c r0 = new org.koin.core.definition.c
            r0.<init>(r2, r3, r2)
            r12 = r0
            goto L_0x0044
        L_0x0042:
            r12 = r22
        L_0x0044:
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.definition.BeanDefinition.<init>(org.koin.core.scope.c, kotlin.reflect.KClass, org.koin.core.e.a, kotlin.jvm.functions.k, org.koin.core.definition.Kind, java.util.List, org.koin.core.definition.e, org.koin.core.definition.f, org.koin.core.definition.c, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
