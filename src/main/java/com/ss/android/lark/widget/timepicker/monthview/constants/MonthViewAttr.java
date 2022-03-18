package com.ss.android.lark.widget.timepicker.monthview.constants;

public class MonthViewAttr {

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

    public enum SelectTimeType {
        START_TIME(1),
        END_TIME(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static SelectTimeType valueOf(int i) {
            return forNumber(i);
        }

        public static SelectTimeType forNumber(int i) {
            if (i == 1) {
                return START_TIME;
            }
            if (i != 2) {
                return START_TIME;
            }
            return END_TIME;
        }

        private SelectTimeType(int i) {
            this.value = i;
        }
    }
}
