package com.ss.android.lark.main.app.drawer;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;

public class FeedDrawerView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedDrawerView f112170a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FeedDrawerView feedDrawerView = this.f112170a;
        if (feedDrawerView != null) {
            this.f112170a = null;
            feedDrawerView.mTenantRV = null;
            feedDrawerView.mCurItemContainer = null;
            feedDrawerView.mContainer = null;
            feedDrawerView.mJoinTeamTV = null;
            feedDrawerView.mJoinTeamCL = null;
            feedDrawerView.joinTeamSRIV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedDrawerView_ViewBinding(FeedDrawerView feedDrawerView, View view) {
        this.f112170a = feedDrawerView;
        feedDrawerView.mTenantRV = (CommonRecyclerView) Utils.findRequiredViewAsType(view, R.id.tenant_list, "field 'mTenantRV'", CommonRecyclerView.class);
        feedDrawerView.mCurItemContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.cur_item, "field 'mCurItemContainer'", FrameLayout.class);
        feedDrawerView.mContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.drawer_fragment_container, "field 'mContainer'", FrameLayout.class);
        feedDrawerView.mJoinTeamTV = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_btn_add, "field 'mJoinTeamTV'", TextView.class);
        feedDrawerView.mJoinTeamCL = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.cl_join_team, "field 'mJoinTeamCL'", ConstraintLayout.class);
        feedDrawerView.joinTeamSRIV = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.avatar, "field 'joinTeamSRIV'", SelectableRoundedImageView.class);
    }
}
