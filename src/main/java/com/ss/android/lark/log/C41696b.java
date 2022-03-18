package com.ss.android.lark.log;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.ss.android.lark.log.b */
public class C41696b {

    /* renamed from: a */
    private Handler f105897a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.log.b$a */
    public static final class C41699a {

        /* renamed from: a */
        public static final C41696b f105899a = new C41696b();
    }

    /* renamed from: com.ss.android.lark.log.b$b */
    public static class C41700b {

        /* renamed from: a */
        String f105900a;

        /* renamed from: b */
        String f105901b;

        /* renamed from: c */
        String f105902c;

        /* renamed from: d */
        boolean f105903d;
    }

    /* renamed from: a */
    public static HandlerThread m165504a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    public static C41696b m165505a() {
        return C41699a.f105899a;
    }

    private C41696b() {
        HandlerThread a = m165504a("FileWriter");
        a.start();
        this.f105897a = new Handler(a.getLooper()) {
            /* class com.ss.android.lark.log.C41696b.HandlerC416971 */

            public void handleMessage(Message message) {
                if (message.obj != null && (message.obj instanceof C41700b)) {
                    C41696b.m165506a((C41700b) message.obj);
                }
            }
        };
    }

    /* renamed from: a */
    public static void m165506a(C41700b bVar) {
        File file = new File(bVar.f105900a);
        if (!file.exists()) {
            file.mkdirs();
        }
        m165507a(new File(bVar.f105900a + "/" + bVar.f105901b), bVar.f105902c, bVar.f105903d);
    }

    /* renamed from: a */
    private static final void m165509a(Closeable... closeableArr) {
        if (closeableArr != null && closeableArr.length > 0) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m165508a(String str, int i) {
        File[] listFiles;
        int length;
        if (i > 0) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && (length = listFiles.length - i) > 0) {
                Arrays.sort(listFiles, new Comparator<File>() {
                    /* class com.ss.android.lark.log.C41696b.C416982 */

                    /* renamed from: a */
                    public int compare(File file, File file2) {
                        int i = ((file.lastModified() - file2.lastModified()) > 0 ? 1 : ((file.lastModified() - file2.lastModified()) == 0 ? 0 : -1));
                        if (i < 0) {
                            return -1;
                        }
                        if (i == 0) {
                            return 0;
                        }
                        return 1;
                    }
                });
                for (int i2 = 0; i2 < length; i2++) {
                    listFiles[i2].delete();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m165507a(File file, String str, boolean z) {
        Throwable th;
        FileWriter fileWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
                m165508a(file.getParent(), Log.getLogConfig().mo149968c());
            }
            FileWriter fileWriter2 = new FileWriter(file, z);
            try {
                fileWriter2.write(str);
                m165509a(fileWriter2);
            } catch (IOException unused) {
                fileWriter = fileWriter2;
                m165509a(fileWriter);
            } catch (Throwable th2) {
                th = th2;
                fileWriter = fileWriter2;
                m165509a(fileWriter);
                throw th;
            }
        } catch (IOException unused2) {
            m165509a(fileWriter);
        } catch (Throwable th3) {
            th = th3;
            m165509a(fileWriter);
            throw th;
        }
    }

    /* renamed from: a */
    public void mo149962a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            mo149963a(str, str2, str3 + "-" + System.currentTimeMillis() + ".log", str4, false);
        }
    }

    /* renamed from: a */
    public void mo149963a(String str, String str2, String str3, String str4, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            C41700b bVar = new C41700b();
            bVar.f105900a = str + "/" + str2;
            bVar.f105901b = str3;
            bVar.f105902c = str4;
            bVar.f105903d = z;
            this.f105897a.sendMessage(this.f105897a.obtainMessage(0, bVar));
        }
    }
}
