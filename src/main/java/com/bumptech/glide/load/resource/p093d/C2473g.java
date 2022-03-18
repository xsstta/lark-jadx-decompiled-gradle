package com.bumptech.glide.load.resource.p093d;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.ComponentCallbacks2C2126g;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.p082c.C2120d;
import com.bumptech.glide.request.AbstractC2510a;
import com.bumptech.glide.request.C2537g;
import com.bumptech.glide.request.p095a.AbstractC2513c;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.bumptech.glide.util.C2567j;
import com.bumptech.glide.util.C2568k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.resource.d.g */
public class C2473g {

    /* renamed from: a */
    final ComponentCallbacks2C2126g f8065a;

    /* renamed from: b */
    private final GifDecoder f8066b;

    /* renamed from: c */
    private final Handler f8067c;

    /* renamed from: d */
    private final List<AbstractC2475b> f8068d;

    /* renamed from: e */
    private final AbstractC2283e f8069e;

    /* renamed from: f */
    private boolean f8070f;

    /* renamed from: g */
    private boolean f8071g;

    /* renamed from: h */
    private boolean f8072h;

    /* renamed from: i */
    private C2124f<Bitmap> f8073i;

    /* renamed from: j */
    private C2474a f8074j;

    /* renamed from: k */
    private boolean f8075k;

    /* renamed from: l */
    private C2474a f8076l;

    /* renamed from: m */
    private Bitmap f8077m;

    /* renamed from: n */
    private AbstractC2393i<Bitmap> f8078n;

    /* renamed from: o */
    private C2474a f8079o;

    /* renamed from: p */
    private AbstractC2477d f8080p;

    /* renamed from: q */
    private int f8081q;

    /* renamed from: r */
    private int f8082r;

    /* renamed from: s */
    private int f8083s;

    /* renamed from: com.bumptech.glide.load.resource.d.g$b */
    public interface AbstractC2475b {
        /* renamed from: f */
        void mo11005f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.resource.d.g$d */
    public interface AbstractC2477d {
        /* renamed from: a */
        void mo11039a();
    }

