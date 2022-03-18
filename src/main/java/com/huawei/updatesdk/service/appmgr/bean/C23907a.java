package com.huawei.updatesdk.service.appmgr.bean;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.p1036h.C23842a;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.p1036h.C23845b;
import com.huawei.updatesdk.p1029a.p1039b.p1040a.C23854a;
import com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.AbstractC23866b;
import com.huawei.updatesdk.p1046b.p1050b.C23878a;
import com.huawei.updatesdk.p1046b.p1050b.C23880c;
import com.huawei.updatesdk.p1046b.p1055f.C23890a;
import com.huawei.updatesdk.service.otaupdate.C23936h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.updatesdk.service.appmgr.bean.a */
public class C23907a extends C23880c {
    public static final String APIMETHOD = "client.updateCheck";
    public static final int DEFAULT_UPGRADE_RESULT = 0;
    public static final int FULL_UPGRADE_RESULT = 1;
    public static final int INSTALL_CHECK_DEFAULT = 0;
    private String agVersion_;
    private String buildNumber_;
    private String density_;
    private C23842a deviceSpecParams_;
    private int emuiApiLevel_;
    private String firmwareVersion_;
    private int getSafeGame_;
    private int gmsSupport_;
    private int installCheck_;
    private int isFullUpgrade_;
    private int mapleVer_;
    private String packageName_;
    private String phoneType_;
    private C23908a pkgInfo_;
    private String resolution_;
    private String serviceCountry_;
    private int supportMaple_;
    private int versionCode_;
    private String version_;

    /* renamed from: com.huawei.updatesdk.service.appmgr.bean.a$a */
    public static class C23908a extends AbstractC23866b {
        private List<Param> params_;

        /* renamed from: a */
        public void mo85826a(List<Param> list) {
            this.params_ = list;
        }
    }

    public C23907a() {
        this.emuiApiLevel_ = 0;
        this.installCheck_ = 0;
        this.isFullUpgrade_ = 0;
        this.getSafeGame_ = 1;
        this.supportMaple_ = 0;
        Context a = C23854a.m87210c().mo85582a();
        mo85629a(APIMETHOD);
        mo85631b("1.2");
        mo85820h(Build.VERSION.RELEASE.trim());
        mo85676d(C23845b.m87167f());
        mo85825m(C23845b.m87171h(a));
        mo85816f(C23845b.m87161c());
        mo85822j(Build.MODEL);
        mo85818g(C23845b.m87168f(a));
        mo85819h(C23845b.m87169g(a));
        mo85811c(C23845b.m87172i(a) ? 1 : 0);
        mo85823k(C23845b.m87165e(a));
        mo85821i(C23854a.m87210c().mo85582a().getPackageName());
        mo85810b(C23890a.m87353d().mo85685a());
        mo85824l(C23878a.m87310c().mo85661a());
        mo85817g(C23845b.m87163d().mo85573a());
        mo85815f(C23845b.m87163d().mo85575b());
        this.deviceSpecParams_ = new C23842a.C23844b(a).mo85571a(true).mo85572a();
        mo85814e(C23845b.m87158b(a, C23936h.m87510g().mo85880c()));
    }

    public C23907a(List<Param> list) {
        this();
        C23908a aVar = new C23908a();
        aVar.mo85826a(list);
        mo85809a(aVar);
    }

    /* renamed from: a */
    public static C23907a m87393a(List<PackageInfo> list) {
        C23907a aVar = new C23907a();
        C23908a aVar2 = new C23908a();
        aVar.mo85809a(aVar2);
        ArrayList arrayList = new ArrayList();
        aVar2.mo85826a(arrayList);
        for (PackageInfo packageInfo : list) {
            arrayList.add(new Param(packageInfo));
        }
        return aVar;
    }

    /* renamed from: n */
    public static C23907a m87394n(String str) {
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = str;
        packageInfo.versionName = "1.0";
        packageInfo.versionCode = 1;
        ApplicationInfo applicationInfo = new ApplicationInfo();
        applicationInfo.targetSdkVersion = 19;
        packageInfo.applicationInfo = applicationInfo;
        ArrayList arrayList = new ArrayList();
        arrayList.add(packageInfo);
        C23907a a = m87393a(arrayList);
        a.mo85813e(1);
        return a;
    }

    /* renamed from: a */
    public void mo85809a(C23908a aVar) {
        this.pkgInfo_ = aVar;
    }

    /* renamed from: b */
    public void mo85810b(int i) {
        this.emuiApiLevel_ = i;
    }

    /* renamed from: c */
    public void mo85811c(int i) {
        this.gmsSupport_ = i;
    }

    /* renamed from: d */
    public void mo85812d(int i) {
        this.installCheck_ = i;
    }

    /* renamed from: e */
    public void mo85813e(int i) {
        this.isFullUpgrade_ = i;
    }

    /* renamed from: e */
    public void mo85814e(String str) {
        this.agVersion_ = str;
    }

    /* renamed from: f */
    public void mo85815f(int i) {
        this.mapleVer_ = i;
    }

    /* renamed from: f */
    public void mo85816f(String str) {
        this.buildNumber_ = str;
    }

    /* renamed from: g */
    public void mo85817g(int i) {
        this.supportMaple_ = i;
    }

    /* renamed from: g */
    public void mo85818g(String str) {
        this.density_ = str;
    }

    /* renamed from: h */
    public void mo85819h(int i) {
        this.versionCode_ = i;
    }

    /* renamed from: h */
    public void mo85820h(String str) {
        this.firmwareVersion_ = str;
    }

    /* renamed from: i */
    public void mo85821i(String str) {
        this.packageName_ = str;
    }

    /* renamed from: j */
    public void mo85822j(String str) {
        this.phoneType_ = str;
    }

    /* renamed from: k */
    public void mo85823k(String str) {
        this.resolution_ = str;
    }

    /* renamed from: l */
    public void mo85824l(String str) {
        this.serviceCountry_ = str;
    }

    /* renamed from: m */
    public void mo85825m(String str) {
        this.version_ = str;
    }
}
