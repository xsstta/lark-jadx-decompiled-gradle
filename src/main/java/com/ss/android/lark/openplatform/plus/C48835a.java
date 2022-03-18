package com.ss.android.lark.openplatform.plus;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.openplatform.common.C48822a;
import com.ss.android.lark.openplatform.common.C48830g;
import com.ss.android.lark.openplatform.common.GadgetMorePlusItem;
import com.ss.android.lark.openplatform.common.GadgetPlusItem;
import com.ss.android.lark.openplatform.common.bean.C48826a;
import com.ss.android.lark.openplatform.common.bean.C48827b;
import com.ss.android.lark.openplatform.common.bean.PlusMenuGadgetData;
import com.ss.android.lark.openplatform.common.bean.TriggerBizType;
import com.ss.android.lark.openplatform.p2403d.C48831a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.openbusiness.OpbScene;
import com.ss.android.openbusiness.data.AppShortCutChatData;
import com.ss.android.openbusiness.data.netdata.C59572d;
import com.ss.android.openbusiness.p3004b.AbstractC59482a;
import com.ss.android.openbusiness.p3004b.C59492c;
import com.ss.android.openbusiness.p3006c.C59549f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.openplatform.plus.a */
public class C48835a implements AbstractC48842c {

    /* renamed from: a */
    public OpenPlatformModule.AbstractC48791a f122682a;

    /* renamed from: b */
    public List<IPlusItem> f122683b = new ArrayList();

    /* renamed from: c */
    private final AppShortCutChatData f122684c;

    /* renamed from: d */
    private AbstractC48839a f122685d;

    /* renamed from: com.ss.android.lark.openplatform.plus.a$a */
    public interface AbstractC48839a {
        /* renamed from: a */
        void mo170519a(OpbScene opbScene);
    }

    /* renamed from: a */
    public AppShortCutChatData mo170618a() {
        return this.f122684c;
    }

    /* renamed from: a */
    public void mo170623a(OpenPlatformModule.AbstractC48791a aVar, AbstractC48839a aVar2) {
        boolean e = m192429e();
        if (!m192427a(this.f122684c, e)) {
            C53241h.m205898b("GADGET_SENG_MSG", "hide plus gadget");
        } else if (e) {
            OpenPlatformModule.m192198d().getAppCenterDependency().mo144967a(OpenPlatformModule.m192198d().getContext());
            m192426a(aVar);
            this.f122682a = aVar;
            this.f122685d = aVar2;
        } else {
            m192428b(aVar);
        }
    }

