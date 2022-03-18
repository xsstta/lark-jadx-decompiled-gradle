package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import com.android.volley.AbstractC1931f;
import com.android.volley.C1934i;
import java.io.File;

/* renamed from: com.android.volley.toolbox.q */
public class C1975q {
    /* renamed from: a */
    public static C1934i m8699a(Context context) {
        return m8701a(context, (AbstractC1947b) null);
    }

    /* renamed from: a */
    private static C1934i m8700a(Context context, AbstractC1931f fVar) {
        C1934i iVar = new C1934i(new C1951e(new File(context.getCacheDir(), "volley")), fVar);
        iVar.mo9809a();
        return iVar;
    }

    /* renamed from: a */
    public static C1934i m8701a(Context context, AbstractC1947b bVar) {
        C1948c cVar;
        C1948c cVar2;
        String str;
        if (bVar != null) {
            cVar2 = new C1948c(bVar);
        } else if (Build.VERSION.SDK_INT >= 9) {
            cVar = new C1948c((AbstractC1947b) new C1959j());
            return m8700a(context, cVar);
        } else {
            try {
                String packageName = context.getPackageName();
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                str = packageName + "/" + packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "volley/0";
            }
            cVar2 = new C1948c(new C1954f(AndroidHttpClient.newInstance(str)));
        }
        cVar = cVar2;
        return m8700a(context, cVar);
    }
}
