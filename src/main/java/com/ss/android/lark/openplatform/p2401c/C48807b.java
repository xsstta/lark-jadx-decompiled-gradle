package com.ss.android.lark.openplatform.p2401c;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import com.bytedance.ee.appstrategy.C4153e;
import com.bytedance.ee.appstrategy.p240a.AbstractC4146d;
import com.bytedance.ee.appstrategy.p240a.C4145c;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.aq;
import com.larksuite.suite.R;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27541f;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.appcenter.p1262a.p1264b.C27566d;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.applink.C29187c;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.openplatform.common.C48822a;
import com.ss.android.lark.openplatform.common.C48829f;
import com.ss.android.lark.openplatform.common.p2402a.C48823a;
import com.ss.android.lark.openplatform.common.p2402a.C48824b;
import com.ss.android.lark.openplatform.manis.OpenPlatformIpc;
import com.ss.android.lark.openplatform.openapp.AppOpenService;
import com.ss.android.lark.openplatform.openapp.BotOpenData;
import com.ss.android.lark.openplatform.openapp.ID_TYPE;
import com.ss.android.lark.openplatform.openapp.dto.AbstractC48834a;
import com.ss.android.lark.openplatform.openapp.dto.AppShareInfo;
import com.ss.android.lark.openplatform.openapp.dto.PlatformType;
import com.ss.android.lark.openplatform.p2399a.AbstractC48793a;
import com.ss.android.lark.openplatform.p2401c.C48804a;
import com.ss.android.lark.openplatform.p2401c.C48807b;
import com.ss.android.lark.openplatform.p2403d.C48831a;
import com.ss.android.lark.openplatform.plus.C48835a;
import com.ss.android.lark.openplatform.shareApp.p2405b.C48864a;
import com.ss.android.lark.openplatform.shareApp.p2405b.C48866b;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.openbusiness.data.AppShortCutChatData;
import com.tt.miniapp.toast.ToastManager;
import ee.android.framework.manis.C68183b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.openplatform.c.b */
public class C48807b {

    /* renamed from: a */
    public AbstractC48793a f122590a;

