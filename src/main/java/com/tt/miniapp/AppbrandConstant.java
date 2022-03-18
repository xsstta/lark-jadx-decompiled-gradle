package com.tt.miniapp;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.C13374s;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24512a;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.p3357x.p3359b.C67411g;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.refer.common.pkg.PackageEntity;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class AppbrandConstant {

    /* renamed from: com.tt.miniapp.AppbrandConstant$a */
    public static final class C65699a {

        /* renamed from: a */
        public static final Map<Integer, OPMonitorCode> f165548a = new HashMap<Integer, OPMonitorCode>() {
            /* class com.tt.miniapp.AppbrandConstant.C65699a.C657001 */

            {
                put(-5003, C67501b.bc);
                put(-5004, C67501b.bd);
                put(-5005, C67501b.be);
                put(-5000, C67501b.bh);
                put(-5001, C67501b.bi);
                put(-5010, C67501b.bn);
                put(-5011, C67501b.bo);
                put(-5020, C67501b.bp);
                put(-5021, C67501b.bq);
                put(-1006, C67501b.aT);
                put(-3002, C67501b.aV);
                put(-3003, C67501b.aV);
                put(-3005, C67501b.aV);
                put(-3006, C67501b.aV);
            }
        };
    }

    /* renamed from: com.tt.miniapp.AppbrandConstant$b */
    public static class C65701b {

        /* renamed from: a */
        private static volatile C65701b f165549a;

        /* renamed from: b */
        private boolean f165550b;

        /* renamed from: c */
        private String f165551c = "https://developer.toutiao.com";

        /* renamed from: d */
        public String mo230139d() {
            return this.f165551c;
        }

        private C65701b() {
            boolean isEnableI18nNetRequest = HostDependManager.getInst().isEnableI18nNetRequest();
            String replaceOpenApiDomain = HostDependManager.getInst().replaceOpenApiDomain();
            this.f165550b = isEnableI18nNetRequest;
            m257611a(isEnableI18nNetRequest, replaceOpenApiDomain);
        }

        /* renamed from: c */
        public static C65701b m257612c() {
            if (f165549a == null) {
                synchronized (C65701b.class) {
                    if (f165549a == null) {
                        f165549a = new C65701b();
                    }
                }
            }
            return f165549a;
        }

        /* renamed from: A */
        public String mo230135A() {
            return this.f165551c + "/api/apps/im/url/generate";
        }

        /* renamed from: B */
        public String mo230136B() {
            return this.f165551c + "/api/apps/share/delete_share_token";
        }

        /* renamed from: b */
        public String mo230138b() {
            String c = C13374s.m54398c("mp_web_view_component");
            if (!TextUtils.isEmpty(c)) {
                return Uri.parse(c).getHost();
            }
            return "";
        }

        /* renamed from: e */
        public String mo230140e() {
            return this.f165551c + "/api/apps/v2/user/info?appid=";
        }

        /* renamed from: f */
        public String mo230141f() {
            return this.f165551c + "/appdown";
        }

        /* renamed from: g */
        public String mo230142g() {
            return this.f165551c + "/unsupported";
        }

        /* renamed from: h */
        public String mo230143h() {
            return this.f165551c + "/api/apps/authorization/set";
        }

        /* renamed from: i */
        public String mo230144i() {
            return this.f165551c + "/api/apps/share/upload_image";
        }

        /* renamed from: j */
        public String mo230145j() {
            return this.f165551c + "/api/apps/share/query_open_gid";
        }

        /* renamed from: k */
        public String mo230146k() {
            return this.f165551c + "/api/apps/share/share_message";
        }

        /* renamed from: l */
        public String mo230147l() {
            return this.f165551c + "/api/apps/share/default_share_info";
        }

        /* renamed from: m */
        public String mo230148m() {
            return this.f165551c + "/systemdown";
        }

        /* renamed from: n */
        public String mo230149n() {
            return this.f165551c + "/api/apps/history";
        }

        /* renamed from: o */
        public String mo230150o() {
            return this.f165551c + "/unsupported?type=os_unsupported";
        }

        /* renamed from: p */
        public String mo230151p() {
            return this.f165551c + "/unsupported?type=model_unsupported";
        }

        /* renamed from: q */
        public String mo230152q() {
            return this.f165551c + "/api/apps/storage/user?";
        }

        /* renamed from: r */
        public String mo230153r() {
            return this.f165551c + "/api/apps/storage/friend?";
        }

        /* renamed from: s */
        public String mo230154s() {
            return this.f165551c + "/api/apps/storage/user";
        }

        /* renamed from: t */
        public String mo230155t() {
            return this.f165551c + "/api/apps/storage/remove";
        }

        /* renamed from: u */
        public String mo230156u() {
            return this.f165551c + "/api/apps/user/uid?";
        }

        /* renamed from: v */
        public String mo230157v() {
            return this.f165551c + "/api/apps/location/user";
        }

        /* renamed from: w */
        public String mo230158w() {
            return this.f165551c + "/api/apps/collect/getcollectlist";
        }

        /* renamed from: x */
        public String mo230159x() {
            return this.f165551c + "/api/apps/collect/addcollect";
        }

        /* renamed from: y */
        public String mo230160y() {
            return this.f165551c + "/api/apps/collect/removecollect";
        }

        /* renamed from: z */
        public String mo230161z() {
            return this.f165551c + "/api/apps/collect/sortcollect";
        }

        /* renamed from: a */
        public String mo230137a() {
            return C13374s.m54398c("mp_web_view_component") + "/page/error/";
        }

        /* renamed from: a */
        private void m257611a(boolean z, String str) {
            if (!z) {
                this.f165551c = "https://developer.toutiao.com";
                return;
            }
            this.f165551c = "https://developer-sg.toutiao.com";
            if (!TextUtils.isEmpty(str)) {
                this.f165551c = str;
            }
        }
    }

    /* renamed from: com.tt.miniapp.AppbrandConstant$c */
    public static class C65702c {

        /* renamed from: b */
        private static volatile C65702c f165552b;

        /* renamed from: a */
        private String f165553a = "https://i.snssdk.com";

        /* renamed from: b */
        public String mo230162b() {
            return this.f165553a + "/feedback/2/common_feedback_list/";
        }

        /* renamed from: c */
        public String mo230163c() {
            return this.f165553a + "/feedback/image/v1/upload/";
        }

        /* renamed from: d */
        public String mo230164d() {
            return this.f165553a + "/feedback/2/post_message/";
        }

        /* renamed from: a */
        public static C65702c m257640a() {
            if (f165552b == null) {
                synchronized (C65701b.class) {
                    if (f165552b == null) {
                        f165552b = new C65702c(HostDependManager.getInst().isEnableI18nNetRequest());
                    }
                }
            }
            return f165552b;
        }

        private C65702c(boolean z) {
            if (z) {
                this.f165553a = "https://i.sgsnssdk.com";
            } else {
                this.f165553a = "https://i.snssdk.com";
            }
        }
    }

    public static File getExtSrcDir() {
        File file = new File(getMiniAppRootDir(AppbrandContext.getInst().getApplicationContext()), "extsrc");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public static File getOldBaseBundleDir() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext != null) {
            return new File(getMiniAppRootDir(applicationContext), "__dev__");
        }
        return null;
    }

    public static File getDownloadDir(Context context) {
        return C67411g.m262284a(context).mo234089c().mo234085a();
    }

    public static File getExtSrcInstallDir(String str) {
        return new File(getExtSrcDir(), str);
    }

    public static File getExtSrcInstallFile(String str) {
        return new File(getExtSrcInstallDir(str), "appbrand.zip");
    }

    public static File getMiniAppRootDir(Context context) {
        return C67411g.m262284a(context).mo234091e().mo234085a();
    }

    public static String getAppInstallDirName(AppInfoEntity appInfoEntity) {
        return appInfoEntity.appId + File.separator + getPkgMD5ViaUrl(appInfoEntity);
    }

    public static String getExtSrcDownloadFileName(String str) {
        return "extSrc" + str;
    }

    public static File getFileLockDir(File file) {
        File file2 = new File(file, "fileLock");
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }

    public static String getAppInstallDirName(PackageEntity packageEntity) {
        return packageEntity.getAppId() + File.separator + getPkgMD5ViaUrl(packageEntity);
    }

    public static String getPkgMD5ViaUrl(AppInfoEntity appInfoEntity) {
        String str;
        int lastIndexOf;
        String defaultUrl = appInfoEntity.getDefaultUrl();
        if (TextUtils.isEmpty(defaultUrl) || (lastIndexOf = defaultUrl.lastIndexOf(47)) <= 0) {
            str = null;
        } else {
            str = defaultUrl.substring(lastIndexOf + 1);
            int indexOf = str.indexOf(46);
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
        }
        if (TextUtils.isEmpty(str)) {
            return appInfoEntity.version;
        }
        return str;
    }

    public static String getPkgMD5ViaUrl(PackageEntity packageEntity) {
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
            return packageEntity.getPackageName();
        }
        return str;
    }

    public static File getDestAppRunRootDir(File file, String str) {
        return new File(file, str);
    }

    public static File getAppRunDir(Context context, AppInfoEntity appInfoEntity) {
        return new File(getMiniAppRootDir(context), getAppInstallDirName(appInfoEntity));
    }

    public static File getCurrentAppDir(Context context, IAppContext iAppContext) {
        return getAppRunDir(context, C67432a.m262319a(iAppContext).getAppInfo());
    }

    public static File getJsBundleDir(Context context, IAppContext iAppContext) {
        if (C24512a.m89384a()) {
            return C66399c.m259608a().mo231912a(iAppContext, context);
        }
        String c = C66399c.m259608a().mo231923c(context, iAppContext);
        if (TextUtils.isEmpty(c)) {
            c = "-1";
        }
        File file = new File(AppbrandUtil.getAppServiceDir(context), c);
        if (!file.exists()) {
            C66036d.m258604c(file.getAbsolutePath(), iAppContext);
        }
        return file;
    }
}
