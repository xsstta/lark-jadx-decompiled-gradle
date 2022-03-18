package com.ss.android.lark.ug.plugin.internal;

import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.Message;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.plugin.ContainerServiceDependency;
import com.ss.android.lark.ug.plugin.ContainerServiceProvider;
import com.ss.android.lark.ug.plugin.ReachPoint;
import com.ss.android.lark.ug.plugin.ReachPointContainerService;
import com.ss.android.lark.ug.plugin.ReachPointPlugin;
import com.ss.android.lark.ug.plugin.ReachPointPluginException;
import com.ss.android.lark.ug.plugin.base.BaseReachPoint;
import com.ss.android.lark.ug.plugin.base.BaseReachPointPlugin;
import com.ss.android.lark.ug.plugin.entity.ReachPointEvent;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0000\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B\u0005¢\u0006\u0002\u0010\u0004J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016J\u001a\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00100\u000eH\u0016JC\u0010\u0011\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u001c\b\u0001\u0010\u0014*\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0015j\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\u00162\u0006\u0010\u0017\u001a\u0002H\u0012H\u0016¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J3\u0010\u001b\u001a\u0004\u0018\u0001H\u0012\"\f\b\u0000\u0010\u0012*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0019\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010!\u001a\u00020\u0007H\u0016JC\u0010\"\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u001c\b\u0001\u0010\u0014*\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0015j\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\u00162\u0006\u0010\u0017\u001a\u0002H\u0012H\u0016¢\u0006\u0002\u0010\u0018J\u0018\u0010\"\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0002H\u0016J \u0010%\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020'H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/ug/plugin/internal/ReachPointContainerServiceImpl;", "Lcom/ss/android/lark/ug/plugin/ReachPointContainerService;", "Lcom/ss/android/lark/ug/plugin/ContainerServiceDependency;", "Lcom/ss/android/lark/ug/plugin/ContainerServiceProvider;", "()V", "serviceDependency", "actionEvent", "", "params", "Lcom/ss/android/lark/ug/plugin/entity/ReachPointEvent;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getReachPointsInfo", "", "", "", "hideReachPoint", "RP", "Lcom/ss/android/lark/ug/plugin/ReachPoint;", "DATA", "Lcom/squareup/wire/Message;", "Lcom/ss/android/lark/ug/plugin/ReachPointData;", "reachPoint", "(Lcom/ss/android/lark/ug/plugin/ReachPoint;)V", "reachPointId", "reachPointType", "obtainReachPoint", "reachPointClazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Lcom/ss/android/lark/ug/plugin/ReachPoint;", "openUrl", "url", "recycleAllReachPoints", "recycleReachPoint", "setDependency", "dataService", "showReachPoint", "bytes", "", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.plugin.c.b */
public final class ReachPointContainerServiceImpl implements ContainerServiceDependency, ContainerServiceProvider, ReachPointContainerService {

