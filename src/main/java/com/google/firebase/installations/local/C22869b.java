package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.FirebaseApp;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.local.b */
public class C22869b {

    /* renamed from: a */
    private static final String[] f56532a = {"*", "FCM", CodePackage.GCM, ""};

    /* renamed from: b */
    private final SharedPreferences f56533b;

    /* renamed from: c */
    private final String f56534c;

    /* renamed from: c */
    private String m83043c() {
        String string;
        synchronized (this.f56533b) {
            string = this.f56533b.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: b */
    public String mo79417b() {
        synchronized (this.f56533b) {
            String c = m83043c();
            if (c != null) {
                return c;
            }
            return m83044d();
        }
    }

    /* renamed from: d */
    private String m83044d() {
        synchronized (this.f56533b) {
            String string = this.f56533b.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey b = m83042b(string);
            if (b == null) {
                return null;
            }
            return m83041a(b);
        }
    }

    /* renamed from: a */
    public String mo79416a() {
        synchronized (this.f56533b) {
            for (String str : f56532a) {
                String string = this.f56533b.getString(m83040a(this.f56534c, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m83039a(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    private String m83039a(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public C22869b(FirebaseApp firebaseApp) {
        this.f56533b = firebaseApp.getApplicationContext().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f56534c = m83038a(firebaseApp);
    }

    /* renamed from: a */
    private static String m83038a(FirebaseApp firebaseApp) {
        String c = firebaseApp.getOptions().mo79143c();
        if (c != null) {
            return c;
        }
        String b = firebaseApp.getOptions().mo79142b();
        if (!b.startsWith("1:") && !b.startsWith("2:")) {
            return b;
        }
        String[] split = b.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    private PublicKey m83042b(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    /* renamed from: a */
    private static String m83041a(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + SmEvents.EVENT_NE_RR) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: a */
    private String m83040a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }
}
