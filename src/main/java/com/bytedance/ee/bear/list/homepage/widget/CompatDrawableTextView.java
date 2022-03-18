package com.bytedance.ee.bear.list.homepage.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.suite.R;

public class CompatDrawableTextView extends AppCompatTextView {
    public CompatDrawableTextView(Context context) {
        this(context, null);
    }

    public CompatDrawableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m35274a(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableStartCompat, R.attr.drawableTopCompat});
            Drawable drawable7 = null;
            if (Build.VERSION.SDK_INT >= 21) {
                drawable = obtainStyledAttributes.getDrawable(2);
                drawable3 = obtainStyledAttributes.getDrawable(1);
                drawable2 = obtainStyledAttributes.getDrawable(0);
                drawable7 = obtainStyledAttributes.getDrawable(3);
            } else {
                int resourceId = obtainStyledAttributes.getResourceId(2, -1);
                int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
                int resourceId3 = obtainStyledAttributes.getResourceId(0, -1);
                int resourceId4 = obtainStyledAttributes.getResourceId(3, -1);
                if (resourceId != -1) {
                    drawable4 = C0215a.m655b(context, resourceId);
                } else {
                    drawable4 = null;
                }
                if (resourceId2 != -1) {
                    drawable5 = C0215a.m655b(context, resourceId2);
                } else {
                    drawable5 = null;
                }
                if (resourceId3 != -1) {
                    drawable6 = C0215a.m655b(context, resourceId3);
                } else {
                    drawable6 = null;
                }
                if (resourceId4 != -1) {
                    drawable7 = C0215a.m655b(context, resourceId4);
                }
                drawable = drawable4;
                drawable2 = drawable6;
                drawable3 = drawable5;
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable7, drawable3, drawable2);
            obtainStyledAttributes.recycle();
        }
    }

    public CompatDrawableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m35274a(context, attributeSet);
    }
}
