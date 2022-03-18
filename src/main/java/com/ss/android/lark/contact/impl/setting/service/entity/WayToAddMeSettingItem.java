package com.ss.android.lark.contact.impl.setting.service.entity;

public class WayToAddMeSettingItem {

    /* renamed from: a */
    private final AddMeType f93204a;

    /* renamed from: b */
    private final boolean f93205b;

    public enum AddMeType {
        UNKNOWN(0),
        GROUP_CHAT(1),
        CONTACT_TOKEN(2),
        PROFILE(3),
        DOCUMENT(4),
        SCHEDULE(5),
        MEETING(6),
        MAIL(7),
        NAME_CARD(8);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static AddMeType valueOf(int i) {
            return forNumber(i);
        }

        public static AddMeType forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return GROUP_CHAT;
                case 2:
                    return CONTACT_TOKEN;
                case 3:
                    return PROFILE;
                case 4:
                    return DOCUMENT;
                case 5:
                    return SCHEDULE;
                case 6:
                    return MEETING;
                case 7:
                    return MAIL;
                case 8:
                    return NAME_CARD;
                default:
                    return null;
            }
        }

        private AddMeType(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public AddMeType mo132601a() {
        return this.f93204a;
    }

    /* renamed from: b */
    public boolean mo132602b() {
        return this.f93205b;
    }

    public WayToAddMeSettingItem(AddMeType addMeType, boolean z) {
        this.f93204a = addMeType;
        this.f93205b = z;
    }
}
