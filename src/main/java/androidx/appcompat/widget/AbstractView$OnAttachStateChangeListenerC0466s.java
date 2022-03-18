package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.AbstractC0342o;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.appcompat.widget.s */
public abstract class AbstractView$OnAttachStateChangeListenerC0466s implements View.OnAttachStateChangeListener, View.OnTouchListener {

    /* renamed from: a */
    private final float f1705a;

    /* renamed from: b */
    private final int f1706b;

    /* renamed from: c */
    final View f1707c;

    /* renamed from: d */
    private final int f1708d;

    /* renamed from: e */
    private Runnable f1709e;

    /* renamed from: f */
    private Runnable f1710f;

    /* renamed from: g */
    private boolean f1711g;

    /* renamed from: h */
    private int f1712h;

    /* renamed from: i */
    private final int[] f1713i = new int[2];

    /* renamed from: a */
    public abstract AbstractC0342o mo1233a();

    public void onViewAttachedToWindow(View view) {
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.s$b */
    public class RunnableC0468b implements Runnable {
        public void run() {
            AbstractView$OnAttachStateChangeListenerC0466s.this.mo2670d();
        }

        RunnableC0468b() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.s$a */
    public class RunnableC0467a implements Runnable {
        public void run() {
            ViewParent parent = AbstractView$OnAttachStateChangeListenerC0466s.this.f1707c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        RunnableC0467a() {
        }
    }

    /* renamed from: e */
    private void mo2170e() {
        Runnable runnable = this.f1710f;
        if (runnable != null) {
            this.f1707c.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1709e;
        if (runnable2 != null) {
            this.f1707c.removeCallbacks(runnable2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1781c() {
        AbstractC0342o a = mo1233a();
        if (a == null || !a.isShowing()) {
            return true;
        }
        a.dismiss();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1234b() {
        AbstractC0342o a = mo1233a();
        if (a == null || a.isShowing()) {
            return true;
        }
        a.show();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2670d() {
        mo2170e();
        View view = this.f1707c;
        if (view.isEnabled() && !view.isLongClickable() && mo1234b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1711g = true;
        }
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1711g = false;
        this.f1712h = -1;
        Runnable runnable = this.f1709e;
        if (runnable != null) {
            this.f1707c.removeCallbacks(runnable);
        }
    }

    public AbstractView$OnAttachStateChangeListenerC0466s(View view) {
        this.f1707c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1705a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1706b = tapTimeout;
        this.f1708d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2079a(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0466s.m2079a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    private boolean m2082b(MotionEvent motionEvent) {
        C0461q qVar;
        boolean z;
        View view = this.f1707c;
        AbstractC0342o a = mo1233a();
        if (a == null || !a.isShowing() || (qVar = (C0461q) a.getListView()) == null || !qVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m2083b(view, obtainNoHistory);
        m2081a(qVar, obtainNoHistory);
        boolean a2 = qVar.mo2654a(obtainNoHistory, this.f1712h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            z = false;
        } else {
            z = true;
        }
        if (!a2 || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m2081a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1713i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    private boolean m2083b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1713i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1711g;
        if (!z2) {
            if (!m2079a(motionEvent) || !mo1234b()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                this.f1707c.onTouchEvent(obtain);
                obtain.recycle();
            }
        } else if (m2082b(motionEvent) || !mo1781c()) {
            z = true;
        } else {
            z = false;
        }
        this.f1711g = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2080a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        if (f < f4 || f2 < f4 || f >= ((float) (view.getRight() - view.getLeft())) + f3 || f2 >= ((float) (view.getBottom() - view.getTop())) + f3) {
            return false;
        }
        return true;
    }
}
