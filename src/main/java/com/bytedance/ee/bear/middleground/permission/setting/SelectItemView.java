package com.bytedance.ee.bear.middleground.permission.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;

public class SelectItemView extends ConstraintLayout {

    /* renamed from: a */
    private boolean f26869a;

    /* renamed from: b */
    private UDCheckBox f26870b;

    /* renamed from: c */
    private TextView f26871c;

    /* renamed from: d */
    private TextView f26872d;

    /* renamed from: e */
    private View f26873e;

    public UDCheckBox getCheckBox() {
        return this.f26870b;
    }

    public boolean isSelected() {
        return this.f26869a;
    }

    public SelectItemView(Context context) {
        this(context, null);
    }

    public void setDescription(String str) {
        this.f26872d.setText(str);
    }

    public void setText(int i) {
        this.f26871c.setText(i);
    }

    public void setTextColor(int i) {
        this.f26871c.setTextColor(i);
    }

    /* renamed from: a */
    public void mo38107a(boolean z) {
        int i;
        View view = this.f26873e;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setText(String str) {
        this.f26871c.setText(str);
    }

    public void setSelected(boolean z) {
        this.f26869a = z;
        this.f26870b.setChecked(z);
        if (!z || TextUtils.isEmpty(this.f26872d.getText().toString())) {
            this.f26872d.setVisibility(8);
        } else {
            this.f26872d.setVisibility(0);
        }
    }

    public SelectItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo38108a(boolean z, boolean z2) {
        int i;
        this.f26869a = z;
        this.f26870b.setChecked(z);
        TextView textView = this.f26872d;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: a */
    private void m41372a(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.share_list_link_share_item, this);
        this.f26870b = (UDCheckBox) inflate.findViewById(R.id.share_checkbox);
        this.f26871c = (TextView) inflate.findViewById(R.id.share_link_item_title);
        this.f26872d = (TextView) inflate.findViewById(R.id.share_link_item_sub_title);
        this.f26873e = inflate.findViewById(R.id.share_link_divider);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.description, R.attr.showBottomDivider, R.attr.title});
        String string = obtainStyledAttributes.getString(2);
        if (!TextUtils.isEmpty(string)) {
            this.f26871c.setText(string);
        }
        String string2 = obtainStyledAttributes.getString(0);
        if (!TextUtils.isEmpty(string2)) {
            this.f26872d.setText(string2);
        }
        mo38107a(obtainStyledAttributes.getBoolean(1, true));
        obtainStyledAttributes.recycle();
    }

    public SelectItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m41372a(context, attributeSet);
    }
}
