package com.bytedance.ee.ref.card.p691f;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.p690e.C13538c;
import com.bytedance.ee.ref.card.p690e.C13539d;
import com.tt.refer.common.p3417c.C67746a;
import com.tt.refer.common.pkg.AbsPkgMgrService;
import com.tt.refer.common.pkg.AbstractC67827e;
import com.tt.refer.common.pkg.C67831h;
import com.tt.refer.common.pkg.PackageEntity;
import java.io.File;
import java.io.FileInputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.ref.card.f.c */
public class C13545c extends AbsPkgMgrService {
    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.pkg.AbsPkgMgrService
    public String getPkgSuffix() {
        return ".zip";
    }

    public C13545c(IAppContext iAppContext) {
        super(iAppContext);
        setPkgMonitorCreator(new C13538c(iAppContext));
    }

    /* renamed from: a */
    private void m54977a(PackageEntity packageEntity, String str) {
        if (this.mPkgMonitorCreator != null) {
            this.mPkgMonitorCreator.createOPMonitor("op_common_package_install_result", C67746a.f170611L).setResultTypeFail().addMap(C13539d.m54960a(packageEntity)).setErrorMessage(str).flush();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.pkg.AbsPkgMgrService
    public void installPackage(Context context, PackageEntity packageEntity, String str, AbstractC67827e eVar, int i) {
        File file = new File(str);
        if (!file.exists()) {
            eVar.mo50218a(C67831h.f170841h.mo235454b(), C67831h.f170841h.mo235453a());
            if (this.mPkgMonitorCreator != null) {
                this.mPkgMonitorCreator.createOPMonitor("op_common_package_install_result", C67746a.f170601B).setResultTypeFail().addMap(C13539d.m54960a(packageEntity)).setErrorMessage(C67831h.f170841h.mo235453a()).setErrorCode(C67831h.f170841h.mo235454b()).flush();
                return;
            }
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            File installDir = getInstallDir(context, packageEntity, i);
            if (installDir.exists()) {
                IOUtils.delete(installDir);
            }
            installDir.mkdirs();
            AppBrandLogger.m52830i("card_app_start_load_pkg_mgr_service_v2", "installDir:", installDir);
            if (!installDir.exists()) {
                eVar.mo50218a(C67831h.f170842i.mo235454b(), C67831h.f170842i.mo235453a());
                if (this.mPkgMonitorCreator != null) {
                    this.mPkgMonitorCreator.createOPMonitor("op_common_package_install_result", C67746a.f170612M).setResultTypeFail().addMap(C13539d.m54960a(packageEntity)).setErrorMessage("install dir is not exist!").flush();
                }
                try {
                    IOUtils.removeDir(file.getParent());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                IOUtils.unZipFolder(fileInputStream, file.getParent());
                File file2 = new File(file.getParent(), "project.config.json");
                if (!file2.exists()) {
                    eVar.mo50218a(C13542a.f35645a.mo235454b(), C13542a.f35645a.mo235453a());
                    m54977a(packageEntity, C13542a.f35645a.mo235453a());
                    try {
                        IOUtils.removeDir(file.getParent());
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    JSONArray optJSONArray = new JSONObject(new String(IOUtils.readBytes(file2.getAbsolutePath()))).optJSONArray("cards");
                    if (optJSONArray == null) {
                        eVar.mo50218a(C13542a.f35646b.mo235454b(), C13542a.f35646b.mo235453a());
                        m54977a(packageEntity, C13542a.f35646b.mo235453a());
                        try {
                            IOUtils.removeDir(file.getParent());
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    } else {
                        String str2 = null;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= optJSONArray.length()) {
                                break;
                            }
                            JSONObject jSONObject = optJSONArray.getJSONObject(i2);
                            String optString = jSONObject.optString("cardid");
                            String optString2 = jSONObject.optString("entry");
                            if (!TextUtils.isEmpty(optString) && optString.equals(packageEntity.getIdentifier())) {
                                str2 = optString2;
                                break;
                            }
                            i2++;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            eVar.mo50218a(C13542a.f35647c.mo235454b(), C13542a.f35647c.mo235453a());
                            m54977a(packageEntity, C13542a.f35647c.mo235453a());
                            try {
                                IOUtils.removeDir(file.getParent());
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        } else {
                            File file3 = new File(file.getParent(), str2);
                            if (!file3.exists()) {
                                eVar.mo50218a(C13542a.f35648d.mo235454b(), C13542a.f35648d.mo235453a());
                                m54977a(packageEntity, C13542a.f35648d.mo235453a());
                                try {
                                    IOUtils.removeDir(file.getParent());
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                            } else {
                                if (IOUtils.copyFolder(new File(file3.getParent()), installDir)) {
                                    eVar.mo50217a(installDir.getAbsolutePath());
                                    if (this.mPkgMonitorCreator != null) {
                                        this.mPkgMonitorCreator.createOPMonitor("op_common_package_install_result", C67746a.f170602C).setResultTypeSuccess().addMap(C13539d.m54960a(packageEntity)).flush();
                                    }
                                } else {
                                    eVar.mo50218a(C13542a.f35649e.mo235454b(), C13542a.f35649e.mo235453a());
                                    if (this.mPkgMonitorCreator != null) {
                                        this.mPkgMonitorCreator.createOPMonitor("op_common_package_install_result", C67746a.f170603D).setErrorMessage(C13542a.f35649e.mo235453a()).setResultTypeFail().addMap(C13539d.m54960a(packageEntity)).flush();
                                    }
                                }
                                try {
                                    IOUtils.removeDir(file.getParent());
                                } catch (Exception e6) {
                                    e6.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e7) {
            AppBrandLogger.m52829e("card_app_start_load_pkg_mgr_service_v2", "installApp exception->card id is:", packageEntity.getIdentifier(), e7.getMessage());
            if (this.mPkgMonitorCreator != null) {
                this.mPkgMonitorCreator.createOPMonitor("op_common_package_install_result", C67746a.f170603D).setResultTypeFail().setError(e7).addMap(C13539d.m54960a(packageEntity)).flush();
            }
            IOUtils.removeDir(file.getParent());
        } catch (Throwable th) {
            try {
                IOUtils.removeDir(file.getParent());
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            throw th;
        }
    }
}
