package com.ss.android.lark.mm.utils;

import android.os.Build;
import android.widget.SeekBar;

/* renamed from: com.ss.android.lark.mm.utils.p */
public final class C47116p {
    /* renamed from: a */
    public static void m186582a(SeekBar seekBar, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            seekBar.setProgress(i, false);
        } else {
            seekBar.setProgress(i);
        }
    }
}
