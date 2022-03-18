package com.ss.android.lark.message.card;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.lark.pb.basic.v1.CardMessageActionResult;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.bytedance.lark.pb.openplatform.v1.GetUuidRequest;
import com.bytedance.lark.pb.openplatform.v1.GetUuidResponse;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.CardAction;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.message.card.C45278a;
import com.ss.android.lark.message.card.p2263c.C45295a;
import com.ss.android.lark.message.card.p2264d.C45302a;
import com.ss.android.lark.message.card.p2264d.C45304b;
import com.ss.android.lark.message.card.p2266f.C45309a;
import com.ss.android.lark.message.card.view.richtext.C45375h;
import com.ss.android.lark.message.service.dto.C45381b;
import com.ss.android.lark.message.service.dto.CardActionMethodType;
import com.ss.android.lark.message.service.dto.CardActionUrl;
import com.ss.android.lark.message.service.p2268a.C45377b;
import com.ss.android.lark.message.vote.statistics.CardHitPoint;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.widget.dialog.loadingdialog.RequestLoadingDialog;
import com.ss.android.lark.widget.richtext.RichText;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.message.card.a */
public class C45278a {

    /* renamed from: a */
    public final HashSet<String> f114626a = new HashSet<>();

    /* renamed from: b */
    public WeakReference<Context> f114627b;

    /* renamed from: c */
    public final C45295a f114628c = new C45295a();

    /* renamed from: d */
    public Map<String, CardAction> f114629d = new HashMap();

    /* renamed from: e */
    private final HashMap<String, C45284a> f114630e = new HashMap<>();

    /* renamed from: f */
    private final Handler f114631f = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.lark.message.card.a$a */
    public static class C45284a {

        /* renamed from: a */
        private RequestLoadingDialog f114639a;

        /* renamed from: b */
        private long f114640b;

        /* renamed from: c */
        private RichTextElement.ButtonProperty f114641c;

        private C45284a() {
        }

        /* renamed from: a */
        public void mo159987a(Context context, CardMessageActionResult cardMessageActionResult) {
            this.f114640b = System.currentTimeMillis();
            if (cardMessageActionResult.button != null) {
                this.f114641c = cardMessageActionResult.button;
            }
            if (cardMessageActionResult.card_version.intValue() == 1) {
                this.f114639a = new RequestLoadingDialog(context);
                String str = null;
                if (!(cardMessageActionResult.button == null || cardMessageActionResult.button.loading == null)) {
                    str = cardMessageActionResult.button.loading.begin;
                }
                if (TextUtils.isEmpty(str)) {
                    str = context.getString(R.string.Lark_Legacy_MessageCardActionReplyingMobile);
                }
                this.f114639a.mo197803a(str);
            }
        }

        /* renamed from: b */
        private void m179809b(Context context, CardMessageActionResult cardMessageActionResult, boolean z) {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (z) {
                    str = "success";
                } else {
                    str = "fail";
                }
                jSONObject.put("state", str);
                jSONObject.put("network", NetworkUtils.getNetworkAccessType(context));
                if (!z) {
                    jSONObject.put("errorMsg", cardMessageActionResult.error_msg);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", System.currentTimeMillis() - this.f114640b);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("messageId", cardMessageActionResult.message_id);
                if (cardMessageActionResult.button != null) {
                    jSONObject3.put("actionId", cardMessageActionResult.button.action_id);
                }
                MonitorUtils.monitorEvent("op_messagecard_request_action", jSONObject, jSONObject2, jSONObject3);
            } catch (Exception e) {
                Log.m165384e("CardMessageActionHandler", e.getMessage(), e);
            }
        }

        /* renamed from: a */
        public void mo159988a(Context context, CardMessageActionResult cardMessageActionResult, boolean z) {
            String str = null;
            if (!z) {
                if (this.f114639a == null) {
                    this.f114639a = new RequestLoadingDialog(context);
                }
                RichTextElement.ButtonProperty buttonProperty = this.f114641c;
                if (!(buttonProperty == null || buttonProperty.loading == null)) {
                    str = this.f114641c.loading.fail;
                }
                if (cardMessageActionResult.error_code.intValue() == 1) {
                    if (TextUtils.isEmpty(str)) {
                        str = context.getString(R.string.Lark_Legacy_MsgCardNoNetwork);
                    }
                } else if (cardMessageActionResult.error_code.intValue() == 100) {
                    if (!TextUtils.isEmpty(cardMessageActionResult.error_msg)) {
                        str = cardMessageActionResult.error_msg;
                    } else {
                        str = context.getString(R.string.Lark_Legacy_MsgCardFail);
                    }
                } else if (TextUtils.isEmpty(str)) {
                    str = context.getString(R.string.Lark_Legacy_MsgCardFail);
                }
                this.f114639a.mo197802a(cardMessageActionResult.error_code.intValue(), true, str, true);
            } else if (cardMessageActionResult.card_version.intValue() == 1 && this.f114639a != null) {
                RichTextElement.ButtonProperty buttonProperty2 = this.f114641c;
                if (!(buttonProperty2 == null || buttonProperty2.loading == null)) {
                    str = this.f114641c.loading.success;
                }
                if (TextUtils.isEmpty(str)) {
                    str = context.getString(R.string.Lark_Legacy_MessageCardActionResponseSuccessed);
                }
                this.f114639a.mo197804b(str);
            }
            m179809b(context, cardMessageActionResult, z);
        }
    }

