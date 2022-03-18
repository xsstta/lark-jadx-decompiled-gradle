package com.tt.miniapp.event.p3281b;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.tt.miniapp.event.p3281b.p3282a.C66024a;
import com.tt.miniapp.event.p3281b.p3282a.C66025b;
import com.tt.miniapp.event.p3281b.p3282a.C66026c;
import com.tt.miniapp.event.p3281b.p3282a.C66027d;
import com.tt.miniapp.event.p3281b.p3282a.C66028e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.event.b.d */
public class C66031d {

    /* renamed from: a */
    String f166690a;

    /* renamed from: b */
    private List<AbstractC66023a> f166691b = new ArrayList();

    /* renamed from: a */
    public static void m258563a() {
        AppBrandLogger.m52828d("InnerEventHandler", "checkAndReportSavedEvents");
        C67554l.m262725b().execute(new Runnable() {
            /* class com.tt.miniapp.event.p3281b.C66031d.RunnableC660321 */

            public void run() {
                C66029b a;
                SharedPreferences d = C66031d.m258565d();
                if (d == null) {
                    AppBrandLogger.m52828d("InnerEventHandler", "host_check: no prefs");
                    return;
                }
                Map<String, ?> all = d.getAll();
                if (all == null || all.isEmpty()) {
                    AppBrandLogger.m52828d("InnerEventHandler", "host_check: prefs empty events");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (String str : all.keySet()) {
                    Object obj = all.get(str);
                    if ((obj instanceof String) && (a = C66031d.m258562a(str, obj.toString())) != null) {
                        arrayList.add(a);
                    }
                }
                AppBrandLogger.m52828d("InnerEventHandler", "checkAndReportSavedEvents: clear");
                d.edit().clear().apply();
                if (arrayList.isEmpty()) {
                    AppBrandLogger.m52828d("InnerEventHandler", "host_check: empty events");
                    return;
                }
                AppBrandLogger.m52828d("InnerEventHandler", "checkAndReportSavedEvents: report=" + arrayList.size());
                C66031d.m258564a(arrayList);
            }
        });
    }

    /* renamed from: d */
    public static SharedPreferences m258565d() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        return C12899a.m53203a(applicationContext, "mp_events_prefs");
    }

    /* renamed from: b */
    public void mo231109b() {
        SharedPreferences d = m258565d();
        if (d != null) {
            d.edit().clear().apply();
        }
    }

    /* renamed from: e */
    private void m258566e() {
        this.f166691b.add(new C66026c(this));
        this.f166691b.add(new C66027d(this));
        this.f166691b.add(new C66024a(this));
        this.f166691b.add(new C66028e(this));
        this.f166691b.add(new C66025b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo231111c() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC66023a aVar : this.f166691b) {
            List<C66029b> b = aVar.mo231098b();
            if (b != null && !b.isEmpty()) {
                arrayList.addAll(b);
            }
            aVar.mo231094a();
        }
        m258564a(arrayList);
        this.f166691b.clear();
    }

    public C66031d(String str) {
        this.f166690a = str;
        m258566e();
        AppBrandLogger.m52828d("InnerEventHandler", "49411_AbsInnerLogHandler: " + str);
    }

    /* renamed from: b */
    public void mo231110b(C66029b bVar) {
        SharedPreferences d = m258565d();
        if (d != null && bVar != null) {
            d.edit().remove(C66030c.m258560a(this.f166690a, bVar)).apply();
        }
    }

    /* renamed from: a */
    public static void m258564a(List<C66029b> list) {
        if (!(list == null || list.isEmpty())) {
            AbstractC67571b syncHandler = AppbrandContext.getInst().getSyncHandler("actionLog");
            if (syncHandler == null) {
                AppBrandLogger.m52828d("InnerEventHandler", "report: null handler");
                return;
            }
            for (C66029b bVar : list) {
                AppBrandLogger.m52828d("InnerEventHandler", "report: " + bVar);
                syncHandler.mo49138a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("logEventName", (Object) bVar.f166686a).mo234760a("logEventData", bVar.f166687b).mo234763b());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo231112c(C66029b bVar) {
        boolean z = bVar.f166688c;
        for (AbstractC66023a aVar : this.f166691b) {
            boolean f = aVar.mo231103f(bVar);
            if (z || f) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo231107a(C66029b bVar) {
        SharedPreferences d = m258565d();
        if (d != null && bVar != null) {
            d.edit().putString(C66030c.m258560a(this.f166690a, bVar), C66030c.m258558a(bVar)).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo231108a(String str) {
        for (AbstractC66023a aVar : this.f166691b) {
            aVar.mo231096a(str, this.f166690a);
        }
    }

    /* renamed from: a */
    public static C66029b m258562a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new C66029b(C66030c.m258559a(str), new JSONObject(str2), false);
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("InnerEventHandler", "host_check", e);
            }
        }
        return null;
    }
}
