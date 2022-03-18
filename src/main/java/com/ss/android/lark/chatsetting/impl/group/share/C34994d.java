package com.ss.android.lark.chatsetting.impl.group.share;

import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.ChatLinkTokenResponse;
import com.ss.android.lark.chatsetting.impl.group.GroupShareUtil;
import com.ss.android.lark.chatsetting.impl.group.share.C35006i;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.share.d */
public class C34994d extends BaseModel implements C35006i.AbstractC35007a {

    /* renamed from: a */
    public final Map<Integer, ChatLinkTokenResponse> f90322a = new ConcurrentHashMap();

    /* renamed from: b */
    public int f90323b = 0;

    /* renamed from: c */
    private Chat f90324c;

    /* renamed from: d */
    private final AbstractC34461c.AbstractC34466e f90325d = ChatSettingModule.m133639a().mo127274d();

    /* renamed from: e */
    private int f90326e = 0;

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35007a
    /* renamed from: a */
    public Chat mo128969a() {
        return this.f90324c;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35007a
    /* renamed from: d */
    public int mo128975d() {
        return this.f90323b;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35007a
    /* renamed from: e */
    public int mo128976e() {
        return this.f90326e;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35007a
    /* renamed from: c */
    public void mo128974c() {
        int a = ChatSettingService.f88988a.mo127453a(this.f90324c.getId(), "link");
        this.f90326e = a;
        this.f90323b = a;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35007a
    /* renamed from: b */
    public boolean mo128973b() {
        if (this.f90322a.get(Integer.valueOf(this.f90323b)) != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35007a
    /* renamed from: a */
    public boolean mo128971a(int i) {
        if (this.f90323b == i) {
            return false;
        }
        this.f90323b = i;
        return true;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35007a
    /* renamed from: a */
    public void mo128970a(final IGetDataCallback<ChatLinkTokenResponse> iGetDataCallback) {
        ChatLinkTokenResponse chatLinkTokenResponse = this.f90322a.get(Integer.valueOf(this.f90323b));
        if (chatLinkTokenResponse == null || iGetDataCallback == null) {
            m136260c(new IGetDataCallback<ChatLinkTokenResponse>() {
                /* class com.ss.android.lark.chatsetting.impl.group.share.C34994d.C349951 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(ChatLinkTokenResponse chatLinkTokenResponse) {
                    if (iGetDataCallback != null) {
                        C34994d.this.f90322a.put(Integer.valueOf(C34994d.this.f90323b), chatLinkTokenResponse);
                        iGetDataCallback.onSuccess(chatLinkTokenResponse);
                    }
                }
            });
        } else {
            iGetDataCallback.onSuccess(chatLinkTokenResponse);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35007a
    /* renamed from: b */
    public void mo128972b(IGetDataCallback<String> iGetDataCallback) {
        Chat chat = this.f90324c;
        if (chat != null && chat.isEdu()) {
            this.f90325d.mo127357b(this.f90324c.getId(), iGetDataCallback);
        }
    }

    public C34994d(Bundle bundle) {
        if (bundle != null) {
            this.f90324c = (Chat) bundle.getSerializable("extra_key_chat");
        }
    }

    /* renamed from: c */
    private void m136260c(IGetDataCallback<ChatLinkTokenResponse> iGetDataCallback) {
        boolean z;
        IGetDataCallback<ChatLinkTokenResponse> iGetDataCallback2 = (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback);
        if (GroupShareUtil.m134454a()) {
            AbstractC34461c.AbstractC34466e eVar = this.f90325d;
            String id = this.f90324c.getId();
            int a = GroupShareUtil.m134452a(this.f90323b);
            if (this.f90323b == 2) {
                z = true;
            } else {
                z = false;
            }
            eVar.mo127356b(id, a, z, iGetDataCallback2);
            return;
        }
        this.f90325d.mo127355b(this.f90324c.getId(), 7, iGetDataCallback2);
    }
}
