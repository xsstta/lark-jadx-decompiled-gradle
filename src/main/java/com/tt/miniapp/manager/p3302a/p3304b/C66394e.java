package com.tt.miniapp.manager.p3302a.p3304b;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.manager.p3302a.C66389b;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.util.AppbrandUtil;
import java.io.File;

/* renamed from: com.tt.miniapp.manager.a.b.e */
public class C66394e extends AbstractC66390a {

    /* renamed from: d */
    private final String f167622d = "ClearNotUsedBaseBundleHandler";

    @Override // com.tt.miniapp.manager.p3302a.p3304b.AbstractC66390a
    /* renamed from: a */
    public C66391b mo231908a(Context context, C66391b bVar) {
        try {
            File oldBaseBundleDir = AppbrandConstant.getOldBaseBundleDir();
            if (oldBaseBundleDir != null && oldBaseBundleDir.exists()) {
                IOUtils.delete(oldBaseBundleDir);
            }
            Application applicationContext = AppbrandContext.getInst().getApplicationContext();
            for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
                if (iAppSandboxEnvProcessor != null && iAppSandboxEnvProcessor.hasSandboxExist(applicationContext)) {
                    return bVar;
                }
            }
            AppBrandLogger.m52828d("ClearNotUsedBaseBundleHandler", "clean old version base bundle");
            File a = C66389b.m259574a();
            if (!a.exists()) {
                return bVar;
            }
            File appServiceDir = AppbrandUtil.getAppServiceDir(applicationContext);
            long parseLong = Long.parseLong(CharacterUtils.replaceBlank(IOUtils.readString(a.getAbsolutePath(), "UTF-8")));
            String d = C66389b.m259584d();
            String convertVersionCodeToStr = AppbrandUtil.convertVersionCodeToStr(parseLong);
            if (!TextUtils.isEmpty(d)) {
                convertVersionCodeToStr = convertVersionCodeToStr + "_" + d;
            }
            if (parseLong > 0) {
                if (appServiceDir.exists()) {
                    File[] listFiles = appServiceDir.listFiles();
                    for (File file : listFiles) {
                        if (file != null && !TextUtils.isEmpty(file.getName())) {
                            if (file.getName().contains(".")) {
                                if (!file.getName().equals(convertVersionCodeToStr)) {
                                    if (C66389b.m259578a(file)) {
                                        AppBrandLogger.m52829e("ClearNotUsedBaseBundleHandler", "clean grey bundle ", file.getName());
                                        IOUtils.delete(file);
                                        return bVar;
                                    }
                                    long convertVersionStrToCode = AppbrandUtil.convertVersionStrToCode(file.getName());
                                    if (convertVersionStrToCode != parseLong) {
                                        AppBrandLogger.m52829e("ClearNotUsedBaseBundleHandler", "clean base bundle version", Long.valueOf(convertVersionStrToCode));
                                        IOUtils.delete(file);
                                    }
                                }
                            }
                        }
                    }
                    return bVar;
                }
            }
            return bVar;
        } catch (Exception e) {
            AppBrandLogger.m52829e("ClearNotUsedBaseBundleHandler", e);
        }
    }
}
