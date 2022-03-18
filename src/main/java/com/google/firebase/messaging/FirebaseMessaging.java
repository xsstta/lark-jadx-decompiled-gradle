package com.google.firebase.messaging;

import android.content.Context;
import com.google.android.datatransport.AbstractC21394f;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.C22809ab;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.AbstractC22860h;
import com.google.firebase.platforminfo.AbstractC22923g;

public class FirebaseMessaging {

    /* renamed from: a */
    static AbstractC21394f f56561a;

    /* renamed from: b */
    private final Context f56562b;

    /* renamed from: c */
    private final FirebaseInstanceId f56563c;

    /* renamed from: d */
    private final Task<C22913t> f56564d;

    /* renamed from: b */
    public static AbstractC21394f m83139b() {
        return f56561a;
    }

    /* renamed from: a */
    public boolean mo79469a() {
        return this.f56563c.isFcmAutoInitEnabled();
    }

    static synchronized FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class);
        }
        return firebaseMessaging;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo79468a(C22913t tVar) {
        if (mo79469a()) {
            tVar.mo79544b();
        }
    }

    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, AbstractC22923g gVar, HeartBeatInfo heartBeatInfo, AbstractC22860h hVar, AbstractC21394f fVar) {
        f56561a = fVar;
        this.f56563c = firebaseInstanceId;
        Context applicationContext = firebaseApp.getApplicationContext();
        this.f56562b = applicationContext;
        Task<C22913t> a = C22913t.m83261a(firebaseApp, firebaseInstanceId, new C22809ab(applicationContext), gVar, heartBeatInfo, hVar, applicationContext, C22896f.m83170b());
        this.f56564d = a;
        a.addOnSuccessListener(C22896f.m83168a(), new C22897g(this));
    }
}
