package com.bytedance.ee.bear.onboarding.synchronization;

import android.text.TextUtils;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 82\u00020\u0001:\u00018B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010 \u001a\u00020\u0016J\u0006\u0010!\u001a\u00020\u0016J\u0006\u0010\"\u001a\u00020\u0016J\u0006\u0010#\u001a\u00020\u0004J\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0012J\b\u0010%\u001a\u00020\u0004H\u0002J\u000e\u0010&\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0013J\u000e\u0010)\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u0013J\u0014\u0010)\u001a\u00020\u00162\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130+J\b\u0010,\u001a\u00020\u0016H\u0002J,\u0010-\u001a\u00020\u00162\"\u0010.\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040/j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0004`0H\u0002J\u001a\u00101\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00132\b\b\u0002\u00102\u001a\u00020\u0004H\u0002J\b\u00103\u001a\u00020\u0016H\u0002J\u0010\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u0013H\u0002J\u0006\u00105\u001a\u00020\u0016J\b\u00106\u001a\u00020\u0016H\u0002J\u0010\u00106\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u0013H\u0002J\u000e\u00107\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u0013J\u0014\u00107\u001a\u00020\u00162\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130+R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0012X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u001eX\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/synchronization/OnBoardingSynchronizer;", "", "()V", "<set-?>", "", "initialized", "getInitialized", "()Z", "nativeOnlyMode", "onBoardingNetworkSynchronizer", "Lcom/bytedance/ee/bear/onboarding/synchronization/IOnBoardingNetSynchronizer;", "getOnBoardingNetworkSynchronizer", "()Lcom/bytedance/ee/bear/onboarding/synchronization/IOnBoardingNetSynchronizer;", "onBoardingNetworkSynchronizerLazy", "Lkotlin/Lazy;", "onBoardingPrefDataManager", "Lcom/bytedance/ee/bear/onboarding/synchronization/OnBoardingPrefDataManager;", "onBoardingsCacheMap", "", "", "onInitCallback", "Lkotlin/Function0;", "", "getOnInitCallback", "()Lkotlin/jvm/functions/Function0;", "setOnInitCallback", "(Lkotlin/jvm/functions/Function0;)V", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "toSetFinishOnBoardingIds", "", "toUpdateOnBoardingIds", "clearPreference", "dispose", "fetchFromRemote", "getDebugMode", "getMissionStatusMap", "getNativeOnlyMode", "init", "isFinished", "id", "setFinished", "idList", "", "setInitialized", "setPatchStatusToPreference", "map", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "setStatusToPreference", UpdateKey.STATUS, "syncDoneToRemote", "action", "syncToRemote", "syncUpdateToRemote", "update", "Companion", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.synchronization.f */
public final class OnBoardingSynchronizer {

    /* renamed from: d */
    public static final String f28004d;

    /* renamed from: e */
    public static final Companion f28005e = new Companion(null);

    /* renamed from: a */
    public final Map<String, Boolean> f28006a = new HashMap();

    /* renamed from: b */
    public final List<String> f28007b = new ArrayList();

    /* renamed from: c */
    public final List<String> f28008c = new ArrayList();

    /* renamed from: f */
    private C10917c f28009f;

    /* renamed from: g */
    private Lazy<? extends IOnBoardingNetSynchronizer> f28010g;

    /* renamed from: h */
    private C10419d f28011h;

    /* renamed from: i */
    private boolean f28012i;

    /* renamed from: j */
    private Function0<Unit> f28013j;

