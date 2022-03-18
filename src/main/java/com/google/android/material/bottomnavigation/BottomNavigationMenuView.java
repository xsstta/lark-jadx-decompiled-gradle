package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.view.menu.AbstractC0339m;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.view.menu.C0326h;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.p031d.p032a.p033a.C0966b;
import androidx.transition.AutoTransition;
import androidx.transition.C1556v;
import androidx.transition.TransitionSet;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.C22356k;
import com.larksuite.suite.R;
import java.util.HashSet;

public class BottomNavigationMenuView extends ViewGroup implements AbstractC0339m {

    /* renamed from: c */
    private static final int[] f53981c = {16842912};

    /* renamed from: d */
    private static final int[] f53982d = {-16842910};

    /* renamed from: A */
    private SparseArray<BadgeDrawable> f53983A;

    /* renamed from: a */
    public BottomNavigationPresenter f53984a;

    /* renamed from: b */
    public C0322f f53985b;

    /* renamed from: e */
    private final TransitionSet f53986e;

    /* renamed from: f */
    private final int f53987f;

    /* renamed from: g */
    private final int f53988g;

    /* renamed from: h */
    private final int f53989h;

    /* renamed from: i */
    private final int f53990i;

    /* renamed from: j */
    private final int f53991j;

    /* renamed from: k */
    private final View.OnClickListener f53992k;

    /* renamed from: l */
    private final Pools.AbstractC0839a<BottomNavigationItemView> f53993l;

    /* renamed from: m */
    private boolean f53994m;

    /* renamed from: n */
    private int f53995n;

    /* renamed from: o */
    private BottomNavigationItemView[] f53996o;

    /* renamed from: p */
    private int f53997p;

    /* renamed from: q */
    private int f53998q;

    /* renamed from: r */
    private ColorStateList f53999r;

    /* renamed from: s */
    private int f54000s;

    /* renamed from: t */
    private ColorStateList f54001t;

    /* renamed from: u */
    private final ColorStateList f54002u;

    /* renamed from: v */
    private int f54003v;

    /* renamed from: w */
    private int f54004w;

    /* renamed from: x */
    private Drawable f54005x;

    /* renamed from: y */
    private int f54006y;

    /* renamed from: z */
    private int[] f54007z;

    /* renamed from: a */
    private boolean m79912a(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m79913c(int i) {
        return i != -1;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f53983A;
    }

    public ColorStateList getIconTintList() {
        return this.f53999r;
    }

    public int getItemBackgroundRes() {
        return this.f54006y;
    }

    public int getItemIconSize() {
        return this.f54000s;
    }

    public int getItemTextAppearanceActive() {
        return this.f54004w;
    }

    public int getItemTextAppearanceInactive() {
        return this.f54003v;
    }

    public ColorStateList getItemTextColor() {
        return this.f54001t;
    }

    public int getLabelVisibilityMode() {
        return this.f53995n;
    }

    public int getSelectedItemId() {
        return this.f53997p;
    }

    /* renamed from: a */
    public boolean mo76621a() {
        return this.f53994m;
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView acquire = this.f53993l.acquire();
        if (acquire == null) {
            return new BottomNavigationItemView(getContext());
        }
        return acquire;
    }

    public Drawable getItemBackground() {
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f53996o;
        if (bottomNavigationItemViewArr == null || bottomNavigationItemViewArr.length <= 0) {
            return this.f54005x;
        }
        return bottomNavigationItemViewArr[0].getBackground();
    }

    /* renamed from: d */
    private void m79914d() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f53985b.size(); i++) {
            hashSet.add(Integer.valueOf(this.f53985b.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f53983A.size(); i2++) {
            int keyAt = this.f53983A.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f53983A.delete(keyAt);
            }
        }
    }