    /* renamed from: a */
    public void mo170539a(Context context, Map<String, AbstractC29186b> map) {
        map.put("/client/op/open", new AbstractC29186b() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.C488081 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(Context context, AppLink appLink) {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                return true;
            }
        });
    }

    /* renamed from: a */
    public void mo170540a(final OpenPlatformModule openPlatformModule, Map<String, AbstractC29186b> map) {
        map.put("/client/message_action_list/open", new AbstractC29186b() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.AnonymousClass17 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(Context context, AppLink appLink) {
                JSONArray optJSONArray;
                if (context == null) {
                    return false;
                }
                Uri parse = Uri.parse(appLink.mo103435a());
                String queryParameter = parse.getQueryParameter("list");
                C48807b.this.f122590a.getAppCenterDependency().mo144967a(context);
                if ("keyboard_action".equals(queryParameter)) {
                    C48831a.m192403a().mo170579a(context, -1, new C48835a(new AppShortCutChatData(parse.getQueryParameter("chatid"))));
                    return true;
                }
                String queryParameter2 = parse.getQueryParameter("message_action_list");
                if (queryParameter2 == null) {
                    return false;
                }
                try {
                    JSONObject jSONObject = new JSONObject(queryParameter2);
                    String optString = jSONObject.optString("chatId");
                    if (!TextUtils.isEmpty(optString) && (optJSONArray = jSONObject.optJSONArray("messageIds")) != null) {
                        if (optJSONArray.length() != 0) {
                            ArrayList arrayList = new ArrayList();
                            int length = optJSONArray.length();
                            for (int i = 0; i < length; i++) {
                                arrayList.add(optJSONArray.getString(i));
                            }
                            openPlatformModule.mo170501a(context, arrayList, (List<Integer>) null, optString);
                            return true;
                        }
                    }
                    return false;
                } catch (JSONException unused) {
                    C53241h.m205894a("LinkService", "message action can open json error:" + queryParameter2);
                    return false;
                }
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                JSONArray optJSONArray;
                if (context == null) {
                    return false;
                }
                Uri parse = Uri.parse(appLink.mo103435a());
                String queryParameter = parse.getQueryParameter("list");
                if ("keyboard_action".equals(queryParameter)) {
                    String queryParameter2 = parse.getQueryParameter("chatid");
                    if (!(context instanceof Activity) || TextUtils.isEmpty(queryParameter2)) {
                        return false;
                    }
                    return true;
                }
                if ("message_action".equals(queryParameter)) {
                    String queryParameter3 = parse.getQueryParameter("message_action_list");
                    if (TextUtils.isEmpty(queryParameter3)) {
                        return false;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(queryParameter3);
                        if (!TextUtils.isEmpty(jSONObject.optString("chatId")) && (optJSONArray = jSONObject.optJSONArray("messageIds")) != null) {
                            if (optJSONArray.length() != 0) {
                                int length = optJSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    optJSONArray.getString(i);
                                }
                                return true;
                            }
                        }
                        return false;
                    } catch (JSONException unused) {
                        C53241h.m205894a("LinkService", "message action can open json error:" + queryParameter3);
                    }
                }
                return false;
            }
        });
    }

    /* renamed from: a */
    public void mo170541a(String str, final AbstractC48834a aVar) {
        int i;
        String c = C48822a.m192352c();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cli_id", str);
            jSONObject.put("lark_version", OpenPlatformModule.m192198d().getAppVersionName());
            if (OpenPlatformModule.m192198d().isDeskTopMode()) {
                i = PlatformType.PlatformTypeAndroidpad.getNumber();
            } else {
                i = PlatformType.PlatformTypeAndroidMobile.getNumber();
            }
            jSONObject.put("platform", i);
        } catch (JSONException e) {
            C53241h.m205895a("LinkService", " get app ability info err ", e);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "session=" + OpenPlatformModule.m192198d().getSession());
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, new SendHttpRequest.C15253a().mo55528a(c).mo55533c(jSONObject.toString()).mo55526a(SendHttpRequest.Method.POST).mo55529a(hashMap), new IGetDataCallback<SendHttpResponse>() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.C488102 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205894a("LinkService", " get app ability net err " + errorResult.getDebugMsg());
                aVar.mo170554a(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(SendHttpResponse sendHttpResponse) {
                try {
                    JSONObject jSONObject = new JSONObject(sendHttpResponse.json_body);
                    int i = jSONObject.getInt("code");
                    if (i == 0) {
                        String optString = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        aVar.mo170555a((AppShareInfo) new Gson().fromJson(optString, AppShareInfo.class));
                        return;
                    }
                    aVar.mo170556b(new ErrorResult(i, jSONObject.optString("msg")));
                } catch (Exception e) {
                    C53241h.m205895a("LinkService", " get app ability ", e);
                    aVar.mo170556b(new ErrorResult(e));
                }
            }
        }, $$Lambda$b$DmVc4qBXQJsK45cj6yO0fhfj_ZE.INSTANCE);
    }

    /* renamed from: a */
    public void mo170538a(Context context, String str) {
        C26171w.m94675a(new Runnable(str, context) {
            /* class com.ss.android.lark.openplatform.p2401c.$$Lambda$b$0VHl8ARYHvDRTlA02ozcEJD4QCA */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Context f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C48807b.this.m192269a((C48807b) this.f$1, (String) this.f$2);
            }
        });
    }

    /* renamed from: a */
    public String mo170533a(String str, Uri uri) {
        HashSet<String> hashSet = new HashSet(uri.getQueryParameterNames());
        hashSet.remove("appId");
        hashSet.remove("path");
        hashSet.remove("path_android");
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        if (!TextUtils.isEmpty(uri.getQueryParameter("path_android"))) {
            buildUpon.encodedPath(uri.getQueryParameter("path_android"));
        } else if (!TextUtils.isEmpty(uri.getQueryParameter("path"))) {
            buildUpon.encodedPath(uri.getQueryParameter("path"));
        }
        for (String str2 : hashSet) {
            buildUpon.appendQueryParameter(str2, uri.getQueryParameter(str2));
        }
        for (String str3 : queryParameterNames) {
            if (!hashSet.contains(str3)) {
                buildUpon.appendQueryParameter(str3, parse.getQueryParameter(str3));
            }
        }
        return buildUpon.build().toString();
    }

    /* renamed from: a */
    public void mo170537a(Context context, AppLink appLink) {
        Uri parse = Uri.parse(appLink.mo103435a());
        String queryParameter = parse.getQueryParameter("chatId");
        String queryParameter2 = parse.getQueryParameter("openId");
        String queryParameter3 = parse.getQueryParameter("openChatId");
        String queryParameter4 = parse.getQueryParameter("botId");
        String queryParameter5 = parse.getQueryParameter("position");
        if (queryParameter != null) {
            m192268a(context, queryParameter, queryParameter5);
            mo170534a(1, (JSONObject) null, true);
        } else if (queryParameter2 != null) {
            m192267a(context, queryParameter2, 2);
        } else if (queryParameter3 != null) {
            m192267a(context, queryParameter3, 3);
        } else if (queryParameter4 != null) {
            new AppOpenService(this.f122590a).mo170591a(new BotOpenData(queryParameter4, ID_TYPE.BOT_ID));
        }
    }

    /* renamed from: a */
    public void mo170536a(Context context, final IGetDataCallback<String> iGetDataCallback) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.RunnableC488177 */

            /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(2:6|13)(2:7|15)) */
            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0084, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0085, code lost:
                r3.onError(new com.larksuite.framework.callback.Entity.ErrorResult(r0));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0078, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0079, code lost:
                r3.onError(new com.larksuite.framework.callback.Entity.ErrorResult(r0));
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0049 */
            /* JADX WARNING: Removed duplicated region for block: B:6:0x0065 A[Catch:{ IOException -> 0x0084, RuntimeException -> 0x0078 }] */
            /* JADX WARNING: Removed duplicated region for block: B:7:0x006b A[Catch:{ IOException -> 0x0084, RuntimeException -> 0x0078 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                // Method dump skipped, instructions count: 144
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.openplatform.p2401c.C48807b.RunnableC488177.run():void");
            }
        });
    }

    /* renamed from: a */
    public void mo170535a(Context context, int i, String str, String str2, String str3, String str4) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
            String a = C48823a.m192357a(str2, str3, jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).optString("encrypted_data"));
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject2 = new JSONObject(a);
                if (i == 2) {
                    str4 = "chatid";
                }
                String optString = jSONObject2.optString(str4);
                if (!TextUtils.isEmpty(optString)) {
                    m192268a(context, optString, (String) null);
                    mo170534a(i, jSONObject, true);
                    return;
                }
            }
        }
        mo170534a(i, jSONObject, false);
        C53241h.m205894a("LinkService", "request chatId error:" + str);
    }

    /* renamed from: a */
    public void mo170534a(int i, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = new JSONObject();
        if (i == 1) {
            try {
                jSONObject2.put(ShareHitPoint.f121869d, "chat_id");
                jSONObject2.put("result", z);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.f122590a.sendEvent("applink_open_chat", jSONObject2);
        } else if (i == 3 || i == 2) {
            try {
                jSONObject2.put(ShareHitPoint.f121869d, i == 2 ? "open_id" : "open_chat_id");
                jSONObject2.put("result", z);
                if (!z && jSONObject != null) {
                    if (jSONObject.has("code")) {
                        jSONObject2.put("rsp_code", jSONObject.optInt("code"));
                    }
                    if (jSONObject.has("msg")) {
                        jSONObject2.put("rsp_msg", jSONObject.optString("msg"));
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            this.f122590a.sendEvent("applink_open_chat", jSONObject2);
        }
    }

    /* renamed from: a */
    public void mo170542a(Map<String, AbstractC29186b> map) {
        AbstractC27541f i = C27548m.m100547m().mo98225i();
        if (i != null && i.mo98187a("openplatform.block.demo_enable")) {
            map.put("/client/block/workplace/open", new AbstractC29186b() {
                /* class com.ss.android.lark.openplatform.p2401c.C48807b.C488199 */

                @Override // com.ss.android.lark.applink.AbstractC29194f
                /* renamed from: a */
                public boolean mo103482a() {
                    return true;
                }

                @Override // com.ss.android.lark.applink.AbstractC29194f
                /* renamed from: d */
                public boolean mo103484d(Context context, AppLink appLink) {
                    return true;
                }

                @Override // com.ss.android.lark.applink.AbstractC29194f
                /* renamed from: c */
                public boolean mo103483c(Context context, AppLink appLink) {
                    Uri.Builder buildUpon = Uri.parse("sslocal://block_demo").buildUpon();
                    Uri parse = Uri.parse(appLink.mo103435a());
                    for (String str : new HashSet(parse.getQueryParameterNames())) {
                        buildUpon.appendQueryParameter(str, parse.getQueryParameter(str));
                    }
                    C27566d.m100600b(context, buildUpon.build().toString());
                    return true;
                }
            });
        }
    }

    /* renamed from: com.ss.android.lark.openplatform.c.b$11  reason: invalid class name */
    static /* synthetic */ class AnonymousClass11 {

        /* renamed from: a */
        static final /* synthetic */ int[] f122594a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.openplatform.openapp.dto.AppAbilityType[] r0 = com.ss.android.lark.openplatform.openapp.dto.AppAbilityType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.openplatform.p2401c.C48807b.AnonymousClass11.f122594a = r0
                com.ss.android.lark.openplatform.openapp.dto.AppAbilityType r1 = com.ss.android.lark.openplatform.openapp.dto.AppAbilityType.GADGET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.openplatform.p2401c.C48807b.AnonymousClass11.f122594a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.openplatform.openapp.dto.AppAbilityType r1 = com.ss.android.lark.openplatform.openapp.dto.AppAbilityType.H5     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.openplatform.p2401c.C48807b.AnonymousClass11.f122594a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.openplatform.openapp.dto.AppAbilityType r1 = com.ss.android.lark.openplatform.openapp.dto.AppAbilityType.BOT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.openplatform.p2401c.C48807b.AnonymousClass11.<clinit>():void");
        }
    }

    /* renamed from: a */
    public String mo170531a() {
        return "https://" + this.f122590a.getOpenAppHost() + "/lark/app_explorer/api/GetAvatarAppList";
    }

    public C48807b(AbstractC48793a aVar) {
        this.f122590a = aVar;
    }

    /* renamed from: a */
    private int m192265a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SendHttpResponse m192266a(byte[] bArr) throws IOException {
        return SendHttpResponse.ADAPTER.decode(bArr);
    }

    /* renamed from: a */
    public String mo170532a(int i) {
        if (i == 2) {
            return "https://" + this.f122590a.getOpenHost() + "/open-apis/mina/applink/getchatid-byopenid";
        }
        return "https://" + this.f122590a.getOpenHost() + "/open-apis/mina/applink/getchatid-byopenchatid";
    }

    /* renamed from: b */
    public void mo170543b(final Context context, final String str) {
        C48804a.m192261a(str, new C48804a.AbstractC48806a() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.C488155 */

            @Override // com.ss.android.lark.openplatform.p2401c.C48804a.AbstractC48806a
            /* renamed from: a */
            public void mo170530a(String str) {
                if (!TextUtils.isEmpty(str)) {
                    C53241h.m205898b("LinkService", "get web url:" + str);
                    C48807b.this.f122590a.getBrowserDependency().mo144952a(context, str, str);
                    return;
                }
                LKUIToast.show(context, (int) R.string.Lark_OpenPlatform_PageUnavailableMsg);
                C53241h.m205894a("LinkService", " url is null ");
            }
        });
    }

    /* renamed from: c */
    public void mo170545c(Context context, Map<String, AbstractC29186b> map) {
        map.put("/client/widget/open", new AbstractC29186b() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.AnonymousClass13 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(Context context, AppLink appLink) {
                Uri.Builder buildUpon = Uri.parse("sslocal://card").buildUpon();
                Uri parse = Uri.parse(appLink.mo103435a());
                for (String str : new HashSet(parse.getQueryParameterNames())) {
                    buildUpon.appendQueryParameter(str, parse.getQueryParameter(str));
                }
                C27566d.m100600b(context, buildUpon.build().toString());
                return true;
            }
        });
    }

    /* renamed from: d */
    public void mo170546d(final Context context, Map<String, AbstractC29186b> map) {
        map.put("/client/chat/open", new AbstractC29186b() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.AnonymousClass14 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(Context context, AppLink appLink) {
                if (context == null) {
                    context = context;
                }
                C48807b.this.mo170537a(context.getApplicationContext(), appLink);
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                Uri parse = Uri.parse(appLink.mo103435a());
                String queryParameter = parse.getQueryParameter("openId");
                String queryParameter2 = parse.getQueryParameter("chatId");
                String queryParameter3 = parse.getQueryParameter("openChatId");
                String queryParameter4 = parse.getQueryParameter("botId");
                if (queryParameter == null && queryParameter2 == null && queryParameter3 == null && queryParameter4 == null) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: e */
    public void mo170547e(final Context context, Map<String, AbstractC29186b> map) {
        map.put("/client/workplace/open", new AbstractC29186b() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.AnonymousClass15 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(Context context, AppLink appLink) {
                if (context == null) {
                    context = context;
                }
                C48807b.this.f122590a.openWorkplace(context);
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                boolean canOpenWorkplace = C48807b.this.f122590a.canOpenWorkplace();
                C53241h.m205898b("LinkService", "applink " + appLink.mo103435a() + " can openworkplace:" + canOpenWorkplace);
                return canOpenWorkplace;
            }
        });
    }

    /* renamed from: f */
    public void mo170548f(final Context context, Map<String, AbstractC29186b> map) {
        map.put("/client/web_url/open", new AbstractC29186b() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.AnonymousClass16 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(Context context, AppLink appLink) {
                String queryParameter = Uri.parse(appLink.mo103435a()).getQueryParameter("url");
                if (TextUtils.isEmpty(queryParameter) || !Patterns.WEB_URL.matcher(queryParameter).matches() || !aq.m95060c(queryParameter) || C29187c.m107300a().mo103470a(Uri.parse(queryParameter))) {
                    LKUIToast.show(context, UIHelper.mustacheFormat((int) R.string.OpenPlatform_Share_ParamWrongMsg, "list", "url"));
                    return false;
                }
                C53241h.m205898b("LinkService", "applink " + appLink.mo103435a() + " openUrl:" + queryParameter);
                C48807b.this.f122590a.getBrowserDependency().mo144951a(context, queryParameter);
                return true;
            }
        });
    }

    /* renamed from: g */
    public void mo170549g(final Context context, Map<String, AbstractC29186b> map) {
        map.put("/client/app_share/open", new AbstractC29186b() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.AnonymousClass18 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(final Context context, final AppLink appLink) {
                final String queryParameter = Uri.parse(appLink.mo103435a()).getQueryParameter("appId");
                C48864a.m192492a(C48866b.f122767p, queryParameter, "");
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (context == null) {
                        context = context;
                    }
                    C48807b.this.mo170541a(queryParameter, new AbstractC48834a() {
                        /* class com.ss.android.lark.openplatform.p2401c.C48807b.AnonymousClass18.C488091 */

                        @Override // com.ss.android.lark.openplatform.openapp.dto.AbstractC48834a
                        /* renamed from: b */
                        public void mo170556b(ErrorResult errorResult) {
                            if (errorResult.getErrorCode() == 11003) {
                                LKUIToast.show(context, (int) R.string.Lark_OpenPlatform_PageUnavailableMsg);
                            } else {
                                LKUIToast.show(context, (int) R.string.Lark_OpenPlatform_ServerErrMsg);
                            }
                        }

                        @Override // com.ss.android.lark.openplatform.openapp.dto.AbstractC48834a
                        /* renamed from: a */
                        public void mo170554a(ErrorResult errorResult) {
                            LKUIToast.show(context, (int) R.string.Lark_OpenPlatform_NetworkErrMsg);
                            C53241h.m205894a("LinkService", " get app ability network err " + errorResult.getDebugMsg());
                        }

                        @Override // com.ss.android.lark.openplatform.openapp.dto.AbstractC48834a
                        /* renamed from: a */
                        public void mo170555a(AppShareInfo appShareInfo) {
                            if (appShareInfo != null) {
                                int i = AnonymousClass11.f122594a[appShareInfo.getAppAbilityType().ordinal()];
                                if (i == 1) {
                                    C48807b.this.f122590a.getGadgetDependency().mo144962a(context, queryParameter, "", C48807b.this.f122590a.getGadgetDependency().mo144959a(appLink.mo103436b()));
                                    C48807b.m192270a(queryParameter, "gadget");
                                    return;
                                } else if (i == 2) {
                                    C48807b.this.mo170543b(context, queryParameter);
                                    C48807b.m192270a(queryParameter, "h5");
                                    return;
                                } else if (i == 3) {
                                    C48807b.this.mo170538a(context, queryParameter);
                                    C48807b.m192270a(queryParameter, "bot");
                                    return;
                                } else if (appShareInfo.canOpenInPC()) {
                                    LKUIToast.show(context, (int) R.string.OpenPlatform_AppCenter_OpenAppOnPC);
                                    return;
                                }
                            }
                            LKUIToast.show(context, (int) R.string.Lark_OpenPlatform_PageUnavailableMsg);
                            C53241h.m205894a("LinkService", " get app ability null ");
                        }
                    });
                    return true;
                }
                C48864a.m192491a(C48866b.f122768q).addCategoryValue("param_name", "appId").flush();
                LKUIToast.show(context, UIHelper.mustacheFormat((int) R.string.Lark_OpenPlatform_ParamMissingMsg, "list", "appId"));
                return true;
            }
        });
    }

    /* renamed from: h */
    public void mo170550h(final Context context, Map<String, AbstractC29186b> map) {
        map.put("/client/bot/open", new AbstractC29186b() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.AnonymousClass19 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(Context context, AppLink appLink) {
                String queryParameter = Uri.parse(appLink.mo103435a()).getQueryParameter("appId");
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (context == null) {
                        context = context;
                    }
                    C48807b.this.mo170538a(context, queryParameter);
                    return true;
                }
                LKUIToast.show(context, UIHelper.mustacheFormat((int) R.string.Lark_OpenPlatform_ParamMissingMsg, "list", "appId"));
                return true;
            }
        });
    }

    /* renamed from: i */
    public void mo170551i(final Context context, Map<String, AbstractC29186b> map) {
        map.put("/client/web_app/open", new AbstractC29186b() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.C488113 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                return !TextUtils.isEmpty(Uri.parse(appLink.mo103435a()).getQueryParameter("appId"));
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(final Context context, AppLink appLink) {
                final String a = appLink.mo103435a();
                C53241h.m205898b("LinkService", "applink handle url: " + a);
                final Uri parse = Uri.parse(a);
                final String queryParameter = parse.getQueryParameter("appId");
                if (TextUtils.isEmpty(queryParameter)) {
                    return true;
                }
                C48804a.m192261a(queryParameter, new C48804a.AbstractC48806a() {
                    /* class com.ss.android.lark.openplatform.p2401c.C48807b.C488113.C488121 */

                    @Override // com.ss.android.lark.openplatform.p2401c.C48804a.AbstractC48806a
                    /* renamed from: a */
                    public void mo170530a(String str) {
                        if (!TextUtils.isEmpty(str)) {
                            Context context = context;
                            if (context == null) {
                                context = context;
                            }
                            C53241h.m205898b("LinkService", "get origin url:" + str);
                            String a = C48807b.this.mo170533a(str, parse);
                            C48807b.this.f122590a.getBrowserDependency().mo144952a(context, a, queryParameter);
                            C53241h.m205898b("LinkService", "getUrlWithQueryParameter:" + a);
                            return;
                        }
                        C53241h.m205898b("LinkService", "get empty url from applink : " + a);
                        LKUIToast.show(context, (int) R.string.OpenPlatform_VisitApp_UnavailableMsg);
                    }
                });
                return true;
            }
        });
    }

    /* renamed from: j */
    public void mo170552j(Context context, Map<String, AbstractC29186b> map) {
        map.put("/client/block/open", new AbstractC29186b() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.C488188 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(Context context, AppLink appLink) {
                Uri.Builder buildUpon = Uri.parse("sslocal://card").buildUpon();
                Uri parse = Uri.parse(appLink.mo103435a());
                for (String str : new HashSet(parse.getQueryParameterNames())) {
                    buildUpon.appendQueryParameter(str, parse.getQueryParameter(str));
                }
                if (!C27548m.m100547m().mo98225i().mo98187a("lark.appcenter.block.display")) {
                    ToastManager.showToast(context, context.getText(R.string.OpenPlatform_WorkplaceBlock_FeatureUnavailable), 0);
                    return true;
                }
                C27566d.m100600b(context, buildUpon.build().toString());
                return true;
            }
        });
    }

    /* renamed from: k */
    public void mo170553k(final Context context, Map<String, AbstractC29186b> map) {
        map.put("/client/app_apply_visibility/open", new AbstractC29186b() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.AnonymousClass10 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return false;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(Context context, AppLink appLink) {
                String a = appLink.mo103435a();
                C53241h.m205898b("addAppVisibleLinkHandler", a);
                Uri parse = Uri.parse(a);
                String queryParameter = parse.getQueryParameter("appId");
                String queryParameter2 = parse.getQueryParameter("app_name");
                if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) {
                    return false;
                }
                LarkExtensionManager.getInstance().getExtension().mo49602a(context, queryParameter, queryParameter2);
                return true;
            }
        });
    }

    /* renamed from: b */
    public void mo170544b(Context context, Map<String, AbstractC29186b> map) {
        map.put("/client/workplace/unsupport", new AbstractC29186b() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.AnonymousClass12 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(Context context, AppLink appLink) {
                LKUIToast.show(context, context.getString(R.string.OpenPlatform_AppCenter_OpenAppOnPC));
                return true;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m192269a(String str, final Context context) {
        Activity lastTopActivity = this.f122590a.getLastTopActivity();
        if (lastTopActivity != null) {
            try {
                LKUIToast.showLoading(lastTopActivity, (int) R.string.OpenPlatform_AppCenter_Loading);
            } catch (IllegalStateException e) {
                C53241h.m205895a("LinkService", "bot applink show loading err ", e);
            }
        }
        this.f122590a.getBotAppStrategyInfo(str, new AbstractC48793a.AbstractC48795b() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.C488134 */

            @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48795b
            /* renamed from: a */
            public void mo170521a(String str) {
                LKUIToast.cancelLoading();
                LKUIToast.show(context, (int) R.string.Lark_OpenPlatform_NetworkErrMsg);
            }

            @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48795b
            /* renamed from: a */
            public void mo170522a(String str, C4145c cVar) {
                LKUIToast.cancelLoading();
                if (cVar != null) {
                    C26171w.m94675a(new Runnable(C48807b.this.f122590a.getLastTopActivity(), cVar, context) {
                        /* class com.ss.android.lark.openplatform.p2401c.$$Lambda$b$4$LOohZF7hMQ3U_hnfbt2tFkB6a0s */
                        public final /* synthetic */ Activity f$1;
                        public final /* synthetic */ C4145c f$2;
                        public final /* synthetic */ Context f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void run() {
                            C48807b.C488134.this.m192332a(this.f$1, this.f$2, this.f$3);
                        }
                    });
                } else if (!TextUtils.isEmpty(str)) {
                    C48807b.this.f122590a.startChatWindowByOpenData(new BotOpenData(str, ID_TYPE.BOT_ID));
                } else {
                    C53241h.m205894a("LinkService", "get bot appstrate  bot id null ");
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m192332a(final Activity activity, C4145c cVar, final Context context) {
                boolean z;
                if (activity == null || cVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" show appstrategy dialog fail activity null ");
                    if (activity == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    C53241h.m205894a("LinkService", sb.toString());
                    return;
                }
                C4153e.m17260a(activity, cVar, new AbstractC4146d() {
                    /* class com.ss.android.lark.openplatform.p2401c.C48807b.C488134.C488141 */

                    @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
                    /* renamed from: c */
                    public void mo16249c(String str, String str2) {
                        C48807b.this.f122590a.openApplyVisibleActivity(activity, str, str2);
                    }

                    @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
                    /* renamed from: a */
                    public void mo16245a(String str, String str2) {
                        C53241h.m205898b("LinkService", " click app strategy admin, appid " + str);
                    }

                    @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
                    /* renamed from: b */
                    public void mo16247b(String str, String str2) {
                        C53241h.m205898b("LinkService", " click app strategy cancel, appid " + str);
                    }

                    @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
                    /* renamed from: a */
                    public void mo16246a(String str, String str2, String str3) {
                        C48807b.this.f122590a.getBrowserDependency().mo144951a(context, str3);
                    }

                    @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
                    /* renamed from: b */
                    public void mo16248b(String str, String str2, String str3) {
                        C48807b.this.f122590a.startChatActivityByChatterId(context, str3);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static void m192270a(String str, String str2) {
        C48864a.m192491a(C48866b.f122769r).addCategoryValue("app_id", str).addCategoryValue("ability_type", str2).flush();
    }

    /* renamed from: a */
    private void m192267a(final Context context, final String str, final int i) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.openplatform.p2401c.C48807b.RunnableC488166 */

            public void run() {
                String str;
                HashMap hashMap = new HashMap();
                hashMap.put("X-Session-ID", C48807b.this.f122590a.getSession());
                hashMap.put("Content-Type", "application/json");
                JSONObject jSONObject = new JSONObject();
                String[] a = C48824b.m192364a(context);
                String str2 = a[0];
                String str3 = a[1];
                String str4 = a[2];
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        if (i == 2) {
                            str = "open_id";
                        } else {
                            str = "open_chat_id";
                        }
                        jSONObject.put(str, str);
                        jSONObject.put("ttcode", str2);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    try {
                        C48807b.this.mo170535a(context, i, C48829f.m192394a(C48807b.this.f122590a.getOkHttpClient(), C48807b.this.mo170532a(i), hashMap, jSONObject, 10000), str3, str4, str);
                    } catch (IOException e2) {
                        C48807b.this.mo170534a(i, (JSONObject) null, false);
                        e2.printStackTrace();
                    } catch (JSONException e3) {
                        C48807b.this.mo170534a(i, (JSONObject) null, false);
                        e3.printStackTrace();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private void m192268a(Context context, String str, String str2) {
        int a = m192265a(str2);
        if (C26252ad.m94993b(context)) {
            this.f122590a.startChatWindowActivityByChatIdAndPos(context, str, a);
            return;
        }
        OpenPlatformIpc openPlatformIpc = (OpenPlatformIpc) C68183b.m264839a().mo237086a(context, OpenPlatformIpc.class);
        if (openPlatformIpc != null) {
            openPlatformIpc.startChatWindowActivityByChatIdAndPos(str, a);
        } else {
            C53241h.m205894a("LinkService", "OpenPlatformIpc is null");
        }
    }
}
