package com.ss.android.lark.biz.core.api;

public class TimeFormatSetting {

    /* renamed from: a */
    private TimeFormat f73890a = TimeFormat.UNKNOWN;

    public enum TimeFormat {
        UNKNOWN(0),
        TWELVE_HOUR(1),
        TWENTY_FOUR_HOUR(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static TimeFormat valueOf(int i) {
            return forNumber(i);
        }

        public static TimeFormat forNumber(int i) {
            if (i == 1) {
                return TWELVE_HOUR;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return TWENTY_FOUR_HOUR;
        }

        private TimeFormat(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public TimeFormat mo105510a() {
        return this.f73890a;
    }

    /* renamed from: a */
    public void mo105511a(TimeFormat timeFormat) {
        this.f73890a = timeFormat;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f73890a == ((TimeFormatSetting) obj).f73890a) {
            return true;
        }
        return false;
    }
}
