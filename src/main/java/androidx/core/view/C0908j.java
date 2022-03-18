package androidx.core.view;

import android.view.MotionEvent;

/* renamed from: androidx.core.view.j */
public final class C0908j {
    /* renamed from: a */
    public static int m4366a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    /* renamed from: b */
    public static int m4368b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    /* renamed from: c */
    public static int m4371c(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    /* renamed from: c */
    public static float m4370c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    /* renamed from: d */
    public static float m4372d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    /* renamed from: a */
    public static int m4367a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    /* renamed from: b */
    public static int m4369b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    /* renamed from: e */
    public static boolean m4373e(MotionEvent motionEvent, int i) {
        if ((motionEvent.getSource() & i) == i) {
            return true;
        }
        return false;
    }
}
