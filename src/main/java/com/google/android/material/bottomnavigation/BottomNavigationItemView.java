package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0339m;
import androidx.appcompat.view.menu.C0326h;
import androidx.appcompat.widget.C0431ah;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.view.C0914p;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C22143a;
import com.larksuite.suite.R;

public class BottomNavigationItemView extends FrameLayout implements AbstractC0339m.AbstractC0340a {

    /* renamed from: b */
    private static final int[] f53964b = {16842912};

    /* renamed from: a */
    public ImageView f53965a;

    /* renamed from: c */
    private final int f53966c;

    /* renamed from: d */
    private float f53967d;

    /* renamed from: e */
    private float f53968e;

    /* renamed from: f */
    private float f53969f;

    /* renamed from: g */
    private int f53970g;

    /* renamed from: h */
    private boolean f53971h;

    /* renamed from: i */
    private final TextView f53972i;

    /* renamed from: j */
    private final TextView f53973j;

    /* renamed from: k */
    private int f53974k;

    /* renamed from: l */
    private C0326h f53975l;

    /* renamed from: m */
    private ColorStateList f53976m;

    /* renamed from: n */
    private Drawable f53977n;

    /* renamed from: o */
    private Drawable f53978o;

    /* renamed from: p */
    private BadgeDrawable f53979p;

