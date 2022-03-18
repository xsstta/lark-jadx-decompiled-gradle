package com.bytedance.lark.pb.calendar.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum NotificationBoxType implements WireEnum {
    NO_NOTIFICATION_BOX(0),
    CREATE_WITH_OTHER_ATTENDEES(1),
    EDIT_INFO_WITH_OTHER_ATTENDEES(2),
    EDIT_ADD_ATTENDEES(3),
    EDIT_REMOVE_ATTENDEES(4),
    EDIT_INFO_AND_ADD_ATTENDEES(5),
    EDIT_INFO_AND_REMOVE_ATTENDEES(6),
    EDIT_INFO_AND_REMOVE_ALL_OTHER_ATTENDEES(7),
    EDIT_ADD_AND_REMOVE_ATTENDEES(8),
    EDIT_INFO_AND_ADD_AND_REMOVE_ATTENDEES(9),
    DELETE_WITH_OTHER_ATTENDEES(10),
    DELETE_MEETING(11);
    
    public static final ProtoAdapter<NotificationBoxType> ADAPTER = ProtoAdapter.newEnumAdapter(NotificationBoxType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static NotificationBoxType fromValue(int i) {
        switch (i) {
            case 0:
                return NO_NOTIFICATION_BOX;
            case 1:
                return CREATE_WITH_OTHER_ATTENDEES;
            case 2:
                return EDIT_INFO_WITH_OTHER_ATTENDEES;
            case 3:
                return EDIT_ADD_ATTENDEES;
            case 4:
                return EDIT_REMOVE_ATTENDEES;
            case 5:
                return EDIT_INFO_AND_ADD_ATTENDEES;
            case 6:
                return EDIT_INFO_AND_REMOVE_ATTENDEES;
            case 7:
                return EDIT_INFO_AND_REMOVE_ALL_OTHER_ATTENDEES;
            case 8:
                return EDIT_ADD_AND_REMOVE_ATTENDEES;
            case 9:
                return EDIT_INFO_AND_ADD_AND_REMOVE_ATTENDEES;
            case 10:
                return DELETE_WITH_OTHER_ATTENDEES;
            case 11:
                return DELETE_MEETING;
            default:
                return null;
        }
    }

    private NotificationBoxType(int i) {
        this.value = i;
    }
}
