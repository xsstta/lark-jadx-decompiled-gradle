package com.larksuite.component.openplatform.core.plugin.messenger.sendmsg;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12792j;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.larkbrand.utils.IdTransformer;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.SendMsgCardHandler;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.AbstractC67712c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.c */
public class C25254c {

    /* renamed from: a */
    public HashSet<String> f61642a = new HashSet<>();

    /* renamed from: a */
    public void mo88366a(List<String> list, String str, String str2, AbstractC65797c cVar, AbstractC67709b.AbstractC67710a aVar) {
        m90703c(list, str, str2, cVar, aVar);
    }

    /* renamed from: a */
    public void mo88365a(final List<String> list, final String str, final CardContent cardContent, final AbstractC65797c cVar, final AbstractC67709b.AbstractC67710a aVar) {
        AppBrandLogger.m52830i("GADGET_SENG_MSG", "getChatAvatarUrls");
        aVar.mo235014a().mo235067a(list, new AbstractC67712c.AbstractC67713a() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25254c.C252584 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c.AbstractC67713a
            public void onResult(final List<String> list, final List<String> list2) {
                AppBrandLogger.m52830i("GADGET_SENG_MSG", "getChatAvatarUrls chatAvatarUrls" + list + "chatNames" + list2);
                C12792j.m52871a(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25254c.C252584.RunnableC252591 */

                    public void run() {
                        C25254c.this.mo88364a(list, cVar, cardContent, list, str, list2, aVar);
                    }
                });
            }
        });
    }

    /* renamed from: c */
    private void m90703c(final List<String> list, final String str, final String str2, final AbstractC65797c cVar, final AbstractC67709b.AbstractC67710a aVar) {
        AppBrandLogger.m52830i("GADGET_SENG_MSG", "do openChatIds2ChatIds");
        IdTransformer.f35273a.mo49672a(list, cVar.mo230473f(), C12805d.m52894a(C12805d.m52893a(cVar.mo230473f()), true, cVar.mo230473f()), cVar.mo230472e(), new Function1<String, Unit>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25254c.C252551 */

            /* renamed from: a */
            public Unit invoke(String str) {
                ArrayList arrayList = new ArrayList();
                try {
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject("chatids");
                    for (String str2 : list) {
                        String string = optJSONObject.getString(str2);
                        if (TextUtils.isEmpty(string)) {
                            C25254c.this.f61642a.add(str2);
                        } else {
                            arrayList.add(string);
                        }
                    }
                    C25254c.this.mo88367b(arrayList, str, str2, cVar, aVar);
                } catch (JSONException unused) {
                    cVar.mo230493c(C25252b.m90692a(SendMsgCardHandler.Error.SOME_IDS_INVALID.getCode(), SendMsgCardHandler.Error.SOME_IDS_INVALID.getMsg()));
                }
                return Unit.INSTANCE;
            }
        }, new Function1<Throwable, Unit>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25254c.C252562 */

            /* renamed from: a */
            public Unit invoke(Throwable th) {
                cVar.mo230493c(C25252b.m90692a(SendMsgCardHandler.Error.SOME_IDS_INVALID.getCode(), SendMsgCardHandler.Error.SOME_IDS_INVALID.getMsg()));
                return null;
            }
        });
    }

    /* renamed from: b */
    public void mo88367b(final List<String> list, String str, String str2, final AbstractC65797c cVar, final AbstractC67709b.AbstractC67710a aVar) {
        if (list.isEmpty()) {
            AppBrandLogger.m52830i("GADGET_SENG_MSG", "chatids is empty");
            cVar.mo230493c(C25252b.m90692a(SendMsgCardHandler.Error.SOME_IDS_INVALID.getCode(), SendMsgCardHandler.Error.SOME_IDS_INVALID.getMsg()));
            return;
        }
        AppBrandLogger.m52830i("GADGET_SENG_MSG", "sendCardJsonToPb");
        aVar.mo235014a().mo235066a(str, list.get(0), str2, new AbstractC67712c.AbstractC67714b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25254c.C252573 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c.AbstractC67714b
            public void onResult(String str, CardContent cardContent) {
                AppBrandLogger.m52830i("GADGET_SENG_MSG", "back to miniprocess onResult" + str);
                if (TextUtils.isEmpty(str) || cardContent == null) {
                    AppBrandLogger.m52830i("GADGET_SENG_MSG", "crossprocess error");
                    cVar.mo230493c(C25252b.m90692a(SendMsgCardHandler.Error.CARD_CONTENT_PARSE_FAILED.getCode(), SendMsgCardHandler.Error.CARD_CONTENT_PARSE_FAILED.getMsg()));
                    return;
                }
                C25254c.this.mo88365a(list, str, cardContent, cVar, aVar);
            }
        });
    }

    /* renamed from: a */
    public void mo88364a(List<String> list, final AbstractC65797c cVar, CardContent cardContent, final List<String> list2, final String str, List<String> list3, final AbstractC67709b.AbstractC67710a aVar) {
        String str2;
        AppBrandLogger.m52830i("GADGET_SENG_MSG", "previewCard");
        C252605 r12 = new AbstractC67712c.AbstractC67716d() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25254c.C252605 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c.AbstractC67716d
            public void onResult(boolean z, boolean z2, String str) {
                AppBrandLogger.m52830i("GADGET_SENG_MSG", "preview failed:" + z + " canceled:" + z2);
                C25252b.m90699a(z, z2, list2, str, cVar, aVar);
            }
        };
        if (list != null) {
            if (list.size() > 1) {
                AppBrandLogger.m52830i("GADGET_SENG_MSG", "invoke previewCard");
                aVar.mo235014a().mo235065a(aVar.mo235051f(), list, cardContent, false, r12);
                return;
            } else if (list.size() == 1) {
                if (list3 == null || list3.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = list3.get(0);
                }
                AppBrandLogger.m52830i("GADGET_SENG_MSG", "get chat name :" + str2 + "invoke previewCard");
                aVar.mo235014a().mo235064a(aVar.mo235051f(), str2, list.get(0), cardContent, false, r12);
                return;
            }
        }
        AppBrandLogger.m52830i("GADGET_SENG_MSG", "get chat avatar failed, invoke previewCard");
        aVar.mo235014a().mo235065a(aVar.mo235051f(), new ArrayList(), cardContent, false, r12);
    }
}
