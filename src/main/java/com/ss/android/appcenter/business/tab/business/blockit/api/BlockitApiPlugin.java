package com.ss.android.appcenter.business.tab.business.blockit.api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.ss.android.appcenter.business.p1265a.C27579g;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27923c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\"\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/blockit/api/BlockitApiPlugin;", "Lcom/larksuite/framework/apiplugin/LKPlugin;", "apiHandler", "Lcom/ss/android/appcenter/business/tab/business/blockit/api/BlockitApiPlugin$BlockitApiHandler;", "(Lcom/ss/android/appcenter/business/tab/business/blockit/api/BlockitApiPlugin$BlockitApiHandler;)V", "apis", "Lcom/ss/android/appcenter/business/tab/business/blockit/api/BlockitApis;", "addEvents", "", "filter", "Lcom/larksuite/framework/apiplugin/api/LKEventFilter;", "addMenuItem", "eventParams", "", "event", "Lcom/larksuite/framework/apiplugin/LKEvent;", "handleCustomApis", "eventName", "handleEvent", "Lcom/larksuite/framework/apiplugin/entity/LKPluginHandleResult;", "onRelease", "removeMenuItem", "updateMenuItem", "BlockitApiHandler", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a.b */
public final class BlockitApiPlugin extends AbstractC25937e {

    /* renamed from: a */
    private final C27833c f69549a = new C27833c();

    /* renamed from: b */
    private final BlockitApiHandler f69550b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/blockit/api/BlockitApiPlugin$BlockitApiHandler;", "", "addMenuItem", "", "menuItem", "Lcom/ss/android/appcenter/business/tab/business/view/itemmenu/menuitem/MenuItem;", "handleGetContainerRect", "Lorg/json/JSONObject;", "invokeApiMonitor", "", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "", "removeMenuItem", "key", "updateMenuItem", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a.b$a */
    public interface BlockitApiHandler {
        /* renamed from: a */
        boolean mo99225a(C27923c cVar);

        /* renamed from: b */
        void mo99228b(String str);

        /* renamed from: b */
        boolean mo99229b(C27923c cVar);

        /* renamed from: c */
        boolean mo99232c(String str);

        /* renamed from: i */
        JSONObject mo99260i();
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a.b$c */
    public static final class RunnableC27824c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LKEvent f69552a;

        RunnableC27824c(LKEvent lKEvent) {
            this.f69552a = lKEvent;
        }

