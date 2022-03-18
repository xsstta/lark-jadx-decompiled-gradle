package com.ss.android.lark.calendar.impl.features.settings.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.RoundRectDrawable;

/* renamed from: com.ss.android.lark.calendar.impl.features.settings.widget.a */
public class C32477a extends FrameLayout {

    /* renamed from: a */
    View f83263a;

    /* renamed from: b */
    View f83264b;

    public C32477a(Context context) {
        super(context);
        m123977a(context);
    }

    /* renamed from: a */
    public C32477a mo118618a(boolean z) {
        int i;
        View view = this.f83264b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        return this;
    }

    /* renamed from: a */
    private void m123977a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.calendar_view_color_select_item, this);
        this.f83263a = findViewById(R.id.color_block);
        this.f83264b = findViewById(R.id.color_select);
    }

    /* renamed from: a */
    public C32477a mo118617a(int i) {
        int a = (int) UDDimenUtils.m93308a(getContext(), 4);
        this.f83263a.setBackground(new RoundRectDrawable(i, a, a, a, a, false));
        return this;
    }
}
