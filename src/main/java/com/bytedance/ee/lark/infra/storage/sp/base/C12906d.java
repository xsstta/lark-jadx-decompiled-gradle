package com.bytedance.ee.lark.infra.storage.sp.base;

import android.content.Context;
import com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage;

/* renamed from: com.bytedance.ee.lark.infra.storage.sp.base.d */
public class C12906d extends AppBaseStorage {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage
    /* renamed from: h */
    public AppBaseStorage.StorageType mo48674h() {
        return AppBaseStorage.StorageType.APP_SHARE;
    }

    public C12906d(Context context, AppBaseStorage.AbstractC12902a aVar) {
        super(context, 10485760, 1048576, aVar);
    }
}
