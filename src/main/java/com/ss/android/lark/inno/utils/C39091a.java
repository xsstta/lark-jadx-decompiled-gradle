package com.ss.android.lark.inno.utils;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.ss.ttm.player.MediaPlayer;

/* renamed from: com.ss.android.lark.inno.utils.a */
public class C39091a {
    /* renamed from: a */
    public static boolean m154341a(Window window) {
        if (window == null || window.getAttributes() == null || (window.getAttributes().flags & 1024) != 1024) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m154339a(Activity activity, boolean z) {
        Window window;
        int i;
        if (activity != null && (window = activity.getWindow()) != null) {
            if (z) {
                i = MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_EXPIRED_LICENSE;
            } else {
                i = 0;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 16) {
                if (!m154341a(window)) {
                    window.addFlags(1024);
                }
            } else if (i2 < 19) {
                m154340a(window, window.getDecorView(), 0);
            } else {
                m154340a(window, window.getDecorView(), i);
            }
        }
    }

    /* renamed from: a */
    public static void m154340a(Window window, View view, int i) {
        if (window != null && view != null && Build.VERSION.SDK_INT >= 16) {
            if (m154341a(window)) {
                window.clearFlags(1024);
            }
            int systemUiVisibility = view.getSystemUiVisibility();
            int i2 = 1028;
            if (Build.VERSION.SDK_INT >= 19) {
                i2 = 5124;
            }
            if (i != 0) {
                i2 |= i;
            }
            if (systemUiVisibility != i2) {
                view.setSystemUiVisibility(i2);
            }
        }
    }
}
