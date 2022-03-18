package com.ss.android.lark.mine.impl.index.v2.bottom;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public final class BottomView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BottomView f115316a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BottomView bottomView = this.f115316a;
        if (bottomView != null) {
            this.f115316a = null;
            bottomView.mOnCallAvatarIV = null;
            bottomView.mOnCallNameTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BottomView_ViewBinding(BottomView bottomView, View view) {
        this.f115316a = bottomView;
        bottomView.mOnCallAvatarIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.oncall_avatar_iv, "field 'mOnCallAvatarIV'", ImageView.class);
        bottomView.mOnCallNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.oncall_name_tv, "field 'mOnCallNameTV'", TextView.class);
    }
}
