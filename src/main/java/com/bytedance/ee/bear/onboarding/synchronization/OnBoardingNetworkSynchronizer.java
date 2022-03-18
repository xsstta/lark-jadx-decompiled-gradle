package com.bytedance.ee.bear.onboarding.synchronization;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.onboarding.synchronization.FetchOnBoardingResult;
import com.bytedance.ee.bear.onboarding.synchronization.UpdateOnBoardingResult;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\rH\u0002J@\u0010\u0016\u001a\u00020\u00112 \u0010\u0017\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00110\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00110\u0018H\u0016J:\u0010\u001b\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00110\u0018H\u0016J:\u0010\u001c\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00110\u0018H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/synchronization/OnBoardingNetworkSynchronizer;", "Lcom/bytedance/ee/bear/onboarding/synchronization/IOnBoardingNetSynchronizer;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "(Lcom/bytedance/ee/bear/service/ServiceContext;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "createDoneOnBoardingRequest", "Lcom/bytedance/ee/bear/contract/NetService$SimpleRequest;", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "action", "", "createGetOnBoardingRequest", "Lcom/bytedance/ee/bear/onboarding/synchronization/FetchOnBoardingResult;", "createUpdateOnBoardingRequest", "Lcom/bytedance/ee/bear/onboarding/synchronization/UpdateOnBoardingResult;", "dispose", "", "extractOnBoardingIdMap", "", "", "getResult", "fetchOnBoardings", "onResult", "Lkotlin/Function1;", "onError", "", "syncDoneToRemote", "syncUpdateToRemote", "Companion", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.synchronization.b */
public final class OnBoardingNetworkSynchronizer implements IOnBoardingNetSynchronizer {

    /* renamed from: a */
    public static final String f27974a;

    /* renamed from: b */
    public static final Companion f27975b = new Companion(null);

    /* renamed from: c */
    private Disposable f27976c;

