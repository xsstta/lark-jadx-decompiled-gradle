package com.bytedance.push.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.bytedance.push.notification.AbstractC20503k;
import com.bytedance.push.notification.C20481d;
import com.ss.android.message.p3002a.C59436a;
import java.io.File;

/* renamed from: com.bytedance.push.utils.a */
public class C20549a {
    /* renamed from: a */
    private static int m74834a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private static int m74839b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.startsWith("custom_sound")) {
            str = str.substring(str.length() - 1);
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static Uri m74836a(Context context, int i) {
        return Uri.parse("android.resource://" + context.getPackageName() + "/" + i);
    }

    /* renamed from: a */
    public static String m74837a(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_RINGTONES);
        if (!externalFilesDir.exists() && !externalFilesDir.mkdir()) {
            return "";
        }
        String absolutePath = externalFilesDir.getAbsolutePath();
        return absolutePath + "/" + str + ".mp3";
    }

    /* renamed from: b */
    public static Uri m74840b(Context context, String str) {
        if (C59436a.m230730a(C59436a.f147551c) || C59436a.m230730a(C59436a.f147552d) || C59436a.m230730a(C59436a.f147554f) || C59436a.m230730a(C59436a.f147555g)) {
            return Uri.fromFile(new File(str));
        }
        return FileProvider.getUriForFile(context, context.getPackageName() + ".push.file_provider", new File(str));
    }

    /* renamed from: a */
    public static int m74835a(String str, int[] iArr, String str2) {
        int b = m74839b(str);
        if (b == -1) {
            b = m74834a(str2);
        }
        if (b < 0 || iArr == null || iArr.length <= b) {
            return -1;
        }
        return iArr[b];
    }

    /* renamed from: a */
    public static boolean m74838a(Context context, C20481d dVar, String str, String str2, AbstractC20503k kVar) {
        if (dVar != null && !TextUtils.isEmpty(str) && ((str.contains("http://") || str.contains("https://")) && str.endsWith("mp3"))) {
            try {
                String a = m74837a(context, str2);
                if (TextUtils.isEmpty(a)) {
                    return false;
                }
                if (new File(a).exists()) {
                    kVar.mo68989a(a);
                    return true;
                }
                dVar.mo68972a(str, a, kVar);
                return true;
            } catch (Throwable th) {
                C20552c.m74852c("CustomSoundUtils", "Failed to create custom sound channel, create default channel！" + th.getMessage());
            }
        }
        return false;
    }
}
