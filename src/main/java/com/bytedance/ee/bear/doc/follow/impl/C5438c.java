package com.bytedance.ee.bear.doc.follow.impl;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.doc.follow.AbstractC5415a;
import com.bytedance.ee.log.C13479a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.doc.follow.impl.c */
public class C5438c {

    /* renamed from: a */
    private static Map<String, AbstractC5415a> f15492a = new HashMap();

    /* renamed from: a */
    public static boolean m22048a(Bundle bundle) {
        return !TextUtils.isEmpty(m22049b(bundle));
    }

    /* renamed from: a */
    static void m22047a(String str) {
        C13479a.m54764b("CCMFollow_FragHelper", "removeHost:" + str);
        f15492a.remove(str);
    }

    /* renamed from: b */
    static String m22049b(Bundle bundle) {
        if (bundle == null) {
            C13479a.m54758a("CCMFollow_FragHelper", "extractFollowApiHostId no args");
            return "";
        }
        String string = bundle.getString("argFollowApiHostId");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        C13479a.m54758a("CCMFollow_FragHelper", "extractFollowApiHostId no host id");
        return "";
    }

    /* renamed from: a */
    public static AbstractC5415a m22045a(Fragment fragment) {
        String b = m22050b(fragment);
        AbstractC5415a aVar = f15492a.get(b);
        if (aVar == null) {
            C13479a.m54758a("CCMFollow_FragHelper", "extractFollowApiHost no host:" + b);
        }
        return aVar;
    }

    /* renamed from: b */
    static String m22050b(Fragment fragment) {
        if (fragment != null) {
            return m22049b(fragment.getArguments());
        }
        C13479a.m54775e("CCMFollow_FragHelper", "extractFollowApiHostId no fragment");
        return "";
    }

    /* renamed from: a */
    public static void m22046a(Fragment fragment, AbstractC5415a aVar) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        String hexString = Integer.toHexString(aVar.hashCode());
        C13479a.m54764b("CCMFollow_FragHelper", "wrapHostArgs hostId:" + hexString);
        arguments.putString("argFollowApiHostId", hexString);
        fragment.setArguments(arguments);
        f15492a.put(hexString, aVar);
    }
}
