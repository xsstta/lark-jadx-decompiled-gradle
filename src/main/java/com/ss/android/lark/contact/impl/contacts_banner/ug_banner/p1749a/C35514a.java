package com.ss.android.lark.contact.impl.contacts_banner.ug_banner.p1749a;

import android.view.View;
import com.ss.android.lark.banner.export.AbstractC29483d;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.util.share_preference.UserSP;

/* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.a.a */
public class C35514a implements AbstractC29483d {
    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16930a(View view, String str) {
        return false;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16928a() {
        return m138908b();
    }

    /* renamed from: b */
    public static boolean m138908b() {
        if (C35358a.m138143a().mo130163h().mo130234f() || C35358a.m138143a().mo130163h().mo130233e() || !C35358a.m138143a().mo130163h().mo130235g()) {
            return false;
        }
        if (!UserSP.getInstance().getBoolean("key_contact_banner_update_team")) {
            return true;
        }
        C35358a.m138143a().mo130172q().mo130191a("ContactsUpgradetoTeam");
        return false;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16929a(View view) {
        UserSP.getInstance().putBoolean("key_contact_banner_update_team", true);
        return false;
    }
}
