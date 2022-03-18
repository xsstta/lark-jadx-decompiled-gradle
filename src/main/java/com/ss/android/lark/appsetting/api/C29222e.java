package com.ss.android.lark.appsetting.api;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.ss.android.lark.appsetting.api.utils.ReflectUtils;
import com.ss.android.lark.log.Log;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.appsetting.api.e */
public class C29222e {
    /* renamed from: a */
    public static <T> T m107485a(Class<T> cls, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            Log.m165379d("SettingParseService", "parse by Gson.");
            return (T) new Gson().fromJson(str, (Class) cls);
        }
        Log.m165379d("SettingParseService", "parse by custom method:" + str2);
        return (T) ReflectUtils.f73164a.mo103622a(ReflectUtils.f73164a.mo103621a(cls), cls, str2, str);
    }
}
