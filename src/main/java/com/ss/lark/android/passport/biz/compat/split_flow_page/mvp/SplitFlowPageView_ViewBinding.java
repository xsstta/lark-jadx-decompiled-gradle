package com.ss.lark.android.passport.biz.compat.split_flow_page.mvp;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class SplitFlowPageView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SplitFlowPageView f162771a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SplitFlowPageView splitFlowPageView = this.f162771a;
        if (splitFlowPageView != null) {
            this.f162771a = null;
            splitFlowPageView.ivBack = null;
            splitFlowPageView.tvTitle = null;
            splitFlowPageView.tvSubTitle = null;
            splitFlowPageView.llFaceVerify = null;
            splitFlowPageView.tvFaceVerify = null;
            splitFlowPageView.tvBottomTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SplitFlowPageView_ViewBinding(SplitFlowPageView splitFlowPageView, View view) {
        this.f162771a = splitFlowPageView;
        splitFlowPageView.ivBack = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_back, "field 'ivBack'", ImageView.class);
        splitFlowPageView.tvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_title, "field 'tvTitle'", TextView.class);
        splitFlowPageView.tvSubTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_subtitle, "field 'tvSubTitle'", TextView.class);
        splitFlowPageView.llFaceVerify = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.llFaceVerify, "field 'llFaceVerify'", LinearLayout.class);
        splitFlowPageView.tvFaceVerify = (TextView) Utils.findRequiredViewAsType(view, R.id.tvFaceVerify, "field 'tvFaceVerify'", TextView.class);
        splitFlowPageView.tvBottomTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_bottom_title, "field 'tvBottomTitle'", TextView.class);
    }
}
