package com.bytedance.ee.bear.bitable.card.model.enums;

import android.util.SparseArray;

public enum EReminderNotifyStrategy {
    AT_TIME_OF_EVENT(0),
    BEFORE_5_MINUTE(1),
    BEFORE_15_MINUTE(2),
    BEFORE_30_MINUTE(3),
    BEFORE_1_HOUR(4),
    BEFORE_2_HOUR(5),
    AT_DAT_OF_EVENT(6),
    BEFORE_1_DAY(7),
    BEFORE_2_DAY(8),
    BEFORE_1_WEEK(9);
    
    private static final SparseArray<EReminderNotifyStrategy> MAP_VALUES = new SparseArray<>();
    public int value;

    static {
        EReminderNotifyStrategy[] values = values();
        for (EReminderNotifyStrategy eReminderNotifyStrategy : values) {
            MAP_VALUES.put(eReminderNotifyStrategy.value, eReminderNotifyStrategy);
        }
    }

    public static EReminderNotifyStrategy valueOf(int i) {
        return MAP_VALUES.get(i, AT_TIME_OF_EVENT);
    }

    private EReminderNotifyStrategy(int i) {
        this.value = i;
    }
}
