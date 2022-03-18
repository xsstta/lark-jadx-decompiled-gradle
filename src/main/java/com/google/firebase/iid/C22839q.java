package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.AbstractC22860h;
import com.google.firebase.installations.AbstractC22863k;
import com.google.firebase.platforminfo.AbstractC22923g;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.firebase.iid.q */
public class C22839q {

    /* renamed from: a */
    private final FirebaseApp f56464a;

    /* renamed from: b */
    private final C22809ab f56465b;

    /* renamed from: c */
    private final C22815ag f56466c;

    /* renamed from: d */
    private final AbstractC22923g f56467d;

    /* renamed from: e */
    private final HeartBeatInfo f56468e;

    /* renamed from: f */
    private final AbstractC22860h f56469f;

    /* renamed from: a */
    private String m82951a() {
        try {
            return m82953a(MessageDigest.getInstance("SHA-1").digest(this.f56464a.getName().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: a */
    private static String m82953a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    private Task<String> m82956b(Task<Bundle> task) {
        return task.continueWith(C22829g.m82947a(), new C22840r(this));
    }

    /* renamed from: a */
    static boolean m82954a(String str) {
        if ("SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private String m82952a(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ String mo79358a(Task task) throws Exception {
        return m82952a((Bundle) task.getResult(IOException.class));
    }

    /* renamed from: b */
    public Task<?> mo79359b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m82956b(m82950a(str, str2, str3, bundle));
    }

    /* renamed from: c */
    public Task<?> mo79360c(String str, String str2, String str3) {
        String str4;
        String str5;
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str4 = "/topics/".concat(valueOf);
        } else {
            str4 = new String("/topics/");
        }
        bundle.putString("gcm.topic", str4);
        String valueOf2 = String.valueOf(str3);
        if (valueOf2.length() != 0) {
            str5 = "/topics/".concat(valueOf2);
        } else {
            str5 = new String("/topics/");
        }
        return m82956b(m82950a(str, str2, str5, bundle));
    }

    /* renamed from: d */
    public Task<?> mo79361d(String str, String str2, String str3) {
        String str4;
        String str5;
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str4 = "/topics/".concat(valueOf);
        } else {
            str4 = new String("/topics/");
        }
        bundle.putString("gcm.topic", str4);
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        if (valueOf2.length() != 0) {
            str5 = "/topics/".concat(valueOf2);
        } else {
            str5 = new String("/topics/");
        }
        return m82956b(m82950a(str, str2, str5, bundle));
    }

    /* renamed from: a */
    public Task<String> mo79357a(String str, String str2, String str3) {
        return m82956b(m82950a(str, str2, str3, new Bundle()));
    }

    /* renamed from: a */
    private Task<Bundle> m82950a(String str, String str2, String str3, Bundle bundle) {
        m82955b(str, str2, str3, bundle);
        return this.f56466c.mo79315a(bundle);
    }

    /* renamed from: b */
    private Bundle m82955b(String str, String str2, String str3, Bundle bundle) {
        String str4;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str);
        bundle.putString("gmp_app_id", this.f56464a.getOptions().mo79142b());
        bundle.putString("gmsv", Integer.toString(this.f56465b.mo79311e()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f56465b.mo79309c());
        bundle.putString("app_ver_name", this.f56465b.mo79310d());
        bundle.putString("firebase-app-name-hash", m82951a());
        try {
            String a = ((AbstractC22863k) Tasks.await(this.f56469f.mo79380a(false))).mo79369a();
            if (!TextUtils.isEmpty(a)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a);
            } else {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        if ("20.2.3".length() != 0) {
            str4 = "fiid-".concat("20.2.3");
        } else {
            str4 = new String("fiid-");
        }
        bundle.putString("cliv", str4);
        HeartBeatInfo.HeartBeat a2 = this.f56468e.mo79223a("fire-iid");
        if (a2 != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a2.getCode()));
            bundle.putString("Firebase-Client", this.f56467d.mo79557a());
        }
        return bundle;
    }

    public C22839q(FirebaseApp firebaseApp, C22809ab abVar, AbstractC22923g gVar, HeartBeatInfo heartBeatInfo, AbstractC22860h hVar) {
        this(firebaseApp, abVar, new C22815ag(firebaseApp.getApplicationContext(), abVar), gVar, heartBeatInfo, hVar);
    }

    C22839q(FirebaseApp firebaseApp, C22809ab abVar, C22815ag agVar, AbstractC22923g gVar, HeartBeatInfo heartBeatInfo, AbstractC22860h hVar) {
        this.f56464a = firebaseApp;
        this.f56465b = abVar;
        this.f56466c = agVar;
        this.f56467d = gVar;
        this.f56468e = heartBeatInfo;
        this.f56469f = hVar;
    }
}
