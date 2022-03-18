package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import java.io.Serializable;
import java.util.List;

public class CalendarResource implements Serializable {
    private String buildingId;
    private String calendarId;
    private int capacity;
    private String description;
    private String floorName;
    private String id;
    private boolean isDisabled;
    private List<MeetingRoomEquipment> mEquipments;
    private SchemaExtraData mSchemaExtraData;
    private String name;
    private CalendarSchemaCollection resourceSchema;
    private Status status = Status.FREE;
    private String tenantId;
    private Type type = Type.OTHER;
    private int weight;

    public enum Status {
        FREE(1),
        BUSY(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Status valueOf(int i) {
            return forNumber(i);
        }

        public static Status forNumber(int i) {
            if (i == 1) {
                return FREE;
            }
            if (i != 2) {
                return null;
            }
            return BUSY;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum Type {
        MEETING_ROOM(1),
        OTHER(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 1) {
                return MEETING_ROOM;
            }
            if (i != 2) {
                return null;
            }
            return OTHER;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public String getBuildingId() {
        return this.buildingId;
    }

    public String getCalendarId() {
        return this.calendarId;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getDescription() {
        return this.description;
    }

    public List<MeetingRoomEquipment> getEquipments() {
        return this.mEquipments;
    }

    public String getFloorName() {
        return this.floorName;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public CalendarSchemaCollection getResourceSchema() {
        return this.resourceSchema;
    }

    public SchemaExtraData getSchemaExtraData() {
        return this.mSchemaExtraData;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public Type getType() {
        return this.type;
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean isDisabled() {
        return this.isDisabled;
    }

    public void setBuildingId(String str) {
        this.buildingId = str;
    }

    public void setCalendarId(String str) {
        this.calendarId = str;
    }

    public void setCapacity(int i) {
        this.capacity = i;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDisabled(boolean z) {
        this.isDisabled = z;
    }

    public void setEquipments(List<MeetingRoomEquipment> list) {
        this.mEquipments = list;
    }

    public void setFloorName(String str) {
        this.floorName = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setResourceSchema(CalendarSchemaCollection calendarSchemaCollection) {
        this.resourceSchema = calendarSchemaCollection;
    }

    public void setSchemaExtraData(SchemaExtraData schemaExtraData) {
        this.mSchemaExtraData = schemaExtraData;
    }

    public void setStatus(Status status2) {
        this.status = status2;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setType(Type type2) {
        this.type = type2;
    }

    public void setWeight(int i) {
        this.weight = i;
    }
}
