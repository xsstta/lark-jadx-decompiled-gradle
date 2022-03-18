package com.ss.android.lark.ui;

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
    private Drawable f141919a;

    /* renamed from: b */
    private ObjectAnimator f141920b;

    /* renamed from: a */
    private void m223592a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rotation", BitmapDescriptorFactory.HUE_RED, 360.0f);
        this.f141920b = ofFloat;
        ofFloat.setRepeatCount(-1);
        this.f141920b.setInterpolator(new LinearInterpolator());
        this.f141920b.setRepeatMode(1);
        this.f141920b.setDuration(1000L);
        this.f141920b.start();
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
        ObjectAnimator objectAnimator = this.f141920b;
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
    private void m223593a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.rotate_src});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f141919a = drawable;
        if (drawable == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f141919a = context.getDrawable(2131235424);
            } else {
                this.f141919a = context.getResources().getDrawable(2131235424);
            }
        }
        obtainStyledAttributes.recycle();
        setImageDrawable(this.f141919a);
        m223592a();
    }

    public RotateLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223593a(context, attributeSet);
    }
}
