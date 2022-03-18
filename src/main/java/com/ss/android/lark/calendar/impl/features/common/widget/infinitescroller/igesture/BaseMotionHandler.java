package com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.core.view.C0917s;
import com.ss.android.lark.calendar.impl.utils.ao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000 52\u00020\u0001:\u000256B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%J\u0018\u0010&\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u0006J\b\u0010(\u001a\u00020#H\u0002J\u0018\u0010)\u001a\u00020#2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0014J\u000e\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\u0006J\u000e\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020\u0015J\u0010\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\tH&J\u0010\u00103\u001a\u00020#2\u0006\u00104\u001a\u00020\tH&R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n !*\u0004\u0018\u00010 0 X\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/BaseMotionHandler;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isMoving", "", "()Z", "mDwonX", "", "mDwonY", "mIsDown", "mIsForbidMotion", "mIsInterceptScrollY", "getMIsInterceptScrollY", "setMIsInterceptScrollY", "(Z)V", "mIsMove", "mLastX", "mLastY", "mMotionLister", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/BaseMotionHandler$OnMotionLister;", "getMMotionLister", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/BaseMotionHandler$OnMotionLister;", "setMMotionLister", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/BaseMotionHandler$OnMotionLister;)V", "mScaledVerticalScrollFactor", "mScrollDirection", "", "mVelocityTracker", "Landroid/view/VelocityTracker;", "mViewConfig", "Landroid/view/ViewConfiguration;", "kotlin.jvm.PlatformType", "addGenericMotion", "", "ev", "Landroid/view/MotionEvent;", "addMotion", "isInterceptScrollY", "clear", "down", "scroll", "deltaX", "deltaY", "setForbidMotion", "isForbid", "setMotionLister", "motionLister", "xFling", "velocityX", "yFling", "velocityY", "Companion", "OnMotionLister", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.a.a */
public abstract class BaseMotionHandler {

    /* renamed from: b */
    public static final Companion f78969b = new Companion(null);

    /* renamed from: a */
    private int f78970a;

    /* renamed from: c */
    private boolean f78971c;

    /* renamed from: d */
    private float f78972d;

    /* renamed from: e */
    private float f78973e;

    /* renamed from: f */
    private float f78974f;

    /* renamed from: g */
    private float f78975g;

    /* renamed from: h */
    private boolean f78976h;

    /* renamed from: i */
    private boolean f78977i;

    /* renamed from: j */
    private OnMotionLister f78978j;

    /* renamed from: k */
    private final VelocityTracker f78979k;

    /* renamed from: l */
    private final ViewConfiguration f78980l;

    /* renamed from: m */
    private final float f78981m;

    /* renamed from: n */
    private boolean f78982n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/BaseMotionHandler$OnMotionLister;", "", "onCancelAnimation", "", "onSmoothNearbySnap", "onXScroll", "deltaX", "", "onXSmoothTo", "toXOffset", "duration", "", "onYScroll", "deltaY", "isInterceptScrollY", "", "onYSmoothTo", "toYOffset", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.a.a$b */
    public interface OnMotionLister {
        /* renamed from: a */
        void mo113262a();

        /* renamed from: a */
        void mo113263a(int i);

        /* renamed from: a */
        void mo113264a(int i, long j);

        /* renamed from: a */
        void mo113265a(int i, long j, boolean z);

        /* renamed from: a */
        void mo113266a(int i, boolean z);

        /* renamed from: b */
        void mo113267b();
    }

    /* renamed from: a */
    public abstract void mo111022a(float f);

    /* renamed from: a */
    public abstract void mo111023a(float f, float f2);

    /* renamed from: b */
    public abstract void mo111024b(float f);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/BaseMotionHandler$Companion;", "", "()V", "MAX_VILOCITY", "", "MIN_VILOCITY", "SCROLL_DIRECTION_X", "", "SCROLL_DIRECTION_Y", "SCROLL_NO_DIRECTION", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final OnMotionLister mo113254a() {
        return this.f78978j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo113261c() {
        return this.f78982n;
    }

    /* renamed from: d */
    private final void m116697d() {
        this.f78976h = false;
        this.f78977i = false;
        this.f78970a = 0;
    }

    /* renamed from: b */
    public final boolean mo113260b() {
        return this.f78977i;
    }

    public BaseMotionHandler(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        VelocityTracker obtain = VelocityTracker.obtain();
        Intrinsics.checkExpressionValueIsNotNull(obtain, "VelocityTracker.obtain()");
        this.f78979k = obtain;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f78980l = viewConfiguration;
        this.f78981m = C0917s.m4407b(viewConfiguration, context);
    }

    /* renamed from: a */
    public final void mo113257a(OnMotionLister bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "motionLister");
        this.f78978j = bVar;
    }

    /* renamed from: a */
    public final void mo113255a(MotionEvent motionEvent) {
        if (motionEvent != null && (motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8) {
            float axisValue = motionEvent.getAxisValue(9) * this.f78981m;
            OnMotionLister bVar = this.f78978j;
            if (bVar != null) {
                bVar.mo113266a(-((int) axisValue), this.f78982n);
            }
        }
    }

    /* renamed from: a */
    public final void mo113258a(boolean z) {
        this.f78971c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo113259b(float f, float f2) {
        OnMotionLister bVar;
        int i;
        if (!this.f78971c) {
            if (this.f78970a == 0) {
                if (Math.abs(f2) > Math.abs(f)) {
                    i = 2;
                } else {
                    i = 1;
                }
                this.f78970a = i;
            }
            OnMotionLister bVar2 = this.f78978j;
            if (bVar2 != null) {
                bVar2.mo113267b();
            }
            int i2 = this.f78970a;
            if (i2 == 1) {
                OnMotionLister bVar3 = this.f78978j;
                if (bVar3 != null) {
                    bVar3.mo113263a(-((int) f));
                }
            } else if (i2 == 2 && (bVar = this.f78978j) != null) {
                bVar.mo113266a(-((int) f2), this.f78982n);
            }
        }
    }

    /* renamed from: a */
    public final void mo113256a(MotionEvent motionEvent, boolean z) {
        boolean z2;
        boolean z3;
        OnMotionLister bVar;
        if (motionEvent != null) {
            this.f78982n = z;
            this.f78979k.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            boolean z4 = false;
            if (action == 0) {
                this.f78974f = motionEvent.getX();
                float y = motionEvent.getY();
                this.f78975g = y;
                this.f78976h = true;
                this.f78977i = false;
                mo111023a(this.f78974f, y);
            } else if (action == 1) {
                int pointerId = motionEvent.getPointerId(0);
                this.f78979k.computeCurrentVelocity(1000, 8000.0f);
                float xVelocity = this.f78979k.getXVelocity(pointerId);
                float yVelocity = this.f78979k.getYVelocity(pointerId);
                if (Math.abs(yVelocity) > 300.0f || Math.abs(xVelocity) > 300.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f78971c || !z2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3 || this.f78970a != 1) {
                    if (z3 && this.f78970a == 2) {
                        mo111024b(yVelocity);
                    }
                    z4 = true;
                } else {
                    mo111022a(xVelocity);
                }
                if (z4 && (bVar = this.f78978j) != null) {
                    bVar.mo113262a();
                }
                m116697d();
            } else if (action == 2) {
                if (ao.m125229a(this.f78974f, this.f78975g, motionEvent.getX(), motionEvent.getY())) {
                    this.f78977i = true;
                }
                if (this.f78976h) {
                    this.f78972d = motionEvent.getX();
                    this.f78973e = motionEvent.getY();
                    this.f78976h = false;
                    return;
                }
                float x = motionEvent.getX() - this.f78972d;
                float y2 = motionEvent.getY() - this.f78973e;
                float f = (float) 0;
                if (Math.abs(x) > f || Math.abs(y2) > f) {
                    z4 = true;
                }
                if (z4 && !this.f78971c) {
                    mo113259b(x, y2);
                }
                this.f78972d = motionEvent.getX();
                this.f78973e = motionEvent.getY();
            } else if (action == 3) {
                OnMotionLister bVar2 = this.f78978j;
                if (bVar2 != null) {
                    bVar2.mo113262a();
                }
                m116697d();
            }
        }
    }
}