    /* renamed from: com.ss.android.lark.message.card.a$b */
    public class C45285b {

        /* renamed from: a */
        String f114642a;

        /* renamed from: b */
        String f114643b;

        /* renamed from: c */
        Boolean f114644c;

        /* renamed from: d */
        Boolean f114645d;

        /* renamed from: e */
        RichText f114646e;

        /* renamed from: f */
        int f114647f;

        /* renamed from: g */
        Map<String, String> f114648g;

        /* renamed from: a */
        public String mo159989a() {
            String str = this.f114642a;
            if (str == null) {
                return "";
            }
            return str;
        }

        /* renamed from: b */
        public String mo159990b() {
            String str = this.f114643b;
            if (str == null) {
                return "";
            }
            return str;
        }

        /* renamed from: c */
        public boolean mo159991c() {
            return this.f114645d.booleanValue();
        }

        /* renamed from: d */
        public Map<String, String> mo159992d() {
            Map<String, String> map = this.f114648g;
            if (map == null) {
                return new HashMap();
            }
            return map;
        }

        public C45285b(String str, String str2, Boolean bool, Boolean bool2, RichText richText, int i, Map<String, String> map) {
            C45278a.this = r1;
            this.f114642a = str;
            this.f114643b = str2;
            this.f114644c = bool;
            this.f114645d = bool2;
            this.f114646e = richText;
            this.f114647f = i;
            this.f114648g = map;
        }
    }

    /* renamed from: com.ss.android.lark.message.card.a$c */
    public static class C45286c {

        /* renamed from: a */
        private final WeakReference<C45278a> f114650a;

        /* renamed from: a */
        public void mo159993a() {
            Log.m165379d("RichTextActionStatusPush", "RichTextActionStatusPush, registerPush...");
            C53248k.m205912a().mo181697a(Command.PUSH_CARD_MESSAGE_ID, new C53248k.AbstractC53250a() {
                /* class com.ss.android.lark.message.card.$$Lambda$a$c$o7VAN21ckoAsjMh3fjmQwod4dcU */

                @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                    C45278a.C45286c.lambda$o7VAN21ckoAsjMh3fjmQwod4dcU(C45278a.C45286c.this, bArr, str, z, z2);
                }
            });
        }

        public C45286c(C45278a aVar) {
            this.f114650a = new WeakReference<>(aVar);
        }

