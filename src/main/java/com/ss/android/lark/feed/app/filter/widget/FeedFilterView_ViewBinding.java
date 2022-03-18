package com.ss.android.lark.feed.app.filter.widget;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import net.lucode.hackware.magicindicator.MagicIndicator;

public final class FeedFilterView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedFilterView f96321a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FeedFilterView feedFilterView = this.f96321a;
        if (feedFilterView != null) {
            this.f96321a = null;
            feedFilterView.mMagicIndicator = null;
            feedFilterView.mFeedFilterView = null;
            feedFilterView.mFeedDeviceView = null;
            feedFilterView.mShadeView = null;
            feedFilterView.mDivider = null;
            feedFilterView.mDeviceIcon = null;
            feedFilterView.mMoreIcon = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedFilterView_ViewBinding(FeedFilterView feedFilterView, View view) {
        this.f96321a = feedFilterView;
        feedFilterView.mMagicIndicator = (MagicIndicator) Utils.findRequiredViewAsType(view, R.id.magic_container, "field 'mMagicIndicator'", MagicIndicator.class);
        feedFilterView.mFeedFilterView = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.icon_manager, "field 'mFeedFilterView'", FrameLayout.class);
        feedFilterView.mFeedDeviceView = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.icon_device, "field 'mFeedDeviceView'", FrameLayout.class);
        feedFilterView.mShadeView = Utils.findRequiredView(view, R.id.shade, "field 'mShadeView'");
        feedFilterView.mDivider = Utils.findRequiredView(view, R.id.divider, "field 'mDivider'");
        feedFilterView.mDeviceIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.icon_device_image_view, "field 'mDeviceIcon'", ImageView.class);
        feedFilterView.mMoreIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.icon_more_image_view, "field 'mMoreIcon'", ImageView.class);
    }
}
