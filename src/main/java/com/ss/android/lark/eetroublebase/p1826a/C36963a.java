package com.ss.android.lark.eetroublebase.p1826a;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.eetroublebase.AbstractC36967b;
import com.ss.android.lark.eetroublebase.C36960a;
import com.ss.android.lark.eetroublebase.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.eetroublebase.a.a */
public class C36963a {
    /* renamed from: a */
    private static Map<String, Object> m145941a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                hashMap.put(str, bundle.get(str));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, Object> m145940a(Activity activity) {
        HashMap hashMap = new HashMap();
        if (m145943a(activity.getClass().getCanonicalName()) && activity.getIntent() != null) {
            hashMap.put("bundle", m145941a(activity.getIntent().getExtras()));
        }
        if (activity instanceof AbstractC36967b) {
            try {
                Map<String, String> c = ((AbstractC36967b) activity).mo129679c();
                if (c != null) {
                    hashMap.put("domainMsg", c);
                }
            } catch (Exception e) {
                Log.m145906a("onTroubleCaptureDomainMsg exception", e);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, Object> m145942a(Fragment fragment) {
        HashMap hashMap = new HashMap();
        if (m145943a(fragment.getClass().getCanonicalName())) {
            hashMap.put("bundle", m145941a(fragment.getArguments()));
        }
        if (fragment instanceof AbstractC36967b) {
            try {
                Map<String, String> c = ((AbstractC36967b) fragment).mo129679c();
                if (c != null) {
                    hashMap.put("domainMsg", c);
                }
            } catch (Exception e) {
                Log.m145906a("onTroubleCaptureDomainMsg exception", e);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private static boolean m145943a(String str) {
        List<String> g = C36960a.m145914a().mo136421g();
        if (g != null) {
            return g.contains(str);
        }
        List<String> h = C36960a.m145914a().mo136422h();
        if (h != null) {
            return !h.contains(str);
        }
        return false;
    }
}
