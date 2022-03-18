package com.ss.android.lark.chatsetting.impl.group.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

public class GroupMemberAvatarView extends FrameLayout {

    /* renamed from: a */
    private Context f90101a;

    /* renamed from: b */
    private LKUIRoundedImageView f90102b;

    /* renamed from: c */
    private View f90103c;

    /* renamed from: d */
    private TextView f90104d;

    public LKUIRoundedImageView getAvatarIV() {
        return this.f90102b;
    }

    /* renamed from: a */
    private void m135838a() {
        this.f90102b = (LKUIRoundedImageView) findViewById(R.id.avatar_iv);
        this.f90103c = findViewById(R.id.masker_v);
        this.f90104d = (TextView) findViewById(R.id.counter_tv);
    }

    public GroupMemberAvatarView(Context context) {
        this(context, null);
    }

    public void setImageResource(int i) {
        this.f90102b.setImageResource(i);
    }

    /* renamed from: a */
    private void m135839a(Context context) {
        inflate(getContext(), R.layout.group_setting_member_view, this);
        m135838a();
    }

    public void setCounter(int i) {
        TextView textView = this.f90104d;
        textView.setText(i + UIUtils.getString(this.f90101a, R.string.Lark_Legacy_AmountGroupUnit));
        this.f90103c.setVisibility(0);
        this.f90104d.setVisibility(0);
    }

    public GroupMemberAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f90101a = context;
        m135839a(context);
    }
}
