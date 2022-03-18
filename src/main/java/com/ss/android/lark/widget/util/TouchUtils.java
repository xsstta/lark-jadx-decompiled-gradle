package com.ss.android.lark.widget.util;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TouchUtils {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Direction {
    }

    /* renamed from: com.ss.android.lark.widget.util.TouchUtils$a */
    public static abstract class AbstractView$OnTouchListenerC59251a implements View.OnTouchListener {

        /* renamed from: a */
        private int f147147a;

        /* renamed from: b */
        private int f147148b;

        /* renamed from: c */
        private int f147149c;

        /* renamed from: d */
        private int f147150d;

        /* renamed from: e */
        private int f147151e;

        /* renamed from: f */
        private int f147152f;

        /* renamed from: g */
        private int f147153g;

        /* renamed from: h */
        private VelocityTracker f147154h;

        /* renamed from: i */
        private int f147155i;

        /* renamed from: j */
        private int f147156j;

        /* renamed from: a */
        public abstract boolean mo197772a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, MotionEvent motionEvent);

        /* renamed from: a */
        public abstract boolean mo197773a(View view, int i, int i2, MotionEvent motionEvent);

        /* renamed from: b */
        public abstract boolean mo197774b(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, MotionEvent motionEvent);

        public AbstractView$OnTouchListenerC59251a() {
            m230144a(-1, -1);
        }

        /* renamed from: a */
        private void m230144a(int i, int i2) {
            this.f147148b = i;
            this.f147149c = i2;
            this.f147150d = i;
            this.f147151e = i2;
            this.f147152f = 0;
            this.f147153g = 0;
            VelocityTracker velocityTracker = this.f147154h;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        /* renamed from: a */
        public boolean mo201477a(View view, MotionEvent motionEvent) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            m230144a(rawX, rawY);
            view.setPressed(true);
            return mo197773a(view, rawX, rawY, motionEvent);
        }

        /* renamed from: c */
        public boolean mo201479c(View view, MotionEvent motionEvent) {
            int i;
            int i2;
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            VelocityTracker velocityTracker = this.f147154h;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000, (float) this.f147155i);
                int xVelocity = (int) this.f147154h.getXVelocity();
                int yVelocity = (int) this.f147154h.getYVelocity();
                this.f147154h.recycle();
                if (Math.abs(xVelocity) < this.f147156j) {
                    xVelocity = 0;
                }
                if (Math.abs(yVelocity) < this.f147156j) {
                    yVelocity = 0;
                }
                this.f147154h = null;
                i2 = xVelocity;
                i = yVelocity;
            } else {
                i2 = 0;
                i = 0;
            }
            view.setPressed(false);
            boolean b = mo197774b(view, this.f147153g, rawX, rawY, rawX - this.f147148b, rawY - this.f147149c, i2, i, motionEvent);
            if (motionEvent.getAction() == 1 && this.f147152f == 0) {
                if (motionEvent.getEventTime() - motionEvent.getDownTime() <= 1000) {
                    view.performClick();
                } else {
                    view.performLongClick();
                }
            }
            m230144a(-1, -1);
            return b;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f147147a == 0) {
                this.f147147a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            }
            if (this.f147155i == 0) {
                this.f147155i = ViewConfiguration.get(view.getContext()).getScaledMaximumFlingVelocity();
            }
            if (this.f147156j == 0) {
                this.f147156j = ViewConfiguration.get(view.getContext()).getScaledMinimumFlingVelocity();
            }
            if (this.f147154h == null) {
                this.f147154h = VelocityTracker.obtain();
            }
            this.f147154h.addMovement(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                return mo201477a(view, motionEvent);
            }
            if (action != 1) {
                if (action == 2) {
                    return mo201478b(view, motionEvent);
                }
                if (action != 3) {
                    return false;
                }
            }
            return mo201479c(view, motionEvent);
        }

        /* renamed from: b */
        public boolean mo201478b(View view, MotionEvent motionEvent) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            if (this.f147148b == -1) {
                view.setPressed(true);
                m230144a(rawX, rawY);
            }
            if (this.f147152f != 1) {
                if (Math.abs(rawX - this.f147150d) < this.f147147a && Math.abs(rawY - this.f147151e) < this.f147147a) {
                    return true;
                }
                this.f147152f = 1;
                if (Math.abs(rawX - this.f147150d) >= Math.abs(rawY - this.f147151e)) {
                    if (rawX - this.f147150d < 0) {
                        this.f147153g = 1;
                    } else {
                        this.f147153g = 4;
                    }
                } else if (rawY - this.f147151e < 0) {
                    this.f147153g = 2;
                } else {
                    this.f147153g = 8;
                }
            }
            boolean a = mo197772a(view, this.f147153g, rawX, rawY, rawX - this.f147150d, rawY - this.f147151e, rawX - this.f147148b, rawY - this.f147149c, motionEvent);
            this.f147150d = rawX;
            this.f147151e = rawY;
            return a;
        }
    }

    /* renamed from: a */
    public static void m230143a(View view, AbstractView$OnTouchListenerC59251a aVar) {
        if (view != null && aVar != null) {
            view.setOnTouchListener(aVar);
        }
    }
}
