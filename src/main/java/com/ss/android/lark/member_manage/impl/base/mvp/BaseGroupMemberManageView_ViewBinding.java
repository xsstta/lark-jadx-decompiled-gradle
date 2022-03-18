package com.ss.android.lark.member_manage.impl.base.mvp;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.quick_sidebar.QuickSideBarTipsView;
import com.ss.android.lark.widget.quick_sidebar.QuickSideBarView;

public class BaseGroupMemberManageView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseGroupMemberManageView f114102a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BaseGroupMemberManageView baseGroupMemberManageView = this.f114102a;
        if (baseGroupMemberManageView != null) {
            this.f114102a = null;
            baseGroupMemberManageView.mSelectAvatarsView = null;
            baseGroupMemberManageView.mSelectedRV = null;
            baseGroupMemberManageView.mMemberRV = null;
            baseGroupMemberManageView.mMemberPtrFrame = null;
            baseGroupMemberManageView.mSearchRV = null;
            baseGroupMemberManageView.mQuickSideBarTipView = null;
            baseGroupMemberManageView.mQuickSideBarView = null;
            baseGroupMemberManageView.mQuickSideBarCover = null;
            baseGroupMemberManageView.mLoadEmptyView = null;
            baseGroupMemberManageView.mSearchEmptyHintTV = null;
            baseGroupMemberManageView.mLoadFailView = null;
            baseGroupMemberManageView.mSelectCountTV = null;
            baseGroupMemberManageView.mConfirmBT = null;
            baseGroupMemberManageView.mBottomDetailRL = null;
            baseGroupMemberManageView.mSearchBarContainer = null;
            baseGroupMemberManageView.mSearchBar = null;
            baseGroupMemberManageView.mSearchEt = null;
            baseGroupMemberManageView.mSearchDeleteIV = null;
            baseGroupMemberManageView.mSearchPtrFrame = null;
            baseGroupMemberManageView.mTitleBar = null;
            baseGroupMemberManageView.mBannerContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseGroupMemberManageView_ViewBinding(BaseGroupMemberManageView baseGroupMemberManageView, View view) {
        this.f114102a = baseGroupMemberManageView;
        baseGroupMemberManageView.mSelectAvatarsView = Utils.findRequiredView(view, R.id.selectAvatorView, "field 'mSelectAvatarsView'");
        baseGroupMemberManageView.mSelectedRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.horizontalAvatarRecycleView, "field 'mSelectedRV'", RecyclerView.class);
        baseGroupMemberManageView.mMemberRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.contactView, "field 'mMemberRV'", RecyclerView.class);
        baseGroupMemberManageView.mMemberPtrFrame = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.load_more_layout, "field 'mMemberPtrFrame'", LKUIPtrClassicFrameLayout.class);
        baseGroupMemberManageView.mSearchRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.search_contact_result_view, "field 'mSearchRV'", RecyclerView.class);
        baseGroupMemberManageView.mQuickSideBarTipView = (QuickSideBarTipsView) Utils.findRequiredViewAsType(view, R.id.quickSideBarTipsView, "field 'mQuickSideBarTipView'", QuickSideBarTipsView.class);
        baseGroupMemberManageView.mQuickSideBarView = (QuickSideBarView) Utils.findRequiredViewAsType(view, R.id.quickSideBarView, "field 'mQuickSideBarView'", QuickSideBarView.class);
        baseGroupMemberManageView.mQuickSideBarCover = Utils.findRequiredView(view, R.id.quickSideBarViewCover, "field 'mQuickSideBarCover'");
        baseGroupMemberManageView.mLoadEmptyView = Utils.findRequiredView(view, R.id.load_empty, "field 'mLoadEmptyView'");
        baseGroupMemberManageView.mSearchEmptyHintTV = (TextView) Utils.findRequiredViewAsType(view, R.id.text_empty_tip, "field 'mSearchEmptyHintTV'", TextView.class);
        baseGroupMemberManageView.mLoadFailView = Utils.findRequiredView(view, R.id.load_fail, "field 'mLoadFailView'");
        baseGroupMemberManageView.mSelectCountTV = (TextView) Utils.findRequiredViewAsType(view, R.id.select_count, "field 'mSelectCountTV'", TextView.class);
        baseGroupMemberManageView.mConfirmBT = (Button) Utils.findRequiredViewAsType(view, R.id.confirm, "field 'mConfirmBT'", Button.class);
        baseGroupMemberManageView.mBottomDetailRL = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.show_bottom, "field 'mBottomDetailRL'", ConstraintLayout.class);
        baseGroupMemberManageView.mSearchBarContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.search_bar_container, "field 'mSearchBarContainer'", LinearLayout.class);
        baseGroupMemberManageView.mSearchBar = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.search_bar, "field 'mSearchBar'", LinearLayout.class);
        baseGroupMemberManageView.mSearchEt = (EditText) Utils.findRequiredViewAsType(view, R.id.search_et, "field 'mSearchEt'", EditText.class);
        baseGroupMemberManageView.mSearchDeleteIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.search_delete_iv, "field 'mSearchDeleteIV'", ImageView.class);
        baseGroupMemberManageView.mSearchPtrFrame = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.inbox_ptr_layout, "field 'mSearchPtrFrame'", LKUIPtrClassicFrameLayout.class);
        baseGroupMemberManageView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        baseGroupMemberManageView.mBannerContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.banner_container, "field 'mBannerContainer'", FrameLayout.class);
    }
}
