package com.ss.android.lark.calendar.impl.features.meeting.chatwiget;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class BannerView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BannerView f81689a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BannerView bannerView = this.f81689a;
        if (bannerView != null) {
            this.f81689a = null;
            bannerView.summary = null;
            bannerView.time = null;
            bannerView.locationOrTime = null;
            bannerView.closeBanner = null;
            bannerView.chatBannerIcon = null;
            bannerView.chatBannerTextZone = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BannerView_ViewBinding(BannerView bannerView, View view) {
        this.f81689a = bannerView;
        bannerView.summary = (TextView) Utils.findRequiredViewAsType(view, R.id.event_summary, "field 'summary'", TextView.class);
        bannerView.time = (TextView) Utils.findRequiredViewAsType(view, R.id.event_time, "field 'time'", TextView.class);
        bannerView.locationOrTime = (TextView) Utils.findRequiredViewAsType(view, R.id.event_location, "field 'locationOrTime'", TextView.class);
        bannerView.closeBanner = (ImageView) Utils.findRequiredViewAsType(view, R.id.event_banner_close, "field 'closeBanner'", ImageView.class);
        bannerView.chatBannerIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.chat_banner_icon, "field 'chatBannerIcon'", ImageView.class);
        bannerView.chatBannerTextZone = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.chat_banner_text_zone, "field 'chatBannerTextZone'", LinearLayout.class);
    }
}
