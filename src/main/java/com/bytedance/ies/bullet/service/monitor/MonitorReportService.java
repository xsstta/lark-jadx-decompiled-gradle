package com.bytedance.ies.bullet.service.monitor;

import bolts.Task;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p106c.C2641a;
import com.bytedance.android.monitor.webview.AbstractC2677a;
import com.bytedance.ies.bullet.service.base.IMonitorReportService;
import com.bytedance.ies.bullet.service.base.IReporter;
import com.bytedance.ies.bullet.service.base.MonitorConfig;
import com.bytedance.ies.bullet.service.base.ReportInfo;
import com.bytedance.ies.bullet.service.base.impl.BaseBulletService;
import com.bytedance.ies.bullet.service.base.utils.Identifier;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J.\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J&\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u000f*\u00020\t2\u0006\u0010#\u001a\u00020\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/ies/bullet/service/monitor/MonitorReportService;", "Lcom/bytedance/ies/bullet/service/base/impl/BaseBulletService;", "Lcom/bytedance/ies/bullet/service/base/IMonitorReportService;", "reporter", "Lcom/bytedance/ies/bullet/service/base/IReporter;", "config", "Lcom/bytedance/ies/bullet/service/base/MonitorConfig;", "(Lcom/bytedance/ies/bullet/service/base/IReporter;Lcom/bytedance/ies/bullet/service/base/MonitorConfig;)V", "commonData", "Lorg/json/JSONObject;", "getConfig", "()Lcom/bytedance/ies/bullet/service/base/MonitorConfig;", "realMonitor", "Lcom/bytedance/android/monitor/webview/ITTLiveWebViewMonitor;", "generalReport", "", "serviceName", "", UpdateKey.STATUS, "", "duration", "logExtr", "getMonitorConfig", "mergeCommonCategory", "category", "platform", "", "mergeCommonInfo", "commonFromBullet", "onRegister", "bid", "report", "info", "Lcom/bytedance/ies/bullet/service/base/ReportInfo;", "wrap", "json", "Companion", "x-monitor_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.a.a */
public final class MonitorReportService extends BaseBulletService implements IMonitorReportService {

    /* renamed from: f */
    public static final Map<String, Integer> f37832f = MapsKt.mapOf(new Pair("web", 0), new Pair("rn", 2), new Pair("lynx", 3), new Pair("unknown", -1));

    /* renamed from: g */
    public static final Companion f37833g = new Companion(null);

    /* renamed from: a */
    public final AbstractC2677a f37834a;

    /* renamed from: b */
    public final IReporter f37835b;

    /* renamed from: h */
    private JSONObject f37836h;

    /* renamed from: i */
    private final MonitorConfig f37837i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ies/bullet/service/monitor/MonitorReportService$Companion;", "", "()V", "BID", "", "CONTAINER_TYPE", "DEBUG_TAG", "HYBRID_PLATFORM", "PLATFORM", "PLATFORM_MAP", "", "", "getPLATFORM_MAP", "()Ljava/util/Map;", "SDK_VERSION", "x-monitor_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IMonitorReportService
    /* renamed from: b */
    public MonitorConfig mo52616b() {
        return this.f37837i;
    }

