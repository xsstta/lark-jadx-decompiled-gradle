package com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable;

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
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.utils.AbstractC44045a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.b */
public class C44027b {

    /* renamed from: a */
    private final C44042i<RecyclerView.ViewHolder> f111703a;

    /* renamed from: b */
    private final Interpolator f111704b = new AccelerateDecelerateInterpolator();

    /* renamed from: c */
    private final Interpolator f111705c = new DecelerateInterpolator();

    /* renamed from: d */
    private final Interpolator f111706d = new AccelerateInterpolator(0.8f);

    /* renamed from: e */
    private final List<RecyclerView.ViewHolder> f111707e;

    /* renamed from: f */
    private final List<WeakReference<AbstractRunnableC44031d>> f111708f;

    /* renamed from: g */
    private final int[] f111709g = new int[2];

    /* renamed from: h */
    private final Rect f111710h = new Rect();

    /* renamed from: i */
    private int f111711i;

    /* renamed from: a */
    public boolean mo156650a(RecyclerView.ViewHolder viewHolder, boolean z, boolean z2, long j, int i, AbstractC44022a aVar) {
        m174338e(viewHolder);
        return m174333a(viewHolder, viewHolder instanceof AbstractC44045a ? ((AbstractC44045a) viewHolder).mo156706l() : BitmapDescriptorFactory.HUE_RED, true, z, z2, this.f111704b, j, new C44030c(i, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.b$d */
    public static abstract class AbstractRunnableC44031d implements Runnable {

        /* renamed from: c */
        final WeakReference<RecyclerView.ViewHolder> f111727c;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo156656a(RecyclerView.ViewHolder viewHolder);

        public void run() {
            RecyclerView.ViewHolder viewHolder = this.f111727c.get();
            if (viewHolder != null) {
                mo156656a(viewHolder);
            }
        }

        public AbstractRunnableC44031d(RecyclerView.ViewHolder viewHolder) {
            this.f111727c = new WeakReference<>(viewHolder);
        }

        /* renamed from: b */
        public boolean mo156658b(RecyclerView.ViewHolder viewHolder) {
            if (this.f111727c.get() == null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public boolean mo156659c(RecyclerView.ViewHolder viewHolder) {
            if (this.f111727c.get() == viewHolder) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.b$b */
    public static class C44029b implements AbstractC0882aa, AbstractC0928y {

        /* renamed from: a */
        private final int f111714a;

        /* renamed from: b */
        private final int f111715b;

        /* renamed from: c */
        private final long f111716c;

        /* renamed from: d */
        private final boolean f111717d;

        /* renamed from: e */
        private final C44030c f111718e;

        /* renamed from: f */
        private final Interpolator f111719f;

        /* renamed from: g */
        private C44042i<RecyclerView.ViewHolder> f111720g;

        /* renamed from: h */
        private List<RecyclerView.ViewHolder> f111721h;

        /* renamed from: i */
        private RecyclerView.ViewHolder f111722i;

        /* renamed from: j */
        private C0924x f111723j;

        /* renamed from: k */
        private float f111724k;

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
        public void mo156657a() {
            int i;
            View a = C44043j.m174470a(this.f111722i);
            if (this.f111717d) {
                i = a.getWidth();
            } else {
                i = a.getHeight();
            }
            this.f111724k = 1.0f / Math.max(1.0f, (float) i);
            C0924x r = ViewCompat.m4103r(a);
            this.f111723j = r;
            r.mo4724a(this.f111716c);
            this.f111723j.mo4728b((float) this.f111714a);
            this.f111723j.mo4731c((float) this.f111715b);
            Interpolator interpolator = this.f111719f;
            if (interpolator != null) {
                this.f111723j.mo4725a(interpolator);
            }
            this.f111723j.mo4727a((AbstractC0928y) this);
            this.f111723j.mo4726a((AbstractC0882aa) this);
            this.f111721h.add(this.f111722i);
            this.f111723j.mo4732c();
        }

        @Override // androidx.core.view.AbstractC0882aa
        public void a_(View view) {
            float f;
            if (this.f111717d) {
                f = view.getTranslationX();
            } else {
                f = view.getTranslationY();
            }
            C44042i<RecyclerView.ViewHolder> iVar = this.f111720g;
            RecyclerView.ViewHolder viewHolder = this.f111722i;
            iVar.mo156712a(viewHolder, viewHolder.getLayoutPosition(), f * this.f111724k, true, this.f111717d, false);
        }

        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: b */
        public void mo869b(View view) {
            this.f111723j.mo4727a((AbstractC0928y) null);
            if (Build.VERSION.SDK_INT >= 19) {
                C44021a.m174324a(view);
            } else {
                this.f111723j.mo4726a((AbstractC0882aa) null);
            }
            view.setTranslationX((float) this.f111714a);
            view.setTranslationY((float) this.f111715b);
            this.f111721h.remove(this.f111722i);
            ViewParent parent = this.f111722i.itemView.getParent();
            if (parent != null) {
                ViewCompat.m4073e((View) parent);
            }
            C44030c cVar = this.f111718e;
            if (cVar != null) {
                cVar.f111726b.mo156643f();
            }
            this.f111721h = null;
            this.f111723j = null;
            this.f111722i = null;
            this.f111720g = null;
        }

        C44029b(C44042i<RecyclerView.ViewHolder> iVar, List<RecyclerView.ViewHolder> list, RecyclerView.ViewHolder viewHolder, int i, int i2, long j, boolean z, Interpolator interpolator, C44030c cVar) {
            this.f111720g = iVar;
            this.f111721h = list;
            this.f111722i = viewHolder;
            this.f111714a = i;
            this.f111715b = i2;
            this.f111717d = z;
            this.f111718e = cVar;
            this.f111716c = j;
            this.f111719f = interpolator;
        }
    }

    /* renamed from: b */
    public boolean mo156651b(RecyclerView.ViewHolder viewHolder) {
        return this.f111707e.contains(viewHolder);
    }

    /* renamed from: c */
    public int mo156653c(RecyclerView.ViewHolder viewHolder) {
        return (int) (C44043j.m174470a(viewHolder).getTranslationX() + 0.5f);
    }

    /* renamed from: d */
    public int mo156655d(RecyclerView.ViewHolder viewHolder) {
        return (int) (C44043j.m174470a(viewHolder).getTranslationY() + 0.5f);
    }

    /* renamed from: a */
    public void mo156644a(int i) {
        this.f111711i = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.b$a */
    public static final class C44028a extends AbstractRunnableC44031d {

        /* renamed from: a */
        final float f111712a;

        /* renamed from: b */
        final boolean f111713b;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.C44027b.AbstractRunnableC44031d
        /* renamed from: a */
        public void mo156656a(RecyclerView.ViewHolder viewHolder) {
            View a = C44043j.m174470a(viewHolder);
            if (this.f111713b) {
                C44027b.m174332a(viewHolder, this.f111713b, (int) ((((float) a.getWidth()) * this.f111712a) + 0.5f), 0);
                return;
            }
            C44027b.m174332a(viewHolder, this.f111713b, 0, (int) ((((float) a.getHeight()) * this.f111712a) + 0.5f));
        }

        public C44028a(RecyclerView.ViewHolder viewHolder, float f, boolean z) {
            super(viewHolder);
            this.f111712a = f;
            this.f111713b = z;
        }
    }

    public C44027b(C44042i<RecyclerView.ViewHolder> iVar) {
        this.f111703a = iVar;
        this.f111707e = new ArrayList();
        this.f111708f = new ArrayList();
    }

    /* renamed from: e */
    private void m174338e(RecyclerView.ViewHolder viewHolder) {
        for (int size = this.f111708f.size() - 1; size >= 0; size--) {
            AbstractRunnableC44031d dVar = this.f111708f.get(size).get();
            if (dVar != null && dVar.mo156659c(viewHolder)) {
                viewHolder.itemView.removeCallbacks(dVar);
                this.f111708f.remove(size);
            } else if (dVar == null || dVar.mo156658b(viewHolder)) {
                this.f111708f.remove(size);
            }
        }
    }

    /* renamed from: a */
    public void mo156645a(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC44041h) {
            m174338e(viewHolder);
            ViewCompat.m4103r(C44043j.m174470a(viewHolder)).mo4730b();
            if (this.f111707e.remove(viewHolder)) {
                throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [slide]");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.b$c */
    public static class C44030c {

        /* renamed from: a */
        final int f111725a;

        /* renamed from: b */
        AbstractC44022a f111726b;

        public C44030c(int i, AbstractC44022a aVar) {
            this.f111725a = i;
            this.f111726b = aVar;
        }
    }

    /* renamed from: a */
    private void m174331a(RecyclerView.ViewHolder viewHolder, AbstractRunnableC44031d dVar) {
        this.f111708f.add(new WeakReference<>(dVar));
        viewHolder.itemView.post(dVar);
    }

    /* renamed from: a */
    static void m174332a(RecyclerView.ViewHolder viewHolder, boolean z, int i, int i2) {
        m174336b(viewHolder, z, i, i2);
    }

    /* renamed from: b */
    private static void m174336b(RecyclerView.ViewHolder viewHolder, boolean z, int i, int i2) {
        if (viewHolder instanceof AbstractC44041h) {
            View a = C44043j.m174470a(viewHolder);
            ViewCompat.m4103r(a).mo4730b();
            a.setTranslationX((float) i);
            a.setTranslationY((float) i2);
        }
    }

    /* renamed from: a */
    public void mo156647a(RecyclerView.ViewHolder viewHolder, int i, boolean z, long j) {
        m174338e(viewHolder);
        m174334a(viewHolder, i, z, j, null);
    }

    /* renamed from: a */
    public void mo156648a(RecyclerView.ViewHolder viewHolder, boolean z, boolean z2, long j) {
        m174338e(viewHolder);
        m174333a(viewHolder, BitmapDescriptorFactory.HUE_RED, false, z, z2, this.f111704b, j, null);
    }

    /* renamed from: a */
    private boolean m174334a(RecyclerView.ViewHolder viewHolder, int i, boolean z, long j, C44030c cVar) {
        boolean z2;
        long j2;
        boolean z3;
        if (!(viewHolder instanceof AbstractC44041h)) {
            return false;
        }
        View a = C44043j.m174470a(viewHolder);
        ViewGroup viewGroup = (ViewGroup) a.getParent();
        if (viewGroup == null) {
            return false;
        }
        int left = a.getLeft();
        int right = a.getRight();
        int top = a.getTop();
        int i2 = right - left;
        int bottom = a.getBottom() - top;
        viewGroup.getWindowVisibleDisplayFrame(this.f111710h);
        int width = this.f111710h.width();
        int height = this.f111710h.height();
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
            viewGroup.getLocationInWindow(this.f111709g);
            int[] iArr = this.f111709g;
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
        return m174335a(viewHolder, z3, width, height, j2, this.f111706d, cVar);
    }

    /* renamed from: c */
    public boolean mo156654c(RecyclerView.ViewHolder viewHolder, boolean z, boolean z2, long j, int i, AbstractC44022a aVar) {
        m174338e(viewHolder);
        return m174333a(viewHolder, BitmapDescriptorFactory.HUE_RED, false, z, z2, this.f111704b, j, new C44030c(i, aVar));
    }

    /* renamed from: a */
    public void mo156646a(RecyclerView.ViewHolder viewHolder, float f, boolean z, boolean z2, boolean z3, long j) {
        m174338e(viewHolder);
        m174333a(viewHolder, f, z, z2, z3, this.f111705c, j, null);
    }

    /* renamed from: b */
    public boolean mo156652b(RecyclerView.ViewHolder viewHolder, boolean z, boolean z2, long j, int i, AbstractC44022a aVar) {
        float f;
        m174338e(viewHolder);
        if (viewHolder instanceof AbstractC44045a) {
            f = ((AbstractC44045a) viewHolder).mo156708n();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        return m174333a(viewHolder, f, true, z, z2, this.f111704b, j, new C44030c(i, aVar));
    }

    /* renamed from: a */
    public boolean mo156649a(RecyclerView.ViewHolder viewHolder, int i, boolean z, long j, int i2, AbstractC44022a aVar) {
        m174338e(viewHolder);
        return m174334a(viewHolder, i, z, j, new C44030c(i2, aVar));
    }

    /* renamed from: a */
    private boolean m174335a(RecyclerView.ViewHolder viewHolder, boolean z, int i, int i2, long j, Interpolator interpolator, C44030c cVar) {
        return m174337b(viewHolder, z, i, i2, j, interpolator, cVar);
    }

    /* renamed from: b */
    private boolean m174337b(RecyclerView.ViewHolder viewHolder, boolean z, int i, int i2, long j, Interpolator interpolator, C44030c cVar) {
        if (!(viewHolder instanceof AbstractC44041h)) {
            return false;
        }
        mo156645a(viewHolder);
        new C44029b(this.f111703a, this.f111707e, viewHolder, i, i2, j, z, interpolator, cVar).mo156657a();
        return true;
    }

    /* renamed from: a */
    private boolean m174333a(RecyclerView.ViewHolder viewHolder, float f, boolean z, boolean z2, boolean z3, Interpolator interpolator, long j, C44030c cVar) {
        boolean z4;
        long j2;
        float f2 = f;
        View a = C44043j.m174470a(viewHolder);
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
            return m174335a(viewHolder, z2, 0, 0, j2, interpolator, cVar);
        }
        int width = a.getWidth();
        int height = a.getHeight();
        if (z2 && (!z || width != 0)) {
            if (z) {
                f2 *= (float) width;
            }
            return m174335a(viewHolder, z2, (int) (f2 + 0.5f), 0, j2, interpolator, cVar);
        } else if (!z2 && (!z || height != 0)) {
            if (z) {
                f2 *= (float) height;
            }
            return m174335a(viewHolder, z2, 0, (int) (f2 + 0.5f), j2, interpolator, cVar);
        } else if (cVar == null) {
            m174331a(viewHolder, new C44028a(viewHolder, f, z2));
            return false;
        } else {
            throw new IllegalStateException("Unexpected state in slideToSpecifiedPositionInternal (swipeFinish == null)");
        }
    }
}
