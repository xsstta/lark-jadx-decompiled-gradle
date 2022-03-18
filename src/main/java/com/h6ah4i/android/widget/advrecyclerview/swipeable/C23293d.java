package com.h6ah4i.android.widget.advrecyclerview.swipeable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.utils.C23305d;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.d */
class C23293d extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private final long f57440a;

    /* renamed from: b */
    private final Rect f57441b;

    /* renamed from: c */
    private final long f57442c;

    /* renamed from: d */
    private final long f57443d;

    /* renamed from: e */
    private final boolean f57444e;

    /* renamed from: f */
    private RecyclerView f57445f;

    /* renamed from: g */
    private RecyclerView.ViewHolder f57446g;

    /* renamed from: h */
    private int f57447h;

    /* renamed from: i */
    private int f57448i;

    /* renamed from: j */
    private long f57449j;

    /* renamed from: k */
    private Interpolator f57450k;

    /* renamed from: l */
    private Drawable f57451l;

    /* renamed from: m */
    private int f57452m = 0;

    /* renamed from: b */
    private void m84559b() {
        ViewCompat.m4073e(this.f57445f);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.d$a */
    public static class RunnableC23294a implements Runnable {

        /* renamed from: a */
        private final int f57453a;

        /* renamed from: b */
        private WeakReference<C23293d> f57454b;

        public void run() {
            C23293d dVar = this.f57454b.get();
            this.f57454b.clear();
            this.f57454b = null;
            if (dVar != null) {
                dVar.mo80830a(this.f57453a);
            }
        }

        public RunnableC23294a(C23293d dVar, int i) {
            this.f57454b = new WeakReference<>(dVar);
            this.f57453a = i;
        }
    }

    /* renamed from: c */
    private void m84562c() {
        this.f57445f.removeItemDecoration(this);
        m84559b();
        this.f57445f = null;
        this.f57446g = null;
        this.f57448i = 0;
        this.f57450k = null;
    }

    /* renamed from: a */
    public void mo80829a() {
        ViewCompat.m4103r(C23300j.m84619a(this.f57446g)).mo4730b();
        this.f57445f.addItemDecoration(this);
        this.f57449j = System.currentTimeMillis();
        this.f57448i = (int) (this.f57446g.itemView.getTranslationY() + 0.5f);
        this.f57451l = this.f57446g.itemView.getBackground();
        m84559b();
        m84557a(0, this.f57442c);
    }

    /* renamed from: a */
    public void mo80831a(Interpolator interpolator) {
        this.f57450k = interpolator;
    }

    /* renamed from: a */
    protected static long m84556a(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= j) {
            return currentTimeMillis - j;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: b */
    private boolean m84560b(long j) {
        long j2 = this.f57442c;
        if (j < j2 || j >= j2 + this.f57443d) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private float m84561c(long j) {
        long j2 = this.f57442c;
        if (j < j2) {
            return 1.0f;
        }
        long j3 = this.f57443d;
        if (j >= j2 + j3 || j3 == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = 1.0f - (((float) (j - j2)) / ((float) j3));
        Interpolator interpolator = this.f57450k;
        if (interpolator != null) {
            return interpolator.getInterpolation(f);
        }
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80830a(int i) {
        long a = m84556a(this.f57449j);
        this.f57452m = (~(1 << i)) & this.f57452m;
        if (i == 0) {
            long j = this.f57442c;
            if (a < j) {
                m84557a(0, j - a);
                return;
            }
            m84559b();
            m84557a(1, this.f57443d);
        } else if (i == 1) {
            m84562c();
        }
    }

    /* renamed from: a */
    private void m84557a(int i, long j) {
        int i2 = 1 << i;
        int i3 = this.f57452m;
        if ((i3 & i2) == 0) {
            this.f57452m = i2 | i3;
            ViewCompat.m4047a(this.f57445f, new RunnableC23294a(this, i), j);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        long a = m84556a(this.f57449j);
        m84558a(canvas, this.f57451l, m84561c(a));
        if (this.f57440a == this.f57446g.getItemId()) {
            this.f57447h = (int) (this.f57446g.itemView.getTranslationX() + 0.5f);
            this.f57448i = (int) (this.f57446g.itemView.getTranslationY() + 0.5f);
        }
        if (m84560b(a)) {
            m84559b();
        }
    }

    /* renamed from: a */
    private void m84558a(Canvas canvas, Drawable drawable, float f) {
        float f2;
        Rect rect = this.f57441b;
        int i = this.f57447h;
        int i2 = this.f57448i;
        boolean z = this.f57444e;
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

    public C23293d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, long j, long j2) {
        Rect rect = new Rect();
        this.f57441b = rect;
        boolean z = false;
        this.f57445f = recyclerView;
        this.f57446g = viewHolder;
        this.f57440a = viewHolder.getItemId();
        this.f57444e = (i == 2 || i == 4) ? true : z;
        this.f57442c = j + 50;
        this.f57443d = j2;
        this.f57447h = (int) (viewHolder.itemView.getTranslationX() + 0.5f);
        this.f57448i = (int) (viewHolder.itemView.getTranslationY() + 0.5f);
        C23305d.m84659b(this.f57446g.itemView, rect);
    }
}
