package com.ss.android.lark.mail.impl.p2168g;

import android.text.TextUtils;
import androidx.collection.C0517d;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.g.a */
public class C42107a {

    /* renamed from: a */
    private Map<String, Object> f107142a;

    /* renamed from: b */
    private Map<String, Object> f107143b;

    /* renamed from: c */
    private C0517d<String, MailAddress> f107144c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.g.a$a */
    public static class C42109a {

        /* renamed from: a */
        public static final C42107a f107145a = new C42107a();
    }

    private C42107a() {
    }

    /* renamed from: a */
    public static C42107a m168074a() {
        return C42109a.f107145a;
    }

    /* renamed from: a */
    public <T> void mo152031a(String str) {
        this.f107142a.remove(str);
    }

    /* renamed from: b */
    public <T> T mo152034b(String str) {
        Map<String, Object> map = this.f107142a;
        if (map == null) {
            return null;
        }
        return (T) map.get(str);
    }

    /* renamed from: c */
    public <T> T mo152036c(String str) {
        Map<String, Object> map = this.f107143b;
        if (map == null) {
            return null;
        }
        return (T) map.get(str);
    }

    /* renamed from: d */
    public <T> T mo152037d(String str) {
        Map<String, Object> map = this.f107143b;
        if (map == null) {
            return null;
        }
        return (T) map.remove(str);
    }

    /* renamed from: e */
    public MailAddress mo152038e(String str) {
        if (this.f107144c == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f107144c.mo2974a(str);
    }

    /* renamed from: a */
    public <T> void mo152033a(String str, T t) {
        if (this.f107142a == null) {
            this.f107142a = new HashMap();
        }
        this.f107142a.put(str, t);
    }

    /* renamed from: b */
    public <T> void mo152035b(String str, T t) {
        if (this.f107143b == null) {
            this.f107143b = new HashMap();
        }
        this.f107143b.put(str, t);
    }

    /* renamed from: a */
    public void mo152032a(String str, MailAddress mailAddress) {
        if (!TextUtils.isEmpty(str) && mailAddress != null && mailAddress.mo151186h()) {
            if (this.f107144c == null) {
                this.f107144c = new C0517d<>(LocationRequest.PRIORITY_HD_ACCURACY);
            }
            MailAddress a = this.f107144c.mo2974a(str);
            if (a == null) {
                this.f107144c.mo2975a(str, mailAddress);
            } else if (TextUtils.isEmpty(a.mo151192m()) && !TextUtils.isEmpty(mailAddress.mo151192m())) {
                a.mo151178b(mailAddress.mo151192m());
            }
        }
    }
}
