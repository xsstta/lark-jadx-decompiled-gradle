package com.ss.android.ugc.effectmanager.effect.p3061d.p3063b;

import com.ss.android.ugc.effectmanager.common.download.DownloadListenerAdapter;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60511c;
import com.ss.android.ugc.effectmanager.common.p3051f.C60515a;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.common.p3052g.C60521g;
import com.ss.android.ugc.effectmanager.common.p3053h.C60532k;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.p3056a.AbstractC60559a;
import com.ss.android.ugc.effectmanager.effect.p3056a.C60560b;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60597e;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.b.a */
public class C60611a implements AbstractC60559a {

    /* renamed from: a */
    public final C60515a f151527a;

    /* renamed from: b */
    public final AbstractC60511c f151528b;

    /* renamed from: c */
    public final String f151529c;

    /* renamed from: d */
    public final String f151530d;

    @Override // com.ss.android.ugc.effectmanager.effect.p3056a.AbstractC60559a
    public C60521g<C60597e> fetchEffect(final C60560b bVar) {
        final MonitorTrace bVar2 = new MonitorTrace(bVar.mo207377a().getEffectId());
        return new C60521g<C60597e>() {
            /* class com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.C60611a.C606121 */

            /* renamed from: a */
            String f151531a;

            /* renamed from: b */
            String f151532b;

            /* renamed from: c */
            Effect f151533c;

            /* renamed from: d */
            long f151534d;

            /* renamed from: e */
            long f151535e;

            /* renamed from: f */
            long f151536f;

            /* renamed from: g */
            long f151537g;

            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x02bd */
            /* JADX DEBUG: Multi-variable search result rejected for r10v19, resolved type: long */
            /* JADX DEBUG: Multi-variable search result rejected for r9v30, resolved type: long */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v16 */
            /* JADX WARN: Type inference failed for: r9v27 */
            /* JADX WARN: Type inference failed for: r10v20 */
            /* JADX WARN: Type inference failed for: r9v31 */
            /* JADX WARN: Type inference failed for: r9v35 */
            /* JADX WARN: Type inference failed for: r10v35 */
            /* JADX WARNING: Code restructure failed: missing block: B:71:0x0323, code lost:
                com.ss.android.ugc.effectmanager.common.monitor.EPMonitor.m235193b(r1);
                mo207466a((com.ss.android.ugc.effectmanager.common.p3052g.C60521g<com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60597e>) r25, new com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60597e(r12, null));
             */
            /* JADX WARNING: Removed duplicated region for block: B:105:0x044a A[LOOP:0: B:9:0x0093->B:105:0x044a, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:111:0x0382 A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:112:0x03ca A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:76:0x033f A[Catch:{ Exception -> 0x0386 }] */
            @Override // com.ss.android.ugc.effectmanager.common.p3052g.C60521g
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo207047a() {
                /*
                // Method dump skipped, instructions count: 1166
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.C60611a.C606121.mo207047a():void");
            }

            /* renamed from: com.ss.android.ugc.effectmanager.effect.d.b.a$1$a */
            class C60613a extends DownloadListenerAdapter {

                /* renamed from: b */
                private C60521g<C60597e> f151542b;

                public C60613a(C60521g gVar) {
                    this.f151542b = gVar;
                }

                @Override // com.ss.android.ugc.effectmanager.common.download.DownloadListenerAdapter, com.ss.android.ugc.effectmanager.common.download.DownloadListener
                /* renamed from: a */
                public void mo207196a(int i, long j) {
                    C60521g<C60597e> gVar = this.f151542b;
                    if (gVar != null) {
                        gVar.mo207227a(gVar, i, j);
                    }
                }
            }

            /* renamed from: a */
            private void m235514a(String str, String str2) {
                String str3;
                if (!str.equals(str2) && C60611a.this.f151528b != null) {
                    AbstractC60511c cVar = C60611a.this.f151528b;
                    C60532k a = C60532k.m235271a().mo207241a("app_id", C60611a.this.f151529c).mo207241a("access_key", C60611a.this.f151530d);
                    Effect effect = this.f151533c;
                    if (effect == null) {
                        str3 = "";
                    } else {
                        str3 = effect.getEffectId();
                    }
                    cVar.mo207190a("effect_download_error", 1, a.mo207241a("effect_id", str3).mo207241a("EffectDir", str).mo207241a("zippath", str2).mo207243b());
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.p3052g.C60521g
            /* renamed from: a */
            public void mo207228a(C60521g<C60597e> gVar, C60519c cVar) {
                String str;
                super.mo207228a((C60521g) gVar, cVar);
                if (this.f151533c != null) {
                    EPLog.m235177a("DefaultEffectFetcher", "effect " + this.f151533c.getId() + " download failed! ", cVar.mo207220b());
                } else {
                    EPLog.m235177a("DefaultEffectFetcher", "null effect download failed! ", cVar.mo207220b());
                }
                if (C60611a.this.f151528b != null) {
                    AbstractC60511c cVar2 = C60611a.this.f151528b;
                    C60532k a = C60532k.m235271a().mo207241a("app_id", C60611a.this.f151529c).mo207241a("access_key", C60611a.this.f151530d);
                    Effect effect = this.f151533c;
                    if (effect == null) {
                        str = "";
                    } else {
                        str = effect.getEffectId();
                    }
                    cVar2.mo207190a("effect_download_success_rate", 1, a.mo207241a("effect_id", str).mo207239a("error_code", Integer.valueOf(cVar.mo207221c())).mo207241a("error_msg", cVar.mo207217a()).mo207242a("monitor_trace", bVar2.mo207201a()).mo207241a("download_url", this.f151531a).mo207241a("host_ip", this.f151532b).mo207239a("effect_platform_type", (Integer) 0).mo207243b());
                }
            }

            /* renamed from: a */
            public void mo207229a(C60521g<C60597e> gVar, C60597e eVar) {
                String str;
                super.mo207229a((C60521g) gVar, (Object) eVar);
                if (C60611a.this.f151528b != null) {
                    AbstractC60511c cVar = C60611a.this.f151528b;
                    C60532k a = C60532k.m235271a().mo207241a("app_id", C60611a.this.f151529c).mo207241a("access_key", C60611a.this.f151530d).mo207240a("duration", Long.valueOf(this.f151534d)).mo207240a("download_time", Long.valueOf(this.f151536f)).mo207240a("unzip_time", Long.valueOf(this.f151535e));
                    Effect effect = this.f151533c;
                    if (effect == null) {
                        str = "";
                    } else {
                        str = effect.getEffectId();
                    }
                    cVar.mo207190a("effect_download_success_rate", 0, a.mo207241a("effect_id", str).mo207240a("size", Long.valueOf(this.f151537g)).mo207239a("effect_platform_type", (Integer) 0).mo207243b());
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.p3052g.C60521g
            /* renamed from: a */
            public void mo207227a(C60521g<C60597e> gVar, int i, long j) {
                super.mo207227a(gVar, i, j);
            }
        };
    }

    public C60611a(C60515a aVar, AbstractC60511c cVar, String str, String str2) {
        this.f151527a = aVar;
        this.f151528b = cVar;
        this.f151529c = str;
        this.f151530d = str2;
    }
}
