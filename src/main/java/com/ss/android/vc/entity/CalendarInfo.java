package com.ss.android.vc.entity;

import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class CalendarInfo implements Serializable {
    private boolean canEnterOrCreateGroup;
    private String creatorId;
    private String description;
    private EventType eventType;
    private long groupId;
    private boolean isAllDay;
    private List<CalendarLocation> locations;
    private String organizerId;
    private Map<String, RoomMeetingStatus> roomMeetingStatus;
    private Map<String, CalendarAcceptStatus> roomStatus;
    private Map<String, Room> rooms;
    private Map<String, String> subtitles;
    private long theEventEndTime;
    private long theEventStartTime;
    private String topic;
    private int total;
    private Map<String, ChatterMeetingStatus> userMeetingStatus;
    private Map<String, CalendarAcceptStatus> userStatus;
    private Map<String, OpenChatter> users;
    private Map<String, Boolean> versionSupport;
    private Map<String, Room> viewRooms;
    private long wholeEventEndTime;

    public enum CalendarAcceptStatus {
        UNKNOWN_STATUS(0),
        ACCEPT(1),
        REJECT(2),
        TBD(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static CalendarAcceptStatus valueOf(int i) {
            return forNumber(i);
        }

        public static CalendarAcceptStatus forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_STATUS;
            }
            if (i == 1) {
                return ACCEPT;
            }
            if (i == 2) {
                return REJECT;
            }
            if (i != 3) {
                return null;
            }
            return TBD;
        }

        private CalendarAcceptStatus(int i) {
            this.value = i;
        }
    }

    public enum EventType {
        SINGLE(0),
        CYCLE(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static EventType valueOf(int i) {
            return forNumber(i);
        }

        public static EventType forNumber(int i) {
            if (i == 0) {
                return SINGLE;
            }
            if (i != 1) {
                return null;
            }
            return CYCLE;
        }

        private EventType(int i) {
            this.value = i;
        }
    }

    public String getCreatorId() {
        return this.creatorId;
    }

    public String getDescription() {
        return this.description;
    }

    public EventType getEventType() {
        return this.eventType;
    }

    public long getGroupId() {
        return this.groupId;
    }

    public List<CalendarLocation> getLocations() {
        return this.locations;
    }

    public String getOrganizerId() {
        return this.organizerId;
    }

    public Map<String, RoomMeetingStatus> getRoomMeetingStatus() {
        return this.roomMeetingStatus;
    }

    public Map<String, CalendarAcceptStatus> getRoomStatus() {
        return this.roomStatus;
    }

    public Map<String, Room> getRooms() {
        return this.rooms;
    }

    public Map<String, String> getSubtitles() {
        return this.subtitles;
    }

    public long getTheEventEndTime() {
        return this.theEventEndTime;
    }

    public long getTheEventStartTime() {
        return this.theEventStartTime;
    }

    public String getTopic() {
        return this.topic;
    }

    public int getTotal() {
        return this.total;
    }

    public Map<String, ChatterMeetingStatus> getUserMeetingStatus() {
        return this.userMeetingStatus;
    }

    public Map<String, CalendarAcceptStatus> getUserStatus() {
        return this.userStatus;
    }

    public Map<String, OpenChatter> getUsers() {
        return this.users;
    }

    public Map<String, Boolean> getVersionSupport() {
        return this.versionSupport;
    }

    public Map<String, Room> getViewRooms() {
        return this.viewRooms;
    }

    public long getWholeEventEndTime() {
        return this.wholeEventEndTime;
    }

    public boolean isAllDay() {
        return this.isAllDay;
    }

    public boolean isCanEnterOrCreateGroup() {
        return this.canEnterOrCreateGroup;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("topic = " + this.topic + ", ");
        sb.append("description = " + this.description + ", ");
        sb.append("canEnterOrCreateGroup = " + this.canEnterOrCreateGroup + ", ");
        sb.append("isAllDay = " + this.isAllDay + ", ");
        sb.append("creatorId = " + this.creatorId + ", ");
        List<CalendarLocation> list = this.locations;
        if (list == null || list.size() <= 0 || this.locations.get(0) == null) {
            sb.append("locations = null, ");
        } else {
            sb.append("locations = " + this.locations.get(0).toString() + ", ");
        }
        sb.append("groupId = " + this.groupId + ", ");
        sb.append("}");
        return sb.toString();
    }

    public void setAllDay(boolean z) {
        this.isAllDay = z;
    }

    public void setCanEnterOrCreateGroup(boolean z) {
        this.canEnterOrCreateGroup = z;
    }

    public void setCreatorId(String str) {
        this.creatorId = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setEventType(EventType eventType2) {
        this.eventType = eventType2;
    }

    public void setGroupId(long j) {
        this.groupId = j;
    }

    public void setLocations(List<CalendarLocation> list) {
        this.locations = list;
    }

    public void setOrganizerId(String str) {
        this.organizerId = str;
    }

    public void setRoomMeetingStatus(Map<String, RoomMeetingStatus> map) {
        this.roomMeetingStatus = map;
    }

    public void setRoomStatus(Map<String, CalendarAcceptStatus> map) {
        this.roomStatus = map;
    }

    public void setRooms(Map<String, Room> map) {
        this.rooms = map;
    }

    public void setSubtitles(Map<String, String> map) {
        this.subtitles = map;
    }

    public void setTheEventEndTime(long j) {
        this.theEventEndTime = j;
    }

    public void setTheEventStartTime(long j) {
        this.theEventStartTime = j;
    }

    public void setTopic(String str) {
        this.topic = str;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public void setUserMeetingStatus(Map<String, ChatterMeetingStatus> map) {
        this.userMeetingStatus = map;
    }

    public void setUserStatus(Map<String, CalendarAcceptStatus> map) {
        this.userStatus = map;
    }

    public void setUsers(Map<String, OpenChatter> map) {
        this.users = map;
    }

    public void setVersionSupport(Map<String, Boolean> map) {
        this.versionSupport = map;
    }

    public void setViewRooms(Map<String, Room> map) {
        this.viewRooms = map;
    }

    public void setWholeEventEndTime(long j) {
        this.wholeEventEndTime = j;
    }
}
