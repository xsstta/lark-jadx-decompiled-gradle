package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.p082c.C2117a;
import com.bumptech.glide.request.AbstractC2510a;
import com.bumptech.glide.request.AbstractC2533d;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.AbstractFutureC2532c;
import com.bumptech.glide.request.C2526b;
import com.bumptech.glide.request.C2534e;
import com.bumptech.glide.request.C2537g;
import com.bumptech.glide.request.C2539i;
import com.bumptech.glide.request.C2541j;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p095a.AbstractC2523k;
import com.bumptech.glide.util.C2560e;
import com.bumptech.glide.util.C2567j;
import com.bumptech.glide.util.C2568k;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.f */
public class C2124f<TranscodeType> extends AbstractC2510a<C2124f<TranscodeType>> implements Cloneable {

    /* renamed from: a */
    protected static final C2537g f7343a = ((C2537g) ((C2537g) ((C2537g) new C2537g().mo11129a(AbstractC2354j.f7813c)).mo11126a(Priority.LOW)).mo11145c(true));

    /* renamed from: b */
    private final Context f7344b;

    /* renamed from: c */
    private final ComponentCallbacks2C2126g f7345c;

    /* renamed from: d */
    private final Class<TranscodeType> f7346d;

    /* renamed from: e */
    private final ComponentCallbacks2C2115c f7347e;

    /* renamed from: f */
    private final C2123e f7348f;

    /* renamed from: g */
    private AbstractC2135h<?, ? super TranscodeType> f7349g;

    /* renamed from: h */
    private Object f7350h;

    /* renamed from: i */
    private List<AbstractC2536f<TranscodeType>> f7351i;

    /* renamed from: j */
    private C2124f<TranscodeType> f7352j;

    /* renamed from: k */
    private C2124f<TranscodeType> f7353k;

    /* renamed from: l */
    private Float f7354l;

    /* renamed from: m */
    private boolean f7355m;

    /* renamed from: n */
    private boolean f7356n;

    /* renamed from: o */
    private boolean f7357o;

    /* renamed from: a */
    public C2124f<TranscodeType> mo10391a(AbstractC2510a<?> aVar) {
        C2567j.m10894a(aVar);
        return (C2124f) super.mo10403b(aVar);
    }

    /* renamed from: a */
    public C2124f<TranscodeType> mo10392a(AbstractC2536f<TranscodeType> fVar) {
        this.f7351i = null;
        return mo10401b((AbstractC2536f) fVar);
    }

    /* renamed from: a */
    public C2124f<TranscodeType> mo10395a(Object obj) {
        return mo102615b(obj);
    }

    /* renamed from: a */
    public C2124f<TranscodeType> mo10396a(String str) {
        return mo102615b(str);
    }

    /* renamed from: a */
    public C2124f<TranscodeType> mo10393a(File file) {
        return mo102615b(file);
    }

    /* renamed from: a */
    public C2124f<TranscodeType> mo10394a(Integer num) {
        return mo102615b(num).mo10391a((AbstractC2510a<?>) C2537g.m10787b(C2117a.m9167a(this.f7344b)));
    }

