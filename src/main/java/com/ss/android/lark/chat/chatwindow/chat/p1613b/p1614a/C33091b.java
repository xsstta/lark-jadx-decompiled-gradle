package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1614a;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.p1690c.C34438a;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.a.b */
public class C33091b implements AbstractC32928b<ChatMessageVO<?>> {

    /* renamed from: a */
    private boolean f85231a;

    /* renamed from: b */
    private boolean f85232b;

    /* renamed from: c */
    private boolean f85233c;

    /* renamed from: d */
    private boolean f85234d;

    /* renamed from: e */
    private String f85235e;

    /* renamed from: f */
    private Chat f85236f;

    /* renamed from: a */
    public boolean accept(C34029b bVar, ChatMessageVO<?> cVar) {
        if (!m127982a(bVar, cVar, this.f85232b) || !m127984a(bVar, cVar, this.f85236f.isP2PChat(), this.f85231a) || !m127983a(bVar, cVar, this.f85234d, this.f85235e, this.f85236f) || !m127985b(bVar, cVar, this.f85236f.isP2PChat(), this.f85233c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m127982a(C34029b bVar, ChatMessageVO<?> cVar, boolean z) {
        if (cVar.mo121695c() || z || bVar.f87966a != 15) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m127985b(C34029b bVar, ChatMessageVO<?> cVar, boolean z, boolean z2) {
        int i;
        if (!(!z || !z2 || (i = bVar.f87966a) == 1 || i == 6 || i == 8 || i == 3 || i == 4 || i == 23 || i == 24)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m127984a(C34029b bVar, ChatMessageVO<?> cVar, boolean z, boolean z2) {
        if (!z || !z2) {
            return true;
        }
        int i = bVar.f87966a;
        if (i != 7) {
            if (i != 9) {
                if (!(i == 15 || i == 21)) {
                    switch (i) {
                        case 11:
                        case 13:
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            break;
                        default:
                            return true;
                    }
                }
            }
            if (cVar.mo121710r() != Message.Type.AUDIO) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m127983a(C34029b bVar, ChatMessageVO<?> cVar, boolean z, String str, Chat chat) {
        if (C34438a.m133581a(cVar.mo121695c(), chat, z, str) || bVar.f87966a != 5) {
            return true;
        }
        return false;
    }

    public C33091b(boolean z, boolean z2, boolean z3, boolean z4, String str, Chat chat) {
        this.f85231a = z;
        this.f85232b = z2;
        this.f85233c = z4;
        this.f85234d = z3;
        this.f85235e = str;
        this.f85236f = chat;
    }
}
