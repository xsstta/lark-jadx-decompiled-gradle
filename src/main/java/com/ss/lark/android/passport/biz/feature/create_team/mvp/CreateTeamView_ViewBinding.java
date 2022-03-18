package com.ss.lark.android.passport.biz.feature.create_team.mvp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.lark.android.passport.biz.widget.CommonEditInput;
import com.ss.lark.android.passport.biz.widget.CommonPickInput;

public class CreateTeamView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateTeamView f163326a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CreateTeamView createTeamView = this.f163326a;
        if (createTeamView != null) {
            this.f163326a = null;
            createTeamView.mTvTitle = null;
            createTeamView.mIvBack = null;
            createTeamView.mTvSubTitle = null;
            createTeamView.mEtTeam = null;
            createTeamView.mEtUserName = null;
            createTeamView.mContainer = null;
            createTeamView.mIndustryDetail = null;
            createTeamView.mGroupScale = null;
            createTeamView.mCreateTeamView = null;
            createTeamView.mBtnNext = null;
            createTeamView.llContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CreateTeamView_ViewBinding(CreateTeamView createTeamView, View view) {
        this.f163326a = createTeamView;
        createTeamView.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_title, "field 'mTvTitle'", TextView.class);
        createTeamView.mIvBack = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_back, "field 'mIvBack'", ImageView.class);
        createTeamView.mTvSubTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_sub_title, "field 'mTvSubTitle'", TextView.class);
        createTeamView.mEtTeam = (CommonEditInput) Utils.findRequiredViewAsType(view, R.id.et_team, "field 'mEtTeam'", CommonEditInput.class);
        createTeamView.mEtUserName = (CommonEditInput) Utils.findRequiredViewAsType(view, R.id.et_username, "field 'mEtUserName'", CommonEditInput.class);
        createTeamView.mContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.clTranslationContainer, "field 'mContainer'", ViewGroup.class);
        createTeamView.mIndustryDetail = (CommonPickInput) Utils.findRequiredViewAsType(view, R.id.pick_industry_detail, "field 'mIndustryDetail'", CommonPickInput.class);
        createTeamView.mGroupScale = (CommonPickInput) Utils.findRequiredViewAsType(view, R.id.pick_group_scale, "field 'mGroupScale'", CommonPickInput.class);
        createTeamView.mCreateTeamView = (AppCompatImageView) Utils.findRequiredViewAsType(view, R.id.iv_create_team, "field 'mCreateTeamView'", AppCompatImageView.class);
        createTeamView.mBtnNext = (Button) Utils.findRequiredViewAsType(view, R.id.btn_next, "field 'mBtnNext'", Button.class);
        createTeamView.llContainer = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.ll_container, "field 'llContainer'", ConstraintLayout.class);
    }
}
