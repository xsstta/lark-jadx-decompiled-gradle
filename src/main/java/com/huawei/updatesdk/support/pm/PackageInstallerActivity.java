package com.huawei.updatesdk.support.pm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.updatesdk.fileprovider.UpdateSdkFileProvider;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.p1036h.C23845b;
import com.huawei.updatesdk.p1029a.p1039b.p1043c.C23862b;
import com.huawei.updatesdk.p1046b.p1052d.C23886a;
import java.io.File;

public class PackageInstallerActivity extends Activity {
    /* renamed from: a */
    private Intent m87526a(Context context, String str) {
        Uri uri;
        if (TextUtils.isEmpty(str) || str.contains("../") || str.contains("..") || str.contains("%00") || str.contains(".\\.\\") || str.contains("./")) {
            throw new IllegalArgumentException("getNomalInstallIntent: Not a standard path");
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.INSTALL_PACKAGE");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            uri = UpdateSdkFileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + UpdateSdkFileProvider.AUTHORITIES_SUFFIX, new File(str));
        } else {
            uri = Uri.fromFile(new File(str));
        }
        intent.setData(uri);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    public void PackageInstallerActivity__onStop$___twin___() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (1000 == i) {
            if (i2 == 0) {
                C23886a.m87342a(7, 0);
            } else {
                int i3 = -10004;
                if (intent != null) {
                    i3 = C23862b.m87240a(intent).mo85602a("android.intent.extra.INSTALL_RESULT", -10004);
                }
                if (!(i3 == 0 || i3 == 1)) {
                    C23886a.m87342a(4, i3);
                }
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        requestWindowFeature(1);
        C23845b.m87163d().mo85574a(getWindow());
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            str = "PackageInstallerActivity error intent";
        } else {
            C23862b a = C23862b.m87240a(intent);
            String a2 = a.mo85604a("install_path");
            String a3 = a.mo85604a("install_packagename");
            if (TextUtils.isEmpty(a2)) {
                C23886a.m87342a(4, -3);
                finish();
                str = "PackageInstallerActivity can not find filePath.";
            } else {
                try {
                    Intent a4 = m87526a(this, a2);
                    a4.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
                    a4.putExtra("android.intent.extra.RETURN_RESULT", true);
                    C23834a.m87119c("PackageInstallerActivity", " onCreate filePath:" + a2 + ",packageName:" + a3 + ",taskId:" + getTaskId());
                    startActivityForResult(a4, 1000);
                    return;
                } catch (Exception unused) {
                    C23834a.m87118b("PackageInstallerActivity", "can not start install action");
                    C23886a.m87342a(4, -2);
                    finish();
                    return;
                }
            }
        }
        C23834a.m87118b("PackageInstallerActivity", str);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        finishActivity(1000);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        com_huawei_updatesdk_support_pm_PackageInstallerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(this);
    }

    public static void com_huawei_updatesdk_support_pm_PackageInstallerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(PackageInstallerActivity packageInstallerActivity) {
        packageInstallerActivity.PackageInstallerActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PackageInstallerActivity packageInstallerActivity2 = packageInstallerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    packageInstallerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
