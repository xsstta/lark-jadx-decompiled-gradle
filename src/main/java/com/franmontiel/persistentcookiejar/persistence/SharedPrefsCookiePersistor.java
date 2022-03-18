package com.franmontiel.persistentcookiejar.persistence;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;

public class SharedPrefsCookiePersistor implements CookiePersistor {

    /* renamed from: a */
    private final SharedPreferences f51820a;

    @Override // com.franmontiel.persistentcookiejar.persistence.CookiePersistor
    /* renamed from: b */
    public void mo72368b() {
        this.f51820a.edit().clear().commit();
    }

    @Override // com.franmontiel.persistentcookiejar.persistence.CookiePersistor
    /* renamed from: a */
    public List<Cookie> mo72366a() {
        ArrayList arrayList = new ArrayList(this.f51820a.getAll().size());
        for (Map.Entry<String, ?> entry : this.f51820a.getAll().entrySet()) {
            Cookie decode = new SerializableCookie().decode((String) entry.getValue());
            if (decode != null) {
                arrayList.add(decode);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static String m77114a(Cookie cookie) {
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
        SharedPreferences.Editor edit = this.f51820a.edit();
        for (Cookie cookie : collection) {
            edit.remove(m77114a(cookie));
        }
        edit.commit();
    }

    @Override // com.franmontiel.persistentcookiejar.persistence.CookiePersistor
    /* renamed from: a */
    public void mo72367a(Collection<Cookie> collection) {
        SharedPreferences.Editor edit = this.f51820a.edit();
        for (Cookie cookie : collection) {
            edit.putString(m77114a(cookie), new SerializableCookie().encode(cookie));
        }
        edit.commit();
    }
}
