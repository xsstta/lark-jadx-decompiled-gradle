package com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C43999d;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.utils.C44047c;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.utils.C44049e;
import com.ss.ttm.player.MediaPlayer;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.c */
public class C44032c {

    /* renamed from: A */
    private VelocityTracker f111728A = VelocityTracker.obtain();

    /* renamed from: B */
    private C44044k f111729B;

    /* renamed from: C */
    private AbstractC44035b f111730C;

    /* renamed from: D */
    private HandlerC44034a f111731D;

    /* renamed from: E */
    private int f111732E = ViewConfiguration.getLongPressTimeout();

    /* renamed from: a */
    private final Rect f111733a = new Rect();

    /* renamed from: b */
    private RecyclerView.AbstractC1338g f111734b = new RecyclerView.AbstractC1338g() {
        /* class com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.C44032c.C440331 */

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: a */
        public void mo6561a(boolean z) {
            C44032c.this.mo156667a(z);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: b */
        public void mo6563b(RecyclerView recyclerView, MotionEvent motionEvent) {
            C44032c.this.mo156674b(recyclerView, motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: a */
        public boolean mo6562a(RecyclerView recyclerView, MotionEvent motionEvent) {
            return C44032c.this.mo156671a(recyclerView, motionEvent);
        }
    };

    /* renamed from: c */
    private RecyclerView f111735c;

    /* renamed from: d */
    private long f111736d = 300;

    /* renamed from: e */
    private long f111737e = 200;

    /* renamed from: f */
    private long f111738f = 200;

    /* renamed from: g */
    private final long f111739g = 300;

    /* renamed from: h */
    private final long f111740h = 300;

    /* renamed from: i */
    private int f111741i;

    /* renamed from: j */
    private int f111742j;

    /* renamed from: k */
    private int f111743k;

    /* renamed from: l */
    private int f111744l;

    /* renamed from: m */
    private int f111745m;

    /* renamed from: n */
    private int f111746n;

    /* renamed from: o */
    private long f111747o = -1;

    /* renamed from: p */
    private boolean f111748p;

    /* renamed from: q */
    private C44027b f111749q;

    /* renamed from: r */
    private C44042i<RecyclerView.ViewHolder> f111750r;

    /* renamed from: s */
    private RecyclerView.ViewHolder f111751s;

    /* renamed from: t */
    private int f111752t = -1;

    /* renamed from: u */
    private long f111753u = -1;

    /* renamed from: v */
    private int f111754v;

    /* renamed from: w */
    private int f111755w;

    /* renamed from: x */
    private int f111756x;

    /* renamed from: y */
    private int f111757y;

    /* renamed from: z */
    private int f111758z;

    /* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.c$b */
    public interface AbstractC44035b {
        /* renamed from: a */
        void mo152943a(int i);

        /* renamed from: a */
        void mo152944a(int i, int i2, int i3);
    }

    /* renamed from: a */
    private static int m174360a(float f, boolean z) {
        return z ? f < BitmapDescriptorFactory.HUE_RED ? 1 : 3 : f < BitmapDescriptorFactory.HUE_RED ? 2 : 4;
    }

    /* renamed from: a */
    private static boolean m174365a(float f) {
        return f == -65536.0f || f == 65536.0f || f == -65537.0f || f == 65537.0f;
    }

    /* renamed from: d */
    private static int m174370d(int i) {
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
    public boolean mo156681d() {
        return this.f111748p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo156682e() {
        return this.f111752t;
    }

    /* renamed from: a */
    public RecyclerView.Adapter mo156661a(RecyclerView.Adapter adapter) {
        if (!adapter.hasStableIds()) {
            throw new IllegalArgumentException("The passed adapter does not support stable IDs");
        } else if (this.f111750r == null) {
            C44042i<RecyclerView.ViewHolder> iVar = new C44042i<>(this, adapter);
            this.f111750r = iVar;
            return iVar;
        } else {
            throw new IllegalStateException("already have a wrapped adapter");
        }
    }

    /* renamed from: a */
    public boolean mo156668a() {
        return this.f111734b == null;
    }

    /* renamed from: a */
    public void mo156665a(RecyclerView recyclerView) {
        if (mo156668a()) {
            throw new IllegalStateException("Accessing released object");
        } else if (this.f111735c == null) {
            int a = C44047c.m174497a(recyclerView);
            if (a != -1) {
                this.f111735c = recyclerView;
                recyclerView.addOnItemTouchListener(this.f111734b);
                ViewConfiguration viewConfiguration = ViewConfiguration.get(recyclerView.getContext());
                this.f111741i = viewConfiguration.getScaledTouchSlop();
                this.f111742j = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f111743k = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f111744l = this.f111741i * 5;
                C44027b bVar = new C44027b(this.f111750r);
                this.f111749q = bVar;
                bVar.mo156644a((int) ((recyclerView.getResources().getDisplayMetrics().density * 8.0f) + 0.5f));
                boolean z = true;
                if (a != 1) {
                    z = false;
                }
                this.f111748p = z;
                this.f111731D = new HandlerC44034a(this);
                return;
            }
            throw new IllegalStateException("failed to determine layout orientation");
        } else {
            throw new IllegalStateException("RecyclerView instance has already been set");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo156671a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                } else if (mo156676b()) {
                    m174368b(motionEvent);
                    return true;
                } else if (m174371d(recyclerView, motionEvent)) {
                    return true;
                } else {
                    return false;
                }
            }
            if (m174367a(motionEvent, true)) {
                return true;
            }
            return false;
        } else if (mo156676b()) {
            return false;
        } else {
            m174369c(recyclerView, motionEvent);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo156667a(boolean z) {
        if (z) {
            mo156675b(true);
        }
    }

    /* renamed from: a */
    public boolean mo156670a(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(viewHolder instanceof AbstractC44041h) || mo156676b()) {
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
                if (this.f111748p) {
                    return false;
                }
            }
            if (!this.f111748p) {
                return false;
            }
        }
        int e = m174372e(viewHolder);
        if (e == -1) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        m174363a(obtain, viewHolder, e);
        obtain.recycle();
        m174374f(i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo156669a(RecyclerView.ViewHolder viewHolder) {
        C44027b bVar = this.f111749q;
        return bVar != null && bVar.mo156651b(viewHolder);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo156664a(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, int r13, float r14, float r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.C44032c.mo156664a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, float, float, boolean, boolean, boolean, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo156663a(MotionEvent motionEvent) {
        RecyclerView.ViewHolder findViewHolderForItemId = this.f111735c.findViewHolderForItemId(this.f111747o);
        if (findViewHolderForItemId != null) {
            m174366a(motionEvent, findViewHolderForItemId);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.c$a */
    public static class HandlerC44034a extends Handler {

        /* renamed from: a */
        private C44032c f111760a;

        /* renamed from: b */
        private MotionEvent f111761b;

        /* renamed from: b */
        public void mo156686b() {
            removeMessages(2);
        }

        /* renamed from: d */
        public boolean mo156688d() {
            return hasMessages(2);
        }

        /* renamed from: a */
        public void mo156684a() {
            removeMessages(1);
            MotionEvent motionEvent = this.f111761b;
            if (motionEvent != null) {
                motionEvent.recycle();
                this.f111761b = null;
            }
        }

        /* renamed from: c */
        public void mo156687c() {
            if (!mo156688d()) {
                sendEmptyMessage(2);
            }
        }

        public HandlerC44034a(C44032c cVar) {
            this.f111760a = cVar;
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                this.f111760a.mo156663a(this.f111761b);
            } else if (i == 2) {
                this.f111760a.mo156675b(true);
            }
        }

        /* renamed from: a */
        public void mo156685a(MotionEvent motionEvent, int i) {
            mo156684a();
            this.f111761b = MotionEvent.obtain(motionEvent);
            sendEmptyMessageAtTime(1, motionEvent.getDownTime() + ((long) i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo156683f() {
        return mo156677c(this.f111752t);
    }

    /* renamed from: g */
    private void m174375g() {
        HandlerC44034a aVar = this.f111731D;
        if (aVar != null) {
            aVar.mo156684a();
        }
        this.f111747o = -1;
        this.f111758z = 0;
    }

    /* renamed from: c */
    public void mo156679c() {
        mo156675b(false);
    }

    /* renamed from: b */
    public boolean mo156676b() {
        if (this.f111751s == null || this.f111731D.mo156688d()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo156662a(int i) {
        this.f111732E = i;
    }

    /* renamed from: a */
    public void mo156666a(AbstractC44035b bVar) {
        this.f111730C = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo156673b(RecyclerView.ViewHolder viewHolder) {
        C44027b bVar = this.f111749q;
        if (bVar != null) {
            bVar.mo156645a(viewHolder);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo156678c(RecyclerView.ViewHolder viewHolder) {
        return this.f111749q.mo156653c(viewHolder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo156680d(RecyclerView.ViewHolder viewHolder) {
        return this.f111749q.mo156655d(viewHolder);
    }

    /* renamed from: b */
    public void mo156672b(int i) {
        this.f111744l = Math.max(i, this.f111741i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo156677c(int i) {
        int a = m174361a(this.f111750r, this.f111753u, i);
        this.f111752t = a;
        return a;
    }

    /* renamed from: e */
    private int m174372e(RecyclerView.ViewHolder viewHolder) {
        return C44049e.m174505a(this.f111735c.getAdapter(), this.f111750r, C44047c.m174496a(viewHolder));
    }

    /* renamed from: b */
    private void m174368b(MotionEvent motionEvent) {
        this.f111756x = (int) (motionEvent.getX() + 0.5f);
        this.f111757y = (int) (motionEvent.getY() + 0.5f);
        this.f111728A.addMovement(motionEvent);
        int i = this.f111756x - this.f111754v;
        int i2 = this.f111757y - this.f111755w;
        this.f111729B.mo156719a(mo156682e(), i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo156675b(boolean z) {
        m174367a((MotionEvent) null, false);
        if (z) {
            m174374f(1);
        } else if (mo156676b()) {
            this.f111731D.mo156687c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cb  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m174373e(int r13) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.C44032c.m174373e(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m174374f(int r18) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.C44032c.m174374f(int):void");
    }

    /* renamed from: a */
    private boolean m174366a(MotionEvent motionEvent, RecyclerView.ViewHolder viewHolder) {
        int e = m174372e(viewHolder);
        if (e == -1) {
            return false;
        }
        m174363a(motionEvent, viewHolder, e);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo156674b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (mo156676b()) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    m174368b(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    return;
                }
            }
            m174367a(motionEvent, true);
        }
    }

    /* renamed from: a */
    private static void m174362a(int i, int i2) {
        if ((i2 == 2 || i2 == 1) && i != 2 && i != 3 && i != 4 && i != 5) {
            throw new IllegalStateException("Unexpected after reaction has been requested: result = " + i + ", afterReaction = " + i2);
        }
    }

    /* renamed from: c */
    private boolean m174369c(RecyclerView recyclerView, MotionEvent motionEvent) {
        RecyclerView.ViewHolder a = C44047c.m174499a(recyclerView, motionEvent.getX(), motionEvent.getY());
        if (!(a instanceof AbstractC44041h)) {
            return false;
        }
        C44042i<RecyclerView.ViewHolder> iVar = this.f111750r;
        if (iVar != null) {
            iVar.mo156716a((AbstractC44041h) a);
        }
        int e = m174372e(a);
        if (e < 0 || e >= this.f111750r.getItemCount()) {
            return false;
        }
        if (C43999d.m174233a(a.getItemId()) != C43999d.m174233a(this.f111750r.getItemId(e))) {
            return false;
        }
        int x = (int) (motionEvent.getX() + 0.5f);
        int y = (int) (motionEvent.getY() + 0.5f);
        View view = a.itemView;
        int translationY = (int) (view.getTranslationY() + 0.5f);
        int left = view.getLeft();
        int top = y - (view.getTop() + translationY);
        int a2 = this.f111750r.mo156710a(a, e, x - (left + ((int) (view.getTranslationX() + 0.5f))), top);
        if (a2 == 0) {
            return false;
        }
        this.f111745m = x;
        this.f111746n = y;
        this.f111747o = a.getItemId();
        this.f111758z = a2;
        if ((16777216 & a2) == 0) {
            return true;
        }
        this.f111731D.mo156685a(motionEvent, this.f111732E);
        return true;
    }

    /* renamed from: d */
    private boolean m174371d(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f111747o == -1) {
            return false;
        }
        int x = ((int) (motionEvent.getX() + 0.5f)) - this.f111745m;
        int y = ((int) (motionEvent.getY() + 0.5f)) - this.f111746n;
        if (this.f111748p) {
            y = x;
            x = y;
        }
        if (Math.abs(x) > this.f111741i) {
            this.f111747o = -1;
            return false;
        } else if (Math.abs(y) <= this.f111741i) {
            return false;
        } else {
            if (Math.abs(x) > Math.abs(y * 3)) {
                this.f111747o = -1;
                return false;
            }
            boolean z = true;
            if (!this.f111748p ? y >= 0 ? (this.f111758z & 2097152) == 0 : (this.f111758z & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 0 : y >= 0 ? (this.f111758z & 32768) == 0 : (this.f111758z & 8) == 0) {
                z = false;
            }
            if (z) {
                this.f111747o = -1;
                return false;
            }
            RecyclerView.ViewHolder a = C44047c.m174499a(recyclerView, motionEvent.getX(), motionEvent.getY());
            if (a != null && a.getItemId() == this.f111747o) {
                return m174366a(motionEvent, a);
            }
            this.f111747o = -1;
            return false;
        }
    }

    /* renamed from: a */
    private boolean m174367a(MotionEvent motionEvent, boolean z) {
        int i;
        if (motionEvent != null) {
            i = motionEvent.getActionMasked();
            this.f111756x = (int) (motionEvent.getX() + 0.5f);
            this.f111757y = (int) (motionEvent.getY() + 0.5f);
        } else {
            i = 3;
        }
        if (!mo156676b()) {
            m174375g();
            return false;
        } else if (!z) {
            return true;
        } else {
            m174373e(i);
            return true;
        }
    }

    /* renamed from: a */
    static int m174361a(RecyclerView.Adapter adapter, long j, int i) {
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
    private void m174363a(MotionEvent motionEvent, RecyclerView.ViewHolder viewHolder, int i) {
        this.f111731D.mo156684a();
        this.f111751s = viewHolder;
        this.f111752t = i;
        this.f111753u = this.f111750r.getItemId(i);
        this.f111756x = (int) (motionEvent.getX() + 0.5f);
        int y = (int) (motionEvent.getY() + 0.5f);
        this.f111757y = y;
        this.f111754v = this.f111756x;
        this.f111755w = y;
        this.f111747o = -1;
        C44047c.m174498a(viewHolder.itemView, this.f111733a);
        C44044k kVar = new C44044k(this, this.f111751s, this.f111758z, this.f111748p);
        this.f111729B = kVar;
        kVar.mo156718a();
        this.f111728A.clear();
        this.f111728A.addMovement(motionEvent);
        this.f111735c.getParent().requestDisallowInterceptTouchEvent(true);
        AbstractC44035b bVar = this.f111730C;
        if (bVar != null) {
            bVar.mo152943a(i);
        }
        this.f111750r.mo156715a(this, viewHolder, i, this.f111753u);
    }

    /* renamed from: a */
    static float m174359a(AbstractC44041h hVar, boolean z, float f, boolean z2, boolean z3) {
        int i;
        if (!(z2 ^ z3)) {
            return f;
        }
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f == BitmapDescriptorFactory.HUE_RED || m174365a(f)) {
            return f;
        }
        View a = C44043j.m174471a(hVar);
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
    private void m174364a(RecyclerView.ViewHolder viewHolder, float f, boolean z, boolean z2, boolean z3) {
        if (f == -65536.0f) {
            this.f111749q.mo156647a(viewHolder, 0, z3, this.f111738f);
        } else if (f == -65537.0f) {
            this.f111749q.mo156647a(viewHolder, 1, z3, this.f111738f);
        } else if (f == 65536.0f) {
            this.f111749q.mo156647a(viewHolder, 2, z3, this.f111738f);
        } else if (f == 65537.0f) {
            this.f111749q.mo156647a(viewHolder, 3, z3, this.f111738f);
        } else if (f == BitmapDescriptorFactory.HUE_RED) {
            this.f111749q.mo156648a(viewHolder, z2, z3, this.f111736d);
        } else {
            this.f111749q.mo156646a(viewHolder, f, z, z2, z3, this.f111737e);
        }
    }
}
