package com.ss.android.photoeditor.ve.p3013b;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.photoeditor.ve.b.c */
public abstract class AbstractC59833c extends AbstractC59830a {

    /* renamed from: h */
    protected float f148758h;

    /* renamed from: i */
    protected float f148759i;

    /* renamed from: j */
    protected float f148760j;

    /* renamed from: k */
    protected float f148761k;

    /* renamed from: l */
    private final float f148762l;

    /* renamed from: m */
    private float f148763m;

    /* renamed from: n */
    private float f148764n;

    /* renamed from: o */
    private float f148765o;

    /* renamed from: p */
    private float f148766p;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.photoeditor.ve.p3013b.AbstractC59830a
    /* renamed from: a */
    public abstract void mo203639a(int i, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    @Override // com.ss.android.photoeditor.ve.p3013b.AbstractC59830a
    /* renamed from: b */
    public abstract void mo203641b(int i, MotionEvent motionEvent);

    public AbstractC59833c(Context context) {
        super(context);
        this.f148762l = (float) ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.photoeditor.ve.p3013b.AbstractC59830a
    /* renamed from: b */
    public void mo203642b(MotionEvent motionEvent) {
        super.mo203642b(motionEvent);
        MotionEvent motionEvent2 = this.f148751c;
        this.f148765o = -1.0f;
        this.f148766p = -1.0f;
        float x = motionEvent2.getX(0);
        float y = motionEvent2.getY(0);
        this.f148758h = motionEvent2.getX(1) - x;
        this.f148759i = motionEvent2.getY(1) - y;
        float x2 = motionEvent.getX(0);
        float y2 = motionEvent.getY(0);
        this.f148760j = motionEvent.getX(1) - x2;
        this.f148761k = motionEvent.getY(1) - y2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo203647c(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        DisplayMetrics displayMetrics = this.f148749a.getResources().getDisplayMetrics();
        this.f148763m = ((float) displayMetrics.widthPixels) - this.f148762l;
        float f = this.f148762l;
        float f2 = ((float) displayMetrics.heightPixels) - f;
        this.f148764n = f2;
        float f3 = this.f148763m;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float a = m232092a(motionEvent, 1);
        float b = m232093b(motionEvent, 1);
        if (rawX < f || rawY < f || rawX > f3 || rawY > f2) {
            z = true;
        } else {
            z = false;
        }
        if (a < f || b < f || a > f3 || b > f2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!z || !z2) && !z && !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    protected static float m232092a(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        if (i < motionEvent.getPointerCount()) {
            return motionEvent.getX(i) + rawX;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: b */
    protected static float m232093b(MotionEvent motionEvent, int i) {
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        if (i < motionEvent.getPointerCount()) {
            return motionEvent.getY(i) + rawY;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }
}
