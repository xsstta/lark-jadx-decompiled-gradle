package com.larksuite.framework.http.p1190e;

import android.content.Context;
import android.content.SharedPreferences;
import com.franmontiel.persistentcookiejar.persistence.CookiePersistor;
import com.franmontiel.persistentcookiejar.persistence.SerializableCookie;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;

/* renamed from: com.larksuite.framework.http.e.b */
public class C26002b implements CookiePersistor {

    /* renamed from: a */
    private final SharedPreferences f64363a;

    /* renamed from: b */
    private Context f64364b;

    @Override // com.franmontiel.persistentcookiejar.persistence.CookiePersistor
    /* renamed from: b */
    public void mo72368b() {
        Log.m165388i("clear!!!!-cookies in process " + C26252ad.m94992a(this.f64364b));
        this.f64363a.edit().clear().commit();
        Log.m165388i("clear!!!!-clear");
    }

    @Override // com.franmontiel.persistentcookiejar.persistence.CookiePersistor
    /* renamed from: a */
    public List<Cookie> mo72366a() {
        Log.m165388i("loadAll!!!!-cookies in process " + C26252ad.m94992a(this.f64364b));
        ArrayList arrayList = new ArrayList();
        m94115a(this.f64363a, arrayList);
        if (arrayList.isEmpty()) {
            m94115a(this.f64364b.getSharedPreferences("CookiePersistence", 0), arrayList);
        }
        Log.m165388i("loadAll!!!!-cookies");
        return arrayList;
    }

    public C26002b(Context context) {
        this(context, context.getSharedPreferences("CookiePersistence_" + C26252ad.m94992a(context), 0));
    }

    /* renamed from: a */
    private static String m94114a(Cookie cookie) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (cookie.secure()) {
            str = "https";
        } else {
            str = "http";
        }
        sb.append(str);
        sb.append("://");
        sb.append(cookie.domain());
        sb.append(cookie.path());
        sb.append("|");
        sb.append(cookie.name());
        return sb.toString();
    }

    @Override // com.franmontiel.persistentcookiejar.persistence.CookiePersistor
    /* renamed from: b */
    public void mo72369b(Collection<Cookie> collection) {
        Log.m165388i("remove specified cookies in process " + C26252ad.m94992a(this.f64364b));
        if (CollectionUtils.isEmpty(collection)) {
            Log.m165388i("no cookies in process");
            return;
        }
        SharedPreferences.Editor edit = this.f64363a.edit();
        for (Cookie cookie : collection) {
            edit.remove(m94114a(cookie));
        }
        edit.commit();
    }

    @Override // com.franmontiel.persistentcookiejar.persistence.CookiePersistor
    /* renamed from: a */
    public void mo72367a(Collection<Cookie> collection) {
        Log.m165388i("saveAll!!!!-cookies in process " + C26252ad.m94992a(this.f64364b));
        if (CollectionUtils.isEmpty(collection)) {
            Log.m165388i("saveAll!!!!-cookies empty return");
            return;
        }
        Log.m165388i("saveAll!!!!-cookies");
        SharedPreferences.Editor edit = this.f64363a.edit();
        for (Cookie cookie : collection) {
            edit.putString(m94114a(cookie), new SerializableCookie().encode(cookie));
        }
        edit.commit();
    }

    public C26002b(Context context, SharedPreferences sharedPreferences) {
        this.f64364b = context;
        this.f64363a = sharedPreferences;
    }

    /* renamed from: a */
    public static void m94115a(SharedPreferences sharedPreferences, List<Cookie> list) {
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            Object value = entry.getValue();
            if (!(value instanceof String)) {
                String str = null;
                if (value != null) {
                    str = "  valueType: " + value.getClass();
                }
                Log.m165382e("other type in CookiePersistenceSP, key:" + entry.getKey() + str);
            } else {
                Cookie decode = new SerializableCookie().decode((String) value);
                if (decode != null) {
                    list.add(decode);
                }
            }
        }
    }
}
