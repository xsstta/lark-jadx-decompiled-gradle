package com.ss.android.lark.magic.provider.impl;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import com.bytedance.feelgood.ADFeelGoodManager;
import com.bytedance.feelgood.p735a.C13910a;
import com.bytedance.feelgood.p735a.C13911b;
import com.bytedance.feelgood.p735a.C13913d;
import com.bytedance.feelgood.p736b.AbstractC13917b;
import com.bytedance.feelgood.p736b.AbstractC13918c;
import com.bytedance.feelgood.p736b.C13916a;
import com.bytedance.feelgood.p737c.AbstractC13924d;
import com.bytedance.feelgood.p737c.AbstractC13926f;
import com.bytedance.feelgood.p737c.AbstractC13927g;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.http.p1186a.AbstractC25988d;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.http.request.AbstractC26011b;
import com.larksuite.framework.http.request.C26010a;
import com.larksuite.framework.http.request.HttpMethod;
import com.larksuite.framework.http.request.RequestBody;
import com.larksuite.framework.http.response.BaseResponse;
import com.larksuite.framework.http.response.ErrorResult;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.biz.core.api.MagicViewContainer;
import com.ss.android.lark.biz.core.api.magic.ErrorInfo;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.magic.C41707a;
import com.ss.android.lark.magic.p2152b.AbstractC41708a;
import com.ss.android.lark.magic.provider.IMagicProvider;
import com.ss.android.lark.magic.provider.ITrigger;
import com.ss.android.lark.magic.provider.TriggerResponse;
import com.ss.android.lark.magic.service.MagicLifecycleService;
import com.ss.android.lark.magic.settings.UGMagicConfigHolder;
import com.ss.android.lark.utils.C57859q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016JB\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J>\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0004J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J@\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/magic/provider/impl/FeelGoodMagicProvider;", "Lcom/ss/android/lark/magic/provider/IMagicProvider;", "()V", "dismiss", "", "scenarioId", "", "doShowMagic", "uniqueTag", "viewContainer", "Lcom/ss/android/lark/biz/core/api/MagicViewContainer;", "sourceParams", "", "response", "Lcom/bytedance/feelgood/entity/SurveyResponse;", "doTrigger", "event", "triggerCallback", "Lcom/ss/android/lark/magic/provider/ITrigger$ITriggerCallback;", "fetchTaskId", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/feelgood/entity/SurveyResponse$Data;", "init", "showMagic", "", "triggerResponse", "Lcom/ss/android/lark/magic/provider/TriggerResponse;", "trigger", "Companion", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.magic.d.a.a */
public final class FeelGoodMagicProvider implements IMagicProvider {

    /* renamed from: a */
    public static final FeelGoodMagicProvider f105932a = new FeelGoodMagicProvider();

