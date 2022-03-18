package com.ss.android.lark.chatsetting.impl.group.share;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.ChatLinkInfoResponse;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57885u;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.share.a */
public class C34988a extends AbstractC29186b {

    /* renamed from: a */
    public AbstractC34461c.AbstractC34466e f90310a = ChatSettingModule.m133639a().mo127274d();

    /* renamed from: b */
    public AbstractC34461c.AbstractC34480s f90311b = ChatSettingModule.m133639a().mo127280j();

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.applink.AbstractC29186b
    /* renamed from: b */
    public boolean mo103462b(Context context, AppLink appLink) {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(final Context context, AppLink appLink) {
        if (context == null) {
            return false;
        }
        String a = appLink.mo103435a();
        String queryParameter = Uri.parse(a).getQueryParameter("link_token");
        if (TextUtils.isEmpty(queryParameter)) {
            return true;
        }
        C57885u.m224659a();
        Log.m165389i("GroupAppLinkHandler", "GroupAppLinkHandler handle:" + a + "  " + queryParameter);
        this.f90310a.mo127326a(queryParameter, new IGetDataCallback<ChatLinkInfoResponse>() {
            /* class com.ss.android.lark.chatsetting.impl.group.share.C34988a.C349891 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                LKUIToast.show(context, errorResult.getDisplayMsg());
            }

            /* renamed from: a */
            public void onSuccess(ChatLinkInfoResponse chatLinkInfoResponse) {
                Chat chat = chatLinkInfoResponse.getChat();
                C57885u.m224660b();
                if (chatLinkInfoResponse.isInChat()) {
                    C34988a.this.f90310a.mo127318a(context, chatLinkInfoResponse.getChatId());
                } else if (chat.isEdu()) {
                    C34988a.this.f90311b.mo127425a(context, chat.getId(), chatLinkInfoResponse.getToken(), chat.getTenantId(), chatLinkInfoResponse.getInviterId(), true);
                } else {
                    C34988a.this.f90311b.mo127426a(context, chatLinkInfoResponse.getChatId(), chatLinkInfoResponse.getToken(), "", true, true, "", false, chat.isCrossTenant(), chat.getTenantId(), "");
                }
            }
        });
        return true;
    }
}
