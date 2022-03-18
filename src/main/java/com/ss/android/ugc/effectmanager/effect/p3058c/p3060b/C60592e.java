package com.ss.android.ugc.effectmanager.effect.p3058c.p3060b;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.effectmanager.common.HandlerC60543j;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60577q;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60580t;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60607o;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60610r;
import com.ss.android.ugc.effectmanager.effect.repository.IUpdateTagRepository;
import com.ss.android.ugc.effectmanager.p3043b.C60483a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.c.b.e */
public class C60592e implements HandlerC60543j.AbstractC60544a, IUpdateTagRepository {

    /* renamed from: a */
    private final String f151484a = "OldUpdateTagRepository";

    /* renamed from: b */
    private HashMap<String, String> f151485b;

    /* renamed from: c */
    private C60483a f151486c;

    /* renamed from: d */
    private Handler f151487d;

    public C60592e(C60483a aVar) {
        this.f151486c = aVar;
        this.f151487d = new HandlerC60543j(this);
    }

    @Override // com.ss.android.ugc.effectmanager.common.HandlerC60543j.AbstractC60544a
    /* renamed from: a */
    public void mo207058a(Message message) {
        int i = message.what;
        if (i != 51) {
            if (i != 52) {
                EPLog.m235180c("OldUpdateTagRepository", "unknown error");
            } else if (message.obj instanceof C60607o) {
                C60607o oVar = (C60607o) message.obj;
                C60483a aVar = this.f151486c;
                if (aVar != null) {
                    AbstractC60577q w = aVar.mo207066a().mo207338w().mo208051w(oVar.mo207215a());
                    if (this.f151485b == null) {
                        this.f151485b = new HashMap<>();
                    }
                    if (oVar.mo207463c() == null) {
                        this.f151485b.putAll(oVar.mo207462b());
                        if (w != null) {
                            w.mo207223a(this.f151485b);
                        }
                    } else if (w != null) {
                        w.mo207398a(oVar.mo207463c());
                    }
                    this.f151486c.mo207066a().mo207338w().mo208052x(oVar.mo207215a());
                }
            }
        } else if (message.obj instanceof C60610r) {
            C60610r rVar = (C60610r) message.obj;
            C60483a aVar2 = this.f151486c;
            if (aVar2 != null) {
                AbstractC60580t y = aVar2.mo207066a().mo207338w().mo208053y(rVar.mo207215a());
                if (y != null) {
                    y.mo207401a();
                }
                this.f151486c.mo207066a().mo207338w().mo208054z(rVar.mo207215a());
            }
        }
    }
}
