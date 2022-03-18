package com.ss.android.vc.entity.response;

public class CalendarVCSettingsEntity {

    /* renamed from: a */
    public VCSecuritySetting f152571a = VCSecuritySetting.PUBLIC;

    /* renamed from: b */
    public boolean f152572b;

    /* renamed from: c */
    public boolean f152573c;

    /* renamed from: d */
    public boolean f152574d;

    /* renamed from: e */
    public boolean f152575e;

    public enum VCSecuritySetting {
        PUBLIC(0),
        SAME_TENANT(1),
        ONLY_CALENDAR_GUEST(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static VCSecuritySetting forNumber(int i) {
            if (i == 0) {
                return PUBLIC;
            }
            if (i == 1) {
                return SAME_TENANT;
            }
            if (i != 2) {
                return null;
            }
            return ONLY_CALENDAR_GUEST;
        }

        private VCSecuritySetting(int i) {
            this.value = i;
        }
    }
}
