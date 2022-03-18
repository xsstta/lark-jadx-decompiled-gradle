package com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.p3064a;

import android.os.Handler;
import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60597e;
import com.ss.android.ugc.effectmanager.p3043b.C60483a;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.b.a.e */
public class C60619e extends NormalTask {

    /* renamed from: a */
    private C60549e f151588a;

    /* renamed from: b */
    private Effect f151589b;

    @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60520e
    /* renamed from: a */
    public void mo207037a() {
        ICache t = this.f151588a.mo207335t();
        Effect effect = this.f151589b;
        if (effect == null || t == null) {
            mo207224a(15, new C60597e(effect, new C60519c(10003)));
            return;
        }
        try {
            if (t.mo207134b(effect.getId())) {
                mo207224a(15, new C60597e(this.f151589b, null));
            } else {
                mo207224a(15, new C60597e(this.f151589b, new C60519c(10003)));
            }
        } catch (Exception e) {
            mo207224a(15, new C60597e(this.f151589b, new C60519c(e)));
        }
    }

    public C60619e(C60483a aVar, Effect effect, Handler handler, String str) {
        super(handler, str);
        this.f151588a = aVar.mo207066a();
        this.f151589b = effect;
    }
}
