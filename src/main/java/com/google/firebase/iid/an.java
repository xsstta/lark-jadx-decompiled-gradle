package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class an {

    /* renamed from: a */
    final SharedPreferences f56409a;

    /* renamed from: b */
    final Context f56410b;

    /* renamed from: c */
    private final Map<String, Long> f56411c = new ArrayMap();

    /* renamed from: a */
    public synchronized boolean mo79330a() {
        return this.f56409a.getAll().isEmpty();
    }

    /* renamed from: b */
    public synchronized void mo79332b() {
        this.f56411c.clear();
        this.f56409a.edit().clear().commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.iid.an$a */
    public static class C22819a {

        /* renamed from: d */
        private static final long f56412d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f56413a;

        /* renamed from: b */
        final String f56414b;

        /* renamed from: c */
        final long f56415c;

        /* renamed from: a */
        static String m82913a(C22819a aVar) {
            if (aVar == null) {
                return null;
            }
            return aVar.f56413a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo79335b(String str) {
            if (System.currentTimeMillis() > this.f56415c + f56412d || !str.equals(this.f56414b)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        static C22819a m82912a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C22819a(str, null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C22819a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        private C22819a(String str, String str2, long j) {
            this.f56413a = str;
            this.f56414b = str2;
            this.f56415c = j;
        }

        /* renamed from: a */
        static String m82914a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }
    }

    public an(Context context) {
        this.f56410b = context;
        this.f56409a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m82900d("com.google.android.gms.appid-no-backup");
    }

    /* renamed from: f */
    private long m82902f(String str) {
        String string = this.f56409a.getString(m82898a(str, "cre"), null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public synchronized long mo79327a(String str) {
        Long l = this.f56411c.get(str);
        if (l != null) {
            return l.longValue();
        }
        return m82902f(str);
    }

    /* renamed from: b */
    public synchronized long mo79331b(String str) {
        long g;
        g = m82903g(str);
        this.f56411c.put(str, Long.valueOf(g));
        return g;
    }

    /* renamed from: c */
    public synchronized void mo79334c(String str) {
        m82901e(String.valueOf(str).concat("|T|"));
    }

    /* renamed from: e */
    private void m82901e(String str) {
        SharedPreferences.Editor edit = this.f56409a.edit();
        for (String str2 : this.f56409a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    /* renamed from: g */
    private long m82903g(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f56409a.contains(m82898a(str, "cre"))) {
            return m82902f(str);
        }
        SharedPreferences.Editor edit = this.f56409a.edit();
        edit.putString(m82898a(str, "cre"), String.valueOf(currentTimeMillis));
        edit.commit();
        return currentTimeMillis;
    }

    /* renamed from: d */
    private void m82900d(String str) {
        String str2;
        File file = new File(ContextCompat.getNoBackupFilesDir(this.f56410b), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo79330a()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    mo79332b();
                    FirebaseInstanceId.getInstance().resetStorageAndScheduleSync();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        str2 = "Error creating file in no backup dir: ".concat(valueOf);
                    } else {
                        str2 = new String("Error creating file in no backup dir: ");
                    }
                    Log.d("FirebaseInstanceId", str2);
                }
            }
        }
    }

    /* renamed from: a */
    static String m82898a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    private String m82899c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    public synchronized C22819a mo79328a(String str, String str2, String str3) {
        return C22819a.m82912a(this.f56409a.getString(m82899c(str, str2, str3), null));
    }

    /* renamed from: b */
    public synchronized void mo79333b(String str, String str2, String str3) {
        String c = m82899c(str, str2, str3);
        SharedPreferences.Editor edit = this.f56409a.edit();
        edit.remove(c);
        edit.commit();
    }

    /* renamed from: a */
    public synchronized void mo79329a(String str, String str2, String str3, String str4, String str5) {
        String a = C22819a.m82914a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.f56409a.edit();
            edit.putString(m82899c(str, str2, str3), a);
            edit.commit();
        }
    }
}
