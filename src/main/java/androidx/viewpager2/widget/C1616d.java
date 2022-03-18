package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* access modifiers changed from: package-private */
/* renamed from: androidx.viewpager2.widget.d */
public final class C1616d {

    /* renamed from: a */
    private final ViewPager2 f5591a;

    /* renamed from: b */
    private final ScrollEventAdapter f5592b;

    /* renamed from: c */
    private final RecyclerView f5593c;

    /* renamed from: d */
    private VelocityTracker f5594d;

    /* renamed from: e */
    private int f5595e;

    /* renamed from: f */
    private float f5596f;

    /* renamed from: g */
    private int f5597g;

    /* renamed from: h */
    private long f5598h;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo8363a() {
        return this.f5592b.isFakeDragging();
    }

    /* renamed from: d */
    private void m7314d() {
        VelocityTracker velocityTracker = this.f5594d;
        if (velocityTracker == null) {
            this.f5594d = VelocityTracker.obtain();
            this.f5595e = ViewConfiguration.get(this.f5591a.getContext()).getScaledMaximumFlingVelocity();
            return;
        }
        velocityTracker.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo8365b() {
        if (this.f5592b.isDragging()) {
            return false;
        }
        this.f5597g = 0;
        this.f5596f = (float) 0;
        this.f5598h = SystemClock.uptimeMillis();
        m7314d();
        this.f5592b.notifyBeginFakeDrag();
        if (!this.f5592b.isIdle()) {
            this.f5593c.stopScroll();
        }
        m7313a(this.f5598h, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo8366c() {
        if (!this.f5592b.isFakeDragging()) {
            return false;
        }
        this.f5592b.notifyEndFakeDrag();
        VelocityTracker velocityTracker = this.f5594d;
        velocityTracker.computeCurrentVelocity(1000, (float) this.f5595e);
        if (this.f5593c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.f5591a.snapToPage();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo8364a(float f) {
        boolean z;
        int i;
        float f2;
        float f3;
        int i2 = 0;
        if (!this.f5592b.isFakeDragging()) {
            return false;
        }
        float f4 = this.f5596f - f;
        this.f5596f = f4;
        int round = Math.round(f4 - ((float) this.f5597g));
        this.f5597g += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f5591a.getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = round;
        } else {
            i = 0;
        }
        if (!z) {
            i2 = round;
        }
        if (z) {
            f2 = this.f5596f;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (z) {
            f3 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f3 = this.f5596f;
        }
        this.f5593c.scrollBy(i, i2);
        m7313a(uptimeMillis, 2, f2, f3);
        return true;
    }

    C1616d(ViewPager2 viewPager2, ScrollEventAdapter scrollEventAdapter, RecyclerView recyclerView) {
        this.f5591a = viewPager2;
        this.f5592b = scrollEventAdapter;
        this.f5593c = recyclerView;
    }

    /* renamed from: a */
    private void m7313a(long j, int i, float f, float f2) {
        MotionEvent obtain = MotionEvent.obtain(this.f5598h, j, i, f, f2, 0);
        this.f5594d.addMovement(obtain);
        obtain.recycle();
    }
}
