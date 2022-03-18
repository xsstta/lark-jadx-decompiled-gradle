package com.ss.android.lark.money.redpacket.history;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.suite.R;

public class RedPacketHistoryActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RedPacketHistoryActivity f121125a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RedPacketHistoryActivity redPacketHistoryActivity = this.f121125a;
        if (redPacketHistoryActivity != null) {
            this.f121125a = null;
            redPacketHistoryActivity.mTitleBarLayout = null;
            redPacketHistoryActivity.mBackIV = null;
            redPacketHistoryActivity.mUDTabLayout = null;
            redPacketHistoryActivity.mViewPager = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RedPacketHistoryActivity_ViewBinding(RedPacketHistoryActivity redPacketHistoryActivity, View view) {
        this.f121125a = redPacketHistoryActivity;
        redPacketHistoryActivity.mTitleBarLayout = Utils.findRequiredView(view, R.id.red_packet_title_bar, "field 'mTitleBarLayout'");
        redPacketHistoryActivity.mBackIV = Utils.findRequiredView(view, R.id.red_packet_back_iv, "field 'mBackIV'");
        redPacketHistoryActivity.mUDTabLayout = (UDTabLayout) Utils.findRequiredViewAsType(view, R.id.red_packet_tab_layout, "field 'mUDTabLayout'", UDTabLayout.class);
        redPacketHistoryActivity.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.view_pager, "field 'mViewPager'", ViewPager.class);
    }
}
