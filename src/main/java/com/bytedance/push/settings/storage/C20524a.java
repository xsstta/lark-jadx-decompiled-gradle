package com.bytedance.push.settings.storage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.push.settings.C20520j;

/* renamed from: com.bytedance.push.settings.storage.a */
final class C20524a implements AbstractC20532e {
    @Override // com.bytedance.push.settings.storage.AbstractC20532e
    /* renamed from: a */
    public String mo69106a() {
        return "_contains";
    }

    C20524a() {
    }

    /* renamed from: a */
    static boolean m74737a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("_result");
    }

    /* renamed from: a */
    static Bundle m74736a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("_storage_key", str);
        bundle.putString("_key", str2);
        return bundle;
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20532e
    /* renamed from: a */
    public Bundle mo69105a(Context context, String str, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("_storage_key");
        String string2 = bundle.getString("_key");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("_result", C20520j.m74723a().mo69092a(context, true, string).mo69132f(string2));
        return bundle2;
    }
}