    /* renamed from: d */
    private final C10917c f27977d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/synchronization/OnBoardingNetworkSynchronizer$Companion;", "", "()V", "DONE_ONBOARDING_PROTOCOL_URL", "", "GET_ONBOARDING_LIST_PROTOCOL_URL", "PARAM_ACTION_NAME", "PARAM_TYPE_NAME", "PARAM_TYPE_VALUE", "TAG", "getTAG", "()Ljava/lang/String;", "UPDATE_ONBOARDING_PROTOCOL_URL", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.onboarding.synchronization.IOnBoardingNetSynchronizer
    /* renamed from: a */
    public void mo39640a() {
        Disposable disposable = this.f27976c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.b$c */
    static final class C10407c extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function1 $onError;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10407c(Function1 function1) {
            super(0);
            this.$onError = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.$onError.invoke(new NullPointerException("OnBoardingManager: return null when parse onBoarding response json"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.b$g */
    static final class C10411g extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function1 $onError;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10411g(Function1 function1) {
            super(0);
            this.$onError = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.$onError.invoke(new NullPointerException("OnBoardingManager: return null when parse onBoarding result json"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.b$k */
    static final class C10415k extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function1 $onError;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10415k(Function1 function1) {
            super(0);
            this.$onError = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.$onError.invoke(new NullPointerException("OnBoardingManager: return null when parse update onBoarding result json"));
        }
    }

    static {
        String simpleName = OnBoardingNetworkSynchronizer.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "OnBoardingNetworkSynchro…er::class.java.simpleName");
        f27974a = simpleName;
    }

    /* renamed from: b */
    private final NetService.C5077f<FetchOnBoardingResult> m43297b() {
        NetService.C5077f<FetchOnBoardingResult> fVar = new NetService.C5077f<>("/api/user_guide/get/");
        fVar.mo20143a(1);
        Map<String, String> d = fVar.mo20155d();
        Intrinsics.checkExpressionValueIsNotNull(d, "params");
        d.put(ShareHitPoint.f121869d, "android");
        return fVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "errorCode", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.b$d */
    static final class C10408d extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ Function1 $onError;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10408d(Function1 function1) {
            super(1);
            this.$onError = function1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            Function1 function1 = this.$onError;
            function1.invoke(new RuntimeException("OnBoardingManager: server response error code: " + i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/onboarding/synchronization/FetchOnBoardingResult;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.b$e */
    static final class C10409e<T extends NetService.Result<Serializable>> implements NetService.AbstractC5074c<FetchOnBoardingResult> {

        /* renamed from: a */
        public static final C10409e f27982a = new C10409e();

        C10409e() {
        }

        /* renamed from: a */
        public final FetchOnBoardingResult parse(String str) {
            return (FetchOnBoardingResult) JSON.parseObject(str, FetchOnBoardingResult.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "errorCode", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.b$h */
    static final class C10412h extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ Function1 $onError;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10412h(Function1 function1) {
            super(1);
            this.$onError = function1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            Function1 function1 = this.$onError;
            function1.invoke(new RuntimeException("OnBoardingManager: server response error code: " + i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.b$i */
    static final class C10413i<T extends NetService.Result<Serializable>> implements NetService.AbstractC5074c<SimpleRequestResult> {

        /* renamed from: a */
        public static final C10413i f27986a = new C10413i();

        C10413i() {
        }

        /* renamed from: a */
        public final SimpleRequestResult parse(String str) {
            return (SimpleRequestResult) JSON.parseObject(str, SimpleRequestResult.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "errorCode", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.b$l */
    static final class C10416l extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ Function1 $onError;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10416l(Function1 function1) {
            super(1);
            this.$onError = function1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            Function1 function1 = this.$onError;
            function1.invoke(new RuntimeException("OnBoardingManager: server response error code: " + i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/onboarding/synchronization/UpdateOnBoardingResult;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.b$m */
    static final class C10417m<T extends NetService.Result<Serializable>> implements NetService.AbstractC5074c<UpdateOnBoardingResult> {

        /* renamed from: a */
        public static final C10417m f27990a = new C10417m();

        C10417m() {
        }

        /* renamed from: a */
        public final UpdateOnBoardingResult parse(String str) {
            return (UpdateOnBoardingResult) JSON.parseObject(str, UpdateOnBoardingResult.class);
        }
    }

    public OnBoardingNetworkSynchronizer(C10917c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f27977d = cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "getResult", "Lcom/bytedance/ee/bear/onboarding/synchronization/FetchOnBoardingResult;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.b$b */
    static final class C10406b<T> implements Consumer<FetchOnBoardingResult> {

        /* renamed from: a */
        final /* synthetic */ OnBoardingNetworkSynchronizer f27978a;

        /* renamed from: b */
        final /* synthetic */ Function0 f27979b;

        /* renamed from: c */
        final /* synthetic */ Function1 f27980c;

        /* renamed from: d */
        final /* synthetic */ Function1 f27981d;

        C10406b(OnBoardingNetworkSynchronizer bVar, Function0 function0, Function1 function1, Function1 function12) {
            this.f27978a = bVar;
            this.f27979b = function0;
            this.f27980c = function1;
            this.f27981d = function12;
        }

        /* renamed from: a */
        public final void accept(FetchOnBoardingResult fetchOnBoardingResult) {
            if (fetchOnBoardingResult == null) {
                this.f27979b.invoke();
            } else if (fetchOnBoardingResult.code != 0) {
                this.f27980c.invoke(Integer.valueOf(fetchOnBoardingResult.code));
            } else {
                C13479a.m54772d("OnBoardingManager", ((FetchOnBoardingResult.Data) fetchOnBoardingResult.data).toString());
                this.f27981d.invoke(this.f27978a.mo39644a(fetchOnBoardingResult));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "getResult", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.b$f */
    static final class C10410f<T> implements Consumer<SimpleRequestResult> {

        /* renamed from: a */
        final /* synthetic */ Function0 f27983a;

        /* renamed from: b */
        final /* synthetic */ Function1 f27984b;

        /* renamed from: c */
        final /* synthetic */ Function1 f27985c;

        C10410f(Function0 function0, Function1 function1, Function1 function12) {
            this.f27983a = function0;
            this.f27984b = function1;
            this.f27985c = function12;
        }

        /* renamed from: a */
        public final void accept(SimpleRequestResult simpleRequestResult) {
            if (simpleRequestResult == null) {
                this.f27983a.invoke();
            } else if (simpleRequestResult.code != 0) {
                this.f27984b.invoke(Integer.valueOf(simpleRequestResult.code));
            } else {
                this.f27985c.invoke(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "getResult", "Lcom/bytedance/ee/bear/onboarding/synchronization/UpdateOnBoardingResult;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.b$j */
    static final class C10414j<T> implements Consumer<UpdateOnBoardingResult> {

        /* renamed from: a */
        final /* synthetic */ Function0 f27987a;

        /* renamed from: b */
        final /* synthetic */ Function1 f27988b;

        /* renamed from: c */
        final /* synthetic */ Function1 f27989c;

        C10414j(Function0 function0, Function1 function1, Function1 function12) {
            this.f27987a = function0;
            this.f27988b = function1;
            this.f27989c = function12;
        }

        /* renamed from: a */
        public final void accept(UpdateOnBoardingResult updateOnBoardingResult) {
            if (updateOnBoardingResult == null) {
                this.f27987a.invoke();
            } else if (updateOnBoardingResult.code != 0) {
                this.f27988b.invoke(Integer.valueOf(updateOnBoardingResult.code));
            } else {
                this.f27989c.invoke(Boolean.valueOf(((UpdateOnBoardingResult.Data) updateOnBoardingResult.data).is_done));
            }
        }
    }

    /* renamed from: a */
    private final NetService.C5077f<SimpleRequestResult> m43296a(String str) {
        NetService.C5077f<SimpleRequestResult> fVar = new NetService.C5077f<>("/api/user_guide/done/");
        fVar.mo20143a(1);
        Map<String, String> d = fVar.mo20155d();
        Intrinsics.checkExpressionValueIsNotNull(d, "params");
        d.put(ShareHitPoint.f121869d, "android");
        Map<String, String> d2 = fVar.mo20155d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "params");
        d2.put("action", str);
        Map<String, String> d3 = fVar.mo20155d();
        Intrinsics.checkExpressionValueIsNotNull(d3, "params");
        d3.put("context", "context");
        return fVar;
    }

    /* renamed from: b */
    private final NetService.C5077f<UpdateOnBoardingResult> m43298b(String str) {
        NetService.C5077f<UpdateOnBoardingResult> fVar = new NetService.C5077f<>("/api/user_guide/update/");
        fVar.mo20143a(1);
        Map<String, String> d = fVar.mo20155d();
        Intrinsics.checkExpressionValueIsNotNull(d, "params");
        d.put(ShareHitPoint.f121869d, "android");
        Map<String, String> d2 = fVar.mo20155d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "params");
        d2.put("action", str);
        Map<String, String> d3 = fVar.mo20155d();
        Intrinsics.checkExpressionValueIsNotNull(d3, "params");
        d3.put("context", "context");
        return fVar;
    }

    /* renamed from: a */
    public final Map<String, Boolean> mo39644a(FetchOnBoardingResult fetchOnBoardingResult) {
        Map<String, FetchOnBoardingResult.Guide> map;
        HashMap hashMap = new HashMap();
        FetchOnBoardingResult.Data data = (FetchOnBoardingResult.Data) fetchOnBoardingResult.data;
        if (!(data == null || (map = data.guides) == null)) {
            for (Map.Entry<String, FetchOnBoardingResult.Guide> entry : map.entrySet()) {
                String key = entry.getKey();
                Intrinsics.checkExpressionValueIsNotNull(key, "key");
                hashMap.put(key, Boolean.valueOf(entry.getValue().is_done));
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.ee.bear.onboarding.synchronization.IOnBoardingNetSynchronizer
    /* renamed from: a */
    public void mo39642a(Function1<? super Map<String, Boolean>, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(function1, "onResult");
        Intrinsics.checkParameterIsNotNull(function12, "onError");
        Disposable disposable = this.f27976c;
        if (disposable != null) {
            disposable.dispose();
        }
        C10407c cVar = new C10407c(function12);
        C10408d dVar = new C10408d(function12);
        NetService netService = (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null);
        if (netService == null) {
            function12.invoke(new RuntimeException("OnBoardingManager: get net service error"));
        } else {
            this.f27976c = netService.mo20117a(C10409e.f27982a).mo20141a(m43297b()).mo238001b(new C10406b(this, cVar, dVar, function1), new C10418c(function12));
        }
    }

    @Override // com.bytedance.ee.bear.onboarding.synchronization.IOnBoardingNetSynchronizer
    /* renamed from: b */
    public void mo39643b(String str, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "action");
        Intrinsics.checkParameterIsNotNull(function1, "onResult");
        Intrinsics.checkParameterIsNotNull(function12, "onError");
        Disposable disposable = this.f27976c;
        if (disposable != null) {
            disposable.dispose();
        }
        C10415k kVar = new C10415k(function12);
        C10416l lVar = new C10416l(function12);
        NetService netService = (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null);
        if (netService == null) {
            function12.invoke(new RuntimeException("OnBoardingManager: get net service error"));
        } else {
            this.f27976c = netService.mo20117a(C10417m.f27990a).mo20141a(m43298b(str)).mo238001b(new C10414j(kVar, lVar, function1), new C10418c(function12));
        }
    }

    @Override // com.bytedance.ee.bear.onboarding.synchronization.IOnBoardingNetSynchronizer
    /* renamed from: a */
    public void mo39641a(String str, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "action");
        Intrinsics.checkParameterIsNotNull(function1, "onResult");
        Intrinsics.checkParameterIsNotNull(function12, "onError");
        Disposable disposable = this.f27976c;
        if (disposable != null) {
            disposable.dispose();
        }
        C10411g gVar = new C10411g(function12);
        C10412h hVar = new C10412h(function12);
        NetService netService = (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null);
        if (netService == null) {
            function12.invoke(new RuntimeException("OnBoardingManager: get net service error"));
        } else {
            this.f27976c = netService.mo20117a(C10413i.f27986a).mo20141a(m43296a(str)).mo238001b(new C10410f(gVar, hVar, function1), new C10418c(function12));
        }
    }
}
