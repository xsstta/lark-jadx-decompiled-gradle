package com.ss.android.lark.calendar.impl.features.calendarview;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.suite.R;

public class CalendarAppendView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CalendarAppendView f76774a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CalendarAppendView calendarAppendView = this.f76774a;
        if (calendarAppendView != null) {
            this.f76774a = null;
            calendarAppendView.mAppendEvent = null;
            calendarAppendView.mShadowContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CalendarAppendView_ViewBinding(CalendarAppendView calendarAppendView, View view) {
        this.f76774a = calendarAppendView;
        calendarAppendView.mAppendEvent = (ImageView) Utils.findRequiredViewAsType(view, R.id.append_event, "field 'mAppendEvent'", ImageView.class);
        calendarAppendView.mShadowContainer = (UDShadowLayout) Utils.findRequiredViewAsType(view, R.id.shadow_container, "field 'mShadowContainer'", UDShadowLayout.class);
    }
}
