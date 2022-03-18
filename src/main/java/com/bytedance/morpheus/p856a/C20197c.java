package com.bytedance.morpheus.p856a;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Handler;
import android.util.Log;
import androidx.core.os.C0795a;
import com.bytedance.common.utility.Logger;
import com.bytedance.morpheus.AbstractC20206b;
import com.bytedance.morpheus.C20207c;
import com.bytedance.morpheus.C20211e;
import com.bytedance.morpheus.core.C20208a;
import com.google.android.play.core.splitinstall.C22681a;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.morpheus.a.c */
public class C20197c implements AbstractC20206b {

    /* renamed from: d */
    private static volatile C20197c f49331d;

    /* renamed from: a */
    List<SplitInstallStateUpdatedListener> f49332a = new CopyOnWriteArrayList();

    /* renamed from: b */
    final SplitInstallStateUpdatedListener f49333b;

    /* renamed from: c */
    SplitInstallManager f49334c = SplitInstallManagerFactory.create(C20207c.m73745a());

    @Override // com.bytedance.morpheus.AbstractC20206b
    /* renamed from: a */
    public Map<String, C20208a> mo68359a() {
        return C20211e.m73772a().mo68399b();
    }

    /* renamed from: b */
    public static C20197c m73722b() {
        if (f49331d == null) {
            synchronized (C20197c.class) {
                if (f49331d == null) {
                    f49331d = new C20197c();
                }
            }
        }
        return f49331d;
    }

    private C20197c() {
        C201981 r0 = new SplitInstallStateUpdatedListener() {
            /* class com.bytedance.morpheus.p856a.C20197c.C201981 */

            /* renamed from: a */
            public void mo68366a(final SplitInstallSessionState splitInstallSessionState) {
                if (splitInstallSessionState.status() == 5 && C0795a.m3873a()) {
                    C22681a.m82549a(C20207c.m73745a());
                    new Handler().post(new Runnable() {
                        /* class com.bytedance.morpheus.p856a.C20197c.C201981.RunnableC201991 */

                        public void run() {
                            C20207c.m73745a().getAssets();
                        }
                    });
                }
                new Handler().post(new Runnable() {
                    /* class com.bytedance.morpheus.p856a.C20197c.C201981.RunnableC202002 */

                    public void run() {
                        C20197c.m73721a(splitInstallSessionState);
                    }
                });
                for (SplitInstallStateUpdatedListener splitInstallStateUpdatedListener : C20197c.this.f49332a) {
                    splitInstallStateUpdatedListener.mo68366a(splitInstallSessionState);
                }
            }
        };
        this.f49333b = r0;
        this.f49334c.registerListener(r0);
        m73723c();
    }

    /* renamed from: c */
    private void m73723c() {
        HashMap hashMap = new HashMap();
        Set<String> installedModules = this.f49334c.getInstalledModules();
        try {
            JSONArray jSONArray = new JSONArray(C20203d.m73733a(C20207c.m73745a(), "plugins.json"));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("packageName");
                    String optString2 = optJSONObject.optString("aabName");
                    if (optString2 == null) {
                        optString2 = optString;
                    }
                    C20204e.m73734a().mo68373a(optString, optString2);
                    if (installedModules.contains(optString2)) {
                        hashMap.put(optString, new C20208a(optString, C20207c.m73750b().mo68356b(), 5));
                    } else {
                        int a = C20205f.m73738a().mo68375a(optString);
                        if (a == -1) {
                            hashMap.put(optString, new C20208a(optString, C20207c.m73750b().mo68356b(), 0));
                        } else {
                            Task<SplitInstallSessionState> sessionState = this.f49334c.getSessionState(a);
                            if (!sessionState.isComplete()) {
                                hashMap.put(optString, new C20208a(optString, C20207c.m73750b().mo68356b(), 0));
                            } else {
                                hashMap.put(optString, m73720a(optString, sessionState.getResult()));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            Logger.m15171e("Morpheus", "parseConf plugins.conf error", e);
        }
        C20211e.m73772a().mo68398a(hashMap);
    }

    @Override // com.bytedance.morpheus.AbstractC20206b
    /* renamed from: b */
    public C20208a mo68364b(String str) {
        return C20211e.m73772a().mo68395a(str);
    }

    /* renamed from: a */
    public static void m73721a(SplitInstallSessionState splitInstallSessionState) {
        for (String str : splitInstallSessionState.moduleNames()) {
            String b = C20204e.m73734a().mo68374b(str);
            C20211e.m73772a().mo68396a(m73720a(b, splitInstallSessionState));
            C20196b.m73717a().mo68358a(b, splitInstallSessionState);
        }
    }

    @Override // com.bytedance.morpheus.AbstractC20206b
    /* renamed from: a */
    public void mo68361a(final String str) {
        this.f49334c.startInstall(SplitInstallRequest.newBuilder().addModule(C20204e.m73734a().mo68372a(str)).build()).addOnSuccessListener(new OnSuccessListener<Integer>() {
            /* class com.bytedance.morpheus.p856a.C20197c.C202023 */

            /* renamed from: a */
            public void onSuccess(Integer num) {
                C20205f.m73738a().mo68376a(str, num.intValue());
            }
        }).addOnFailureListener(new OnFailureListener() {
            /* class com.bytedance.morpheus.p856a.C20197c.C202012 */

            @Override // com.google.android.play.core.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                C20197c.this.mo68360a(exc, str);
                Log.e("Morpheus", "OnFailureListener" + exc.toString());
            }
        });
    }

    /* renamed from: a */
    private static C20208a m73720a(String str, SplitInstallSessionState splitInstallSessionState) {
        C20208a aVar = new C20208a(str, C20207c.m73750b().mo68356b(), splitInstallSessionState.status());
        aVar.mo68379a(splitInstallSessionState.totalBytesToDownload());
        aVar.mo68384b(splitInstallSessionState.bytesDownloaded());
        aVar.mo68380a(splitInstallSessionState.resolutionIntent());
        aVar.mo68386c(splitInstallSessionState.errorCode());
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68360a(Exception exc, String str) {
        C20208a aVar = new C20208a(str, C20207c.m73750b().mo68356b(), 6);
        if (exc instanceof SplitInstallException) {
            aVar.mo68386c(((SplitInstallException) exc).getErrorCode());
        }
        aVar.mo68381a(exc);
        C20211e.m73772a().mo68396a(aVar);
    }

    @Override // com.bytedance.morpheus.AbstractC20206b
    /* renamed from: a */
    public boolean mo68363a(String str, String str2) {
        if (!this.f49334c.getInstalledModules().contains(C20204e.m73734a().mo68372a(str))) {
            return false;
        }
        try {
            C22681a.m82550a(C20207c.m73745a().createPackageContext(C20207c.m73745a().getPackageName(), 0), str2);
            return true;
        } catch (Exception e) {
            Logger.m15171e("Morpheus", "loadLibrary failed.", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo68362a(C20208a aVar, Activity activity, int i) throws IntentSender.SendIntentException {
        SplitInstallSessionState a = C20196b.m73717a().mo68357a(aVar.mo68382b());
        if (a != null) {
            return this.f49334c.startConfirmationDialogForResult(a, activity, i);
        }
        Log.e("Morpheus", "startConfirmationDialogForResult failed because sessionState is null");
        return false;
    }
}
