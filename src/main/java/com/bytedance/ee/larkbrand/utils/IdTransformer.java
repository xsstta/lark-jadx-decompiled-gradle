package com.bytedance.ee.larkbrand.utils;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12868d;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12869e;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12870f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.infra.network.department.DepartmentIds2OpenDepartmentIdsConfig;
import com.larksuite.component.openplatform.infra.network.openchatid2chatid.C25549a;
import com.larksuite.component.openplatform.infra.network.openchatid2chatid.OpenChatId2ChatIdConfig;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.common.p3417c.C67750b;
import com.tt.refer.common.service.net.C67852a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import io.reactivex.functions.Consumer;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0001\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00130\u00192!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00130\u00192\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u0006Jr\u0010%\u001a\u00020\u00132\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0006\u0010 \u001a\u00020\u00102\u0006\u0010\"\u001a\u00020'2\u0006\u0010$\u001a\u00020\u00062!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00130\u00192!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00130\u0019J¤\u0001\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00062\"\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\f2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u00062!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00130\u00192!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00130\u0019H\u0003Jr\u0010,\u001a\u00020\u00132\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0006\u0010 \u001a\u00020\u00102\u0006\u0010.\u001a\u00020'2\u0006\u0010!\u001a\u00020\u000f2!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00130\u00192!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00130\u0019Jl\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00102\u0006\u0010\"\u001a\u00020'2\u0006\u0010$\u001a\u00020\u00062!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00130\u00192!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00130\u0019Jr\u0010/\u001a\u00020\u00132\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0006\u0010 \u001a\u00020\u00102\u0006\u0010\"\u001a\u00020'2\u0006\u0010$\u001a\u00020\u00062!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00130\u00192!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00130\u0019R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R0\u0010\t\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\f0\nX\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000eX\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/bytedance/ee/larkbrand/utils/IdTransformer;", "", "()V", "CHAT_TYPE_BOT", "", "TAG", "", "USER_TYPE_BOT", "USER_TYPE_USER", "commonHeader", "Lkotlin/Function0;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "commonParams", "Lkotlin/Function2;", "Lcom/tt/refer/common/service/net/EncryptContext;", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "Lorg/json/JSONObject;", "chatIds2OpenChatIds", "", "headMap", "chats", "", "Lcom/larksuite/framework/apiplugin/common/Messenger$ChatRequest;", "success", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "failure", "", ApiHandler.API_CALLBACK_EXCEPTION, "appContext", "encryptContext", "traceSpan", "Lcom/ss/android/lark/optrace/api/TracingCoreSpan;", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "departmentIds2OpenDepartmentIds", "departmentIds", "Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "doRequest", "path", "head", "params", "newChatIds2OpenChatIds", "openChatIds", "requestTrace", "openChatIds2ChatIds", "openChatId", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.utils.o */
public final class IdTransformer {

    /* renamed from: a */
    public static final IdTransformer f35273a = new IdTransformer();

    /* renamed from: b */
    private static final Function0<HashMap<String, String>> f35274b = C13366a.INSTANCE;

    /* renamed from: c */
    private static final Function2<C67852a, IAppContext, JSONObject> f35275c = C13367b.INSTANCE;

    private IdTransformer() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.utils.o$a */
    static final class C13366a extends Lambda implements Function0<HashMap<String, String>> {
        public static final C13366a INSTANCE = new C13366a();

