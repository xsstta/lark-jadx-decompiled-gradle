package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.C22365r;
import com.google.android.material.p982c.C22197a;
import com.google.android.material.p985f.C22270a;
import com.larksuite.suite.R;

public class SwitchMaterial extends SwitchCompat {

    /* renamed from: c */
    private static final int f55107c = 2131887361;

    /* renamed from: d */
    private static final int[][] f55108d = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    private final C22270a f55109e;

    /* renamed from: f */
    private ColorStateList f55110f;

    /* renamed from: g */
    private ColorStateList f55111g;

    /* renamed from: h */
    private boolean f55112h;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f55112h && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f55112h && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f55110f == null) {
            int a = C22197a.m80102a(this, (int) R.attr.colorSurface);
            int a2 = C22197a.m80102a(this, (int) R.attr.colorControlActivated);
            float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
            if (this.f55109e.mo77447a()) {
                dimension += C22365r.m81027d(this);
            }
            int a3 = this.f55109e.mo77446a(a, dimension);
            int[][] iArr = f55108d;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C22197a.m80099a(a, a2, 1.0f);
            iArr2[1] = a3;
            iArr2[2] = C22197a.m80099a(a, a2, 0.38f);
            iArr2[3] = a3;
            this.f55110f = new ColorStateList(iArr, iArr2);
        }
        return this.f55110f;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f55111g == null) {
            int[][] iArr = f55108d;
            int[] iArr2 = new int[iArr.length];
            int a = C22197a.m80102a(this, (int) R.attr.colorSurface);
            int a2 = C22197a.m80102a(this, (int) R.attr.colorControlActivated);
            int a3 = C22197a.m80102a(this, (int) R.attr.colorOnSurface);
            iArr2[0] = C22197a.m80099a(a, a2, 0.54f);
            iArr2[1] = C22197a.m80099a(a, a3, 0.32f);
            iArr2[2] = C22197a.m80099a(a, a2, 0.12f);
            iArr2[3] = C22197a.m80099a(a, a3, 0.12f);
            this.f55111g = new ColorStateList(iArr, iArr2);
        }
        return this.f55111g;
    }

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f55112h = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList(null);
        setTrackTintList(null);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchMaterial(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.switchmaterial.SwitchMaterial.f55107c
            android.content.Context r8 = com.google.android.material.theme.p992a.C22497a.m81662a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r0 = r7.getContext()
            com.google.android.material.f.a r8 = new com.google.android.material.f.a
            r8.<init>(r0)
            r7.f55109e = r8
            r8 = 1
            int[] r2 = new int[r8]
            r8 = 2130970751(0x7f04087f, float:1.755022E38)
            r6 = 0
            r2[r6] = r8
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r8 = com.google.android.material.internal.C22358l.m80999a(r0, r1, r2, r3, r4, r5)
            boolean r9 = r8.getBoolean(r6, r6)
            r7.f55112h = r9
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
