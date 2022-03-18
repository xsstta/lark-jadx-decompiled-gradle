package com.ss.android.lark.ai.smartreply.p1343a;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.BaseTextContent;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.ai.smartreply.a.c */
public class C28591c extends AbstractC28589a {

    /* renamed from: b */
    private Chat f71947b;

    public C28591c(AbstractC28534a aVar, Chat chat) {
        super(aVar);
        this.f71947b = chat;
    }

    @Override // com.ss.android.lark.ai.smartreply.p1343a.AbstractC28594e
    /* renamed from: a */
    public void mo101791a(final ISmartReplyInterface iSmartReplyInterface, final SmartReplyItem smartReplyItem, final Message message) {
        RichText richText;
        boolean z;
        if (!(smartReplyItem.mo101847h() == null || iSmartReplyInterface.mo101867a() == null || message == null || !(message.getContent() instanceof BaseTextContent) || (richText = ((BaseTextContent) message.getContent()).getRichText()) == null)) {
            if (message.isAtAll() || richText.getAtIds() == null || richText.getAtIds().size() == 0) {
                z = true;
            } else {
                z = false;
            }
            final ArrayList arrayList = new ArrayList();
            arrayList.add(this.f71946a.mo101564e());
            if (!arrayList.contains(message.getFromId())) {
                arrayList.add(message.getFromId());
            }
            if (!z) {
                for (String str : richText.getAtIds()) {
                    RichTextElement richTextElement = richText.getElements().getDictionary().get(str);
                    if (!(richTextElement == null || richTextElement.getProperty() == null)) {
                        RichTextElement.AtProperty atProperty = (RichTextElement.AtProperty) richTextElement.getProperty();
                        if (!atProperty.isOutChatUser() && !arrayList.contains(atProperty.getUserId())) {
                            arrayList.add(atProperty.getUserId());
                        }
                    }
                }
                mo101792a(iSmartReplyInterface, smartReplyItem.mo101847h(), arrayList, message);
                return;
            }
            this.f71946a.mo101561c().mo101573a(this.f71947b.getId(), null, true, new IGetDataCallback<List<ChatChatter>>() {
                /* class com.ss.android.lark.ai.smartreply.p1343a.C28591c.C285921 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(List<ChatChatter> list) {
                    for (ChatChatter chatChatter : list) {
                        if (!chatChatter.isBot()) {
                            if (!arrayList.contains(chatChatter.getChatter().getId())) {
                                arrayList.add(chatChatter.getChatter().getId());
                            }
                            if (arrayList.size() >= 100) {
                                break;
                            }
                        }
                    }
                    C28591c.this.mo101792a(iSmartReplyInterface, smartReplyItem.mo101847h(), arrayList, message);
                }
            }, 0);
        }
    }

    /* renamed from: a */
    public void mo101792a(ISmartReplyInterface iSmartReplyInterface, SmartReplyItem.C28614b bVar, List<String> list, Message message) {
        long j;
        long j2;
        long j3;
        if (iSmartReplyInterface.mo101867a() != null) {
            if (bVar.f72009a == null) {
                j = 0;
            } else {
                j = bVar.f72009a.longValue();
            }
            if (bVar.f72010b == null) {
                j2 = 0;
            } else {
                j2 = bVar.f72010b.longValue();
            }
            if (j == 0 && j2 == 0) {
                long currentTimeMillis = ((System.currentTimeMillis() / 100000) + 1) * 100;
                while (currentTimeMillis % 1800 != 0) {
                    currentTimeMillis += 100;
                }
                j3 = currentTimeMillis;
            } else {
                j3 = j;
            }
            this.f71946a.mo101555a(iSmartReplyInterface.mo101867a(), this.f71947b.getId(), this.f71947b.isMeeting(), j3, j2, null, new ArrayList<>(list), message.isAtAll());
        }
    }
}
