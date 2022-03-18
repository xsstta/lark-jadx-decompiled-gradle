package com.larksuite.component.blockit.entity;

import com.larksuite.component.blockit.p1067b.C24050a;

public enum BlockTypeID {
    CHAT("blk_6050a8c652000014699aca15", "blk_5f9911efc34e8004f8d44a05"),
    MESSAGE("blk_5f9911efc34e8004f8d44a06", "blk_5f9911efc34e8004f8d44a06"),
    EVENT("blk_604f3523070000133c9aca12", "blk_5f9911a7151940042e838a05"),
    CALENDAR("blk_5f8f7ccba955c00192cf0cf3", ""),
    CCM("blk_60506a33c3800013f81aca12", "blk_5f9911cb7bd60001404cca03"),
    TODO("blk_6050b23eebc00014d05aca15", "blk_5fe05d609999c003a2030a02");
    
    private String onlineValue;
    private String stagingValue;

    public String getValue() {
        int i = C240751.f59503a[C24050a.m87868c().ordinal()];
        if (i == 1) {
            return this.stagingValue;
        }
        if (i == 2 || i == 3) {
            return this.onlineValue;
        }
        return this.stagingValue;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.blockit.entity.BlockTypeID$1 */
    public static /* synthetic */ class C240751 {

        /* renamed from: a */
        static final /* synthetic */ int[] f59503a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.larksuite.component.blockit.entity.BlockitEnv[] r0 = com.larksuite.component.blockit.entity.BlockitEnv.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.blockit.entity.BlockTypeID.C240751.f59503a = r0
                com.larksuite.component.blockit.entity.BlockitEnv r1 = com.larksuite.component.blockit.entity.BlockitEnv.STAGING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.blockit.entity.BlockTypeID.C240751.f59503a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.blockit.entity.BlockitEnv r1 = com.larksuite.component.blockit.entity.BlockitEnv.PRE_RELEASE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.blockit.entity.BlockTypeID.C240751.f59503a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.blockit.entity.BlockitEnv r1 = com.larksuite.component.blockit.entity.BlockitEnv.ONLINE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.blockit.entity.BlockTypeID.C240751.<clinit>():void");
        }
    }

    private BlockTypeID(String str, String str2) {
        this.stagingValue = str;
        this.onlineValue = str2;
    }
}