    /* renamed from: k */
    private void m10437k() {
        this.f8070f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.resource.d.g$a */
    public static class C2474a extends AbstractC2513c<Bitmap> {

        /* renamed from: a */
        final int f8084a;

        /* renamed from: b */
        private final Handler f8085b;

        /* renamed from: c */
        private final long f8086c;

        /* renamed from: d */
        private Bitmap f8087d;

        /* access modifiers changed from: package-private */
        public Bitmap f_() {
            return this.f8087d;
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: a */
        public void mo11036a(Drawable drawable) {
            this.f8087d = null;
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
            mo11035a((Bitmap) obj, (AbstractC2529b<? super Bitmap>) bVar);
        }

        /* renamed from: a */
        public void mo11035a(Bitmap bitmap, AbstractC2529b<? super Bitmap> bVar) {
            this.f8087d = bitmap;
            this.f8085b.sendMessageAtTime(this.f8085b.obtainMessage(1, this), this.f8086c);
        }

        C2474a(Handler handler, int i, long j) {
            this.f8085b = handler;
            this.f8084a = i;
            this.f8086c = j;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap mo11022a() {
        return this.f8077m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo11026b() {
        return this.f8082r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo11028c() {
        return this.f8083s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo11032g() {
        return this.f8066b.mo10450d();
    }

    /* renamed from: j */
    private void m10436j() {
        if (!this.f8070f) {
            this.f8070f = true;
            this.f8075k = false;
            m10438l();
        }
    }

    /* renamed from: m */
    private void m10439m() {
        Bitmap bitmap = this.f8077m;
        if (bitmap != null) {
            this.f8069e.mo10693a(bitmap);
            this.f8077m = null;
        }
    }

    /* renamed from: n */
    private static AbstractC2265c m10440n() {
        return new C2120d(Double.valueOf(Math.random()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo11029d() {
        return this.f8066b.mo10453g() + this.f8081q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo11030e() {
        C2474a aVar = this.f8074j;
        if (aVar != null) {
            return aVar.f8084a;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ByteBuffer mo11031f() {
        return this.f8066b.mo10446a().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Bitmap mo11034i() {
        C2474a aVar = this.f8074j;
        if (aVar != null) {
            return aVar.f_();
        }
        return this.f8077m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo11033h() {
        this.f8068d.clear();
        m10439m();
        m10437k();
        C2474a aVar = this.f8074j;
        if (aVar != null) {
            this.f8065a.mo10417a((AbstractC2522j<?>) aVar);
            this.f8074j = null;
        }
        C2474a aVar2 = this.f8076l;
        if (aVar2 != null) {
            this.f8065a.mo10417a((AbstractC2522j<?>) aVar2);
            this.f8076l = null;
        }
        C2474a aVar3 = this.f8079o;
        if (aVar3 != null) {
            this.f8065a.mo10417a((AbstractC2522j<?>) aVar3);
            this.f8079o = null;
        }
        this.f8066b.mo10455i();
        this.f8075k = true;
    }

    /* renamed from: l */
    private void m10438l() {
        boolean z;
        if (this.f8070f && !this.f8071g) {
            if (this.f8072h) {
                if (this.f8079o == null) {
                    z = true;
                } else {
                    z = false;
                }
                C2567j.m10898a(z, "Pending target must be null when starting from the first frame");
                this.f8066b.mo10452f();
                this.f8072h = false;
            }
            C2474a aVar = this.f8079o;
            if (aVar != null) {
                this.f8079o = null;
                mo11024a(aVar);
                return;
            }
            this.f8071g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f8066b.mo10449c());
            this.f8066b.mo10448b();
            this.f8076l = new C2474a(this.f8067c, this.f8066b.mo10451e(), uptimeMillis);
            this.f8073i.mo10391a((AbstractC2510a<?>) C2537g.m10787b(m10440n())).mo10395a(this.f8066b).mo10397a((AbstractC2522j) this.f8076l);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.d.g$c */
    private class C2476c implements Handler.Callback {
        C2476c() {
        }

        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                C2473g.this.mo11024a((C2474a) message.obj);
                return true;
            } else if (message.what != 2) {
                return false;
            } else {
                C2473g.this.f8065a.mo10417a((AbstractC2522j<?>) ((C2474a) message.obj));
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11027b(AbstractC2475b bVar) {
        this.f8068d.remove(bVar);
        if (this.f8068d.isEmpty()) {
            m10437k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11024a(C2474a aVar) {
        AbstractC2477d dVar = this.f8080p;
        if (dVar != null) {
            dVar.mo11039a();
        }
        this.f8071g = false;
        if (this.f8075k) {
            this.f8067c.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f8070f) {
            this.f8079o = aVar;
        } else {
            if (aVar.f_() != null) {
                m10439m();
                C2474a aVar2 = this.f8074j;
                this.f8074j = aVar;
                for (int size = this.f8068d.size() - 1; size >= 0; size--) {
                    this.f8068d.get(size).mo11005f();
                }
                if (aVar2 != null) {
                    this.f8067c.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m10438l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11025a(AbstractC2475b bVar) {
        if (this.f8075k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f8068d.contains(bVar)) {
            boolean isEmpty = this.f8068d.isEmpty();
            this.f8068d.add(bVar);
            if (isEmpty) {
                m10436j();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11023a(AbstractC2393i<Bitmap> iVar, Bitmap bitmap) {
        this.f8078n = (AbstractC2393i) C2567j.m10894a(iVar);
        this.f8077m = (Bitmap) C2567j.m10894a(bitmap);
        this.f8073i = this.f8073i.mo10391a(new C2537g().mo11130a(iVar));
        this.f8081q = C2568k.m10903a(bitmap);
        this.f8082r = bitmap.getWidth();
        this.f8083s = bitmap.getHeight();
    }

    /* renamed from: a */
    private static C2124f<Bitmap> m10435a(ComponentCallbacks2C2126g gVar, int i, int i2) {
        return gVar.mo10430i().mo10391a(((C2537g) ((C2537g) C2537g.m10788b(AbstractC2354j.f7812b).mo11136a(true)).mo11145c(true)).mo11144c(i, i2));
    }

    C2473g(ComponentCallbacks2C2115c cVar, GifDecoder gifDecoder, int i, int i2, AbstractC2393i<Bitmap> iVar, Bitmap bitmap) {
        this(cVar.mo10350a(), ComponentCallbacks2C2115c.m9151c(cVar.mo10356c()), gifDecoder, null, m10435a(ComponentCallbacks2C2115c.m9151c(cVar.mo10356c()), i, i2), iVar, bitmap);
    }

    C2473g(AbstractC2283e eVar, ComponentCallbacks2C2126g gVar, GifDecoder gifDecoder, Handler handler, C2124f<Bitmap> fVar, AbstractC2393i<Bitmap> iVar, Bitmap bitmap) {
        this.f8068d = new ArrayList();
        this.f8065a = gVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C2476c()) : handler;
        this.f8069e = eVar;
        this.f8067c = handler;
        this.f8073i = fVar;
        this.f8066b = gifDecoder;
        mo11023a(iVar, bitmap);
    }
}