        public final void run() {
            this.f69552a.mo92153t();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a.b$e */
    public static final class RunnableC27826e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LKEvent f69554a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f69555b;

        RunnableC27826e(LKEvent lKEvent, JSONObject jSONObject) {
            this.f69554a = lKEvent;
            this.f69555b = jSONObject;
        }

        public final void run() {
            this.f69554a.mo92127a(this.f69555b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a.b$g */
    public static final class RunnableC27828g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LKEvent f69557a;

        RunnableC27828g(LKEvent lKEvent) {
            this.f69557a = lKEvent;
        }

        public final void run() {
            this.f69557a.mo92153t();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a.b$j */
    public static final class RunnableC27831j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LKEvent f69560a;

        RunnableC27831j(LKEvent lKEvent) {
            this.f69560a = lKEvent;
        }

        public final void run() {
            this.f69560a.mo92153t();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a.b$b */
    public static final class RunnableC27823b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LKEvent f69551a;

        RunnableC27823b(LKEvent lKEvent) {
            this.f69551a = lKEvent;
        }

        public final void run() {
            this.f69551a.mo92116a(0, new JSONObject());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a.b$d */
    public static final class RunnableC27825d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LKEvent f69553a;

        RunnableC27825d(LKEvent lKEvent) {
            this.f69553a = lKEvent;
        }

        public final void run() {
            this.f69553a.mo92116a(0, new JSONObject());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a.b$f */
    public static final class RunnableC27827f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LKEvent f69556a;

        RunnableC27827f(LKEvent lKEvent) {
            this.f69556a = lKEvent;
        }

        public final void run() {
            this.f69556a.mo92116a(0, new JSONObject());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a.b$h */
    public static final class RunnableC27829h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LKEvent f69558a;

        RunnableC27829h(LKEvent lKEvent) {
            this.f69558a = lKEvent;
        }

        public final void run() {
            this.f69558a.mo92116a(0, new JSONObject());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a.b$i */
    public static final class RunnableC27830i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LKEvent f69559a;

        RunnableC27830i(LKEvent lKEvent) {
            this.f69559a = lKEvent;
        }

        public final void run() {
            this.f69559a.mo92116a(0, new JSONObject());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a.b$k */
    public static final class RunnableC27832k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LKEvent f69561a;

        RunnableC27832k(LKEvent lKEvent) {
            this.f69561a = lKEvent;
        }

        public final void run() {
            this.f69561a.mo92116a(0, new JSONObject());
        }
    }

    public BlockitApiPlugin(BlockitApiHandler aVar) {
        this.f69550b = aVar;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        C27822a[] aVarArr = this.f69549a.f69569b;
        for (C27822a aVar : aVarArr) {
            if (Intrinsics.areEqual(aVar.f69548b, "invoke") && gVar != null) {
                gVar.mo92192a(aVar.f69547a);
            }
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        String str;
        if (lKEvent == null) {
            LKPluginHandleResult handleEvent = super.handleEvent(lKEvent);
            Intrinsics.checkExpressionValueIsNotNull(handleEvent, "super.handleEvent(event)");
            return handleEvent;
        }
        String m = lKEvent.mo92146m();
        JSONObject n = lKEvent.mo92147n();
        C27822a[] aVarArr = this.f69549a.f69569b;
        Intrinsics.checkExpressionValueIsNotNull(aVarArr, "apis.customApis");
        int length = aVarArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (Intrinsics.areEqual(aVarArr[i].f69547a, m)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            LKPluginHandleResult handleEvent2 = super.handleEvent(lKEvent);
            Intrinsics.checkExpressionValueIsNotNull(handleEvent2, "super.handleEvent(event)");
            return handleEvent2;
        }
        Intrinsics.checkExpressionValueIsNotNull(m, "eventName");
        if (n != null) {
            str = n.toString();
        } else {
            str = null;
        }
        m101677a(lKEvent, m, str);
        LKPluginHandleResult u = lKEvent.mo92154u();
        Intrinsics.checkExpressionValueIsNotNull(u, "event.makeHandleResult()");
        return u;
    }

    /* renamed from: b */
    private final void m101679b(String str, LKEvent lKEvent) {
        Boolean bool;
        if (str == null) {
            lKEvent.mo92142i().executeAsyncApiHandle("removeMenuItem", new RunnableC27827f(lKEvent));
            return;
        }
        try {
            JsonElement jsonElement = ((JsonObject) C27579g.f68797a.fromJson(str, JsonObject.class)).get("key");
            BlockitApiHandler aVar = this.f69550b;
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(jsonElement, "key");
                String asString = jsonElement.getAsString();
                Intrinsics.checkExpressionValueIsNotNull(asString, "key.asString");
                bool = Boolean.valueOf(aVar.mo99232c(asString));
            } else {
                bool = null;
            }
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                lKEvent.mo92142i().executeAsyncApiHandle("updateMenuItem", new RunnableC27828g(lKEvent));
            } else {
                lKEvent.mo92142i().executeAsyncApiHandle("updateMenuItem", new RunnableC27829h(lKEvent));
            }
        } catch (Exception unused) {
            lKEvent.mo92116a(0, new JSONObject());
        }
    }

    /* renamed from: c */
    private final void m101680c(String str, LKEvent lKEvent) {
        Boolean bool;
        if (str == null) {
            lKEvent.mo92142i().executeAsyncApiHandle("updateMenuItem", new RunnableC27830i(lKEvent));
            return;
        }
        try {
            C27923c cVar = (C27923c) C27579g.f68797a.fromJson(((JsonObject) C27579g.f68797a.fromJson(str, JsonObject.class)).get("menuItem"), C27923c.class);
            BlockitApiHandler aVar = this.f69550b;
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(cVar, "menuItem");
                bool = Boolean.valueOf(aVar.mo99225a(cVar));
            } else {
                bool = null;
            }
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                lKEvent.mo92142i().executeAsyncApiHandle("updateMenuItem", new RunnableC27831j(lKEvent));
            } else {
                lKEvent.mo92142i().executeAsyncApiHandle("updateMenuItem", new RunnableC27832k(lKEvent));
            }
        } catch (Exception unused) {
            lKEvent.mo92116a(0, new JSONObject());
        }
    }

    /* renamed from: a */
    private final void m101678a(String str, LKEvent lKEvent) {
        Boolean bool;
        if (str == null) {
            lKEvent.mo92142i().executeAsyncApiHandle("addMenuItem", new RunnableC27823b(lKEvent));
            return;
        }
        try {
            C27923c cVar = (C27923c) C27579g.f68797a.fromJson(((JsonObject) C27579g.f68797a.fromJson(str, JsonObject.class)).get("menuItem"), C27923c.class);
            if (cVar.mo99551b(lKEvent.mo92145l())) {
                BlockitApiHandler aVar = this.f69550b;
                if (aVar != null) {
                    Intrinsics.checkExpressionValueIsNotNull(cVar, "menuItem");
                    bool = Boolean.valueOf(aVar.mo99229b(cVar));
                } else {
                    bool = null;
                }
                if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                    lKEvent.mo92142i().executeAsyncApiHandle("addMenuItem", new RunnableC27824c(lKEvent));
                    return;
                }
            }
            lKEvent.mo92142i().executeAsyncApiHandle("addMenuItem", new RunnableC27825d(lKEvent));
        } catch (Exception unused) {
            lKEvent.mo92116a(0, new JSONObject());
        }
    }

    /* renamed from: a */
    private final void m101677a(LKEvent lKEvent, String str, String str2) {
        JSONObject jSONObject;
        BlockitApiHandler aVar = this.f69550b;
        if (aVar != null) {
            aVar.mo99228b(str);
        }
        switch (str.hashCode()) {
            case -1578374957:
                if (str.equals("addMenuItem")) {
                    m101678a(str2, lKEvent);
                    return;
                }
                return;
            case 266076411:
                if (str.equals("updateMenuItem")) {
                    m101680c(str2, lKEvent);
                    return;
                }
                return;
            case 849063503:
                if (str.equals("getContainerRect")) {
                    BlockitApiHandler aVar2 = this.f69550b;
                    if (aVar2 != null) {
                        jSONObject = aVar2.mo99260i();
                    } else {
                        jSONObject = null;
                    }
                    lKEvent.mo92142i().executeAsyncApiHandle("getContainerRect", new RunnableC27826e(lKEvent, jSONObject));
                    return;
                }
                return;
            case 2096420278:
                if (str.equals("removeMenuItem")) {
                    m101679b(str2, lKEvent);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
