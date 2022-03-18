package com.ss.android.lark.message.card.view;

import com.ss.android.lark.chat.entity.message.CardAction;
import com.ss.android.lark.chat.entity.message.content.CardContent;

/* renamed from: com.ss.android.lark.message.card.view.g */
public class C45338g {

    /* renamed from: a */
    private boolean f114785a;

    /* renamed from: b */
    private CardContent f114786b;

    public C45338g() {
    }

    /* renamed from: a */
    public boolean mo160117a() {
        return this.f114785a;
    }

    /* renamed from: a */
    public boolean mo160118a(String str) {
        CardAction cardAction;
        CardContent cardContent = this.f114786b;
        if (cardContent == null || cardContent.getActions() == null || (cardAction = this.f114786b.getActions().get(str)) == null || CardAction.Method.OPEN_URL != cardAction.getMethod()) {
            return false;
        }
        return true;
    }

    public C45338g(boolean z, CardContent cardContent) {
        this.f114785a = z;
        this.f114786b = cardContent;
    }
}
