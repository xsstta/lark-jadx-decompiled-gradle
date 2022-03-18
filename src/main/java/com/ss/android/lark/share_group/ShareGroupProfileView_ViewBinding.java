package com.ss.android.lark.share_group;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ZoomInScrollView;

public class ShareGroupProfileView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ShareGroupProfileView f135308a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ShareGroupProfileView shareGroupProfileView = this.f135308a;
        if (shareGroupProfileView != null) {
            this.f135308a = null;
            shareGroupProfileView.mGroupDetailTv = null;
            shareGroupProfileView.mGroupDetailLayout = null;
            shareGroupProfileView.mGroupMemberLayout = null;
            shareGroupProfileView.mTitleBar = null;
            shareGroupProfileView.mHeaderIV = null;
            shareGroupProfileView.mZoomWrapperZV = null;
            shareGroupProfileView.mHeaderWrapperRL = null;
            shareGroupProfileView.mCardWrapper = null;
            shareGroupProfileView.mChatterAllCountTV = null;
            shareGroupProfileView.mGroupNameTV = null;
            shareGroupProfileView.mChatOwnerAvator = null;
            shareGroupProfileView.mBtGroupChatJoin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ShareGroupProfileView_ViewBinding(ShareGroupProfileView shareGroupProfileView, View view) {
        this.f135308a = shareGroupProfileView;
        shareGroupProfileView.mGroupDetailTv = (TextView) Utils.findRequiredViewAsType(view, R.id.group_description_detail_tv, "field 'mGroupDetailTv'", TextView.class);
        shareGroupProfileView.mGroupDetailLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.group_description_layout, "field 'mGroupDetailLayout'", RelativeLayout.class);
        shareGroupProfileView.mGroupMemberLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.group_member_layout, "field 'mGroupMemberLayout'", RelativeLayout.class);
        shareGroupProfileView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        shareGroupProfileView.mHeaderIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.header_image, "field 'mHeaderIV'", ImageView.class);
        shareGroupProfileView.mZoomWrapperZV = (ZoomInScrollView) Utils.findRequiredViewAsType(view, R.id.zoom_wrapper, "field 'mZoomWrapperZV'", ZoomInScrollView.class);
        shareGroupProfileView.mHeaderWrapperRL = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.header_wrapper, "field 'mHeaderWrapperRL'", RelativeLayout.class);
        shareGroupProfileView.mCardWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.card_wrapper, "field 'mCardWrapper'", LinearLayout.class);
        shareGroupProfileView.mChatterAllCountTV = (TextView) Utils.findRequiredViewAsType(view, R.id.user_allcount_tv, "field 'mChatterAllCountTV'", TextView.class);
        shareGroupProfileView.mGroupNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_name_tv, "field 'mGroupNameTV'", TextView.class);
        shareGroupProfileView.mChatOwnerAvator = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_avator, "field 'mChatOwnerAvator'", ImageView.class);
        shareGroupProfileView.mBtGroupChatJoin = (TextView) Utils.findRequiredViewAsType(view, R.id.bt_group_chat_join, "field 'mBtGroupChatJoin'", TextView.class);
    }
}
