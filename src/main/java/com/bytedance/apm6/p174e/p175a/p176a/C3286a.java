package com.bytedance.apm6.p174e.p175a.p176a;

import android.text.TextUtils;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.util.C3355e;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.services.slardar.config.AbstractC20704a;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.e.a.a.a */
public class C3286a {

    /* renamed from: d */
    private static volatile C3286a f10494d;

    /* renamed from: a */
    public volatile JSONObject f10495a;

    /* renamed from: b */
    public AbstractRunnableC3362a f10496b;

    /* renamed from: c */
    public AbstractRunnableC3362a f10497c;

    /* renamed from: e */
    private volatile boolean f10498e;

    /* renamed from: f */
    private List<AbstractC3290b> f10499f;

    /* renamed from: g */
    private boolean f10500g;

    /* renamed from: h */
    private volatile boolean f10501h;

    /* renamed from: i */
    private IConfigManager f10502i;

    private C3286a() {
    }

    /* renamed from: a */
    public static C3286a m13719a() {
        if (f10494d == null) {
            synchronized (C3286a.class) {
                if (f10494d == null) {
                    f10494d = new C3286a();
                }
            }
        }
        return f10494d;
    }

    /* renamed from: b */
    public synchronized void mo13501b() {
        if (!this.f10498e) {
            this.f10498e = true;
            if (C3318a.m13827e()) {
                this.f10496b = new AbstractRunnableC3362a(500, 1000) {
                    /* class com.bytedance.apm6.p174e.p175a.p176a.C3286a.C32871 */

                    public void run() {
                        if (TextUtils.isEmpty(C3318a.m13838p())) {
                            C3350b.m13932a("APM-Config", "DeviceId not ready. try again later.");
                            return;
                        }
                        if (C3286a.this.f10495a == null) {
                            if (C3318a.m13915u()) {
                                C3350b.m13932a("APM-Config", "DeviceId ready. initConfig with device_id=" + C3318a.m13838p());
                            }
                            C3286a.this.mo13502c();
                        } else if (C3318a.m13915u()) {
                            C3350b.m13932a("APM-Config", "config is ready");
                        }
                        C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13586b(C3286a.this.f10496b);
                    }
                };
                C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13585a(this.f10496b);
            }
            IConfigManager iConfigManager = (IConfigManager) C20216d.m73783a(IConfigManager.class);
            this.f10502i = iConfigManager;
            iConfigManager.registerConfigListener(new AbstractC20704a() {
                /* class com.bytedance.apm6.p174e.p175a.p176a.C3286a.C32882 */

                @Override // com.bytedance.services.slardar.config.AbstractC20704a
                public void onReady() {
                }

                @Override // com.bytedance.services.slardar.config.AbstractC20704a
                public void onRefresh(JSONObject jSONObject, final boolean z) {
                    if (jSONObject != null) {
                        try {
                            if (C3318a.m13915u()) {
                                C3350b.m13932a("APM-Config", "onRefresh:" + z + " " + jSONObject);
                            }
                            if (!C3318a.m13827e() || C3286a.this.f10495a == null || !z) {
                                final JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                                C3286a.this.f10497c = new AbstractRunnableC3362a() {
                                    /* class com.bytedance.apm6.p174e.p175a.p176a.C3286a.C32882.C32891 */

                                    public void run() {
                                        try {
                                            C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13586b(C3286a.this.f10497c);
                                            C3286a.this.f10497c = null;
                                            C3286a.this.mo13500a(jSONObject2, z);
                                            if (C3318a.m13915u()) {
                                                C3350b.m13932a("APM-Config", "updateCurrentConfig:" + jSONObject2);
                                            }
                                        } catch (Exception e) {
                                            C3350b.m13935b("APM-Config", "onConfigChanged", e);
                                        }
                                    }
                                };
                                C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13585a(C3286a.this.f10497c);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void mo13502c() {
        if (this.f10502i == null) {
            this.f10502i = (IConfigManager) C20216d.m73783a(IConfigManager.class);
        }
        IConfigManager iConfigManager = this.f10502i;
        if (iConfigManager != null) {
            String queryConfig = iConfigManager.queryConfig();
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Config", "initConfig:" + queryConfig);
            }
            try {
                if (!TextUtils.isEmpty(queryConfig)) {
                    mo13500a(new JSONObject(queryConfig), true);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo13499a(AbstractC3290b bVar) {
        if (bVar != null) {
            if (this.f10499f == null) {
                this.f10499f = new CopyOnWriteArrayList();
            }
            if (!this.f10499f.contains(bVar)) {
                this.f10499f.add(bVar);
            }
            if (this.f10501h) {
                bVar.mo13498a(this.f10495a, this.f10500g);
            }
        }
    }

    /* renamed from: a */
    public void mo13500a(JSONObject jSONObject, boolean z) {
        if (!C3355e.m13956a(jSONObject)) {
            this.f10495a = jSONObject;
            this.f10500g = z;
            m13720b(jSONObject, z);
        }
    }

    /* renamed from: b */
    private void m13720b(JSONObject jSONObject, boolean z) {
        this.f10501h = true;
        List<AbstractC3290b> list = this.f10499f;
        if (list != null) {
            for (AbstractC3290b bVar : list) {
                try {
                    bVar.mo13498a(jSONObject, z);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
