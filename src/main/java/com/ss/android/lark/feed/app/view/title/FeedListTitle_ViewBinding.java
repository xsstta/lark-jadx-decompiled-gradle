package com.ss.android.lark.feed.app.view.title;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.framework.ui.CompatDrawableTextView;
import com.larksuite.suite.R;

public class FeedListTitle_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedListTitle f97633a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FeedListTitle feedListTitle = this.f97633a;
        if (feedListTitle != null) {
            this.f97633a = null;
            feedListTitle.mTitleLayout = null;
            feedListTitle.mSearchBT = null;
            feedListTitle.mSearchLayout = null;
            feedListTitle.mAvatarClickWrapper = null;
            feedListTitle.mAvatar = null;
            feedListTitle.mUpdateTip = null;
            feedListTitle.mBottomTip = null;
            feedListTitle.mRewardTip = null;
            feedListTitle.mLabelClickWrapper = null;
            feedListTitle.mLabel = null;
            feedListTitle.mTenantDesc = null;
            feedListTitle.mFilterBT = null;
            feedListTitle.mFilterDesc = null;
            feedListTitle.mMoreBT = null;
            feedListTitle.mSearchDesktop = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedListTitle_ViewBinding(FeedListTitle feedListTitle, View view) {
        this.f97633a = feedListTitle;
        feedListTitle.mTitleLayout = Utils.findRequiredView(view, R.id.title_layout, "field 'mTitleLayout'");
        feedListTitle.mSearchBT = (TextView) Utils.findRequiredViewAsType(view, R.id.search, "field 'mSearchBT'", TextView.class);
        feedListTitle.mSearchLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.search_layout, "field 'mSearchLayout'", FrameLayout.class);
        feedListTitle.mAvatarClickWrapper = Utils.findRequiredView(view, R.id.avatar_click_wrapper, "field 'mAvatarClickWrapper'");
        feedListTitle.mAvatar = (ImageView) Utils.findRequiredViewAsType(view, R.id.avatar, "field 'mAvatar'", ImageView.class);
        feedListTitle.mUpdateTip = (ImageView) Utils.findRequiredViewAsType(view, R.id.update_tip, "field 'mUpdateTip'", ImageView.class);
        feedListTitle.mBottomTip = (ImageView) Utils.findRequiredViewAsType(view, R.id.bottom_tip, "field 'mBottomTip'", ImageView.class);
        feedListTitle.mRewardTip = (ImageView) Utils.findRequiredViewAsType(view, R.id.reward_tip, "field 'mRewardTip'", ImageView.class);
        feedListTitle.mLabelClickWrapper = Utils.findRequiredView(view, R.id.label_click_wrapper, "field 'mLabelClickWrapper'");
        feedListTitle.mLabel = (LabelView) Utils.findRequiredViewAsType(view, R.id.label, "field 'mLabel'", LabelView.class);
        feedListTitle.mTenantDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.tenant_desc, "field 'mTenantDesc'", TextView.class);
        feedListTitle.mFilterBT = (AppCompatImageView) Utils.findRequiredViewAsType(view, R.id.filter, "field 'mFilterBT'", AppCompatImageView.class);
        feedListTitle.mFilterDesc = (CompatDrawableTextView) Utils.findRequiredViewAsType(view, R.id.tv_filter_desc, "field 'mFilterDesc'", CompatDrawableTextView.class);
        feedListTitle.mMoreBT = (AppCompatImageView) Utils.findRequiredViewAsType(view, R.id.more, "field 'mMoreBT'", AppCompatImageView.class);
        feedListTitle.mSearchDesktop = (AppCompatImageView) Utils.findOptionalViewAsType(view, R.id.search_desktop, "field 'mSearchDesktop'", AppCompatImageView.class);
    }
}
