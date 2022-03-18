package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class CalendarPermissionDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CalendarPermissionDialog f78407a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CalendarPermissionDialog calendarPermissionDialog = this.f78407a;
        if (calendarPermissionDialog != null) {
            this.f78407a = null;
            calendarPermissionDialog.closeDialog = null;
            calendarPermissionDialog.openPrivateSetting = null;
            calendarPermissionDialog.noPermContent = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CalendarPermissionDialog_ViewBinding(CalendarPermissionDialog calendarPermissionDialog, View view) {
        this.f78407a = calendarPermissionDialog;
        calendarPermissionDialog.closeDialog = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_no_perm_close, "field 'closeDialog'", ImageView.class);
        calendarPermissionDialog.openPrivateSetting = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_open_private_setting, "field 'openPrivateSetting'", TextView.class);
        calendarPermissionDialog.noPermContent = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_no_perm_content, "field 'noPermContent'", TextView.class);
    }
}
