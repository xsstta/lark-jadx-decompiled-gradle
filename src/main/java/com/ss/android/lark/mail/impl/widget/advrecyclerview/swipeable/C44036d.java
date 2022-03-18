package com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.utils.C44047c;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.d */
public class C44036d extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private final long f111762a;

    /* renamed from: b */
    private final Rect f111763b;

    /* renamed from: c */
    private final long f111764c;

    /* renamed from: d */
    private final long f111765d;

    /* renamed from: e */
    private final boolean f111766e;

    /* renamed from: f */
    private RecyclerView f111767f;

    /* renamed from: g */
    private RecyclerView.ViewHolder f111768g;

    /* renamed from: h */
    private int f111769h;

    /* renamed from: i */
    private int f111770i;

    /* renamed from: j */
    private long f111771j;

    /* renamed from: k */
    private Interpolator f111772k;

    /* renamed from: l */
    private Drawable f111773l;

    /* renamed from: m */
    private int f111774m = 0;

    /* renamed from: b */
    private void m174412b() {
        ViewCompat.m4073e(this.f111767f);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.d$a */
    public static class RunnableC44037a implements Runnable {

        /* renamed from: a */
        private final int f111775a;

        /* renamed from: b */
        private WeakReference<C44036d> f111776b;

        public void run() {
            C44036d dVar = this.f111776b.get();
            this.f111776b.clear();
            this.f111776b = null;
            if (dVar != null) {
                dVar.mo156691a(this.f111775a);
            }
        }

        public RunnableC44037a(C44036d dVar, int i) {
            this.f111776b = new WeakReference<>(dVar);
            this.f111775a = i;
        }
    }

    /* renamed from: c */
    private void m174415c() {
        this.f111767f.removeItemDecoration(this);
        m174412b();
        this.f111767f = null;
        this.f111768g = null;
        this.f111770i = 0;
        this.f111772k = null;
    }

    /* renamed from: a */
    public void mo156690a() {
        ViewCompat.m4103r(C44043j.m174470a(this.f111768g)).mo4730b();
        this.f111767f.addItemDecoration(this);
        this.f111771j = System.currentTimeMillis();
        this.f111770i = (int) (this.f111768g.itemView.getTranslationY() + 0.5f);
        this.f111773l = this.f111768g.itemView.getBackground();
        m174412b();
        m174410a(0, this.f111764c);
    }

    /* renamed from: a */
    public void mo156692a(Interpolator interpolator) {
        this.f111772k = interpolator;
    }

    /* renamed from: a */
    protected static long m174409a(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= j) {
            return currentTimeMillis - j;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: b */
    private boolean m174413b(long j) {
        long j2 = this.f111764c;
        if (j < j2 || j >= j2 + this.f111765d) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private float m174414c(long j) {
        long j2 = this.f111764c;
        if (j < j2) {
            return 1.0f;
        }
        long j3 = this.f111765d;
        if (j >= j2 + j3 || j3 == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = 1.0f - (((float) (j - j2)) / ((float) j3));
        Interpolator interpolator = this.f111772k;
        if (interpolator != null) {
            return interpolator.getInterpolation(f);
        }
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo156691a(int i) {
        long a = m174409a(this.f111771j);
        this.f111774m = (~(1 << i)) & this.f111774m;
        if (i == 0) {
            long j = this.f111764c;
            if (a < j) {
                m174410a(0, j - a);
                return;
            }
            m174412b();
            m174410a(1, this.f111765d);
        } else if (i == 1) {
            m174415c();
        }
    }

    /* renamed from: a */
    private void m174410a(int i, long j) {
        int i2 = 1 << i;
        int i3 = this.f111774m;
        if ((i3 & i2) == 0) {
            this.f111774m = i2 | i3;
            ViewCompat.m4047a(this.f111767f, new RunnableC44037a(this, i), j);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        long a = m174409a(this.f111771j);
        m174411a(canvas, this.f111773l, m174414c(a));
        if (this.f111762a == this.f111768g.getItemId()) {
            this.f111769h = (int) (this.f111768g.itemView.getTranslationX() + 0.5f);
            this.f111770i = (int) (this.f111768g.itemView.getTranslationY() + 0.5f);
        }
        if (m174413b(a)) {
            m174412b();
        }
    }

    /* renamed from: a */
    private void m174411a(Canvas canvas, Drawable drawable, float f) {
        float f2;
        Rect rect = this.f111763b;
        int i = this.f111769h;
        int i2 = this.f111770i;
        boolean z = this.f111766e;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if (!z) {
            f = 1.0f;
        }
        int width = (int) ((f2 * ((float) rect.width())) + 0.5f);
        int height = (int) ((f * ((float) rect.height())) + 0.5f);
        if (height != 0 && width != 0 && drawable != null) {
            int save = canvas.save();
            canvas.clipRect(rect.left + i, rect.top + i2, rect.left + i + width, rect.top + i2 + height);
            canvas.translate((float) ((rect.left + i) - ((rect.width() - width) / 2)), (float) ((rect.top + i2) - ((rect.height() - height) / 2)));
            drawable.setBounds(0, 0, rect.width(), rect.height());
            drawable.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public C44036d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, long j, long j2) {
        Rect rect = new Rect();
        this.f111763b = rect;
        boolean z = false;
        this.f111767f = recyclerView;
        this.f111768g = viewHolder;
        this.f111762a = viewHolder.getItemId();
        this.f111766e = (i == 2 || i == 4) ? true : z;
        this.f111764c = j + 50;
        this.f111765d = j2;
        this.f111769h = (int) (viewHolder.itemView.getTranslationX() + 0.5f);
        this.f111770i = (int) (viewHolder.itemView.getTranslationY() + 0.5f);
        C44047c.m174500b(this.f111768g.itemView, rect);
    }
}
