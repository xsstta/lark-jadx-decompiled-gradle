package com.ss.android.lark.member_manage.impl.atselector.view;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.quick_sidebar.QuickSideBarTipsView;
import com.ss.android.lark.widget.quick_sidebar.QuickSideBarView;

public class AtView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AtView f113992a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AtView atView = this.f113992a;
        if (atView != null) {
            this.f113992a = null;
            atView.mSelectAtLayout = null;
            atView.mRecyclerViewLayout = null;
            atView.mRecommendRecyclerView = null;
            atView.mQuickSideBarTipView = null;
            atView.mQuickSideBarView = null;
            atView.mQuickSideBarCover = null;
            atView.mSearchBar = null;
            atView.mSearchEt = null;
            atView.mPtrFrame = null;
            atView.mSearchResultRV = null;
            atView.mSelectedRV = null;
            atView.mLoadEmptyView = null;
            atView.mSearchEmptyHintTV = null;
            atView.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AtView_ViewBinding(AtView atView, View view) {
        this.f113992a = atView;
        atView.mSelectAtLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.at_select_chatter_layout, "field 'mSelectAtLayout'", LinearLayout.class);
        atView.mRecyclerViewLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.recyclerview_layout, "field 'mRecyclerViewLayout'", LinearLayout.class);
        atView.mRecommendRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.contactView, "field 'mRecommendRecyclerView'", RecyclerView.class);
        atView.mQuickSideBarTipView = (QuickSideBarTipsView) Utils.findRequiredViewAsType(view, R.id.quickSideBarTipsView, "field 'mQuickSideBarTipView'", QuickSideBarTipsView.class);
        atView.mQuickSideBarView = (QuickSideBarView) Utils.findRequiredViewAsType(view, R.id.quickSideBarView, "field 'mQuickSideBarView'", QuickSideBarView.class);
        atView.mQuickSideBarCover = Utils.findRequiredView(view, R.id.quickSideBarViewCover, "field 'mQuickSideBarCover'");
        atView.mSearchBar = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.search_bar, "field 'mSearchBar'", LinearLayout.class);
        atView.mSearchEt = (EditText) Utils.findRequiredViewAsType(view, R.id.search_et, "field 'mSearchEt'", EditText.class);
        atView.mPtrFrame = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.inbox_ptr_layout, "field 'mPtrFrame'", LKUIPtrClassicFrameLayout.class);
        atView.mSearchResultRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.search_result_rv, "field 'mSearchResultRV'", RecyclerView.class);
        atView.mSelectedRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.select_at_chat, "field 'mSelectedRV'", RecyclerView.class);
        atView.mLoadEmptyView = Utils.findRequiredView(view, R.id.load_empty, "field 'mLoadEmptyView'");
        atView.mSearchEmptyHintTV = (TextView) Utils.findRequiredViewAsType(view, R.id.text_empty_tip, "field 'mSearchEmptyHintTV'", TextView.class);
        atView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
    }
}
