package com.ss.android.vc.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class MediaButton extends AppCompatImageView {

    /* renamed from: a */
    private boolean f152073a = true;

    public void setIconImg(int i) {
        setImageResource(i);
    }

    public void setOn(boolean z) {
        this.f152073a = z;
    }

    public MediaButton(Context context) {
        super(context);
    }

    public MediaButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
