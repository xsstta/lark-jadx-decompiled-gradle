package com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.ee.log.C13479a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.a.f */
public class C7305f implements AbstractC7301c {

    /* renamed from: a */
    private static final Bitmap.Config f19570a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    private final AbstractC7309g f19571b;

    /* renamed from: c */
    private final Set<Bitmap.Config> f19572c;

    /* renamed from: d */
    private final int f19573d;

    /* renamed from: e */
    private final AbstractC7307a f19574e;

    /* renamed from: f */
    private int f19575f;

    /* renamed from: g */
    private int f19576g;

    /* renamed from: h */
    private int f19577h;

    /* renamed from: i */
    private int f19578i;

    /* renamed from: j */
    private int f19579j;

    /* renamed from: k */
    private int f19580k;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.a.f$a */
    public interface AbstractC7307a {
        /* renamed from: a */
        void mo28515a(Bitmap bitmap);

        /* renamed from: b */
        void mo28516b(Bitmap bitmap);
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.a.f$b */
    private static class C7308b implements AbstractC7307a {
        @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.C7305f.AbstractC7307a
        /* renamed from: a */
        public void mo28515a(Bitmap bitmap) {
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.C7305f.AbstractC7307a
        /* renamed from: b */
        public void mo28516b(Bitmap bitmap) {
        }

        private C7308b() {
        }
    }

    /* renamed from: b */
    private void m29184b() {
        m29185c();
    }

    /* renamed from: a */
    private void m29182a() {
        m29183a(this.f19575f);
    }

    /* renamed from: d */
    private static AbstractC7309g m29186d() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C7311i();
        }
        return new C7297a();
    }

    /* renamed from: e */
    private static Set<Bitmap.Config> m29187e() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: c */
    private void m29185c() {
        C13479a.m54764b("LruBitmapPool", "Hits=" + this.f19577h + ", misses=" + this.f19578i + ", puts=" + this.f19579j + ", evictions=" + this.f19580k + ", currentSize=" + this.f19576g + ", maxSize=" + this.f19575f + "\nStrategy=" + this.f19571b);
    }

    public C7305f(int i) {
        this(i, m29186d(), m29187e());
    }

    /* renamed from: a */
    private synchronized void m29183a(int i) {
        while (this.f19576g > i) {
            Bitmap a = this.f19571b.mo28488a();
            if (a == null) {
                C13479a.m54775e("LruBitmapPool", "Size mismatch, resetting");
                m29185c();
                this.f19576g = 0;
                return;
            }
            this.f19574e.mo28516b(a);
            this.f19576g -= this.f19571b.mo28493c(a);
            a.recycle();
            this.f19580k++;
            C13479a.m54772d("LruBitmapPool", "Evicting bitmap=" + this.f19571b.mo28492b(a));
            m29184b();
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7301c
    /* renamed from: a */
    public synchronized boolean mo28506a(Bitmap bitmap) {
        if (bitmap != null) {
            if (bitmap.isMutable() && this.f19571b.mo28493c(bitmap) <= this.f19575f) {
                if (this.f19572c.contains(bitmap.getConfig())) {
                    int c = this.f19571b.mo28493c(bitmap);
                    this.f19571b.mo28490a(bitmap);
                    this.f19574e.mo28515a(bitmap);
                    this.f19579j++;
                    this.f19576g += c;
                    C13479a.m54764b("LruBitmapPool", "Put bitmap in pool=" + this.f19571b.mo28492b(bitmap));
                    m29184b();
                    m29182a();
                    return true;
                }
            }
            C13479a.m54764b("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f19571b.mo28492b(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f19572c.contains(bitmap.getConfig()));
            return false;
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7301c
    /* renamed from: a */
    public synchronized Bitmap mo28505a(int i, int i2, Bitmap.Config config) {
        Bitmap b;
        b = mo28507b(i, i2, config);
        if (b != null) {
            b.eraseColor(0);
        }
        return b;
    }

    C7305f(int i, AbstractC7309g gVar, Set<Bitmap.Config> set) {
        this.f19573d = i;
        this.f19575f = i;
        this.f19571b = gVar;
        this.f19572c = set;
        this.f19574e = new C7308b();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7301c
    /* renamed from: b */
    public synchronized Bitmap mo28507b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap a;
        AbstractC7309g gVar = this.f19571b;
        if (config != null) {
            config2 = config;
        } else {
            config2 = f19570a;
        }
        a = gVar.mo28489a(i, i2, config2);
        if (a == null) {
            C13479a.m54772d("LruBitmapPool", "Missing bitmap=" + this.f19571b.mo28491b(i, i2, config));
            this.f19578i = this.f19578i + 1;
        } else {
            this.f19577h++;
            this.f19576g -= this.f19571b.mo28493c(a);
            this.f19574e.mo28516b(a);
            if (Build.VERSION.SDK_INT >= 12) {
                a.setHasAlpha(true);
            }
        }
        C13479a.m54764b("LruBitmapPool", "Get bitmap=" + this.f19571b.mo28491b(i, i2, config));
        m29184b();
        return a;
    }
}
