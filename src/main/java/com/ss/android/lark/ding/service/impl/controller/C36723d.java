package com.ss.android.lark.ding.service.impl.controller;

import android.content.Context;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.service.impl.C36758e;
import java.util.List;

/* renamed from: com.ss.android.lark.ding.service.impl.controller.d */
public class C36723d {

    /* renamed from: a */
    private static IDingModuleDependency.AbstractC36625c f94400a = C36618a.m144492a().mo135104i();

    /* renamed from: b */
    private static IDingModuleDependency.AbstractC36625c f94401b = C36618a.m144492a().mo135104i();

    /* renamed from: a */
    public static boolean m144893a(C36758e eVar) {
        if (eVar == null) {
            return false;
        }
        String c = eVar.mo135445c();
        if (eVar.mo135448e() == null) {
            MessageInfo a = f94400a.mo135125a(c);
            if (a == null) {
                return false;
            }
            eVar.mo135443a(a);
        }
        if (eVar.mo135449f() != null) {
            return true;
        }
        Chat b = f94401b.mo135138b(eVar.mo135448e().getMessage().getChatId());
        if (b == null) {
            return false;
        }
        eVar.mo135442a(b);
        return true;
    }

    /* renamed from: a */
    public static void m144892a(Context context, boolean z, IDingModuleDependency.AbstractC36626d.AbstractC36627a aVar) {
        int i;
        IDingModuleDependency.AbstractC36626d p = C36618a.m144492a().mo135111p();
        String string = UIUtils.getString(context, R.string.Lark_NewContacts_CantBuzz);
        if (z) {
            i = R.string.Lark_NewContacts_CantBuzzDueToBlock;
        } else {
            i = R.string.Lark_NewContacts_CantBuzzDueToBlockOthers;
        }
        p.mo135144a(context, string, UIUtils.getString(context, i), UIUtils.getString(context, R.string.Lark_Legacy_IKnow), aVar);
    }

    /* renamed from: a */
    public static void m144891a(Context context, List<Contact> list, IDingModuleDependency.AbstractC36626d.AbstractC36627a aVar, int i, C36516a<?> aVar2) {
        C36618a.m144492a().mo135111p().mo135145a(context, UIUtils.getString(context, R.string.Lark_NewContacts_NeedToAddToContactsDialogTitle), UIUtils.getString(context, R.string.Lark_NewContacts_NeedToAddToContactstBuzzOneDialogContent), UIUtils.getString(context, R.string.Lark_Legacy_Cancel), UIUtils.getString(context, R.string.Lark_Legacy_Add), list, aVar, i, aVar2);
    }
}
