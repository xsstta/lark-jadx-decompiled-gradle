package com.ss.android.lark.widget.photo_picker.gallery.function;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.a */
public class C58751a {

    /* renamed from: a */
    public BottomFuncPanel f145214a;

    /* renamed from: b */
    private Context f145215b;

    /* renamed from: c */
    private ValueAnimator f145216c;

    /* renamed from: d */
    private ValueAnimator f145217d;

    /* renamed from: e */
    private boolean f145218e = true;

    /* renamed from: f */
    private boolean f145219f = true;

    /* renamed from: g */
    private int[] f145220g = new int[2];

    /* renamed from: a */
    public void mo199170a() {
        this.f145218e = false;
        this.f145214a.setVisibility(8);
    }

    /* renamed from: b */
    public void mo199174b() {
        if (this.f145218e && !this.f145217d.isRunning()) {
            this.f145216c.cancel();
            this.f145217d.start();
        }
    }

    /* renamed from: c */
    private void m227936c() {
        this.f145216c = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(300L);
        this.f145217d = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(300L);
        this.f145216c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.C58751a.C587521 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C58751a.this.f145214a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f145217d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.C58751a.C587532 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C58751a.this.f145214a.setAlpha(floatValue);
                if (floatValue == BitmapDescriptorFactory.HUE_RED) {
                    C58751a.this.f145214a.setVisibility(4);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo199173a(boolean z) {
        this.f145219f = z;
    }

    /* renamed from: a */
    public void mo199171a(MotionEvent motionEvent) {
        int i;
        if (this.f145218e) {
            this.f145214a.mo199164a(motionEvent);
            if (!this.f145216c.isRunning() && this.f145214a.getVisibility() != 0) {
                BottomFuncPanel bottomFuncPanel = this.f145214a;
                if (this.f145219f) {
                    i = 0;
                } else {
                    i = 4;
                }
                bottomFuncPanel.setVisibility(i);
                this.f145214a.setAlpha(BitmapDescriptorFactory.HUE_RED);
                this.f145217d.cancel();
                this.f145216c.start();
            }
        }
    }

    public C58751a(Context context, BottomFuncPanel bottomFuncPanel) {
        this.f145214a = bottomFuncPanel;
        this.f145215b = context;
        m227936c();
    }

    /* renamed from: a */
    public void mo199172a(MotionEvent motionEvent, boolean z) {
        this.f145214a.getLocationInWindow(this.f145220g);
        if (motionEvent.getY() >= ((float) (this.f145214a.getTop() - UIUtils.dp2px(this.f145215b, 50.0f)))) {
            mo199171a(motionEvent);
        } else if (z) {
            mo199174b();
        }
    }
}
