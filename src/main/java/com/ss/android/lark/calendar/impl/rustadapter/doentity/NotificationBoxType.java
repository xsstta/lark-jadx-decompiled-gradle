package com.ss.android.lark.calendar.impl.rustadapter.doentity;

public class NotificationBoxType {

    /* renamed from: a */
    private BoxSubjectType f83574a = BoxSubjectType.NO_NOTIFICATION_BOX;

    /* renamed from: b */
    private MeetingEventSpecialRule f83575b = MeetingEventSpecialRule.NOTHING;

    /* renamed from: c */
    private MailAttendeeSpecialRule f83576c = MailAttendeeSpecialRule.MAIL_RULE_NOTHING;

    public enum BoxSubjectType {
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
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static BoxSubjectType valueOf(int i) {
            return forNumber(i);
        }

        public static BoxSubjectType forNumber(int i) {
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

        private BoxSubjectType(int i) {
            this.value = i;
        }
    }

    public enum MailAttendeeSpecialRule {
        MAIL_RULE_NOTHING(0),
        ADD_MAIL_ATTENDEES_DEFAULT_RECEIVE_NOTIFICATION_SUBTITLE(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static MailAttendeeSpecialRule valueOf(int i) {
            return forNumber(i);
        }

        public static MailAttendeeSpecialRule forNumber(int i) {
            if (i == 0) {
                return MAIL_RULE_NOTHING;
            }
            if (i != 1) {
                return MAIL_RULE_NOTHING;
            }
            return ADD_MAIL_ATTENDEES_DEFAULT_RECEIVE_NOTIFICATION_SUBTITLE;
        }

        private MailAttendeeSpecialRule(int i) {
            this.value = i;
        }
    }

    public enum MeetingEventSpecialRule {
        NOTHING(0),
        ADD_ALL_ATTENDEES_ENTER_NEW_MEETING_GROUP_SUBTITLE(1),
        POP_ALL_ATTENDEES_ENTER_NEW_MEETING_GROUP_BOX(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static MeetingEventSpecialRule valueOf(int i) {
            return forNumber(i);
        }

        public static MeetingEventSpecialRule forNumber(int i) {
            if (i == 1) {
                return ADD_ALL_ATTENDEES_ENTER_NEW_MEETING_GROUP_SUBTITLE;
            }
            if (i != 2) {
                return NOTHING;
            }
            return POP_ALL_ATTENDEES_ENTER_NEW_MEETING_GROUP_BOX;
        }

        private MeetingEventSpecialRule(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public BoxSubjectType mo119918a() {
        return this.f83574a;
    }

    /* renamed from: b */
    public MeetingEventSpecialRule mo119922b() {
        return this.f83575b;
    }

    /* renamed from: c */
    public MailAttendeeSpecialRule mo119923c() {
        return this.f83576c;
    }

    /* renamed from: a */
    public void mo119919a(BoxSubjectType boxSubjectType) {
        this.f83574a = boxSubjectType;
    }

    /* renamed from: a */
    public void mo119920a(MailAttendeeSpecialRule mailAttendeeSpecialRule) {
        this.f83576c = mailAttendeeSpecialRule;
    }

    /* renamed from: a */
    public void mo119921a(MeetingEventSpecialRule meetingEventSpecialRule) {
        this.f83575b = meetingEventSpecialRule;
    }
}
