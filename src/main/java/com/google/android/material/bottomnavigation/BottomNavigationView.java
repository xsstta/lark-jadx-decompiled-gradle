package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.C0303f;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.widget.C0427af;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.view.C0883ab;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C22358l;
import com.google.android.material.internal.C22365r;
import com.google.android.material.p988i.C22313c;
import com.google.android.material.p989j.C22375b;
import com.google.android.material.shape.C22394h;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.p992a.C22497a;
import com.larksuite.suite.R;

public class BottomNavigationView extends FrameLayout {

    /* renamed from: d */
    private static final int f54015d = 2131887302;

    /* renamed from: a */
    final BottomNavigationMenuView f54016a;

    /* renamed from: b */
    public AbstractC22169b f54017b;

    /* renamed from: c */
    public AbstractC22168a f54018c;

    /* renamed from: e */
    private final C0322f f54019e;

    /* renamed from: f */
    private final BottomNavigationPresenter f54020f;

    /* renamed from: g */
    private ColorStateList f54021g;

    /* renamed from: h */
    private MenuInflater f54022h;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    public interface AbstractC22168a {
        /* renamed from: a */
        void mo76697a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface AbstractC22169b {
        /* renamed from: a */
        boolean mo76698a(MenuItem menuItem);
    }

    public int getMaxItemCount() {
        return 5;
    }

    public ColorStateList getItemRippleColor() {
        return this.f54021g;
    }

    public Menu getMenu() {
        return this.f54019e;
    }

    public Drawable getItemBackground() {
        return this.f54016a.getItemBackground();
    }

    public int getItemBackgroundResource() {
        return this.f54016a.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f54016a.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f54016a.getIconTintList();
    }

    public int getItemTextAppearanceActive() {
        return this.f54016a.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f54016a.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f54016a.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f54016a.getLabelVisibilityMode();
    }

    public int getSelectedItemId() {
        return this.f54016a.getSelectedItemId();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C22394h.m81147a(this);
    }

    /* renamed from: a */
    private void m79937a() {
        C22365r.m81023a(this, new C22365r.AbstractC22370a() {
            /* class com.google.android.material.bottomnavigation.BottomNavigationView.C221662 */

            @Override // com.google.android.material.internal.C22365r.AbstractC22370a
            /* renamed from: a */
            public C0883ab mo76565a(View view, C0883ab abVar, C22365r.C22371b bVar) {
                bVar.f54801d += abVar.mo4647d();
                bVar.mo77877a(view);
                return abVar;
            }
        });
    }

    private MenuInflater getMenuInflater() {
        if (this.f54022h == null) {
            this.f54022h = new C0303f(getContext());
        }
        return this.f54022h;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f54025a = new Bundle();
        this.f54019e.mo1388a(savedState.f54025a);
        return savedState;
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.bottomnavigation.BottomNavigationView.SavedState.C221671 */

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
        Bundle f54025a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m79943a(Parcel parcel, ClassLoader classLoader) {
            this.f54025a = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f54025a);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m79943a(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public void setOnNavigationItemReselectedListener(AbstractC22168a aVar) {
        this.f54018c = aVar;
    }

    public void setOnNavigationItemSelectedListener(AbstractC22169b bVar) {
        this.f54017b = bVar;
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C22394h.m81148a(this, f);
    }

    public void setItemIconSize(int i) {
        this.f54016a.setItemIconSize(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f54016a.setIconTintList(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f54016a.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f54016a.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f54016a.setItemTextColor(colorStateList);
    }

    public void setItemBackground(Drawable drawable) {
        this.f54016a.setItemBackground(drawable);
        this.f54021g = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f54016a.setItemBackgroundRes(i);
        this.f54021g = null;
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    /* renamed from: a */
    private MaterialShapeDrawable m79936a(Context context) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            materialShapeDrawable.mo77973g(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        materialShapeDrawable.mo77965a(context);
        return materialShapeDrawable;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo4902a());
        this.f54019e.mo1409b(savedState.f54025a);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f54016a.mo76621a() != z) {
            this.f54016a.setItemHorizontalTranslationEnabled(z);
            this.f54020f.mo1243a(false);
        }
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f54016a.getLabelVisibilityMode() != i) {
            this.f54016a.setLabelVisibilityMode(i);
            this.f54020f.mo1243a(false);
        }
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f54019e.findItem(i);
        if (findItem != null && !this.f54019e.mo1397a(findItem, this.f54020f, 0)) {
            findItem.setChecked(true);
        }
    }

    /* renamed from: b */
    private void m79938b(Context context) {
        View view = new View(context);
        view.setBackgroundColor(ContextCompat.getColor(context, R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    /* renamed from: a */
    public void mo76660a(int i) {
        this.f54020f.mo76653b(true);
        getMenuInflater().inflate(i, this.f54019e);
        this.f54020f.mo76653b(false);
        this.f54020f.mo1243a(true);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f54021g != colorStateList) {
            this.f54021g = colorStateList;
            if (colorStateList == null) {
                this.f54016a.setItemBackground(null);
                return;
            }
            ColorStateList a = C22375b.m81038a(colorStateList);
            if (Build.VERSION.SDK_INT >= 21) {
                this.f54016a.setItemBackground(new RippleDrawable(a, null, null));
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(1.0E-5f);
            Drawable g = C0774a.m3779g(gradientDrawable);
            C0774a.m3768a(g, a);
            this.f54016a.setItemBackground(g);
        } else if (colorStateList == null && this.f54016a.getItemBackground() != null) {
            this.f54016a.setItemBackground(null);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(C22497a.m81662a(context, attributeSet, i, f54015d), attributeSet, i);
        BottomNavigationPresenter bottomNavigationPresenter = new BottomNavigationPresenter();
        this.f54020f = bottomNavigationPresenter;
        Context context2 = getContext();
        C0322f aVar = new C22170a(context2);
        this.f54019e = aVar;
        BottomNavigationMenuView bottomNavigationMenuView = new BottomNavigationMenuView(context2);
        this.f54016a = bottomNavigationMenuView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        bottomNavigationMenuView.setLayoutParams(layoutParams);
        bottomNavigationPresenter.mo76652a(bottomNavigationMenuView);
        bottomNavigationPresenter.mo76651a(1);
        bottomNavigationMenuView.setPresenter(bottomNavigationPresenter);
        aVar.mo1392a(bottomNavigationPresenter);
        bottomNavigationPresenter.mo1345a(getContext(), aVar);
        C0427af b = C22358l.m81004b(context2, attributeSet, new int[]{R.attr.backgroundTint, R.attr.elevation, R.attr.itemBackground, R.attr.itemHorizontalTranslationEnabled, R.attr.itemIconSize, R.attr.itemIconTint, R.attr.itemRippleColor, R.attr.itemTextAppearanceActive, R.attr.itemTextAppearanceInactive, R.attr.itemTextColor, R.attr.labelVisibilityMode, R.attr.menu}, i, f54015d, 8, 7);
        if (b.mo2492g(5)) {
            bottomNavigationMenuView.setIconTintList(b.mo2488e(5));
        } else {
            bottomNavigationMenuView.setIconTintList(bottomNavigationMenuView.mo76620a(16842808));
        }
        setItemIconSize(b.mo2487e(4, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_icon_size)));
        if (b.mo2492g(8)) {
            setItemTextAppearanceInactive(b.mo2491g(8, 0));
        }
        if (b.mo2492g(7)) {
            setItemTextAppearanceActive(b.mo2491g(7, 0));
        }
        if (b.mo2492g(9)) {
            setItemTextColor(b.mo2488e(9));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            ViewCompat.m4039a(this, m79936a(context2));
        }
        if (b.mo2492g(1)) {
            ViewCompat.m4092k(this, (float) b.mo2487e(1, 0));
        }
        C0774a.m3768a(getBackground().mutate(), C22313c.m80796a(context2, b, 0));
        setLabelVisibilityMode(b.mo2483c(10, -1));
        setItemHorizontalTranslationEnabled(b.mo2478a(3, true));
        int g = b.mo2491g(2, 0);
        if (g != 0) {
            bottomNavigationMenuView.setItemBackgroundRes(g);
        } else {
            setItemRippleColor(C22313c.m80796a(context2, b, 6));
        }
        if (b.mo2492g(11)) {
            mo76660a(b.mo2491g(11, 0));
        }
        b.mo2482b();
        addView(bottomNavigationMenuView, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            m79938b(context2);
        }
        aVar.mo1390a(new C0322f.AbstractC0323a() {
            /* class com.google.android.material.bottomnavigation.BottomNavigationView.C221651 */

            @Override // androidx.appcompat.view.menu.C0322f.AbstractC0323a
            /* renamed from: a */
            public void mo836a(C0322f fVar) {
            }

            @Override // androidx.appcompat.view.menu.C0322f.AbstractC0323a
            /* renamed from: a */
            public boolean mo839a(C0322f fVar, MenuItem menuItem) {
                if (BottomNavigationView.this.f54018c != null && menuItem.getItemId() == BottomNavigationView.this.getSelectedItemId()) {
                    BottomNavigationView.this.f54018c.mo76697a(menuItem);
                    return true;
                } else if (BottomNavigationView.this.f54017b == null || BottomNavigationView.this.f54017b.mo76698a(menuItem)) {
                    return false;
                } else {
                    return true;
                }
            }
        });
        m79937a();
    }
}
