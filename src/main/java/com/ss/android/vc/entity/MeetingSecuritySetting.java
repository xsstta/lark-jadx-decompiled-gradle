package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.List;

public class MeetingSecuritySetting implements Serializable {
    private List<String> groupIds;
    private boolean isEnableLobby;
    private List<String> roomIds;
    private SecurityLevel securityLevel;
    private List<SpecialGroupType> specialGroupTypes;
    private List<String> userIds;

    public enum SecurityLevel {
        UNKNOWN(0),
        PUBLIC(1),
        TENANT(2),
        CONTACTS_AND_GROUP(3),
        ONLY_HOST(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public String eventString() {
            int i = this.value;
            if (i == 1) {
                return "anyone";
            }
            if (i == 2) {
                return "organizer_company";
            }
            if (i == 3) {
                return "selected";
            }
            if (i != 4) {
                return "unknown";
            }
            return "host_invited";
        }

        public static SecurityLevel valueOf(int i) {
            return forNumber(i);
        }

        public static SecurityLevel forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return PUBLIC;
            }
            if (i == 2) {
                return TENANT;
            }
            if (i == 3) {
                return CONTACTS_AND_GROUP;
            }
            if (i != 4) {
                return null;
            }
            return ONLY_HOST;
        }

        private SecurityLevel(int i) {
            this.value = i;
        }
    }

    public enum SpecialGroupType {
        TYPE_UNKNOWN(0),
        CALENDAR_GUEST_LIST(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static SpecialGroupType forNumber(int i) {
            if (i == 0) {
                return TYPE_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return CALENDAR_GUEST_LIST;
        }

        private SpecialGroupType(int i) {
            this.value = i;
        }
    }

    public List<String> getGroupIds() {
        return this.groupIds;
    }

    public List<String> getRoomIds() {
        return this.roomIds;
    }

    public SecurityLevel getSecurityLevel() {
        return this.securityLevel;
    }

    public List<SpecialGroupType> getSpecialGroupTypes() {
        return this.specialGroupTypes;
    }

    public List<String> getUserIds() {
        return this.userIds;
    }

    public boolean isEnableLobby() {
        return this.isEnableLobby;
    }

    public String toString() {
        return "MeetingSecuritySetting{groupIds=" + this.groupIds + ", userIds=" + this.userIds + ", roomIds=" + this.roomIds + '}';
    }

    public void setEnableLobby(boolean z) {
        this.isEnableLobby = z;
    }

    public void setGroupIds(List<String> list) {
        this.groupIds = list;
    }

    public void setRoomIds(List<String> list) {
        this.roomIds = list;
    }

    public void setSecurityLevel(SecurityLevel securityLevel2) {
        this.securityLevel = securityLevel2;
    }

    public void setSpecialGroupTypes(List<SpecialGroupType> list) {
        this.specialGroupTypes = list;
    }

    public void setUserIds(List<String> list) {
        this.userIds = list;
    }
}
