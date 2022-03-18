package com.ss.android.lark.diskmanage.smalldisk;

import android.os.Environment;

/* renamed from: com.ss.android.lark.diskmanage.smalldisk.a */
public final class C36832a {
    /* renamed from: a */
    public static boolean m145309a(long j) {
        if (Environment.getDataDirectory().getFreeSpace() < j) {
            return true;
        }
        return false;
    }
}
