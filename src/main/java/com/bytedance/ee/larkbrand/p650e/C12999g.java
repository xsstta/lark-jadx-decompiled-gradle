package com.bytedance.ee.larkbrand.p650e;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.tt.option.p3383d.C67611a;

/* renamed from: com.bytedance.ee.larkbrand.e.g */
public class C12999g extends C67611a {
    @Override // com.tt.option.p3383d.C67611a, com.tt.option.p3383d.AbstractC67612b
    public String getPrefixPath() {
        String md5Hex = CharacterUtils.md5Hex(LarkExtensionManager.getInstance().getExtension().mo49566c());
        if (!TextUtils.isEmpty(md5Hex)) {
            return md5Hex;
        }
        AppBrandLogger.m52829e("LarkOptionFileDirDependImpl", "prefix path is null");
        return "";
    }

    @Override // com.tt.option.p3383d.C67611a, com.tt.option.p3383d.AbstractC67612b
    public String getSpPrefixPath() {
        String md5Hex = CharacterUtils.md5Hex(LarkExtensionManager.getInstance().getExtension().mo49566c());
        if (TextUtils.isEmpty(md5Hex)) {
            AppBrandLogger.m52829e("LarkOptionFileDirDependImpl", "sp prefix path is null");
            return "";
        }
        return md5Hex + "_";
    }
}
