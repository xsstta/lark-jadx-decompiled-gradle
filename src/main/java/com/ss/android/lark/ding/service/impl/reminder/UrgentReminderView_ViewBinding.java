package com.ss.android.lark.ding.service.impl.reminder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;

public class UrgentReminderView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private UrgentReminderView f94498a;

    @Override // butterknife.Unbinder
    public void unbind() {
        UrgentReminderView urgentReminderView = this.f94498a;
        if (urgentReminderView != null) {
            this.f94498a = null;
            urgentReminderView.mButtonLater = null;
            urgentReminderView.mButtonDetail = null;
            urgentReminderView.mIvDingAvatar = null;
            urgentReminderView.mTvDingSender = null;
            urgentReminderView.mTvDingTime = null;
            urgentReminderView.mTvDingText = null;
            urgentReminderView.mDisplayLayout = null;
            urgentReminderView.mBuzzTagIv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UrgentReminderView_ViewBinding(UrgentReminderView urgentReminderView, View view) {
        this.f94498a = urgentReminderView;
        urgentReminderView.mButtonLater = (UDButton) Utils.findRequiredViewAsType(view, R.id.btn_ding_later, "field 'mButtonLater'", UDButton.class);
        urgentReminderView.mButtonDetail = (UDButton) Utils.findRequiredViewAsType(view, R.id.btn_ding_detail, "field 'mButtonDetail'", UDButton.class);
        urgentReminderView.mIvDingAvatar = (ImageView) Utils.findRequiredViewAsType(view, R.id.image_avatar, "field 'mIvDingAvatar'", ImageView.class);
        urgentReminderView.mTvDingSender = (TextView) Utils.findRequiredViewAsType(view, R.id.text_ding_who, "field 'mTvDingSender'", TextView.class);
        urgentReminderView.mTvDingTime = (TextView) Utils.findRequiredViewAsType(view, R.id.text_ding_time, "field 'mTvDingTime'", TextView.class);
        urgentReminderView.mTvDingText = (TextView) Utils.findRequiredViewAsType(view, R.id.text_ding_text, "field 'mTvDingText'", TextView.class);
        urgentReminderView.mDisplayLayout = Utils.findRequiredView(view, R.id.layout_display, "field 'mDisplayLayout'");
        urgentReminderView.mBuzzTagIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.buzz_tag_iv, "field 'mBuzzTagIv'", ImageView.class);
    }
}
