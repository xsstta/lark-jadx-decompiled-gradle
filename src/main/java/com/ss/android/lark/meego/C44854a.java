package com.ss.android.lark.meego;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;

/* renamed from: com.ss.android.lark.meego.a */
public final class C44854a {
    /* renamed from: a */
    public static boolean m177782a() {
        return C29990c.m110930b().mo134586n().mo134685a("lark.meego.create_work_item");
    }

    /* renamed from: b */
    public static boolean m177785b() {
        return C29990c.m110930b().mo134586n().mo134685a("lark.meego.multiselect.entrance");
    }

    /* renamed from: a */
    public static boolean m177783a(Chat chat) {
        if (chat == null || chat.isSecret()) {
            return false;
        }
        if ((chat.isP2PChat() || chat.isGroup()) && m177782a() && m177785b() && C29990c.m110930b().ao().mo134625a()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m177786b(Chat chat) {
        if (chat == null || chat.isSecret()) {
            return false;
        }
        if ((chat.isP2PChat() || chat.isGroup()) && m177782a() && C29990c.m110930b().ao().mo134625a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m177784a(Message.Type type, AbstractC33342d dVar) {
        if (dVar == null || dVar.mo122546j()) {
            return false;
        }
        if ((!dVar.mo122545i() && !dVar.mo122540d()) || !m177782a() || !C29990c.m110930b().ao().mo134625a()) {
            return false;
        }
        if (type == Message.Type.TEXT || type == Message.Type.IMAGE || type == Message.Type.MEDIA || type == Message.Type.AUDIO || type == Message.Type.FILE || type == Message.Type.POST) {
            return true;
        }
        return false;
    }
}
