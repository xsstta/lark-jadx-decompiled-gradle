package com.ss.android.lark.notification.reaction;

import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.reaction.entity.ReactionNotice;
import java.util.Collections;

/* renamed from: com.ss.android.lark.notification.reaction.d */
public class C48561d implements AbstractNotification.AbstractC48495b<ReactionNotice> {
    /* renamed from: d */
    private boolean m191444d(Notice notice) {
        if (notice.state == 2 || notice.state == 3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48495b
    /* renamed from: b */
    public int mo31139b(Notice notice) {
        if (notice.shouldNotify || !m191444d(notice)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public ReactionNotice mo31140c(Notice notice) {
        if (notice == null || notice.extra == null) {
            return null;
        }
        Chat chat = C32821b.m126120a().mo121033b(Collections.singletonList(notice.extra.f122004c)).get(notice.extra.f122004c);
        if (chat == null) {
            Log.m165383e("ReactionNotice", "chat is null");
            return null;
        }
        Message message = C32848e.m126401b().mo121083a(Collections.singletonList(notice.messageId)).get(notice.messageId);
        if (message != null) {
            return new ReactionNotice(chat, message, notice);
        }
        Log.m165383e("ReactionNotice", "message is null");
        return null;
    }
}
