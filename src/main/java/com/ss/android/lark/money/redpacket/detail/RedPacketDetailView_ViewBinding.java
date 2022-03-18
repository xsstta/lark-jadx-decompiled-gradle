package com.ss.android.lark.money.redpacket.detail;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.suite.R;

public class RedPacketDetailView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RedPacketDetailView f121092a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RedPacketDetailView redPacketDetailView = this.f121092a;
        if (redPacketDetailView != null) {
            this.f121092a = null;
            redPacketDetailView.mRootView = null;
            redPacketDetailView.mTitleBarLayout = null;
            redPacketDetailView.mTitleBarContentRootView = null;
            redPacketDetailView.mCloseTitleIV = null;
            redPacketDetailView.mHistoryTV = null;
            redPacketDetailView.mCoverContentRoot = null;
            redPacketDetailView.mDetailCoverIv = null;
            redPacketDetailView.mDetailCoverMaskIv = null;
            redPacketDetailView.mDialogBgView = null;
            redPacketDetailView.mDialogRootView = null;
            redPacketDetailView.mDialogTopBgIV = null;
            redPacketDetailView.mDialogBottomBgIV = null;
            redPacketDetailView.mDialogOpenIV = null;
            redPacketDetailView.mDialogOpenAnimationLV = null;
            redPacketDetailView.mDialogAvatarIV = null;
            redPacketDetailView.mDialogOwnerTV = null;
            redPacketDetailView.mDialogTypeLabelTV = null;
            redPacketDetailView.mDialogSubjectTV = null;
            redPacketDetailView.mDialogCheckDetailTV = null;
            redPacketDetailView.mRecordRV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RedPacketDetailView_ViewBinding(RedPacketDetailView redPacketDetailView, View view) {
        this.f121092a = redPacketDetailView;
        redPacketDetailView.mRootView = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.root, "field 'mRootView'", FrameLayout.class);
        redPacketDetailView.mTitleBarLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.red_packet_title_bar, "field 'mTitleBarLayout'", FrameLayout.class);
        redPacketDetailView.mTitleBarContentRootView = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.red_packet_title_content_layout, "field 'mTitleBarContentRootView'", RelativeLayout.class);
        redPacketDetailView.mCloseTitleIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.red_packet_back_iv, "field 'mCloseTitleIV'", ImageView.class);
        redPacketDetailView.mHistoryTV = (TextView) Utils.findRequiredViewAsType(view, R.id.red_packet_history_iv, "field 'mHistoryTV'", TextView.class);
        redPacketDetailView.mCoverContentRoot = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.content_root, "field 'mCoverContentRoot'", ViewGroup.class);
        redPacketDetailView.mDetailCoverIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.red_packet_detail_cover, "field 'mDetailCoverIv'", ImageView.class);
        redPacketDetailView.mDetailCoverMaskIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.red_packet_detail_cover_mask, "field 'mDetailCoverMaskIv'", ImageView.class);
        redPacketDetailView.mDialogBgView = Utils.findRequiredView(view, R.id.dialog_bg_view, "field 'mDialogBgView'");
        redPacketDetailView.mDialogRootView = Utils.findRequiredView(view, R.id.dialog_root, "field 'mDialogRootView'");
        redPacketDetailView.mDialogTopBgIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.red_packet_top_bg_iv, "field 'mDialogTopBgIV'", ImageView.class);
        redPacketDetailView.mDialogBottomBgIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.red_packet_bottom_bg_iv, "field 'mDialogBottomBgIV'", ImageView.class);
        redPacketDetailView.mDialogOpenIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.red_packet_open_iv, "field 'mDialogOpenIV'", ImageView.class);
        redPacketDetailView.mDialogOpenAnimationLV = (LKUILottieAnimationView) Utils.findRequiredViewAsType(view, R.id.red_packet_open_animation, "field 'mDialogOpenAnimationLV'", LKUILottieAnimationView.class);
        redPacketDetailView.mDialogAvatarIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.red_packet_dialog_avatar, "field 'mDialogAvatarIV'", ImageView.class);
        redPacketDetailView.mDialogOwnerTV = (TextView) Utils.findRequiredViewAsType(view, R.id.red_packet_dialog_owner_tv, "field 'mDialogOwnerTV'", TextView.class);
        redPacketDetailView.mDialogTypeLabelTV = (TextView) Utils.findRequiredViewAsType(view, R.id.red_packet_dialog_type_label_tv, "field 'mDialogTypeLabelTV'", TextView.class);
        redPacketDetailView.mDialogSubjectTV = (TextView) Utils.findRequiredViewAsType(view, R.id.red_packet_dialog_subject_tv, "field 'mDialogSubjectTV'", TextView.class);
        redPacketDetailView.mDialogCheckDetailTV = (TextView) Utils.findRequiredViewAsType(view, R.id.red_packet_dialog_check_result_tv, "field 'mDialogCheckDetailTV'", TextView.class);
        redPacketDetailView.mRecordRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.red_packet_record_list, "field 'mRecordRV'", RecyclerView.class);
    }
}
