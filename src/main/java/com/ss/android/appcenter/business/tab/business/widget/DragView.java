package com.ss.android.appcenter.business.tab.business.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;

public class DragView extends ConstraintLayout {

    /* renamed from: a */
    private int f69856a;

    /* renamed from: b */
    private int f69857b;

    /* renamed from: c */
    private int f69858c;

    /* renamed from: d */
    private int f69859d;

    /* renamed from: e */
    private float f69860e;

    /* renamed from: f */
    private float f69861f;

    private double getMoveDistance() {
        return Math.sqrt(Math.pow((double) Math.abs(getTranslationX() - this.f69860e), 2.0d) + Math.pow((double) Math.abs(getTranslationY() - this.f69861f), 2.0d));
    }

    public DragView(Context context) {
        super(context);
        m102008a(context);
    }

    /* renamed from: a */
    private void m102008a(Context context) {
        this.f69858c = DeviceUtils.getScreenWidth(context);
        this.f69859d = DeviceUtils.getScreenHeight(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int rawX = ((int) motionEvent.getRawX()) - this.f69856a;
                    int rawY = ((int) motionEvent.getRawY()) - this.f69857b;
                    float translationX = getTranslationX() + ((float) rawX);
                    float translationY = getTranslationY() + ((float) rawY);
                    if (translationX < BitmapDescriptorFactory.HUE_RED) {
                        translationX = BitmapDescriptorFactory.HUE_RED;
                    } else if (translationX > ((float) (this.f69858c - getWidth()))) {
                        translationX = (float) (this.f69858c - getWidth());
                    }
                    if (translationY < BitmapDescriptorFactory.HUE_RED) {
                        translationY = BitmapDescriptorFactory.HUE_RED;
                    } else if (translationY > ((float) (this.f69859d - getHeight()))) {
                        translationY = (float) (this.f69859d - getHeight());
                    }
                    setTranslationX(translationX);
                    setTranslationY(translationY);
                    this.f69856a = (int) motionEvent.getRawX();
                    this.f69857b = (int) motionEvent.getRawY();
                }
            } else if (getMoveDistance() > ((double) UIUtils.dp2px(getContext(), 10.0f))) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        this.f69856a = (int) motionEvent.getRawX();
        this.f69857b = (int) motionEvent.getRawY();
        this.f69860e = getTranslationX();
        this.f69861f = getTranslationY();
        return super.onTouchEvent(motionEvent);
    }

    public DragView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m102008a(context);
    }

    public DragView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m102008a(context);
    }
}
