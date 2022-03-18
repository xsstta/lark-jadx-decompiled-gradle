package com.ss.android.videoshop.p3203i;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.ss.android.videoshop.fullscreen.C64164b;
import com.ss.ttm.player.MediaPlayer;

/* renamed from: com.ss.android.videoshop.i.d */
public class C64175d {
    /* renamed from: a */
    public static boolean m252214a(Window window) {
        if (window == null || window.getAttributes() == null || (window.getAttributes().flags & 1024) != 1024) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m252212a(Activity activity, C64164b bVar) {
        Window window;
        int i;
        if (activity != null && (window = activity.getWindow()) != null) {
            if (bVar == null || bVar.mo222293a()) {
                i = MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_EXPIRED_LICENSE;
            } else {
                i = 0;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 16) {
                if (!m252214a(window)) {
                    window.addFlags(1024);
                }
            } else if (i2 < 19) {
                m252213a(window, window.getDecorView(), 0);
            } else {
                m252213a(window, window.getDecorView(), i);
            }
        }
    }

    /* renamed from: a */
    public static void m252213a(Window window, View view, int i) {
        if (window != null && view != null && Build.VERSION.SDK_INT >= 16) {
            if (m252214a(window)) {
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
