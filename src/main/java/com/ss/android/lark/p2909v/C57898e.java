package com.ss.android.lark.p2909v;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.secure.AesCbcWithIntegrityUtils;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ss.android.lark.v.e */
public class C57898e implements AbstractC57895b {

    /* renamed from: a */
    private AesCbcWithIntegrityUtils.C54051b f142519a;

    /* renamed from: b */
    private SharedPreferences f142520b;

    /* renamed from: b */
    private static String m224703b(Context context) {
        String c = m224704c(context.getPackageName());
        if (TextUtils.isEmpty(c)) {
            return "RTNCQTAxN0Q4N0Y0N0Y4QjA2RTFGMzNGQzhGMjJFNUI=";
        }
        return c;
    }

    /* renamed from: a */
    private static String m224702a(Context context) {
        String str = null;
        try {
            str = (String) Build.class.getField("SERIAL").get(null);
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        Log.m165383e("SecurePolicy", "getDeviceSerialNumber is empty");
        return string;
    }

    /* renamed from: c */
    public static String m224704c(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            return Base64.encodeToString(instance.digest(), 2);
        } catch (NoSuchAlgorithmException e) {
            Log.m165398w("SecurePolicy", "Problem generating hash", e);
            return null;
        } catch (UnsupportedEncodingException e2) {
            Log.m165398w("SecurePolicy", "Problem generating hash", e2);
            return null;
        }
    }

    @Override // com.ss.android.lark.p2909v.AbstractC57895b
    /* renamed from: b */
    public String mo196233b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return AesCbcWithIntegrityUtils.m209761a(new AesCbcWithIntegrityUtils.C54050a(str), this.f142519a);
        } catch (GeneralSecurityException e) {
            Log.m165398w("SecurePolicy", "decrypt", e);
            return null;
        } catch (UnsupportedEncodingException e2) {
            Log.m165398w("SecurePolicy", "decrypt", e2);
            return null;
        }
    }

    @Override // com.ss.android.lark.p2909v.AbstractC57895b
    /* renamed from: a */
    public String mo196232a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return AesCbcWithIntegrityUtils.m209754a(str, this.f142519a).toString();
        } catch (GeneralSecurityException e) {
            Log.m165398w("SecurePolicy", "encrypt", e);
            return null;
        } catch (UnsupportedEncodingException e2) {
            Log.m165398w("SecurePolicy", "encrypt", e2);
            return null;
        }
    }

    /* renamed from: a */
    private SharedPreferences m224701a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return PreferenceManager.getDefaultSharedPreferences(context);
        }
        return context.getSharedPreferences(str, 0);
    }

    public C57898e(Context context, AesCbcWithIntegrityUtils.C54051b bVar, String str, String str2) {
        if (this.f142520b == null) {
            this.f142520b = m224701a(context, str2);
        }
        if (bVar != null) {
            this.f142519a = bVar;
        } else if (TextUtils.isEmpty(str)) {
            try {
                String b = m224703b(context);
                String string = this.f142520b.getString(b, null);
                if (string == null) {
                    this.f142519a = AesCbcWithIntegrityUtils.m209757a();
                    if (!this.f142520b.edit().putString(b, this.f142519a.toString()).commit()) {
                        Log.m165397w("SecurePolicy", "Key not committed to prefs");
                    }
                } else {
                    this.f142519a = AesCbcWithIntegrityUtils.m209758a(string);
                }
                if (this.f142519a == null) {
                    throw new GeneralSecurityException("Problem generating Key");
                }
            } catch (GeneralSecurityException e) {
                Log.m165384e("SecurePolicy", "Error init:" + e.getMessage(), e);
                throw new IllegalStateException(e);
            }
        } else {
            try {
                AesCbcWithIntegrityUtils.C54051b a = AesCbcWithIntegrityUtils.m209759a(str, m224702a(context));
                this.f142519a = a;
                if (a == null) {
                    throw new GeneralSecurityException("Problem generating Key From Password");
                }
            } catch (GeneralSecurityException e2) {
                Log.m165383e("SecurePolicy", "Error init using user password:" + e2.getMessage());
                throw new IllegalStateException(e2);
            }
        }
    }
}
