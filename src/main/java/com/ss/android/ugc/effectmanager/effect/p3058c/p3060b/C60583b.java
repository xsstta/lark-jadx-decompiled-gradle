package com.ss.android.ugc.effectmanager.effect.p3058c.p3060b;

import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60567g;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60569i;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60570j;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.c.b.b */
public class C60583b {

    /* renamed from: a */
    private EffectChannelResponse f151462a;

    /* renamed from: b */
    private C60549e f151463b;

    public C60583b(C60549e eVar) {
        this.f151463b = eVar;
    }

    /* renamed from: a */
    public void mo207418a(String str, List<Effect> list, C60519c cVar) {
        AbstractC60569i i = this.f151463b.mo207338w().mo208037i(str);
        if (i != null) {
            if (cVar == null) {
                i.mo207223a(list);
            } else {
                i.mo207389a(cVar);
            }
            this.f151463b.mo207338w().mo208038j(str);
        }
    }

    /* renamed from: a */
    public void mo207416a(String str, Effect effect, int i, C60519c cVar) {
        AbstractC60570j g;
        if (i == 20) {
            AbstractC60570j g2 = this.f151463b.mo207338w().mo208035g(str);
            if (g2 != null) {
                g2.mo207223a((Object) effect);
                this.f151463b.mo207338w().mo208036h(str);
            }
        } else if (i == 26 && (g = this.f151463b.mo207338w().mo208035g(str)) != null) {
            g.mo207391a(effect, cVar);
            this.f151463b.mo207338w().mo208036h(str);
        }
    }

    /* renamed from: a */
    public void mo207417a(String str, EffectChannelResponse effectChannelResponse, int i, C60519c cVar) {
        AbstractC60567g o;
        if (i == 23) {
            this.f151462a = effectChannelResponse;
            AbstractC60567g o2 = this.f151463b.mo207338w().mo208043o(str);
            if (o2 != null) {
                o2.mo207223a(effectChannelResponse);
                this.f151463b.mo207338w().mo208044p(str);
            }
        } else if (i == 27 && (o = this.f151463b.mo207338w().mo208043o(str)) != null) {
            o.mo207387a(cVar);
            this.f151463b.mo207338w().mo208044p(str);
        }
    }
}
