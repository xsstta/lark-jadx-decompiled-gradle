package com.ss.android.lark.mm.module.floatwindow.floating.permission;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.module.floatwindow.floating.utils.RomUtils;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.ResString;

/* renamed from: com.ss.android.lark.mm.module.floatwindow.floating.permission.a */
public class C46313a {

    /* renamed from: com.ss.android.lark.mm.module.floatwindow.floating.permission.a$a */
    public interface AbstractC46314a {
        void permissionGranted(boolean z);
    }

    /* renamed from: a */
    private static Activity m183385a(Object obj) {
        if (obj instanceof Activity) {
            return (Activity) obj;
        }
        if (obj instanceof Fragment) {
            return ((Fragment) obj).getActivity();
        }
        if (obj instanceof android.app.Fragment) {
            return ((android.app.Fragment) obj).getActivity();
        }
        return null;
    }

    /* renamed from: a */
    public static void m183386a(Application application) {
        Log.m165389i("FloatPermission", "goToSettingPage");
        if (Build.VERSION.SDK_INT < 23) {
            if (RomUtils.m183406a()) {
                C46320e.m183394a(application);
                return;
            }
        } else if (RomUtils.m183407b() && Build.VERSION.SDK_INT == 23) {
            C46318c.m183390a(application);
            return;
        } else if (RomUtils.m183408c()) {
            C46321f.m183400b(application);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse("package:" + application.getPackageName()));
        intent.setFlags(268435456);
        if (intent.resolveActivity(application.getPackageManager()) != null) {
            application.startActivity(intent);
        } else {
            Log.m165383e("FloatPermission", "permission setting page not found");
        }
    }

    /* renamed from: a */
    public static boolean m183388a(Context context) {
        boolean z;
        if (context != null) {
            if (Build.VERSION.SDK_INT < 23) {
                if (RomUtils.m183406a()) {
                    z = C46320e.m183395a(context);
                } else {
                    z = true;
                }
            } else if (RomUtils.m183408c()) {
                z = C46321f.m183398a(context);
            } else {
                try {
                    z = Settings.canDrawOverlays(context);
                } catch (Exception e) {
                    C45855f.m181666e("FloatPermission", "[isGranted] exception: " + e.getMessage());
                }
            }
            Log.m165389i("FloatPermission", "isGranted : " + z);
            return z;
        }
        z = false;
        Log.m165389i("FloatPermission", "isGranted : " + z);
        return z;
    }

    /* renamed from: a */
    public static void m183387a(Context context, AbstractC46314a aVar) {
        Activity a = m183385a((Object) context);
        if (m183388a(context)) {
            C45855f.m181664c("FloatPermission", "requestPermission hasPermissions true");
            if (aVar != null) {
                aVar.permissionGranted(true);
            }
        } else if (a == null) {
            C45855f.m181664c("FloatPermission", "requestPermission activity null");
            if (aVar != null) {
                aVar.permissionGranted(false);
            }
        } else {
            C45855f.m181664c("FloatPermission", "requestFloatPermission");
            if (!a.isFinishing()) {
                C46315b.m183389a(context, "", new ResString.Editor(R.string.MMWeb_G_PopupPermission).mo165506a("appName", C45899c.m181859a().getHostDepend().mo144639g()).mo165507a(), aVar);
            }
        }
    }
}
