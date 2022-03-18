package com.ss.android.lark.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class PointRecoderRecyclerView extends CommonRecyclerView {

    /* renamed from: a */
    private AbstractC58964a f146112a;

    /* renamed from: com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView$a */
    public interface AbstractC58964a {
        void onTouchiew(float f, float f2);
    }

    public AbstractC58964a getTouchViewListener() {
        return this.f146112a;
    }

    public PointRecoderRecyclerView(Context context) {
        super(context);
    }

    public void setTouchViewListener(AbstractC58964a aVar) {
        this.f146112a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f146112a != null) {
            this.f146112a.onTouchiew(motionEvent.getRawX(), motionEvent.getRawY());
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public PointRecoderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PointRecoderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
