package com.bytedance.ee.bear.widgets;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class RotateLoadingView extends AppCompatImageView {

    /* renamed from: a */
    private Drawable f31786a;

    /* renamed from: b */
    private ObjectAnimator f31787b;

    /* renamed from: a */
    private void m48972a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rotation", BitmapDescriptorFactory.HUE_RED, 360.0f);
        this.f31787b = ofFloat;
        ofFloat.setRepeatCount(-1);
        this.f31787b.setInterpolator(new LinearInterpolator());
        this.f31787b.setRepeatMode(1);
        this.f31787b.setDuration(1000L);
        this.f31787b.start();
    }

    public RotateLoadingView(Context context) {
        this(context, null);
    }

    public RotateLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        ObjectAnimator objectAnimator = this.f31787b;
        if (objectAnimator == null) {
            return;
        }
        if (i == 0) {
            objectAnimator.start();
        } else {
            objectAnimator.end();
        }
    }

    /* renamed from: a */
    private void m48973a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.rotate_src});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f31786a = drawable;
        if (drawable == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f31786a = context.getDrawable(2131235424);
            } else {
                this.f31786a = context.getResources().getDrawable(2131235424);
            }
        }
        obtainStyledAttributes.recycle();
        setImageDrawable(this.f31786a);
        m48972a();
    }

    public RotateLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m48973a(context, attributeSet);
    }
}
