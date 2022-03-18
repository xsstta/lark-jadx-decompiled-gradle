package com.bytedance.ee.lark.infra.storage.sp.base;

import android.content.Context;

public abstract class AppBaseStorage extends AbstractC12903a {

    /* renamed from: c */
    private AbstractC12902a f34398c;

    public enum StorageType {
        APP_SANDBOX,
        APP_ENGINE,
        APP_SHARE
    }

    /* renamed from: com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage$a */
    public interface AbstractC12902a {
        /* renamed from: a */
        String mo48675a(StorageType storageType);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract StorageType mo48674h();

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.storage.sp.base.AbstractC12903a
    /* renamed from: a */
    public String mo48673a() {
        return this.f34398c.mo48675a(mo48674h());
    }

    public AppBaseStorage(Context context, long j, long j2, AbstractC12902a aVar) {
        super(context, j, j2);
        this.f34398c = aVar;
    }
}
