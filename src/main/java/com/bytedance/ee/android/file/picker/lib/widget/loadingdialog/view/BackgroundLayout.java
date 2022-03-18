package com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.ee.android.file.picker.lib.utils.UIHelper;
import com.larksuite.suite.R;

public class BackgroundLayout extends LinearLayout {

    /* renamed from: a */
    private float f12569a;

    /* renamed from: b */
    private int f12570b;

    /* renamed from: a */
    private void m17236a() {
        m17237a(getContext().getResources().getColor(R.color.file_picker_loading_dialog_default_color), this.f12569a);
    }

    public BackgroundLayout(Context context) {
        super(context);
        m17236a();
    }

    public void setBaseColor(int i) {
        this.f12570b = i;
        m17237a(i, this.f12569a);
    }

    public void setCornerRadius(float f) {
        float a = (float) UIHelper.f12487a.mo16121a(getContext(), f);
        this.f12569a = a;
        m17237a(this.f12570b, a);
    }

    public BackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17236a();
    }

    /* renamed from: a */
    private void m17237a(int i, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(f);
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(gradientDrawable);
        } else {
            setBackgroundDrawable(gradientDrawable);
        }
    }

    public BackgroundLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17236a();
    }
}