        C13366a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HashMap<String, String> invoke() {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("EENet-Request-Enable-Complex-Connect", "true");
            return hashMap;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.utils.o$d */
    public static final class C13369d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ Function1 f35282a;

        C13369d(Function1 function1) {
            this.f35282a = function1;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Function1 function1 = this.f35282a;
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            function1.invoke(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/lark/infra/network/option/net/TmaResponse;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.utils.o$c */
    public static final class C13368c<T> implements Consumer<C12830f> {

        /* renamed from: a */
        final /* synthetic */ IAppContext f35276a;

        /* renamed from: b */
        final /* synthetic */ TracingCoreSpan f35277b;

        /* renamed from: c */
        final /* synthetic */ String f35278c;

        /* renamed from: d */
        final /* synthetic */ Function1 f35279d;

        /* renamed from: e */
        final /* synthetic */ C67852a f35280e;

        /* renamed from: f */
        final /* synthetic */ Function1 f35281f;

        C13368c(IAppContext iAppContext, TracingCoreSpan tracingCoreSpan, String str, Function1 function1, C67852a aVar, Function1 function12) {
            this.f35276a = iAppContext;
            this.f35277b = tracingCoreSpan;
            this.f35278c = str;
            this.f35279d = function1;
            this.f35280e = aVar;
            this.f35281f = function12;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b2, code lost:
            if (kotlin.text.StringsKt.isBlank(r3) != false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c9, code lost:
            if (kotlin.text.StringsKt.isBlank(r1) != false) goto L_0x00cb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e0, code lost:
            if (kotlin.text.StringsKt.isBlank(r0) == false) goto L_0x00e2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e2, code lost:
            r0 = r12.f35281f;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, "result");
            r0.invoke(r5);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void accept(com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f r13) {
            /*
            // Method dump skipped, instructions count: 290
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.larkbrand.utils.IdTransformer.C13368c.accept(com.bytedance.ee.lark.infra.network.c.a.f):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "encryptContext", "Lcom/tt/refer/common/service/net/EncryptContext;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.utils.o$b */
    static final class C13367b extends Lambda implements Function2<C67852a, IAppContext, JSONObject> {
        public static final C13367b INSTANCE = new C13367b();

        C13367b() {
            super(2);
        }

        public final JSONObject invoke(C67852a aVar, IAppContext iAppContext) {
            Intrinsics.checkParameterIsNotNull(aVar, "encryptContext");
            Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
            String appId = iAppContext.getAppId();
            IBaseService findServiceByInterface = iAppContext.findServiceByInterface(AbstractC67709b.class);
            Intrinsics.checkExpressionValueIsNotNull(findServiceByInterface, "appContext.findServiceBy… IAPIService::class.java)");
            ((AbstractC67709b.AbstractC67710a) ((AbstractC67709b) findServiceByInterface).mo235130i()).mo235054g(appId);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, appId);
            jSONObject.put("ttcode", aVar.mo235486a(iAppContext));
            return jSONObject;
        }
    }

    /* renamed from: a */
    public final void mo49669a(String str, IAppContext iAppContext, OPTrace oPTrace, String str2, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "openChatId");
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        Intrinsics.checkParameterIsNotNull(oPTrace, "traceSpan");
        Intrinsics.checkParameterIsNotNull(str2, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "failure");
        C67852a aVar = new C67852a();
        if (HostDependManager.getInst().getFeatureGating("openplatform.network.mvp")) {
            mo49671a(CollectionsKt.arrayListOf(str), iAppContext, oPTrace, aVar, function1, function12);
            return;
        }
        HashMap<String, String> invoke = f35274b.invoke();
        JSONObject invoke2 = f35275c.invoke(aVar, iAppContext);
        invoke2.put("open_chatids", new JSONArray((Collection) CollectionsKt.arrayListOf(str)));
        m54366a("/getChatIDsByOpenChatIDs", invoke, invoke2, aVar, iAppContext, oPTrace, str2, function1, function12);
    }

    /* renamed from: b */
    public final void mo49673b(List<String> list, IAppContext iAppContext, OPTrace oPTrace, String str, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(list, "departmentIds");
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        Intrinsics.checkParameterIsNotNull(oPTrace, "traceSpan");
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "failure");
        C67852a aVar = new C67852a();
        if (HostDependManager.getInst().getFeatureGating("openplatform.network.mvp")) {
            C12869e eVar = new C12869e();
            C25549a aVar2 = new C25549a(iAppContext, oPTrace, aVar);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("depids", new JSONArray((Collection) list));
            try {
                C12870f a = eVar.mo48515a(aVar2, DepartmentIds2OpenDepartmentIdsConfig.class, jSONObject);
                if (a == null) {
                    Intrinsics.throwNpe();
                }
                C12868d a2 = eVar.mo48514a(a);
                Intrinsics.checkExpressionValueIsNotNull(a2, "requestService.executeTask(ecoTask!!)");
                String str2 = (String) a2.mo48508a();
                if (str2 == null) {
                    AppBrandLogger.m52830i("IdTransformer", "getOpenDepIDsByDepIDs server result is null");
                    function12.invoke(new Throwable("server result is null"));
                    return;
                }
                function1.invoke(str2);
            } catch (Exception e) {
                function12.invoke(e);
            }
        } else {
            JSONObject invoke = f35275c.invoke(aVar, iAppContext);
            invoke.put("depids", new JSONArray((Collection) list));
            m54366a("/getOpenDepIDsByDepIDs", f35274b.invoke(), invoke, aVar, iAppContext, oPTrace, str, function1, function12);
        }
    }

    /* renamed from: a */
    public final void mo49671a(List<String> list, IAppContext iAppContext, OPTrace oPTrace, C67852a aVar, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(list, "openChatIds");
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        Intrinsics.checkParameterIsNotNull(oPTrace, "requestTrace");
        Intrinsics.checkParameterIsNotNull(aVar, "encryptContext");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "failure");
        C12869e eVar = new C12869e();
        C25549a aVar2 = new C25549a(iAppContext, oPTrace, aVar);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("open_chatids", new JSONArray((Collection) list));
        try {
            C12870f a = eVar.mo48515a(aVar2, OpenChatId2ChatIdConfig.class, jSONObject);
            if (a == null) {
                Intrinsics.throwNpe();
            }
            C12868d a2 = eVar.mo48514a(a);
            Intrinsics.checkExpressionValueIsNotNull(a2, "requestService.executeTask(ecoTask!!)");
            String str = (String) a2.mo48508a();
            Intrinsics.checkExpressionValueIsNotNull(str, "openIdData");
            function1.invoke(str);
        } catch (Exception e) {
            function12.invoke(e);
        }
    }

    /* renamed from: a */
    public final void mo49672a(List<String> list, IAppContext iAppContext, OPTrace oPTrace, String str, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(list, "openChatIds");
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        Intrinsics.checkParameterIsNotNull(oPTrace, "traceSpan");
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "failure");
        C67852a aVar = new C67852a();
        if (HostDependManager.getInst().getFeatureGating("openplatform.network.mvp")) {
            mo49671a(list, iAppContext, oPTrace, aVar, function1, function12);
            return;
        }
        HashMap<String, String> invoke = f35274b.invoke();
        JSONObject invoke2 = f35275c.invoke(aVar, iAppContext);
        invoke2.put("open_chatids", new JSONArray((Collection) list));
        m54366a("/getChatIDsByOpenChatIDs", invoke, invoke2, aVar, iAppContext, oPTrace, str, function1, function12);
    }

    /* renamed from: a */
    public final void mo49670a(HashMap<String, String> hashMap, List<? extends Messenger.ChatRequest> list, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12, IAppContext iAppContext, C67852a aVar, TracingCoreSpan tracingCoreSpan, String str) {
        Intrinsics.checkParameterIsNotNull(hashMap, "headMap");
        Intrinsics.checkParameterIsNotNull(list, "chats");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "failure");
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        Intrinsics.checkParameterIsNotNull(aVar, "encryptContext");
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        HashMap<String, String> invoke = f35274b.invoke();
        if (hashMap.size() > 0) {
            invoke.putAll(hashMap);
        }
        JSONObject invoke2 = f35275c.invoke(aVar, iAppContext);
        invoke2.put("chats", new JSONArray(JSON.toJSONString(list)));
        m54366a("/v4/getOpenChatIDsByChatIDs", invoke, invoke2, aVar, iAppContext, tracingCoreSpan, str, function1, function12);
    }

    /* renamed from: a */
    private final void m54366a(String str, HashMap<String, String> hashMap, JSONObject jSONObject, C67852a aVar, IAppContext iAppContext, TracingCoreSpan tracingCoreSpan, String str2, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12) {
        C67750b.m263609a(iAppContext, tracingCoreSpan, str2);
        C12843b.m53040a(C13047a.C13049b.m53532a() + str, hashMap, jSONObject, tracingCoreSpan, iAppContext, true).subscribe(new C13368c(iAppContext, tracingCoreSpan, str2, function12, aVar, function1), new C13369d(function12));
    }
}
