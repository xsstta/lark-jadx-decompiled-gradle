package com.ss.android.lark.voip.service.impl.app;

import android.text.TextUtils;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.voip.service.impl.app.m */
public class C58095m {

    /* renamed from: a */
    static final Map<String, C58096a> f142904a = new HashMap();

    /* renamed from: d */
    private static boolean m225344d(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.voip.service.impl.app.m$a */
    public static class C58096a {

        /* renamed from: a */
        String f142905a;

        /* renamed from: b */
        VoiceCall.Status f142906b = VoiceCall.Status.NONE;

        /* renamed from: c */
        boolean f142907c;

        public C58096a(String str) {
            this.f142905a = str;
        }
    }

    /* renamed from: a */
    public static VoiceCall.Status m225339a(String str) {
        if (m225344d(str)) {
            return m225343c(str).f142906b;
        }
        return VoiceCall.Status.NONE;
    }

    /* renamed from: b */
    public static boolean m225342b(String str) {
        if (m225344d(str)) {
            return m225343c(str).f142907c;
        }
        return false;
    }

    /* renamed from: c */
    private static C58096a m225343c(String str) {
        Map<String, C58096a> map = f142904a;
        synchronized (map) {
            if (map.containsKey(str)) {
                return map.get(str);
            }
            C58096a aVar = new C58096a(str);
            map.put(str, aVar);
            return aVar;
        }
    }

    /* renamed from: a */
    public static void m225340a(String str, VoiceCall.Status status) {
        if (m225344d(str)) {
            m225343c(str).f142906b = status;
        }
    }

    /* renamed from: a */
    public static void m225341a(String str, boolean z) {
        if (m225344d(str)) {
            m225343c(str).f142907c = z;
        }
    }
}
