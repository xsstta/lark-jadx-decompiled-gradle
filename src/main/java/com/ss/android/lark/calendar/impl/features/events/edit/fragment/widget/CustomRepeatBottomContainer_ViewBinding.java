package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.view.View;
import android.widget.GridView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.ControlChildViewClickableLayout;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.WheelView;

public class CustomRepeatBottomContainer_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CustomRepeatBottomContainer f80952a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CustomRepeatBottomContainer customRepeatBottomContainer = this.f80952a;
        if (customRepeatBottomContainer != null) {
            this.f80952a = null;
            customRepeatBottomContainer.mCustomRepeatWeekly = null;
            customRepeatBottomContainer.mCustomRepeatMonthly = null;
            customRepeatBottomContainer.mSwitchDate = null;
            customRepeatBottomContainer.mSwitchWeek = null;
            customRepeatBottomContainer.mMonthlyTabContainer = null;
            customRepeatBottomContainer.mRepeatWeekNoWheelView = null;
            customRepeatBottomContainer.mRepeatWeeksWheelView = null;
            customRepeatBottomContainer.mChooseRepeatWeeksViewGroup = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CustomRepeatBottomContainer_ViewBinding(CustomRepeatBottomContainer customRepeatBottomContainer, View view) {
        this.f80952a = customRepeatBottomContainer;
        customRepeatBottomContainer.mCustomRepeatWeekly = (GridView) Utils.findRequiredViewAsType(view, R.id.custom_repeat_weekly, "field 'mCustomRepeatWeekly'", GridView.class);
        customRepeatBottomContainer.mCustomRepeatMonthly = (GridView) Utils.findRequiredViewAsType(view, R.id.custom_repeat_monthly, "field 'mCustomRepeatMonthly'", GridView.class);
        customRepeatBottomContainer.mSwitchDate = (TextView) Utils.findRequiredViewAsType(view, R.id.switch_date, "field 'mSwitchDate'", TextView.class);
        customRepeatBottomContainer.mSwitchWeek = (TextView) Utils.findRequiredViewAsType(view, R.id.switch_week, "field 'mSwitchWeek'", TextView.class);
        customRepeatBottomContainer.mMonthlyTabContainer = Utils.findRequiredView(view, R.id.monthly_tab_container, "field 'mMonthlyTabContainer'");
        customRepeatBottomContainer.mRepeatWeekNoWheelView = (WheelView) Utils.findRequiredViewAsType(view, R.id.wheel_repeat_week_no, "field 'mRepeatWeekNoWheelView'", WheelView.class);
        customRepeatBottomContainer.mRepeatWeeksWheelView = (WheelView) Utils.findRequiredViewAsType(view, R.id.wheel_repeat_weeks, "field 'mRepeatWeeksWheelView'", WheelView.class);
        customRepeatBottomContainer.mChooseRepeatWeeksViewGroup = (ControlChildViewClickableLayout) Utils.findRequiredViewAsType(view, R.id.choose_repeat_weeks_container, "field 'mChooseRepeatWeeksViewGroup'", ControlChildViewClickableLayout.class);
    }
}
