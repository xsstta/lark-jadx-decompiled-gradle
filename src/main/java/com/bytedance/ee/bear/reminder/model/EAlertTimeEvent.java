package com.bytedance.ee.bear.reminder.model;

import com.larksuite.suite.R;

public enum EAlertTimeEvent {
    noAlert(R.string.Doc_Reminder_NoAlert),
    onDayOfEvent(R.string.Doc_Reminder_OnDayOfEvent9am),
    oneDayBefore(R.string.Doc_Reminder_OneDayBefore9am),
    twoDaysBefore(R.string.Doc_Reminder_TwoDaysBefore9am),
    oneWeekBefore(R.string.Doc_Reminder_OneWeekBefore9am),
    atTimeOfEvent(R.string.Doc_Reminder_AtTimeOfEvent),
    before5Mins(R.string.Doc_Reminder_5MinsBefore),
    before15Mins(R.string.Doc_Reminder_15MinsBefore),
    before30Mins(R.string.Doc_Reminder_30MinsBefore),
    before1Hour(R.string.Doc_Reminder_1HourBefore),
    before2Hours(R.string.Doc_Reminder_2HoursBefore),
    before1Day(R.string.Doc_Reminder_1DayBefore),
    before2Days(R.string.Doc_Reminder_2DaysBefore),
    before1Week(R.string.Doc_Reminder_1WeekBefore);
    
    int res;

    public int getRes() {
        return this.res;
    }

    private EAlertTimeEvent(int i) {
        this.res = i;
    }
}
