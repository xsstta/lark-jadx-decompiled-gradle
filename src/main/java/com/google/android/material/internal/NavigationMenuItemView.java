package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.AbstractC0339m;
import androidx.appcompat.view.menu.C0326h;
import androidx.appcompat.widget.C0431ah;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.C0760e;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.view.C0859a;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.core.widget.TextViewCompat;
import com.larksuite.suite.R;

public class NavigationMenuItemView extends ForegroundLinearLayout implements AbstractC0339m.AbstractC0340a {

    /* renamed from: d */
    private static final int[] f54645d = {16842912};

    /* renamed from: c */
    boolean f54646c;

    /* renamed from: e */
    private int f54647e;

    /* renamed from: f */
    private boolean f54648f;

    /* renamed from: g */
    private final CheckedTextView f54649g;

    /* renamed from: h */
    private FrameLayout f54650h;

    /* renamed from: i */
    private C0326h f54651i;

    /* renamed from: j */
    private ColorStateList f54652j;

    /* renamed from: k */
    private boolean f54653k;

    /* renamed from: l */
    private Drawable f54654l;

    /* renamed from: m */
    private final C0859a f54655m;

    @Override // androidx.appcompat.view.menu.AbstractC0339m.AbstractC0340a
    /* renamed from: a */
    public boolean mo1215a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0339m.AbstractC0340a
    public C0326h getItemData() {
        return this.f54651i;
    }

    /* renamed from: b */
    public void mo77725b() {
        FrameLayout frameLayout = this.f54650h;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f54649g.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: c */
    private boolean m80827c() {
        if (this.f54651i.getTitle() == null && this.f54651i.getIcon() == null && this.f54651i.getActionView() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m80828d() {
        if (m80827c()) {
            this.f54649g.setVisibility(8);
            FrameLayout frameLayout = this.f54650h;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.f54650h.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f54649g.setVisibility(0);
        FrameLayout frameLayout2 = this.f54650h;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams2.width = -2;
            this.f54650h.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: e */
    private StateListDrawable m80829e() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f54645d, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public void setIconSize(int i) {
        this.f54647e = i;
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f54648f = z;
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIconPadding(int i) {
        this.f54649g.setCompoundDrawablePadding(i);
    }

    public void setMaxLines(int i) {
        this.f54649g.setMaxLines(i);
    }

    public void setTextAppearance(int i) {
        TextViewCompat.m4490a(this.f54649g, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f54649g.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f54649g.setText(charSequence);
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f54649g.setChecked(z);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0326h hVar = this.f54651i;
        if (hVar != null && hVar.isCheckable() && this.f54651i.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f54645d);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f54646c != z) {
            this.f54646c = z;
            this.f54655m.mo4533a(this.f54649g, 2048);
        }
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.f54652j = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.f54653k = z;
        C0326h hVar = this.f54651i;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f54650h == null) {
                this.f54650h = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f54650h.removeAllViews();
            this.f54650h.addView(view);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f54653k) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0774a.m3779g(drawable).mutate();
                C0774a.m3768a(drawable, this.f54652j);
            }
            int i = this.f54647e;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f54648f) {
            if (this.f54654l == null) {
                Drawable a = C0760e.m3682a(getResources(), R.drawable.navigation_empty_icon, getContext().getTheme());
                this.f54654l = a;
                if (a != null) {
                    int i2 = this.f54647e;
                    a.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f54654l;
        }
        TextViewCompat.m4493a(this.f54649g, drawable, null, null, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0339m.AbstractC0340a
    /* renamed from: a */
    public void mo1214a(C0326h hVar, int i) {
        int i2;
        this.f54651i = hVar;
        if (hVar.getItemId() > 0) {
            setId(hVar.getItemId());
        }
        if (hVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            ViewCompat.m4039a(this, m80829e());
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.getTitle());
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.getContentDescription());
        C0431ah.m1845a(this, hVar.getTooltipText());
        m80828d();
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C223221 r4 = new C0859a() {
            /* class com.google.android.material.internal.NavigationMenuItemView.C223221 */

            @Override // androidx.core.view.C0859a
            /* renamed from: a */
            public void mo4535a(View view, C0864d dVar) {
                super.mo4535a(view, dVar);
                dVar.mo4560a(NavigationMenuItemView.this.f54646c);
            }
        };
        this.f54655m = r4;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f54649g = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.m4043a(checkedTextView, r4);
    }
}
