package com.ss.android.lark.secure;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.C36888e;
import com.ss.android.lark.secure.AesCbcWithIntegrityUtils;
import com.ss.android.lark.utils.C57839i;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: com.ss.android.lark.secure.a */
public class C54052a {

    /* renamed from: a */
    private Context f133850a = C36888e.m145598a();

    /* renamed from: b */
    private File f133851b = new File(m209783a("kPreference"));

    /* renamed from: c */
    private volatile AesCbcWithIntegrityUtils.C54051b f133852c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.secure.a$a */
    public static class C54053a {

        /* renamed from: a */
        public static final C54052a f133853a = new C54052a();
    }

    /* renamed from: a */
    public static C54052a m209781a() {
        return C54053a.f133853a;
    }

    /* renamed from: c */
    private AesCbcWithIntegrityUtils.C54051b m209785c() throws GeneralSecurityException {
        return AesCbcWithIntegrityUtils.m209760a(this.f133850a.getPackageName(), AesCbcWithIntegrityUtils.m209765b());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public AesCbcWithIntegrityUtils.C54051b mo185049b() throws GeneralSecurityException {
        if (this.f133852c != null) {
            return this.f133852c;
        }
        C54054b bVar = new C54054b(new File(m209783a("aes_Key_lock")));
        try {
            bVar.mo185050a();
            if (this.f133851b.exists()) {
                String a = m209782a(this.f133851b);
                if (!TextUtils.isEmpty(a)) {
                    this.f133852c = AesCbcWithIntegrityUtils.m209758a(a);
                    bVar.mo185051b();
                    return this.f133852c;
                }
            }
            this.f133852c = m209785c();
            m209784a(this.f133851b, this.f133852c.toString());
            bVar.mo185051b();
            return this.f133852c;
        } catch (Throwable th) {
            bVar.mo185051b();
            throw th;
        }
    }

    /* renamed from: a */
    private String m209782a(File file) {
        Throwable th;
        Exception e;
        FileReader fileReader;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                char[] cArr = new char[SmActions.ACTION_ONTHECALL_EXIT];
                fileReader.read(cArr);
                String str = new String(cArr);
                C57839i.m224502a(fileReader);
                return str;
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    C57839i.m224502a(fileReader);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileReader2 = fileReader;
                    C57839i.m224502a(fileReader2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileReader = null;
            e.printStackTrace();
            C57839i.m224502a(fileReader);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C57839i.m224502a(fileReader2);
            throw th;
        }
    }

    /* renamed from: a */
    private String m209783a(String str) {
        File filesDir = this.f133850a.getFilesDir();
        if (filesDir == null) {
            return "";
        }
        String absolutePath = filesDir.getAbsolutePath();
        return absolutePath.concat("/" + str);
    }

    /* renamed from: a */
    private void m209784a(File file, String str) {
        Throwable th;
        IOException e;
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                fileWriter2.write(str);
                fileWriter2.flush();
                C57839i.m224502a(fileWriter2);
            } catch (IOException e2) {
                e = e2;
                fileWriter = fileWriter2;
                try {
                    e.printStackTrace();
                    C57839i.m224502a(fileWriter);
                } catch (Throwable th2) {
                    th = th2;
                    C57839i.m224502a(fileWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileWriter = fileWriter2;
                C57839i.m224502a(fileWriter);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            C57839i.m224502a(fileWriter);
        }
    }
}
