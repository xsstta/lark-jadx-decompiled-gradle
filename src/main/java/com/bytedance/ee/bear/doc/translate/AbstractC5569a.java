package com.bytedance.ee.bear.doc.translate;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.doc.translate.a */
public abstract class AbstractC5569a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    private int f15797a;

    /* renamed from: b */
    private float f15798b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22207a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo22208b();

    public AbstractC5569a(Context context) {
        this.f15797a = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f15798b = motionEvent.getY();
        return super.onDown(motionEvent);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            this.f15798b = motionEvent2.getY();
        }
        float y = this.f15798b - motionEvent2.getY();
        int i = this.f15797a;
        if (y < ((float) (-i))) {
            mo22207a();
        } else if (y > ((float) i)) {
            mo22208b();
        }
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }
}
