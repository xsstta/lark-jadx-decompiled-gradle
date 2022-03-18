package com.ss.android.lark.diskmanage.cipher;

import android.app.Activity;
import android.util.Pair;
import com.larksuite.framework.thread.CoreThreadPool;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.diskmanage.cipher.a */
public class C36808a {

    /* renamed from: a */
    private static AbstractC36812c f94586a;

    /* renamed from: com.ss.android.lark.diskmanage.cipher.a$a */
    public interface AbstractC36810a {
        /* renamed from: a */
        void mo102874a(DecryptException decryptException);

        /* renamed from: a */
        void mo102875a(File file);
    }

    /* renamed from: com.ss.android.lark.diskmanage.cipher.a$b */
    public interface AbstractC36811b {
        /* renamed from: a */
        float mo102809a(String str, float f);

        /* renamed from: a */
        long mo102810a(String str, long j);

        /* renamed from: a */
        String mo102811a(String str, String str2);

        /* renamed from: a */
        boolean mo102812a(String str, boolean z);

        /* renamed from: b */
        void mo102813b(String str, float f);

        /* renamed from: b */
        void mo102814b(String str, long j);

        /* renamed from: b */
        void mo102815b(String str, boolean z);
    }

    /* renamed from: com.ss.android.lark.diskmanage.cipher.a$c */
    public interface AbstractC36812c {
        /* renamed from: a */
        int mo102801a(File file);

        /* renamed from: a */
        Activity mo102802a();

        /* renamed from: a */
        Pair<Integer, String> mo102803a(String str);

        /* renamed from: a */
        void mo102804a(String str, long j, String str2, AbstractC36813d dVar);

        /* renamed from: a */
        void mo102805a(JSONObject jSONObject);

        /* renamed from: b */
        int mo102806b();

        /* renamed from: b */
        Pair<Integer, String> mo102807b(File file);

        /* renamed from: c */
        AbstractC36811b mo102808c();
    }

    /* renamed from: com.ss.android.lark.diskmanage.cipher.a$d */
    public interface AbstractC36813d {
        /* renamed from: a */
        void mo48840a();

        /* renamed from: a */
        void mo48841a(String str);
    }

    /* renamed from: a */
    static AbstractC36812c m145198a() {
        return f94586a;
    }

    /* renamed from: a */
    public static void m145208a(String str, long j, String str2, AbstractC36813d dVar) {
        if (m145198a() != null) {
            m145198a().mo102804a(str, j, str2, dVar);
        }
    }

    /* renamed from: b */
    public static AbstractC36811b m145209b() {
        if (m145198a() != null) {
            return m145198a().mo102808c();
        }
        return null;
    }

    /* renamed from: c */
    public static int m145211c() {
        if (m145198a() == null) {
            return 0;
        }
        return m145198a().mo102806b();
    }

    /* renamed from: a */
    public static void m145202a(AbstractC36812c cVar) {
        f94586a = cVar;
    }

    /* renamed from: b */
    public static File m145210b(File file) throws DecryptException {
        return m145199a(file, true);
    }

    /* renamed from: a */
    public static void m145203a(File file) throws EncryptException {
        m145212c(file);
    }

    /* renamed from: a */
    public static String m145200a(String str) throws CipherException {
        if (m145198a() == null) {
            return str;
        }
        Pair<Integer, String> a = m145198a().mo102803a(str);
        int intValue = ((Integer) a.first).intValue();
        String str2 = (String) a.second;
        if (intValue == 0) {
            return str2;
        }
        m145201a(intValue);
        throw new CipherException(intValue);
    }

    /* renamed from: c */
    private static void m145212c(File file) throws EncryptException {
        int a;
        if (m145198a() != null && (a = m145198a().mo102801a(file)) != 0) {
            m145201a(a);
            throw new EncryptException(a);
        }
    }

    /* renamed from: d */
    private static String m145213d(File file) throws DecryptException {
        if (m145198a() != null) {
            Pair<Integer, String> b = m145198a().mo102807b(file);
            int intValue = ((Integer) b.first).intValue();
            String str = (String) b.second;
            if (intValue == 0) {
                return str;
            }
            m145201a(intValue);
            throw new DecryptException(intValue);
        } else if (file != null) {
            return file.getPath();
        } else {
            return "";
        }
    }

    /* renamed from: a */
    private static void m145201a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", i);
            m145198a().mo102805a(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m145206a(Exception exc) {
        Activity a;
        if ((exc instanceof DecryptException) && m145198a() != null && (a = m145198a().mo102802a()) != null) {
            CipherErrorTipsActivity.m145191a(a, ((DecryptException) exc).getErrorCode());
        }
    }

    /* renamed from: a */
    public static File m145199a(File file, boolean z) throws DecryptException {
        try {
            return new File(m145213d(file));
        } catch (DecryptException e) {
            if (z) {
                m145206a(e);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static void m145204a(File file, AbstractC36810a aVar) {
        m145205a(file, true, aVar);
    }

    /* renamed from: a */
    public static void m145205a(final File file, final boolean z, final AbstractC36810a aVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.diskmanage.cipher.C36808a.RunnableC368091 */

            public void run() {
                try {
                    File a = C36808a.m145199a(file, z);
                    AbstractC36810a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo102875a(a);
                    }
                } catch (DecryptException e) {
                    e.printStackTrace();
                    AbstractC36810a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo102874a(e);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m145207a(String str, long j, String str2) {
        m145208a(str, j, str2, null);
    }
}
