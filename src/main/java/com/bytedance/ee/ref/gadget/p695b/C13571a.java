package com.bytedance.ee.ref.gadget.p695b;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.he.jsbinding.snapshot.ISnapshotService;
import com.he.jsbinding.snapshot.SnapshotServiceImpl;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.refer.impl.business.file.AbstractC67918a;
import java.io.File;

/* renamed from: com.bytedance.ee.ref.gadget.b.a */
public class C13571a extends AbstractC67918a {
    /* access modifiers changed from: protected */
    @Override // com.tt.refer.impl.business.file.AbstractC67918a
    /* renamed from: b */
    public String mo50171b() {
        return "appbrand";
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.impl.business.file.AbstractC67918a
    /* renamed from: c */
    public long mo50172c() {
        return 10485760;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.impl.business.file.AbstractC67918a
    /* renamed from: d */
    public String mo50173d() {
        return mo235641m().getAppId();
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.impl.business.file.AbstractC67918a
    /* renamed from: a */
    public String mo50170a() {
        return "TT" + File.separator + "sandbox";
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.impl.business.file.AbstractC67918a
    /* renamed from: e */
    public String mo50174e() {
        String md5Hex = CharacterUtils.md5Hex(mo235642n().mo235096a());
        if (!TextUtils.isEmpty(md5Hex)) {
            return md5Hex;
        }
        AppBrandLogger.m52829e("GadgetFileManager", "get user id is null");
        return "";
    }

    public C13571a(IAppContext iAppContext) {
        super(iAppContext);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.impl.business.file.AbstractC67918a
    /* renamed from: a */
    public void mo50369a(File file, String str) {
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(mo235641m());
        if (inst != null) {
            ISnapshotService iSnapshotService = (ISnapshotService) inst.getService(SnapshotServiceImpl.class);
            if (iSnapshotService == null) {
                AppBrandLogger.m52830i("GadgetFileManager", "iSnapshotService is null");
            } else if (iSnapshotService.isRunningInSeparateProcess()) {
                AppBrandLogger.m52830i("GadgetFileManager", "running in separate process");
                return;
            }
        } else {
            AppBrandLogger.m52830i("GadgetFileManager", "AppbrandApplicationImpl is null");
        }
        super.mo50369a(file, str);
    }
}
