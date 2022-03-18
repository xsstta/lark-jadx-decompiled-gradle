package com.ss.android.ugc.effectmanager.effect.p3058c.p3060b;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.common.HandlerC60543j;
import com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60520e;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.common.utils.TaskUtil;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60561a;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60566f;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60573m;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60574n;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60578r;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60594b;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60595c;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60599g;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60602j;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60605m;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60608p;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.p3064a.C60614a;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.p3064a.C60617c;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.p3064a.C60618d;
import com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository;
import com.ss.android.ugc.effectmanager.p3043b.C60483a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.c.b.a */
public class C60581a implements HandlerC60543j.AbstractC60544a, IEffectListRepository {

    /* renamed from: a */
    private C60483a f151458a;

    /* renamed from: b */
    private C60549e f151459b;

    /* renamed from: c */
    private Handler f151460c = new HandlerC60543j(this);

    /* renamed from: d */
    private AbstractC60582a f151461d;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.c.b.a$a */
    public interface AbstractC60582a {
        /* renamed from: a */
        void mo207415a(String str, EffectChannelResponse effectChannelResponse, int i, C60519c cVar);
    }

    /* renamed from: a */
    public void mo207414a(AbstractC60582a aVar) {
        this.f151461d = aVar;
    }

    public C60581a(C60483a aVar) {
        this.f151458a = aVar;
        this.f151459b = aVar.mo207066a();
    }

    @Override // com.ss.android.ugc.effectmanager.common.HandlerC60543j.AbstractC60544a
    /* renamed from: a */
    public void mo207058a(Message message) {
        if (this.f151461d != null) {
            if (message.what == 14 && (message.obj instanceof C60594b)) {
                C60594b bVar = (C60594b) message.obj;
                C60519c c = bVar.mo207432c();
                if (c == null) {
                    this.f151461d.mo207415a(bVar.mo207215a(), bVar.mo207431b(), 23, null);
                } else {
                    this.f151461d.mo207415a(bVar.mo207215a(), bVar.mo207431b(), 27, c);
                }
            }
            if (message.what == 22 && (message.obj instanceof C60602j)) {
                C60602j jVar = (C60602j) message.obj;
                AbstractC60573m a = this.f151459b.mo207338w().mo208026a(jVar.mo207215a());
                if (a != null) {
                    C60519c c2 = jVar.mo207453c();
                    if (c2 == null) {
                        a.mo207223a(jVar.mo207452b());
                    } else {
                        a.mo207394a(c2);
                    }
                    this.f151459b.mo207338w().mo208030b(jVar.mo207215a());
                }
            }
            if (message.what == 18 && (message.obj instanceof C60605m)) {
                C60605m mVar = (C60605m) message.obj;
                C60519c c3 = mVar.mo207459c();
                AbstractC60574n A = this.f151459b.mo207338w().mo208020A(mVar.mo207215a());
                if (A != null) {
                    if (c3 == null) {
                        A.mo207223a(mVar.mo207458b());
                    } else {
                        A.mo207395a(mVar.mo207459c());
                    }
                    this.f151459b.mo207338w().mo208021B(mVar.mo207215a());
                }
            }
            if (message.what == 21 && (message.obj instanceof C60599g)) {
                C60599g gVar = (C60599g) message.obj;
                C60519c c4 = gVar.mo207447c();
                AbstractC60566f c5 = this.f151459b.mo207338w().mo208031c(gVar.mo207215a());
                if (c5 != null) {
                    if (c4 == null) {
                        c5.mo207223a(gVar.mo207446b());
                    } else {
                        c5.mo207386a(c4);
                    }
                    this.f151459b.mo207338w().mo208032d(gVar.mo207215a());
                }
            }
            if (message.what == 13 && (message.obj instanceof C60595c)) {
                C60595c cVar = (C60595c) message.obj;
                C60519c b = cVar.mo207433b();
                AbstractC60561a k = this.f151459b.mo207338w().mo208039k(cVar.mo207215a());
                if (k != null) {
                    if (b == null) {
                        k.mo207381a(cVar.mo207434c());
                    } else {
                        k.mo207380a(b);
                    }
                    this.f151459b.mo207338w().mo208040l(cVar.mo207215a());
                }
            }
            if (message.what == 25 && (message.obj instanceof C60608p)) {
                C60608p pVar = (C60608p) message.obj;
                C60519c cVar2 = pVar.f151524b;
                AbstractC60578r m = this.f151459b.mo207338w().mo208041m(pVar.mo207215a());
                if (m != null) {
                    if (cVar2 == null) {
                        m.mo207223a(pVar.f151523a);
                    } else {
                        m.mo207399a(cVar2);
                    }
                    this.f151459b.mo207338w().mo208042n(pVar.mo207215a());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    /* renamed from: a */
    public String mo207403a(String str, String str2, int i, Map<String, String> map, AbstractC60561a aVar) {
        String a = TaskUtil.f151362a.mo207279a();
        this.f151458a.mo207066a().mo207338w().mo208027a(a, aVar);
        this.f151459b.mo207333r().mo207281a(new C60614a(this.f151458a, a, this.f151460c, str, str2, i, map));
        return a;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    /* renamed from: a */
    public String mo207402a(String str, String str2, int i, int i2, int i3, String str3, boolean z, AbstractC60566f fVar) {
        AbstractC60520e eVar;
        String a = TaskUtil.f151362a.mo207279a();
        this.f151458a.mo207066a().mo207338w().mo208028a(a, fVar);
        if (z) {
            eVar = new C60617c(this.f151458a, str, a, str2, i, i2, i3, str3, this.f151460c);
        } else {
            eVar = new C60618d(this.f151458a, str, a, str2, i, i2, i3, str3, this.f151460c);
        }
        this.f151459b.mo207333r().mo207281a(eVar);
        return a;
    }
}
