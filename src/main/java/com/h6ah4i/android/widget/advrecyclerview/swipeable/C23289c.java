package com.h6ah4i.android.widget.advrecyclerview.swipeable;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.p1004a.C23231d;
import com.h6ah4i.android.widget.advrecyclerview.utils.C23305d;
import com.h6ah4i.android.widget.advrecyclerview.utils.C23307f;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.ttm.player.MediaPlayer;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.c */
public class C23289c {

    /* renamed from: A */
    private VelocityTracker f57406A = VelocityTracker.obtain();

    /* renamed from: B */
    private C23301k f57407B;

    /* renamed from: C */
    private AbstractC23292b f57408C;

    /* renamed from: D */
    private HandlerC23291a f57409D;

    /* renamed from: E */
    private int f57410E = ViewConfiguration.getLongPressTimeout();

    /* renamed from: a */
    private final Rect f57411a = new Rect();

    /* renamed from: b */
    private RecyclerView.AbstractC1338g f57412b = new RecyclerView.AbstractC1338g() {
        /* class com.h6ah4i.android.widget.advrecyclerview.swipeable.C23289c.C232901 */

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: a */
        public void mo6561a(boolean z) {
            C23289c.this.mo80805a(z);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: b */
        public void mo6563b(RecyclerView recyclerView, MotionEvent motionEvent) {
            C23289c.this.mo80812b(recyclerView, motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: a */
        public boolean mo6562a(RecyclerView recyclerView, MotionEvent motionEvent) {
            return C23289c.this.mo80809a(recyclerView, motionEvent);
        }
    };

    /* renamed from: c */
    private RecyclerView f57413c;

    /* renamed from: d */
    private long f57414d = 300;

    /* renamed from: e */
    private long f57415e = 200;

    /* renamed from: f */
    private long f57416f = 200;

    /* renamed from: g */
    private long f57417g = 300;

    /* renamed from: h */
    private long f57418h = 300;

    /* renamed from: i */
    private int f57419i;

    /* renamed from: j */
    private int f57420j;

    /* renamed from: k */
    private int f57421k;

    /* renamed from: l */
    private int f57422l;

    /* renamed from: m */
    private int f57423m;

    /* renamed from: n */
    private int f57424n;

    /* renamed from: o */
    private long f57425o = -1;

    /* renamed from: p */
    private boolean f57426p;

    /* renamed from: q */
    private C23284b f57427q;

    /* renamed from: r */
    private C23299i<RecyclerView.ViewHolder> f57428r;

    /* renamed from: s */
    private RecyclerView.ViewHolder f57429s;

    /* renamed from: t */
    private int f57430t = -1;

    /* renamed from: u */
    private long f57431u = -1;

    /* renamed from: v */
    private int f57432v;

    /* renamed from: w */
    private int f57433w;

    /* renamed from: x */
    private int f57434x;

    /* renamed from: y */
    private int f57435y;

    /* renamed from: z */
    private int f57436z;

    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.c$b */
    public interface AbstractC23292b {
        /* renamed from: a */
        void mo80827a(int i);

        /* renamed from: a */
        void mo80828a(int i, int i2, int i3);
    }

    /* renamed from: a */
    private static int m84509a(float f, boolean z) {
        return z ? f < BitmapDescriptorFactory.HUE_RED ? 1 : 3 : f < BitmapDescriptorFactory.HUE_RED ? 2 : 4;
    }

    /* renamed from: a */
    private static boolean m84514a(float f) {
        return f == -65536.0f || f == 65536.0f || f == -65537.0f || f == 65537.0f;
    }

    /* renamed from: c */
    private static int m84518c(int i) {
        if (i == 3) {
            return 1;
        }
        if (i != 4) {
            return i != 5 ? 0 : 3;
        }
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo80818d() {
        return this.f57426p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo80819e() {
        return this.f57430t;
    }

    /* renamed from: a */
    public RecyclerView.Adapter mo80800a(RecyclerView.Adapter adapter) {
        if (!adapter.hasStableIds()) {
            throw new IllegalArgumentException("The passed adapter does not support stable IDs");
        } else if (this.f57428r == null) {
            C23299i<RecyclerView.ViewHolder> iVar = new C23299i<>(this, adapter);
            this.f57428r = iVar;
            return iVar;
        } else {
            throw new IllegalStateException("already have a wrapped adapter");
        }
    }

    /* renamed from: a */
    public boolean mo80806a() {
        return this.f57412b == null;
    }

    /* renamed from: a */
    public void mo80804a(RecyclerView recyclerView) {
        if (mo80806a()) {
            throw new IllegalStateException("Accessing released object");
        } else if (this.f57413c == null) {
            int a = C23305d.m84656a(recyclerView);
            if (a != -1) {
                this.f57413c = recyclerView;
                recyclerView.addOnItemTouchListener(this.f57412b);
                ViewConfiguration viewConfiguration = ViewConfiguration.get(recyclerView.getContext());
                this.f57419i = viewConfiguration.getScaledTouchSlop();
                this.f57420j = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f57421k = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f57422l = this.f57419i * 5;
                C23284b bVar = new C23284b(this.f57428r);
                this.f57427q = bVar;
                bVar.mo80783a((int) ((recyclerView.getResources().getDisplayMetrics().density * 8.0f) + 0.5f));
                boolean z = true;
                if (a != 1) {
                    z = false;
                }
                this.f57426p = z;
                this.f57409D = new HandlerC23291a(this);
                return;
            }
            throw new IllegalStateException("failed to determine layout orientation");
        } else {
            throw new IllegalStateException("RecyclerView instance has already been set");
        }
    }

    /* renamed from: a */
    public void mo80801a(int i) {
        this.f57422l = Math.max(i, this.f57419i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo80809a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                } else if (mo80814b()) {
                    m84517b(motionEvent);
                    return true;
                } else if (m84521d(recyclerView, motionEvent)) {
                    return true;
                } else {
                    return false;
                }
            }
            if (m84516a(motionEvent, true)) {
                return true;
            }
            return false;
        } else if (mo80814b()) {
            return false;
        } else {
            m84519c(recyclerView, motionEvent);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m84516a(MotionEvent motionEvent, boolean z) {
        int i;
        if (motionEvent != null) {
            i = motionEvent.getActionMasked();
            this.f57434x = (int) (motionEvent.getX() + 0.5f);
            this.f57435y = (int) (motionEvent.getY() + 0.5f);
        } else {
            i = 3;
        }
        if (!mo80814b()) {
            m84524g();
            return false;
        } else if (!z) {
            return true;
        } else {
            m84520d(i);
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo80808a(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(viewHolder instanceof AbstractC23298h) || mo80814b()) {
            return false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                    }
                }
                if (this.f57426p) {
                    return false;
                }
            }
            if (!this.f57426p) {
                return false;
            }
        }
        int e = m84522e(viewHolder);
        if (e == -1) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        m84512a(obtain, viewHolder, e);
        obtain.recycle();
        m84523e(i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo80807a(RecyclerView.ViewHolder viewHolder) {
        C23284b bVar = this.f57427q;
        return bVar != null && bVar.mo80790b(viewHolder);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80803a(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, int r13, float r14, float r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.h6ah4i.android.widget.advrecyclerview.swipeable.C23289c.mo80803a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, float, float, boolean, boolean, boolean, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80802a(MotionEvent motionEvent) {
        RecyclerView.ViewHolder findViewHolderForItemId = this.f57413c.findViewHolderForItemId(this.f57425o);
        if (findViewHolderForItemId != null) {
            m84515a(motionEvent, findViewHolderForItemId);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.c$a */
    public static class HandlerC23291a extends Handler {

        /* renamed from: a */
        private C23289c f57438a;

        /* renamed from: b */
        private MotionEvent f57439b;

        /* renamed from: b */
        public void mo80823b() {
            removeMessages(2);
        }

        /* renamed from: d */
        public boolean mo80825d() {
            return hasMessages(2);
        }

        /* renamed from: a */
        public void mo80821a() {
            removeMessages(1);
            MotionEvent motionEvent = this.f57439b;
            if (motionEvent != null) {
                motionEvent.recycle();
                this.f57439b = null;
            }
        }

        /* renamed from: c */
        public void mo80824c() {
            if (!mo80825d()) {
                sendEmptyMessage(2);
            }
        }

        public HandlerC23291a(C23289c cVar) {
            this.f57438a = cVar;
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                this.f57438a.mo80802a(this.f57439b);
            } else if (i == 2) {
                this.f57438a.mo80813b(true);
            }
        }

        /* renamed from: a */
        public void mo80822a(MotionEvent motionEvent, int i) {
            mo80821a();
            this.f57439b = MotionEvent.obtain(motionEvent);
            sendEmptyMessageAtTime(1, motionEvent.getDownTime() + ((long) i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo80820f() {
        return mo80810b(this.f57430t);
    }

    /* renamed from: g */
    private void m84524g() {
        HandlerC23291a aVar = this.f57409D;
        if (aVar != null) {
            aVar.mo80821a();
        }
        this.f57425o = -1;
        this.f57436z = 0;
    }

    /* renamed from: c */
    public void mo80816c() {
        mo80813b(false);
    }

    /* renamed from: b */
    public boolean mo80814b() {
        if (this.f57429s == null || this.f57409D.mo80825d()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80805a(boolean z) {
        if (z) {
            mo80813b(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo80811b(RecyclerView.ViewHolder viewHolder) {
        C23284b bVar = this.f57427q;
        if (bVar != null) {
            bVar.mo80784a(viewHolder);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo80815c(RecyclerView.ViewHolder viewHolder) {
        return this.f57427q.mo80792c(viewHolder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo80817d(RecyclerView.ViewHolder viewHolder) {
        return this.f57427q.mo80794d(viewHolder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo80810b(int i) {
        int a = m84510a(this.f57428r, this.f57431u, i);
        this.f57430t = a;
        return a;
    }

    /* renamed from: e */
    private int m84522e(RecyclerView.ViewHolder viewHolder) {
        return C23307f.m84664a(this.f57413c.getAdapter(), this.f57428r, C23305d.m84655a(viewHolder));
    }

    /* renamed from: b */
    private void m84517b(MotionEvent motionEvent) {
        this.f57434x = (int) (motionEvent.getX() + 0.5f);
        this.f57435y = (int) (motionEvent.getY() + 0.5f);
        this.f57406A.addMovement(motionEvent);
        int i = this.f57434x - this.f57432v;
        int i2 = this.f57435y - this.f57433w;
        this.f57407B.mo80862a(mo80819e(), i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo80813b(boolean z) {
        m84516a((MotionEvent) null, false);
        if (z) {
            m84523e(1);
        } else if (mo80814b()) {
            this.f57409D.mo80824c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cd  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m84520d(int r13) {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: com.h6ah4i.android.widget.advrecyclerview.swipeable.C23289c.m84520d(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m84523e(int r18) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.h6ah4i.android.widget.advrecyclerview.swipeable.C23289c.m84523e(int):void");
    }

    /* renamed from: a */
    private boolean m84515a(MotionEvent motionEvent, RecyclerView.ViewHolder viewHolder) {
        int e = m84522e(viewHolder);
        if (e == -1) {
            return false;
        }
        m84512a(motionEvent, viewHolder, e);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo80812b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (mo80814b()) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    m84517b(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    return;
                }
            }
            m84516a(motionEvent, true);
        }
    }

    /* renamed from: a */
    private static void m84511a(int i, int i2) {
        if ((i2 == 2 || i2 == 1) && i != 2 && i != 3 && i != 4 && i != 5) {
            throw new IllegalStateException("Unexpected after reaction has been requested: result = " + i + ", afterReaction = " + i2);
        }
    }

    /* renamed from: c */
    private boolean m84519c(RecyclerView recyclerView, MotionEvent motionEvent) {
        RecyclerView.ViewHolder a = C23305d.m84658a(recyclerView, motionEvent.getX(), motionEvent.getY());
        if (!(a instanceof AbstractC23298h)) {
            return false;
        }
        C23299i<RecyclerView.ViewHolder> iVar = this.f57428r;
        if (iVar != null) {
            iVar.mo80858a((AbstractC23298h) a);
        }
        int e = m84522e(a);
        if (e < 0 || e >= this.f57428r.getItemCount()) {
            return false;
        }
        if (C23231d.m84172b(a.getItemId()) != C23231d.m84172b(this.f57428r.getItemId(e))) {
            return false;
        }
        int x = (int) (motionEvent.getX() + 0.5f);
        int y = (int) (motionEvent.getY() + 0.5f);
        View view = a.itemView;
        int translationY = (int) (view.getTranslationY() + 0.5f);
        int left = view.getLeft();
        int top = y - (view.getTop() + translationY);
        int a2 = this.f57428r.mo80852a(a, e, x - (left + ((int) (view.getTranslationX() + 0.5f))), top);
        if (a2 == 0) {
            return false;
        }
        this.f57423m = x;
        this.f57424n = y;
        this.f57425o = a.getItemId();
        this.f57436z = a2;
        if ((16777216 & a2) == 0) {
            return true;
        }
        this.f57409D.mo80822a(motionEvent, this.f57410E);
        return true;
    }

    /* renamed from: d */
    private boolean m84521d(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f57425o == -1) {
            return false;
        }
        int x = ((int) (motionEvent.getX() + 0.5f)) - this.f57423m;
        int y = ((int) (motionEvent.getY() + 0.5f)) - this.f57424n;
        if (this.f57426p) {
            y = x;
            x = y;
        }
        if (Math.abs(x) > this.f57419i) {
            this.f57425o = -1;
            return false;
        } else if (Math.abs(y) <= this.f57419i) {
            return false;
        } else {
            if (Math.abs(x) > Math.abs(y * 2)) {
                this.f57425o = -1;
                return false;
            }
            boolean z = true;
            if (!this.f57426p ? y >= 0 ? (this.f57436z & 2097152) == 0 : (this.f57436z & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 0 : y >= 0 ? (this.f57436z & 32768) == 0 : (this.f57436z & 8) == 0) {
                z = false;
            }
            if (z) {
                this.f57425o = -1;
                return false;
            }
            RecyclerView.ViewHolder a = C23305d.m84658a(recyclerView, motionEvent.getX(), motionEvent.getY());
            if (a != null && a.getItemId() == this.f57425o) {
                return m84515a(motionEvent, a);
            }
            this.f57425o = -1;
            return false;
        }
    }

    /* renamed from: a */
    static int m84510a(RecyclerView.Adapter adapter, long j, int i) {
        if (adapter == null) {
            return -1;
        }
        int itemCount = adapter.getItemCount();
        if (i >= 0 && i < itemCount && adapter.getItemId(i) == j) {
            return i;
        }
        for (int i2 = 0; i2 < itemCount; i2++) {
            if (adapter.getItemId(i2) == j) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void m84512a(MotionEvent motionEvent, RecyclerView.ViewHolder viewHolder, int i) {
        this.f57409D.mo80821a();
        this.f57429s = viewHolder;
        this.f57430t = i;
        this.f57431u = this.f57428r.getItemId(i);
        this.f57434x = (int) (motionEvent.getX() + 0.5f);
        int y = (int) (motionEvent.getY() + 0.5f);
        this.f57435y = y;
        this.f57432v = this.f57434x;
        this.f57433w = y;
        this.f57425o = -1;
        C23305d.m84657a(viewHolder.itemView, this.f57411a);
        C23301k kVar = new C23301k(this, this.f57429s, this.f57436z, this.f57426p);
        this.f57407B = kVar;
        kVar.mo80861a();
        this.f57406A.clear();
        this.f57406A.addMovement(motionEvent);
        this.f57413c.getParent().requestDisallowInterceptTouchEvent(true);
        AbstractC23292b bVar = this.f57408C;
        if (bVar != null) {
            bVar.mo80827a(i);
        }
        this.f57428r.mo80857a(this, viewHolder, i, this.f57431u);
    }

    /* renamed from: a */
    static float m84508a(AbstractC23298h hVar, boolean z, float f, boolean z2, boolean z3) {
        int i;
        if (!(z2 ^ z3)) {
            return f;
        }
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f == BitmapDescriptorFactory.HUE_RED || m84514a(f)) {
            return f;
        }
        View a = C23300j.m84620a(hVar);
        if (z) {
            i = a.getWidth();
        } else {
            i = a.getHeight();
        }
        float f3 = (float) i;
        if (z3) {
            if (f3 != BitmapDescriptorFactory.HUE_RED) {
                f2 = 1.0f / f3;
            }
            f3 = f2;
        }
        return f * f3;
    }

    /* renamed from: a */
    private void m84513a(RecyclerView.ViewHolder viewHolder, float f, boolean z, boolean z2, boolean z3) {
        if (f == -65536.0f) {
            this.f57427q.mo80786a(viewHolder, 0, z3, this.f57416f);
        } else if (f == -65537.0f) {
            this.f57427q.mo80786a(viewHolder, 1, z3, this.f57416f);
        } else if (f == 65536.0f) {
            this.f57427q.mo80786a(viewHolder, 2, z3, this.f57416f);
        } else if (f == 65537.0f) {
            this.f57427q.mo80786a(viewHolder, 3, z3, this.f57416f);
        } else if (f == BitmapDescriptorFactory.HUE_RED) {
            this.f57427q.mo80787a(viewHolder, z2, z3, this.f57414d);
        } else {
            this.f57427q.mo80785a(viewHolder, f, z, z2, z3, this.f57415e);
        }
    }
}
