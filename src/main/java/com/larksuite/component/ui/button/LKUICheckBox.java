package com.larksuite.component.ui.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.p1153e.C25655d;
import com.larksuite.suite.R;

public class LKUICheckBox extends AppCompatCheckBox {

    /* renamed from: a */
    private Drawable f62501a;

    /* renamed from: b */
    private boolean f62502b;

    /* renamed from: a */
    private void m91679a() {
        int a = (int) C25653b.m91892a(getContext(), 18.0f);
        if (getLayoutParams() != null) {
            a = Math.min((getWidth() - getPaddingRight()) - getPaddingLeft(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        }
        this.f62501a.setBounds(0, 0, a, a);
    }

    /* renamed from: b */
    private void m91681b() {
        if (this.f62502b) {
            this.f62501a = C25655d.m91901a(getContext(), (int) R.drawable.lkui_radio_button_bg);
        } else {
            this.f62501a = C25655d.m91901a(getContext(), (int) R.drawable.lkui_check_box_bg);
        }
        m91679a();
        setCompoundDrawables(this.f62501a, null, null, null);
    }

    public void setRadio(boolean z) {
        this.f62502b = z;
    }

    public LKUICheckBox(Context context) {
        super(context);
        m91680a(null);
    }

    /* renamed from: a */
    private void m91680a(AttributeSet attributeSet) {
        TypedArray typedArray;
        if (attributeSet == null) {
            typedArray = null;
        } else {
            typedArray = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.radio});
        }
        if (typedArray != null) {
            this.f62502b = typedArray.getBoolean(0, this.f62502b);
            typedArray.recycle();
        }
        setButtonDrawable((Drawable) null);
        setBackground(null);
    }

    public LKUICheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m91680a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int a = (int) C25653b.m91892a(getContext(), 18.0f);
            if (layoutParams.width == -2) {
                i = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + a + getPaddingRight(), 1073741824);
            }
            if (layoutParams.height == -2) {
                i2 = View.MeasureSpec.makeMeasureSpec(a + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    public LKUICheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m91680a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m91681b();
        }
    }
}
