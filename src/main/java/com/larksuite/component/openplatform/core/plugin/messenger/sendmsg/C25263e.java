package com.larksuite.component.openplatform.core.plugin.messenger.sendmsg;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12792j;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.SendMsgCardHandler;
import com.ss.android.lark.littleapp.entity.ChatModel;
import com.ss.android.lark.utils.C57782ag;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.AbstractC67712c;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.e */
public class C25263e {
    /* renamed from: a */
    public void mo88377a(String str, String str2, String str3, AbstractC65797c cVar, AbstractC67709b.AbstractC67710a aVar) {
        m90721b(str, str2, str3, cVar, aVar);
    }

    /* renamed from: a */
    private void m90720a(String str, String str2, final ChatModel chatModel, final AbstractC65797c cVar, final AbstractC67709b.AbstractC67710a aVar) {
        AppBrandLogger.m52830i("GADGET_SENG_MSG", "sendCardJsonToPb.");
        aVar.mo235014a().mo235066a(str, chatModel.mo148774a(), str2, new AbstractC67712c.AbstractC67714b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25263e.C252641 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c.AbstractC67714b
            public void onResult(String str, CardContent cardContent) {
                AppBrandLogger.m52830i("GADGET_SENG_MSG", "back to miniprocess onResult" + str);
                if (TextUtils.isEmpty(str) || cardContent == null) {
                    AppBrandLogger.m52830i("GADGET_SENG_MSG", "crossprocess error");
                    cVar.mo230493c(C25252b.m90692a(SendMsgCardHandler.Error.CARD_CONTENT_PARSE_FAILED.getCode(), SendMsgCardHandler.Error.CARD_CONTENT_PARSE_FAILED.getMsg()));
                    return;
                }
                C25263e.this.mo88375a(chatModel, str, cardContent, cVar, aVar);
            }
        });
    }

    /* renamed from: a */
    public void mo88375a(final ChatModel chatModel, final String str, final CardContent cardContent, final AbstractC65797c cVar, final AbstractC67709b.AbstractC67710a aVar) {
        AppBrandLogger.m52830i("GADGET_SENG_MSG", "getChatAvatarUrls.");
        aVar.mo235014a().mo235067a(Arrays.asList(chatModel.mo148774a()), new AbstractC67712c.AbstractC67713a() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25263e.C252652 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c.AbstractC67713a
            public void onResult(List<String> list, List<String> list2) {
                final String str;
                AppBrandLogger.m52830i("GADGET_SENG_MSG", "getChatAvatarUrls chatAvatarUrls" + list + "chatNames" + list2);
                if (list == null || list.isEmpty()) {
                    str = "";
                } else {
                    str = list.get(0);
                }
                C12792j.m52871a(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25263e.C252652.RunnableC252661 */

                    public void run() {
                        C25263e.this.mo88376a(cVar, chatModel, str, cardContent, str, aVar);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    private void m90721b(String str, String str2, String str3, AbstractC65797c cVar, AbstractC67709b.AbstractC67710a aVar) {
        AppBrandLogger.m52830i("GADGET_SENG_MSG", "getChatModel. tc:" + str);
        ChatModel a = aVar.mo235014a().mo235063a(str);
        if (C57782ag.m224242a(a.mo148776c(), "messageAction")) {
            AppBrandLogger.m52829e("GADGET_SENG_MSG", "chat name is empty");
            cVar.mo230493c(C25252b.m90692a(SendMsgCardHandler.Error.TRIGGER_CODE_INVALID.getCode(), SendMsgCardHandler.Error.NOT_SUPPORT_SCENE.getMsg()));
        } else if (TextUtils.isEmpty(a.mo148774a())) {
            AppBrandLogger.m52829e("GADGET_SENG_MSG", "chat id is empty");
            cVar.mo230493c(C25252b.m90692a(SendMsgCardHandler.Error.TRIGGER_CODE_INVALID.getCode(), SendMsgCardHandler.Error.TRIGGER_CODE_INVALID.getMsg()));
        } else {
            m90720a(str2, str3, a, cVar, aVar);
        }
    }

    /* renamed from: a */
    public void mo88376a(final AbstractC65797c cVar, final ChatModel chatModel, String str, CardContent cardContent, final String str2, final AbstractC67709b.AbstractC67710a aVar) {
        AppBrandLogger.m52830i("GADGET_SENG_MSG", "previewCard.");
        aVar.mo235014a().mo235064a(aVar.mo235051f(), chatModel.mo148775b(), str, cardContent, false, new AbstractC67712c.AbstractC67716d() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25263e.C252673 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c.AbstractC67716d
            public void onResult(boolean z, boolean z2, String str) {
                AppBrandLogger.m52830i("GADGET_SENG_MSG", "preview failed:" + z + " canceled:" + z2);
                C25252b.m90699a(z, z2, Arrays.asList(chatModel.mo148774a()), str2, cVar, aVar);
            }
        });
    }
}
