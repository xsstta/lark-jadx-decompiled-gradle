package com.ss.android.lark.vcintegrator;

import android.content.Context;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.integrator.minutes.C39876a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.vcintegrator.SubDependencies;
import com.ss.android.vc.net.service.VCSettingsService;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vcxp.C63791b;
import com.ss.android.vcxp.C63801c;
import com.ss.android.vcxp.C63808e;

public class InitVideoChatTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        boolean b = C63791b.m250468b();
        Log.m165389i("InitVideoChatTask", "isXEnabled=" + b);
        boolean b2 = C26252ad.m94993b(context);
        boolean z2 = true;
        if (b || !b2) {
            z = false;
        } else {
            z = true;
        }
        boolean b3 = C63801c.m250501b();
        if (!z && !b3) {
            z2 = false;
        }
        if (z2) {
            VideoChatModuleProvider.m224873b();
            VideoChatService.m249602d().checkAndInit();
            C63791b.C63794b.m250479a().mo220433a(C26252ad.m94994c(context), currentTimeMillis);
        }
        if (b2) {
            C39876a.m158358a();
            if (C63808e.f161019a) {
                C63808e.f161019a = false;
                VideoChatService.m249602d().recoverX();
            }
            m224718a(context, b);
        }
    }

    /* renamed from: a */
    private void m224718a(Context context, boolean z) {
        boolean z2;
        String settings = VCSettingsService.getSettings("vc_xp_config");
        if (settings == null || settings.isEmpty()) {
            settings = "{}";
        }
        JsonElement parse = new JsonParser().parse(settings);
        if (parse == null) {
            parse = new JsonParser().parse("{}");
        }
        JsonObject asJsonObject = parse.getAsJsonObject();
        if (asJsonObject == null) {
            asJsonObject = new JsonObject();
        }
        JsonElement jsonElement = asJsonObject.get("isEnabled");
        boolean z3 = true;
        if (jsonElement == null || !jsonElement.getAsBoolean()) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean a = SubDependencies.FeatureGatingDependency.m224758a().mo196393a("byteview.meeting.android.vc_xp_config_isenabled");
        if (!z2 || !a) {
            z3 = false;
        }
        if (z3 != z) {
            C63791b.m250467a(context, Boolean.valueOf(z3));
            Log.m165389i("InitVideoChatTask", "isEnabledNew=" + z3);
        }
    }
}
