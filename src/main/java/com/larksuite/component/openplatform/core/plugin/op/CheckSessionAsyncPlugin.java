package com.larksuite.component.openplatform.core.plugin.op;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapphost.C67475d;
import com.tt.refer.common.util.C67857a;
import com.tt.refer.common.util.C67864f;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007\b\u0016¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002JP\u0010\u0007\u001a\u00020\u00042!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00040\t2#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\tH\u0003J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¨\u0006\u0018"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/op/CheckSessionAsyncPlugin;", "Lcom/larksuite/component/openplatform/core/plugin/OPPlugin;", "()V", "callbackOk", "", "lkEvent", "Lcom/larksuite/framework/apiplugin/LKEvent;", "checkFromNetWork", "success", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "Lkotlin/ParameterName;", "name", "response", "fail", "", "error", "checkSession", "deleteExpireTime", "expireTime", "", "getExpireTime", "saveExpireTime", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CheckSessionAsyncPlugin extends OPPlugin {
    public static final Companion Companion = new Companion(null);

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/op/CheckSessionAsyncPlugin$Companion;", "", "()V", "CHECK_PATH", "", "ONE_DAY", "", "SESSION_PRE_NAME", "TAG", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.CheckSessionAsyncPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void deleteExpireTime() {
        AppBrandLogger.m52830i("CheckSessionAsyncPlugin", "delete check time");
        SharedPreferences.Editor edit = C67864f.m264018a(getAppContext(), "session_time").edit();
        IAppContext appContext = getAppContext();
        Intrinsics.checkExpressionValueIsNotNull(appContext, "appContext");
        edit.remove(appContext.getAppId()).apply();
    }

    private final long getExpireTime() {
        SharedPreferences a = C67864f.m264018a(getAppContext(), "session_time");
        try {
            IAppContext appContext = getAppContext();
            Intrinsics.checkExpressionValueIsNotNull(appContext, "appContext");
            String string = a.getString(appContext.getAppId(), null);
            if (string == null) {
                return -1;
            }
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException e) {
                AppBrandLogger.m52829e("CheckSessionAsyncPlugin", e.getLocalizedMessage());
                return -1;
            }
        } catch (ClassCastException unused) {
            IAppContext appContext2 = getAppContext();
            Intrinsics.checkExpressionValueIsNotNull(appContext2, "appContext");
            return a.getLong(appContext2.getAppId(), -1);
        }
    }

    public final void callbackOk(LKEvent lKEvent) {
        lKEvent.mo92153t();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.CheckSessionAsyncPlugin$b */
    public static final class C25318b extends Lambda implements Function1<String, Unit> {
        public static final C25318b INSTANCE = new C25318b();

        C25318b() {
            super(1);
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lorg/json/JSONObject;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.CheckSessionAsyncPlugin$e */
    static final class C25321e extends Lambda implements Function1<JSONObject, Unit> {
        final /* synthetic */ CheckSessionAsyncPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25321e(CheckSessionAsyncPlugin checkSessionAsyncPlugin) {
            super(1);
            this.this$0 = checkSessionAsyncPlugin;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
            invoke(jSONObject);
            return Unit.INSTANCE;
        }

        public final void invoke(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "response");
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                boolean optBoolean = optJSONObject.optBoolean("valid");
                Companion aVar = CheckSessionAsyncPlugin.Companion;
                AppBrandLogger.m52830i("CheckSessionAsyncPlugin", "check valid:" + optBoolean);
                if (optBoolean) {
                    long expireTime = this.this$0.expireTime(jSONObject);
                    if (expireTime > 0) {
                        this.this$0.saveExpireTime(expireTime * ((long) 1000));
                        return;
                    }
                    return;
                }
                Companion aVar2 = CheckSessionAsyncPlugin.Companion;
                AppBrandLogger.m52830i("CheckSessionAsyncPlugin", "not valid time");
                this.this$0.deleteExpireTime();
                return;
            }
            this.this$0.deleteExpireTime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lorg/json/JSONObject;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.CheckSessionAsyncPlugin$f */
    static final class C25322f extends Lambda implements Function1<JSONObject, Unit> {
        final /* synthetic */ LKEvent $lkEvent;
        final /* synthetic */ long $startTime;
        final /* synthetic */ CheckSessionAsyncPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25322f(CheckSessionAsyncPlugin checkSessionAsyncPlugin, LKEvent lKEvent, long j) {
            super(1);
            this.this$0 = checkSessionAsyncPlugin;
            this.$lkEvent = lKEvent;
            this.$startTime = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
            invoke(jSONObject);
            return Unit.INSTANCE;
        }

        public final void invoke(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "response");
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                boolean optBoolean = optJSONObject.optBoolean("valid");
                Companion aVar = CheckSessionAsyncPlugin.Companion;
                AppBrandLogger.m52830i("CheckSessionAsyncPlugin", "check valid:" + optBoolean);
                if (optBoolean) {
                    this.this$0.callbackOk(this.$lkEvent);
                    C67475d.m262461a(false, "success", System.currentTimeMillis() - this.$startTime, 0, "", this.this$0.getAppContext());
                    long expireTime = this.this$0.expireTime(jSONObject);
                    if (expireTime != -1) {
                        this.this$0.saveExpireTime(expireTime * ((long) 1000));
                        return;
                    }
                    return;
                }
                this.$lkEvent.mo92132b(this.this$0.createFailedResponse(C25913h.f64179i));
                this.this$0.deleteExpireTime();
                return;
            }
            CheckSessionAsyncPlugin checkSessionAsyncPlugin = this.this$0;
            this.$lkEvent.mo92132b(checkSessionAsyncPlugin.createFailedResponse(C25906a.f64081k, jSONObject.optString("message", "")));
            C67475d.m262461a(false, "fail", System.currentTimeMillis() - this.$startTime, jSONObject.optInt("error", 0), jSONObject.optString("message", ""), checkSessionAsyncPlugin.getAppContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.CheckSessionAsyncPlugin$g */
    static final class C25323g extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ LKEvent $lkEvent;
        final /* synthetic */ long $startTime;
        final /* synthetic */ CheckSessionAsyncPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25323g(CheckSessionAsyncPlugin checkSessionAsyncPlugin, long j, LKEvent lKEvent) {
            super(1);
            this.this$0 = checkSessionAsyncPlugin;
            this.$startTime = j;
            this.$lkEvent = lKEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            C67475d.m262461a(false, "fail", System.currentTimeMillis() - this.$startTime, 0, str, this.this$0.getAppContext());
            this.$lkEvent.mo92132b(this.this$0.createFailedResponse(C25906a.f64079i, str));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.CheckSessionAsyncPlugin$d */
    public static final class C25320d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ Function1 f61837a;

        C25320d(Function1 function1) {
            this.f61837a = function1;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Function1 function1 = this.f61837a;
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            String localizedMessage = th.getLocalizedMessage();
            Intrinsics.checkExpressionValueIsNotNull(localizedMessage, "it.localizedMessage");
            function1.invoke(localizedMessage);
        }
    }

    public final long expireTime(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (optJSONObject != null) {
            return optJSONObject.getLong("expire_time");
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "response", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.CheckSessionAsyncPlugin$c */
    public static final class C25319c<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ Function1 f61835a;

        /* renamed from: b */
        final /* synthetic */ Function1 f61836b;

        C25319c(Function1 function1, Function1 function12) {
            this.f61835a = function1;
            this.f61836b = function12;
        }

        /* renamed from: a */
        public final void accept(String str) {
            if (TextUtils.isEmpty(str)) {
                Function1 function1 = this.f61835a;
                String generateDataNullExtraInfo = ApiCallResultHelper.generateDataNullExtraInfo("response");
                Intrinsics.checkExpressionValueIsNotNull(generateDataNullExtraInfo, "ApiCallResultHelper.gene…NullExtraInfo(\"response\")");
                function1.invoke(generateDataNullExtraInfo);
                return;
            }
            this.f61836b.invoke(new JSONObject(str));
        }
    }

    public final void saveExpireTime(long j) {
        SharedPreferences.Editor edit = C67864f.m264018a(getAppContext(), "session_time").edit();
        IAppContext appContext = getAppContext();
        Intrinsics.checkExpressionValueIsNotNull(appContext, "appContext");
        edit.putLong(appContext.getAppId(), j).apply();
    }

    @LKPluginFunction(async = true, eventName = {"checkSession"})
    public final void checkSession(LKEvent lKEvent) {
        Intrinsics.checkParameterIsNotNull(lKEvent, "lkEvent");
        long currentTimeMillis = System.currentTimeMillis();
        long expireTime = getExpireTime();
        IBaseService findServiceByInterface = getAppContext().findServiceByInterface(AbstractC67724a.class);
        Intrinsics.checkExpressionValueIsNotNull(findServiceByInterface, "appContext.findServiceBy…IHostService::class.java)");
        long m = ((AbstractC67724a) findServiceByInterface).mo50472m();
        AppBrandLogger.m52830i("CheckSessionAsyncPlugin", "startTime: " + currentTimeMillis + ", expireTime: " + expireTime + ", " + "serVerTime: " + m);
        if (expireTime <= 0 || m <= 0 || expireTime - m <= 86400000) {
            AppBrandLogger.m52830i("CheckSessionAsyncPlugin", "check expireTime form net");
            checkFromNetWork(new C25322f(this, lKEvent, currentTimeMillis), new C25323g(this, currentTimeMillis, lKEvent));
            return;
        }
        callbackOk(lKEvent);
        C67475d.m262461a(true, "success", System.currentTimeMillis() - currentTimeMillis, 0, "", getAppContext());
        checkFromNetWork$default(this, new C25321e(this), null, 2, null);
    }

    private final void checkFromNetWork(Function1<? super JSONObject, Unit> function1, Function1<? super String, Unit> function12) {
        String str = C67857a.m263995d(getAppContext()) + "/checkSession";
        HashMap hashMap = new HashMap();
        IAppContext appContext = getAppContext();
        Intrinsics.checkExpressionValueIsNotNull(appContext, "appContext");
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, appContext.getAppId());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("EENet-Request-Enable-Complex-Connect", String.valueOf(true));
        int b = C67857a.m263993b(getAppContext());
        if (!C67857a.m263992a(getAppContext()) && b == 1) {
            hashMap2.put("domain_alias", "open");
        }
        ((AbstractC67724a) getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50437a(str, (Map<String, String>) hashMap2, new JSONObject(hashMap), getAppContext(), true).subscribe(new C25319c(function12, function1), new C25320d(function12));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.component.openplatform.core.plugin.op.CheckSessionAsyncPlugin */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void checkFromNetWork$default(CheckSessionAsyncPlugin checkSessionAsyncPlugin, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = C25318b.INSTANCE;
        }
        checkSessionAsyncPlugin.checkFromNetWork(function1, function12);
    }
}
