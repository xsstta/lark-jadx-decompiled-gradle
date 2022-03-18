package com.bytedance.ee.lark.infra.storage.sp.base;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;

/* renamed from: com.bytedance.ee.lark.infra.storage.sp.base.e */
public abstract class AbstractC12907e implements AppBaseStorage.AbstractC12902a {

    /* renamed from: a */
    protected IAppContext f34405a;

    /* renamed from: com.bytedance.ee.lark.infra.storage.sp.base.e$1 */
    static /* synthetic */ class C129081 {

        /* renamed from: a */
        static final /* synthetic */ int[] f34406a;

        static {
            int[] iArr = new int[AppBaseStorage.StorageType.values().length];
            f34406a = iArr;
            try {
                iArr[AppBaseStorage.StorageType.APP_SHARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public AbstractC12907e(IAppContext iAppContext) {
        this.f34405a = iAppContext;
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage.AbstractC12902a
    /* renamed from: a */
    public String mo48675a(AppBaseStorage.StorageType storageType) {
        if (C129081.f34406a[storageType.ordinal()] == 1) {
            return Storage.getStorageFilePrefix("app_share_storage") + this.f34405a.getAppId();
        }
        throw new RuntimeException("illegal storage type:" + storageType);
    }
}
