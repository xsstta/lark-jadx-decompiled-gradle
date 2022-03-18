package com.bytedance.p725f.p726a.p734d;

import android.util.Log;
import com.huawei.hms.android.HwBuildEx;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: com.bytedance.f.a.d.c */
public class C13881c {

    /* renamed from: com.bytedance.f.a.d.c$a */
    public interface AbstractC13882a {
        /* renamed from: a */
        boolean mo51158a(String str);
    }

    /* renamed from: a */
    public static void m56272a(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                C13880b.m56269c(Log.getStackTraceString(e));
            }
        }
    }

    /* renamed from: a */
    public static BufferedReader m56271a(File file) {
        if (file == null || !file.exists() || !file.canRead()) {
            return null;
        }
        try {
            return new BufferedReader(new FileReader(file), HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        } catch (Exception e) {
            C13880b.m56269c(Log.getStackTraceString(e));
            return null;
        }
    }

    /* renamed from: a */
    public static void m56274a(String str, AbstractC13882a aVar) {
        if (str != null && aVar != null) {
            m56273a(new File(str), aVar);
        }
    }

    /* renamed from: a */
    public static void m56273a(File file, AbstractC13882a aVar) {
        BufferedReader a;
        if (file != null && aVar != null && (a = m56271a(file)) != null) {
            boolean z = true;
            while (z) {
                try {
                    String readLine = a.readLine();
                    if (readLine == null) {
                        break;
                    }
                    z = aVar.mo51158a(readLine);
                } catch (IOException e) {
                    C13880b.m56269c(Log.getStackTraceString(e));
                }
            }
            m56272a(a);
        }
    }
}
