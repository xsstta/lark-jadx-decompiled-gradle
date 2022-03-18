package com.bytedance.ee.lark.infra.storage.sp.biz.p641a;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.base.AbstractC12907e;
import com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;

/* renamed from: com.bytedance.ee.lark.infra.storage.sp.biz.a.c */
public class C12915c extends AbstractC12907e {

    /* renamed from: com.bytedance.ee.lark.infra.storage.sp.biz.a.c$1 */
    static /* synthetic */ class C129161 {

        /* renamed from: a */
        static final /* synthetic */ int[] f34411a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage$StorageType[] r0 = com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage.StorageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.lark.infra.storage.sp.biz.p641a.C12915c.C129161.f34411a = r0
                com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage$StorageType r1 = com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage.StorageType.APP_SANDBOX     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.lark.infra.storage.sp.biz.p641a.C12915c.C129161.f34411a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage$StorageType r1 = com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage.StorageType.APP_ENGINE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.storage.sp.biz.p641a.C12915c.C129161.<clinit>():void");
        }
    }

    public C12915c(IAppContext iAppContext) {
        super(iAppContext);
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.base.AbstractC12907e, com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage.AbstractC12902a
    /* renamed from: a */
    public String mo48675a(AppBaseStorage.StorageType storageType) {
        int i = C129161.f34411a[storageType.ordinal()];
        if (i == 1) {
            return Storage.getStorageFilePrefix("tma_storage_") + this.f34405a.getAppId();
        } else if (i != 2) {
            return super.mo48675a(storageType);
        } else {
            return Storage.getStorageFilePrefix("tma_i_storage_") + this.f34405a.getAppId();
        }
    }
}
