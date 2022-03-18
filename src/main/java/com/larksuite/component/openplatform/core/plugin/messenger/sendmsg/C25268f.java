package com.larksuite.component.openplatform.core.plugin.messenger.sendmsg;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.utils.C12792j;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.ApiSendMsgCardPlugin;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.littleapp.entity.ChatModel;
import com.ss.android.lark.optrace.api.ILogger;
import com.ss.android.lark.utils.C57782ag;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.AbstractC67712c;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.f */
public class C25268f {
    /* renamed from: a */
    public void mo88379a(String str, String str2, String str3, ILogger aVar, AbstractC25897h<ApiSendMsgCardPlugin.ApiSendMsgCardResponse> hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, boolean z, AbstractC67709b.AbstractC67710a aVar2) {
        m90732b(str, str2, str3, aVar, hVar, apiSendMsgCardResponse, iAppContext, z, aVar2);
    }

    /* renamed from: a */
    private void m90725a(ChatModel chatModel, String str, CardContent cardContent, ILogger aVar, AbstractC25897h<ApiSendMsgCardPlugin.ApiSendMsgCardResponse> hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, boolean z, AbstractC67709b.AbstractC67710a aVar2) {
        aVar.mo92224i("GADGET_SENG_MSG", "getChatAvatarUrls.");
        aVar2.mo235014a().mo235067a(Arrays.asList(chatModel.mo148774a()), new AbstractC67712c.AbstractC67713a(aVar, hVar, apiSendMsgCardResponse, iAppContext, chatModel, cardContent, str, z, aVar2) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.$$Lambda$f$aUjUzustIp5R0e3ULLKnUDt9CQ */
            public final /* synthetic */ ILogger f$1;
            public final /* synthetic */ AbstractC25897h f$2;
            public final /* synthetic */ ApiSendMsgCardPlugin.ApiSendMsgCardResponse f$3;
            public final /* synthetic */ IAppContext f$4;
            public final /* synthetic */ ChatModel f$5;
            public final /* synthetic */ CardContent f$6;
            public final /* synthetic */ String f$7;
            public final /* synthetic */ boolean f$8;
            public final /* synthetic */ AbstractC67709b.AbstractC67710a f$9;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
                this.f$9 = r10;
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c.AbstractC67713a
            public final void onResult(List list, List list2) {
                C25268f.this.m90726a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, list, list2);
            }
        });
    }

    /* renamed from: b */
    private void m90732b(String str, String str2, String str3, ILogger aVar, AbstractC25897h<ApiSendMsgCardPlugin.ApiSendMsgCardResponse> hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, boolean z, AbstractC67709b.AbstractC67710a aVar2) {
        aVar.mo92224i("GADGET_SENG_MSG", "getChatModel. tc:" + str);
        ChatModel a = aVar2.mo235014a().mo235063a(str);
        if (C57782ag.m224242a(a.mo148776c(), "messageAction")) {
            aVar.mo92223e("GADGET_SENG_MSG", "chat name is empty");
            apiSendMsgCardResponse.mErrorCode = ApiSendMsgCardError.TRIGGER_CODE_INVALID.getCode();
            apiSendMsgCardResponse.mErrorMessage = ApiSendMsgCardError.TRIGGER_CODE_INVALID.getMsg();
            hVar.callback(apiSendMsgCardResponse);
        } else if (TextUtils.isEmpty(a.mo148774a())) {
            aVar.mo92223e("GADGET_SENG_MSG", "chat id is empty");
            apiSendMsgCardResponse.mErrorCode = ApiSendMsgCardError.TRIGGER_CODE_INVALID.getCode();
            apiSendMsgCardResponse.mErrorMessage = ApiSendMsgCardError.TRIGGER_CODE_INVALID.getMsg();
            hVar.callback(apiSendMsgCardResponse);
        } else {
            m90730a(str2, str3, a, aVar, hVar, apiSendMsgCardResponse, iAppContext, z, aVar2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m90728a(ILogger aVar, ChatModel chatModel, AbstractC25897h hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, boolean z, AbstractC67709b.AbstractC67710a aVar2, String str, CardContent cardContent) {
        aVar.mo92224i("GADGET_SENG_MSG", "back to miniprocess onResult" + str);
        if (TextUtils.isEmpty(str) || cardContent == null) {
            aVar.mo92224i("GADGET_SENG_MSG", "crossprocess error");
            apiSendMsgCardResponse.mErrorCode = ApiSendMsgCardError.CARD_CONTENT_PARSE_FAILED.getCode();
            apiSendMsgCardResponse.mErrorMessage = ApiSendMsgCardError.CARD_CONTENT_PARSE_FAILED.getMsg();
            hVar.callback(apiSendMsgCardResponse);
            return;
        }
        m90725a(chatModel, str, cardContent, aVar, hVar, apiSendMsgCardResponse, iAppContext, z, aVar2);
    }

    /* renamed from: a */
    private void m90730a(String str, String str2, ChatModel chatModel, ILogger aVar, AbstractC25897h<ApiSendMsgCardPlugin.ApiSendMsgCardResponse> hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, boolean z, AbstractC67709b.AbstractC67710a aVar2) {
        aVar.mo92224i("GADGET_SENG_MSG", "sendCardJsonToPb.");
        aVar2.mo235014a().mo235066a(str, chatModel.mo148774a(), str2, new AbstractC67712c.AbstractC67714b(aVar, chatModel, hVar, apiSendMsgCardResponse, iAppContext, z, aVar2) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.$$Lambda$f$b27fnIfti2imFvzhHnano1JVeE */
            public final /* synthetic */ ILogger f$1;
            public final /* synthetic */ ChatModel f$2;
            public final /* synthetic */ AbstractC25897h f$3;
            public final /* synthetic */ ApiSendMsgCardPlugin.ApiSendMsgCardResponse f$4;
            public final /* synthetic */ IAppContext f$5;
            public final /* synthetic */ boolean f$6;
            public final /* synthetic */ AbstractC67709b.AbstractC67710a f$7;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c.AbstractC67714b
            public final void onResult(String str, CardContent cardContent) {
                C25268f.this.m90728a((C25268f) this.f$1, (ILogger) this.f$2, (ChatModel) this.f$3, (AbstractC25897h) this.f$4, (ApiSendMsgCardPlugin.ApiSendMsgCardResponse) this.f$5, (IAppContext) this.f$6, (boolean) this.f$7, (AbstractC67709b.AbstractC67710a) str, (String) cardContent);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m90731b(ILogger aVar, AbstractC25897h<ApiSendMsgCardPlugin.ApiSendMsgCardResponse> hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, ChatModel chatModel, String str, CardContent cardContent, String str2, boolean z, AbstractC67709b.AbstractC67710a aVar2) {
        aVar.mo92224i("GADGET_SENG_MSG", "previewCard.");
        aVar2.mo235014a().mo235064a(aVar2.mo235051f(), chatModel.mo148775b(), str, cardContent, z, new AbstractC67712c.AbstractC67716d(chatModel, str2, hVar, apiSendMsgCardResponse, iAppContext, aVar2) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.$$Lambda$f$I9Cw0rHs3FNPmnwWn13mqQbDhvk */
            public final /* synthetic */ ChatModel f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ AbstractC25897h f$3;
            public final /* synthetic */ ApiSendMsgCardPlugin.ApiSendMsgCardResponse f$4;
            public final /* synthetic */ IAppContext f$5;
            public final /* synthetic */ AbstractC67709b.AbstractC67710a f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c.AbstractC67716d
            public final void onResult(boolean z, boolean z2, String str) {
                C25268f.m90729a(ILogger.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, z, z2, str);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m90729a(ILogger aVar, ChatModel chatModel, String str, AbstractC25897h hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, AbstractC67709b.AbstractC67710a aVar2, boolean z, boolean z2, String str2) {
        aVar.mo92224i("GADGET_SENG_MSG", "preview failed:" + z + " canceled:" + z2);
        C25252b.m90698a(z, z2, str2, Arrays.asList(chatModel.mo148774a()), str, hVar, apiSendMsgCardResponse, iAppContext, aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m90726a(ILogger aVar, AbstractC25897h hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, ChatModel chatModel, CardContent cardContent, String str, boolean z, AbstractC67709b.AbstractC67710a aVar2, List list, List list2) {
        String str2;
        aVar.mo92224i("GADGET_SENG_MSG", "getChatAvatarUrls chatAvatarUrls" + list + "chatNames" + list2);
        if (list == null || list.isEmpty()) {
            str2 = "";
        } else {
            str2 = (String) list.get(0);
        }
        C12792j.m52871a(new Runnable(aVar, hVar, apiSendMsgCardResponse, iAppContext, chatModel, str2, cardContent, str, z, aVar2) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.$$Lambda$f$9qrr1hmXyiPudYt2IwI09k1mAtc */
            public final /* synthetic */ ILogger f$1;
            public final /* synthetic */ AbstractC67709b.AbstractC67710a f$10;
            public final /* synthetic */ AbstractC25897h f$2;
            public final /* synthetic */ ApiSendMsgCardPlugin.ApiSendMsgCardResponse f$3;
            public final /* synthetic */ IAppContext f$4;
            public final /* synthetic */ ChatModel f$5;
            public final /* synthetic */ String f$6;
            public final /* synthetic */ CardContent f$7;
            public final /* synthetic */ String f$8;
            public final /* synthetic */ boolean f$9;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
                this.f$9 = r10;
                this.f$10 = r11;
            }

            public final void run() {
                C25268f.this.m90731b(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10);
            }
        });
    }
}
