package com.ss.android.lark.chatsetting.impl.group.info.edit;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.edit.b */
public class C34637b extends BaseModel implements AbstractC34647d.AbstractC34648a {

    /* renamed from: a */
    AbstractC34461c.AbstractC34466e f89411a = ChatSettingModule.m133639a().mo127274d();

    /* renamed from: b */
    AbstractC34461c.AbstractC34466e f89412b = ChatSettingModule.m133639a().mo127274d();

    /* renamed from: c */
    public int f89413c;

    /* renamed from: d */
    public String f89414d;

    /* renamed from: e */
    public Chat f89415e;

    /* renamed from: f */
    private String f89416f;

    /* renamed from: g */
    private AbstractC34647d.AbstractC34648a.AbstractC34649a f89417g;

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.edit.b$a */
    public static class C34639a {

        /* renamed from: a */
        public Chat f89420a;

        /* renamed from: b */
        public int f89421b;

        /* renamed from: c */
        public boolean f89422c;

        /* renamed from: d */
        public String f89423d;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34648a
    /* renamed from: a */
    public Chat mo127939a() {
        return this.f89415e;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34648a
    /* renamed from: b */
    public String mo127943b() {
        return this.f89414d;
    }

    /* renamed from: c */
    public boolean mo127946c() {
        ChatSettingModule.m133639a().mo127277g();
        if (this.f89415e.isOnCall()) {
            return false;
        }
        if (C34501a.m133936b(this.f89415e) || !this.f89415e.isOnlyOwnerEditGroupInfo() || 3 == this.f89413c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo127941a(AbstractC34647d.AbstractC34648a.AbstractC34649a aVar) {
        this.f89417g = aVar;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34648a
    /* renamed from: a */
    public void mo127940a(final IGetDataCallback<C34639a> iGetDataCallback) {
        C34633a.m134588a(this.f89416f, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.C34637b.C346381 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                C34637b.this.f89415e = chat;
                C34639a aVar = new C34639a();
                aVar.f89420a = chat;
                aVar.f89421b = C34637b.this.f89413c;
                aVar.f89423d = C34637b.this.f89414d;
                aVar.f89422c = C34637b.this.mo127946c();
                iGetDataCallback.onSuccess(aVar);
            }
        }));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34648a
    /* renamed from: b */
    public void mo127944b(String str, IGetDataCallback<Chat> iGetDataCallback) {
        this.f89411a.mo127360b(this.f89415e.getId(), str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34648a
    /* renamed from: c */
    public void mo127945c(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f89412b.mo127320a(new Channel(Channel.Type.CHAT, this.f89415e.getId()), str, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34648a
    /* renamed from: a */
    public void mo127942a(String str, IGetDataCallback<Chat> iGetDataCallback) {
        this.f89411a.mo127366c(this.f89415e.getId(), str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    public C34637b(String str, int i, String str2) {
        this.f89416f = str;
        this.f89413c = i;
        this.f89414d = str2;
    }
}