    /* renamed from: k */
    private boolean f28014k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/synchronization/OnBoardingSynchronizer$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.f$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo39685a() {
            return OnBoardingSynchronizer.f28004d;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo39676a() {
        return this.f28014k;
    }

    /* renamed from: e */
    public final void mo39681e() {
        C10419d dVar = this.f28011h;
        if (dVar != null) {
            dVar.mo39659c();
        }
    }

    /* renamed from: i */
    private final IOnBoardingNetSynchronizer m43333i() {
        Lazy<? extends IOnBoardingNetSynchronizer> lazy = this.f28010g;
        if (lazy != null) {
            return (IOnBoardingNetSynchronizer) lazy.getValue();
        }
        return null;
    }

    /* renamed from: d */
    public final Map<String, Boolean> mo39680d() {
        if (this.f28014k) {
            return this.f28006a;
        }
        return new HashMap();
    }

    /* renamed from: f */
    public final void mo39682f() {
        this.f28014k = true;
        Function0<Unit> function0 = this.f28013j;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* renamed from: g */
    public final void mo39683g() {
        IOnBoardingNetSynchronizer i = m43333i();
        if (i != null) {
            i.mo39640a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/onboarding/synchronization/IOnBoardingNetSynchronizer;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.f$d */
    public static final class C10431d extends Lambda implements Function0<IOnBoardingNetSynchronizer> {
        final /* synthetic */ C10917c $serviceContext;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10431d(C10917c cVar) {
            super(0);
            this.$serviceContext = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final IOnBoardingNetSynchronizer invoke() {
            if (C4211a.m17514a().mo16536a("lark.client.guide.ccm.data.migration", false)) {
                return new OnBoardingRustSynchronizer();
            }
            return new OnBoardingNetworkSynchronizer(this.$serviceContext);
        }
    }

    static {
        String simpleName = OnBoardingSynchronizer.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "OnBoardingSynchronizer::class.java.simpleName");
        f28004d = simpleName;
    }

    /* renamed from: k */
    private final void m43335k() {
        if (!this.f28008c.isEmpty()) {
            m43331c(this.f28008c.get(0));
        }
    }

    /* renamed from: l */
    private final void m43336l() {
        if (!this.f28007b.isEmpty()) {
            m43332d(this.f28007b.get(0));
        }
    }

    /* renamed from: b */
    public final void mo39677b() {
        if (!this.f28007b.isEmpty()) {
            m43336l();
        } else if (!this.f28008c.isEmpty()) {
            m43335k();
        }
    }

    /* renamed from: h */
    public final void mo39684h() {
        IOnBoardingNetSynchronizer i;
        if (!this.f28014k && (i = m43333i()) != null) {
            i.mo39642a(new C10429b(this), new C10430c(this));
        }
    }

    /* renamed from: j */
    private final boolean m43334j() {
        boolean z;
        al d = C4511g.m18594d();
        Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
        if (TextUtils.equals("release", d.mo17367q())) {
            z = false;
        } else {
            z = true;
        }
        PersistenceSharedPreference aVar = new PersistenceSharedPreference("debug_config");
        if (!z || !((Boolean) aVar.mo34038b("global_onboarding_native_only_enable", false)).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo39679c() {
        boolean z;
        al d = C4511g.m18594d();
        Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
        if (TextUtils.equals("release", d.mo17367q())) {
            z = false;
        } else {
            z = true;
        }
        PersistenceSharedPreference aVar = new PersistenceSharedPreference("debug_config");
        if (!z || !((Boolean) aVar.mo34038b("global_onboarding_enable", false)).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo39675a(Function0<Unit> function0) {
        this.f28013j = function0;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.f$b */
    public static final class C10429b extends Lambda implements Function1<Map<String, ? extends Boolean>, Unit> {
        final /* synthetic */ OnBoardingSynchronizer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10429b(OnBoardingSynchronizer fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Boolean> map) {
            invoke((Map<String, Boolean>) map);
            return Unit.INSTANCE;
        }

        public final void invoke(Map<String, Boolean> map) {
            if (map != null) {
                HashMap<String, Boolean> hashMap = new HashMap<>();
                for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                    String key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    Boolean bool = this.this$0.f28006a.get(key);
                    if (bool == null) {
                        this.this$0.f28006a.put(key, Boolean.valueOf(booleanValue));
                        hashMap.put(key, Boolean.valueOf(booleanValue));
                    } else if (!Intrinsics.areEqual(bool, Boolean.valueOf(booleanValue))) {
                        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                            this.this$0.f28007b.add(key);
                            C13479a.m54772d("OnBoardingManager", "server data is old : onboarding[" + key + "]: " + booleanValue);
                        } else {
                            C13479a.m54772d("OnBoardingManager", "server data is new ,need update local: onboarding[" + key + "]: " + booleanValue);
                            this.this$0.f28006a.put(key, true);
                            hashMap.put(key, true);
                        }
                    }
                }
                if (!hashMap.isEmpty()) {
                    this.this$0.mo39673a(hashMap);
                }
                this.this$0.mo39682f();
                this.this$0.mo39677b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.f$c */
    public static final class C10430c extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ OnBoardingSynchronizer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10430c(OnBoardingSynchronizer fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            String str;
            this.this$0.mo39682f();
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(OnBoardingSynchronizer.f28005e.mo39685a());
            sb.append("]fetchFromRemote error! msg: ");
            if (th != null) {
                str = th.toString();
            } else {
                str = null;
            }
            sb.append(str);
            C13479a.m54772d("OnBoardingManager", sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.f$f */
    public static final class C10433f extends Lambda implements Function1<Throwable, Unit> {
        public static final C10433f INSTANCE = new C10433f();

        C10433f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Sync onBoarding status error! msg: ");
            if (th != null) {
                str = th.toString();
            } else {
                str = null;
            }
            sb.append(str);
            C13479a.m54758a("OnBoardingManager", sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.f$h */
    public static final class C10435h extends Lambda implements Function1<Throwable, Unit> {
        public static final C10435h INSTANCE = new C10435h();

        C10435h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Sync onBoarding status error! msg: ");
            if (th != null) {
                str = th.toString();
            } else {
                str = null;
            }
            sb.append(str);
            C13479a.m54758a("OnBoardingManager", sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.f$e */
    public static final class C10432e extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ String $action;
        final /* synthetic */ OnBoardingSynchronizer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10432e(OnBoardingSynchronizer fVar, String str) {
            super(1);
            this.this$0 = fVar;
            this.$action = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (!z) {
                String a = OnBoardingSynchronizer.f28005e.mo39685a();
                C13479a.m54758a(a, "sync OnBoardingType[" + this.$action + "] 's status failed...");
                return;
            }
            String a2 = OnBoardingSynchronizer.f28005e.mo39685a();
            C13479a.m54772d(a2, "sync OnBoardingType[" + this.$action + "] 's status succeed...");
            this.this$0.f28007b.remove(this.$action);
            this.this$0.mo39677b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "onBoardingStatus", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.f$g */
    public static final class C10434g extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ String $action;
        final /* synthetic */ OnBoardingSynchronizer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10434g(OnBoardingSynchronizer fVar, String str) {
            super(1);
            this.this$0 = fVar;
            this.$action = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                this.this$0.mo39672a(this.$action, true);
                this.this$0.f28006a.put(this.$action, true);
            }
            String a = OnBoardingSynchronizer.f28005e.mo39685a();
            C13479a.m54772d(a, "sync OnBoardingType[" + this.$action + "] 's status succeed...，updatedStatus: " + z);
            this.this$0.f28008c.remove(this.$action);
            this.this$0.mo39677b();
        }
    }

    /* renamed from: a */
    public final void mo39673a(HashMap<String, Boolean> hashMap) {
        C13479a.m54772d("OnBoardingManager", "setPatchStatusToPreference: " + hashMap);
        C10419d dVar = this.f28011h;
        if (dVar != null) {
            dVar.mo39657a(hashMap);
        }
    }

    /* renamed from: c */
    private final void m43331c(String str) {
        if (this.f28012i) {
            C13479a.m54772d(f28004d, "In native mode，don't sync to remote.");
            return;
        }
        IOnBoardingNetSynchronizer i = m43333i();
        if (i != null) {
            i.mo39643b(str, new C10434g(this, str), C10435h.INSTANCE);
        }
    }

    /* renamed from: d */
    private final void m43332d(String str) {
        if (this.f28012i) {
            C13479a.m54772d(f28004d, "In native mode，don't sync to remote.");
            return;
        }
        IOnBoardingNetSynchronizer i = m43333i();
        if (i != null) {
            i.mo39641a(str, new C10432e(this, str), C10433f.INSTANCE);
        }
    }

    /* renamed from: a */
    public final void mo39671a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        if (!mo39678b(str)) {
            this.f28006a.put(str, true);
            this.f28007b.add(str);
            m43330a(this, str, false, 2, null);
            m43336l();
        }
    }

    /* renamed from: b */
    public final boolean mo39678b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        if (this.f28014k) {
            Boolean bool = this.f28006a.get(str);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        C13479a.m54758a(f28004d, "OnBoardingSynchronizer hasn't initialized.");
        return true;
    }

    /* renamed from: a */
    public final void mo39670a(C10917c cVar) {
        Map<String, Boolean> map;
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f28009f = cVar;
        this.f28010g = LazyKt.lazy(new C10431d(cVar));
        C10419d dVar = new C10419d("ccm_onboarding_config");
        this.f28011h = dVar;
        Map<String, Boolean> map2 = this.f28006a;
        if (dVar == null || (map = dVar.mo39658b()) == null) {
            map = MapsKt.emptyMap();
        }
        map2.putAll(map);
        C13479a.m54772d("OnBoardingManager", " onBoardingIdsCacheMap : " + this.f28006a);
        this.f28012i = m43334j();
        String str = f28004d;
        C13479a.m54772d(str, "In native only mode? " + this.f28012i);
        if (this.f28012i) {
            mo39682f();
        }
    }

    /* renamed from: a */
    public final void mo39674a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "idList");
        HashMap<String, Boolean> hashMap = new HashMap<>();
        for (T t : list) {
            if (!mo39678b(t)) {
                this.f28006a.put(t, true);
                this.f28007b.add(t);
                hashMap.put(t, true);
            }
        }
        mo39673a(hashMap);
        m43336l();
    }

    /* renamed from: a */
    public final void mo39672a(String str, boolean z) {
        C13479a.m54772d("OnBoardingManager", "setStatusToPreference[" + str + "]: " + z);
        C10419d dVar = this.f28011h;
        if (dVar != null) {
            dVar.mo39656a(str, z);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m43330a(OnBoardingSynchronizer fVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        fVar.mo39672a(str, z);
    }
}
