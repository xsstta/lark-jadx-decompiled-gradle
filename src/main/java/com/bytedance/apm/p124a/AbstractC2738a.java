package com.bytedance.apm.p124a;

import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.C3013j;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p124a.AbstractC2747b;
import com.bytedance.apm.p124a.p127c.C2755a;
import com.bytedance.apm.p129b.C2786a;
import com.bytedance.apm.p129b.C2787b;
import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm.p139e.C2925e;
import com.bytedance.apm.p142h.C2942a;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3121h;
import com.bytedance.apm6.p157a.C3150a;
import com.bytedance.apm6.p157a.p159b.C3156c;
import com.bytedance.apm6.p157a.p159b.C3157d;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.services.slardar.config.AbstractC20704a;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.tracing.p908a.C20711a;
import com.bytedance.tracing.p908a.C20716d;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.a */
public abstract class AbstractC2738a<T extends AbstractC2747b> implements AbstractC20704a {

    /* renamed from: b */
    private static int f8794b = 1000;

    /* renamed from: a */
    public final LinkedList<T> f8795a = new LinkedList<>();

    /* renamed from: c */
    private volatile boolean f8796c;

    /* renamed from: d */
    private volatile boolean f8797d;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo11788c(T t) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo11789d(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo11790e(T t);

    @Override // com.bytedance.services.slardar.config.AbstractC20704a
    public void onRefresh(JSONObject jSONObject, boolean z) {
    }

    protected AbstractC2738a() {
    }

    /* renamed from: c */
    private void m11621c() {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.p124a.AbstractC2738a.RunnableC27402 */

            /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: com.bytedance.apm.a.a */
            /* JADX WARN: Multi-variable type inference failed */
            public void run() {
                LinkedList linkedList;
                synchronized (AbstractC2738a.this.f8795a) {
                    linkedList = new LinkedList(AbstractC2738a.this.f8795a);
                    AbstractC2738a.this.f8795a.clear();
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    AbstractC2738a.this.mo11790e((AbstractC2747b) it.next());
                }
            }
        });
    }

    /* renamed from: a */
    public void mo11784a() {
        ((IConfigManager) C20216d.m73783a(IConfigManager.class)).registerConfigListener(this);
    }

    /* renamed from: b */
    protected static boolean m11620b() {
        if (ActivityLifeObserver.getInstance() == null) {
            return true;
        }
        return !ActivityLifeObserver.getInstance().isForeground();
    }

    @Override // com.bytedance.services.slardar.config.AbstractC20704a
    public void onReady() {
        this.f8796c = true;
        m11621c();
        if (C2785b.m11769j()) {
            C2787b.m11791a().mo12090a("APM_SETTING_READY", (String) null);
        }
    }

    /* renamed from: a */
    public static void m11618a(int i) {
        f8794b = i;
    }

    /* renamed from: a */
    public final void mo11785a(final T t) {
        if (!C3047b.m12756a().mo12891b()) {
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.p124a.AbstractC2738a.RunnableC27391 */

                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.apm.a.a */
                /* JADX WARN: Multi-variable type inference failed */
                public void run() {
                    AbstractC2738a.this.mo11787b(t);
                }
            });
        } else {
            mo11787b(t);
        }
    }

    /* renamed from: a */
    private void m11619a(C20716d dVar) {
        if ("batch_tracing".equals(dVar.mo11810c())) {
            C3150a.m13125a(new C3157d(C20711a.m75500a(dVar.mo11807a())));
        } else {
            C3150a.m13125a(new C3157d(dVar.mo11807a()));
        }
    }

    /* renamed from: b */
    public void mo11787b(T t) {
        if (mo11788c(t)) {
            mo11789d(t);
            if (this.f8796c) {
                mo11790e(t);
            } else {
                m11622f(t);
            }
        }
    }

    /* renamed from: f */
    private void m11622f(T t) {
        if (t != null) {
            synchronized (this.f8795a) {
                if (this.f8795a.size() > f8794b) {
                    T poll = this.f8795a.poll();
                    if (!this.f8797d) {
                        C3013j.m12658a().mo12826a("apm_cache_buffer_full");
                        this.f8797d = true;
                    }
                    try {
                        C2921a.m12360c("apm_debug", "apm_cache_buffer_full:" + poll.mo11807a().toString());
                    } catch (Exception unused) {
                    }
                }
                this.f8795a.add(t);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11786a(String str, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        if (C2785b.m11769j()) {
            C2925e.m12375d("BaseDataPipeline", "type:" + str + " isSaveUnSampleLog:" + z2 + "isSampled:" + z + " log:" + jSONObject);
            C2786a.m11784a(str, jSONObject, z);
        }
        if (z) {
            JSONObject d = C3121h.m13004d(jSONObject);
            if (TextUtils.equals(str, "tracing")) {
                m11619a(new C20716d(d, null, false, str2));
            } else if (TextUtils.equals(str, "common_log")) {
                C3150a.m13124a(new C3156c(str2, d));
            } else {
                C3150a.m13124a(new C3156c(str, d));
            }
        } else if (z2 && C2921a.m12359b()) {
            C2921a.m12362e(str, jSONObject.toString());
        }
        C2942a.m12401a().mo12642a(str, str2, jSONObject);
        if (TextUtils.equals(str, "ui_action")) {
            C2755a.m11711a().mo11824a(jSONObject);
        }
    }
}