    @Override // androidx.appcompat.view.menu.AbstractC0339m.AbstractC0340a
    /* renamed from: a */
    public boolean mo1215a() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public BadgeDrawable getBadge() {
        return this.f53979p;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0339m.AbstractC0340a
    public C0326h getItemData() {
        return this.f53975l;
    }

    public int getItemPosition() {
        return this.f53974k;
    }

    /* renamed from: c */
    private boolean m79906c() {
        if (this.f53979p != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo76598b() {
        m79905c(this.f53965a);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setItemPosition(int i) {
        this.f53974k = i;
    }

    public BottomNavigationItemView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: package-private */
    public void setBadge(BadgeDrawable badgeDrawable) {
        this.f53979p = badgeDrawable;
        ImageView imageView = this.f53965a;
        if (imageView != null) {
            m79904b(imageView);
        }
    }

    public void setItemBackground(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = ContextCompat.getDrawable(getContext(), i);
        }
        setItemBackground(drawable);
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f53972i.setTextColor(colorStateList);
            this.f53973j.setTextColor(colorStateList);
        }
    }

    /* renamed from: b */
    private void m79904b(View view) {
        if (m79906c() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C22143a.m79829a(this.f53979p, view, m79907d(view));
        }
    }

    /* renamed from: c */
    private void m79905c(View view) {
        if (m79906c()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C22143a.m79830b(this.f53979p, view, m79907d(view));
            }
            this.f53979p = null;
        }
    }

    /* renamed from: d */
    private FrameLayout m79907d(View view) {
        if (view != this.f53965a || !C22143a.f53895a) {
            return null;
        }
        return (FrameLayout) this.f53965a.getParent();
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0326h hVar = this.f53975l;
        if (hVar != null && hVar.isCheckable() && this.f53975l.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f53964b);
        }
        return onCreateDrawableState;
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f53965a.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f53965a.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f53976m = colorStateList;
        if (this.f53975l != null && (drawable = this.f53978o) != null) {
            C0774a.m3768a(drawable, colorStateList);
            this.f53978o.invalidateSelf();
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        ViewCompat.m4039a(this, drawable);
    }

    public void setLabelVisibilityMode(int i) {
        boolean z;
        if (this.f53970g != i) {
            this.f53970g = i;
            C0326h hVar = this.f53975l;
            if (hVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        boolean z2;
        if (this.f53971h != z) {
            this.f53971h = z;
            C0326h hVar = this.f53975l;
            if (hVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        TextViewCompat.m4490a(this.f53973j, i);
        m79901a(this.f53972i.getTextSize(), this.f53973j.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        TextViewCompat.m4490a(this.f53972i, i);
        m79901a(this.f53972i.getTextSize(), this.f53973j.getTextSize());
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f53972i.setEnabled(z);
        this.f53973j.setEnabled(z);
        this.f53965a.setEnabled(z);
        if (z) {
            ViewCompat.m4045a(this, C0914p.m4401a(getContext(), 1002));
        } else {
            ViewCompat.m4045a(this, (C0914p) null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.f53977n) {
            this.f53977n = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0774a.m3779g(drawable).mutate();
                this.f53978o = drawable;
                ColorStateList colorStateList = this.f53976m;
                if (colorStateList != null) {
                    C0774a.m3768a(drawable, colorStateList);
                }
            }
            this.f53965a.setImageDrawable(drawable);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f53972i.setText(charSequence);
        this.f53973j.setText(charSequence);
        C0326h hVar = this.f53975l;
        if (hVar == null || TextUtils.isEmpty(hVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0326h hVar2 = this.f53975l;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.getTooltipText())) {
            charSequence = this.f53975l.getTooltipText();
        }
        C0431ah.m1845a(this, charSequence);
    }

    /* renamed from: a */
    public void mo76597a(View view) {
        if (m79906c()) {
            C22143a.m79831c(this.f53979p, view, m79907d(view));
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f53979p;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.f53975l.getTitle();
            if (!TextUtils.isEmpty(this.f53975l.getContentDescription())) {
                title = this.f53975l.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f53979p.mo76498f()));
        }
        C0864d a = C0864d.m4171a(accessibilityNodeInfo);
        a.mo4567b(C0864d.C0867c.m4258a(0, 1, getItemPosition(), 1, false, isSelected()));
        if (isSelected()) {
            a.mo4592h(false);
            a.mo4569b(C0864d.C0865a.f3373e);
        }
        a.mo4595i(getResources().getString(R.string.item_view_role_description));
    }

    public void setChecked(boolean z) {
        TextView textView = this.f53973j;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f53973j;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f53972i;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f53972i;
        textView4.setPivotY((float) textView4.getBaseline());
        int i = this.f53970g;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m79903a(this.f53965a, this.f53966c, 49);
                    m79902a(this.f53973j, 1.0f, 1.0f, 0);
                } else {
                    m79903a(this.f53965a, this.f53966c, 17);
                    m79902a(this.f53973j, 0.5f, 0.5f, 4);
                }
                this.f53972i.setVisibility(4);
            } else if (i != 1) {
                if (i == 2) {
                    m79903a(this.f53965a, this.f53966c, 17);
                    this.f53973j.setVisibility(8);
                    this.f53972i.setVisibility(8);
                }
            } else if (z) {
                m79903a(this.f53965a, (int) (((float) this.f53966c) + this.f53967d), 49);
                m79902a(this.f53973j, 1.0f, 1.0f, 0);
                TextView textView5 = this.f53972i;
                float f = this.f53968e;
                m79902a(textView5, f, f, 4);
            } else {
                m79903a(this.f53965a, this.f53966c, 49);
                TextView textView6 = this.f53973j;
                float f2 = this.f53969f;
                m79902a(textView6, f2, f2, 4);
                m79902a(this.f53972i, 1.0f, 1.0f, 0);
            }
        } else if (this.f53971h) {
            if (z) {
                m79903a(this.f53965a, this.f53966c, 49);
                m79902a(this.f53973j, 1.0f, 1.0f, 0);
            } else {
                m79903a(this.f53965a, this.f53966c, 17);
                m79902a(this.f53973j, 0.5f, 0.5f, 4);
            }
            this.f53972i.setVisibility(4);
        } else if (z) {
            m79903a(this.f53965a, (int) (((float) this.f53966c) + this.f53967d), 49);
            m79902a(this.f53973j, 1.0f, 1.0f, 0);
            TextView textView7 = this.f53972i;
            float f3 = this.f53968e;
            m79902a(textView7, f3, f3, 4);
        } else {
            m79903a(this.f53965a, this.f53966c, 49);
            TextView textView8 = this.f53973j;
            float f4 = this.f53969f;
            m79902a(textView8, f4, f4, 4);
            m79902a(this.f53972i, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m79901a(float f, float f2) {
        this.f53967d = f - f2;
        this.f53968e = (f2 * 1.0f) / f;
        this.f53969f = (f * 1.0f) / f2;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0339m.AbstractC0340a
    /* renamed from: a */
    public void mo1214a(C0326h hVar, int i) {
        CharSequence charSequence;
        int i2;
        this.f53975l = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitle());
        setId(hVar.getItemId());
        if (!TextUtils.isEmpty(hVar.getContentDescription())) {
            setContentDescription(hVar.getContentDescription());
        }
        if (!TextUtils.isEmpty(hVar.getTooltipText())) {
            charSequence = hVar.getTooltipText();
        } else {
            charSequence = hVar.getTitle();
        }
        C0431ah.m1845a(this, charSequence);
        if (hVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
    }

    /* renamed from: a */
    private void m79903a(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53974k = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(R.layout.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(R.drawable.design_bottom_navigation_item_background);
        this.f53966c = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_margin);
        this.f53965a = (ImageView) findViewById(R.id.icon);
        TextView textView = (TextView) findViewById(R.id.smallLabel);
        this.f53972i = textView;
        TextView textView2 = (TextView) findViewById(R.id.largeLabel);
        this.f53973j = textView2;
        ViewCompat.m4069d((View) textView, 2);
        ViewCompat.m4069d((View) textView2, 2);
        setFocusable(true);
        m79901a(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.f53965a;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                /* class com.google.android.material.bottomnavigation.BottomNavigationItemView.View$OnLayoutChangeListenerC221621 */

                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (BottomNavigationItemView.this.f53965a.getVisibility() == 0) {
                        BottomNavigationItemView bottomNavigationItemView = BottomNavigationItemView.this;
                        bottomNavigationItemView.mo76597a(bottomNavigationItemView.f53965a);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m79902a(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }
}
