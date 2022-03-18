package com.ss.android.vc.entity.request;

public class JoinCalendarGroupMeetingEntityRequest {

    public enum EntrySource {
        FROM_UNKNOWN(0),
        FROM_CALENDAR_DETAIL(1),
        FROM_CARD(2),
        FROM_GROUP(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static EntrySource fromValue(int i) {
            if (i == 0) {
                return FROM_UNKNOWN;
            }
            if (i == 1) {
                return FROM_CALENDAR_DETAIL;
            }
            if (i == 2) {
                return FROM_CARD;
            }
            if (i != 3) {
                return null;
            }
            return FROM_GROUP;
        }

        private EntrySource(int i) {
            this.value = i;
        }
    }
}
