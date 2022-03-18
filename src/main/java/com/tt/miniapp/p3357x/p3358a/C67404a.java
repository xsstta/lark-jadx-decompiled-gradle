package com.tt.miniapp.p3357x.p3358a;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapphost.AbstractC67538f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import java.io.File;
import java.io.IOException;

/* renamed from: com.tt.miniapp.x.a.a */
public class C67404a {

    /* renamed from: a */
    private String f169996a;

    /* renamed from: b */
    private String f169997b;

    /* renamed from: c */
    private String f169998c;

    /* renamed from: d */
    private String f169999d = "/codeRootPath";

    /* renamed from: e */
    private String f170000e;

    /* renamed from: f */
    private IAppContext f170001f;

    /* renamed from: g */
    private File f170002g;

    /* renamed from: h */
    private String f170003h;

    /* renamed from: b */
    public File mo234078b() {
        return mo234083d(this.f170003h);
    }

    /* renamed from: c */
    public File mo234081c() {
        return mo234084e(this.f170003h);
    }

    /* renamed from: d */
    private void m262270d() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        this.f170002g = new File(C12791h.m52861a(applicationContext), "TT/sandbox");
        try {
            this.f169996a = mo234078b().getCanonicalPath();
            this.f169997b = mo234081c().getCanonicalPath();
            this.f169998c = C12791h.m52865c(applicationContext).getCanonicalPath();
            this.f170000e = AppbrandConstant.getExtSrcDir().getCanonicalPath();
        } catch (IOException e) {
            AppBrandLogger.m52829e("tma_FileManager", "initAllFilePath", e);
            C66036d.m258584a("initAllFilePath", this.f170001f);
        }
    }

    /* renamed from: a */
    public void mo234077a() {
        AppInfoEntity appInfo;
        AbstractC67538f a = C67432a.m262319a(this.f170001f);
        if (!(a == null || (appInfo = a.getAppInfo()) == null)) {
            this.f170003h = appInfo.appId;
        }
        m262270d();
    }

    public C67404a(IAppContext iAppContext) {
        this.f170001f = iAppContext;
        mo234077a();
    }

    /* renamed from: a */
    public static C67404a m262266a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234302w();
    }

    /* renamed from: a */
    static void m262268a(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: c */
    public String mo234082c(String str) {
        return "file://" + mo234079b(str);
    }

    /* renamed from: d */
    public File mo234083d(String str) {
        String prefixPath = HostDependManager.getInst().getPrefixPath();
        boolean z = !TextUtils.isEmpty(prefixPath);
        File file = this.f170002g;
        StringBuilder sb = new StringBuilder();
        sb.append("temp/");
        if (z) {
            str = prefixPath + File.separator + str;
        }
        sb.append(str);
        File file2 = new File(file, sb.toString());
        m262268a(file2);
        return file2;
    }

    /* renamed from: e */
    public File mo234084e(String str) {
        String prefixPath = HostDependManager.getInst().getPrefixPath();
        boolean z = !TextUtils.isEmpty(prefixPath);
        File file = this.f170002g;
        StringBuilder sb = new StringBuilder();
        sb.append("user/");
        if (z) {
            str = prefixPath + File.separator + str;
        }
        sb.append(str);
        File file2 = new File(file, sb.toString());
        m262268a(file2);
        return file2;
    }

    /* renamed from: b */
    public String mo234079b(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.f169999d;
        }
        if (str.startsWith("ttfile://user")) {
            return m262267a(str, this.f169997b, "ttfile://user");
        }
        if (str.startsWith("ttfile://temp")) {
            return m262267a(str, this.f169996a, "ttfile://temp");
        }
        if (str.startsWith("http") || str.startsWith(this.f169999d) || str.startsWith(this.f169997b) || str.startsWith(this.f169996a) || str.startsWith(this.f169998c) || str.startsWith(this.f170000e)) {
            return str;
        }
        return this.f169999d + File.separator + str;
    }

    /* renamed from: a */
    public String mo234076a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(this.f169997b)) {
            return "ttfile://user" + str.substring(this.f169997b.length());
        } else if (str.startsWith(this.f169996a)) {
            return "ttfile://temp" + str.substring(this.f169996a.length());
        } else if (!str.startsWith(this.f169999d)) {
            return str;
        } else {
            if (str.length() - this.f169999d.length() > 0) {
                return str.substring(this.f169999d.length() + 1);
            }
            return str.substring(this.f169999d.length());
        }
    }

    /* renamed from: b */
    public boolean mo234080b(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            if (TextUtils.isEmpty(canonicalPath)) {
                return false;
            }
            if (!TextUtils.equals(canonicalPath, this.f169997b)) {
                if (!canonicalPath.startsWith(this.f169997b + File.separator)) {
                    if (!TextUtils.equals(canonicalPath, this.f169996a)) {
                        if (!canonicalPath.startsWith(this.f169996a + File.separator)) {
                            if (!TextUtils.equals(canonicalPath, this.f169999d)) {
                                if (!canonicalPath.startsWith(this.f169999d + File.separator)) {
                                    if (!TextUtils.equals(canonicalPath, this.f170000e)) {
                                        if (canonicalPath.startsWith(this.f170000e + File.separator)) {
                                            return true;
                                        }
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        } catch (IOException e) {
            AppBrandLogger.stacktrace(6, "tma_FileManager", e.getStackTrace());
        }
    }

    /* renamed from: a */
    public static boolean m262269a(File file, File file2) {
        try {
            String canonicalPath = file2.getCanonicalPath();
            while (file != null) {
                try {
                    if (file.getCanonicalPath().equals(canonicalPath)) {
                        return true;
                    }
                    file = file.getParentFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException unused) {
        }
        return false;
    }

    /* renamed from: a */
    private String m262267a(String str, String str2, String str3) {
        String substring = str.substring(str3.length());
        if (TextUtils.isEmpty(substring) || !substring.startsWith(File.separator)) {
            return str2 + File.separator + str.substring(str3.length());
        }
        return str2 + str.substring(str3.length());
    }
}
