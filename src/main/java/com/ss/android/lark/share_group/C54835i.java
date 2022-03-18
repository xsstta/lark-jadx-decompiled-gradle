package com.ss.android.lark.share_group;

import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.api.service.AbstractC32901c;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.share_group.C54807b;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.Collections;

/* renamed from: com.ss.android.lark.share_group.i */
public class C54835i extends BaseModel implements C54807b.AbstractC54808a {

    /* renamed from: a */
    GroupProfileData f135386a;

    /* renamed from: b */
    AbstractC32901c f135387b = C32835d.m126323c();

    @Override // com.ss.android.lark.share_group.C54807b.AbstractC54808a
    /* renamed from: a */
    public GroupProfileData mo187018a() {
        return this.f135386a;
    }

    @Override // com.ss.android.lark.share_group.C54807b.AbstractC54808a
    /* renamed from: a */
    public void mo187019a(final Bundle bundle, IGetDataCallback<GroupProfileData> iGetDataCallback) {
        final UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        C57865c.m224574a(new C57865c.AbstractC57873d<GroupProfileData>() {
            /* class com.ss.android.lark.share_group.C54835i.C548361 */

            /* renamed from: a */
            public GroupProfileData produce() {
                Message message = (Message) bundle.getSerializable("params_message");
                if (message == null || message.getContent() == null || message.getType() != Message.Type.SHARE_GROUP_CHAT) {
                    return null;
                }
                Chat chat = ((ShareGroupChatContent) message.getContent()).getChat();
                Chatter chatter = C54835i.this.f135387b.mo121189a(Collections.singletonList(chat.getOwnerId())).get(chat.getOwnerId());
                if (chatter == null) {
                    return null;
                }
                C54835i.this.f135386a = new GroupProfileData(message, chat, chatter);
                return C54835i.this.f135386a;
            }
        }, new C57865c.AbstractC57871b<GroupProfileData>() {
            /* class com.ss.android.lark.share_group.C54835i.C548372 */

            /* renamed from: a */
            public void consume(GroupProfileData groupProfileData) {
                if (groupProfileData == null) {
                    wrapAndAddGetDataCallback.onError(new ErrorResult("data is not complete!"));
                } else {
                    wrapAndAddGetDataCallback.onSuccess(groupProfileData);
                }
            }
        });
    }

    @Override // com.ss.android.lark.share_group.C54807b.AbstractC54808a
    /* renamed from: b */
    public void mo187020b(final Bundle bundle, IGetDataCallback<GroupProfileData> iGetDataCallback) {
        final UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        C57865c.m224574a(new C57865c.AbstractC57873d<GroupProfileData>() {
            /* class com.ss.android.lark.share_group.C54835i.C548383 */

            /* renamed from: a */
            public GroupProfileData produce() {
                Chat chat;
                Message message = (Message) bundle.getSerializable("params_message");
                if (message == null || TextUtils.isEmpty(message.getChatId())) {
                    return null;
                }
                if (message.getContent() == null || !(message.getContent() instanceof ShareGroupChatContent)) {
                    chat = null;
                } else {
                    chat = ((ShareGroupChatContent) message.getContent()).getChat();
                }
                if (chat == null) {
                    C32821b.m126120a().mo120985a(message.getChatId());
                }
                Chatter chatter = C54835i.this.f135387b.mo121189a(Collections.singletonList(chat.getOwnerId())).get(chat.getOwnerId());
                if (chatter == null) {
                    return null;
                }
                C54835i.this.f135386a = new GroupProfileData(message, chat, chatter);
                return C54835i.this.f135386a;
            }
        }, new C57865c.AbstractC57871b<GroupProfileData>() {
            /* class com.ss.android.lark.share_group.C54835i.C548394 */

            /* renamed from: a */
            public void consume(GroupProfileData groupProfileData) {
                if (groupProfileData == null) {
                    wrapAndAddGetDataCallback.onError(new ErrorResult("data is not complete!"));
                } else {
                    wrapAndAddGetDataCallback.onSuccess(groupProfileData);
                }
            }
        });
    }
}