        /* renamed from: a */
        public void m179816b(byte[] bArr, String str, boolean z, boolean z2) {
            try {
                CardMessageActionResult decode = CardMessageActionResult.ADAPTER.decode(bArr);
                C45278a aVar = this.f114650a.get();
                Log.m165379d("RichTextActionStatusPush", "onPushMessage, sid: " + str + ", fromServerPipe: " + z + ", offlinePush: " + z2 + ", result: " + decode + ", manager: " + aVar);
                if (decode == null) {
                    Log.m165383e("RichTextActionStatusPush", "onPush, invalid params, result null");
                } else if (aVar != null) {
                    aVar.mo159980a(decode);
                }
            } catch (Exception e) {
                Log.m165384e(e.getMessage(), e.getMessage(), e);
            }
        }
    }

    /* renamed from: com.ss.android.lark.message.card.a$3 */
    static /* synthetic */ class C452833 {

        /* renamed from: a */
        static final /* synthetic */ int[] f114638a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.lark.pb.basic.v1.CardMessageActionResult$PushType[] r0 = com.bytedance.lark.pb.basic.v1.CardMessageActionResult.PushType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.message.card.C45278a.C452833.f114638a = r0
                com.bytedance.lark.pb.basic.v1.CardMessageActionResult$PushType r1 = com.bytedance.lark.pb.basic.v1.CardMessageActionResult.PushType.PUSH_LOADING_START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.message.card.C45278a.C452833.f114638a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.basic.v1.CardMessageActionResult$PushType r1 = com.bytedance.lark.pb.basic.v1.CardMessageActionResult.PushType.PUSH_LOADING_END_WITH_TOAST_SUCCESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.message.card.C45278a.C452833.f114638a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.basic.v1.CardMessageActionResult$PushType r1 = com.bytedance.lark.pb.basic.v1.CardMessageActionResult.PushType.PUSH_LOADING_END_WITH_TOAST_FAILED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.message.card.C45278a.C452833.<clinit>():void");
        }
    }

    public C45278a() {
        new C45286c(this).mo159993a();
    }

    /* renamed from: a */
    public void mo159981a(Map<String, CardAction> map) {
        this.f114629d = map;
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m179800b(C45285b bVar) {
        this.f114626a.remove(bVar.f114642a);
    }

    /* renamed from: a */
    private void m179799a(final C45285b bVar) {
        C45377b.m180213a().mo160213a(bVar, new UIGetDataCallback<C45381b>() {
            /* class com.ss.android.lark.message.card.C45278a.C452791 */

            /* renamed from: a */
            public void onSuccessed(C45381b bVar) {
                String str;
                String str2;
                String str3;
                C45278a.this.f114626a.remove(bVar.f114642a);
                CardActionUrl a = bVar.mo160222a();
                CardActionMethodType b = bVar.mo160223b();
                if (a == null || b != CardActionMethodType.OPEN_URL) {
                    C45309a.m179927a(bVar.f114642a, "interaction");
                    str2 = "callback";
                    str = "";
                } else {
                    C45309a.m179927a(bVar.f114642a, "open_link");
                    if (TextUtils.isEmpty(a.getAndroid_url())) {
                        str3 = a.getUrl();
                    } else {
                        str3 = a.getAndroid_url();
                    }
                    Context context = C45278a.this.f114627b.get();
                    if (context != null && !C45301d.m179898a(context, str3)) {
                        if (str3.endsWith("client/all_pin/open")) {
                            CardHitPoint.f114954a.mo160243a();
                        }
                        String str4 = (String) SdkSender.syncSend(Command.GET_UUID, new GetUuidRequest.C18669a(), new SdkSender.IParser<String>() {
                            /* class com.ss.android.lark.message.card.C45278a.C452791.C452801 */

                            /* renamed from: a */
                            public String parse(byte[] bArr) {
                                return "c-" + GetUuidResponse.ADAPTER.decode(bArr).uuid;
                            }
                        });
                        String a2 = C45278a.this.f114628c.mo160041a(str3, str4);
                        Log.m165379d("CardMessageActionHandler", "url with trigger code:" + a2);
                        C45278a.this.f114628c.mo160045b(str4, bVar.f114642a);
                        OPMonitor a3 = C45302a.m179899a(C45304b.f114711q);
                        a3.setErrorMessage(C45304b.f114711q.message);
                        a3.flush();
                        C45294c.m179871a().mo143896a(context, a2, false, false, bVar.f114644c);
                        str = str3;
                        str2 = "jump";
                    } else {
                        return;
                    }
                }
                String str5 = bVar.f114642a;
                C45375h.m180205a(str5, str2, str, LKUIDisplayManager.m91870a().getLevel() + "", bVar.f114646e, bVar.f114647f);
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                String str;
                Log.m165382e("onPutActionError, errorResult: " + errorResult + ", msgId: " + bVar.f114642a + ", actionId: " + bVar.f114643b);
                C45278a.this.f114626a.remove(bVar.f114642a);
                OPMonitor addCategoryValue = C45302a.m179899a(C45304b.f114710p).addCategoryValue("CODE", Integer.valueOf(errorResult.getErrorCode()));
                addCategoryValue.setErrorMessage(C45304b.f114710p.message);
                addCategoryValue.flush();
                if (C45278a.this.f114629d == null || bVar.f114643b == null || !C45278a.this.f114629d.containsKey(bVar.f114643b)) {
                    Log.m165383e("CardMessageActionHandler", "fallback action is null or not contains actionId: " + bVar.f114643b);
                    C45309a.m179927a(bVar.f114642a, "interaction");
                    return;
                }
                Log.m165389i("CardMessageActionHandler", "fallback action handle logic");
                CardAction cardAction = C45278a.this.f114629d.get(bVar.f114643b);
                if (cardAction == null) {
                    Log.m165383e("CardMessageActionHandler", "action for actionId: " + bVar.f114643b + " is null");
                    return;
                }
                CardAction.OpenUrl openUrl = cardAction.getOpenUrl();
                if (openUrl == null || cardAction.getMethod() != CardAction.Method.OPEN_URL) {
                    Log.m165389i("CardMessageActionHandler", "some params error, " + openUrl + ", " + cardAction.getMethod());
                    C45309a.m179927a(bVar.f114642a, "interaction");
                    return;
                }
                C45309a.m179927a(bVar.f114642a, "open_link");
                if (TextUtils.isEmpty(openUrl.getAndroidUrl())) {
                    str = openUrl.getUrl();
                } else {
                    str = openUrl.getAndroidUrl();
                }
                Context context = C45278a.this.f114627b.get();
                if (context != null && !C45301d.m179898a(context, str)) {
                    if (str.endsWith("client/all_pin/open")) {
                        CardHitPoint.f114954a.mo160243a();
                    }
                    String str2 = (String) SdkSender.syncSend(Command.GET_UUID, new GetUuidRequest.C18669a(), new SdkSender.IParser<String>() {
                        /* class com.ss.android.lark.message.card.C45278a.C452791.C452812 */

                        /* renamed from: a */
                        public String parse(byte[] bArr) {
                            return "c-" + GetUuidResponse.ADAPTER.decode(bArr).uuid;
                        }
                    });
                    String a = C45278a.this.f114628c.mo160041a(str, str2);
                    Log.m165389i("CardMessageActionHandler", "url with trigger code:" + a);
                    C45278a.this.f114628c.mo160045b(str2, bVar.f114642a);
                    C45302a.m179899a(C45304b.f114711q).setErrorMessage(C45304b.f114711q.message).flush();
                    C45294c.m179871a().mo143896a(context, a, false, false, bVar.f114644c);
                    String str3 = bVar.f114642a;
                    C45375h.m180205a(str3, "jump", a, LKUIDisplayManager.m91870a().getLevel() + "", bVar.f114646e, bVar.f114647f);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo159980a(final CardMessageActionResult cardMessageActionResult) {
        this.f114631f.post(new Runnable() {
            /* class com.ss.android.lark.message.card.C45278a.RunnableC452822 */

            public void run() {
                Context context = C45278a.this.f114627b.get();
                if (context != null) {
                    int i = C452833.f114638a[cardMessageActionResult.type.ordinal()];
                    if (i == 1) {
                        C45278a.this.mo159978a(context, cardMessageActionResult);
                    } else if (i == 2) {
                        C45278a.this.mo159979a(context, cardMessageActionResult, true);
                    } else if (i == 3) {
                        C45278a.this.mo159979a(context, cardMessageActionResult, false);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo159978a(Context context, CardMessageActionResult cardMessageActionResult) {
        String str = cardMessageActionResult.message_id;
        C45284a aVar = this.f114630e.get(str);
        if (aVar == null) {
            aVar = new C45284a();
            this.f114630e.put(str, aVar);
        }
        aVar.mo159987a(context, cardMessageActionResult);
    }

    /* renamed from: a */
    public boolean mo159982a(Context context, C45285b bVar) {
        this.f114627b = new WeakReference<>(context);
        if (!this.f114626a.contains(bVar.f114642a)) {
            this.f114626a.add(bVar.f114642a);
            this.f114631f.postDelayed(new Runnable(bVar) {
                /* class com.ss.android.lark.message.card.$$Lambda$a$n_260sDwAFHYTOhCEtowDS2OYo0 */
                public final /* synthetic */ C45278a.C45285b f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C45278a.lambda$n_260sDwAFHYTOhCEtowDS2OYo0(C45278a.this, this.f$1);
                }
            }, 500);
            m179799a(bVar);
            return true;
        }
        OPMonitor a = C45302a.m179899a(C45304b.f114709o);
        a.setErrorMessage(C45304b.f114709o.message);
        a.flush();
        return false;
    }

    /* renamed from: a */
    public void mo159979a(Context context, CardMessageActionResult cardMessageActionResult, boolean z) {
        this.f114626a.remove(cardMessageActionResult.message_id);
        String str = cardMessageActionResult.message_id;
        C45284a aVar = this.f114630e.get(str);
        if (aVar != null) {
            this.f114630e.remove(str);
            aVar.mo159988a(context, cardMessageActionResult, z);
        }
        if (!z) {
            Log.m165382e("action failed, msgId: " + cardMessageActionResult.message_id + ", err: " + cardMessageActionResult.error_msg);
        }
    }
}
