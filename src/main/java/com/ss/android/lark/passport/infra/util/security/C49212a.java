package com.ss.android.lark.passport.infra.util.security;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49201o;
import com.ss.android.lark.passport.infra.util.security.AesCbcWithIntegrityUtils;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;

/* renamed from: com.ss.android.lark.passport.infra.util.security.a */
public class C49212a {

    /* renamed from: a */
    private final Context f123527a;

    /* renamed from: b */
    private final File f123528b = new File(m194014a("lkSuitPreference"));

    /* renamed from: c */
    private void m194016c() {
        File file = this.f123528b;
        if (file != null) {
            file.delete();
        }
    }

    /* renamed from: f */
    private AesCbcWithIntegrityUtils.C49211b m194019f() {
        return AesCbcWithIntegrityUtils.m193987a("hhHRwpTDFTI3nzMjp1xp/A==:+3D6+XFsrHIouUWP1oyBn0/sWl5IbNTt3XYdyEyvaO0=");
    }

    /* renamed from: d */
    private boolean m194017d() {
        return PreferenceManager.getDefaultSharedPreferences(this.f123527a).getBoolean("is_default_aes_key", false);
    }

    /* renamed from: a */
    public AesCbcWithIntegrityUtils.C49211b mo171725a() {
        m194016c();
        m194018e();
        return m194019f();
    }

    /* renamed from: e */
    private void m194018e() {
        PreferenceManager.getDefaultSharedPreferences(this.f123527a).edit().putBoolean("is_default_aes_key", true).apply();
    }

    /* renamed from: g */
    private AesCbcWithIntegrityUtils.C49211b m194020g() {
        try {
            return AesCbcWithIntegrityUtils.m193988a(this.f123527a.getPackageName(), AesCbcWithIntegrityUtils.m193992a());
        } catch (GeneralSecurityException e) {
            Log.m165383e("AesKeyPreferenceHelper", "generateAesKey error: " + e);
            return null;
        }
    }

    /* renamed from: b */
    public AesCbcWithIntegrityUtils.C49211b mo171726b() throws KeyStoreException {
        if (m194017d()) {
            return m194019f();
        }
        C49215d dVar = new C49215d(new File(m194014a("lock")));
        try {
            dVar.mo171730a();
            if (!this.f123528b.exists() || TextUtils.isEmpty(m194013a(this.f123528b))) {
                AesCbcWithIntegrityUtils.C49211b g = m194020g();
                if (g == null) {
                    g = m194019f();
                }
                boolean a = m194015a(this.f123528b, g.toString());
                boolean encryptFile = ServiceFinder.m193752g().encryptFile(this.f123528b);
                if (!a || !encryptFile) {
                    g = m194019f();
                    m194018e();
                }
                dVar.mo171731b();
                return g;
            }
            AesCbcWithIntegrityUtils.C49211b a2 = AesCbcWithIntegrityUtils.m193987a(new String(ServiceFinder.m193752g().decryptFile(this.f123528b)));
            dVar.mo171731b();
            return a2;
        } catch (KeyStoreException e) {
            Log.m165384e("AesKeyPreferenceHelper", "decryptAesKey error: ", e);
            throw e;
        } catch (Throwable th) {
            dVar.mo171731b();
            throw th;
        }
    }

    public C49212a(Context context) {
        this.f123527a = context;
    }

    /* renamed from: a */
    private String m194014a(String str) {
        File filesDir = this.f123527a.getFilesDir();
        if (filesDir == null) {
            return "";
        }
        String absolutePath = filesDir.getAbsolutePath();
        return absolutePath.concat("/" + str);
    }

    /* renamed from: a */
    private String m194013a(File file) {
        Throwable th;
        IOException e;
        StringBuilder sb = new StringBuilder();
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            while (true) {
                try {
                    int read = fileReader2.read();
                    if (read == -1) {
                        break;
                    }
                    sb.append((char) read);
                } catch (IOException e2) {
                    e = e2;
                    fileReader = fileReader2;
                    try {
                        e.printStackTrace();
                        C49201o.m193966a(fileReader);
                        return sb.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        C49201o.m193966a(fileReader);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileReader = fileReader2;
                    C49201o.m193966a(fileReader);
                    throw th;
                }
            }
            C49201o.m193966a(fileReader2);
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            C49201o.m193966a(fileReader);
            return sb.toString();
        }
        return sb.toString();
    }

    /* renamed from: a */
    private boolean m194015a(File file, String str) {
        Throwable th;
        IOException e;
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                fileWriter2.write(str);
                fileWriter2.flush();
                C49201o.m193966a(fileWriter2);
                return true;
            } catch (IOException e2) {
                e = e2;
                fileWriter = fileWriter2;
                try {
                    e.printStackTrace();
                    C49201o.m193966a(fileWriter);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    C49201o.m193966a(fileWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileWriter = fileWriter2;
                C49201o.m193966a(fileWriter);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            C49201o.m193966a(fileWriter);
            return false;
        }
    }
}
