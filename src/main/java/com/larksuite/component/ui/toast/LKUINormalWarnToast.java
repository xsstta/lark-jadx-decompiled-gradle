package com.larksuite.component.ui.toast;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LKUINormalWarnToast extends LinearLayout {

    /* renamed from: a */
    View f63007a;

    /* renamed from: b */
    ImageView f63008b;

    /* renamed from: c */
    TextView f63009c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public LKUINormalWarnToast(Context context) {
        this(context, null);
    }

    public void setImage(int i) {
        this.f63008b.setImageResource(i);
    }

    public void setText(String str) {
        this.f63009c.setText(str);
    }

    public void setType(int i) {
        if (i == 0) {
            this.f63007a.setBackgroundColor(C25653b.m91894a(getContext(), R.color.lkui_R500, 0.15f));
            this.f63009c.setTextColor(getResources().getColor(R.color.lkui_R500));
        } else if (i == 1) {
            this.f63007a.setBackgroundColor(C25653b.m91894a(getContext(), R.color.lkui_Y500, 0.15f));
            this.f63009c.setTextColor(getResources().getColor(R.color.lkui_Y500));
        } else if (i == 2) {
            this.f63007a.setBackgroundColor(C25653b.m91894a(getContext(), R.color.lkui_B500, 0.15f));
            this.f63009c.setTextColor(getResources().getColor(R.color.lkui_B500));
        } else if (i != 3) {
            this.f63007a.setBackgroundColor(C25653b.m91894a(getContext(), R.color.lkui_R500, 0.15f));
            this.f63009c.setTextColor(getResources().getColor(R.color.lkui_R500));
        } else {
            this.f63007a.setBackgroundColor(C25653b.m91894a(getContext(), R.color.lkui_T500, 0.15f));
            this.f63009c.setTextColor(getResources().getColor(R.color.lkui_T500));
        }
    }

    public LKUINormalWarnToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LKUINormalWarnToast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.wt_icon, R.attr.wt_texts, R.attr.wt_type}, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        CharSequence text = obtainStyledAttributes.getText(1);
        int i2 = obtainStyledAttributes.getInt(2, 0);
        obtainStyledAttributes.recycle();
        View inflate = inflate(getContext(), R.layout.lkui_toast_warn, this);
        this.f63007a = inflate.findViewById(R.id.container);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        this.f63008b = imageView;
        imageView.setImageDrawable(drawable);
        this.f63009c = (TextView) inflate.findViewById(R.id.text);
        if (!TextUtils.isEmpty(text)) {
            setText(text.toString());
        }
        setType(i2);
    }
}
