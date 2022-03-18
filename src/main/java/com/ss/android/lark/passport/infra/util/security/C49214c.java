package com.ss.android.lark.passport.infra.util.security;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49148ac;
import com.ss.android.lark.passport.infra.util.security.AesCbcWithIntegrityUtils;
import java.nio.charset.StandardCharsets;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ss.android.lark.passport.infra.util.security.c */
public class C49214c {

    /* renamed from: a */
    private final Context f123530a;

    /* renamed from: b */
    private AesCbcWithIntegrityUtils.C49211b f123531b;

    /* renamed from: b */
    public String mo171728b(String str) {
        return m194026a(str);
    }

    public C49214c(Context context) {
        this.f123530a = context;
        this.f123531b = m194028b(context);
    }

    /* renamed from: c */
    private AesCbcWithIntegrityUtils.C49211b m194029c(Context context) {
        AesCbcWithIntegrityUtils.C49211b a = new C49212a(context).mo171725a();
        this.f123531b = a;
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m194030d(Context context) {
        if (C26252ad.m94993b(context) && this.f123531b == null) {
            Log.m165383e("Encript", "checkIsEmptyKeys is empty");
            m194029c(context);
            ServiceFinder.m193757l().logoutAll(this.f123530a, null);
        }
    }

    /* renamed from: c */
    public String mo171729c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return AesCbcWithIntegrityUtils.m193984a(str, this.f123531b).toString();
        } catch (Exception e) {
            Log.m165384e("Encript", "encrypt error", e);
            return str;
        }
    }

    /* renamed from: a */
    public static String m194026a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            instance.update(bytes, 0, bytes.length);
            return Base64.encodeToString(instance.digest(), 2);
        } catch (NoSuchAlgorithmException e) {
            Log.m165384e("Encript", "hashPrefKey error", e);
            return null;
        }
    }

    /* renamed from: b */
    private AesCbcWithIntegrityUtils.C49211b m194028b(Context context) {
        try {
            this.f123531b = new C49212a(context).mo171726b();
            C49148ac.m193807a(new Runnable(context) {
                /* class com.ss.android.lark.passport.infra.util.security.$$Lambda$c$VbgDlZ1PzdAYi5H787yaAwX4Qus */
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C49214c.this.m194030d(this.f$1);
                }
            }, 100);
            return this.f123531b;
        } catch (KeyStoreException e) {
            e.printStackTrace();
            Log.m165384e("Encript", "get aes key failed, reset aes key and downgrade", e);
            return m194029c(context);
        }
    }

    /* renamed from: a */
    public String mo171727a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return AesCbcWithIntegrityUtils.m193989a(new AesCbcWithIntegrityUtils.C49210a(str), this.f123531b);
        } catch (Exception e) {
            Log.m165398w("Encript", "decrypt error", e);
            return str2;
        }
    }
}
