package com.ss.android.lark.chatsetting.impl.group.avatar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

public class CheckImageView extends AppCompatImageView implements Checkable {

    /* renamed from: a */
    private boolean f89341a;

    public boolean isChecked() {
        return this.f89341a;
    }

    /* renamed from: a */
    private void m134442a() {
        int dp2px = UIHelper.dp2px(6.0f);
        setPadding(dp2px, dp2px, dp2px, dp2px);
    }

    public void toggle() {
        this.f89341a = !this.f89341a;
        m134443b();
    }

    /* renamed from: b */
    private void m134443b() {
        if (this.f89341a) {
            setImageDrawable(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_list_check_outlined, UIUtils.getColor(getContext(), R.color.static_white)));
        } else {
            setImageDrawable(null);
        }
    }

    public CheckImageView(Context context) {
        super(context);
        m134442a();
    }

    public void setChecked(boolean z) {
        if (this.f89341a != z) {
            toggle();
        }
    }

    public CheckImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m134442a();
    }

    public CheckImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m134442a();
    }
}
