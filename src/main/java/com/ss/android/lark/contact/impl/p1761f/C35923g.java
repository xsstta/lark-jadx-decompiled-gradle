package com.ss.android.lark.contact.impl.p1761f;

import com.ss.android.lark.biz.core.api.AbstractC29563j;
import com.ss.android.lark.biz.core.api.AbstractC29565l;
import com.ss.android.lark.biz.core.api.AbstractC29570n;
import com.ss.android.lark.biz.core.api.AbstractC29583s;
import com.ss.android.lark.biz.core.api.IContactsGroupController;
import com.ss.android.lark.contact.impl.controller.ContactsGroupController;
import com.ss.android.lark.contact.impl.p1746a.C35493a;
import com.ss.android.lark.contact.impl.p1746a.C35494c;
import com.ss.android.lark.contact.impl.p1746a.C35495d;
import com.ss.android.lark.contact.impl.p1746a.C35496e;
import com.ss.android.lark.contact.p1735d.AbstractC35390e;

/* renamed from: com.ss.android.lark.contact.impl.f.g */
public class C35923g implements AbstractC35390e {

    /* renamed from: com.ss.android.lark.contact.impl.f.g$a */
    private static class C35924a {

        /* renamed from: a */
        static C35923g f92888a = new C35923g();
    }

    /* renamed from: a */
    public static C35923g m140762a() {
        return C35924a.f92888a;
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35390e
    /* renamed from: b */
    public AbstractC29563j mo130289b() {
        return new C35493a();
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35390e
    /* renamed from: c */
    public AbstractC29583s mo130290c() {
        return new C35496e();
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35390e
    /* renamed from: d */
    public AbstractC29565l mo130291d() {
        return new C35494c();
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35390e
    /* renamed from: e */
    public AbstractC29570n mo130292e() {
        return new C35495d();
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35390e
    /* renamed from: f */
    public IContactsGroupController mo130293f() {
        return new ContactsGroupController();
    }
}
