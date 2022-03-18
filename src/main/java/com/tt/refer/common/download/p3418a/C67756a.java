package com.tt.refer.common.download.p3418a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.tt.refer.common.download.engine.model.IVerifyHandler;
import java.io.File;

/* renamed from: com.tt.refer.common.download.a.a */
public class C67756a implements IVerifyHandler {

    /* renamed from: a */
    private String f170645a;

    public C67756a(String str) {
        this.f170645a = str;
    }

    @Override // com.tt.refer.common.download.engine.model.IVerifyHandler
    /* renamed from: a */
    public int mo235151a(File file) {
        try {
            if (TextUtils.isEmpty(this.f170645a)) {
                AppBrandLogger.m52829e("app_start_load_default_verify", "md5 is empty!!!");
                return 1;
            }
            String calculateMD5 = IOUtils.calculateMD5(file, 10240);
            if (calculateMD5 == null) {
                AppBrandLogger.m52829e("app_start_load_default_verify", "no calculatedDigest");
                return 2;
            } else if (calculateMD5.toLowerCase().startsWith(this.f170645a)) {
                return 0;
            } else {
                AppBrandLogger.m52829e("app_start_load_default_verify", "md5 not ok");
                return 3;
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("app_start_load_default_verify", "DefaultVerifyHandler-->exception:", e.getMessage());
            return 4;
        }
    }
}
