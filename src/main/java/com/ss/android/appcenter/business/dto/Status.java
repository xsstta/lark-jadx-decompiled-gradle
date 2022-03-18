package com.ss.android.appcenter.business.dto;

public enum Status {
    AVAILABLE(0),
    TENANT_STOP(2),
    PLATFORM_STOP(3),
    DEVELOPOR_STOP(4),
    OFFLINE(5),
    UNAUTHORIZED(6),
    DELETE(8),
    UNKNOWN(100);
    
    private int value;

    public int getValue() {
        return this.value;
    }

    /* renamed from: com.ss.android.appcenter.business.dto.Status$1 */
    static /* synthetic */ class C276921 {

        /* renamed from: a */
        static final /* synthetic */ int[] f69180a;

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
                com.ss.android.appcenter.business.dto.Status[] r0 = com.ss.android.appcenter.business.dto.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.appcenter.business.dto.Status.C276921.f69180a = r0
                com.ss.android.appcenter.business.dto.Status r1 = com.ss.android.appcenter.business.dto.Status.TENANT_STOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.appcenter.business.dto.Status.C276921.f69180a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.appcenter.business.dto.Status r1 = com.ss.android.appcenter.business.dto.Status.PLATFORM_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.appcenter.business.dto.Status.C276921.f69180a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.appcenter.business.dto.Status r1 = com.ss.android.appcenter.business.dto.Status.DEVELOPOR_STOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.appcenter.business.dto.Status.C276921.f69180a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.appcenter.business.dto.Status r1 = com.ss.android.appcenter.business.dto.Status.OFFLINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.appcenter.business.dto.Status.C276921.f69180a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.appcenter.business.dto.Status r1 = com.ss.android.appcenter.business.dto.Status.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.business.dto.Status.C276921.<clinit>():void");
        }
    }

    public static boolean isAvailable(Status status) {
        if (AVAILABLE == status) {
            return true;
        }
        return false;
    }

    public static boolean isUnauthorized(Status status) {
        if (UNAUTHORIZED == status) {
            return true;
        }
        return false;
    }

    public static boolean isUnavailable(Status status) {
        if (status == null || AVAILABLE == status) {
            return false;
        }
        return true;
    }

    public static boolean isDeactivated(Status status) {
        if (status == null) {
            return false;
        }
        int i = C276921.f69180a[status.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            return true;
        }
        return false;
    }

    public static Status fromValue(int i) {
        if (i == 0) {
            return AVAILABLE;
        }
        if (i == 8) {
            return DELETE;
        }
        if (i == 100) {
            return UNKNOWN;
        }
        if (i == 2) {
            return TENANT_STOP;
        }
        if (i == 3) {
            return PLATFORM_STOP;
        }
        if (i == 4) {
            return DEVELOPOR_STOP;
        }
        if (i == 5) {
            return OFFLINE;
        }
        if (i != 6) {
            return UNKNOWN;
        }
        return UNAUTHORIZED;
    }

    private Status(int i) {
        this.value = i;
    }
}
