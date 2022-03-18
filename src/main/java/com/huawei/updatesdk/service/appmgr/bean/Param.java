package com.huawei.updatesdk.service.appmgr.bean;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.AbstractC23841g;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.C23835a;
import com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.AbstractC23866b;
import com.huawei.updatesdk.p1046b.p1047a.p1048a.C23872b;
import com.huawei.updatesdk.p1046b.p1047a.p1049b.C23875b;
import com.huawei.updatesdk.p1046b.p1055f.C23891b;
import java.util.List;
import java.util.Locale;

public class Param extends AbstractC23866b {
    private String fSha2_;
    private int isPre_;
    private List<String> keySets_;
    private int maple_;
    private String oldVersion_;
    private String package_;
    private String sSha2_;
    private int targetSdkVersion_;
    private int versionCode_;

    public Param() {
    }

    public Param(PackageInfo packageInfo) {
        this.package_ = packageInfo.packageName;
        this.versionCode_ = packageInfo.versionCode;
        String str = packageInfo.versionName;
        this.oldVersion_ = str == null ? "null" : str;
        this.targetSdkVersion_ = packageInfo.applicationInfo.targetSdkVersion;
        this.isPre_ = C23891b.m87355a(packageInfo);
        this.maple_ = C23891b.m87356a(this.package_);
        this.keySets_ = C23875b.m87303a().mo85660a(packageInfo);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length > 0) {
            setApkSignature(signatureArr[0].toCharsString());
        }
        this.fSha2_ = C23872b.m87293a().mo85651a(packageInfo);
    }

    public void setApkFileSha256(String str) {
        this.fSha2_ = str;
    }

    public void setApkSignature(String str) {
        String b = AbstractC23841g.m87140b(C23835a.m87121a(AbstractC23841g.m87141c(str)));
        if (!TextUtils.isEmpty(b)) {
            this.sSha2_ = b.toLowerCase(Locale.getDefault());
        }
    }

    public void setMapleState(int i) {
        this.maple_ = i;
    }

    public void setPackageName(String str) {
        this.package_ = str;
    }

    public void setTargetSdkVersion(int i) {
        this.targetSdkVersion_ = i;
    }

    public void setVersionCode(int i) {
        this.versionCode_ = i;
    }

    public void setVersionName(String str) {
        this.oldVersion_ = str;
    }
}
