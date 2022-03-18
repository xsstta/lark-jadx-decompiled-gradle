package com.ss.android.lark.ai.smartreply.p1343a;

import android.content.Intent;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28619b;
import com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.ai.smartreply.a.d */
public class C28593d extends AbstractC28589a {

    /* renamed from: b */
    private AbstractC28619b f71953b;

    /* renamed from: c */
    private Chat f71954c;

    public C28593d(AbstractC28534a aVar, AbstractC28619b bVar, Chat chat) {
        super(aVar);
        this.f71953b = bVar;
        this.f71954c = chat;
    }

    @Override // com.ss.android.lark.ai.smartreply.p1343a.AbstractC28594e, com.ss.android.lark.ai.smartreply.p1343a.AbstractC28589a
    /* renamed from: a */
    public boolean mo101790a(int i, int i2, Intent intent) {
        if (i != 1045) {
            return false;
        }
        if (i2 == -1 && intent != null) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (CollectionUtils.isEmpty(stringArrayListExtra)) {
                return false;
            }
            this.f71953b.mo101783a(this.f71954c.getId(), stringArrayListExtra);
        }
        return true;
    }

    @Override // com.ss.android.lark.ai.smartreply.p1343a.AbstractC28594e
    /* renamed from: a */
    public void mo101791a(ISmartReplyInterface iSmartReplyInterface, SmartReplyItem smartReplyItem, Message message) {
        if (iSmartReplyInterface.mo101867a() != null) {
            if (iSmartReplyInterface.mo101868b() == null) {
                this.f71946a.mo101554a(iSmartReplyInterface.mo101867a(), null, 1045, 1, "", "");
            } else if (iSmartReplyInterface.mo101868b() instanceof C36516a) {
                this.f71946a.mo101554a(iSmartReplyInterface.mo101867a(), (C36516a) iSmartReplyInterface.mo101868b(), 1045, 1, "", "");
            }
        }
    }
}
