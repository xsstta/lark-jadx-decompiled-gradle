package com.huawei.updatesdk.p1046b.p1052d;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1039b.p1043c.C23862b;
import com.huawei.updatesdk.p1046b.p1051c.C23884c;
import com.huawei.updatesdk.support.pm.PackageInstallerActivity;
import java.io.File;

/* renamed from: com.huawei.updatesdk.b.d.a */
public class C23886a {
    /* renamed from: a */
    public static void m87342a(int i, int i2) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("INSTALL_STATE", i);
        bundle.putInt("INSTALL_TYPE", i2);
        intent.putExtras(bundle);
        C23884c.m87335b().mo85684c(C23862b.m87240a(intent));
    }

    /* renamed from: a */
    public static void m87343a(Context context, String str, String str2) {
        m87342a(3, 1);
        File file = new File(str);
        if (!file.exists() || !file.isFile() || file.length() <= 0) {
            C23834a.m87118b("InstallProcess", "system install failed,file not existed filePath:" + str);
            m87342a(4, -10003);
            return;
        }
        Intent intent = new Intent(context, PackageInstallerActivity.class);
        intent.putExtra("install_path", str);
        intent.putExtra("install_packagename", str2);
        if (!(context instanceof Activity)) {
            intent.setFlags(402653184);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            m87342a(4, -10002);
            C23834a.m87117a("InstallProcess", " can not start install !", e);
        }
    }
}
