package com.tt.miniapp.launchaction;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.gson.Gson;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapp.launchaction.bean.ActionMessageResult;
import com.tt.miniapp.launchaction.bean.C66303a;
import com.tt.miniapp.launchaction.bean.MessageTriggerInfo;
import com.tt.miniapp.manager.appinfo.C66411c;
import com.tt.miniapp.manager.appinfo.C66412d;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.util.C67064v;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.refer.common.util.C67857a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0014J\b\u0010\r\u001a\u00020\u0006H\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0014H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0003H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tt/miniapp/launchaction/ActionMessageLoadManager;", "Lcom/tt/miniapp/launchaction/BasePreloadManager;", "Lcom/tt/miniapp/launchaction/ActionMessageLoadManager$InputParams;", "Lcom/tt/miniapp/launchaction/bean/ActionMessageLoadResult;", "()V", "TAG", "", "map", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "doLoad", "Lio/reactivex/Observable;", "params", "getCurrentLanguage", "getDataFromCache", "getMessageAction", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "triggerCode", "isDataResultOk", "", "p", "result", "fromCache", "onGetResultFail", "", "saveData", "actionMessageResult", "InputParams", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.miniapp.launchaction.a */
public final class ActionMessageLoadManager extends BasePreloadManager<InputParams, C66303a> {

    /* renamed from: a */
    public static final ActionMessageLoadManager f167308a = new ActionMessageLoadManager();

    /* renamed from: b */
    private static final HashMap<String, C66303a> f167309b = new HashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/tt/miniapp/launchaction/ActionMessageLoadManager$InputParams;", "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "ttCode", "Lcom/tt/miniapp/manager/appinfo/TTCode;", "triggerCode", "", "ids", "", "actionTime", "", "(Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;Lcom/tt/miniapp/manager/appinfo/TTCode;Ljava/lang/String;Ljava/util/List;J)V", "getActionTime", "()J", "getAppContext", "()Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "getIds", "()Ljava/util/List;", "getTriggerCode", "()Ljava/lang/String;", "getTtCode", "()Lcom/tt/miniapp/manager/appinfo/TTCode;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.launchaction.a$a */
    public static final class InputParams {

        /* renamed from: a */
        private final IAppContext f167310a;

        /* renamed from: b */
        private final C66411c f167311b;

        /* renamed from: c */
        private final String f167312c;

        /* renamed from: d */
        private final List<String> f167313d;

        /* renamed from: e */
        private final long f167314e;

        /* renamed from: a */
        public final IAppContext mo231702a() {
            return this.f167310a;
        }

        /* renamed from: b */
        public final C66411c mo231703b() {
            return this.f167311b;
        }

        /* renamed from: c */
        public final String mo231704c() {
            return this.f167312c;
        }

        /* renamed from: d */
        public final List<String> mo231705d() {
            return this.f167313d;
        }

        /* renamed from: e */
        public final long mo231706e() {
            return this.f167314e;
        }

        public InputParams(IAppContext iAppContext, C66411c cVar, String str, List<String> list, long j) {
            Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
            Intrinsics.checkParameterIsNotNull(cVar, "ttCode");
            Intrinsics.checkParameterIsNotNull(str, "triggerCode");
            Intrinsics.checkParameterIsNotNull(list, "ids");
            this.f167310a = iAppContext;
            this.f167311b = cVar;
            this.f167312c = str;
            this.f167313d = list;
            this.f167314e = j;
        }
    }

    private ActionMessageLoadManager() {
    }

