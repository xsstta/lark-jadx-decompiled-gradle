package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import android.os.SystemClock;
import com.bytedance.ee.bear.integrator.di.KoinSetupTask;
import com.bytedance.ee.util.p701d.C13615c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import org.koin.core.context.KoinContextHandler;
import org.koin.core.module.Module;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.l */
public final class C39317l {

    /* renamed from: a */
    private static volatile Module f100647a;

    private C39317l() {
    }

    /* renamed from: b */
    public static boolean m155047b() {
        if (f100647a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Module m155046a() {
        if (f100647a == null) {
            synchronized (C39317l.class) {
                if (f100647a == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C13615c.f35773a = LarkContext.getApplication();
                    KoinSetupTask.m31646a(LarkContext.getApplication());
                    ArrayList arrayList = new ArrayList();
                    Module a = C39328t.m155065a();
                    arrayList.add(a);
                    KoinContextHandler.f175011a.mo246622a().mo246616a(arrayList);
                    f100647a = a;
                    Log.m165389i("DependencyDiInit", "DependencyDiInit#injectDependencyModule cost=" + (SystemClock.uptimeMillis() - uptimeMillis));
                }
            }
        }
        return f100647a;
    }
}
