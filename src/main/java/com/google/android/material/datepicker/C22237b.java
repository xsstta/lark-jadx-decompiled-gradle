package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.p988i.C22312b;
import com.google.android.material.p988i.C22313c;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.datepicker.b */
final class C22237b {

    /* renamed from: a */
    final C22236a f54373a;

    /* renamed from: b */
    final C22236a f54374b;

    /* renamed from: c */
    final C22236a f54375c;

    /* renamed from: d */
    final C22236a f54376d;

    /* renamed from: e */
    final C22236a f54377e;

    /* renamed from: f */
    final C22236a f54378f;

    /* renamed from: g */
    final C22236a f54379g;

    /* renamed from: h */
    final Paint f54380h;

    C22237b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C22312b.m80789a(context, (int) R.attr.materialCalendarStyle, C22241f.class.getCanonicalName()), new int[]{16843277, R.attr.dayInvalidStyle, R.attr.daySelectedStyle, R.attr.dayStyle, R.attr.dayTodayStyle, R.attr.rangeFillColor, R.attr.yearSelectedStyle, R.attr.yearStyle, R.attr.yearTodayStyle});
        this.f54373a = C22236a.m80472a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f54379g = C22236a.m80472a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f54374b = C22236a.m80472a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f54375c = C22236a.m80472a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a = C22313c.m80795a(context, obtainStyledAttributes, 5);
        this.f54376d = C22236a.m80472a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f54377e = C22236a.m80472a(context, obtainStyledAttributes.getResourceId(6, 0));
        this.f54378f = C22236a.m80472a(context, obtainStyledAttributes.getResourceId(8, 0));
        Paint paint = new Paint();
        this.f54380h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
