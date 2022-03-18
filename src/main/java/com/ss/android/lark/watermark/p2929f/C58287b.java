package com.ss.android.lark.watermark.p2929f;

import android.graphics.Bitmap;
import com.larksuite.framework.utils.C26266d;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.ss.android.lark.watermark.f.b */
public class C58287b {

    /* renamed from: com.ss.android.lark.watermark.f.b$a */
    public interface AbstractC58288a {
        /* renamed from: a */
        void mo197298a(String str);

        /* renamed from: a */
        void mo197299a(Throwable th);
    }

    /* renamed from: a */
    private static void m226018a(AbstractC58288a aVar, String str) {
        if (aVar != null) {
            Log.m165389i("FileUtil", "save success!");
            aVar.mo197298a(str);
        }
    }

    /* renamed from: a */
    private static void m226019a(AbstractC58288a aVar, Throwable th) {
        if (aVar != null) {
            Log.m165383e("FileUtil", "save success! path: " + th.getMessage());
            aVar.mo197299a(th);
        }
    }

    /* renamed from: a */
    public static void m226017a(Bitmap bitmap, File file, AbstractC58288a aVar) {
        Throwable th;
        Exception e;
        if (!file.exists()) {
            FileOutputStream fileOutputStream = null;
            try {
                file.createNewFile();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 80, fileOutputStream2);
                    fileOutputStream2.flush();
                    m226018a(aVar, file.getPath());
                    C26266d.m95082a(fileOutputStream2);
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        m226019a(aVar, e);
                        C26266d.m95082a(fileOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        C26266d.m95082a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    C26266d.m95082a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                m226019a(aVar, e);
                C26266d.m95082a(fileOutputStream);
            }
        }
    }
}
