package com.ss.android.lark.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import com.larksuite.suite.R;

public class ToggleButton extends LinearLayout implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    RadioButton f143443a;

    /* renamed from: b */
    RadioButton f143444b;

    /* renamed from: c */
    AbstractC58310a f143445c;

    /* renamed from: d */
    boolean f143446d;

    /* renamed from: com.ss.android.lark.widget.ToggleButton$a */
    public interface AbstractC58310a {
        /* renamed from: a */
        void mo31217a(ToggleButton toggleButton, boolean z);
    }

    /* renamed from: a */
    private void m226099a() {
        this.f143443a.setChecked(!this.f143446d);
        this.f143444b.setChecked(this.f143446d);
    }

    public void setOnCheckedChangeListener(AbstractC58310a aVar) {
        this.f143445c = aVar;
    }

    public ToggleButton(Context context) {
        super(context);
        m226100a(null);
    }

    public void setChecked(boolean z) {
        this.f143446d = z;
        m226099a();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f143443a.setEnabled(z);
        this.f143444b.setEnabled(z);
    }

    /* renamed from: a */
    private void m226100a(AttributeSet attributeSet) {
        String str;
        int i;
        ColorStateList colorStateList;
        int i2;
        removeAllViews();
        setOrientation(0);
        this.f143443a = new RadioButton(getContext());
        this.f143444b = new RadioButton(getContext());
        String str2 = null;
        this.f143443a.setButtonDrawable((Drawable) null);
        this.f143444b.setButtonDrawable((Drawable) null);
        addView(this.f143443a);
        addView(this.f143444b);
        int i3 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.checked, R.attr.textColor, R.attr.textOff, R.attr.textOn, R.attr.textPadding, R.attr.textSize, R.attr.thumb});
            String string = obtainStyledAttributes.getString(3);
            String string2 = obtainStyledAttributes.getString(2);
            i3 = obtainStyledAttributes.getResourceId(6, -1);
            colorStateList = obtainStyledAttributes.getColorStateList(1);
            i = obtainStyledAttributes.getDimensionPixelSize(4, 5);
            i2 = obtainStyledAttributes.getDimensionPixelSize(5, 12);
            this.f143446d = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            str = string;
            str2 = string2;
        } else {
            i = TypedValue.complexToDimensionPixelSize(5, getContext().getResources().getDisplayMetrics());
            i2 = TypedValue.complexToDimensionPixelSize(12, getContext().getResources().getDisplayMetrics());
            str = null;
            colorStateList = null;
        }
        m226099a();
        this.f143443a.setText(str2);
        this.f143444b.setText(str);
        this.f143443a.setBackgroundResource(i3);
        this.f143443a.setPadding(i, i, i, i);
        this.f143443a.setTextColor(colorStateList);
        float f = (float) i2;
        this.f143443a.setTextSize(f);
        this.f143444b.setBackgroundResource(i3);
        this.f143444b.setPadding(i, i, i, i);
        this.f143444b.setTextColor(colorStateList);
        this.f143444b.setTextSize(f);
        this.f143443a.setOnCheckedChangeListener(this);
        this.f143444b.setOnCheckedChangeListener(this);
    }

    public ToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226100a(attributeSet);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean z2;
        if (z) {
            if (compoundButton == this.f143444b) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f143446d = z2;
            m226099a();
            AbstractC58310a aVar = this.f143445c;
            if (aVar != null) {
                aVar.mo31217a(this, this.f143446d);
            }
        }
    }
}
