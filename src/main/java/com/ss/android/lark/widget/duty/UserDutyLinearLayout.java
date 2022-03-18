package com.ss.android.lark.widget.duty;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

public class UserDutyLinearLayout extends LinearLayout {

    /* renamed from: a */
    private TextView f143862a;

    /* renamed from: b */
    private String f143863b;

    /* renamed from: c */
    private TextView f143864c;

    /* renamed from: d */
    private String f143865d;

    /* renamed from: e */
    private ImageView f143866e;

    public String getDuty() {
        return this.f143865d;
    }

    public String getSection() {
        return this.f143863b;
    }

    /* renamed from: a */
    private void m226527a() {
        m226528b();
        this.f143862a = (TextView) findViewById(R.id.tv_section);
        this.f143864c = (TextView) findViewById(R.id.tv_duty);
        this.f143866e = (ImageView) findViewById(R.id.iv_divider);
        this.f143863b = "";
        this.f143865d = "";
        setTextSize(12);
    }

    /* renamed from: b */
    private void m226528b() {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.view_user_duty, (ViewGroup) this, false);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, UIUtils.dp2px(getContext(), 18.0f));
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        addView(linearLayout, layoutParams);
    }

    public UserDutyLinearLayout(Context context) {
        super(context);
        m226527a();
    }

    public void setDividerVisibility(int i) {
        this.f143866e.setVisibility(i);
    }

    public void setDuty(String str) {
        this.f143864c.setText(str);
        this.f143865d = str;
    }

    public void setDutyVisibility(int i) {
        this.f143864c.setVisibility(i);
    }

    public void setSection(String str) {
        this.f143862a.setText(str);
        this.f143863b = str;
    }

    public void setSectionVisibility(int i) {
        this.f143862a.setVisibility(i);
    }

    public void setTextColor(int i) {
        this.f143862a.setTextColor(i);
        this.f143864c.setTextColor(i);
    }

    public void setTextSize(int i) {
        float f = (float) i;
        this.f143862a.setTextSize(f);
        this.f143864c.setTextSize(f);
    }

    public UserDutyLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226527a();
    }

    public UserDutyLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m226527a();
    }
}
