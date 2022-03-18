package com.ss.android.lark.setting.page.content.general.feedfilter;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public final class FeedMessageFilterView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedMessageFilterView f134695a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FeedMessageFilterView feedMessageFilterView = this.f134695a;
        if (feedMessageFilterView != null) {
            this.f134695a = null;
            feedMessageFilterView.titleBar = null;
            feedMessageFilterView.switchButton = null;
            feedMessageFilterView.feedTypeFilter = null;
            feedMessageFilterView.filterSwitchLayout = null;
            feedMessageFilterView.filterSwitchTipView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedMessageFilterView_ViewBinding(FeedMessageFilterView feedMessageFilterView, View view) {
        this.f134695a = feedMessageFilterView;
        feedMessageFilterView.titleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'titleBar'", CommonTitleBar.class);
        feedMessageFilterView.switchButton = (UDSwitch) Utils.findRequiredViewAsType(view, R.id.filter_messages_btn, "field 'switchButton'", UDSwitch.class);
        feedMessageFilterView.feedTypeFilter = (FeedTypeFilter) Utils.findRequiredViewAsType(view, R.id.feed_group_filter, "field 'feedTypeFilter'", FeedTypeFilter.class);
        feedMessageFilterView.filterSwitchLayout = Utils.findRequiredView(view, R.id.filter_messages_rl, "field 'filterSwitchLayout'");
        feedMessageFilterView.filterSwitchTipView = Utils.findRequiredView(view, R.id.filter_messages_tip, "field 'filterSwitchTipView'");
    }
}
