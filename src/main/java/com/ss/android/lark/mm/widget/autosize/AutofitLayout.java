package com.ss.android.lark.mm.widget.autosize;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.WeakHashMap;

public class AutofitLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f118761a;

    /* renamed from: b */
    private float f118762b;

    /* renamed from: c */
    private float f118763c;

    /* renamed from: d */
    private WeakHashMap<View, C47138a> f118764d = new WeakHashMap<>();

    public AutofitLayout(Context context) {
        super(context);
        m186663a(context, null, 0);
    }

    public AutofitLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m186663a(context, attributeSet, 0);
    }

    public AutofitLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m186663a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m186663a(Context context, AttributeSet attributeSet, int i) {
        boolean z = true;
        int i2 = -1;
        float f = -1.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.minTextSize, R.attr.precision, R.attr.sizeToFit}, i, 0);
            boolean z2 = obtainStyledAttributes.getBoolean(2, true);
            i2 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            f = obtainStyledAttributes.getFloat(1, -1.0f);
            obtainStyledAttributes.recycle();
            z = z2;
        }
        this.f118761a = z;
        this.f118762b = (float) i2;
        this.f118763c = f;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        TextView textView = (TextView) view;
        C47138a a = C47138a.m186668a(textView).mo165644a(this.f118761a);
        float f = this.f118763c;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            a.mo165640a(f);
        }
        float f2 = this.f118762b;
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            a.mo165642a(0, f2);
        }
        this.f118764d.put(textView, a);
    }
}
