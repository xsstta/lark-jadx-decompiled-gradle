package com.bytedance.ee.lark.infra.cookie.persistence;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;

/* renamed from: com.bytedance.ee.lark.infra.cookie.persistence.c */
public class C12772c implements AbstractC12770a {

    /* renamed from: a */
    private SharedPreferences f34156a;

    /* renamed from: b */
    private final Context f34157b;

    /* renamed from: c */
    private final IAppContext f34158c;

    @Override // com.bytedance.ee.lark.infra.cookie.persistence.AbstractC12770a
    /* renamed from: a */
    public List<Cookie> mo48275a() {
        return m52804b(this.f34158c);
    }

    /* renamed from: b */
    private boolean m52805b() {
        if (this.f34156a != null) {
            return true;
        }
        String a = m52802a(this.f34158c);
        if ("MiniAppCookiePersistence".equals(a)) {
            AppBrandLogger.m52829e("SharedPrefsCookiePersistor", "spName not right");
            return false;
        }
        AppBrandLogger.m52830i("SharedPrefsCookiePersistor", "sp is right");
        SharedPreferences a2 = C12899a.m53203a(this.f34157b, a);
        this.f34156a = a2;
        if (a2 != null) {
            return true;
        }
        AppBrandLogger.m52829e("checkInit->sharedPreferences is null!", new Object[0]);
        return false;
    }

    public C12772c(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static String m52802a(IAppContext iAppContext) {
        String a = C12771b.m52801a(iAppContext);
        AppBrandLogger.m52830i("SharedPrefsCookiePersistor", "spName:" + a);
        return a;
    }

    /* renamed from: a */
    private static String m52803a(Cookie cookie) {
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

    /* renamed from: b */
    private List<Cookie> m52804b(IAppContext iAppContext) {
        if (!m52805b()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.f34156a.getAll().size());
        for (Map.Entry<String, ?> entry : this.f34156a.getAll().entrySet()) {
            Cookie decode = new SerializableCookie().decode((String) entry.getValue(), iAppContext);
            if (decode != null) {
                arrayList.add(decode);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ee.lark.infra.cookie.persistence.AbstractC12770a
    /* renamed from: a */
    public void mo48278a(Collection<Cookie> collection) {
        if (m52805b()) {
            SharedPreferences.Editor edit = this.f34156a.edit();
            for (Cookie cookie : collection) {
                edit.putString(m52803a(cookie), new SerializableCookie().encode(cookie));
            }
            edit.commit();
        }
    }

    @Override // com.bytedance.ee.lark.infra.cookie.persistence.AbstractC12770a
    /* renamed from: b */
    public void mo48280b(Collection<Cookie> collection) {
        if (m52805b()) {
            SharedPreferences.Editor edit = this.f34156a.edit();
            for (Cookie cookie : collection) {
                edit.remove(m52803a(cookie));
            }
            edit.commit();
        }
    }

    public C12772c(Context context, IAppContext iAppContext) {
        this.f34157b = context;
        this.f34158c = iAppContext;
        m52805b();
    }
}
