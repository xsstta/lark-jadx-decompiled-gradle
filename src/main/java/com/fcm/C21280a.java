package com.fcm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.utils.Component;
import com.bytedance.push.utils.ManifestUtils;
import com.larksuite.suite.R;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.fcm.a */
class C21280a {
    /* renamed from: a */
    static boolean m77095a(String str, Context context) throws PackageManager.NameNotFoundException {
        return m77094a(context, str) & m77096b(str, context);
    }

    /* renamed from: b */
    private static boolean m77096b(String str, Context context) {
        boolean z;
        String string = context.getResources().getString(R.string.google_api_key);
        String string2 = context.getResources().getString(R.string.google_app_id);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            PushSupporter.logger().mo68949d(str, "Fcm Push error，missing google-service.json in assets or config error");
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m77094a(Context context, String str) throws PackageManager.NameNotFoundException {
        return ManifestUtils.checkService(context, str, "Fcm Push 错误", Arrays.asList(Component.Builder.create("com.fcm.service.SSGcmListenerService").setProcess(context.getPackageName()).addIntentFilter(new Component.IntentFilter(Collections.singletonList("com.google.firebase.MESSAGING_EVENT"))).build(), Component.Builder.create("com.fcm.service.FcmRegistrationJobIntentService").setProcess(context.getPackageName()).setPermission("android.permission.BIND_JOB_SERVICE").build()));
    }
}
