package com.bytedance.ee.ref.card.p691f;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.p690e.C13538c;
import com.bytedance.ee.ref.card.p690e.C13539d;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.refer.common.download.AbsDownloadListener;
import com.tt.refer.common.download.AbstractC67757b;
import com.tt.refer.common.download.C67752a;
import com.tt.refer.common.download.engine.model.DownloadRequest;
import com.tt.refer.common.download.engine.p3421c.p3422a.AbstractC67767c;
import com.tt.refer.common.download.p3418a.C67756a;
import com.tt.refer.common.p3417c.C67746a;
import com.tt.refer.common.pkg.AbstractC67826d;
import com.tt.refer.common.pkg.AbstractC67827e;
import com.tt.refer.common.pkg.C67831h;
import com.tt.refer.common.pkg.PackageEntity;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.ref.card.f.b */
public class C13543b {

    /* renamed from: a */
    public AbstractC67757b<DownloadRequest> f35650a = new C67752a();

    /* renamed from: b */
    public IMonitorCreator f35651b;

    public C13543b(IAppContext iAppContext) {
        this.f35651b = new C13538c(iAppContext);
    }

    /* renamed from: a */
    public File mo50301a(Context context) {
        String prefixPath = HostDependManager.getInst().getPrefixPath();
        String str = "card";
        if (!TextUtils.isEmpty(prefixPath)) {
            str = str + File.separator + prefixPath;
        }
        File file = new File(context.getFilesDir(), str);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: a */
    private String m54965a(PackageEntity packageEntity) {
        String str;
        int lastIndexOf;
        String defaultDownloadUrl = packageEntity.getDefaultDownloadUrl();
        if (TextUtils.isEmpty(defaultDownloadUrl) || (lastIndexOf = defaultDownloadUrl.lastIndexOf(47)) <= 0) {
            str = null;
        } else {
            str = defaultDownloadUrl.substring(lastIndexOf + 1);
            int indexOf = str.indexOf(46);
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = packageEntity.getPackageName();
        }
        return str + ".zip";
    }

    /* renamed from: b */
    public boolean mo50305b(Context context, PackageEntity packageEntity) {
        return new File(mo50302a(context, packageEntity), "template.js").exists();
    }

    /* renamed from: a */
    private void m54966a(PackageEntity packageEntity, String str) {
        IMonitorCreator iMonitorCreator = this.f35651b;
        if (iMonitorCreator != null) {
            iMonitorCreator.createOPMonitor("op_common_package_install_result", C67746a.f170611L).setResultTypeFail().addMap(C13539d.m54960a(packageEntity)).setErrorMessage(str).flush();
        }
    }

    /* renamed from: c */
    private File m54967c(Context context, PackageEntity packageEntity) {
        File a = mo50301a(context);
        File file = new File(a, "download" + File.separator + packageEntity.getIdentifier() + File.separator + packageEntity.getPackageName() + "_" + "zip");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: a */
    public File mo50302a(Context context, PackageEntity packageEntity) {
        File a = mo50301a(context);
        File file = new File(a, "install" + File.separator + packageEntity.getIdentifier() + File.separator + packageEntity.getPackageName() + "_" + "zip");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public void mo50303a(Context context, final PackageEntity packageEntity, int i, final AbstractC67826d dVar) {
        String defaultDownloadUrl = packageEntity.getDefaultDownloadUrl();
        if (TextUtils.isEmpty(defaultDownloadUrl)) {
            dVar.mo50216b("download url is empty!");
            AppBrandLogger.m52829e("card_app_start_load_pkg_mgr_service", "downloadPackage->download url is empty! identify:", packageEntity.getIdentifier());
            IMonitorCreator iMonitorCreator = this.f35651b;
            if (iMonitorCreator != null) {
                iMonitorCreator.createOPMonitor("op_common_package_download_result", C67746a.f170630r).setResultTypeFail().addMap(C13539d.m54960a(packageEntity)).setErrorMessage("download url is empty!").flush();
                return;
            }
            return;
        }
        final List<String> urls = packageEntity.getUrls();
        File c = m54967c(context, packageEntity);
        String a = m54965a(packageEntity);
        final DownloadRequest a2 = new DownloadRequest.C67778a(defaultDownloadUrl).mo235239a(a).mo235242b(new File(c, a).getAbsolutePath()).mo235235a(2).mo235238a(new C67756a(packageEntity.getMd5())).mo235240a();
        this.f35650a.mo235134a(a2, new AbsDownloadListener<DownloadRequest>() {
            /* class com.bytedance.ee.ref.card.p691f.C13543b.C135441 */

            /* renamed from: f */
            private int f35657f = 1;

            /* renamed from: a */
            public void onStart(DownloadRequest downloadRequest) {
                AppBrandLogger.m52830i("card_app_start_load_pkg_mgr_service", ">>>onStart", packageEntity.getAppId(), packageEntity.getIdentifier());
            }

            /* renamed from: b */
            public void onDownloading(DownloadRequest downloadRequest) {
                if (DebugUtil.debug()) {
                    AppBrandLogger.m52830i("card_app_start_load_pkg_mgr_service", ">>>onDownloading", "appid:" + packageEntity.getAppId(), "cardid:" + packageEntity.getIdentifier());
                }
                dVar.mo50214a(downloadRequest.getDownloadedSize(), downloadRequest.getFileSize(), downloadRequest.getDownloadUrl());
            }

            /* renamed from: c */
            public void onComplete(DownloadRequest downloadRequest) {
                AppBrandLogger.m52830i("card_app_start_load_pkg_mgr_service", ">>>onComplete", packageEntity.getAppId(), packageEntity.getIdentifier());
                dVar.mo50215a(downloadRequest.getDownloadPath());
                if (C13543b.this.f35651b != null) {
                    C13543b.this.f35651b.createOPMonitor("op_common_package_download_result", C67746a.f170631s).setResultTypeSuccess().flush();
                }
            }

            /* renamed from: d */
            public void onError(DownloadRequest downloadRequest) {
                AppBrandLogger.m52829e("card_app_start_load_pkg_mgr_service", "currentIndex:", Integer.valueOf(this.f35657f), "backup size:", Integer.valueOf(urls.size()));
                if (this.f35657f < urls.size()) {
                    AppBrandLogger.m52830i("card_app_start_load_pkg_mgr_service", ">>>onError", packageEntity.getAppId(), packageEntity.getIdentifier(), "retryTimes:" + this.f35657f);
                    a2.resetDownloadStatus();
                    a2.setDownloadUrl((String) urls.get(this.f35657f));
                    C13543b.this.f35650a.mo235134a(a2, this);
                    this.f35657f++;
                    return;
                }
                AppBrandLogger.m52830i("card_app_start_load_pkg_mgr_service", ">>>onError", packageEntity.getAppId(), packageEntity.getIdentifier());
                dVar.mo50216b(downloadRequest.getDownloadError().f170701a);
                if (C13543b.this.f35651b != null) {
                    String str = downloadRequest.getDownloadError().f170701a;
                    OPMonitor createOPMonitor = C13543b.this.f35651b.createOPMonitor("op_common_package_download_result", null);
                    createOPMonitor.addMap(C13539d.m54960a(packageEntity));
                    createOPMonitor.setResultTypeFail();
                    if (AbstractC67767c.C67768a.f170668i.mo235193b().equals(str)) {
                        createOPMonitor.setMonitorCode(C67746a.f170635w);
                    } else {
                        createOPMonitor.setMonitorCode(C67746a.f170632t);
                    }
                    createOPMonitor.setErrorMessage(downloadRequest.getDownloadError().f170702b);
                    createOPMonitor.setErrorCode(downloadRequest.getDownloadError().f170701a);
                    createOPMonitor.flush();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo50304a(Context context, PackageEntity packageEntity, String str, AbstractC67827e eVar) {
        File file = new File(str);
        if (!file.exists()) {
            eVar.mo50218a(C67831h.f170841h.mo235454b(), C67831h.f170841h.mo235453a());
            IMonitorCreator iMonitorCreator = this.f35651b;
            if (iMonitorCreator != null) {
                iMonitorCreator.createOPMonitor("op_common_package_install_result", C67746a.f170601B).setResultTypeFail().addMap(C13539d.m54960a(packageEntity)).setErrorMessage(C67831h.f170841h.mo235453a()).setErrorCode(C67831h.f170841h.mo235454b()).flush();
                return;
            }
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            File a = mo50302a(context, packageEntity);
            AppBrandLogger.m52830i("card_app_start_load_pkg_mgr_service", "installDir:", a);
            if (!a.exists()) {
                eVar.mo50218a(C67831h.f170842i.mo235454b(), C67831h.f170842i.mo235453a());
                IMonitorCreator iMonitorCreator2 = this.f35651b;
                if (iMonitorCreator2 != null) {
                    iMonitorCreator2.createOPMonitor("op_common_package_install_result", C67746a.f170612M).setResultTypeFail().addMap(C13539d.m54960a(packageEntity)).setErrorMessage("install dir is not exist!").flush();
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
                    m54966a(packageEntity, C13542a.f35645a.mo235453a());
                    try {
                        IOUtils.removeDir(file.getParent());
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    JSONArray optJSONArray = new JSONObject(new String(IOUtils.readBytes(file2.getAbsolutePath()))).optJSONArray("cards");
                    if (optJSONArray == null) {
                        eVar.mo50218a(C13542a.f35646b.mo235454b(), C13542a.f35646b.mo235453a());
                        m54966a(packageEntity, C13542a.f35646b.mo235453a());
                        try {
                            IOUtils.removeDir(file.getParent());
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    } else {
                        String str2 = null;
                        int i = 0;
                        while (true) {
                            if (i >= optJSONArray.length()) {
                                break;
                            }
                            JSONObject jSONObject = optJSONArray.getJSONObject(i);
                            String optString = jSONObject.optString("cardid");
                            String optString2 = jSONObject.optString("entry");
                            if (!TextUtils.isEmpty(optString) && optString.equals(packageEntity.getIdentifier())) {
                                str2 = optString2;
                                break;
                            }
                            i++;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            eVar.mo50218a(C13542a.f35647c.mo235454b(), C13542a.f35647c.mo235453a());
                            m54966a(packageEntity, C13542a.f35647c.mo235453a());
                            try {
                                IOUtils.removeDir(file.getParent());
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        } else {
                            File file3 = new File(file.getParent(), str2);
                            if (!file3.exists()) {
                                eVar.mo50218a(C13542a.f35648d.mo235454b(), C13542a.f35648d.mo235453a());
                                m54966a(packageEntity, C13542a.f35648d.mo235453a());
                                try {
                                    IOUtils.removeDir(file.getParent());
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                            } else {
                                if (IOUtils.copyFolder(new File(file3.getParent()), a)) {
                                    eVar.mo50217a(a.getAbsolutePath());
                                    IMonitorCreator iMonitorCreator3 = this.f35651b;
                                    if (iMonitorCreator3 != null) {
                                        iMonitorCreator3.createOPMonitor("op_common_package_install_result", C67746a.f170602C).setResultTypeSuccess().addMap(C13539d.m54960a(packageEntity)).flush();
                                    }
                                } else {
                                    eVar.mo50218a(C13542a.f35649e.mo235454b(), C13542a.f35649e.mo235453a());
                                    IMonitorCreator iMonitorCreator4 = this.f35651b;
                                    if (iMonitorCreator4 != null) {
                                        iMonitorCreator4.createOPMonitor("op_common_package_install_result", C67746a.f170603D).setErrorMessage(C13542a.f35649e.mo235453a()).setResultTypeFail().addMap(C13539d.m54960a(packageEntity)).flush();
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
            AppBrandLogger.m52829e("card_app_start_load_pkg_mgr_service", "installApp exception->card id is:", packageEntity.getIdentifier(), e7.getMessage());
            eVar.mo50218a(C13542a.f170839f.mo235454b(), e7.getLocalizedMessage());
            IMonitorCreator iMonitorCreator5 = this.f35651b;
            if (iMonitorCreator5 != null) {
                iMonitorCreator5.createOPMonitor("op_common_package_install_result", C67746a.f170603D).setResultTypeFail().setError(e7).addMap(C13539d.m54960a(packageEntity)).flush();
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
