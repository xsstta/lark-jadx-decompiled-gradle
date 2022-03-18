package com.ss.android.lark.notification.setting.impl.badgestyle.mvp;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class BadgeStyleSettingsView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BadgeStyleSettingsView f122230a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BadgeStyleSettingsView badgeStyleSettingsView = this.f122230a;
        if (badgeStyleSettingsView != null) {
            this.f122230a = null;
            badgeStyleSettingsView.mTitleBar = null;
            badgeStyleSettingsView.mWeakRemindLayout = null;
            badgeStyleSettingsView.mStrongRemindLayout = null;
            badgeStyleSettingsView.mWeakRemindSelector = null;
            badgeStyleSettingsView.mStrongRemindSelector = null;
            badgeStyleSettingsView.mHideBadgeSelector = null;
            badgeStyleSettingsView.mShowBadgeSelector = null;
            badgeStyleSettingsView.mShowBadgeLayout = null;
            badgeStyleSettingsView.mHideBadgeLayout = null;
            badgeStyleSettingsView.mNavMuteBadgeRedView = null;
            badgeStyleSettingsView.mNavMuteBadgeGrayView = null;
            badgeStyleSettingsView.mBadgeStyleTitle = null;
            badgeStyleSettingsView.mNavMuteBadgeTitle = null;
            badgeStyleSettingsView.hideIconView = null;
            badgeStyleSettingsView.showIconView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BadgeStyleSettingsView_ViewBinding(BadgeStyleSettingsView badgeStyleSettingsView, View view) {
        this.f122230a = badgeStyleSettingsView;
        badgeStyleSettingsView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        badgeStyleSettingsView.mWeakRemindLayout = Utils.findRequiredView(view, R.id.weak_remind_layout, "field 'mWeakRemindLayout'");
        badgeStyleSettingsView.mStrongRemindLayout = Utils.findRequiredView(view, R.id.strong_remind_layout, "field 'mStrongRemindLayout'");
        badgeStyleSettingsView.mWeakRemindSelector = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.weak_remind_selector, "field 'mWeakRemindSelector'", UDCheckBox.class);
        badgeStyleSettingsView.mStrongRemindSelector = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.strong_remind_selector, "field 'mStrongRemindSelector'", UDCheckBox.class);
        badgeStyleSettingsView.mHideBadgeSelector = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.hide_badge_selector, "field 'mHideBadgeSelector'", UDCheckBox.class);
        badgeStyleSettingsView.mShowBadgeSelector = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.show_badge_selector, "field 'mShowBadgeSelector'", UDCheckBox.class);
        badgeStyleSettingsView.mShowBadgeLayout = Utils.findRequiredView(view, R.id.show_badge_layout, "field 'mShowBadgeLayout'");
        badgeStyleSettingsView.mHideBadgeLayout = Utils.findRequiredView(view, R.id.hide_badge_layout, "field 'mHideBadgeLayout'");
        badgeStyleSettingsView.mNavMuteBadgeRedView = Utils.findRequiredView(view, R.id.navigation_mute_dadge_red, "field 'mNavMuteBadgeRedView'");
        badgeStyleSettingsView.mNavMuteBadgeGrayView = Utils.findRequiredView(view, R.id.navigation_mute_dadge_gray, "field 'mNavMuteBadgeGrayView'");
        badgeStyleSettingsView.mBadgeStyleTitle = Utils.findRequiredView(view, R.id.mute_badge_style_tip, "field 'mBadgeStyleTitle'");
        badgeStyleSettingsView.mNavMuteBadgeTitle = Utils.findRequiredView(view, R.id.nav_mute_badge_tip, "field 'mNavMuteBadgeTitle'");
        badgeStyleSettingsView.hideIconView = (ImageView) Utils.findRequiredViewAsType(view, R.id.hide_navigation_msg_icon, "field 'hideIconView'", ImageView.class);
        badgeStyleSettingsView.showIconView = (ImageView) Utils.findRequiredViewAsType(view, R.id.show_navigation_msg_icon, "field 'showIconView'", ImageView.class);
    }
}
