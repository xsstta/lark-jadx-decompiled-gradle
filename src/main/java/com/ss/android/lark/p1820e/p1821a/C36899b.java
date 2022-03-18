package com.ss.android.lark.p1820e.p1821a;

import android.text.TextUtils;
import com.ss.android.lark.common.util.opus.OpusTools;

/* renamed from: com.ss.android.lark.e.a.b */
public class C36899b {

    /* renamed from: a */
    private static String f94848a = "%02d:%02d";

    /* renamed from: a */
    public static String m145651a(long j) {
        long j2 = j / 1000;
        return String.format(f94848a, Long.valueOf(j2 / 60), Long.valueOf(j2 % 60));
    }

    /* renamed from: a */
    public static boolean m145652a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        OpusTools opusTools = new OpusTools();
        if (opusTools.openOpusFile(str) == 1) {
            z = true;
        }
        opusTools.closeOpusFile();
        return z;
    }
}
