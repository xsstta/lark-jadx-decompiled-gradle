package com.larksuite.component.ui.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.p1153e.C25655d;
import com.larksuite.suite.R;

public class LKUIRadioButton extends AppCompatRadioButton {

    /* renamed from: a */
    private Drawable f62518a;

    /* renamed from: b */
    private void m91689b() {
        m91687a();
        setCompoundDrawables(this.f62518a, null, null, null);
    }

    /* renamed from: a */
    private void m91687a() {
        int a = (int) C25653b.m91892a(getContext(), 18.0f);
        if (getLayoutParams() != null) {
            a = Math.min((getWidth() - getPaddingRight()) - getPaddingLeft(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        }
        this.f62518a.setBounds(0, 0, a, a);
    }

    public LKUIRadioButton(Context context) {
        super(context);
        m91688a(null);
    }

    /* renamed from: a */
    private void m91688a(AttributeSet attributeSet) {
        TypedArray typedArray;
        boolean z;
        TypedArray typedArray2;
        boolean z2 = false;
        if (attributeSet == null) {
            typedArray = null;
        } else {
            typedArray = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.checkStyle});
        }
        if (typedArray != null) {
            z = typedArray.getBoolean(0, false);
            typedArray.recycle();
        } else {
            z = false;
        }
        if (attributeSet == null) {
            typedArray2 = null;
        } else {
            typedArray2 = getContext().obtainStyledAttributes(attributeSet, new int[]{16842981});
        }
        if (typedArray2 != null) {
            z2 = typedArray2.getBoolean(0, false);
            typedArray2.recycle();
        }
        if (z) {
            this.f62518a = C25655d.m91901a(getContext(), (int) R.drawable.lkui_list_radio_button_bg);
            setClickable(z2);
        } else {
            this.f62518a = C25655d.m91901a(getContext(), (int) R.drawable.lkui_radio_button_bg);
        }
        setButtonDrawable((Drawable) null);
        setBackground(null);
    }

    public LKUIRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m91688a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && layoutParams.width == -2 && layoutParams.height == -2) {
            int a = (int) C25653b.m91892a(getContext(), 18.0f);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + a + getPaddingRight(), 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(a + getPaddingTop() + getPaddingBottom(), 1073741824);
            i = makeMeasureSpec;
        }
        super.onMeasure(i, i2);
    }

    public LKUIRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m91688a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m91689b();
        }
    }
}
