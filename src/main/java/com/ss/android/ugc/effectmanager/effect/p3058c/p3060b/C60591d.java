package com.ss.android.ugc.effectmanager.effect.p3058c.p3060b;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.common.HandlerC60543j;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60571k;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60576p;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60598f;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60601i;
import com.ss.android.ugc.effectmanager.effect.repository.IFavoriteRepository;
import com.ss.android.ugc.effectmanager.p3043b.C60483a;

/* renamed from: com.ss.android.ugc.effectmanager.effect.c.b.d */
public class C60591d implements HandlerC60543j.AbstractC60544a, IFavoriteRepository {

    /* renamed from: a */
    private C60549e f151481a;

    /* renamed from: b */
    private C60483a f151482b;

    /* renamed from: c */
    private Handler f151483c = new HandlerC60543j(this);

    public C60591d(C60483a aVar) {
        this.f151482b = aVar;
        this.f151481a = aVar.mo207066a();
    }

    @Override // com.ss.android.ugc.effectmanager.common.HandlerC60543j.AbstractC60544a
    /* renamed from: a */
    public void mo207058a(Message message) {
        int i = message.what;
        if (i != 40) {
            if (i != 41) {
                EPLog.m235180c("OldFavoriteRepository", "unknown error");
            } else if (message.obj instanceof C60601i) {
                C60601i iVar = (C60601i) message.obj;
                AbstractC60571k u = this.f151481a.mo207338w().mo208049u(iVar.mo207215a());
                if (u != null) {
                    if (iVar.mo207451c() == null) {
                        u.mo207223a(iVar.mo207450b());
                    } else {
                        u.mo207392a(iVar.mo207451c());
                    }
                    this.f151481a.mo207338w().mo208050v(iVar.mo207215a());
                }
            }
        } else if (message.obj instanceof C60598f) {
            C60598f fVar = (C60598f) message.obj;
            AbstractC60576p s = this.f151481a.mo207338w().mo208047s(fVar.mo207215a());
            if (s != null) {
                if (fVar.mo207444c()) {
                    s.mo207223a(fVar.mo207445d());
                } else {
                    s.mo207397a(fVar.mo207443b());
                }
                this.f151481a.mo207338w().mo208048t(fVar.mo207215a());
            }
        }
    }
}
