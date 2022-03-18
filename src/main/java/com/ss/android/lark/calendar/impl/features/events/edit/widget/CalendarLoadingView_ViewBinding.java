package com.ss.android.lark.calendar.impl.features.events.edit.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.loading.LKUILoadingView;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class CalendarLoadingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CalendarLoadingView f81373a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CalendarLoadingView calendarLoadingView = this.f81373a;
        if (calendarLoadingView != null) {
            this.f81373a = null;
            calendarLoadingView.mLoadingPanel = null;
            calendarLoadingView.mErrorTipPanel = null;
            calendarLoadingView.mLoadingView = null;
            calendarLoadingView.mLoadingText = null;
            calendarLoadingView.mTitleBar = null;
            calendarLoadingView.mTvErrorTip = null;
            calendarLoadingView.mImageView = null;
            calendarLoadingView.mTitleBarDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CalendarLoadingView_ViewBinding(CalendarLoadingView calendarLoadingView, View view) {
        this.f81373a = calendarLoadingView;
        calendarLoadingView.mLoadingPanel = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.loading_panel, "field 'mLoadingPanel'", LinearLayout.class);
        calendarLoadingView.mErrorTipPanel = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.error_tip_panel, "field 'mErrorTipPanel'", LinearLayout.class);
        calendarLoadingView.mLoadingView = (LKUILoadingView) Utils.findRequiredViewAsType(view, R.id.loading_view, "field 'mLoadingView'", LKUILoadingView.class);
        calendarLoadingView.mLoadingText = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_loading, "field 'mLoadingText'", TextView.class);
        calendarLoadingView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        calendarLoadingView.mTvErrorTip = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_error_tip, "field 'mTvErrorTip'", TextView.class);
        calendarLoadingView.mImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.tv_error_image, "field 'mImageView'", ImageView.class);
        calendarLoadingView.mTitleBarDivider = Utils.findRequiredView(view, R.id.title_bar_divider, "field 'mTitleBarDivider'");
    }
}
