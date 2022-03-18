package com.ss.android.lark.threadwindow.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.chatwindow.view.tip.NewMessageTip;
import com.ss.android.lark.threadtab.view.widget.FixScrollerPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;

public class BaseTopicFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseTopicFragment f138652a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BaseTopicFragment baseTopicFragment = this.f138652a;
        if (baseTopicFragment != null) {
            this.f138652a = null;
            baseTopicFragment.mPtrFrame = null;
            baseTopicFragment.mMessageRV = null;
            baseTopicFragment.newMessageTopTipReverse = null;
            baseTopicFragment.newMessageBottomTipReverse = null;
            baseTopicFragment.newMessageTopTip = null;
            baseTopicFragment.newMessageBottomTip = null;
            baseTopicFragment.mOnboardingLayout = null;
            baseTopicFragment.mSendThreadBtn = null;
            baseTopicFragment.mTvThreadOnboarding = null;
            baseTopicFragment.mIvThreadOnboarding = null;
            baseTopicFragment.mNewestContentTips = null;
            baseTopicFragment.mSkeletonRv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseTopicFragment_ViewBinding(BaseTopicFragment baseTopicFragment, View view) {
        this.f138652a = baseTopicFragment;
        baseTopicFragment.mPtrFrame = (FixScrollerPtrFrameLayout) Utils.findRequiredViewAsType(view, R.id.inbox_ptr_layout, "field 'mPtrFrame'", FixScrollerPtrFrameLayout.class);
        baseTopicFragment.mMessageRV = (PointRecoderRecyclerView) Utils.findRequiredViewAsType(view, R.id.message_view, "field 'mMessageRV'", PointRecoderRecyclerView.class);
        baseTopicFragment.newMessageTopTipReverse = (NewMessageTip) Utils.findRequiredViewAsType(view, R.id.new_message_top_tip_reverse, "field 'newMessageTopTipReverse'", NewMessageTip.class);
        baseTopicFragment.newMessageBottomTipReverse = (NewMessageTip) Utils.findRequiredViewAsType(view, R.id.new_message_bottom_tip_reverse, "field 'newMessageBottomTipReverse'", NewMessageTip.class);
        baseTopicFragment.newMessageTopTip = (NewMessageTip) Utils.findRequiredViewAsType(view, R.id.new_message_top_tip, "field 'newMessageTopTip'", NewMessageTip.class);
        baseTopicFragment.newMessageBottomTip = (NewMessageTip) Utils.findRequiredViewAsType(view, R.id.new_message_bottom_tip, "field 'newMessageBottomTip'", NewMessageTip.class);
        baseTopicFragment.mOnboardingLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_thread_onboarding, "field 'mOnboardingLayout'", LinearLayout.class);
        baseTopicFragment.mSendThreadBtn = (Button) Utils.findRequiredViewAsType(view, R.id.btn_send_thread, "field 'mSendThreadBtn'", Button.class);
        baseTopicFragment.mTvThreadOnboarding = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_thread_onboarding, "field 'mTvThreadOnboarding'", TextView.class);
        baseTopicFragment.mIvThreadOnboarding = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_thread_onboarding, "field 'mIvThreadOnboarding'", ImageView.class);
        baseTopicFragment.mNewestContentTips = Utils.findRequiredView(view, R.id.tv_newest_content_tips, "field 'mNewestContentTips'");
        baseTopicFragment.mSkeletonRv = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.skeleton_rv, "field 'mSkeletonRv'", RecyclerView.class);
    }
}
