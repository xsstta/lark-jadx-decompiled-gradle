package com.ss.android.lark.mine.impl.info.mvp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class MineInfoView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MineInfoView f115549a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MineInfoView mineInfoView = this.f115549a;
        if (mineInfoView != null) {
            this.f115549a = null;
            mineInfoView.mMyProfileImageRL = null;
            mineInfoView.mMyProfileImageIV = null;
            mineInfoView.mMyProfileNameLL = null;
            mineInfoView.mMyProfileNameTV = null;
            mineInfoView.mMyProfileEditNameArrowIV = null;
            mineInfoView.mMyProfileDepartmentTV = null;
            mineInfoView.mMyProfileDepartmentContainer = null;
            mineInfoView.mMyQrCodeContainer = null;
            mineInfoView.mTitleBar = null;
            mineInfoView.mTenantContainer = null;
            mineInfoView.mTenantName = null;
            mineInfoView.mMyMedalView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MineInfoView_ViewBinding(MineInfoView mineInfoView, View view) {
        this.f115549a = mineInfoView;
        mineInfoView.mMyProfileImageRL = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.my_profile_image_rl, "field 'mMyProfileImageRL'", ConstraintLayout.class);
        mineInfoView.mMyProfileImageIV = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.my_profile_image, "field 'mMyProfileImageIV'", SelectableRoundedImageView.class);
        mineInfoView.mMyProfileNameLL = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.my_profile_name_ll, "field 'mMyProfileNameLL'", ConstraintLayout.class);
        mineInfoView.mMyProfileNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.my_profile_name, "field 'mMyProfileNameTV'", TextView.class);
        mineInfoView.mMyProfileEditNameArrowIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.my_profile_edit_name_arrow_iv, "field 'mMyProfileEditNameArrowIV'", ImageView.class);
        mineInfoView.mMyProfileDepartmentTV = (TextView) Utils.findRequiredViewAsType(view, R.id.my_profile_department, "field 'mMyProfileDepartmentTV'", TextView.class);
        mineInfoView.mMyProfileDepartmentContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.department_container, "field 'mMyProfileDepartmentContainer'", ViewGroup.class);
        mineInfoView.mMyQrCodeContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.my_qr_code_container, "field 'mMyQrCodeContainer'", ViewGroup.class);
        mineInfoView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        mineInfoView.mTenantContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.layout_tenant, "field 'mTenantContainer'", ViewGroup.class);
        mineInfoView.mTenantName = (TextView) Utils.findRequiredViewAsType(view, R.id.name_tenant, "field 'mTenantName'", TextView.class);
        mineInfoView.mMyMedalView = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_my_medal, "field 'mMyMedalView'", LinearLayout.class);
    }
}
