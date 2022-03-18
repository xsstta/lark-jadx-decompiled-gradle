package com.ss.lark.android.passport.biz.compat.real_name.mvp;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.lark.android.passport.biz.widget.CommonEditInput;
import com.ss.lark.android.passport.biz.widget.KeyboardDetectorConstraintLayout;

public class RealNameView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RealNameView f162709a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RealNameView realNameView = this.f162709a;
        if (realNameView != null) {
            this.f162709a = null;
            realNameView.mContainer = null;
            realNameView.mIvBack = null;
            realNameView.mTvTitle = null;
            realNameView.mEtUserName = null;
            realNameView.mTvSubTitle = null;
            realNameView.mEtIdCode = null;
            realNameView.mTvPolicy = null;
            realNameView.mCheckBoxPolicy = null;
            realNameView.mBottomLayout = null;
            realNameView.mAppealTip = null;
            realNameView.mBtnNext = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RealNameView_ViewBinding(RealNameView realNameView, View view) {
        this.f162709a = realNameView;
        realNameView.mContainer = (KeyboardDetectorConstraintLayout) Utils.findRequiredViewAsType(view, R.id.login_content_frame_container, "field 'mContainer'", KeyboardDetectorConstraintLayout.class);
        realNameView.mIvBack = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_back, "field 'mIvBack'", ImageView.class);
        realNameView.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_title, "field 'mTvTitle'", TextView.class);
        realNameView.mEtUserName = (CommonEditInput) Utils.findRequiredViewAsType(view, R.id.et_username, "field 'mEtUserName'", CommonEditInput.class);
        realNameView.mTvSubTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_sub_title, "field 'mTvSubTitle'", TextView.class);
        realNameView.mEtIdCode = (CommonEditInput) Utils.findRequiredViewAsType(view, R.id.et_id_code, "field 'mEtIdCode'", CommonEditInput.class);
        realNameView.mTvPolicy = (TextView) Utils.findRequiredViewAsType(view, R.id.tvPolicy, "field 'mTvPolicy'", TextView.class);
        realNameView.mCheckBoxPolicy = (AppCompatCheckBox) Utils.findRequiredViewAsType(view, R.id.checkBoxPolicy, "field 'mCheckBoxPolicy'", AppCompatCheckBox.class);
        realNameView.mBottomLayout = Utils.findRequiredView(view, R.id.llBottom, "field 'mBottomLayout'");
        realNameView.mAppealTip = (TextView) Utils.findRequiredViewAsType(view, R.id.tvAppealTip, "field 'mAppealTip'", TextView.class);
        realNameView.mBtnNext = (Button) Utils.findRequiredViewAsType(view, R.id.btn_next, "field 'mBtnNext'", Button.class);
    }
}
