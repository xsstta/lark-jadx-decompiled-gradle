package com.larksuite.component.universe_design.timepicker.api;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u001aJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0005H&¨\u0006\u001b"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/api/ITimePickerDelegate;", "", "getSelectedCalendar", "Ljava/util/Calendar;", "hideItemDivider", "", "setAutoAdjustItemNum", "autoAdjust", "", "setDatePickerListener", "listener", "Lcom/larksuite/component/universe_design/timepicker/api/ITimePickerDelegate$TimePickerListener;", "setItemVisibleNum", "visibleItemNum", "", "setMinuteInterval", "minuteInterval", "setPanelController", "panelController", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController;", "setPickerMode", "pickerModel", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerModel;", "setSelectedCalendar", "calendarDate", "showItemDivider", "TimePickerListener", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.a.a */
public interface ITimePickerDelegate {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/api/ITimePickerDelegate$TimePickerListener;", "", "onTimeChanged", "", "year", "", "monthOfYear", "dayOfMonth", "hourOfDay", "minute", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.a.a$a */
    public interface TimePickerListener {
        /* renamed from: a */
        void mo18000a(int i, int i2, int i3, int i4, int i5);
    }
}