    /* renamed from: c */
    public void mo76624c() {
        C0322f fVar = this.f53985b;
        if (!(fVar == null || this.f53996o == null)) {
            int size = fVar.size();
            if (size != this.f53996o.length) {
                mo76622b();
                return;
            }
            int i = this.f53997p;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.f53985b.getItem(i2);
                if (item.isChecked()) {
                    this.f53997p = item.getItemId();
                    this.f53998q = i2;
                }
            }
            if (i != this.f53997p) {
                C1556v.m7131a(this, this.f53986e);
            }
            boolean a = m79912a(this.f53995n, this.f53985b.mo1436j().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.f53984a.mo76653b(true);
                this.f53996o[i3].setLabelVisibilityMode(this.f53995n);
                this.f53996o[i3].setShifting(a);
                this.f53996o[i3].mo1214a((C0326h) this.f53985b.getItem(i3), 0);
                this.f53984a.mo76653b(false);
            }
        }
    }

    /* renamed from: b */
    public void mo76622b() {
        removeAllViews();
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f53996o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView != null) {
                    this.f53993l.release(bottomNavigationItemView);
                    bottomNavigationItemView.mo76598b();
                }
            }
        }
        if (this.f53985b.size() == 0) {
            this.f53997p = 0;
            this.f53998q = 0;
            this.f53996o = null;
            return;
        }
        m79914d();
        this.f53996o = new BottomNavigationItemView[this.f53985b.size()];
        boolean a = m79912a(this.f53995n, this.f53985b.mo1436j().size());
        for (int i = 0; i < this.f53985b.size(); i++) {
            this.f53984a.mo76653b(true);
            this.f53985b.getItem(i).setCheckable(true);
            this.f53984a.mo76653b(false);
            BottomNavigationItemView newItem = getNewItem();
            this.f53996o[i] = newItem;
            newItem.setIconTintList(this.f53999r);
            newItem.setIconSize(this.f54000s);
            newItem.setTextColor(this.f54002u);
            newItem.setTextAppearanceInactive(this.f54003v);
            newItem.setTextAppearanceActive(this.f54004w);
            newItem.setTextColor(this.f54001t);
            Drawable drawable = this.f54005x;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f54006y);
            }
            newItem.setShifting(a);
            newItem.setLabelVisibilityMode(this.f53995n);
            newItem.mo1214a((C0326h) this.f53985b.getItem(i), 0);
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.f53992k);
            if (this.f53997p != 0 && this.f53985b.getItem(i).getItemId() == this.f53997p) {
                this.f53998q = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f53985b.size() - 1, this.f53998q);
        this.f53998q = min;
        this.f53985b.getItem(min).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0339m
    /* renamed from: a */
    public void mo1265a(C0322f fVar) {
        this.f53985b = fVar;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f53994m = z;
    }

    public void setLabelVisibilityMode(int i) {
        this.f53995n = i;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f53984a = bottomNavigationPresenter;
    }

    public BottomNavigationMenuView(Context context) {
        this(context, null);
    }

    private void setBadgeIfNeeded(BottomNavigationItemView bottomNavigationItemView) {
        BadgeDrawable badgeDrawable;
        int id = bottomNavigationItemView.getId();
        if (m79913c(id) && (badgeDrawable = this.f53983A.get(id)) != null) {
            bottomNavigationItemView.setBadge(badgeDrawable);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0864d.m4171a(accessibilityNodeInfo).mo4559a(C0864d.C0866b.m4257a(1, this.f53985b.mo1436j().size(), false, 1));
    }

    /* access modifiers changed from: package-private */
    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.f53983A = sparseArray;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f53996o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setBadge(sparseArray.get(bottomNavigationItemView.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f53999r = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f53996o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f54005x = drawable;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f53996o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f54006y = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f53996o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f54000s = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f53996o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f54004w = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f53996o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f54001t;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f54003v = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f53996o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f54001t;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f54001t = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f53996o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextColor(colorStateList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo76623b(int i) {
        int size = this.f53985b.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f53985b.getItem(i2);
            if (i == item.getItemId()) {
                this.f53997p = i;
                this.f53998q = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: a */
    public ColorStateList mo76620a(int i) {
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
        int[] iArr = f53982d;
        return new ColorStateList(new int[][]{iArr, f53981c, EMPTY_STATE_SET}, new int[]{a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53993l = new Pools.SynchronizedPool(5);
        this.f53997p = 0;
        this.f53998q = 0;
        this.f53983A = new SparseArray<>(5);
        Resources resources = getResources();
        this.f53987f = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f53988g = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f53989h = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f53990i = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
        this.f53991j = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_height);
        this.f54002u = mo76620a(16842808);
        AutoTransition autoTransition = new AutoTransition();
        this.f53986e = autoTransition;
        autoTransition.mo7874a(0);
        autoTransition.mo7878a(115L);
        autoTransition.mo7879a(new C0966b());
        autoTransition.mo7933a(new C22356k());
        this.f53992k = new View.OnClickListener() {
            /* class com.google.android.material.bottomnavigation.BottomNavigationMenuView.View$OnClickListenerC221631 */

            public void onClick(View view) {
                C0326h itemData = ((BottomNavigationItemView) view).getItemData();
                if (!BottomNavigationMenuView.this.f53985b.mo1397a(itemData, BottomNavigationMenuView.this.f53984a, 0)) {
                    itemData.setChecked(true);
                }
            }
        };
        this.f54007z = new int[5];
        ViewCompat.m4069d((View) this, 1);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f53985b.mo1436j().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f53991j, 1073741824);
        if (!m79912a(this.f53995n, size2) || !this.f53994m) {
            if (size2 == 0) {
                i3 = 1;
            } else {
                i3 = size2;
            }
            int min = Math.min(size / i3, this.f53989h);
            int i7 = size - (size2 * min);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    int[] iArr = this.f54007z;
                    iArr[i8] = min;
                    if (i7 > 0) {
                        iArr[i8] = iArr[i8] + 1;
                        i7--;
                    }
                } else {
                    this.f54007z[i8] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.f53998q);
            int i9 = this.f53990i;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f53989h, Integer.MIN_VALUE), makeMeasureSpec);
                i9 = Math.max(i9, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i10 = size2 - i4;
            int min2 = Math.min(size - (this.f53988g * i10), Math.min(i9, this.f53989h));
            int i11 = size - min2;
            if (i10 == 0) {
                i5 = 1;
            } else {
                i5 = i10;
            }
            int min3 = Math.min(i11 / i5, this.f53987f);
            int i12 = i11 - (i10 * min3);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    int[] iArr2 = this.f54007z;
                    if (i13 == this.f53998q) {
                        i6 = min2;
                    } else {
                        i6 = min3;
                    }
                    iArr2[i13] = i6;
                    if (i12 > 0) {
                        iArr2[i13] = iArr2[i13] + 1;
                        i12--;
                    }
                } else {
                    this.f54007z[i13] = 0;
                }
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f54007z[i15], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i14 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i14, View.MeasureSpec.makeMeasureSpec(i14, 1073741824), 0), View.resolveSizeAndState(this.f53991j, makeMeasureSpec, 0));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.m4082h(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }
}
