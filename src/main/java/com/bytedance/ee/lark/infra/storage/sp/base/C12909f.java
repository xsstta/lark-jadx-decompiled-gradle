package com.bytedance.ee.lark.infra.storage.sp.base;

import android.content.Context;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;

/* renamed from: com.bytedance.ee.lark.infra.storage.sp.base.f */
public class C12909f extends AbstractC12903a {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.storage.sp.base.AbstractC12903a
    /* renamed from: a */
    public String mo48673a() {
        return Storage.getStorageFilePrefix("engine_user_share");
    }

    public C12909f(Context context) {
        super(context, 10485760, 1048576);
    }
}
