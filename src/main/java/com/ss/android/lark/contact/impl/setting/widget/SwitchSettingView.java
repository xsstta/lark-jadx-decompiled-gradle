package com.ss.android.lark.contact.impl.setting.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

public class SwitchSettingView extends FrameLayout {

    /* renamed from: a */
    private TextView f93231a;

    /* renamed from: b */
    private TextView f93232b;

    /* renamed from: c */
    private LKUISwitchButton f93233c;

    /* renamed from: d */
    private String f93234d;

    /* renamed from: e */
    private boolean f93235e;

    public SwitchSettingView(Context context) {
        this(context, null);
    }

    public void setDisplayText(String str) {
        this.f93231a.setText(str);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f93233c.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setSwitchEnable(boolean z) {
        this.f93233c.setEnabled(z);
    }

    public void setChecked(boolean z) {
        if (this.f93233c.isChecked() != z) {
            this.f93233c.setCheckedImmediatelyNoEvent(z);
        }
    }

    public void setCheckedWithAnimation(boolean z) {
        if (this.f93233c.isChecked() != z) {
            this.f93233c.setCheckedNoEvent(z);
        }
    }

    public void setInfo(C36074a aVar) {
        mo132636a(aVar.f93237b, aVar.f93238c, aVar.f93239d);
    }

    public void setDisplaySubText(String str) {
        View childAt = getChildAt(0);
        if (TextUtils.isEmpty(str)) {
            childAt.setMinimumHeight(getContext().getResources().getDimensionPixelSize(R.dimen.mine_setting_item_height));
            this.f93232b.setVisibility(8);
            return;
        }
        childAt.setMinimumHeight(getContext().getResources().getDimensionPixelSize(R.dimen.mine_setting_item_height_large));
        this.f93232b.setVisibility(0);
        this.f93232b.setText(str);
    }

    public SwitchSettingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo132637a(String str, boolean z) {
        setDisplayText(str);
        setChecked(z);
    }

    /* renamed from: a */
    private void m141470a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.setting_checked, R.attr.setting_title});
            this.f93234d = obtainStyledAttributes.getString(1);
            this.f93235e = obtainStyledAttributes.getBoolean(0, this.f93235e);
            obtainStyledAttributes.recycle();
        }
        LayoutInflater.from(getContext()).inflate(R.layout.layout_privacy_setting, (ViewGroup) this, true);
        this.f93231a = (TextView) findViewById(R.id.display_text);
        this.f93232b = (TextView) findViewById(R.id.display_subtext);
        this.f93233c = (LKUISwitchButton) findViewById(R.id.switch_button);
        this.f93231a.setText(this.f93234d);
        this.f93233c.setChecked(this.f93235e);
        if (DesktopUtil.m144301a(getContext())) {
            this.f93231a.setTextSize(14.0f);
        }
    }

    /* renamed from: a */
    public void mo132636a(String str, String str2, boolean z) {
        mo132637a(str, z);
        setDisplaySubText(str2);
    }

    public SwitchSettingView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchSettingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m141470a(context, attributeSet);
    }
}
