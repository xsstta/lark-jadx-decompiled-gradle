package com.bumptech.glide.load.engine.p087a;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.engine.a.k */
public class C2292k implements AbstractC2283e {

    /* renamed from: a */
    private static final Bitmap.Config f7643a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    private final AbstractC2295l f7644b;

    /* renamed from: c */
    private final Set<Bitmap.Config> f7645c;

    /* renamed from: d */
    private final long f7646d;

    /* renamed from: e */
    private final AbstractC2293a f7647e;

    /* renamed from: f */
    private long f7648f;

    /* renamed from: g */
    private long f7649g;

    /* renamed from: h */
    private int f7650h;

    /* renamed from: i */
    private int f7651i;

    /* renamed from: j */
    private int f7652j;

    /* renamed from: k */
    private int f7653k;

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.a.k$a */
    public interface AbstractC2293a {
        /* renamed from: a */
        void mo10713a(Bitmap bitmap);

        /* renamed from: b */
        void mo10714b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.engine.a.k$b */
    private static final class C2294b implements AbstractC2293a {
        @Override // com.bumptech.glide.load.engine.p087a.C2292k.AbstractC2293a
        /* renamed from: a */
        public void mo10713a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.p087a.C2292k.AbstractC2293a
        /* renamed from: b */
        public void mo10714b(Bitmap bitmap) {
        }

        C2294b() {
        }
    }

    /* renamed from: b */
    public long mo10712b() {
        return this.f7648f;
    }

    /* renamed from: c */
    private void m9810c() {
        m9806a(this.f7648f);
    }

    /* renamed from: d */
    private void m9813d() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m9814e();
        }
    }

    /* renamed from: f */
    private static AbstractC2295l m9815f() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C2297n();
        }
        return new C2279c();
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2283e
    /* renamed from: a */
    public void mo10691a() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m9806a(0L);
    }

    /* renamed from: g */
    private static Set<Bitmap.Config> m9816g() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: e */
    private void m9814e() {
        Log.v("LruBitmapPool", "Hits=" + this.f7650h + ", misses=" + this.f7651i + ", puts=" + this.f7652j + ", evictions=" + this.f7653k + ", currentSize=" + this.f7649g + ", maxSize=" + this.f7648f + "\nStrategy=" + this.f7644b);
    }

    /* renamed from: b */
    private static void m9808b(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m9811c(bitmap);
    }

    public C2292k(long j) {
        this(j, m9815f(), m9816g());
    }

    /* renamed from: c */
    private static void m9811c(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: a */
    private static void m9807a(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: a */
    private synchronized void m9806a(long j) {
        while (this.f7649g > j) {
            Bitmap a = this.f7644b.mo10673a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m9814e();
                }
                this.f7649g = 0;
                return;
            }
            this.f7647e.mo10714b(a);
            this.f7649g -= (long) this.f7644b.mo10678c(a);
            this.f7653k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f7644b.mo10677b(a));
            }
            m9813d();
            a.recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2283e
    /* renamed from: a */
    public void mo10692a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            mo10691a();
        } else if (i >= 20 || i == 15) {
            m9806a(mo10712b() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2283e
    /* renamed from: a */
    public synchronized void mo10693a(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (!bitmap.isRecycled()) {
            if (bitmap.isMutable() && ((long) this.f7644b.mo10678c(bitmap)) <= this.f7648f) {
                if (this.f7645c.contains(bitmap.getConfig())) {
                    int c = this.f7644b.mo10678c(bitmap);
                    this.f7644b.mo10675a(bitmap);
                    this.f7647e.mo10713a(bitmap);
                    this.f7652j++;
                    this.f7649g += (long) c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f7644b.mo10677b(bitmap));
                    }
                    m9813d();
                    m9810c();
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f7644b.mo10677b(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f7645c.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } else {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        }
    }

    /* renamed from: c */
    private static Bitmap m9809c(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f7643a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2283e
    /* renamed from: a */
    public Bitmap mo10690a(int i, int i2, Bitmap.Config config) {
        Bitmap d = m9812d(i, i2, config);
        if (d == null) {
            return m9809c(i, i2, config);
        }
        d.eraseColor(0);
        return d;
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2283e
    /* renamed from: b */
    public Bitmap mo10694b(int i, int i2, Bitmap.Config config) {
        Bitmap d = m9812d(i, i2, config);
        if (d == null) {
            return m9809c(i, i2, config);
        }
        return d;
    }

    C2292k(long j, AbstractC2295l lVar, Set<Bitmap.Config> set) {
        this.f7646d = j;
        this.f7648f = j;
        this.f7644b = lVar;
        this.f7645c = set;
        this.f7647e = new C2294b();
    }

    /* renamed from: d */
    private synchronized Bitmap m9812d(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap a;
        m9807a(config);
        AbstractC2295l lVar = this.f7644b;
        if (config != null) {
            config2 = config;
        } else {
            config2 = f7643a;
        }
        a = lVar.mo10674a(i, i2, config2);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f7644b.mo10676b(i, i2, config));
            }
            this.f7651i++;
        } else {
            this.f7650h++;
            this.f7649g -= (long) this.f7644b.mo10678c(a);
            this.f7647e.mo10714b(a);
            m9808b(a);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f7644b.mo10676b(i, i2, config));
        }
        m9813d();
        return a;
    }
}
