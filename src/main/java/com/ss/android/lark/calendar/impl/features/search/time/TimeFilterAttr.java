package com.ss.android.lark.calendar.impl.features.search.time;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterAttr;", "", "()V", "MonthChangeAction", "SelectTimeType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TimeFilterAttr {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterAttr$MonthChangeAction;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "SCROLL_PAGE", "SELECT_DATE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum MonthChangeAction {
        SCROLL_PAGE(0),
        SELECT_DATE(1);
        
        private final int number;

        public final int getNumber() {
            return this.number;
        }

        private MonthChangeAction(int i) {
            this.number = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterAttr$SelectTimeType;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "START_TIME", "END_TIME", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum SelectTimeType {
        START_TIME(0),
        END_TIME(1);
        
        private final int number;

        public final int getNumber() {
            return this.number;
        }

        private SelectTimeType(int i) {
            this.number = i;
        }
    }
}
