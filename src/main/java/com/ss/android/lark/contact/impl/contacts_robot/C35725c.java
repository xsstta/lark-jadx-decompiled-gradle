package com.ss.android.lark.contact.impl.contacts_robot;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.dto.ChatBotsResponse;
import com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;

/* renamed from: com.ss.android.lark.contact.impl.contacts_robot.c */
public class C35725c extends BaseModel implements AbstractC35717a.AbstractC35718a {

    /* renamed from: a */
    public AbstractC35717a.AbstractC35718a.AbstractC35719a f92368a;

    /* renamed from: b */
    public AbstractC35717a.AbstractC35718a.AbstractC35720b f92369b;

    /* renamed from: c */
    private int f92370c;

    /* renamed from: d */
    private boolean f92371d = true;

    /* renamed from: e */
    private AbstractC35361b.AbstractC35367f f92372e = C35358a.m138143a().mo130165j();

    /* renamed from: c */
    private void m139830c() {
        this.f92372e.mo130197a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<ChatBotsResponse>() {
            /* class com.ss.android.lark.contact.impl.contacts_robot.C35725c.C357272 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (C35725c.this.f92369b != null) {
                    C35725c.this.f92369b.mo131521a();
                }
            }

            /* renamed from: a */
            public void onSuccess(ChatBotsResponse chatBotsResponse) {
                if (C35725c.this.f92369b != null) {
                    if (CollectionUtils.isNotEmpty(chatBotsResponse.chatters)) {
                        C35725c.this.f92369b.mo131522a(chatBotsResponse.chatters);
                        C35725c.this.mo131526a(chatBotsResponse);
                        return;
                    }
                    C35725c.this.f92369b.mo131521a();
                }
            }
        }));
    }

    @Override // com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a.AbstractC35718a
    /* renamed from: a */
    public boolean mo131518a() {
        return this.f92371d;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a.AbstractC35718a
    /* renamed from: b */
    public void mo131519b() {
        if (!this.f92371d) {
            this.f92368a.mo131520a();
        } else {
            this.f92372e.mo130198a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<ChatBotsResponse>() {
                /* class com.ss.android.lark.contact.impl.contacts_robot.C35725c.C357261 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C35725c.this.f92368a.mo131520a();
                }

                /* renamed from: a */
                public void onSuccess(ChatBotsResponse chatBotsResponse) {
                    if (C35725c.this.f92369b == null) {
                        C35725c.this.f92368a.mo131520a();
                        return;
                    }
                    if (CollectionUtils.isNotEmpty(chatBotsResponse.chatters)) {
                        C35725c.this.f92369b.mo131523b(chatBotsResponse.chatters);
                        C35725c.this.mo131526a(chatBotsResponse);
                    }
                    C35725c.this.f92368a.mo131520a();
                }
            }), this.f92370c);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a.AbstractC35718a
    /* renamed from: a */
    public void mo131516a(AbstractC35717a.AbstractC35718a.AbstractC35719a aVar) {
        this.f92368a = aVar;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a.AbstractC35718a
    /* renamed from: a */
    public void mo131517a(AbstractC35717a.AbstractC35718a.AbstractC35720b bVar) {
        this.f92369b = bVar;
        m139830c();
    }

    /* renamed from: a */
    public void mo131526a(ChatBotsResponse chatBotsResponse) {
        this.f92371d = chatBotsResponse.hasMore;
        this.f92370c += chatBotsResponse.chatters.size();
    }
}
