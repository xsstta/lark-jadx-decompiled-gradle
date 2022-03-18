package com.ss.android.lark.cameraview.p1590d;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;

/* renamed from: com.ss.android.lark.cameraview.d.b */
public class C32773b {
    /* renamed from: a */
    public static boolean m125802a(Context context, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        int i;
        if (Build.VERSION.SDK_INT >= 19) {
            i = 4;
        } else {
            i = 2;
        }
        return m125803a(context, onAudioFocusChangeListener, i);
    }

    /* renamed from: b */
    public static boolean m125804b(Context context, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        if (((AudioManager) context.getSystemService("audio")).abandonAudioFocus(onAudioFocusChangeListener) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m125803a(Context context, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i) {
        if (((AudioManager) context.getSystemService("audio")).requestAudioFocus(onAudioFocusChangeListener, 3, i) == 1) {
            return true;
        }
        return false;
    }
}
