package com.bytedance.ug.sdk.share.api.entity;

public enum ShareStrategy {
    NORMAL,
    SHARE_WITH_COMPONENT,
    SHARE_WITH_TOKEN,
    SHARE_WITH_COMPONET_OPTIMIZE,
    SHARE_WITH_IMAGE_TOKEN,
    SHARE_WITH_VIDEO;

    /* renamed from: com.bytedance.ug.sdk.share.api.entity.ShareStrategy$1 */
    static /* synthetic */ class C208141 {

        /* renamed from: a */
        static final /* synthetic */ int[] f50959a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.ug.sdk.share.api.entity.ShareStrategy[] r0 = com.bytedance.ug.sdk.share.api.entity.ShareStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ug.sdk.share.api.entity.ShareStrategy.C208141.f50959a = r0
                com.bytedance.ug.sdk.share.api.entity.ShareStrategy r1 = com.bytedance.ug.sdk.share.api.entity.ShareStrategy.SHARE_WITH_COMPONENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ug.sdk.share.api.entity.ShareStrategy.C208141.f50959a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ug.sdk.share.api.entity.ShareStrategy r1 = com.bytedance.ug.sdk.share.api.entity.ShareStrategy.SHARE_WITH_TOKEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ug.sdk.share.api.entity.ShareStrategy.C208141.f50959a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ug.sdk.share.api.entity.ShareStrategy r1 = com.bytedance.ug.sdk.share.api.entity.ShareStrategy.SHARE_WITH_COMPONET_OPTIMIZE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ug.sdk.share.api.entity.ShareStrategy.C208141.f50959a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ug.sdk.share.api.entity.ShareStrategy r1 = com.bytedance.ug.sdk.share.api.entity.ShareStrategy.SHARE_WITH_IMAGE_TOKEN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ug.sdk.share.api.entity.ShareStrategy.C208141.f50959a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.ug.sdk.share.api.entity.ShareStrategy r1 = com.bytedance.ug.sdk.share.api.entity.ShareStrategy.SHARE_WITH_VIDEO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.ug.sdk.share.api.entity.ShareStrategy.C208141.f50959a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.ug.sdk.share.api.entity.ShareStrategy r1 = com.bytedance.ug.sdk.share.api.entity.ShareStrategy.NORMAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ug.sdk.share.api.entity.ShareStrategy.C208141.<clinit>():void");
        }
    }

    public static String getStrategyStr(ShareStrategy shareStrategy) {
        if (shareStrategy == null) {
            return "";
        }
        int i = C208141.f50959a[shareStrategy.ordinal()];
        if (i == 1) {
            return "sys";
        }
        if (i == 2) {
            return "token";
        }
        if (i == 3) {
            return "sys_opt";
        }
        if (i == 4) {
            return "image";
        }
        if (i != 5) {
            return "sdk";
        }
        return "video";
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static ShareStrategy getStrategyByType(String str) {
        char c;
        switch (str.hashCode()) {
            case -1737986495:
                if (str.equals("sys_opt")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 113722:
                if (str.equals("sdk")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 114381:
                if (str.equals("sys")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 100313435:
                if (str.equals("image")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 110541305:
                if (str.equals("token")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 112202875:
                if (str.equals("video")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return SHARE_WITH_COMPONENT;
        }
        if (c == 1) {
            return SHARE_WITH_TOKEN;
        }
        if (c == 2) {
            return SHARE_WITH_COMPONET_OPTIMIZE;
        }
        if (c == 3) {
            return SHARE_WITH_IMAGE_TOKEN;
        }
        if (c != 4) {
            return NORMAL;
        }
        return SHARE_WITH_VIDEO;
    }
}
