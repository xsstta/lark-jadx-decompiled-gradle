package com.ss.android.lark.setting.page.content.general.feedfilter;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public final class FeedMessageFilterFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedMessageFilterFragment f134684a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FeedMessageFilterFragment feedMessageFilterFragment = this.f134684a;
        if (feedMessageFilterFragment != null) {
            this.f134684a = null;
            feedMessageFilterFragment.messaegFilterSwitch = null;
            feedMessageFilterFragment.filterSortEntryLayout = null;
            feedMessageFilterFragment.atMeFilterLayout = null;
            feedMessageFilterFragment.muteFilterLayout = null;
            feedMessageFilterFragment.muteFilterSwitch = null;
            feedMessageFilterFragment.muteFilterTipView = null;
            feedMessageFilterFragment.titleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedMessageFilterFragment_ViewBinding(FeedMessageFilterFragment feedMessageFilterFragment, View view) {
        this.f134684a = feedMessageFilterFragment;
        feedMessageFilterFragment.messaegFilterSwitch = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.filter_messages_btn, "field 'messaegFilterSwitch'", LKUISwitchButton.class);
        feedMessageFilterFragment.filterSortEntryLayout = Utils.findRequiredView(view, R.id.filter_sort_entry_rl, "field 'filterSortEntryLayout'");
        feedMessageFilterFragment.atMeFilterLayout = Utils.findRequiredView(view, R.id.at_me_filter_rl, "field 'atMeFilterLayout'");
        feedMessageFilterFragment.muteFilterLayout = Utils.findRequiredView(view, R.id.mute_filter_rl, "field 'muteFilterLayout'");
        feedMessageFilterFragment.muteFilterSwitch = (UDSwitch) Utils.findRequiredViewAsType(view, R.id.mute_filter_switch_btn, "field 'muteFilterSwitch'", UDSwitch.class);
        feedMessageFilterFragment.muteFilterTipView = Utils.findRequiredView(view, R.id.mute_filter_tip, "field 'muteFilterTipView'");
        feedMessageFilterFragment.titleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'titleBar'", CommonTitleBar.class);
    }
}
