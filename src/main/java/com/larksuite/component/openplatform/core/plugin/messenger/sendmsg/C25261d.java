package com.larksuite.component.openplatform.core.plugin.messenger.sendmsg;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.utils.C12792j;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.IdTransformer;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.ApiSendMsgCardPlugin;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.AbstractC67712c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.d */
public class C25261d {

    /* renamed from: a */
    private HashSet<String> f61669a = new HashSet<>();

    /* renamed from: a */
    public void mo88373a(List<String> list, String str, String str2, ILogger aVar, AbstractC25897h<ApiSendMsgCardPlugin.ApiSendMsgCardResponse> hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, boolean z, AbstractC67709b.AbstractC67710a aVar2) {
        if (list.isEmpty()) {
            aVar.mo92224i("GADGET_SENG_MSG", "chatids is empty");
            apiSendMsgCardResponse.mErrorCode = ApiSendMsgCardError.SOME_IDS_INVALID.getCode();
            apiSendMsgCardResponse.mErrorMessage = ApiSendMsgCardError.SOME_IDS_INVALID.getMsg();
            hVar.callback(apiSendMsgCardResponse);
            return;
        }
        aVar.mo92224i("GADGET_SENG_MSG", "sendCardJsonToPb");
        aVar2.mo235014a().mo235066a(str, list.get(0), str2, new AbstractC67712c.AbstractC67714b(aVar, list, hVar, apiSendMsgCardResponse, iAppContext, z, aVar2) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.$$Lambda$d$PW4XeDdTs_DVMDK44GBYQE7DPA */
            public final /* synthetic */ ILogger f$1;
            public final /* synthetic */ List f$2;
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
                C25261d.this.m90713a((C25261d) this.f$1, (ILogger) this.f$2, (List) this.f$3, (AbstractC25897h) this.f$4, (ApiSendMsgCardPlugin.ApiSendMsgCardResponse) this.f$5, (IAppContext) this.f$6, (boolean) this.f$7, (AbstractC67709b.AbstractC67710a) str, (String) cardContent);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Unit m90710a(ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, AbstractC25897h hVar, Throwable th) {
        apiSendMsgCardResponse.mErrorCode = ApiSendMsgCardError.SOME_IDS_INVALID.getCode();
        apiSendMsgCardResponse.mErrorMessage = ApiSendMsgCardError.SOME_IDS_INVALID.getMsg();
        hVar.callback(apiSendMsgCardResponse);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m90713a(ILogger aVar, List list, AbstractC25897h hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, boolean z, AbstractC67709b.AbstractC67710a aVar2, String str, CardContent cardContent) {
        aVar.mo92224i("GADGET_SENG_MSG", "back to miniprocess onResult" + str);
        if (TextUtils.isEmpty(str) || cardContent == null) {
            aVar.mo92224i("GADGET_SENG_MSG", "crossprocess error");
            apiSendMsgCardResponse.mErrorCode = ApiSendMsgCardError.CARD_CONTENT_PARSE_FAILED.getCode();
            apiSendMsgCardResponse.mErrorMessage = ApiSendMsgCardError.CARD_CONTENT_PARSE_FAILED.getMsg();
            hVar.callback(apiSendMsgCardResponse);
            return;
        }
        m90715a(list, str, cardContent, aVar, hVar, apiSendMsgCardResponse, iAppContext, z, aVar2);
    }

    /* renamed from: a */
    private void m90715a(List<String> list, String str, CardContent cardContent, ILogger aVar, AbstractC25897h<ApiSendMsgCardPlugin.ApiSendMsgCardResponse> hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, boolean z, AbstractC67709b.AbstractC67710a aVar2) {
        aVar.mo92224i("GADGET_SENG_MSG", "getChatAvatarUrls");
        aVar2.mo235014a().mo235067a(list, new AbstractC67712c.AbstractC67713a(aVar, hVar, apiSendMsgCardResponse, iAppContext, cardContent, list, str, z, aVar2) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.$$Lambda$d$CfnxC3Ua6ONoefMiCnz2CsPB_k */
            public final /* synthetic */ ILogger f$1;
            public final /* synthetic */ AbstractC25897h f$2;
            public final /* synthetic */ ApiSendMsgCardPlugin.ApiSendMsgCardResponse f$3;
            public final /* synthetic */ IAppContext f$4;
            public final /* synthetic */ CardContent f$5;
            public final /* synthetic */ List f$6;
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
                C25261d.this.m90712a((C25261d) this.f$1, (ILogger) this.f$2, (AbstractC25897h) this.f$3, (ApiSendMsgCardPlugin.ApiSendMsgCardResponse) this.f$4, (IAppContext) this.f$5, (CardContent) this.f$6, (List) this.f$7, (String) this.f$8, (boolean) this.f$9, (AbstractC67709b.AbstractC67710a) list, list2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m90714a(ILogger aVar, List list, String str, AbstractC25897h hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, AbstractC67709b.AbstractC67710a aVar2, boolean z, boolean z2, String str2) {
        aVar.mo92224i("GADGET_SENG_MSG", "preview failed:" + z + " canceled:" + z2);
        C25252b.m90698a(z, z2, str2, list, str, hVar, apiSendMsgCardResponse, iAppContext, aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Unit m90711a(List list, String str, String str2, ILogger aVar, AbstractC25897h hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, boolean z, AbstractC67709b.AbstractC67710a aVar2, String str3) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject optJSONObject = new JSONObject(str3).optJSONObject("chatids");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                String str5 = null;
                if (optJSONObject != null) {
                    str5 = optJSONObject.getString(str4);
                }
                if (TextUtils.isEmpty(str5)) {
                    try {
                        this.f61669a.add(str4);
                    } catch (JSONException unused) {
                        apiSendMsgCardResponse.mErrorCode = ApiSendMsgCardError.SOME_IDS_INVALID.getCode();
                        apiSendMsgCardResponse.mErrorMessage = ApiSendMsgCardError.SOME_IDS_INVALID.getMsg();
                        hVar.callback(apiSendMsgCardResponse);
                        return Unit.INSTANCE;
                    }
                } else {
                    arrayList.add(str5);
                }
            }
            mo88373a(arrayList, str, str2, aVar, hVar, apiSendMsgCardResponse, iAppContext, z, aVar2);
        } catch (JSONException unused2) {
            apiSendMsgCardResponse.mErrorCode = ApiSendMsgCardError.SOME_IDS_INVALID.getCode();
            apiSendMsgCardResponse.mErrorMessage = ApiSendMsgCardError.SOME_IDS_INVALID.getMsg();
            hVar.callback(apiSendMsgCardResponse);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public void mo88372a(List<String> list, String str, String str2, ILogger aVar, AbstractC25897h<ApiSendMsgCardPlugin.ApiSendMsgCardResponse> hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, AbstractC67709b.AbstractC67710a aVar2, OPTrace oPTrace, String str3, boolean z) {
        m90716b(list, str, str2, aVar, hVar, apiSendMsgCardResponse, iAppContext, aVar2, oPTrace, str3, z);
    }

    /* renamed from: b */
    private void m90716b(List<String> list, String str, String str2, ILogger aVar, AbstractC25897h<ApiSendMsgCardPlugin.ApiSendMsgCardResponse> hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, AbstractC67709b.AbstractC67710a aVar2, OPTrace oPTrace, String str3, boolean z) {
        aVar.mo92224i("GADGET_SENG_MSG", "do openChatIds2ChatIds");
        IdTransformer.f35273a.mo49672a(list, iAppContext, oPTrace, str3, new Function1(list, str, str2, aVar, hVar, apiSendMsgCardResponse, iAppContext, z, aVar2) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.$$Lambda$d$Sns_A8ccM1W90ZCaFaFKCN7u3mo */
            public final /* synthetic */ List f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ ILogger f$4;
            public final /* synthetic */ AbstractC25897h f$5;
            public final /* synthetic */ ApiSendMsgCardPlugin.ApiSendMsgCardResponse f$6;
            public final /* synthetic */ IAppContext f$7;
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

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C25261d.this.m90711a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, (String) obj);
            }
        }, new Function1(hVar) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.$$Lambda$d$KwRpRUVqrpm4sB3J3UpA6VYWar0 */
            public final /* synthetic */ AbstractC25897h f$1;

            {
                this.f$1 = r2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C25261d.m90710a(ApiSendMsgCardPlugin.ApiSendMsgCardResponse.this, this.f$1, (Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m90712a(final ILogger aVar, final AbstractC25897h hVar, final ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, final IAppContext iAppContext, final CardContent cardContent, final List list, final String str, final boolean z, final AbstractC67709b.AbstractC67710a aVar2, final List list2, final List list3) {
        aVar.mo92224i("GADGET_SENG_MSG", "getChatAvatarUrls chatAvatarUrls" + list2 + "chatNames" + list3);
        C12792j.m52871a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25261d.RunnableC252621 */

            public void run() {
                C25261d.this.mo88371a(list2, aVar, hVar, apiSendMsgCardResponse, iAppContext, cardContent, list, str, list3, z, aVar2);
            }
        });
    }

    /* renamed from: a */
    public void mo88371a(List<String> list, ILogger aVar, AbstractC25897h<ApiSendMsgCardPlugin.ApiSendMsgCardResponse> hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, CardContent cardContent, List<String> list2, String str, List<String> list3, boolean z, AbstractC67709b.AbstractC67710a aVar2) {
        String str2;
        aVar.mo92224i("GADGET_SENG_MSG", "previewCard");
        $$Lambda$d$JNv7VS2yTM5TB0Mkc2cM9hOAQs r14 = new AbstractC67712c.AbstractC67716d(list2, str, hVar, apiSendMsgCardResponse, iAppContext, aVar2) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.$$Lambda$d$JNv7VS2yTM5TB0Mkc2cM9hOAQs */
            public final /* synthetic */ List f$1;
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
                C25261d.m90714a(ILogger.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, z, z2, str);
            }
        };
        if (list != null) {
            if (list.size() > 1) {
                aVar.mo92224i("GADGET_SENG_MSG", "invoke previewCard");
                aVar2.mo235014a().mo235065a(aVar2.mo235051f(), list, cardContent, z, r14);
                return;
            } else if (list.size() == 1) {
                if (list3 == null || list3.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = list3.get(0);
                }
                aVar.mo92224i("GADGET_SENG_MSG", "get chat name :" + str2 + "invoke previewCard");
                aVar2.mo235014a().mo235064a(aVar2.mo235051f(), str2, list.get(0), cardContent, z, r14);
                return;
            }
        }
        aVar.mo92224i("GADGET_SENG_MSG", "get chat avatar failed, invoke previewCard");
        aVar2.mo235014a().mo235065a(aVar2.mo235051f(), new ArrayList(), cardContent, z, r14);
    }
}