    /* renamed from: d */
    public final MonitorConfig mo52617d() {
        return this.f37837i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.a.a$c */
    static final class CallableC14408c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ MonitorReportService f37839a;

        /* renamed from: b */
        final /* synthetic */ ReportInfo f37840b;

        CallableC14408c(MonitorReportService aVar, ReportInfo lVar) {
            this.f37839a = aVar;
            this.f37840b = lVar;
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ Object call() {
            mo52618a();
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo52618a() {
            JSONObject jSONObject;
            boolean z;
            String str;
            try {
                String f = this.f37840b.mo52687f();
                if (f == null) {
                    Identifier c = this.f37840b.mo52684c();
                    if (c != null) {
                        f = c.mo52771c();
                    } else {
                        f = null;
                    }
                }
                JSONObject a = this.f37839a.mo52610a(this.f37840b.mo52688g(), f);
                MonitorReportService aVar = this.f37839a;
                JSONObject j = this.f37840b.mo52691j();
                MonitorConfig d = this.f37839a.mo52617d();
                if (d != null) {
                    jSONObject = d.mo52675e();
                } else {
                    jSONObject = null;
                }
                JSONObject a2 = aVar.mo52611a(j, jSONObject, f);
                String str2 = null;
                MonitorConfig d2 = this.f37839a.mo52617d();
                String str3 = "";
                if (d2 != null) {
                    String a3 = d2.mo52671a();
                    if (a3 != null) {
                        str3 = a3;
                    }
                    str2 = d2.mo52672b();
                }
                String a4 = this.f37840b.mo52678a();
                boolean z2 = true;
                boolean z3 = false;
                if (a4 == null || a4.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str2 = this.f37840b.mo52678a();
                }
                String b = this.f37840b.mo52682b();
                if (!(b == null || b.length() == 0)) {
                    z2 = false;
                }
                if (!z2) {
                    str3 = this.f37840b.mo52682b();
                }
                Identifier c2 = this.f37840b.mo52684c();
                if (c2 == null || (str = c2.mo52769a()) == null) {
                    str = this.f37840b.mo52686e();
                }
                C2641a.C2643a e = new C2641a.C2643a(this.f37840b.mo52685d()).mo11438a(a).mo11442b(this.f37840b.mo52689h()).mo11436a(this.f37839a.f37834a).mo11444c(this.f37840b.mo52692k()).mo11441b(str3).mo11437a(str).mo11446e(a2);
                Boolean i = this.f37840b.mo52690i();
                if (i != null) {
                    z3 = i.booleanValue();
                }
                C2641a.C2643a a5 = e.mo11439a(z3);
                if (str2 != null) {
                    a5.mo11443c(str2);
                }
                HybridMonitor.getInstance().customReport(a5.mo11440a());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IMonitorReportService
    /* renamed from: a */
    public void mo52612a(ReportInfo lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "info");
        Task.callInBackground(new CallableC14408c(this, lVar));
    }

    @Override // com.bytedance.ies.bullet.service.base.impl.BaseBulletService, com.bytedance.ies.bullet.service.base.api.IBulletService
    /* renamed from: a */
    public void mo52613a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "bid");
        super.mo52613a(str);
        HybridMonitor.getInstance().setCustomReportMonitor(this.f37834a);
    }

    public MonitorReportService(IReporter fVar, MonitorConfig kVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "reporter");
        this.f37835b = fVar;
        this.f37837i = kVar;
        if (kVar != null) {
            this.f37836h = kVar.mo52675e();
        }
        this.f37834a = new C14407b(this);
    }

    /* renamed from: a */
    public final JSONObject mo52610a(JSONObject jSONObject, Object obj) {
        String str;
        JSONObject d;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("_bid", mo52631c());
        MonitorConfig kVar = this.f37837i;
        if (kVar != null) {
            str = kVar.mo52673c();
        } else {
            str = null;
        }
        jSONObject.put("_container", str);
        jSONObject.put("_bullet_sdk_version", "1.4.1-alpha.15-lark");
        jSONObject.put("hybrid_platform", obj);
        MonitorConfig kVar2 = this.f37837i;
        if (!(kVar2 == null || (d = kVar2.mo52674d()) == null)) {
            mo52615a(jSONObject, d);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo52615a(JSONObject jSONObject, JSONObject jSONObject2) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "$this$wrap");
        Intrinsics.checkParameterIsNotNull(jSONObject2, "json");
        Iterator<String> keys = jSONObject2.keys();
        Intrinsics.checkExpressionValueIsNotNull(keys, "json.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }

    /* renamed from: a */
    public final JSONObject mo52611a(JSONObject jSONObject, JSONObject jSONObject2, Object obj) {
        JSONObject jSONObject3;
        Iterator<String> keys;
        Iterator<String> keys2;
        if (jSONObject2 != null) {
            jSONObject3 = jSONObject2;
        } else {
            jSONObject3 = new JSONObject();
        }
        if (!(jSONObject == null || (keys2 = jSONObject.keys()) == null)) {
            while (keys2.hasNext()) {
                String next = keys2.next();
                jSONObject3.put(next, jSONObject.opt(next));
            }
        }
        if (!(jSONObject2 == null || (keys = jSONObject2.keys()) == null)) {
            while (keys.hasNext()) {
                String next2 = keys.next();
                jSONObject3.put(next2, jSONObject2.opt(next2));
            }
        }
        if (obj != null) {
            jSONObject3.put("platform", f37832f.get(obj));
        }
        return jSONObject3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\b2\u000e\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "serviceName", "", "kotlin.jvm.PlatformType", UpdateKey.STATUS, "", "duration", "Lorg/json/JSONObject;", "logExtr", "monitorStatusAndDuration"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.a.a$b */
    static final class C14407b implements AbstractC2677a {

        /* renamed from: a */
        final /* synthetic */ MonitorReportService f37838a;

        C14407b(MonitorReportService aVar) {
            this.f37838a = aVar;
        }

        @Override // com.bytedance.android.monitor.webview.AbstractC2677a
        /* renamed from: a */
        public final void mo11563a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f37838a.f37835b.mo33890a(str, i, jSONObject, jSONObject2);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IMonitorReportService
    /* renamed from: a */
    public void mo52614a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f37835b.mo33890a(str, i, jSONObject, jSONObject2);
    }
}
