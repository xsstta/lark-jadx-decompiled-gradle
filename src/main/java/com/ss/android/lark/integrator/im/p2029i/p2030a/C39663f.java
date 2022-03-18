package com.ss.android.lark.integrator.im.p2029i.p2030a;

import android.content.Context;
import android.widget.ImageView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.C29407b;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.api.AbstractC32808a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.p2021a.C39425a;
import com.ss.android.lark.utils.C57782ag;

/* renamed from: com.ss.android.lark.integrator.im.i.a.f */
public class C39663f implements AbstractC38037a.AbstractC38047g {

    /* renamed from: a */
    C29407b f101174a = AbstractC39484a.m156004a();

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38047g
    /* renamed from: a */
    public AbstractC32808a mo139234a() {
        return this.f101174a.mo104179C();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38047g
    /* renamed from: a */
    public Chat mo139235a(String str) {
        return this.f101174a.mo104251d().mo120985a(str);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38047g
    /* renamed from: a */
    public void mo139238a(ImageView imageView, String str) {
        this.f101174a.mo104260k().mo121407a(imageView, str);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38047g
    /* renamed from: a */
    public void mo139239a(String str, IGetDataCallback<Chat> iGetDataCallback) {
        Chat g = this.f101174a.mo104251d().mo121064g(str);
        if (g == null) {
            this.f101174a.mo104251d().mo121031a(false, str, (ChatBundle.C29592c) null, iGetDataCallback);
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(g);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38047g
    /* renamed from: a */
    public void mo139240a(String str, String str2) {
        this.f101174a.mo104194a(str).mo121421c(str2);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38047g
    /* renamed from: a */
    public void mo139241a(String str, boolean z, IGetDataCallback<ChatSetting> iGetDataCallback) {
        this.f101174a.mo104251d().mo121024a(str, z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38047g
    /* renamed from: a */
    public void mo139237a(Context context, String str, boolean z, int i) {
        this.f101174a.mo104207a(context, new C29604ae.C29606a().mo106670b(str).mo106679h(z).mo106669b(i).mo106674d("feed").mo106668a());
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38047g
    /* renamed from: a */
    public void mo139236a(Context context, String str, Chat.ChatMode chatMode, boolean z, String str2, String str3, IGetDataCallback<Chat> iGetDataCallback) {
        this.f101174a.mo104206a(context, ChatBundle.m109259a().mo105927a(str).mo105926a(chatMode).mo105936d(z).mo105923a(ChatBundle.SourceType.fromValue(str2)).mo105933c(str3).mo105941h(C57782ag.m224242a(str3, "conversation_box")).mo105929a());
        C39425a.m155694a().mo108067a(true);
    }
}
