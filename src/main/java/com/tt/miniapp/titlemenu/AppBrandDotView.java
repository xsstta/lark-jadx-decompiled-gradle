package com.tt.miniapp.titlemenu;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.tt.miniapphost.util.C67590h;

public class AppBrandDotView extends FrameLayout {

    /* renamed from: a */
    private TextView f168719a;

    /* renamed from: b */
    private ImageView f168720b;

    /* renamed from: c */
    private int f168721c;

    /* renamed from: d */
    private int f168722d;

    /* renamed from: a */
    private void m260886a() {
        this.f168719a = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f168719a.setGravity(17);
        this.f168719a.setIncludeFontPadding(false);
        this.f168719a.setTextColor(getContext().getResources().getColor(R.color.static_white));
        addView(this.f168719a, layoutParams);
        this.f168720b = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C67590h.m263065a(getContext(), 12.0f), (int) C67590h.m263065a(getContext(), 12.0f));
        layoutParams2.gravity = 17;
        addView(this.f168720b, layoutParams2);
        this.f168720b.setVisibility(8);
    }

    public AppBrandDotView(Context context) {
        this(context, null);
    }

    public void setBadge(String str) {
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f168719a.setVisibility(0);
        this.f168720b.setVisibility(8);
        if (str.length() == 1) {
            this.f168721c = (int) C67590h.m263065a(getContext(), 18.0f);
            this.f168722d = (int) C67590h.m263065a(getContext(), 18.0f);
            setBackgroundResource(R.drawable.microapp_m_red_dot);
            this.f168719a.setText(str);
            this.f168719a.setTextSize(2, 12.0f);
        } else if (str.length() == 2) {
            this.f168721c = (int) C67590h.m263065a(getContext(), 18.0f);
            this.f168722d = (int) C67590h.m263065a(getContext(), 21.0f);
            setBackgroundResource(R.drawable.microapp_m_red_dot_number);
            this.f168719a.setText(str);
            this.f168719a.setTextSize(2, 12.0f);
        } else if (str.length() == 3) {
            this.f168721c = (int) C67590h.m263065a(getContext(), 18.0f);
            this.f168722d = (int) C67590h.m263065a(getContext(), 27.0f);
            setBackgroundResource(R.drawable.microapp_m_red_dot_number);
            this.f168719a.setText(str);
            this.f168719a.setTextSize(2, 12.0f);
        } else if (str.length() > 3) {
            this.f168719a.setVisibility(8);
            this.f168720b.setVisibility(0);
            this.f168721c = (int) C67590h.m263065a(getContext(), 18.0f);
            this.f168722d = (int) C67590h.m263065a(getContext(), 21.0f);
            setBackgroundResource(R.drawable.microapp_m_red_dot_number);
            this.f168720b.setBackgroundResource(R.drawable.microapp_m_menu_more);
            this.f168720b.setImageTintList(ContextCompat.getColorStateList(getContext(), R.color.static_white));
            this.f168720b.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
        }
    }

    public AppBrandDotView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int i4 = this.f168722d;
        if (i4 != -1 && (i3 = this.f168721c) != -1) {
            setMeasuredDimension(i4, i3);
        }
    }

    public AppBrandDotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f168721c = -1;
        this.f168722d = -1;
        m260886a();
    }
}
