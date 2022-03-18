package com.ss.android.lark.money.redpacket.history.fragment.mvp;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public class RedPacketHistoryFragmentView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RedPacketHistoryFragmentView f121167a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RedPacketHistoryFragmentView redPacketHistoryFragmentView = this.f121167a;
        if (redPacketHistoryFragmentView != null) {
            this.f121167a = null;
            redPacketHistoryFragmentView.mRootView = null;
            redPacketHistoryFragmentView.mRoundImageView = null;
            redPacketHistoryFragmentView.mTotalNumTV = null;
            redPacketHistoryFragmentView.mTotalAmountTV = null;
            redPacketHistoryFragmentView.mYearTV = null;
            redPacketHistoryFragmentView.mYearLayout = null;
            redPacketHistoryFragmentView.mTotalAmountLabelTV = null;
            redPacketHistoryFragmentView.mRecyclerView = null;
            redPacketHistoryFragmentView.mAppbarLayout = null;
            redPacketHistoryFragmentView.mPtrLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RedPacketHistoryFragmentView_ViewBinding(RedPacketHistoryFragmentView redPacketHistoryFragmentView, View view) {
        this.f121167a = redPacketHistoryFragmentView;
        redPacketHistoryFragmentView.mRootView = Utils.findRequiredView(view, R.id.root, "field 'mRootView'");
        redPacketHistoryFragmentView.mRoundImageView = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.avatar, "field 'mRoundImageView'", LKUIRoundedImageView.class);
        redPacketHistoryFragmentView.mTotalNumTV = (TextView) Utils.findRequiredViewAsType(view, R.id.total_num_tv, "field 'mTotalNumTV'", TextView.class);
        redPacketHistoryFragmentView.mTotalAmountTV = (TextView) Utils.findRequiredViewAsType(view, R.id.total_amount_tv, "field 'mTotalAmountTV'", TextView.class);
        redPacketHistoryFragmentView.mYearTV = (TextView) Utils.findRequiredViewAsType(view, R.id.year_tv, "field 'mYearTV'", TextView.class);
        redPacketHistoryFragmentView.mYearLayout = Utils.findRequiredView(view, R.id.year_layout, "field 'mYearLayout'");
        redPacketHistoryFragmentView.mTotalAmountLabelTV = (TextView) Utils.findRequiredViewAsType(view, R.id.total_amount_label_tv, "field 'mTotalAmountLabelTV'", TextView.class);
        redPacketHistoryFragmentView.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
        redPacketHistoryFragmentView.mAppbarLayout = (AppBarLayout) Utils.findRequiredViewAsType(view, R.id.appbar_layout, "field 'mAppbarLayout'", AppBarLayout.class);
        redPacketHistoryFragmentView.mPtrLayout = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.ptr_layout, "field 'mPtrLayout'", LKUIPtrClassicFrameLayout.class);
    }
}
