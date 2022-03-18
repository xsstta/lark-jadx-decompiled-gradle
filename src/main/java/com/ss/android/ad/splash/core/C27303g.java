package com.ss.android.ad.splash.core;

import android.content.Context;
import com.ss.android.ad.splash.C27465r;
import com.ss.android.ad.splash.core.p1251f.C27302a;
import com.ss.android.ad.splash.p1244b.C27234a;
import com.ss.android.ad.splash.p1244b.C27240b;
import com.ss.android.ad.splash.p1245c.C27242a;
import com.ss.android.ad.splash.utils.C27477g;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.g */
public final class C27303g {

    /* renamed from: a */
    private static volatile boolean f68075a;

    private C27303g() {
    }

    /* renamed from: a */
    private static void m99300a(long j) {
        String str;
        C27477g.m100326a("SplashAdSdk", "SDK init duration: " + j);
        JSONObject jSONObject = new JSONObject();
        try {
            if (C27287e.ar()) {
                str = "dur_use_file";
            } else {
                str = "dur_use_sp";
            }
            jSONObject.put(str, j);
        } catch (Exception unused) {
        }
        C27234a.m98988a().mo97122a("service_sdk_init_duration", 0, jSONObject, null);
    }

    /* renamed from: a */
    public static void m99301a(Context context, C27465r rVar) {
        if (!f68075a) {
            synchronized (C27303g.class) {
                if (!f68075a) {
                    long currentTimeMillis = System.currentTimeMillis();
                    m99302b(context.getApplicationContext(), rVar);
                    f68075a = true;
                    m99300a(System.currentTimeMillis() - currentTimeMillis);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m99302b(Context context, C27465r rVar) {
        ExecutorService executorService;
        ExecutorService executorService2;
        ExecutorService executorService3;
        C27287e.m99230a(context);
        if (rVar != null) {
            C27287e.m99235a(rVar.mo98064n());
            C27287e.m99234a(C27369u.m99790a(rVar.mo98068r()));
            C27287e.m99240a(rVar.mo98058h());
            if (rVar.mo98051a() != null) {
                executorService = rVar.mo98051a();
            } else {
                executorService = Executors.newSingleThreadExecutor();
            }
            C27287e.m99242a(executorService);
            if (rVar.mo98052b() != null) {
                executorService2 = rVar.mo98052b();
            } else {
                executorService2 = Executors.newSingleThreadExecutor();
            }
            C27287e.m99253c(executorService2);
            if (rVar.mo98053c() != null) {
                executorService3 = rVar.mo98053c();
            } else {
                executorService3 = Executors.newSingleThreadExecutor();
            }
            C27287e.m99256d(executorService3);
            C27302a.m99297a().mo97333a(rVar.mo98054d());
            C27287e.m99254c(rVar.mo98055e());
            C27287e.m99233a(rVar.mo98056f());
            C27287e.m99237a(rVar.mo98057g());
            C27287e.m99260e(rVar.mo98059i());
            C27287e.m99264g(rVar.mo98060j());
            C27287e.m99265h(rVar.mo98061k());
            C27287e.m99268i(rVar.mo98062l());
            C27287e.m99270j(rVar.mo98063m());
            if (rVar.mo98065o()) {
                C27287e.m99252c(8);
            }
            C27287e.m99243a(rVar.mo98066p());
            C27287e.m99250b(rVar.mo98067q());
        } else {
            C27287e.m99242a(Executors.newSingleThreadExecutor());
            C27287e.m99253c(Executors.newSingleThreadExecutor());
            C27287e.m99256d(Executors.newSingleThreadExecutor());
        }
        if (C27287e.ap()) {
            C27266a.m99126a().mo97253c();
            C27242a.m99019a().mo97143b();
            C27240b.m99006a().mo97134b();
        }
    }
}
