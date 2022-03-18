package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.internal.C22332d;
import com.google.android.material.internal.C22358l;
import com.google.android.material.theme.p992a.C22497a;
import com.larksuite.suite.R;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: a */
    public final ListPopupWindow f55205a;

    /* renamed from: b */
    private final AccessibilityManager f55206b;

    /* renamed from: c */
    private final Rect f55207c;

    /* renamed from: b */
    private TextInputLayout m81484b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public CharSequence getHint() {
        TextInputLayout b = m81484b();
        if (b == null || !b.mo78364a()) {
            return super.getHint();
        }
        return b.getHint();
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() != 0 || (accessibilityManager = this.f55206b) == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f55205a.show();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = m81484b();
        if (b != null && b.mo78364a() && super.getHint() == null && C22332d.m80914a()) {
            setHint("");
        }
    }

    /* renamed from: a */
    private int m81483a() {
        ListAdapter adapter = getAdapter();
        TextInputLayout b = m81484b();
        int i = 0;
        if (adapter == null || b == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f55205a.getSelectedItemPosition()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, b);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable background = this.f55205a.getBackground();
        if (background != null) {
            background.getPadding(this.f55207c);
            i2 += this.f55207c.left + this.f55207c.right;
        }
        return i2 + b.getEndIconView().getMeasuredWidth();
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f55205a.setAdapter(getAdapter());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.android.material.textfield.MaterialAutoCompleteTextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T extends ListAdapter & Filterable> void mo78344a(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m81483a()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C22497a.m81662a(context, attributeSet, i, 0), attributeSet, i);
        this.f55207c = new Rect();
        Context context2 = getContext();
        TypedArray a = C22358l.m80999a(context2, attributeSet, new int[]{16843296}, i, 2131887232, new int[0]);
        if (a.hasValue(0) && a.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f55206b = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f55205a = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.google.android.material.textfield.MaterialAutoCompleteTextView.C224561 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Object obj;
                if (i < 0) {
                    obj = MaterialAutoCompleteTextView.this.f55205a.getSelectedItem();
                } else {
                    obj = MaterialAutoCompleteTextView.this.getAdapter().getItem(i);
                }
                MaterialAutoCompleteTextView.this.mo78344a(obj);
                AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = MaterialAutoCompleteTextView.this.f55205a.getSelectedView();
                        i = MaterialAutoCompleteTextView.this.f55205a.getSelectedItemPosition();
                        j = MaterialAutoCompleteTextView.this.f55205a.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f55205a.getListView(), view, i, j);
                }
                MaterialAutoCompleteTextView.this.f55205a.dismiss();
            }
        });
        a.recycle();
    }
}
