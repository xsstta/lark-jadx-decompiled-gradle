package com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.p3064a;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60511c;
import com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60522h;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.common.p3052g.C60521g;
import com.ss.android.ugc.effectmanager.common.p3053h.C60531j;
import com.ss.android.ugc.effectmanager.common.p3053h.C60532k;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.p3056a.C60560b;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60597e;
import com.ss.android.ugc.effectmanager.effect.repository.newrepo.EffectDownloadManager;
import com.ss.android.ugc.effectmanager.p3043b.C60483a;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.b.a.b */
public class C60615b extends NormalTask {

    /* renamed from: a */
    public Effect f151550a;

    /* renamed from: b */
    public EffectDownloadManager f151551b;

    /* renamed from: c */
    private int f151552c;

    /* renamed from: d */
    private C60483a f151553d;

    /* renamed from: e */
    private List<String> f151554e;

    /* renamed from: f */
    private C60549e f151555f;

    /* renamed from: g */
    private DownloadEffectExtra f151556g;

    /* renamed from: h */
    private AbstractC60511c f151557h;

    @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60520e
    /* renamed from: a */
    public void mo207037a() {
        m235524c();
    }

    /* renamed from: c */
    private void m235524c() {
        C60521g<C60597e> fetchEffect = this.f151553d.mo207066a().mo207336u().fetchEffect(new C60560b(this.f151550a, this.f151554e, this.f151555f.mo207326k().getPath()));
        final C60597e a = new C60597e(this.f151550a, null).mo207437a(0).mo207438a(0L);
        fetchEffect.mo207230a(new AbstractC60522h<C60597e>() {
            /* class com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.p3064a.C60615b.C606161 */

            @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60522h
            /* renamed from: b */
            public void mo207053b(C60521g<C60597e> gVar) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60522h
            /* renamed from: a */
            public void mo207048a(C60521g<C60597e> gVar) {
                if (C60615b.this.f151551b != null) {
                    C60615b.this.f151551b.mo207410c(C60615b.this.f151550a);
                }
                C60615b bVar = C60615b.this;
                bVar.mo207224a(42, new C60597e(bVar.f151550a, null));
            }

            @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60522h
            /* renamed from: a */
            public void mo207050a(C60521g<C60597e> gVar, C60519c cVar) {
                C60615b.this.mo207467a(false, cVar);
                if (C60615b.this.f151551b != null) {
                    C60615b.this.f151551b.mo207405a(C60615b.this.f151550a, cVar);
                }
                C60615b bVar = C60615b.this;
                bVar.mo207224a(15, new C60597e(bVar.f151550a, cVar));
            }

            /* renamed from: a */
            public void mo207052a(C60521g<C60597e> gVar, C60597e eVar) {
                C60615b.this.mo207467a(true, (C60519c) null);
                if (C60615b.this.f151551b != null) {
                    C60615b.this.f151551b.mo207409b(C60615b.this.f151550a);
                }
                C60615b.this.mo207224a(15, new C60597e(eVar.mo207439b(), null));
            }

            @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60522h
            /* renamed from: a */
            public void mo207049a(C60521g<C60597e> gVar, int i, long j) {
                if (C60615b.this.f151551b != null) {
                    C60615b.this.f151551b.mo207404a(C60615b.this.f151550a, i, j);
                }
                C60615b.this.mo207224a(53, a.mo207437a(i).mo207438a(j));
            }
        });
        fetchEffect.mo207047a();
    }

    /* renamed from: a */
    public void mo207467a(boolean z, C60519c cVar) {
        DownloadEffectExtra downloadEffectExtra;
        String str;
        String str2;
        if (!(this.f151557h == null || (downloadEffectExtra = this.f151556g) == null)) {
            if (TextUtils.equals("beautify", downloadEffectExtra.getPanel()) || TextUtils.equals("beautifynew", this.f151556g.getPanel())) {
                int i = !z ? 1 : 0;
                StringBuilder sb = new StringBuilder();
                List<String> list = this.f151554e;
                if (list != null) {
                    for (String str3 : list) {
                        sb.append(str3);
                        sb.append(",");
                    }
                }
                AbstractC60511c cVar2 = this.f151557h;
                C60532k a = C60532k.m235271a();
                Effect effect = this.f151550a;
                String str4 = "";
                if (effect == null) {
                    str = str4;
                } else {
                    str = effect.getEffectId();
                }
                C60532k a2 = a.mo207241a("effect_id", str);
                Effect effect2 = this.f151550a;
                if (effect2 == null) {
                    str2 = str4;
                } else {
                    str2 = effect2.getName();
                }
                C60532k a3 = a2.mo207241a("effect_name", str2).mo207241a("app_id", this.f151555f.mo207329n()).mo207241a("access_key", this.f151555f.mo207318c()).mo207241a("download_urls", sb.toString()).mo207241a("panel", this.f151556g.getPanel()).mo207241a("error_code", cVar == null ? str4 : str4 + cVar.mo207221c());
                if (cVar != null) {
                    str4 = cVar.mo207217a();
                }
                cVar2.mo207190a("effect_resource_download_success_rate", i, a3.mo207241a("error_msg", str4).mo207239a("effect_platform_type", (Integer) 0).mo207243b());
            }
        }
    }

    public C60615b(Effect effect, C60483a aVar, String str, Handler handler) {
        this(effect, aVar, str, handler, null);
    }

    public C60615b(Effect effect, C60483a aVar, String str, Handler handler, DownloadEffectExtra downloadEffectExtra) {
        super(handler, str);
        this.f151550a = effect;
        this.f151553d = aVar;
        this.f151555f = aVar.mo207066a();
        this.f151552c = aVar.mo207066a().mo207327l();
        this.f151554e = C60531j.m235269b(this.f151550a.getFileUrl());
        this.f151556g = downloadEffectExtra;
        this.f151557h = this.f151555f.mo207339x();
        this.f151551b = this.f151555f.mo207317b();
    }
}
