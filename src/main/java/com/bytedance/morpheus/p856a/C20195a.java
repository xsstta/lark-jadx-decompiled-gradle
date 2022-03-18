package com.bytedance.morpheus.p856a;

import android.app.Activity;
import android.content.IntentSender;
import com.bytedance.morpheus.core.C20208a;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;

/* renamed from: com.bytedance.morpheus.a.a */
public class C20195a {
    /* renamed from: a */
    public static SplitInstallManager m73710a() {
        return C20197c.m73722b().f49334c;
    }

    /* renamed from: a */
    public static String m73711a(String str) {
        return C20204e.m73734a().mo68374b(str);
    }

    /* renamed from: b */
    public static String m73714b(String str) {
        return C20204e.m73734a().mo68372a(str);
    }

    /* renamed from: c */
    public static int m73716c(String str) {
        return C20205f.m73738a().mo68375a(str);
    }

    /* renamed from: a */
    public static void m73712a(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        C20197c.m73722b().f49332a.add(splitInstallStateUpdatedListener);
    }

    /* renamed from: b */
    public static void m73715b(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        C20197c.m73722b().f49332a.remove(splitInstallStateUpdatedListener);
    }

    /* renamed from: a */
    public static boolean m73713a(C20208a aVar, Activity activity, int i) throws IntentSender.SendIntentException {
        return C20197c.m73722b().mo68362a(aVar, activity, i);
    }
}
