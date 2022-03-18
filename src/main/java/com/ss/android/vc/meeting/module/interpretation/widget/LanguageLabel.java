package com.ss.android.vc.meeting.module.interpretation.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;

public class LanguageLabel extends TextView {
    /* renamed from: a */
    private void m242182a() {
        m242183b();
        setTextSize(1, 11.0f);
        setTextColor(C60773o.m236126d(R.color.static_white));
        setGravity(17);
    }

    /* renamed from: b */
    private void m242183b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(C60773o.m236126d(R.color.icon_n3));
        setBackground(gradientDrawable);
    }

    public void setLanguage(String str) {
        setText(str);
    }

    public LanguageLabel(Context context) {
        super(context);
        m242182a();
    }

    public void setLanguageBackgroundColor(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        setBackground(gradientDrawable);
    }

    public LanguageLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m242182a();
    }

    public LanguageLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m242182a();
    }
}
