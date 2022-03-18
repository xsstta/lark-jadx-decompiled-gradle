package com.ss.android.lark.contact.feat.entity;

import com.bytedance.lark.pb.basic.v1.ContactInfo;
import com.ss.android.lark.contact.feat.entity.ContactOp;

/* renamed from: com.ss.android.lark.contact.feat.entity.a */
public class C35468a {

    /* renamed from: a */
    private C35471d f91698a;

    /* renamed from: b */
    private int f91699b;

    /* renamed from: a */
    public C35471d mo130877a() {
        return this.f91698a;
    }

    /* renamed from: b */
    public int mo130878b() {
        return this.f91699b;
    }

    /* renamed from: a */
    public static C35468a m138741a(ContactInfo contactInfo) {
        if (contactInfo == null) {
            return null;
        }
        C35468a aVar = new C35468a();
        aVar.f91698a = C35471d.m138749a(contactInfo.user_info);
        aVar.f91699b = ContactOp.C35467a.m138740a(contactInfo.op);
        return aVar;
    }
}
