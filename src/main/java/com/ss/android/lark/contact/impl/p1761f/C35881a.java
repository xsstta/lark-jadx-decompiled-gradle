package com.ss.android.lark.contact.impl.p1761f;

import android.content.Context;
import com.ss.android.lark.contact.impl.contacts_facade.C35576b;
import com.ss.android.lark.contact.p1735d.AbstractC35386a;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;

/* renamed from: com.ss.android.lark.contact.impl.f.a */
public class C35881a implements AbstractC35386a {

    /* renamed from: com.ss.android.lark.contact.impl.f.a$a */
    private static class C35882a {

        /* renamed from: a */
        static C35881a f92815a = new C35881a();
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35386a
    /* renamed from: b */
    public String mo130264b() {
        return "contact";
    }

    /* renamed from: a */
    public static C35881a m140622a() {
        return C35882a.f92815a;
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35386a
    /* renamed from: a */
    public AbstractC44552i mo130263a(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return new C35576b(context, eVar, iTitleController);
    }
}
