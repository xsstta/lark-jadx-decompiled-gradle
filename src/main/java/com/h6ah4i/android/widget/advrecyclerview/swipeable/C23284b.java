package com.h6ah4i.android.widget.advrecyclerview.swipeable;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC0882aa;
import androidx.core.view.AbstractC0928y;
import androidx.core.view.C0924x;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a;
import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractC23303b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.b */
public class C23284b {

    /* renamed from: a */
    private final C23299i<RecyclerView.ViewHolder> f57381a;

    /* renamed from: b */
    private final Interpolator f57382b = new AccelerateDecelerateInterpolator();

    /* renamed from: c */
    private final Interpolator f57383c = new DecelerateInterpolator();

    /* renamed from: d */
    private final Interpolator f57384d = new AccelerateInterpolator(0.8f);

    /* renamed from: e */
    private final List<RecyclerView.ViewHolder> f57385e;

    /* renamed from: f */
    private final List<WeakReference<AbstractRunnableC23288d>> f57386f;

    /* renamed from: g */
    private final int[] f57387g = new int[2];

    /* renamed from: h */
    private final Rect f57388h = new Rect();

    /* renamed from: i */
    private int f57389i;

    /* renamed from: a */
    public boolean mo80789a(RecyclerView.ViewHolder viewHolder, boolean z, boolean z2, long j, int i, AbstractC23277a aVar) {
        m84487e(viewHolder);
        return m84482a(viewHolder, viewHolder instanceof AbstractC23303b ? ((AbstractC23303b) viewHolder).mo80847g() : BitmapDescriptorFactory.HUE_RED, true, z, z2, this.f57382b, j, new C23287c(i, aVar));
    }

