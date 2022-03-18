package com.ss.android.lark.p2921w;

import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2921w.p2922a.AbstractC58204a;
import com.ss.android.lark.p2921w.p2923b.C58206a;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStoreException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.w.a */
public class C58201a {

    /* renamed from: b */
    public static AbstractC58204a f143132b;

    /* renamed from: c */
    private static volatile boolean f143133c;

    /* renamed from: a */
    public File f143134a;

    /* renamed from: d */
    private Context f143135d;

    /* renamed from: e */
    private Object f143136e;

    /* renamed from: f */
    private C58206a f143137f;

    /* renamed from: com.ss.android.lark.w.a$a */
    private class RunnableC58203a implements Runnable {
        public void run() {
            boolean z;
            int i = 0;
            if (C58201a.f143132b != null) {
                z = C58201a.f143132b.mo178259a().mo178261a("feature_key_seccache");
            } else {
                z = false;
            }
            try {
                FileWriter fileWriter = new FileWriter(C58201a.this.f143134a);
                if (z) {
                    i = 1;
                }
                fileWriter.write(i);
                fileWriter.flush();
                fileWriter.close();
                Log.m165379d("SecCacheModule", "update local feature success -> " + i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private RunnableC58203a() {
        }
    }

    /* renamed from: b */
    private boolean m225826b() {
        if (this.f143136e == null) {
            try {
                if (this.f143134a.exists()) {
                    FileReader fileReader = new FileReader(this.f143134a);
                    int read = fileReader.read();
                    fileReader.close();
                    boolean z = true;
                    if (read != 1) {
                        z = false;
                    }
                    f143133c = z;
                } else {
                    f143133c = false;
                }
                this.f143136e = new byte[0];
            } catch (Exception e) {
                Log.m165383e("SecCacheModule", e.getMessage());
                this.f143136e = new byte[0];
            } catch (Throwable th) {
                this.f143136e = new byte[0];
                throw th;
            }
        }
        return f143133c;
    }

    /* renamed from: a */
    public void mo197213a() {
        this.f143137f = C58206a.m225833a();
        CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new RunnableC58203a(), 10, TimeUnit.SECONDS);
        AbstractC58204a aVar = f143132b;
        if (aVar != null) {
            this.f143135d = aVar.mo178260b();
            this.f143134a = new File(m225825a("feature"));
        }
    }

    public C58201a(AbstractC58204a aVar) {
        f143132b = aVar;
    }

    /* renamed from: a */
    public boolean mo197214a(File file) {
        try {
            this.f143137f.mo197217a(file, m225826b());
            return true;
        } catch (Exception e) {
            Log.m165386e("SecCacheModule", e);
            return false;
        }
    }

    /* renamed from: b */
    public byte[] mo197215b(File file) throws KeyStoreException {
        try {
            return this.f143137f.mo197219b(file, m225826b());
        } catch (KeyStoreException e) {
            throw e;
        } catch (Exception e2) {
            Log.m165386e("SecCacheModule", e2);
            return new byte[0];
        }
    }

    /* renamed from: a */
    private String m225825a(String str) {
        File filesDir = this.f143135d.getFilesDir();
        if (filesDir == null) {
            return "";
        }
        String absolutePath = filesDir.getAbsolutePath();
        return absolutePath.concat("/" + str);
    }
}