    /* renamed from: b */
    private final String m259369b() {
        C67479c a = C67479c.m262467a();
        Intrinsics.checkExpressionValueIsNotNull(a, "LocaleManager.getInst()");
        Locale c = a.mo234230c();
        if (TextUtils.isEmpty(c.getCountry())) {
            String language = c.getLanguage();
            Intrinsics.checkExpressionValueIsNotNull(language, "language");
            return language;
        }
        return c.getLanguage() + '-' + c.getCountry();
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.launchaction.BasePreloadManager
    /* renamed from: a */
    public void mo231698a() {
        new OPMonitor(new OPMonitorCode("client.open_platform.messageaction_plusmenu.app_msg_action", 10007, OPMonitorLevel.ERROR, "get_action_info_fail")).flush();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tt/miniapp/launchaction/bean/ActionMessageResult;", "kotlin.jvm.PlatformType", "response", "", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.launchaction.a$b */
    public static final class C66296b<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C66296b f167315a = new C66296b();

        C66296b() {
        }

        /* renamed from: a */
        public final ActionMessageResult apply(String str) {
            Intrinsics.checkParameterIsNotNull(str, "response");
            return (ActionMessageResult) new Gson().fromJson(str, (Class) ActionMessageResult.class);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tt/miniapp/launchaction/bean/ActionMessageLoadResult;", "t", "Lcom/tt/miniapp/launchaction/bean/ActionMessageResult;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.launchaction.a$c */
    public static final class C66297c<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ InputParams f167316a;

        C66297c(InputParams aVar) {
            this.f167316a = aVar;
        }

        /* renamed from: a */
        public final C66303a apply(ActionMessageResult actionMessageResult) {
            Intrinsics.checkParameterIsNotNull(actionMessageResult, "t");
            return new C66303a(actionMessageResult, this.f167316a.mo231706e());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C66303a mo88591a(InputParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        return f167309b.get(aVar.mo231704c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Observable<C66303a> mo88598b(InputParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", aVar.mo231702a().getAppId());
            jSONObject.put("trigger_code", aVar.mo231704c());
            jSONObject.put("larkVersion", C67043j.m261283f(aVar.mo231702a().getApplicationContext()));
            jSONObject.put("ttcode", aVar.mo231703b().f167670c);
            jSONObject.put("locale", f167308a.m259369b());
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = aVar.mo231705d().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("message_ids", jSONArray);
            Observable<R> map = ((AbstractC67724a) aVar.mo231702a().findServiceByInterface(AbstractC67724a.class)).mo50437a(C67857a.m263994c(aVar.mo231702a()) + "/api/mget_message_content", (Map<String, String>) null, jSONObject, aVar.mo231702a(), false).map(C66296b.f167315a).map(new C66297c(aVar));
            Intrinsics.checkExpressionValueIsNotNull(map, "params.appContext.findSe…me)\n                    }");
            return map;
        } catch (JSONException unused) {
            Observable<C66303a> just = Observable.just(new C66303a(C66303a.f167329c));
            Intrinsics.checkExpressionValueIsNotNull(just, "Observable.just(ActionMe…dResult.TYPE_ERROR_JSON))");
            return just;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo88594a(InputParams aVar, C66303a aVar2) {
        Map<String, ActionMessageResult.ContentDetail> messageContents;
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar2, "actionMessageResult");
        ActionMessageResult b = aVar2.mo231755b();
        if (!(b == null || (messageContents = b.getMessageContents()) == null)) {
            Intrinsics.checkExpressionValueIsNotNull(messageContents, "it");
            for (Map.Entry<String, ActionMessageResult.ContentDetail> entry : messageContents.entrySet()) {
                ActionMessageResult.ContentDetail value = entry.getValue();
                Intrinsics.checkExpressionValueIsNotNull(value, "detail");
                value.setContent(C67064v.m261368a(aVar.mo231703b().f167668a, aVar.mo231703b().f167669b, value.getContent()));
            }
            f167309b.put(aVar.mo231704c(), aVar2);
        }
    }

    /* renamed from: a */
    public final Observable<C66303a> mo231697a(IAppContext iAppContext, String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        Intrinsics.checkParameterIsNotNull(str, "triggerCode");
        MessageTriggerInfo b = ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50451b(iAppContext.getAppId(), str);
        if (b == null) {
            AppBrandLogger.m52829e("ActionMessageLoadManager", "triggerInfo is null");
            Observable<C66303a> just = Observable.just(new C66303a(C66303a.f167331e));
            Intrinsics.checkExpressionValueIsNotNull(just, "Observable.just(ActionMe…Result.TYPE_ERROR_OTHER))");
            return just;
        } else if (!b.mo231731a()) {
            Observable<C66303a> just2 = Observable.just(new C66303a(C66303a.f167330d));
            Intrinsics.checkExpressionValueIsNotNull(just2, "Observable.just(ActionMe…TYPE_ERROR_INVALID_CODE))");
            return just2;
        } else {
            List<String> c = b.mo231733c();
            if (c == null || c.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                AppBrandLogger.m52829e("ActionMessageLoadManager", "messageId empty, triggerCode " + str);
                Observable<C66303a> just3 = Observable.just(new C66303a(C66303a.f167331e));
                Intrinsics.checkExpressionValueIsNotNull(just3, "Observable.just(ActionMe…Result.TYPE_ERROR_OTHER))");
                return just3;
            }
            C66411c b2 = C66412d.m259647b(iAppContext.getApplicationContext(), iAppContext);
            if (b2 == null) {
                AppBrandLogger.m52829e("ActionMessageLoadManager", "ttcode is null");
                Observable<C66303a> just4 = Observable.just(new C66303a(C66303a.f167328b));
                Intrinsics.checkExpressionValueIsNotNull(just4, "Observable.just(ActionMe…sult.TYPE_ERROR_ENCRYPT))");
                return just4;
            }
            List<String> c2 = b.mo231733c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "triggerInfo.ids");
            return mo231709c(new InputParams(iAppContext, b2, str, c2, b.mo231732b()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo88596a(InputParams aVar, C66303a aVar2, boolean z) {
        Intrinsics.checkParameterIsNotNull(aVar, "p");
        Intrinsics.checkParameterIsNotNull(aVar2, "result");
        if (aVar2.mo231755b() == null) {
            return false;
        }
        ActionMessageResult b = aVar2.mo231755b();
        if (b == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "result.result!!");
        return b.isSuccess();
    }
}
