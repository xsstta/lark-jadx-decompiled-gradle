package com.tt.refer.impl.business.p3435f;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p639b.C12897a;
import com.bytedance.ee.lark.infra.storage.sp.base.AbstractC12903a;
import com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage;
import com.bytedance.ee.lark.infra.storage.sp.base.C12904b;
import com.bytedance.ee.lark.infra.storage.sp.base.C12905c;
import com.bytedance.ee.lark.infra.storage.sp.base.C12906d;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.bytedance.ee.lark.infra.storage.sp.biz.SetValueIOException;
import org.json.JSONArray;

/* renamed from: com.tt.refer.impl.business.f.a */
public class C67916a implements AbstractC12910a {

    /* renamed from: a */
    private IAppContext f171059a;

    /* renamed from: b */
    private AbstractC12903a f171060b;

    /* renamed from: c */
    private AbstractC12903a f171061c;

    /* renamed from: d */
    private AbstractC12903a f171062d;

    /* renamed from: e */
    private C12897a f171063e = new C12897a();

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public IAppContext getAppContext() {
        return this.f171059a;
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: b */
    public long mo48694b() {
        return mo48695b(AppBaseStorage.StorageType.APP_SANDBOX);
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: c */
    public long mo48698c() {
        return mo48699c(AppBaseStorage.StorageType.APP_SANDBOX);
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: d */
    public JSONArray mo48702d() {
        return mo48703d(AppBaseStorage.StorageType.APP_SANDBOX);
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: e */
    public void mo48705e() {
        mo235575e(AppBaseStorage.StorageType.APP_SANDBOX);
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: a */
    public boolean mo48689a() {
        return mo48690a(AppBaseStorage.StorageType.APP_SANDBOX);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.refer.impl.business.f.a$1 */
    public static /* synthetic */ class C679171 {

        /* renamed from: a */
        static final /* synthetic */ int[] f171064a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage$StorageType[] r0 = com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage.StorageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tt.refer.impl.business.p3435f.C67916a.C679171.f171064a = r0
                com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage$StorageType r1 = com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage.StorageType.APP_SANDBOX     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.tt.refer.impl.business.p3435f.C67916a.C679171.f171064a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage$StorageType r1 = com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage.StorageType.APP_ENGINE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.tt.refer.impl.business.p3435f.C67916a.C679171.f171064a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage$StorageType r1 = com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage.StorageType.APP_SHARE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.refer.impl.business.p3435f.C67916a.C679171.<clinit>():void");
        }
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: a */
    public String mo48688a(String str) {
        return this.f171063e.mo48649a(str);
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: b */
    public long mo48695b(AppBaseStorage.StorageType storageType) {
        return m264236f(storageType).mo48680c();
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: c */
    public long mo48699c(AppBaseStorage.StorageType storageType) {
        return m264236f(storageType).mo48682d();
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: d */
    public JSONArray mo48703d(AppBaseStorage.StorageType storageType) {
        return m264236f(storageType).mo48683e();
    }

    /* renamed from: e */
    public void mo235575e(AppBaseStorage.StorageType storageType) {
        m264236f(storageType).mo48684f();
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: c */
    public String mo48700c(String str) {
        return mo48696b(AppBaseStorage.StorageType.APP_SANDBOX, str);
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: d */
    public boolean mo48704d(String str) {
        return mo48701c(AppBaseStorage.StorageType.APP_SANDBOX, str);
    }

    /* renamed from: f */
    private AbstractC12903a m264236f(AppBaseStorage.StorageType storageType) {
        int i = C679171.f171064a[storageType.ordinal()];
        if (i == 1) {
            return this.f171060b;
        }
        if (i == 2) {
            return this.f171061c;
        }
        if (i == 3) {
            return this.f171062d;
        }
        throw new RuntimeException("illegal storage type!");
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: a */
    public boolean mo48690a(AppBaseStorage.StorageType storageType) {
        return m264236f(storageType).mo48679b();
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: b */
    public String mo48697b(String str) {
        return mo48687a(AppBaseStorage.StorageType.APP_SANDBOX, str);
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: a */
    public String mo48687a(AppBaseStorage.StorageType storageType, String str) {
        return m264236f(storageType).mo48676a(str);
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: b */
    public String mo48696b(AppBaseStorage.StorageType storageType, String str) {
        return m264236f(storageType).mo48678b(str);
    }

    public C67916a(IAppContext iAppContext, AppBaseStorage.AbstractC12902a aVar) {
        this.f171059a = iAppContext;
        this.f171060b = new C12905c(iAppContext.getApplicationContext(), aVar);
        this.f171061c = new C12904b(iAppContext.getApplicationContext(), aVar);
        this.f171062d = new C12906d(iAppContext.getApplicationContext(), aVar);
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: c */
    public boolean mo48701c(AppBaseStorage.StorageType storageType, String str) {
        return m264236f(storageType).mo48681c(str);
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: a */
    public boolean mo48692a(String str, String str2, long j) {
        return this.f171063e.mo48650a(str, str2, j);
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: a */
    public boolean mo48693a(String str, String str2, String str3) throws SetValueIOException {
        return mo48691a(AppBaseStorage.StorageType.APP_SANDBOX, str, str2, str3);
    }

    @Override // com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a
    /* renamed from: a */
    public boolean mo48691a(AppBaseStorage.StorageType storageType, String str, String str2, String str3) throws SetValueIOException {
        return m264236f(storageType).mo48677a(str, str2, str3);
    }
}
