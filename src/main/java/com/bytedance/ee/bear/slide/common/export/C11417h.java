package com.bytedance.ee.bear.slide.common.export;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.io.C13683i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipInputStream;

/* renamed from: com.bytedance.ee.bear.slide.common.export.h */
public class C11417h {

    /* renamed from: a */
    private static final String f30682a = ("Slide" + File.separator + "Export");

    /* renamed from: b */
    public static boolean m47423b(Context context) {
        return ((PowerManager) context.getSystemService("power")).isInteractive();
    }

    /* renamed from: c */
    public static boolean m47424c(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    /* renamed from: a */
    public static File m47420a(Context context) {
        File file = new File(context.getExternalFilesDir(""), "Space");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public static String m47421a(String str, String str2) {
        return "https://" + C6313i.f17509a + "/space/file/f/cdp-" + str + "-" + str2 + "~noop/";
    }

    /* renamed from: a */
    public static void m47422a(File file, String str) {
        Throwable th;
        FileNotFoundException e;
        IOException e2;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                ZipInputStream zipInputStream = new ZipInputStream(fileInputStream2);
                File file2 = new File(str);
                if (file2.exists()) {
                    file2.delete();
                }
                file2.mkdirs();
                C13683i.m55567a(zipInputStream, file2.getAbsolutePath(), true);
                C13675f.m55517b(fileInputStream2);
            } catch (FileNotFoundException e3) {
                e = e3;
                fileInputStream = fileInputStream2;
                C13479a.m54761a("SlideExportUtil", e);
                C13675f.m55517b(fileInputStream);
            } catch (IOException e4) {
                e2 = e4;
                fileInputStream = fileInputStream2;
                try {
                    C13479a.m54761a("SlideExportUtil", e2);
                    C13675f.m55517b(fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    C13675f.m55517b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                C13675f.m55517b(fileInputStream);
                throw th;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
            C13479a.m54761a("SlideExportUtil", e);
            C13675f.m55517b(fileInputStream);
        } catch (IOException e6) {
            e2 = e6;
            C13479a.m54761a("SlideExportUtil", e2);
            C13675f.m55517b(fileInputStream);
        }
    }
}
