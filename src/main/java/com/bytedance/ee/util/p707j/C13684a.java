package com.bytedance.ee.util.p707j;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* renamed from: com.bytedance.ee.util.j.a */
public class C13684a implements CookieJar {

    /* renamed from: a */
    private AbstractC13685a f35886a;

    /* renamed from: com.bytedance.ee.util.j.a$a */
    public interface AbstractC13685a {
        /* renamed from: a */
        String mo16557a();

        /* renamed from: b */
        Locale mo16558b();
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
    }

    /* renamed from: b */
    private Locale m55569b() {
        Locale locale = Locale.ENGLISH;
        AbstractC13685a aVar = this.f35886a;
        if (aVar != null) {
            locale = aVar.mo16558b();
        }
        if (locale == null) {
            return Locale.ENGLISH;
        }
        return locale;
    }

    /* renamed from: a */
    private String m55568a() {
        String str;
        AbstractC13685a aVar = this.f35886a;
        if (aVar != null) {
            str = aVar.mo16557a();
        } else {
            str = "";
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public C13684a(AbstractC13685a aVar) {
        this.f35886a = aVar;
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        ArrayList arrayList = new ArrayList();
        String a = m55568a();
        Locale b = m55569b();
        arrayList.add(new Cookie.Builder().hostOnlyDomain(httpUrl.host()).name("bear-session").value(a).build());
        arrayList.add(new Cookie.Builder().hostOnlyDomain(httpUrl.host()).name("session").value(a).build());
        arrayList.add(new Cookie.Builder().hostOnlyDomain(httpUrl.host()).name("lang").value(b.getLanguage()).build());
        Cookie.Builder name = new Cookie.Builder().hostOnlyDomain(httpUrl.host()).name("locale");
        arrayList.add(name.value(b.getLanguage() + "_" + b.getCountry().toUpperCase()).build());
        return arrayList;
    }
}
