package com.bytedance.ee.lark.infra.config.mina.v2;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12749e;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.lark.infra.config.mina.v2.c */
public class C12745c {

    /* renamed from: f */
    private static final AbstractC12790g<C12745c> f34111f = new AbstractC12790g<C12745c>() {
        /* class com.bytedance.ee.lark.infra.config.mina.v2.C12745c.C127461 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C12745c mo48227b(Context... contextArr) {
            return new C12745c();
        }
    };

    /* renamed from: a */
    public List<AbstractC12751f> f34112a;

    /* renamed from: b */
    private Map<String, AbstractC12751f> f34113b;

    /* renamed from: c */
    private AbstractC12749e f34114c;

    /* renamed from: d */
    private OPTrace f34115d;

    /* renamed from: e */
    private volatile boolean f34116e;

    /* renamed from: c */
    public OPTrace mo48255c() {
        return this.f34115d;
    }

    /* renamed from: a */
    public static final C12745c m52737a() {
        return f34111f.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public List<String> mo48254b() {
        return new ArrayList(this.f34113b.keySet());
    }

    /* renamed from: e */
    public long mo48257e() {
        return C12782a.m52837b("sp_config_ts", 0L);
    }

    private C12745c() {
        OPTrace a = OPTraceService.m192757a();
        this.f34115d = a;
        AppBrandLogger.m52830i("setting_fetcher_service", "traceId:", a.getTracingID());
        this.f34112a = Collections.synchronizedList(new ArrayList());
        this.f34113b = new ConcurrentHashMap();
    }

    /* renamed from: d */
    public void mo48256d() {
        AppBrandLogger.m52830i("setting_fetcher_service", "saveConfigTs:", Long.valueOf(System.currentTimeMillis()));
        C12782a.m52833a("sp_config_ts", System.currentTimeMillis());
    }

    /* renamed from: a */
    public void mo48252a(AbstractC12744b bVar) {
        this.f34112a.add(bVar);
        this.f34113b.put(bVar.getSettingKey(), bVar);
    }

    /* renamed from: a */
    public void mo48253a(AbstractC12749e eVar) {
        if (!this.f34116e) {
            this.f34114c = eVar;
            this.f34116e = true;
        }
    }

    /* renamed from: a */
    public void mo48251a(Context context, final AbstractC12749e.AbstractC12750a aVar) {
        if (this.f34114c == null) {
            AppBrandLogger.m52829e("setting_fetcher_service", "please invoke init method!");
            return;
        }
        final ArrayList arrayList = new ArrayList();
        this.f34114c.mo48261a(context, new AbstractC12749e.AbstractC12750a() {
            /* class com.bytedance.ee.lark.infra.config.mina.v2.C12745c.C127472 */

            @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12749e.AbstractC12750a
            /* renamed from: a */
            public void mo48260a(JSONObject jSONObject) {
                String str;
                AppBrandLogger.m52830i("setting_fetcher_service", "onFetchSettingSuccess...");
                C12745c.this.mo48256d();
                if (C12745c.this.f34112a == null || C12745c.this.f34112a.isEmpty()) {
                    AppBrandLogger.m52830i("setting_fetcher_service", "onFetchSettingSuccess...but setting handler is empty!");
                } else {
                    for (AbstractC12751f fVar : C12745c.this.f34112a) {
                        String settingKey = fVar.getSettingKey();
                        if (TextUtils.isEmpty(settingKey) || !jSONObject.has(settingKey)) {
                            AppBrandLogger.m52830i("setting_fetcher_service", "key:", settingKey, " value is empty!");
                        } else {
                            arrayList.add(settingKey);
                            Object opt = jSONObject.opt(settingKey);
                            if (opt != null) {
                                str = opt.toString();
                            } else {
                                str = "";
                            }
                            fVar.saveSettingFromRemote(str);
                            fVar.reset();
                        }
                    }
                    AppBrandLogger.m52830i("setting_fetcher_service", "onFetchSettingSuccess,Keys:", Arrays.toString(arrayList.toArray()));
                }
                AbstractC12749e.AbstractC12750a aVar = aVar;
                if (aVar != null) {
                    aVar.mo48260a(jSONObject);
                }
            }

            @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12749e.AbstractC12750a
            /* renamed from: a */
            public void mo48259a(String str, String str2) {
                AppBrandLogger.m52829e("setting_fetcher_service", "onFetchSettingFailed...code:", str, "errMsg:", str2);
                AbstractC12749e.AbstractC12750a aVar = aVar;
                if (aVar != null) {
                    aVar.mo48259a(str, str2);
                }
            }
        });
    }
}