    /* renamed from: a */
    public boolean mo80788a(RecyclerView.ViewHolder viewHolder, int i, boolean z, long j, int i2, AbstractC23277a aVar) {
        m84487e(viewHolder);
        return m84483a(viewHolder, i, z, j, new C23287c(i2, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.b$d */
    public static abstract class AbstractRunnableC23288d implements Runnable {

        /* renamed from: c */
        final WeakReference<RecyclerView.ViewHolder> f57405c;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo80795a(RecyclerView.ViewHolder viewHolder);

        public void run() {
            RecyclerView.ViewHolder viewHolder = this.f57405c.get();
            if (viewHolder != null) {
                mo80795a(viewHolder);
            }
        }

        public AbstractRunnableC23288d(RecyclerView.ViewHolder viewHolder) {
            this.f57405c = new WeakReference<>(viewHolder);
        }

        /* renamed from: b */
        public boolean mo80797b(RecyclerView.ViewHolder viewHolder) {
            if (this.f57405c.get() == null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public boolean mo80798c(RecyclerView.ViewHolder viewHolder) {
            if (this.f57405c.get() == viewHolder) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.b$b */
    public static class C23286b implements AbstractC0882aa, AbstractC0928y {

        /* renamed from: a */
        private final int f57392a;

        /* renamed from: b */
        private final int f57393b;

        /* renamed from: c */
        private final long f57394c;

        /* renamed from: d */
        private final boolean f57395d;

        /* renamed from: e */
        private final C23287c f57396e;

        /* renamed from: f */
        private final Interpolator f57397f;

        /* renamed from: g */
        private C23299i<RecyclerView.ViewHolder> f57398g;

        /* renamed from: h */
        private List<RecyclerView.ViewHolder> f57399h;

        /* renamed from: i */
        private RecyclerView.ViewHolder f57400i;

        /* renamed from: j */
        private C0924x f57401j;

        /* renamed from: k */
        private float f57402k;

        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: a */
        public void mo868a(View view) {
        }

        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: c */
        public void mo2464c(View view) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo80796a() {
            int i;
            View a = C23300j.m84619a(this.f57400i);
            if (this.f57395d) {
                i = a.getWidth();
            } else {
                i = a.getHeight();
            }
            this.f57402k = 1.0f / Math.max(1.0f, (float) i);
            C0924x r = ViewCompat.m4103r(a);
            this.f57401j = r;
            r.mo4724a(this.f57394c);
            this.f57401j.mo4728b((float) this.f57392a);
            this.f57401j.mo4731c((float) this.f57393b);
            Interpolator interpolator = this.f57397f;
            if (interpolator != null) {
                this.f57401j.mo4725a(interpolator);
            }
            this.f57401j.mo4727a((AbstractC0928y) this);
            this.f57401j.mo4726a((AbstractC0882aa) this);
            this.f57399h.add(this.f57400i);
            this.f57401j.mo4732c();
        }

        @Override // androidx.core.view.AbstractC0882aa
        public void a_(View view) {
            float f;
            if (this.f57395d) {
                f = view.getTranslationX();
            } else {
                f = view.getTranslationY();
            }
            C23299i<RecyclerView.ViewHolder> iVar = this.f57398g;
            RecyclerView.ViewHolder viewHolder = this.f57400i;
            iVar.mo80854a(viewHolder, viewHolder.getLayoutPosition(), f * this.f57402k, true, this.f57395d, false);
        }

        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: b */
        public void mo869b(View view) {
            this.f57401j.mo4727a((AbstractC0928y) null);
            if (Build.VERSION.SDK_INT >= 19) {
                C23276a.m84473a(view);
            } else {
                this.f57401j.mo4726a((AbstractC0882aa) null);
            }
            view.setTranslationX((float) this.f57392a);
            view.setTranslationY((float) this.f57393b);
            this.f57399h.remove(this.f57400i);
            ViewParent parent = this.f57400i.itemView.getParent();
            if (parent != null) {
                ViewCompat.m4073e((View) parent);
            }
            C23287c cVar = this.f57396e;
            if (cVar != null) {
                cVar.f57404b.mo80779c();
            }
            this.f57399h = null;
            this.f57401j = null;
            this.f57400i = null;
            this.f57398g = null;
        }

        C23286b(C23299i<RecyclerView.ViewHolder> iVar, List<RecyclerView.ViewHolder> list, RecyclerView.ViewHolder viewHolder, int i, int i2, long j, boolean z, Interpolator interpolator, C23287c cVar) {
            this.f57398g = iVar;
            this.f57399h = list;
            this.f57400i = viewHolder;
            this.f57392a = i;
            this.f57393b = i2;
            this.f57395d = z;
            this.f57396e = cVar;
            this.f57394c = j;
            this.f57397f = interpolator;
        }
    }

    /* renamed from: b */
    public boolean mo80790b(RecyclerView.ViewHolder viewHolder) {
        return this.f57385e.contains(viewHolder);
    }

    /* renamed from: c */
    public int mo80792c(RecyclerView.ViewHolder viewHolder) {
        return (int) (C23300j.m84619a(viewHolder).getTranslationX() + 0.5f);
    }

    /* renamed from: d */
    public int mo80794d(RecyclerView.ViewHolder viewHolder) {
        return (int) (C23300j.m84619a(viewHolder).getTranslationY() + 0.5f);
    }

    /* renamed from: a */
    public void mo80783a(int i) {
        this.f57389i = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.b$a */
    public static final class C23285a extends AbstractRunnableC23288d {

        /* renamed from: a */
        final float f57390a;

        /* renamed from: b */
        final boolean f57391b;

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.C23284b.AbstractRunnableC23288d
        /* renamed from: a */
        public void mo80795a(RecyclerView.ViewHolder viewHolder) {
            View a = C23300j.m84619a(viewHolder);
            if (this.f57391b) {
                C23284b.m84481a(viewHolder, this.f57391b, (int) ((((float) a.getWidth()) * this.f57390a) + 0.5f), 0);
                return;
            }
            C23284b.m84481a(viewHolder, this.f57391b, 0, (int) ((((float) a.getHeight()) * this.f57390a) + 0.5f));
        }

        public C23285a(RecyclerView.ViewHolder viewHolder, float f, boolean z) {
            super(viewHolder);
            this.f57390a = f;
            this.f57391b = z;
        }
    }

    public C23284b(C23299i<RecyclerView.ViewHolder> iVar) {
        this.f57381a = iVar;
        this.f57385e = new ArrayList();
        this.f57386f = new ArrayList();
    }

    /* renamed from: e */
    private void m84487e(RecyclerView.ViewHolder viewHolder) {
        for (int size = this.f57386f.size() - 1; size >= 0; size--) {
            AbstractRunnableC23288d dVar = this.f57386f.get(size).get();
            if (dVar != null && dVar.mo80798c(viewHolder)) {
                viewHolder.itemView.removeCallbacks(dVar);
                this.f57386f.remove(size);
            } else if (dVar == null || dVar.mo80797b(viewHolder)) {
                this.f57386f.remove(size);
            }
        }
    }

    /* renamed from: a */
    public void mo80784a(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC23298h) {
            m84487e(viewHolder);
            ViewCompat.m4103r(C23300j.m84619a(viewHolder)).mo4730b();
            if (this.f57385e.remove(viewHolder)) {
                throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [slide]");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.b$c */
    public static class C23287c {

        /* renamed from: a */
        final int f57403a;

        /* renamed from: b */
        AbstractC23277a f57404b;

        public C23287c(int i, AbstractC23277a aVar) {
            this.f57403a = i;
            this.f57404b = aVar;
        }
    }

    /* renamed from: a */
    private void m84480a(RecyclerView.ViewHolder viewHolder, AbstractRunnableC23288d dVar) {
        this.f57386f.add(new WeakReference<>(dVar));
        viewHolder.itemView.post(dVar);
    }

    /* renamed from: a */
    static void m84481a(RecyclerView.ViewHolder viewHolder, boolean z, int i, int i2) {
        m84485b(viewHolder, z, i, i2);
    }

    /* renamed from: b */
    private static void m84485b(RecyclerView.ViewHolder viewHolder, boolean z, int i, int i2) {
        if (viewHolder instanceof AbstractC23298h) {
            View a = C23300j.m84619a(viewHolder);
            ViewCompat.m4103r(a).mo4730b();
            a.setTranslationX((float) i);
            a.setTranslationY((float) i2);
        }
    }

    /* renamed from: a */
    public void mo80786a(RecyclerView.ViewHolder viewHolder, int i, boolean z, long j) {
        m84487e(viewHolder);
        m84483a(viewHolder, i, z, j, null);
    }

    /* renamed from: a */
    public void mo80787a(RecyclerView.ViewHolder viewHolder, boolean z, boolean z2, long j) {
        m84487e(viewHolder);
        m84482a(viewHolder, BitmapDescriptorFactory.HUE_RED, false, z, z2, this.f57382b, j, null);
    }

    /* renamed from: a */
    private boolean m84483a(RecyclerView.ViewHolder viewHolder, int i, boolean z, long j, C23287c cVar) {
        boolean z2;
        long j2;
        boolean z3;
        if (!(viewHolder instanceof AbstractC23298h)) {
            return false;
        }
        View a = C23300j.m84619a(viewHolder);
        ViewGroup viewGroup = (ViewGroup) a.getParent();
        if (viewGroup == null) {
            return false;
        }
        int left = a.getLeft();
        int right = a.getRight();
        int top = a.getTop();
        int i2 = right - left;
        int bottom = a.getBottom() - top;
        viewGroup.getWindowVisibleDisplayFrame(this.f57388h);
        int width = this.f57388h.width();
        int height = this.f57388h.height();
        if (i2 == 0 || bottom == 0) {
            if (i != 0) {
                if (i == 1) {
                    height = -height;
                } else if (i != 2) {
                    if (i != 3) {
                        width = 0;
                    }
                }
                width = 0;
                z2 = false;
            } else {
                width = -width;
            }
            height = 0;
            z2 = false;
        } else {
            viewGroup.getLocationInWindow(this.f57387g);
            int[] iArr = this.f57387g;
            int i3 = iArr[0];
            int i4 = iArr[1];
            if (i == 0) {
                width = -(i3 + i2);
                height = 0;
            } else if (i != 1) {
                if (i == 2) {
                    width -= i3 - left;
                    z2 = z;
                } else if (i != 3) {
                    z2 = z;
                    width = 0;
                } else {
                    height -= i4 - top;
                    z2 = z;
                    width = 0;
                }
                height = 0;
            } else {
                height = -(i4 + bottom);
                width = 0;
            }
            z2 = z;
        }
        if (z2) {
            if (!ViewCompat.m4015I(a) || a.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (z2) {
            j2 = j;
        } else {
            j2 = 0;
        }
        if (i == 0 || i == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        return m84484a(viewHolder, z3, width, height, j2, this.f57384d, cVar);
    }

    /* renamed from: c */
    public boolean mo80793c(RecyclerView.ViewHolder viewHolder, boolean z, boolean z2, long j, int i, AbstractC23277a aVar) {
        m84487e(viewHolder);
        return m84482a(viewHolder, BitmapDescriptorFactory.HUE_RED, false, z, z2, this.f57382b, j, new C23287c(i, aVar));
    }

    /* renamed from: a */
    public void mo80785a(RecyclerView.ViewHolder viewHolder, float f, boolean z, boolean z2, boolean z3, long j) {
        m84487e(viewHolder);
        m84482a(viewHolder, f, z, z2, z3, this.f57383c, j, null);
    }

    /* renamed from: b */
    public boolean mo80791b(RecyclerView.ViewHolder viewHolder, boolean z, boolean z2, long j, int i, AbstractC23277a aVar) {
        float f;
        m84487e(viewHolder);
        if (viewHolder instanceof AbstractC23303b) {
            f = ((AbstractC23303b) viewHolder).mo80849i();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        return m84482a(viewHolder, f, true, z, z2, this.f57382b, j, new C23287c(i, aVar));
    }

    /* renamed from: a */
    private boolean m84484a(RecyclerView.ViewHolder viewHolder, boolean z, int i, int i2, long j, Interpolator interpolator, C23287c cVar) {
        return m84486b(viewHolder, z, i, i2, j, interpolator, cVar);
    }

    /* renamed from: b */
    private boolean m84486b(RecyclerView.ViewHolder viewHolder, boolean z, int i, int i2, long j, Interpolator interpolator, C23287c cVar) {
        if (!(viewHolder instanceof AbstractC23298h)) {
            return false;
        }
        mo80784a(viewHolder);
        new C23286b(this.f57381a, this.f57385e, viewHolder, i, i2, j, z, interpolator, cVar).mo80796a();
        return true;
    }

    /* renamed from: a */
    private boolean m84482a(RecyclerView.ViewHolder viewHolder, float f, boolean z, boolean z2, boolean z3, Interpolator interpolator, long j, C23287c cVar) {
        boolean z4;
        long j2;
        float f2 = f;
        View a = C23300j.m84619a(viewHolder);
        if (!z3) {
            z4 = z3;
        } else if (!ViewCompat.m4015I(a) || a.getVisibility() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            j2 = j;
        } else {
            j2 = 0;
        }
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            return m84484a(viewHolder, z2, 0, 0, j2, interpolator, cVar);
        }
        int width = a.getWidth();
        int height = a.getHeight();
        if (z2 && (!z || width != 0)) {
            if (z) {
                f2 *= (float) width;
            }
            return m84484a(viewHolder, z2, (int) (f2 + 0.5f), 0, j2, interpolator, cVar);
        } else if (!z2 && (!z || height != 0)) {
            if (z) {
                f2 *= (float) height;
            }
            return m84484a(viewHolder, z2, 0, (int) (f2 + 0.5f), j2, interpolator, cVar);
        } else if (cVar == null) {
            m84480a(viewHolder, new C23285a(viewHolder, f, z2));
            return false;
        } else {
            throw new IllegalStateException("Unexpected state in slideToSpecifiedPositionInternal (swipeFinish == null)");
        }
    }
}
