package com.bytedance.crash.runtime;

import android.text.TextUtils;
import com.bytedance.crash.C3686a;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.util.C3949m;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.runtime.f */
public class C3852f {
    /* renamed from: a */
    public static void m15966a(File file) {
        File file2 = new File(file, "external_files");
        if (file2.exists()) {
            try {
                JSONArray b = C3949m.m16418b(file2.getAbsolutePath());
                if (b != null) {
                    for (int i = 0; i < b.length(); i++) {
                        String optString = b.optString(i);
                        if (!TextUtils.isEmpty(optString)) {
                            File file3 = new File(optString);
                            if (file3.exists()) {
                                File file4 = new File(file, file3.getName());
                                if (!file4.exists()) {
                                    if (file3.length() < ((long) C3840b.m15886e(1048576))) {
                                        C3949m.m16399a(file3, file4);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m15967a(File file, CrashType crashType) {
        File file2;
        if (!C3840b.m15897o()) {
            try {
                if (crashType == CrashType.ANR) {
                    file2 = null;
                } else {
                    file2 = new File(file, "external_files");
                }
                if (file2 == null || !file2.exists()) {
                    for (C3686a aVar : C3775n.m15621a().mo15439a(crashType)) {
                        File[] a = aVar.mo15095a(crashType);
                        if (a != null) {
                            for (File file3 : a) {
                                if (crashType == CrashType.ANR) {
                                    File file4 = new File(file, file3.getName());
                                    if (!file4.exists()) {
                                        if (file3.length() < ((long) C3840b.m15886e(1048576))) {
                                            C3949m.m16399a(file3, file4);
                                        }
                                    }
                                } else {
                                    C3949m.m16402a(file2, file3.getAbsolutePath() + "\n", true);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
