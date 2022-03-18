package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public class C21590b {

    /* renamed from: a */
    private static final Lock f52521a = new ReentrantLock();

    /* renamed from: b */
    private static C21590b f52522b;

    /* renamed from: c */
    private final Lock f52523c = new ReentrantLock();

    /* renamed from: d */
    private final SharedPreferences f52524d;

    /* renamed from: a */
    public static C21590b m78184a(Context context) {
        Preconditions.checkNotNull(context);
        Lock lock = f52521a;
        lock.lock();
        try {
            if (f52522b == null) {
                f52522b = new C21590b(context.getApplicationContext());
            }
            C21590b bVar = f52522b;
            lock.unlock();
            return bVar;
        } catch (Throwable th) {
            f52521a.unlock();
            throw th;
        }
    }

    private C21590b(Context context) {
        this.f52524d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public void mo73087a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        m78185a("defaultGoogleSignInAccount", googleSignInAccount.mo73039j());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String j = googleSignInAccount.mo73039j();
        m78185a(m78187b("googleSignInAccount", j), googleSignInAccount.mo73041l());
        m78185a(m78187b("googleSignInOptions", j), googleSignInOptions.mo73051h());
    }

    /* renamed from: a */
    private final void m78185a(String str, String str2) {
        this.f52523c.lock();
        try {
            this.f52524d.edit().putString(str, str2).apply();
        } finally {
            this.f52523c.unlock();
        }
    }

    @Nullable
    /* renamed from: a */
    public GoogleSignInAccount mo73086a() {
        return m78183a(m78188c("defaultGoogleSignInAccount"));
    }

    @Nullable
    /* renamed from: a */
    private final GoogleSignInAccount m78183a(String str) {
        String c;
        if (!TextUtils.isEmpty(str) && (c = m78188c(m78187b("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.m78116a(c);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public GoogleSignInOptions mo73088b() {
        return m78186b(m78188c("defaultGoogleSignInAccount"));
    }

    @Nullable
    /* renamed from: b */
    private final GoogleSignInOptions m78186b(String str) {
        String c;
        if (!TextUtils.isEmpty(str) && (c = m78188c(m78187b("googleSignInOptions", str))) != null) {
            try {
                return GoogleSignInOptions.m78131a(c);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public String mo73089c() {
        return m78188c("refreshToken");
    }

    @Nullable
    /* renamed from: c */
    private final String m78188c(String str) {
        this.f52523c.lock();
        try {
            return this.f52524d.getString(str, null);
        } finally {
            this.f52523c.unlock();
        }
    }

    /* renamed from: d */
    public final void mo73090d() {
        String c = m78188c("defaultGoogleSignInAccount");
        m78189d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(c)) {
            m78189d(m78187b("googleSignInAccount", c));
            m78189d(m78187b("googleSignInOptions", c));
        }
    }

    /* renamed from: d */
    private final void m78189d(String str) {
        this.f52523c.lock();
        try {
            this.f52524d.edit().remove(str).apply();
        } finally {
            this.f52523c.unlock();
        }
    }

    /* renamed from: e */
    public void mo73091e() {
        this.f52523c.lock();
        try {
            this.f52524d.edit().clear().apply();
        } finally {
            this.f52523c.unlock();
        }
    }

    /* renamed from: b */
    private static String m78187b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
