package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.p */
public final class C2442p {

    /* renamed from: a */
    private static final File f8003a = new File("/proc/self/fd");

    /* renamed from: b */
    private static volatile C2442p f8004b;

    /* renamed from: c */
    private final boolean f8005c = m10317b();

    /* renamed from: d */
    private final int f8006d;

    /* renamed from: e */
    private final int f8007e;

    /* renamed from: f */
    private int f8008f;

    /* renamed from: g */
    private boolean f8009g = true;

    /* renamed from: a */
    public static C2442p m10316a() {
        if (f8004b == null) {
            synchronized (C2442p.class) {
                if (f8004b == null) {
                    f8004b = new C2442p();
                }
            }
        }
        return f8004b;
    }

    C2442p() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8006d = 20000;
            this.f8007e = 0;
            return;
        }
        this.f8006d = 700;
        this.f8007e = SmActions.ACTION_ONTHECALL_EXIT;
    }

    /* renamed from: c */
    private synchronized boolean m10318c() {
        boolean z = true;
        int i = this.f8008f + 1;
        this.f8008f = i;
        if (i >= 50) {
            this.f8008f = 0;
            int length = f8003a.list().length;
            if (length >= this.f8006d) {
                z = false;
            }
            this.f8009g = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f8006d);
            }
        }
        return this.f8009g;
    }

    /* renamed from: b */
    private static boolean m10317b() {
        if (Build.MODEL == null || Build.MODEL.length() < 7) {
            return true;
        }
        String substring = Build.MODEL.substring(0, 7);
        substring.hashCode();
        char c = 65535;
        switch (substring.hashCode()) {
            case -1398613787:
                if (substring.equals("SM-A520")) {
                    c = 0;
                    break;
                }
                break;
            case -1398431166:
                if (substring.equals("SM-G930")) {
                    c = 1;
                    break;
                }
                break;
            case -1398431161:
                if (substring.equals("SM-G935")) {
                    c = 2;
                    break;
                }
                break;
            case -1398431073:
                if (substring.equals("SM-G960")) {
                    c = 3;
                    break;
                }
                break;
            case -1398431068:
                if (substring.equals("SM-G965")) {
                    c = 4;
                    break;
                }
                break;
            case -1398343746:
                if (substring.equals("SM-J720")) {
                    c = 5;
                    break;
                }
                break;
            case -1398222624:
                if (substring.equals("SM-N935")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (Build.VERSION.SDK_INT != 26) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    /* renamed from: a */
    public boolean mo10957a(int i, int i2, boolean z, boolean z2) {
        int i3;
        if (!z || !this.f8005c || Build.VERSION.SDK_INT < 26 || z2 || i < (i3 = this.f8007e) || i2 < i3 || !m10318c()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10956a(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean a = mo10957a(i, i2, z, z2);
        if (a) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return a;
    }
}
