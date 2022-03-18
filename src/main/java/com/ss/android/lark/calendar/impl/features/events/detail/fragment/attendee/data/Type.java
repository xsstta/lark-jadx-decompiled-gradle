package com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/Type;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "INDIVIDUAL", "GROUP_MEMBER", "HIDE_FOR_SAFE_TEXT_TIP", "GROUP_EXPAND_TIP", "NO_MORE_INDIVIDUAL_TIP", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum Type {
    INDIVIDUAL(0),
    GROUP_MEMBER(1),
    HIDE_FOR_SAFE_TEXT_TIP(2),
    GROUP_EXPAND_TIP(3),
    NO_MORE_INDIVIDUAL_TIP(4);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    private Type(int i) {
        this.value = i;
    }
}
