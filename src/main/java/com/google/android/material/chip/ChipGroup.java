package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.p029a.C0864d;
import com.google.android.material.internal.FlowLayout;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class ChipGroup extends FlowLayout {

    /* renamed from: f */
    private static final int f54213f = 2131887358;

    /* renamed from: a */
    public boolean f54214a;

    /* renamed from: b */
    public boolean f54215b;

    /* renamed from: c */
    public final C22205a f54216c;

    /* renamed from: d */
    public int f54217d;

    /* renamed from: e */
    public boolean f54218e;

    /* renamed from: g */
    private int f54219g;

    /* renamed from: h */
    private int f54220h;

    /* renamed from: i */
    private AbstractC22206b f54221i;

    /* renamed from: j */
    private ViewGroup$OnHierarchyChangeListenerC22207c f54222j;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public interface AbstractC22206b {
        /* renamed from: a */
        void mo77111a(ChipGroup chipGroup, int i);
    }

    /* renamed from: c */
    public boolean mo77080c() {
        return this.f54214a;
    }

    public int getChipSpacingHorizontal() {
        return this.f54219g;
    }

    public int getChipSpacingVertical() {
        return this.f54220h;
    }

    @Override // com.google.android.material.internal.FlowLayout
    /* renamed from: b */
    public boolean mo77079b() {
        return super.mo77079b();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public int getCheckedChipId() {
        if (this.f54214a) {
            return this.f54217d;
        }
        return -1;
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f54217d;
        if (i != -1) {
            mo77078b(i, true);
            setCheckedId(this.f54217d);
        }
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f54214a) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo77075a() {
        this.f54218e = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f54218e = false;
        setCheckedId(-1);
    }

    public void setOnCheckedChangeListener(AbstractC22206b bVar) {
        this.f54221i = bVar;
    }

    public void setSelectionRequired(boolean z) {
        this.f54215b = z;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$a */
    private class C22205a implements CompoundButton.OnCheckedChangeListener {
        private C22205a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f54218e) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.f54215b) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(ChipGroup.this.f54217d == -1 || ChipGroup.this.f54217d == id || !ChipGroup.this.f54214a)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.mo77078b(chipGroup.f54217d, false);
                        }
                        ChipGroup.this.setCheckedId(id);
                    } else if (ChipGroup.this.f54217d == id) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                } else {
                    ChipGroup.this.mo77078b(compoundButton.getId(), true);
                    ChipGroup.this.mo77076a(compoundButton.getId(), false);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    private class ViewGroup$OnHierarchyChangeListenerC22207c implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a */
        public ViewGroup.OnHierarchyChangeListener f54224a;

        private ViewGroup$OnHierarchyChangeListenerC22207c() {
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f54224a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        public void onChildViewAdded(View view, View view2) {
            int i;
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        i = View.generateViewId();
                    } else {
                        i = view2.hashCode();
                    }
                    view2.setId(i);
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f54216c);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f54224a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setCheckedId(int i) {
        mo77076a(i, true);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f54222j.f54224a = onHierarchyChangeListener;
    }

    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof LayoutParams)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f54219g != i) {
            this.f54219g = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f54220h != i) {
            this.f54220h = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f54214a != z) {
            this.f54214a = z;
            mo77075a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo77074a(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (((Chip) getChildAt(i2)) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0864d a = C0864d.m4171a(accessibilityNodeInfo);
        if (mo77079b()) {
            i = getChipCount();
        } else {
            i = -1;
        }
        int rowCount = getRowCount();
        if (mo77080c()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        a.mo4559a(C0864d.C0866b.m4257a(rowCount, i, false, i2));
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    /* renamed from: a */
    public void mo77076a(int i, boolean z) {
        this.f54217d = i;
        AbstractC22206b bVar = this.f54221i;
        if (bVar != null && this.f54214a && z) {
            bVar.mo77111a(this, i);
        }
    }

    /* renamed from: b */
    public void mo77078b(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f54218e = true;
            ((Chip) findViewById).setChecked(z);
            this.f54218e = false;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f54217d;
                if (i2 != -1 && this.f54214a) {
                    mo77078b(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
