package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.view.C0303f;
import androidx.appcompat.view.menu.C0326h;
import androidx.appcompat.widget.C0427af;
import androidx.core.content.ContextCompat;
import androidx.core.view.C0883ab;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C22330b;
import com.google.android.material.internal.C22333e;
import com.google.android.material.internal.C22334f;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.p988i.C22313c;
import com.google.android.material.shape.C22394h;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.larksuite.suite.R;

public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: f */
    private static final int[] f54844f = {16842912};

    /* renamed from: g */
    private static final int[] f54845g = {-16842910};

    /* renamed from: h */
    private static final int f54846h = 2131887306;

    /* renamed from: c */
    public final C22334f f54847c;

    /* renamed from: d */
    AbstractC22383a f54848d;

    /* renamed from: e */
    public final int[] f54849e;

    /* renamed from: i */
    private final C22333e f54850i;

    /* renamed from: j */
    private final int f54851j;

    /* renamed from: k */
    private MenuInflater f54852k;

    /* renamed from: l */
    private ViewTreeObserver.OnGlobalLayoutListener f54853l;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    public interface AbstractC22383a {
        /* renamed from: a */
        boolean mo77941a(MenuItem menuItem);
    }

    public Menu getMenu() {
        return this.f54850i;
    }

    public MenuItem getCheckedItem() {
        return this.f54847c.mo77818d();
    }

    public int getHeaderCount() {
        return this.f54847c.mo77820e();
    }

    public Drawable getItemBackground() {
        return this.f54847c.mo77826h();
    }

    public int getItemHorizontalPadding() {
        return this.f54847c.mo77828i();
    }

    public int getItemIconPadding() {
        return this.f54847c.mo77829j();
    }

    public ColorStateList getItemIconTintList() {
        return this.f54847c.mo77822f();
    }

    public int getItemMaxLines() {
        return this.f54847c.mo77830k();
    }

    public ColorStateList getItemTextColor() {
        return this.f54847c.mo77824g();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C22394h.m81147a(this);
    }

    /* renamed from: a */
    private void m81062a() {
        this.f54853l = new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.google.android.material.navigation.NavigationView.ViewTreeObserver$OnGlobalLayoutListenerC223812 */

            public void onGlobalLayout() {
                boolean z;
                boolean z2;
                boolean z3;
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.f54849e);
                boolean z4 = true;
                if (NavigationView.this.f54849e[1] == 0) {
                    z = true;
                } else {
                    z = false;
                }
                NavigationView.this.f54847c.mo77817c(z);
                NavigationView.this.setDrawTopInsetForeground(z);
                Activity a = C22330b.m80910a(NavigationView.this.getContext());
                if (a != null && Build.VERSION.SDK_INT >= 21) {
                    if (a.findViewById(16908290).getHeight() == NavigationView.this.getHeight()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (Color.alpha(a.getWindow().getNavigationBarColor()) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    NavigationView navigationView2 = NavigationView.this;
                    if (!z2 || !z3) {
                        z4 = false;
                    }
                    navigationView2.setDrawBottomInsetForeground(z4);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.f54853l);
    }

    private MenuInflater getMenuInflater() {
        if (this.f54852k == null) {
            this.f54852k = new C0303f(getContext());
        }
        return this.f54852k;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.f54853l);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f54853l);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f54856a = new Bundle();
        this.f54850i.mo1388a(savedState.f54856a);
        return savedState;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.navigation.NavigationView.SavedState.C223821 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        public Bundle f54856a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f54856a = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f54856a);
        }
    }

    public void setNavigationItemSelectedListener(AbstractC22383a aVar) {
        this.f54848d = aVar;
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    /* renamed from: a */
    public void mo77760a(C0883ab abVar) {
        this.f54847c.mo77812a(abVar);
    }

    /* renamed from: b */
    public View mo77905b(int i) {
        return this.f54847c.mo77813b(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f54847c.mo77809a(drawable);
    }

    public void setItemHorizontalPadding(int i) {
        this.f54847c.mo77819d(i);
    }

    public void setItemIconPadding(int i) {
        this.f54847c.mo77821e(i);
    }

    public void setItemIconSize(int i) {
        this.f54847c.mo77825g(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f54847c.mo77808a(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f54847c.mo77823f(i);
    }

    public void setItemTextAppearance(int i) {
        this.f54847c.mo77816c(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f54847c.mo77814b(colorStateList);
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f54850i.findItem(i);
        if (findItem != null) {
            this.f54847c.mo77811a((C0326h) findItem);
        }
    }

    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C22394h.m81148a(this, f);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f54847c.mo77819d(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPaddingResource(int i) {
        this.f54847c.mo77821e(getResources().getDimensionPixelSize(i));
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C22334f fVar = this.f54847c;
        if (fVar != null) {
            fVar.mo77827h(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo4902a());
        this.f54850i.mo1409b(savedState.f54856a);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f54850i.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f54847c.mo77811a((C0326h) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    /* renamed from: a */
    private boolean m81063a(C0427af afVar) {
        if (afVar.mo2492g(11) || afVar.mo2492g(12)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final Drawable m81064b(C0427af afVar) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(C22398l.m81157a(getContext(), afVar.mo2491g(11, 0), afVar.mo2491g(12, 0)).mo78024a());
        materialShapeDrawable.mo77973g(C22313c.m80796a(getContext(), afVar, 13));
        return new InsetDrawable((Drawable) materialShapeDrawable, afVar.mo2487e(16, 0), afVar.mo2487e(17, 0), afVar.mo2487e(15, 0), afVar.mo2487e(14, 0));
    }

    /* renamed from: c */
    private ColorStateList m81065c(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C0215a.m652a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        int[] iArr = f54845g;
        return new ColorStateList(new int[][]{iArr, f54844f, EMPTY_STATE_SET}, new int[]{a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: a */
    public void mo77904a(int i) {
        this.f54847c.mo77815b(true);
        getMenuInflater().inflate(i, this.f54850i);
        this.f54847c.mo77815b(false);
        this.f54847c.mo1243a(false);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationViewStyle);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f54851j), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f54851j, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
        // Method dump skipped, instructions count: 390
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
