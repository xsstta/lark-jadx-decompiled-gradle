package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.util.C0845f;
import androidx.core.view.ViewCompat;
import com.google.android.material.p988i.C22313c;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.datepicker.a */
final class C22236a {

    /* renamed from: a */
    private final Rect f54367a;

    /* renamed from: b */
    private final ColorStateList f54368b;

    /* renamed from: c */
    private final ColorStateList f54369c;

    /* renamed from: d */
    private final ColorStateList f54370d;

    /* renamed from: e */
    private final int f54371e;

    /* renamed from: f */
    private final C22398l f54372f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo77391a() {
        return this.f54367a.top;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo77393b() {
        return this.f54367a.bottom;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77392a(TextView textView) {
        Drawable drawable;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        materialShapeDrawable.setShapeAppearanceModel(this.f54372f);
        materialShapeDrawable2.setShapeAppearanceModel(this.f54372f);
        materialShapeDrawable.mo77973g(this.f54369c);
        materialShapeDrawable.mo77963a((float) this.f54371e, this.f54370d);
        textView.setTextColor(this.f54368b);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable = new RippleDrawable(this.f54368b.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        } else {
            drawable = materialShapeDrawable;
        }
        ViewCompat.m4039a(textView, new InsetDrawable(drawable, this.f54367a.left, this.f54367a.top, this.f54367a.right, this.f54367a.bottom));
    }

    /* renamed from: a */
    static C22236a m80472a(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C0845f.m3994a(z, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{16843191, 16843192, 16843193, 16843194, R.attr.itemFillColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemStrokeColor, R.attr.itemStrokeWidth, R.attr.itemTextColor});
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a = C22313c.m80795a(context, obtainStyledAttributes, 4);
        ColorStateList a2 = C22313c.m80795a(context, obtainStyledAttributes, 9);
        ColorStateList a3 = C22313c.m80795a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        C22398l a4 = C22398l.m81157a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).mo78024a();
        obtainStyledAttributes.recycle();
        return new C22236a(a, a2, a3, dimensionPixelSize, a4, rect);
    }

    private C22236a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C22398l lVar, Rect rect) {
        C0845f.m3989a(rect.left);
        C0845f.m3989a(rect.top);
        C0845f.m3989a(rect.right);
        C0845f.m3989a(rect.bottom);
        this.f54367a = rect;
        this.f54368b = colorStateList2;
        this.f54369c = colorStateList;
        this.f54370d = colorStateList3;
        this.f54371e = i;
        this.f54372f = lVar;
    }
}