    /* renamed from: a */
    public void mo170624a(PlusMenuGadgetData plusMenuGadgetData, OpenPlatformModule.AbstractC48791a aVar) {
        List<C48826a> authorizedAppList = plusMenuGadgetData.getAuthorizedAppList();
        if (authorizedAppList == null) {
            aVar.mo144864a("authorizedAppList is null");
            return;
        }
        C48830g.m192399a(authorizedAppList.size(), OpenPlatformModule.m192198d().getLocale());
        ArrayList arrayList = new ArrayList();
        if (this.f122684c.mo202943c()) {
            arrayList.addAll(plusMenuGadgetData.getP2pAppList());
        } else {
            arrayList.addAll(plusMenuGadgetData.getGroupAppList());
        }
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < authorizedAppList.size(); i++) {
                C48826a aVar2 = authorizedAppList.get(i);
                if (aVar2 != null && arrayList.contains(aVar2.mo170570a())) {
                    arrayList2.add(new GadgetPlusItem(i, this, aVar2));
                }
            }
            C48830g.m192398a(arrayList2.size());
            aVar.mo144865a(arrayList2);
        }
    }

    /* renamed from: a */
    public void mo170622a(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            OpenPlatformModule.m192198d().openGadgetFromPlusMenu(context, str2, str3, this.f122684c.mo202944d(), new Function1(str2, context) {
                /* class com.ss.android.lark.openplatform.plus.$$Lambda$a$CTEi7fqp11PsbesmzvKAhWNK4g */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C48835a.this.m192425a(this.f$1, this.f$2, (String) obj);
                }
            });
            return;
        }
        C53241h.m205898b("Opb_GadgetManager", "mobileAppLink is empty, or chat empty" + str + " " + str2);
    }

    @Override // com.ss.android.lark.openplatform.plus.AbstractC48842c
    /* renamed from: a */
    public boolean mo170625a(Intent intent, int i) {
        if (this.f122682a == null || this.f122683b.size() == 0) {
            return false;
        }
        C53241h.m205898b("Opb_GadgetManager", "activity result update external apps");
        m192430f();
        return true;
    }

    /* renamed from: d */
    public boolean mo170628d() {
        return this.f122684c.mo202944d();
    }

    /* renamed from: e */
    private boolean m192429e() {
        return OpenPlatformModule.m192198d().getFgValue("lark.app.plus.new_api");
    }

    /* renamed from: b */
    public void mo170626b() {
        if (this.f122682a != null) {
            C53241h.m205898b("Opb_GadgetManager", "open keyboard, update external apps");
            m192430f();
        }
    }

    /* renamed from: c */
    public boolean mo170627c() {
        return OpenPlatformModule.m192198d().getFgValue("message.action.list.entry.enable");
    }

    /* renamed from: f */
    private void m192430f() {
        OpbScene opbScene;
        if (mo170628d()) {
            opbScene = OpbScene.PLUS_MENU_SINGLE;
        } else {
            opbScene = OpbScene.PLUS_MENU_GROUP;
        }
        AbstractC48839a aVar = this.f122685d;
        if (aVar != null) {
            aVar.mo170519a(opbScene);
        }
        C59492c.m230889a().mo202798c(LarkContext.getApplication(), opbScene, new AbstractC59482a.AbstractC59483a<List<C59572d>>() {
            /* class com.ss.android.lark.openplatform.plus.C48835a.C488383 */

            @Override // com.ss.android.openbusiness.p3004b.AbstractC59482a.AbstractC59483a
            /* renamed from: a */
            public void mo170517a(String str) {
                C53241h.m205894a("Opb_GadgetManager", "get apps fail: " + str);
            }

            /* renamed from: a */
            public void mo170516a(List<C59572d> list) {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                if (list != null) {
                    List<C59572d> a = C48835a.this.mo170620a(list);
                    C53241h.m205898b("Opb_GadgetManager", "external apps size:" + a.size());
                    int size = a.size();
                    while (i < size) {
                        arrayList.add(new GadgetPlusItem(i, C48835a.this, a.get(i)));
                        i++;
                    }
                }
                if (C48835a.this.mo170627c()) {
                    arrayList.add(new GadgetMorePlusItem(i, C48835a.this));
                }
                if (C48835a.this.f122682a != null) {
                    C48835a.this.f122682a.mo144866a(C48835a.this.f122683b, arrayList);
                }
                C48835a.this.f122683b = arrayList;
            }
        });
    }

    public C48835a(AppShortCutChatData appShortCutChatData) {
        this.f122684c = appShortCutChatData;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C48827b m192424a(byte[] bArr) throws IOException {
        String str = SendHttpResponse.ADAPTER.decode(bArr).json_body;
        try {
            return (C48827b) new Gson().fromJson(str, C48827b.class);
        } catch (JsonSyntaxException e) {
            C53241h.m205894a("openPlatform", "parse plusMenuGagdets response failed :" + e + "  json_body:" + str);
            return null;
        }
    }

    /* renamed from: b */
    private void m192428b(final OpenPlatformModule.AbstractC48791a aVar) {
        final String a = C48822a.m192349a();
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "session=" + OpenPlatformModule.m192198d().getSession());
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("larkVersion", C26246a.m94977a(OpenPlatformModule.m192198d().getContext()));
        jsonObject.addProperty("locale", OpenPlatformModule.m192198d().getLocale());
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, new SendHttpRequest.C15253a().mo55528a(a).mo55526a(SendHttpRequest.Method.POST).mo55533c(jsonObject.toString()).mo55529a(hashMap), new IGetDataCallback<C48827b>() {
            /* class com.ss.android.lark.openplatform.plus.C48835a.C488372 */

            /* renamed from: a */
            public void onSuccess(C48827b bVar) {
                if (bVar == null) {
                    aVar.mo144864a("plusMenuGagdets response is null");
                    C53241h.m205894a("openPlatform", "plusMenuGagdets response is null");
                    return;
                }
                int b = bVar.mo170576b();
                PlusMenuGadgetData a = bVar.mo170575a();
                if (b != 0 || a == null) {
                    aVar.mo144864a("plusMenuGagdets response exception");
                    C53241h.m205894a("openPlatform", "plusMenuGagdets response exception");
                    return;
                }
                C48835a.this.mo170624a(a, aVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205894a("openPlatform", "request plusMenuGagdets onError:" + errorResult + " url :" + a);
            }
        }, $$Lambda$a$71LOse7_suDdN1DWsorpfbCpA.INSTANCE);
    }

    /* renamed from: a */
    private void m192426a(final OpenPlatformModule.AbstractC48791a aVar) {
        OpbScene opbScene;
        final ArrayList arrayList = new ArrayList();
        C59492c a = C59492c.m230889a();
        Context context = OpenPlatformModule.m192198d().getContext();
        if (this.f122684c.mo202944d()) {
            opbScene = OpbScene.PLUS_MENU_GROUP;
        } else {
            opbScene = OpbScene.PLUS_MENU_SINGLE;
        }
        a.mo202796a(context, opbScene, new AbstractC59482a.AbstractC59483a<List<C59572d>>() {
            /* class com.ss.android.lark.openplatform.plus.C48835a.C488361 */

            @Override // com.ss.android.openbusiness.p3004b.AbstractC59482a.AbstractC59483a
            /* renamed from: a */
            public void mo170517a(String str) {
                C53241h.m205894a("Opb_GadgetManager", "get apps fail: " + str);
                if (C48835a.this.mo170627c()) {
                    arrayList.add(new GadgetMorePlusItem(0, C48835a.this));
                }
                if (arrayList.isEmpty()) {
                    aVar.mo144864a("item list is empty");
                } else {
                    aVar.mo144865a(arrayList);
                }
                C48835a.this.f122683b = arrayList;
            }

            /* renamed from: a */
            public void mo170516a(List<C59572d> list) {
                int i = 0;
                if (list != null) {
                    List<C59572d> a = C48835a.this.mo170620a(list);
                    C53241h.m205898b("Opb_GadgetManager", "external apps size:" + a.size());
                    int size = a.size();
                    while (i < size) {
                        arrayList.add(new GadgetPlusItem(i, C48835a.this, a.get(i)));
                        i++;
                    }
                }
                if (C48835a.this.mo170627c()) {
                    arrayList.add(new GadgetMorePlusItem(i, C48835a.this));
                }
                if (arrayList.isEmpty()) {
                    aVar.mo144864a("item list is empty");
                } else {
                    aVar.mo144865a(arrayList);
                }
                C48835a.this.f122683b = arrayList;
            }
        });
    }

    /* renamed from: a */
    public List<C59572d> mo170620a(List<C59572d> list) {
        ArrayList arrayList = new ArrayList();
        for (C59572d dVar : list) {
            if (dVar.mo202972d().booleanValue()) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.openplatform.plus.AbstractC48842c
    /* renamed from: a */
    public void mo170621a(Context context, int i) {
        OpbScene opbScene;
        C59549f.m231040a(this.f122684c, true, "");
        if (mo170628d()) {
            opbScene = OpbScene.PLUS_MENU_GROUP;
        } else {
            opbScene = OpbScene.PLUS_MENU_SINGLE;
        }
        C59549f.m231038a(opbScene);
        C48831a.m192403a().mo170579a(context, i, this);
    }

    /* renamed from: a */
    private boolean m192427a(AppShortCutChatData appShortCutChatData, boolean z) {
        boolean z2;
        if (!OpenPlatformModule.m192198d().getFgValue("lark.app.plus") || !OpenPlatformModule.m192198d().isFeatureOn("chat.apps")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 || appShortCutChatData.mo202941a()) {
            return false;
        }
        if (!z) {
            return !appShortCutChatData.mo202942b();
        }
        if (!appShortCutChatData.mo202942b() || OpenPlatformModule.m192198d().getFgValue("message.action.cross.tenant.enable")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Void m192425a(String str, Context context, String str2) {
        C53241h.m205898b("GADGET_SENG_MSG", "handleGadgetClick tc:" + str2 + " link:" + str + " chatId:" + this.f122684c.mo202946e());
        if (str2 != null) {
            TriggerCodeManager.f122716b.mo170647a().mo170645a(str2, new C48850e(this.f122684c, context, TriggerBizType.CHAT_ACTION));
            return null;
        }
        C53241h.m205894a("Opb_GadgetManager", "triggerCode bean null");
        return null;
    }

    /* renamed from: a */
    public String mo170619a(String str, int i, int i2) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('~');
            if (i <= 0) {
                i = 0;
            }
            sb.append(i);
            sb.append('x');
            if (i2 <= 0) {
                i2 = 0;
            }
            sb.append(i2);
            sb.append(".image");
            return sb.toString();
        }
        C53241h.m205898b("Opb_GadgetManager", "icon url is null");
        return "";
    }
}
