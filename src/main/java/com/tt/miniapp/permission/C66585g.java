package com.tt.miniapp.permission;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;

/* renamed from: com.tt.miniapp.permission.g */
public class C66585g {

    /* renamed from: com.tt.miniapp.permission.g$a */
    public interface AbstractC66587a {
        /* renamed from: a */
        void mo232188a(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: a */
    public static boolean m260181a(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C66576a.m260103a(activity, str);
        }
        return false;
    }

    /* renamed from: a */
    public static int m260179a(Context context, String str) {
        if (str != null) {
            try {
                return context.checkPermission(str, Process.myPid(), Process.myUid());
            } catch (Throwable th) {
                th.printStackTrace();
                if (Build.VERSION.SDK_INT >= 23) {
                    return -1;
                }
                return 0;
            }
        } else {
            throw new IllegalArgumentException("permission is null");
        }
    }

    /* renamed from: a */
    public static void m260180a(final Activity activity, final String[] strArr, final int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C66576a.m260102a(activity, strArr, i);
        } else if (activity instanceof AbstractC66587a) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class com.tt.miniapp.permission.C66585g.RunnableC665861 */

                public void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                    }
                    ((AbstractC66587a) activity).mo232188a(i, strArr, iArr);
                }
            });
        }
    }
}
