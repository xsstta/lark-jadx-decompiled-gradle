package com.ss.android.photoeditor.ve.p3013b;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: com.ss.android.photoeditor.ve.b.a */
public abstract class AbstractC59830a {

    /* renamed from: a */
    protected final Context f148749a;

    /* renamed from: b */
    protected boolean f148750b;

    /* renamed from: c */
    protected MotionEvent f148751c;

    /* renamed from: d */
    protected MotionEvent f148752d;

    /* renamed from: e */
    protected float f148753e;

    /* renamed from: f */
    protected float f148754f;

    /* renamed from: g */
    protected long f148755g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo203639a(int i, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo203641b(int i, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo203638a() {
        MotionEvent motionEvent = this.f148751c;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.f148751c = null;
        }
        MotionEvent motionEvent2 = this.f148752d;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.f148752d = null;
        }
        this.f148750b = false;
    }

    public AbstractC59830a(Context context) {
        this.f148749a = context;
    }

    /* renamed from: a */
    public boolean mo203640a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (!this.f148750b) {
            mo203639a(action, motionEvent);
            return true;
        }
        mo203641b(action, motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo203642b(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.f148751c;
        MotionEvent motionEvent3 = this.f148752d;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
            this.f148752d = null;
        }
        this.f148752d = MotionEvent.obtain(motionEvent);
        this.f148755g = motionEvent.getEventTime() - motionEvent2.getEventTime();
        this.f148753e = motionEvent.getPressure(motionEvent.getActionIndex());
        this.f148754f = motionEvent2.getPressure(motionEvent2.getActionIndex());
    }
}
