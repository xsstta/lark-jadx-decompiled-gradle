package com.bytedance.ee.bear.screenshot;

import android.content.Context;
import com.bytedance.ee.log.C13479a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.bytedance.ee.bear.screenshot.a */
public class C10779a {
    /* renamed from: a */
    public static File m44660a(Context context) {
        File file = new File(context.getExternalFilesDir(""), "Space");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public static boolean m44662a(Context context, String str) {
        try {
            File file = new File(m44660a(context).getAbsolutePath() + File.separator + "temp" + str);
            file.createNewFile();
            file.delete();
            return true;
        } catch (Exception e) {
            C13479a.m54761a("isfileNameVaild", e);
            return false;
        }
    }

    /* renamed from: a */
    public static String m44661a(Context context, String str, String str2) {
        return m44660a(context).getAbsolutePath() + File.separator + m44663b(context, str, str2);
    }

    /* renamed from: b */
    public static String m44663b(Context context, String str, String str2) {
        String format = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String str3 = str + format + str2;
        if (m44662a(context, str3)) {
            return str3;
        }
        return format + str2;
    }
}
