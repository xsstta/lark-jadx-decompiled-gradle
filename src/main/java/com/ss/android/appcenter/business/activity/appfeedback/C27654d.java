package com.ss.android.appcenter.business.activity.appfeedback;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;

/* renamed from: com.ss.android.appcenter.business.activity.appfeedback.d */
public class C27654d {

    /* renamed from: a */
    private static C27654d f69033a;

    /* renamed from: b */
    private SharedPreferences f69034b;

    /* renamed from: c */
    private SharedPreferences.Editor f69035c;

    private C27654d() {
        m100986a(C27528a.m100471a().mo98143b());
    }

    /* renamed from: a */
    public static C27654d m100985a() {
        if (f69033a == null) {
            synchronized (C27654d.class) {
                if (f69033a == null) {
                    f69033a = new C27654d();
                }
            }
        }
        return f69033a;
    }

    /* renamed from: a */
    private void m100986a(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("FeedbackSP", 0);
            this.f69034b = sharedPreferences;
            this.f69035c = sharedPreferences.edit();
        }
    }

    /* renamed from: c */
    private String m100987c(String str) {
        StringBuilder sb = new StringBuilder();
        if (C27548m.m100547m().mo98221e() == null) {
            return null;
        }
        sb.append(C27548m.m100547m().mo98221e().mo98213b());
        sb.append(str);
        C28184h.m103250d("FeedbackSP", "path feedback getCacheKey:" + ((Object) sb));
        return sb.toString();
    }

    /* renamed from: b */
    public void mo98497b(String str) {
        String c;
        if (C27528a.m100471a().mo98143b() != null && (c = m100987c(str)) != null) {
            if (this.f69035c == null || this.f69034b == null) {
                m100986a(C27528a.m100471a().mo98143b());
            }
            if (this.f69034b.contains(c)) {
                this.f69035c.remove(c);
                this.f69035c.apply();
            }
        }
    }

    /* renamed from: a */
    public C27650a mo98495a(String str) {
        String c;
        if (C27528a.m100471a().mo98143b() == null || (c = m100987c(str)) == null) {
            return null;
        }
        if (this.f69034b == null) {
            m100986a(C27528a.m100471a().mo98143b());
        }
        String string = this.f69034b.getString(c, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                C28184h.m103250d("FeedbackSP", "path feedback loadCache:" + string);
                C27650a aVar = (C27650a) new Gson().fromJson(string, C27650a.class);
                mo98497b(str);
                return aVar;
            } catch (JsonSyntaxException unused) {
                C28184h.m103248b("FeedbackSP", "parse json error. json: " + string);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo98496a(String str, C27650a aVar) {
        String c;
        if (C27528a.m100471a().mo98143b() != null && (c = m100987c(str)) != null) {
            if (this.f69035c == null) {
                m100986a(C27528a.m100471a().mo98143b());
            }
            String json = new Gson().toJson(aVar);
            C28184h.m103250d("FeedbackSP", "path feedback saveCache:" + json);
            this.f69035c.putString(c, json);
            this.f69035c.apply();
        }
    }
}
