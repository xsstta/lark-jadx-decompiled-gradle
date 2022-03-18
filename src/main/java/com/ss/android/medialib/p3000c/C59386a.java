package com.ss.android.medialib.p3000c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.huawei.hms.feature.dynamic.DynamicModule;

/* renamed from: com.ss.android.medialib.c.a */
public class C59386a {

    /* renamed from: a */
    private static final String f147432a = "a";

    /* renamed from: a */
    public static Pair<Integer, Integer> m230540a(Context context) {
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            z = false;
        } else {
            z = packageManager.hasSystemFeature("android.hardware.audio.low_latency");
        }
        String str = f147432a;
        Log.d(str, "has low latency ? " + z);
        int i = 44100;
        int i2 = DynamicModule.f58006b;
        if (packageManager != null) {
            packageManager.hasSystemFeature("android.hardware.audio.pro");
        }
        if (Build.VERSION.SDK_INT >= 17) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            i = m230539a(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"), 44100);
            i2 = m230539a(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER"), DynamicModule.f58006b);
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static int m230539a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }
}