    /* renamed from: b */
    public static final Companion f105933b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/magic/provider/impl/FeelGoodMagicProvider$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/lark/magic/provider/impl/FeelGoodMagicProvider;", "inst", "Lcom/ss/android/lark/magic/provider/IMagicProvider;", "setupWindow", "", "window", "Landroid/view/Window;", "isLightStatusBar", "", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.magic.d.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final IMagicProvider mo150026a() {
            return FeelGoodMagicProvider.f105932a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo150027a(Window window, boolean z) {
            if (window != null) {
                window.setDimAmount(BitmapDescriptorFactory.HUE_RED);
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                int i = DynamicModule.f58006b;
                if (z && Build.VERSION.SDK_INT >= 23) {
                    i = 8448;
                }
                View decorView = window.getDecorView();
                Intrinsics.checkExpressionValueIsNotNull(decorView, "window.decorView");
                int systemUiVisibility = decorView.getSystemUiVisibility();
                View decorView2 = window.getDecorView();
                Intrinsics.checkExpressionValueIsNotNull(decorView2, "window.decorView");
                decorView2.setSystemUiVisibility(systemUiVisibility | i);
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
            }
        }
    }

    private FeelGoodMagicProvider() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J2\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J<\u0010\u000f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J2\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fJ\u001c\u0010\u0016\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\u000eR\u0019\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, d2 = {"com/ss/android/lark/magic/provider/impl/FeelGoodMagicProvider$init$1", "Lcom/bytedance/feelgood/net/INetWorkService;", "httpClient", "Lcom/larksuite/framework/http/client/IHttpClient;", "kotlin.jvm.PlatformType", "getHttpClient", "()Lcom/larksuite/framework/http/client/IHttpClient;", "executeGet", "", "url", "", "headers", "", "callback", "Lcom/bytedance/feelgood/net/ResponseCallback;", "executePost", "body", "generateRequest", "Lcom/larksuite/framework/http/request/BaseRequest;", "Lcom/larksuite/framework/http/response/BaseResponse;", "method", "Lcom/larksuite/framework/http/request/HttpMethod;", "startRequest", "request", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.magic.d.a.a$e */
    public static final class C41714e implements AbstractC13917b {

        /* renamed from: a */
        private final AbstractC25990b f105944a;

        C41714e() {
            AbstractC41708a b = C41707a.m165544b();
            Intrinsics.checkExpressionValueIsNotNull(b, "MagicModule.getDependency()");
            this.f105944a = b.mo150008k();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/magic/provider/impl/FeelGoodMagicProvider$init$1$startRequest$1", "Lcom/larksuite/framework/http/request/BaseRequestCallback;", "Lcom/larksuite/framework/http/response/BaseResponse;", "onError", "", "error", "Lcom/larksuite/framework/http/response/ErrorResult;", "onSuccess", "response", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.magic.d.a.a$e$a */
        public static final class C41715a extends AbstractC26011b<BaseResponse> {

            /* renamed from: a */
            final /* synthetic */ C26010a f105945a;

            /* renamed from: b */
            final /* synthetic */ AbstractC13918c f105946b;

            @Override // com.larksuite.framework.http.request.AbstractC26011b
            /* renamed from: a */
            public void mo86433a(ErrorResult errorResult) {
                C13916a aVar;
                if (errorResult != null) {
                    aVar = new C13916a(this.f105945a.mo92474a(), errorResult.getHttpStatusCode(), errorResult.getErrorMessage(), null);
                } else {
                    aVar = new C13916a(this.f105945a.mo92474a(), -1, "ErrorResult is null", null);
                }
                this.f105946b.mo51192a(aVar);
            }

            /* renamed from: a */
            public void mo86434a(BaseResponse baseResponse) {
                C13916a aVar;
                if (baseResponse != null && baseResponse.isSuccessful()) {
                    aVar = new C13916a(this.f105945a.mo92474a(), baseResponse.code(), "", baseResponse.body().mo92409a());
                } else if (baseResponse != null) {
                    aVar = new C13916a(this.f105945a.mo92474a(), baseResponse.code(), baseResponse.message(), null);
                } else {
                    aVar = new C13916a(this.f105945a.mo92474a(), -1, "BaseResponse is null", null);
                }
                this.f105946b.mo51192a(aVar);
            }

            C41715a(C26010a aVar, AbstractC13918c cVar) {
                this.f105945a = aVar;
                this.f105946b = cVar;
            }
        }

        /* renamed from: a */
        public final void mo150029a(C26010a<BaseResponse> aVar, AbstractC13918c cVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "request");
            Intrinsics.checkParameterIsNotNull(cVar, "callback");
            AbstractC25988d a = this.f105944a.mo92412a(aVar);
            Intrinsics.checkExpressionValueIsNotNull(a, "httpClient.newCall(request)");
            a.mo92408a(new C41715a(aVar, cVar));
        }

        /* renamed from: a */
        public final C26010a<BaseResponse> mo150028a(HttpMethod httpMethod, String str, Map<String, String> map) {
            Intrinsics.checkParameterIsNotNull(httpMethod, "method");
            Intrinsics.checkParameterIsNotNull(str, "url");
            C26010a<BaseResponse> aVar = new C26010a<>(httpMethod, str);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    aVar.mo92473a(entry.getKey(), entry.getValue());
                }
            }
            return aVar;
        }

        @Override // com.bytedance.feelgood.p736b.AbstractC13917b
        /* renamed from: a */
        public void mo51261a(String str, Map<String, String> map, String str2, AbstractC13918c cVar) {
            boolean z;
            String str3 = str;
            if (str3 == null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && cVar != null) {
                C26010a<BaseResponse> a = mo150028a(HttpMethod.POST, str, map);
                a.mo92471a(RequestBody.create("application/json", str2));
                mo150029a(a, cVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/magic/provider/impl/FeelGoodMagicProvider$showMagic$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.magic.d.a.a$f */
    static final class RunnableC41716f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TriggerResponse f105947a;

        /* renamed from: b */
        final /* synthetic */ FeelGoodMagicProvider f105948b;

        RunnableC41716f(TriggerResponse eVar, FeelGoodMagicProvider aVar) {
            this.f105947a = eVar;
            this.f105948b = aVar;
        }

        public final void run() {
            try {
                this.f105948b.mo150023a(this.f105947a.mo150042d(), this.f105947a.mo150043e(), this.f105947a.mo150040b(), this.f105947a.mo150041c(), this.f105947a.mo150045g());
            } catch (Exception e) {
                Log.m165384e("FeelGoodMagicProvider", "showMagicContent: failed to show.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo150021a() {
        String str;
        AbstractC41708a b = C41707a.m165544b();
        Intrinsics.checkExpressionValueIsNotNull(b, "MagicModule.getDependency()");
        AbstractC41708a.AbstractC41710b m = b.mo150010m();
        Intrinsics.checkExpressionValueIsNotNull(m, "passportDependency");
        if (m.mo150015d()) {
            str = "cn";
        } else {
            str = "va";
        }
        String a = C57859q.m224565a(m.mo150012a());
        String a2 = C57859q.m224565a(m.mo150014c());
        String a3 = C57859q.m224565a(m.mo150013b());
        AbstractC41708a b2 = C41707a.m165544b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "MagicModule.getDependency()");
        C13910a aVar = new C13910a(UGMagicConfigHolder.f105989a.mo150091c(), str, a2, a, "", C26246a.m94977a(b2.mo149998a()));
        AbstractC41708a b3 = C41707a.m165544b();
        Intrinsics.checkExpressionValueIsNotNull(b3, "MagicModule.getDependency()");
        aVar.mo51234a(b3.mo149999b());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkExpressionValueIsNotNull(a, "encryptUserId");
        linkedHashMap.put("secret_id", a);
        Intrinsics.checkExpressionValueIsNotNull(a3, "tenantId");
        linkedHashMap.put("tenant_id", a3);
        aVar.mo51235a(linkedHashMap);
        ADFeelGoodManager a4 = ADFeelGoodManager.m56278a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "ADFeelGoodManager.getInstance()");
        a4.mo51181a(aVar);
        ADFeelGoodManager.m56278a().mo51185a(new C41714e());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "window", "Landroid/view/Window;", "kotlin.jvm.PlatformType", "onWindowSetup"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.magic.d.a.a$b */
    public static final class C41711b implements AbstractC13924d {

        /* renamed from: a */
        public static final C41711b f105934a = new C41711b();

        C41711b() {
        }

        @Override // com.bytedance.feelgood.p737c.AbstractC13924d
        /* renamed from: a */
        public final void mo51270a(Window window) {
            FeelGoodMagicProvider.f105933b.mo150027a(window, true);
        }
    }

    @Override // com.ss.android.lark.magic.provider.IOpener
    /* renamed from: a */
    public void mo150022a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        try {
            ADFeelGoodManager.m56278a().mo51188c();
        } catch (Exception e) {
            Log.m165384e("FeelGoodMagicProvider", "dismiss: failed to dismiss.", e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0011"}, d2 = {"com/ss/android/lark/magic/provider/impl/FeelGoodMagicProvider$doShowMagic$2", "Lcom/bytedance/feelgood/utils/OpenEventCallBack;", "didClose", "", "surveySuccess", "", "taskID", "", "didOpen", "onMessage", "webView", "Landroid/webkit/WebView;", "openError", "code", "", "errorMsg", "willOpen", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.magic.d.a.a$c */
    public static final class C41712c implements AbstractC13926f {

        /* renamed from: a */
        final /* synthetic */ String f105935a;

        /* renamed from: b */
        final /* synthetic */ MagicLifecycleService f105936b;

        /* renamed from: c */
        final /* synthetic */ String f105937c;

        /* renamed from: d */
        final /* synthetic */ Context f105938d;

        @Override // com.bytedance.feelgood.p737c.AbstractC13926f
        /* renamed from: a */
        public boolean mo51273a(WebView webView, String str) {
            return false;
        }

        @Override // com.bytedance.feelgood.p737c.AbstractC13926f
        /* renamed from: b */
        public void mo51275b(String str) {
            Log.m165389i("FeelGoodMagicProvider", "didOpen: uniqueTag=" + this.f105935a + ", taskID=" + str);
            if (str != null) {
                MagicLifecycleService.m165628a(this.f105936b, this.f105935a, this.f105937c, str, true, null, 16, null);
            }
        }

        @Override // com.bytedance.feelgood.p737c.AbstractC13926f
        /* renamed from: a */
        public boolean mo51274a(String str) {
            Log.m165389i("FeelGoodMagicProvider", "willOpen: uniqueTag=" + this.f105935a + ", taskID=" + str);
            if (str == null) {
                return false;
            }
            this.f105936b.mo150058c(this.f105935a, this.f105937c, str);
            return this.f105936b.mo150055a(this.f105938d, this.f105935a, this.f105937c, str);
        }

        @Override // com.bytedance.feelgood.p737c.AbstractC13926f
        /* renamed from: a */
        public void mo51272a(boolean z, String str) {
            Log.m165389i("FeelGoodMagicProvider", "didClose: uniqueTag=" + this.f105935a + ", taskID=" + str);
            if (str != null) {
                this.f105936b.mo150052a(this.f105935a, this.f105937c, str, z);
            }
        }

        @Override // com.bytedance.feelgood.p737c.AbstractC13926f
        /* renamed from: a */
        public void mo51271a(int i, String str, String str2) {
            Log.m165397w("FeelGoodMagicProvider", "openError: uniqueTag=" + this.f105935a + ", code=" + i + ", errorMsg=" + str + ", taskID=" + str2);
            MagicLifecycleService bVar = this.f105936b;
            String str3 = this.f105935a;
            String str4 = this.f105937c;
            if (str2 == null) {
                str2 = "";
            }
            bVar.mo150053a(str3, str4, str2, false, new ErrorInfo(String.valueOf(i), str));
        }

        C41712c(String str, MagicLifecycleService bVar, String str2, Context context) {
            this.f105935a = str;
            this.f105936b = bVar;
            this.f105937c = str2;
            this.f105938d = context;
        }
    }

    /* renamed from: a */
    private final String m165583a(C13913d.C13914a aVar) {
        boolean z;
        List<String> list = aVar.f36391a;
        boolean z2 = true;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return aVar.f36391a.get(0);
        }
        List<String> list2 = aVar.f36392b;
        if (list2 != null && !list2.isEmpty()) {
            z2 = false;
        }
        if (!z2) {
            return aVar.f36392b.get(0);
        }
        return "";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/magic/provider/impl/FeelGoodMagicProvider$doTrigger$1", "Lcom/bytedance/feelgood/utils/TrigeerEventCallBack;", "onFail", "", "code", "", "errorMessage", "", "onSuccess", "entity", "Lcom/bytedance/feelgood/entity/SurveyResponse;", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.magic.d.a.a$d */
    public static final class C41713d implements AbstractC13927g {

        /* renamed from: a */
        final /* synthetic */ String f105939a;

        /* renamed from: b */
        final /* synthetic */ String f105940b;

        /* renamed from: c */
        final /* synthetic */ String f105941c;

        /* renamed from: d */
        final /* synthetic */ Map f105942d;

        /* renamed from: e */
        final /* synthetic */ ITrigger.ITriggerCallback f105943e;

        @Override // com.bytedance.feelgood.p737c.AbstractC13927g
        /* renamed from: a */
        public void mo51277a(C13913d dVar) {
            C13913d.C13914a aVar;
            if (dVar != null) {
                aVar = dVar.f36390c;
            } else {
                aVar = null;
            }
            if (aVar == null) {
                MagicLifecycleService.f105961b.mo150060a().mo150054a(this.f105939a, this.f105940b, false, new ErrorInfo(null, "SurveyResponse is null", 1, null));
                return;
            }
            MagicLifecycleService.m165629a(MagicLifecycleService.f105961b.mo150060a(), this.f105939a, this.f105940b, true, null, 8, null);
            TriggerResponse eVar = new TriggerResponse(this.f105939a, this.f105940b, this.f105941c, dVar);
            eVar.mo150037a(this.f105942d);
            eVar.mo150038a(dVar.f36390c.f36394d);
            this.f105943e.mo150032a(eVar);
        }

        @Override // com.bytedance.feelgood.p737c.AbstractC13927g
        /* renamed from: a */
        public void mo51276a(int i, String str) {
            Log.m165397w("FeelGoodMagicProvider", "Failed to triggerEvent, errorCode=" + i + ", errorMessage=" + str);
            MagicLifecycleService.f105961b.mo150060a().mo150054a(this.f105939a, this.f105940b, false, new ErrorInfo(String.valueOf(i), str));
        }

        C41713d(String str, String str2, String str3, Map map, ITrigger.ITriggerCallback aVar) {
            this.f105939a = str;
            this.f105940b = str2;
            this.f105941c = str3;
            this.f105942d = map;
            this.f105943e = aVar;
        }
    }

    @Override // com.ss.android.lark.magic.provider.IOpener
    /* renamed from: a */
    public boolean mo150025a(TriggerResponse eVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(eVar, "triggerResponse");
        if (!(eVar.mo150045g() instanceof C13913d) || eVar.mo150045g().f36390c == null) {
            Log.m165389i("FeelGoodMagicProvider", "showMagicContent: Not SurveyResponse.");
        } else {
            mo150021a();
            C13913d.C13914a aVar = eVar.mo150045g().f36390c;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "bizResponse.data");
            String a = m165583a(aVar);
            String str = a;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Log.m165389i("FeelGoodMagicProvider", "taskId is empty.");
                return true;
            }
            MagicLifecycleService.f105961b.mo150060a().mo150057b(eVar.mo150042d(), eVar.mo150043e(), a);
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC41716f(eVar, this));
        }
        return true;
    }

    /* renamed from: b */
    private final void m165584b(String str, String str2, String str3, Map<String, String> map, ITrigger.ITriggerCallback aVar) {
        Log.m165389i("FeelGoodMagicProvider", "doTrigger: uniqueTag=" + str + ", scenarioId=" + str2 + ", event=" + str3);
        ADFeelGoodManager.m56278a().mo51186a(str3, map, new C41713d(str, str2, str3, map, aVar));
    }

    /* renamed from: a */
    public final void mo150023a(String str, String str2, MagicViewContainer awVar, Map<String, String> map, C13913d dVar) {
        Context context;
        MagicLifecycleService a = MagicLifecycleService.f105961b.mo150060a();
        if (awVar != null) {
            context = awVar.mo105615a();
        } else {
            context = null;
        }
        if (context == null) {
            Log.m165383e("FeelGoodMagicProvider", "showMagicContent: context is null");
            a.mo150059d(str, str2, "");
            return;
        }
        C13911b bVar = new C13911b(context, false);
        AbstractC41708a b = C41707a.m165544b();
        Intrinsics.checkExpressionValueIsNotNull(b, "MagicModule.getDependency()");
        bVar.mo51246a(b.mo150001d());
        bVar.mo51247a(C41711b.f105934a);
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        bVar.mo51249a(map);
        ADFeelGoodManager.m56278a().mo51184a(dVar, bVar, new C41712c(str, a, str2, context));
    }

    @Override // com.ss.android.lark.magic.provider.ITrigger
    /* renamed from: a */
    public void mo150024a(String str, String str2, String str3, Map<String, String> map, ITrigger.ITriggerCallback aVar) {
        Intrinsics.checkParameterIsNotNull(str, "uniqueTag");
        Intrinsics.checkParameterIsNotNull(str2, "scenarioId");
        Intrinsics.checkParameterIsNotNull(str3, "event");
        Intrinsics.checkParameterIsNotNull(aVar, "triggerCallback");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("scenario", str2);
        MagicLifecycleService.f105961b.mo150060a().mo150051a(str, str2, str3);
        mo150021a();
        try {
            m165584b(str, str2, str3, linkedHashMap, aVar);
        } catch (Exception e) {
            Log.m165384e("FeelGoodMagicProvider", "trigger: failed to trigger.", e);
            MagicLifecycleService.f105961b.mo150060a().mo150054a(str, str2, false, new ErrorInfo(null, "Failed to trigger", 1, null));
        }
    }
}
