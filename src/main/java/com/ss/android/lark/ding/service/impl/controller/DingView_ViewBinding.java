package com.ss.android.lark.ding.service.impl.controller;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ding.widget.switchbtn.SwitchBtn;
import com.ss.android.lark.ui.CommonTitleBar;

public class DingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DingView f94370a;

    @Override // butterknife.Unbinder
    public void unbind() {
        DingView dingView = this.f94370a;
        if (dingView != null) {
            this.f94370a = null;
            dingView.mTitleBar = null;
            dingView.dingUsersRV = null;
            dingView.textMessageTV = null;
            dingView.mImageView = null;
            dingView.mPostView = null;
            dingView.switchBtn = null;
            dingView.sendTypeSelect = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DingView_ViewBinding(DingView dingView, View view) {
        this.f94370a = dingView;
        dingView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        dingView.dingUsersRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.recyclerview_ding, "field 'dingUsersRV'", RecyclerView.class);
        dingView.textMessageTV = (TextView) Utils.findRequiredViewAsType(view, R.id.ding_message, "field 'textMessageTV'", TextView.class);
        dingView.mImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.ding_image, "field 'mImageView'", ImageView.class);
        dingView.mPostView = (DingPostView) Utils.findRequiredViewAsType(view, R.id.ding_chat_post, "field 'mPostView'", DingPostView.class);
        dingView.switchBtn = (SwitchBtn) Utils.findRequiredViewAsType(view, R.id.switchBtn, "field 'switchBtn'", SwitchBtn.class);
        dingView.sendTypeSelect = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.send_type_select, "field 'sendTypeSelect'", LinearLayout.class);
    }
}
