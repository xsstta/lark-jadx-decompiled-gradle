package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.C0940c;
import com.google.android.material.p982c.C22197a;
import com.larksuite.suite.R;

public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: a */
    private static final int f54186a = 2131887359;

    /* renamed from: b */
    private static final int[][] f54187b = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: c */
    private ColorStateList f54188c;

    /* renamed from: d */
    private boolean f54189d;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f54189d && C0940c.m4545a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f54188c == null) {
            int[][] iArr = f54187b;
            int[] iArr2 = new int[iArr.length];
            int a = C22197a.m80102a(this, (int) R.attr.colorControlActivated);
            int a2 = C22197a.m80102a(this, (int) R.attr.colorSurface);
            int a3 = C22197a.m80102a(this, (int) R.attr.colorOnSurface);
            iArr2[0] = C22197a.m80099a(a2, a, 1.0f);
            iArr2[1] = C22197a.m80099a(a2, a3, 0.54f);
            iArr2[2] = C22197a.m80099a(a2, a3, 0.38f);
            iArr2[3] = C22197a.m80099a(a2, a3, 0.38f);
            this.f54188c = new ColorStateList(iArr, iArr2);
        }
        return this.f54188c;
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f54189d = z;
        if (z) {
            C0940c.m4546a(this, getMaterialThemeColorsTintList());
        } else {
            C0940c.m4546a(this, (ColorStateList) null);
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.checkbox.MaterialCheckBox.f54186a
            android.content.Context r8 = com.google.android.material.theme.p992a.C22497a.m81662a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            r0 = 2
            int[] r2 = new int[r0]
            r2 = {x0036: FILL_ARRAY_DATA  , data: [2130968815, 2130970751} // fill-array
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C22358l.m80999a(r0, r1, r2, r3, r4, r5)
            boolean r10 = r9.hasValue(r6)
            if (r10 == 0) goto L_0x002a
            android.content.res.ColorStateList r8 = com.google.android.material.p988i.C22313c.m80795a(r8, r9, r6)
            androidx.core.widget.C0940c.m4546a(r7, r8)
        L_0x002a:
            r8 = 1
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f54189d = r8
            r9.recycle()
            return
            fill-array 0x0036: FILL_ARRAY_DATA  , data: [2130968815, 2130970751]
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
