package com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata;

public class CalendarAttr {

    public enum CalendarType {
        WEEK,
        MONTH
    }

    public enum DateState {
        PAST_DATE,
        FUTURE_DATE,
        CURRENT_DATE
    }

    public enum MonthState {
        CURRENT_MONTH,
        LAST_MONTH,
        NEXT_MONTH
    }

    public enum OptionalState {
        OPTIONAL,
        NOT_OPTIONAL
    }

    public enum SelectState {
        SELECT,
        UN_SELECT
    }
}
