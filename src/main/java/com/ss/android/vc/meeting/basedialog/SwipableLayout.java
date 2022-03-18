package com.ss.android.vc.meeting.basedialog;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class SwipableLayout extends LinearLayout implements AbstractC61225d {

    /* renamed from: a */
    private static final int f153328a = C60773o.m236115a(10.0d);

    /* renamed from: b */
    private static final int f153329b = C60773o.m236115a(66.0d);

    /* renamed from: c */
    private static final int f153330c = C60773o.m236115a(50.0d);

    /* renamed from: d */
    private int f153331d;

    /* renamed from: e */
    private int f153332e;

    /* renamed from: f */
    private int f153333f;

    /* renamed from: g */
    private int f153334g;

    /* renamed from: h */
    private AbstractC61221a f153335h;

    /* renamed from: i */
    private boolean f153336i;

    /* renamed from: j */
    private int f153337j;

    /* renamed from: k */
    private boolean f153338k;

    /* renamed from: l */
    private AbstractC61225d f153339l;

    /* renamed from: m */
    private AbstractC61225d f153340m;

    /* renamed from: n */
    private boolean f153341n = true;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SwipeGravity {
    }

    /* renamed from: com.ss.android.vc.meeting.basedialog.SwipableLayout$a */
    public interface AbstractC61221a {
        /* renamed from: a */
        int mo211662a();

        /* renamed from: a */
        boolean mo211663a(int i, int i2);

        /* renamed from: b */
        int mo211664b();

        /* renamed from: c */
        int mo211665c();

        /* renamed from: d */
        void mo211666d();

        /* renamed from: e */
        void mo211667e();

        /* renamed from: f */
        void mo211668f();
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61225d
    /* renamed from: a */
    public void mo211689a() {
        AbstractC61221a aVar = this.f153335h;
        if (aVar != null) {
            aVar.mo211666d();
        }
    }

    public int getTrueHeight() {
        return getLayoutParams().height;
    }

    public void setCanSwipeClose(boolean z) {
        this.f153341n = z;
    }

    public void setCanSwipeToUp(boolean z) {
        this.f153338k = z;
    }

    public void setOnLayoutSwipeListener(AbstractC61221a aVar) {
        this.f153335h = aVar;
    }

    public void setSyncSwipable(AbstractC61225d dVar) {
        this.f153339l = dVar;
    }

    public void setSyncSwipable2(AbstractC61225d dVar) {
        this.f153340m = dVar;
    }

    public SwipableLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m238102b(int i) {
        setY((float) i);
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61225d
    /* renamed from: a */
    public void mo211690a(float f) {
        setAlpha(BitmapDescriptorFactory.HUE_RED);
    }

    public void setTrueHeight(int i) {
        getLayoutParams().height = i;
        requestLayout();
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61225d
    /* renamed from: a */
    public void mo211691a(int i) {
        setAlpha(1.0f);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i;
        int rawY = (int) motionEvent.getRawY();
        if (motionEvent.getActionMasked() == 0) {
            this.f153333f = rawY;
            this.f153334g = (int) motionEvent.getY();
            this.f153332e = (int) getY();
            this.f153331d = getHeight();
            this.f153337j = (C60776r.m236144b() - getHeight()) - this.f153332e;
        } else if (motionEvent.getActionMasked() == 2) {
            int i2 = rawY - this.f153333f;
            if (Math.abs(i2) > f153328a) {
                AbstractC61221a aVar = this.f153335h;
                if (aVar != null && this.f153334g > aVar.mo211665c()) {
                    AbstractC61221a aVar2 = this.f153335h;
                    if (i2 > 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (!aVar2.mo211663a(i, rawY)) {
                        return false;
                    }
                }
                this.f153336i = true;
                return true;
            }
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int rawY = (int) motionEvent.getRawY();
        if (motionEvent.getActionMasked() == 0) {
            this.f153333f = rawY;
            this.f153332e = (int) getY();
            this.f153331d = getHeight();
            this.f153337j = (C60776r.m236144b() - getHeight()) - this.f153332e;
        } else if (motionEvent.getActionMasked() == 2) {
            int i3 = rawY - this.f153333f;
            if (!this.f153336i && Math.abs(i3) > f153328a && this.f153341n) {
                this.f153336i = true;
            }
            if (this.f153336i) {
                m238101a(this.f153331d, this.f153332e, i3);
            }
        } else if (motionEvent.getActionMasked() == 1) {
            int i4 = rawY - this.f153333f;
            if (this.f153336i) {
                this.f153336i = false;
                if (i4 > getHeight() / 3 || i4 > f153329b) {
                    AbstractC61225d dVar = this.f153339l;
                    if (dVar != null) {
                        dVar.mo211689a();
                    }
                    AbstractC61225d dVar2 = this.f153340m;
                    if (dVar2 != null) {
                        dVar2.mo211689a();
                    }
                    AbstractC61221a aVar = this.f153335h;
                    if (aVar != null) {
                        aVar.mo211666d();
                    }
                } else if (this.f153335h == null || !this.f153338k) {
                    AbstractC61225d dVar3 = this.f153339l;
                    if (dVar3 != null) {
                        dVar3.mo211692a(200, "y", getY(), (float) this.f153332e);
                    }
                    AbstractC61225d dVar4 = this.f153340m;
                    if (dVar4 != null) {
                        dVar4.mo211692a(200, "y", getY(), (float) this.f153332e);
                    }
                    AbstractC61221a aVar2 = this.f153335h;
                    if (aVar2 != null) {
                        aVar2.mo211668f();
                    }
                    ObjectAnimator.ofFloat(this, "y", getY(), (float) this.f153332e).setDuration(200L).start();
                } else {
                    if (getHeight() >= this.f153335h.mo211664b() + f153330c) {
                        i2 = (C60776r.m236144b() - this.f153337j) - this.f153335h.mo211662a();
                        i = this.f153335h.mo211662a();
                    } else {
                        i2 = (C60776r.m236144b() - this.f153337j) - this.f153335h.mo211664b();
                        i = this.f153335h.mo211664b();
                    }
                    AbstractC61225d dVar5 = this.f153339l;
                    if (dVar5 != null) {
                        dVar5.mo211693a(200L, "trueHeight", getHeight(), i);
                    }
                    AbstractC61225d dVar6 = this.f153340m;
                    if (dVar6 != null) {
                        dVar6.mo211693a(200L, "trueHeight", getHeight(), i);
                    }
                    AbstractC61221a aVar3 = this.f153335h;
                    if (aVar3 != null) {
                        aVar3.mo211668f();
                    }
                    ObjectAnimator.ofInt(this, "trueHeight", getHeight(), i).setDuration(200L).start();
                    if (getHeight() < i) {
                        postDelayed(new Runnable(i2) {
                            /* class com.ss.android.vc.meeting.basedialog.$$Lambda$SwipableLayout$ls__RUhyEWBwh0LaPfSKm1P27Rs */
                            public final /* synthetic */ int f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                SwipableLayout.this.m238102b(this.f$1);
                            }
                        }, 220);
                    } else {
                        AbstractC61225d dVar7 = this.f153339l;
                        if (dVar7 != null) {
                            dVar7.mo211692a(200, "y", getY(), (float) i2);
                        }
                        AbstractC61225d dVar8 = this.f153340m;
                        if (dVar8 != null) {
                            dVar8.mo211692a(200, "y", getY(), (float) i2);
                        }
                        AbstractC61221a aVar4 = this.f153335h;
                        if (aVar4 != null) {
                            aVar4.mo211668f();
                        }
                        ObjectAnimator.ofFloat(this, "y", getY(), (float) i2).setDuration(200L).start();
                    }
                }
            }
        }
        return true;
    }

    public SwipableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwipableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61225d
    /* renamed from: a */
    public void mo211692a(long j, String str, float... fArr) {
        setAlpha(1.0f);
    }

    /* renamed from: a */
    private void m238101a(int i, int i2, int i3) {
        if (i3 >= 0) {
            AbstractC61225d dVar = this.f153339l;
            if (dVar != null) {
                dVar.mo211690a((float) (i2 + i3));
            }
            AbstractC61225d dVar2 = this.f153340m;
            if (dVar2 != null) {
                dVar2.mo211690a((float) (i2 + i3));
            }
            AbstractC61221a aVar = this.f153335h;
            if (aVar != null) {
                aVar.mo211667e();
            }
            setY((float) (i2 + i3));
            return;
        }
        AbstractC61221a aVar2 = this.f153335h;
        if (aVar2 != null && this.f153338k) {
            int i4 = i - i3;
            if (i4 >= aVar2.mo211662a()) {
                i4 = this.f153335h.mo211662a();
            }
            AbstractC61225d dVar3 = this.f153339l;
            if (dVar3 != null) {
                dVar3.mo211691a(i4);
            }
            AbstractC61225d dVar4 = this.f153340m;
            if (dVar4 != null) {
                dVar4.mo211691a(i4);
            }
            getLayoutParams().height = i4;
            requestLayout();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61225d
    /* renamed from: a */
    public void mo211693a(long j, String str, int... iArr) {
        setAlpha(1.0f);
    }
}
