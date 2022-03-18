package com.ss.android.vc.meeting.module.tab3.list.mvp.repo;

public enum VCTabFunctionItemType {
    NONE,
    CREATE_MEETING,
    JOIN_MEETING,
    MEETING_MINUTES,
    SCHEDULE_MEETING,
    ENTERPRISE_PHONE;

    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType$1 */
    static /* synthetic */ class C633831 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160036a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType[] r0 = com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType.C633831.f160036a = r0
                com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType r1 = com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType.CREATE_MEETING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType.C633831.f160036a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType r1 = com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType.JOIN_MEETING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType.C633831.f160036a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType r1 = com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType.MEETING_MINUTES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType.C633831.f160036a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType r1 = com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType.SCHEDULE_MEETING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType.C633831.f160036a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType r1 = com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType.ENTERPRISE_PHONE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType.C633831.<clinit>():void");
        }
    }

    public static VCTabFunctionItemType fromValue(int i) {
        if (i == 0) {
            return CREATE_MEETING;
        }
        if (i == 1) {
            return JOIN_MEETING;
        }
        if (i == 2) {
            return MEETING_MINUTES;
        }
        if (i == 3) {
            return SCHEDULE_MEETING;
        }
        if (i != 4) {
            return NONE;
        }
        return ENTERPRISE_PHONE;
    }

    public static int valueOf(VCTabFunctionItemType vCTabFunctionItemType) {
        int i = C633831.f160036a[vCTabFunctionItemType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return -1;
        }
        return 4;
    }
}
