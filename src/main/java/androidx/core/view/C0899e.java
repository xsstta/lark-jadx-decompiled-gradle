package androidx.core.view;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: androidx.core.view.e */
public final class C0899e {

    /* renamed from: a */
    private final AbstractC0900a f3429a;

    /* renamed from: androidx.core.view.e$a */
    interface AbstractC0900a {
        /* renamed from: a */
        boolean mo4688a(MotionEvent motionEvent);
    }

    /* renamed from: androidx.core.view.e$b */
    static class C0901b implements AbstractC0900a {

        /* renamed from: j */
        private static final int f3430j = ViewConfiguration.getLongPressTimeout();

        /* renamed from: k */
        private static final int f3431k = ViewConfiguration.getTapTimeout();

        /* renamed from: l */
        private static final int f3432l = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a */
        final GestureDetector.OnGestureListener f3433a;

        /* renamed from: b */
        GestureDetector.OnDoubleTapListener f3434b;

        /* renamed from: c */
        boolean f3435c;

        /* renamed from: d */
        boolean f3436d;

        /* renamed from: e */
        MotionEvent f3437e;

        /* renamed from: f */
        private int f3438f;

        /* renamed from: g */
        private int f3439g;

        /* renamed from: h */
        private int f3440h;

        /* renamed from: i */
        private int f3441i;

        /* renamed from: m */
        private final Handler f3442m;

        /* renamed from: n */
        private boolean f3443n;

        /* renamed from: o */
        private boolean f3444o;

        /* renamed from: p */
        private boolean f3445p;

        /* renamed from: q */
        private MotionEvent f3446q;

        /* renamed from: r */
        private boolean f3447r;

        /* renamed from: s */
        private float f3448s;

        /* renamed from: t */
        private float f3449t;

        /* renamed from: u */
        private float f3450u;

        /* renamed from: v */
        private float f3451v;

        /* renamed from: w */
        private boolean f3452w;

        /* renamed from: x */
        private VelocityTracker f3453x;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4689a() {
            this.f3442m.removeMessages(3);
            this.f3436d = false;
            this.f3443n = true;
            this.f3433a.onLongPress(this.f3437e);
        }

        /* renamed from: b */
        private void m4345b() {
            this.f3442m.removeMessages(1);
            this.f3442m.removeMessages(2);
            this.f3442m.removeMessages(3);
            this.f3453x.recycle();
            this.f3453x = null;
            this.f3447r = false;
            this.f3435c = false;
            this.f3444o = false;
            this.f3445p = false;
            this.f3436d = false;
            if (this.f3443n) {
                this.f3443n = false;
            }
        }

        /* renamed from: c */
        private void m4346c() {
            this.f3442m.removeMessages(1);
            this.f3442m.removeMessages(2);
            this.f3442m.removeMessages(3);
            this.f3447r = false;
            this.f3444o = false;
            this.f3445p = false;
            this.f3436d = false;
            if (this.f3443n) {
                this.f3443n = false;
            }
        }

        /* renamed from: a */
        public void mo4690a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f3434b = onDoubleTapListener;
        }

        /* renamed from: androidx.core.view.e$b$a */
        private class HandlerC0902a extends Handler {
            HandlerC0902a() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    C0901b.this.f3433a.onShowPress(C0901b.this.f3437e);
                } else if (i == 2) {
                    C0901b.this.mo4689a();
                } else if (i != 3) {
                    throw new RuntimeException("Unknown message " + message);
                } else if (C0901b.this.f3434b == null) {
                } else {
                    if (!C0901b.this.f3435c) {
                        C0901b.this.f3434b.onSingleTapConfirmed(C0901b.this.f3437e);
                    } else {
                        C0901b.this.f3436d = true;
                    }
                }
            }

            HandlerC0902a(Handler handler) {
                super(handler.getLooper());
            }
        }

        /* renamed from: a */
        private void m4343a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f3433a != null) {
                this.f3452w = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f3440h = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f3441i = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f3438f = scaledTouchSlop * scaledTouchSlop;
                this.f3439g = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x021f  */
        @Override // androidx.core.view.C0899e.AbstractC0900a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo4688a(android.view.MotionEvent r13) {
            /*
            // Method dump skipped, instructions count: 591
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C0899e.C0901b.mo4688a(android.view.MotionEvent):boolean");
        }

        C0901b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f3442m = new HandlerC0902a(handler);
            } else {
                this.f3442m = new HandlerC0902a();
            }
            this.f3433a = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                mo4690a((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            m4343a(context);
        }

        /* renamed from: a */
        private boolean m4344a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f3445p || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f3432l)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.f3439g) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.core.view.e$c */
    static class C0903c implements AbstractC0900a {

        /* renamed from: a */
        private final GestureDetector f3455a;

        @Override // androidx.core.view.C0899e.AbstractC0900a
        /* renamed from: a */
        public boolean mo4688a(MotionEvent motionEvent) {
            return this.f3455a.onTouchEvent(motionEvent);
        }

        C0903c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f3455a = new GestureDetector(context, onGestureListener, handler);
        }
    }

    /* renamed from: a */
    public boolean mo4687a(MotionEvent motionEvent) {
        return this.f3429a.mo4688a(motionEvent);
    }

    public C0899e(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public C0899e(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.f3429a = new C0903c(context, onGestureListener, handler);
        } else {
            this.f3429a = new C0901b(context, onGestureListener, handler);
        }
    }
}