    /* renamed from: b */
    public static final Lazy f141758b = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C57535b.INSTANCE);

    /* renamed from: c */
    public static final Companion f141759c = new Companion(null);

    /* renamed from: d */
    private ContainerServiceDependency f141760d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/ug/plugin/internal/ReachPointContainerServiceImpl$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/ug/plugin/ReachPointContainerService;", "getInstance", "()Lcom/ss/android/lark/ug/plugin/ReachPointContainerService;", "instance$delegate", "Lkotlin/Lazy;", "inst", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.plugin.c.b$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f141761a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/ss/android/lark/ug/plugin/ReachPointContainerService;"))};

        /* renamed from: b */
        private final ReachPointContainerService m223366b() {
            Lazy lazy = ReachPointContainerServiceImpl.f141758b;
            Companion aVar = ReachPointContainerServiceImpl.f141759c;
            KProperty kProperty = f141761a[0];
            return (ReachPointContainerService) lazy.getValue();
        }

        private Companion() {
        }

        /* renamed from: a */
        public final ReachPointContainerService mo195259a() {
            return m223366b();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002<\u0012\u0018\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002j\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\u0003\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002j\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\u00030\u00040\u0001J\b\u0010\u0005\u001a\u00020\u0006H\u0016J*\u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002j\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\u00030\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/plugin/internal/ReachPointContainerServiceImpl$obtainReachPoint$1", "Lcom/ss/android/lark/ug/plugin/base/BaseReachPointPlugin;", "Lcom/squareup/wire/Message;", "Lcom/ss/android/lark/ug/plugin/ReachPointData;", "Lcom/ss/android/lark/ug/plugin/base/BaseReachPoint;", "getReachPointType", "", "onCreateReachPoint", "reachPointId", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.plugin.c.b$c */
    public static final class C57536c extends BaseReachPointPlugin<Message<?, ?>, BaseReachPoint<Message<?, ?>>> {

        /* renamed from: b */
        final /* synthetic */ String f141762b;

        /* renamed from: c */
        final /* synthetic */ Class f141763c;

        @Override // com.ss.android.lark.ug.plugin.ReachPointPlugin
        /* renamed from: a */
        public String mo195260a() {
            return this.f141762b;
        }

        /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: com.ss.android.lark.ug.plugin.a.a<?>, com.ss.android.lark.ug.plugin.a.a<com.squareup.wire.Message<?, ?>> */
        @Override // com.ss.android.lark.ug.plugin.base.BaseReachPointPlugin
        /* renamed from: e */
        public BaseReachPoint<Message<?, ?>> mo195232e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reachPointId");
            BaseReachPoint a = BaseReachPoint.f141736f.mo195220a(this.f141763c, str);
            if (a == null) {
                Log.m165383e("ReachPointPlugin", "BaseReachPoint createReachPoint return null ");
                throw new ReachPointPluginException("BaseReachPoint createReachPoint return null ");
            } else if (a != null) {
                return a;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.ug.plugin.base.BaseReachPoint<com.ss.android.lark.ug.plugin.ReachPointData<*, *> /* = com.squareup.wire.Message<*, *> */>");
            }
        }

        C57536c(String str, Class cls) {
            this.f141762b = str;
            this.f141763c = cls;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/ug/plugin/internal/ReachPointContainerServiceImpl;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.plugin.c.b$b */
    static final class C57535b extends Lambda implements Function0<ReachPointContainerServiceImpl> {
        public static final C57535b INSTANCE = new C57535b();

        C57535b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ReachPointContainerServiceImpl invoke() {
            return new ReachPointContainerServiceImpl();
        }
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPointContainerService
    /* renamed from: a */
    public void mo195254a() {
        Collection<ReachPointPlugin> values = new HashMap(PluginManager.f141755b.mo195252a().mo195250a()).values();
        Intrinsics.checkExpressionValueIsNotNull(values, "HashMap(PluginManager.inst().getPlugins()).values");
        for (ReachPointPlugin gVar : values) {
            for (ReachPoint dVar : gVar.mo195228b()) {
                gVar.mo195229b(dVar.mo195214h());
            }
        }
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPointContainerService
    /* renamed from: a */
    public void mo195255a(ContainerServiceDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dataService");
        this.f141760d = aVar;
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPointContainerService
    /* renamed from: a */
    public <RP extends ReachPoint<DATA>, DATA extends Message<?, ?>> void mo195256a(RP rp) {
        Intrinsics.checkParameterIsNotNull(rp, "reachPoint");
        if (!(rp instanceof BaseReachPoint)) {
            rp = null;
        }
        BaseReachPoint aVar = (BaseReachPoint) rp;
        if (aVar != null) {
            mo195258b(aVar.mo195214h(), aVar.mo195219m());
        }
    }

    @Override // com.ss.android.lark.ug.plugin.ContainerServiceDependency, com.ss.android.lark.ug.plugin.ContainerServiceProvider
    /* renamed from: a */
    public void mo195136a(String str) {
        ContainerServiceDependency aVar = this.f141760d;
        if (aVar != null) {
            aVar.mo195136a(str);
        }
    }

    @Override // com.ss.android.lark.ug.plugin.ContainerServiceDependency, com.ss.android.lark.ug.plugin.ContainerServiceProvider
    /* renamed from: a */
    public void mo195135a(ReachPointEvent aVar, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        ContainerServiceDependency aVar2 = this.f141760d;
        if (aVar2 != null) {
            aVar2.mo195135a(aVar, iGetDataCallback);
        }
    }

    /* renamed from: b */
    public void mo195258b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        Intrinsics.checkParameterIsNotNull(str2, "reachPointType");
        ReachPointPlugin<? extends Message<?, ?>, ? extends ReachPoint<? extends Message<?, ?>>> a = PluginManager.f141755b.mo195252a().mo195249a(str2);
        if (a != null) {
            a.mo195229b(str);
        }
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPointContainerService
    /* renamed from: a */
    public <RP extends ReachPoint<?>> RP mo195253a(String str, Class<RP> cls) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        Intrinsics.checkParameterIsNotNull(cls, "reachPointClazz");
        try {
            Class.forName(cls.getName());
            String a = BaseReachPoint.f141736f.mo195221a(cls);
            if (a != null) {
                C57536c a2 = PluginManager.f141755b.mo195252a().mo195249a(a);
                if (a2 == null) {
                    a2 = new C57536c(a, cls);
                    a2.mo195226a(new WeakReference<>(this));
                    PluginManager.f141755b.mo195252a().mo195251a(a2);
                }
                RP rp = (RP) a2.mo195225a(str);
                if (!(rp instanceof ReachPoint)) {
                    return null;
                }
                return rp;
            }
            Log.m165383e("ReachPointPlugin", "ReachPoint obtain error, not found " + cls + " associate reachPointType");
            return null;
        } catch (Exception e) {
            Log.m165384e("ReachPointPlugin", "ReachPoint obtain error", e);
            return null;
        }
    }

    @Override // com.ss.android.lark.ug.plugin.ContainerServiceProvider, com.ss.android.lark.ug.plugin.ReachPointContainerService
    /* renamed from: a */
    public void mo195236a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        Intrinsics.checkParameterIsNotNull(str2, "reachPointType");
        ReachPointPlugin<? extends Message<?, ?>, ? extends ReachPoint<? extends Message<?, ?>>> a = PluginManager.f141755b.mo195252a().mo195249a(str2);
        if (a != null) {
            boolean d = a.mo195231d(str);
            mo195135a(new ReachPointEvent(str, str2, new ReachPointEvent.Event("didHide", d), a.mo195230c(str), null, 16, null), (IGetDataCallback<Boolean>) null);
        }
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPointContainerService
    /* renamed from: a */
    public void mo195257a(String str, String str2, byte[] bArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        Intrinsics.checkParameterIsNotNull(str2, "reachPointType");
        Intrinsics.checkParameterIsNotNull(bArr, "bytes");
        ReachPointPlugin<? extends Message<?, ?>, ? extends ReachPoint<? extends Message<?, ?>>> a = PluginManager.f141755b.mo195252a().mo195249a(str2);
        if (a != null) {
            try {
                z = a.mo195227a(str, bArr);
            } catch (Exception e) {
                Log.m165384e("ReachPointPlugin", "showReachPoint", e);
                z = false;
            }
            mo195135a(new ReachPointEvent(str, str2, new ReachPointEvent.Event("didShow", z), a.mo195230c(str), null, 16, null), (IGetDataCallback<Boolean>) null);
        }
    }
}
