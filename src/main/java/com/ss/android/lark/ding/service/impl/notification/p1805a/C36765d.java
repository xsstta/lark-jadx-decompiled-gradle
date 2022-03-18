package com.ss.android.lark.ding.service.impl.notification.p1805a;

import android.text.TextUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.service.impl.notification.entity.UrgentNotice;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import java.util.Collections;

/* renamed from: com.ss.android.lark.ding.service.impl.notification.a.d */
public class C36765d implements AbstractNotification.AbstractC48495b<UrgentNotice> {

    /* renamed from: a */
    private IDingModuleDependency.AbstractC36625c f94476a = C36618a.m144492a().mo135104i();

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48495b
    /* renamed from: b */
    public int mo31139b(Notice notice) {
        return 0;
    }

    /* renamed from: a */
    public UrgentNotice mo31140c(Notice notice) {
        Message message = this.f94476a.mo135133a(Collections.singletonList(notice.messageId)).get(notice.messageId);
        Chatter chatter = null;
        if (message == null) {
            Log.m165383e("UrgentNotification", "message is null");
            return null;
        }
        Chat chat = this.f94476a.mo135140b(Collections.singletonList(message.getChatId())).get(message.getChatId());
        if (chat == null) {
            Log.m165383e("UrgentNotification", "chat is null");
            return null;
        }
        if (!TextUtils.isEmpty(message.getRecallerId())) {
            chatter = this.f94476a.mo135141c(message.getRecallerId());
        }
        return new UrgentNotice(chat, message, notice, chatter);
    }
}
