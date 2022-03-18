package com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.b */
public class C7368b {

    /* renamed from: a */
    public AbstractC7370c f19712a;

    /* renamed from: b */
    private int f19713b = -1;

    /* renamed from: c */
    private int f19714c;

    /* renamed from: d */
    private final ScaleGestureDetector f19715d;

    /* renamed from: e */
    private VelocityTracker f19716e;

    /* renamed from: f */
    private boolean f19717f;

    /* renamed from: g */
    private float f19718g;

    /* renamed from: h */
    private float f19719h;

    /* renamed from: i */
    private final float f19720i;

    /* renamed from: j */
    private final float f19721j;

    /* renamed from: b */
    public boolean mo28716b() {
        return this.f19717f;
    }

    /* renamed from: a */
    public boolean mo28714a() {
        return this.f19715d.isInProgress();
    }

    /* renamed from: b */
    private float m29415b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f19714c);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* renamed from: c */
    private float m29416c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f19714c);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* renamed from: a */
    public boolean mo28715a(MotionEvent motionEvent) {
        try {
            this.f19715d.onTouchEvent(motionEvent);
            return m29417d(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    /* renamed from: d */
    private boolean m29417d(MotionEvent motionEvent) {
        boolean z;
        int i;
        int action = motionEvent.getAction() & 255;
        int i2 = 0;
        if (action == 0) {
            this.f19713b = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f19716e = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.f19718g = m29415b(motionEvent);
            this.f19719h = m29416c(motionEvent);
            this.f19717f = false;
        } else if (action == 1) {
            this.f19713b = -1;
            if (this.f19717f && this.f19716e != null) {
                this.f19718g = m29415b(motionEvent);
                this.f19719h = m29416c(motionEvent);
                this.f19716e.addMovement(motionEvent);
                this.f19716e.computeCurrentVelocity(1000);
                float xVelocity = this.f19716e.getXVelocity();
                float yVelocity = this.f19716e.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f19721j) {
                    this.f19712a.mo28722a(this.f19718g, this.f19719h, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.f19716e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f19716e = null;
            }
        } else if (action == 2) {
            float b = m29415b(motionEvent);
            float c = m29416c(motionEvent);
            float f = b - this.f19718g;
            float f2 = c - this.f19719h;
            if (!this.f19717f) {
                if (Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.f19720i)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f19717f = z;
            }
            if (this.f19717f) {
                this.f19712a.mo28720a(f, f2);
                this.f19718g = b;
                this.f19719h = c;
                VelocityTracker velocityTracker2 = this.f19716e;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f19713b = -1;
            VelocityTracker velocityTracker3 = this.f19716e;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f19716e = null;
            }
        } else if (action == 6) {
            int a = C7384k.m29474a(motionEvent.getAction());
            if (motionEvent.getPointerId(a) == this.f19713b) {
                if (a == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.f19713b = motionEvent.getPointerId(i);
                this.f19718g = motionEvent.getX(i);
                this.f19719h = motionEvent.getY(i);
            }
        }
        int i3 = this.f19713b;
        if (i3 != -1) {
            i2 = i3;
        }
        this.f19714c = motionEvent.findPointerIndex(i2);
        return true;
    }

    C7368b(Context context, AbstractC7370c cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f19721j = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f19720i = (float) viewConfiguration.getScaledTouchSlop();
        this.f19712a = cVar;
        this.f19715d = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.C7368b.ScaleGestureDetector$OnScaleGestureListenerC73691 */

            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                if (scaleFactor < BitmapDescriptorFactory.HUE_RED) {
                    return true;
                }
                C7368b.this.f19712a.mo28721a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }
        });
    }
}
