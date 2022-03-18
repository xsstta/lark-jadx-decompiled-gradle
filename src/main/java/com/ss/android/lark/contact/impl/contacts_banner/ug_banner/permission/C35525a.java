package com.ss.android.lark.contact.impl.contacts_banner.ug_banner.permission;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.banner.export.entity.p1396a.C29486a;
import com.ss.android.lark.banner.export.entity.p1396a.C29488c;
import com.ss.android.lark.contact.C35358a;

/* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.permission.a */
public class C35525a {
    /* renamed from: a */
    public static C29486a m138941a() {
        return new C29486a("ContactsPermission", 100, m138943b());
    }

    /* renamed from: b */
    private static C29488c m138943b() {
        Context a = C35358a.m138143a().mo130143a();
        C29488c cVar = new C29488c();
        cVar.f73657a = m138942a(a, R.color.lkui_B100);
        cVar.f73658b = R.drawable.contact_icon_contacts_permission;
        cVar.f73659c = a.getString(R.string.Lark_NewContacts_MobileContactsAddPermissions);
        cVar.f73660d = m138942a(a, R.color.lkui_N900);
        cVar.f73661e = a.getString(R.string.Lark_NewContacts_MobileContactsAllowAccess);
        cVar.f73662f = m138942a(a, R.color.lkui_N600);
        cVar.f73663g = a.getString(R.string.Lark_NewContacts_MobileContactsAllowAccessGoToSettings);
        cVar.f73664h = m138942a(a, R.color.lkui_N00);
        cVar.f73665i = m138942a(a, R.color.lkui_B500);
        cVar.f73666j = true;
        cVar.f73667k = m138942a(a, R.color.lkui_N600);
        return cVar;
    }

    /* renamed from: a */
    private static String m138942a(Context context, int i) {
        return "#" + Integer.toHexString(context.getResources().getColor(i));
    }
}
