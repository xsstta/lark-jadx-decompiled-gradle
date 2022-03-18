package com.ss.android.lark.mm.utils;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.ttm.player.MediaPlayer;

/* renamed from: com.ss.android.lark.mm.utils.g */
public class C47103g {
    /* renamed from: a */
    public static void m186548a(Activity activity) {
        Window window = activity.getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    /* renamed from: b */
    public static void m186549b(Activity activity) {
        try {
            Window window = activity.getWindow();
            window.clearFlags(67108864);
            int i = 1280;
            if (Build.VERSION.SDK_INT >= 23) {
                i = 9472;
            }
            window.getDecorView().setSystemUiVisibility(i);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } catch (Exception e) {
            C45855f.m181666e("MmImmersiveUtils", e.getMessage());
        }
    }

    /* renamed from: c */
    public static void m186550c(Activity activity) {
        try {
            Window window = activity.getWindow();
            window.clearFlags(67108864);
            int i = 1280;
            if (Build.VERSION.SDK_INT >= 26) {
                window.clearFlags(134217728);
                if (!UDUiModeUtils.m93319a(activity)) {
                    i = 1296;
                }
                i |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
            }
            window.getDecorView().setSystemUiVisibility(i);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(-16777216);
        } catch (Exception e) {
            C45855f.m181666e("MmImmersiveUtils", e.getMessage());
        }
    }

    /* renamed from: d */
    public static void m186551d(Activity activity) {
        if (!UDUiModeUtils.m93319a(activity)) {
            try {
                Window window = activity.getWindow();
                window.clearFlags(67108864);
                int i = 1024;
                if (Build.VERSION.SDK_INT >= 23) {
                    i = 9216;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    window.clearFlags(134217728);
                    i = i | 16 | MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
                }
                window.getDecorView().setSystemUiVisibility(i);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(-1);
            } catch (Exception e) {
                C45855f.m181666e("MmImmersiveUtils", e.getMessage());
            }
        }
    }
}
