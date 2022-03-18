package com.ss.android.lark.ding.service.impl.notification.p1806b;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.service.impl.notification.entity.UrgentNotice;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import java.util.Collections;

/* renamed from: com.ss.android.lark.ding.service.impl.notification.b.d */
public class C36772d implements AbstractNotification.AbstractC48495b<UrgentNotice> {

    /* renamed from: a */
    private IDingModuleDependency.AbstractC36625c f94486a = C36618a.m144492a().mo135104i();

    /* renamed from: d */
    private boolean m145068d(Notice notice) {
        if (notice.state == 2 || notice.state == 3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48495b
    /* renamed from: b */
    public int mo31139b(Notice notice) {
        if (notice.shouldNotify || !m145068d(notice)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public UrgentNotice mo31140c(Notice notice) {
        Message message = this.f94486a.mo135133a(Collections.singletonList(notice.messageId)).get(notice.messageId);
        if (message == null) {
            Log.m165383e("UrgentAckNotification", "message is null");
            return null;
        }
        Chat chat = this.f94486a.mo135140b(Collections.singletonList(message.getChatId())).get(message.getChatId());
        if (chat != null) {
            return new UrgentNotice(notice, chat, message);
        }
        Log.m165383e("UrgentAckNotification", "chat is null");
        return null;
    }
}
