package com.ss.android.vc.entity;

import java.io.Serializable;

public class CalendarGroupResponse implements Serializable {
    private String groupId;
    private GetCalendarGroupStatus groupStatus;

    public enum GetCalendarGroupStatus {
        GET_GROUP_UNKNOWN(0),
        GET_GROUP_SUCCESS(1),
        GET_GROUP_FAILED(2),
        GET_GROUP_NOT_CREATED(3),
        GET_GROUP_NOT_PERMITTED(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static GetCalendarGroupStatus valueOf(int i) {
            return forNumber(i);
        }

        public static GetCalendarGroupStatus forNumber(int i) {
            if (i == 0) {
                return GET_GROUP_UNKNOWN;
            }
            if (i == 1) {
                return GET_GROUP_SUCCESS;
            }
            if (i == 2) {
                return GET_GROUP_FAILED;
            }
            if (i == 3) {
                return GET_GROUP_NOT_CREATED;
            }
            if (i != 4) {
                return null;
            }
            return GET_GROUP_NOT_PERMITTED;
        }

        private GetCalendarGroupStatus(int i) {
            this.value = i;
        }
    }

    public String getGroupId() {
        return this.groupId;
    }

    public GetCalendarGroupStatus getGroupStatus() {
        return this.groupStatus;
    }

    public String toString() {
        return "CalendarGroupResponse{groupId='" + this.groupId + '\'' + ", groupStatus=" + this.groupStatus + '}';
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setGroupStatus(GetCalendarGroupStatus getCalendarGroupStatus) {
        this.groupStatus = getCalendarGroupStatus;
    }
}
