package com.ss.android.lark.contact.feat.entity;

import com.bytedance.lark.pb.contact.v2.ContactPointUserInfo;

/* renamed from: com.ss.android.lark.contact.feat.entity.b */
public class C35469b {

    /* renamed from: a */
    public String f91700a;

    /* renamed from: b */
    private C35471d f91701b;

    /* renamed from: c */
    private int f91702c;

    /* renamed from: a */
    public String mo130879a() {
        return this.f91700a;
    }

    /* renamed from: b */
    public C35471d mo130880b() {
        return this.f91701b;
    }

    /* renamed from: a */
    public static C35469b m138744a(ContactPointUserInfo contactPointUserInfo) {
        if (contactPointUserInfo == null) {
            return null;
        }
        C35469b bVar = new C35469b();
        bVar.f91700a = contactPointUserInfo.contact_point;
        bVar.f91701b = C35471d.m138749a(contactPointUserInfo.user_info);
        bVar.f91702c = contactPointUserInfo.contact_status.getValue();
        return bVar;
    }
}
