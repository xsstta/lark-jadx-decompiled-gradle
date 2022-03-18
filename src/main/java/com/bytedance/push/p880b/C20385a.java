package com.bytedance.push.p880b;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.push.utils.Component;
import com.bytedance.push.utils.ManifestUtils;
import com.ss.android.message.NotifyService;
import com.ss.android.message.log.LogService;
import com.ss.android.push.DefaultReceiver;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.Arrays;

/* renamed from: com.bytedance.push.b.a */
public class C20385a {
    /* renamed from: a */
    public static boolean m74262a(Context context, String str) throws PackageManager.NameNotFoundException {
        return m74263b(context, str) & m74265d(context, str) & m74264c(context, str);
    }

    /* renamed from: b */
    private static boolean m74263b(Context context, String str) throws PackageManager.NameNotFoundException {
        Component.Builder process = Component.Builder.create(PushMultiProcessSharedProvider.class.getName()).setProcess(context.getPackageName());
        return ManifestUtils.checkContentProviders(context, str, "Push", Arrays.asList(process.setAuthorities(context.getPackageName() + ".push.SHARE_PROVIDER_AUTHORITY").build()));
    }

    /* renamed from: c */
    private static boolean m74264c(Context context, String str) throws PackageManager.NameNotFoundException {
        return ManifestUtils.checkReceiver(context, str, "Push", Arrays.asList(Component.Builder.create(DefaultReceiver.class.getName()).setProcess(context.getPackageName()).build()));
    }

    /* renamed from: d */
    private static boolean m74265d(Context context, String str) throws PackageManager.NameNotFoundException {
        Component.Builder create = Component.Builder.create(NotifyService.class.getName());
        Component.Builder create2 = Component.Builder.create(LogService.class.getName());
        return ManifestUtils.checkService(context, str, "Push", Arrays.asList(create.setProcess(context.getPackageName() + ":push").addIntentFilter(new Component.IntentFilter(Arrays.asList("com.ss.android.message.action.PUSH_SERVICE"))).build(), create2.setProcess(context.getPackageName() + ":push").build()));
    }
}
