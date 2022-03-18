package com.larksuite.component.openplatform.core.block;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.impl.business.file.AbstractC67918a;
import java.io.File;

/* renamed from: com.larksuite.component.openplatform.core.block.c */
public class C24411c extends AbstractC67918a {
    /* access modifiers changed from: protected */
    @Override // com.tt.refer.impl.business.file.AbstractC67918a
    /* renamed from: b */
    public String mo50171b() {
        return "block";
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
        return "TT" + File.separator + "sandbox_block";
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.impl.business.file.AbstractC67918a
    /* renamed from: e */
    public String mo50174e() {
        String md5Hex = CharacterUtils.md5Hex(mo235642n().mo235096a());
        if (!TextUtils.isEmpty(md5Hex)) {
            return md5Hex;
        }
        AppBrandLogger.m52829e("BlockFileManager", "get user id is null");
        return "";
    }

    public C24411c(IAppContext iAppContext) {
        super(iAppContext);
    }
}
