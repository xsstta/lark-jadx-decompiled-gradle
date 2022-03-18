package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.content.res.C0760e;

/* renamed from: androidx.appcompat.widget.af */
public class C0427af {

    /* renamed from: a */
    private final Context f1546a;

    /* renamed from: b */
    private final TypedArray f1547b;

    /* renamed from: c */
    private TypedValue f1548c;

    /* renamed from: a */
    public TypedArray mo2475a() {
        return this.f1547b;
    }

    /* renamed from: b */
    public void mo2482b() {
        this.f1547b.recycle();
    }

    /* renamed from: c */
    public CharSequence mo2484c(int i) {
        return this.f1547b.getText(i);
    }

    /* renamed from: d */
    public String mo2486d(int i) {
        return this.f1547b.getString(i);
    }

    /* renamed from: f */
    public CharSequence[] mo2490f(int i) {
        return this.f1547b.getTextArray(i);
    }

    /* renamed from: g */
    public boolean mo2492g(int i) {
        return this.f1547b.hasValue(i);
    }

    /* renamed from: b */
    public Drawable mo2481b(int i) {
        int resourceId;
        if (!this.f1547b.hasValue(i) || (resourceId = this.f1547b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0445f.m1910b().mo2588a(this.f1546a, resourceId, true);
    }

    /* renamed from: e */
    public ColorStateList mo2488e(int i) {
        int resourceId;
        ColorStateList a;
        if (!this.f1547b.hasValue(i) || (resourceId = this.f1547b.getResourceId(i, 0)) == 0 || (a = C0215a.m652a(this.f1546a, resourceId)) == null) {
            return this.f1547b.getColorStateList(i);
        }
        return a;
    }

    /* renamed from: a */
    public Drawable mo2477a(int i) {
        int resourceId;
        if (!this.f1547b.hasValue(i) || (resourceId = this.f1547b.getResourceId(i, 0)) == 0) {
            return this.f1547b.getDrawable(i);
        }
        return C0215a.m655b(this.f1546a, resourceId);
    }

    private C0427af(Context context, TypedArray typedArray) {
        this.f1546a = context;
        this.f1547b = typedArray;
    }

    /* renamed from: a */
    public float mo2473a(int i, float f) {
        return this.f1547b.getFloat(i, f);
    }

    /* renamed from: b */
    public float mo2479b(int i, float f) {
        return this.f1547b.getDimension(i, f);
    }

    /* renamed from: c */
    public int mo2483c(int i, int i2) {
        return this.f1547b.getInteger(i, i2);
    }

    /* renamed from: d */
    public int mo2485d(int i, int i2) {
        return this.f1547b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: e */
    public int mo2487e(int i, int i2) {
        return this.f1547b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: f */
    public int mo2489f(int i, int i2) {
        return this.f1547b.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public int mo2491g(int i, int i2) {
        return this.f1547b.getResourceId(i, i2);
    }

    /* renamed from: b */
    public int mo2480b(int i, int i2) {
        return this.f1547b.getColor(i, i2);
    }

    /* renamed from: a */
    public int mo2474a(int i, int i2) {
        return this.f1547b.getInt(i, i2);
    }

    /* renamed from: a */
    public boolean mo2478a(int i, boolean z) {
        return this.f1547b.getBoolean(i, z);
    }

    /* renamed from: a */
    public static C0427af m1776a(Context context, int i, int[] iArr) {
        return new C0427af(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0427af m1777a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0427af(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public Typeface mo2476a(int i, int i2, C0760e.AbstractC0761a aVar) {
        int resourceId = this.f1547b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1548c == null) {
            this.f1548c = new TypedValue();
        }
        return C0760e.m3679a(this.f1546a, resourceId, this.f1548c, i2, aVar);
    }

    /* renamed from: a */
    public static C0427af m1778a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0427af(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