    /* renamed from: a */
    public <Y extends AbstractC2522j<TranscodeType>> Y mo10397a(Y y) {
        return (Y) mo10398a(y, (AbstractC2536f) null, C2560e.m10877a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <Y extends AbstractC2522j<TranscodeType>> Y mo10398a(Y y, AbstractC2536f<TranscodeType> fVar, Executor executor) {
        return (Y) m9189a(y, fVar, this, executor);
    }

    /* renamed from: a */
    public AbstractC2523k<ImageView, TranscodeType> mo10399a(ImageView imageView) {
        AbstractC2510a<?> aVar;
        C2568k.m10910a();
        C2567j.m10894a(imageView);
        if (!mo11148f() && mo11146e() && imageView.getScaleType() != null) {
            switch (C21251.f7358a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().mo11149g();
                    break;
                case 2:
                    aVar = clone().mo11154k();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().mo11152i();
                    break;
                case 6:
                    aVar = clone().mo11154k();
                    break;
            }
            return (AbstractC2523k) m9189a(this.f7348f.mo10378a(imageView, this.f7346d), null, aVar, C2560e.m10877a());
        }
        aVar = this;
        return (AbstractC2523k) m9189a(this.f7348f.mo10378a(imageView, this.f7346d), null, aVar, C2560e.m10877a());
    }

    /* renamed from: a */
    public AbstractFutureC2532c<TranscodeType> mo10400a(int i, int i2) {
        C2534e eVar = new C2534e(i, i2);
        return (AbstractFutureC2532c) mo10398a(eVar, eVar, C2560e.m10878b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C2124f<File> mo10406c() {
        return new C2124f(File.class, this).mo10391a((AbstractC2510a<?>) f7343a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.f$1 */
    public static /* synthetic */ class C21251 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7358a;

        /* renamed from: b */
        static final /* synthetic */ int[] f7359b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
            // Method dump skipped, instructions count: 144
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C2124f.C21251.<clinit>():void");
        }
    }

    /* renamed from: a */
    public C2124f<TranscodeType> mo10408d() {
        C2124f<TranscodeType> fVar = (C2124f) super.clone();
        fVar.f7349g = fVar.f7349g.clone();
        return fVar;
    }

    /* renamed from: b */
    public AbstractFutureC2532c<TranscodeType> mo10404b() {
        return mo10400a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public C2124f<TranscodeType> mo10390a(C2124f<TranscodeType> fVar) {
        this.f7352j = fVar;
        return this;
    }

    /* renamed from: b */
    private C2124f<TranscodeType> mo102615b(Object obj) {
        this.f7350h = obj;
        this.f7356n = true;
        return this;
    }

    /* renamed from: a */
    public C2124f<TranscodeType> mo10389a(Uri uri) {
        return mo102615b(uri);
    }

    /* renamed from: b */
    public <Y extends AbstractC2522j<File>> Y mo10402b(Y y) {
        return (Y) mo10406c().mo10397a((AbstractC2522j) y);
    }

    /* renamed from: a */
    private void m9192a(List<AbstractC2536f<Object>> list) {
        for (AbstractC2536f<Object> fVar : list) {
            mo10401b((AbstractC2536f) fVar);
        }
    }

    /* renamed from: b */
    private Priority mo102605b(Priority priority) {
        int i = C21251.f7359b[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + mo11114F());
    }

    /* renamed from: b */
    public C2124f<TranscodeType> mo10401b(AbstractC2536f<TranscodeType> fVar) {
        if (fVar != null) {
            if (this.f7351i == null) {
                this.f7351i = new ArrayList();
            }
            this.f7351i.add(fVar);
        }
        return this;
    }

    @Override // com.bumptech.glide.request.AbstractC2510a
    /* renamed from: b */
    public /* synthetic */ AbstractC2510a mo10403b(AbstractC2510a aVar) {
        return mo10391a((AbstractC2510a<?>) aVar);
    }

    /* renamed from: a */
    public C2124f<TranscodeType> mo10387a(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f7354l = Float.valueOf(f);
        return this;
    }

    /* renamed from: a */
    public C2124f<TranscodeType> mo10388a(Bitmap bitmap) {
        return mo102615b(bitmap).mo10391a((AbstractC2510a<?>) C2537g.m10788b(AbstractC2354j.f7812b));
    }

    /* renamed from: a */
    private boolean m9193a(AbstractC2510a<?> aVar, AbstractC2533d dVar) {
        if (aVar.mo11111C() || !dVar.mo11200e()) {
            return false;
        }
        return true;
    }

    protected C2124f(Class<TranscodeType> cls, C2124f<?> fVar) {
        this(fVar.f7347e, fVar.f7345c, cls, fVar.f7344b);
        this.f7350h = fVar.f7350h;
        this.f7356n = fVar.f7356n;
        mo10391a((AbstractC2510a<?>) fVar);
    }

    /* renamed from: b */
    public AbstractFutureC2532c<File> mo10405b(int i, int i2) {
        return mo10406c().mo10400a(i, i2);
    }

    /* renamed from: b */
    private AbstractC2533d m9196b(AbstractC2522j<TranscodeType> jVar, AbstractC2536f<TranscodeType> fVar, AbstractC2510a<?> aVar, Executor executor) {
        return m9190a(new Object(), jVar, fVar, (RequestCoordinator) null, this.f7349g, aVar.mo11114F(), aVar.mo11115G(), aVar.mo11117I(), aVar, executor);
    }

    protected C2124f(ComponentCallbacks2C2115c cVar, ComponentCallbacks2C2126g gVar, Class<TranscodeType> cls, Context context) {
        this.f7355m = true;
        this.f7347e = cVar;
        this.f7345c = gVar;
        this.f7346d = cls;
        this.f7344b = context;
        this.f7349g = gVar.mo10421b(cls);
        this.f7348f = cVar.mo10358e();
        m9192a(gVar.mo10435n());
        mo10391a((AbstractC2510a<?>) gVar.mo10436o());
    }

    /* renamed from: a */
    private <Y extends AbstractC2522j<TranscodeType>> Y m9189a(Y y, AbstractC2536f<TranscodeType> fVar, AbstractC2510a<?> aVar, Executor executor) {
        C2567j.m10894a(y);
        if (this.f7356n) {
            AbstractC2533d b = m9196b(y, fVar, aVar, executor);
            AbstractC2533d a = y.mo11170a();
            if (!b.mo11196a(a) || m9193a(aVar, a)) {
                this.f7345c.mo10417a((AbstractC2522j<?>) y);
                y.mo11171a(b);
                this.f7345c.mo10418a(y, b);
                return y;
            }
            if (!((AbstractC2533d) C2567j.m10894a(a)).mo11199d()) {
                a.mo11194a();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: a */
    private AbstractC2533d m9191a(Object obj, AbstractC2522j<TranscodeType> jVar, AbstractC2536f<TranscodeType> fVar, AbstractC2510a<?> aVar, RequestCoordinator requestCoordinator, AbstractC2135h<?, ? super TranscodeType> hVar, Priority priority, int i, int i2, Executor executor) {
        Context context = this.f7344b;
        C2123e eVar = this.f7348f;
        return C2539i.m10797a(context, eVar, obj, this.f7350h, this.f7346d, aVar, i, i2, priority, jVar, fVar, this.f7351i, requestCoordinator, eVar.mo10381c(), hVar.mo10472b(), executor);
    }

    /* renamed from: a */
    private AbstractC2533d m9190a(Object obj, AbstractC2522j<TranscodeType> jVar, AbstractC2536f<TranscodeType> fVar, RequestCoordinator requestCoordinator, AbstractC2135h<?, ? super TranscodeType> hVar, Priority priority, int i, int i2, AbstractC2510a<?> aVar, Executor executor) {
        C2526b bVar;
        C2526b bVar2;
        if (this.f7353k != null) {
            bVar2 = new C2526b(obj, requestCoordinator);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = requestCoordinator;
        }
        AbstractC2533d b = m9197b(obj, jVar, fVar, bVar2, hVar, priority, i, i2, aVar, executor);
        if (bVar == null) {
            return b;
        }
        int G = this.f7353k.mo11115G();
        int I = this.f7353k.mo11117I();
        if (C2568k.m10911a(i, i2) && !this.f7353k.mo11116H()) {
            G = aVar.mo11115G();
            I = aVar.mo11117I();
        }
        C2124f<TranscodeType> fVar2 = this.f7353k;
        bVar.mo11195a(b, fVar2.m9190a(obj, jVar, fVar, bVar, fVar2.f7349g, fVar2.mo11114F(), G, I, this.f7353k, executor));
        return bVar;
    }

    /* renamed from: b */
    private AbstractC2533d m9197b(Object obj, AbstractC2522j<TranscodeType> jVar, AbstractC2536f<TranscodeType> fVar, RequestCoordinator requestCoordinator, AbstractC2135h<?, ? super TranscodeType> hVar, Priority priority, int i, int i2, AbstractC2510a<?> aVar, Executor executor) {
        AbstractC2135h<?, ? super TranscodeType> hVar2;
        Priority priority2;
        C2124f<TranscodeType> fVar2 = this.f7352j;
        if (fVar2 != null) {
            if (!this.f7357o) {
                AbstractC2135h<?, ? super TranscodeType> hVar3 = fVar2.f7349g;
                if (fVar2.f7355m) {
                    hVar2 = hVar;
                } else {
                    hVar2 = hVar3;
                }
                if (fVar2.mo11113E()) {
                    priority2 = this.f7352j.mo11114F();
                } else {
                    priority2 = mo102605b(priority);
                }
                int G = this.f7352j.mo11115G();
                int I = this.f7352j.mo11117I();
                if (C2568k.m10911a(i, i2) && !this.f7352j.mo11116H()) {
                    G = aVar.mo11115G();
                    I = aVar.mo11117I();
                }
                C2541j jVar2 = new C2541j(obj, requestCoordinator);
                AbstractC2533d a = m9191a(obj, jVar, fVar, aVar, jVar2, hVar, priority, i, i2, executor);
                this.f7357o = true;
                C2124f<TranscodeType> fVar3 = this.f7352j;
                AbstractC2533d a2 = fVar3.m9190a(obj, jVar, fVar, jVar2, hVar2, priority2, G, I, fVar3, executor);
                this.f7357o = false;
                jVar2.mo11216a(a, a2);
                return jVar2;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.f7354l == null) {
            return m9191a(obj, jVar, fVar, aVar, requestCoordinator, hVar, priority, i, i2, executor);
        } else {
            C2541j jVar3 = new C2541j(obj, requestCoordinator);
            jVar3.mo11216a(m9191a(obj, jVar, fVar, aVar, jVar3, hVar, priority, i, i2, executor), m9191a(obj, jVar, fVar, aVar.clone().mo11138b(this.f7354l.floatValue()), jVar3, hVar, mo102605b(priority), i, i2, executor));
            return jVar3;
        }
    }
}
