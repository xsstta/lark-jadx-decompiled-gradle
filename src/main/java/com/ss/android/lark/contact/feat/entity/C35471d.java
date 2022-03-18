package com.ss.android.lark.contact.feat.entity;

import com.bytedance.lark.pb.basic.v1.UserInfo;

/* renamed from: com.ss.android.lark.contact.feat.entity.d */
public class C35471d {

    /* renamed from: a */
    public String f91705a;

    /* renamed from: b */
    public String f91706b;

    /* renamed from: c */
    public String f91707c;

    /* renamed from: d */
    public String f91708d;

    /* renamed from: e */
    public int f91709e;

    /* renamed from: f */
    public String f91710f;

    /* renamed from: g */
    public String f91711g;

    /* renamed from: h */
    public String f91712h;

    /* renamed from: i */
    public String f91713i;

    /* renamed from: j */
    public long f91714j;

    /* renamed from: a */
    public String mo130882a() {
        return this.f91705a;
    }

    /* renamed from: b */
    public String mo130883b() {
        return this.f91706b;
    }

    /* renamed from: c */
    public String mo130884c() {
        return this.f91707c;
    }

    /* renamed from: d */
    public String mo130885d() {
        return this.f91708d;
    }

    /* renamed from: e */
    public String mo130886e() {
        return this.f91710f;
    }

    /* renamed from: f */
    public String mo130887f() {
        return this.f91711g;
    }

    /* renamed from: g */
    public String mo130888g() {
        return this.f91712h;
    }

    /* renamed from: h */
    public String mo130889h() {
        return this.f91713i;
    }

    /* renamed from: i */
    public long mo130890i() {
        return this.f91714j;
    }

    /* renamed from: a */
    public static C35471d m138749a(UserInfo userInfo) {
        if (userInfo == null) {
            return null;
        }
        C35471d dVar = new C35471d();
        dVar.f91705a = userInfo.avatar_key;
        dVar.f91706b = userInfo.user_name;
        dVar.f91707c = userInfo.name_py;
        dVar.f91708d = userInfo.tenant_name;
        dVar.f91709e = userInfo.last_seven_day_online_minutes.intValue();
        dVar.f91710f = userInfo.user_id;
        dVar.f91711g = userInfo.tenant_id;
        dVar.f91712h = userInfo.alias;
        dVar.f91713i = userInfo.description;
        dVar.f91714j = userInfo.agree_time.longValue();
        return dVar;
    }
}
