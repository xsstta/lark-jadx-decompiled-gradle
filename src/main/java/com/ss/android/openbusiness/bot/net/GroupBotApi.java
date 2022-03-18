package com.ss.android.openbusiness.bot.net;

import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.log.Log;
import com.ss.android.openbusiness.AbstractC59446a;
import com.ss.android.openbusiness.C59480b;
import com.ss.android.openbusiness.bot.net.IBotDataService;
import com.ss.android.openbusiness.bot.net.data.C59537a;
import com.ss.android.openbusiness.p3007d.C59558d;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/openbusiness/bot/net/GroupBotApi;", "", "()V", "CommonCallback", "Companion", "GroupBotDataService", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.openbusiness.bot.net.a */
public final class GroupBotApi {

    /* renamed from: a */
    public static final Lazy f147778a = LazyKt.lazy(C59534c.INSTANCE);

    /* renamed from: b */
    public static final Companion f147779b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/openbusiness/bot/net/GroupBotApi$Companion;", "", "()V", "GET_BOTS", "", "GET_REC_BOTS", "HOST", "getHOST", "()Ljava/lang/String;", "HOST$delegate", "Lkotlin/Lazy;", "KEY_CHAT_ID", "KEY_QUERY", "SEARCH_BOTS", "TAG", "getDataService", "Lcom/ss/android/openbusiness/bot/net/IBotDataService;", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.net.a$b */
    public static final class Companion {
        /* renamed from: a */
        public final String mo202882a() {
            Lazy lazy = GroupBotApi.f147778a;
            Companion bVar = GroupBotApi.f147779b;
            return (String) lazy.getValue();
        }

        private Companion() {
        }

        /* renamed from: b */
        public final IBotDataService mo202883b() {
            return new GroupBotDataService();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.net.a$c */
    static final class C59534c extends Lambda implements Function0<String> {
        public static final C59534c INSTANCE = new C59534c();

        C59534c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "https://" + C59480b.m230865a().mo144868a(DomainSettings.Alias.OPEN_APP_INTERFACE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002J \u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/openbusiness/bot/net/GroupBotApi$GroupBotDataService;", "Lcom/ss/android/openbusiness/bot/net/IBotDataService;", "Lcom/ss/android/openbusiness/net/Service;", "()V", "getAddedBotList", "", "chatId", "", "callResult", "Lcom/ss/android/openbusiness/bot/net/IBotDataService$CallResult;", "getCanAddBotList", "getCommonParams", "Lcom/google/gson/JsonObject;", "searchBot", SearchIntents.EXTRA_QUERY, "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.net.a$d */
    public static final class GroupBotDataService extends C59558d implements IBotDataService {
        /* renamed from: a */
        private final JsonObject m230981a() {
            JsonObject jsonObject = new JsonObject();
            AbstractC59446a a = C59480b.m230865a();
            Intrinsics.checkExpressionValueIsNotNull(a, "OpbDependency.getDependency()");
            String b = a.mo144875b();
            if (b == null) {
                b = "en_us";
            }
            jsonObject.addProperty("locale", b);
            AbstractC59446a a2 = C59480b.m230865a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "OpbDependency.getDependency()");
            jsonObject.addProperty("larkVersion", C26246a.m94977a(a2.mo144878d()));
            return jsonObject;
        }

        @Override // com.ss.android.openbusiness.bot.net.IBotDataService
        /* renamed from: a */
        public void mo202884a(String str, IBotDataService.CallResult aVar) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(aVar, "callResult");
            JsonObject a = m230981a();
            a.addProperty("chat_id", str);
            String str2 = GroupBotApi.f147779b.mo202882a() + "/lark/bot/api/pull_chat_bots";
            C59558d.m231057a(C59558d.m231059c().mo55528a(str2).mo55533c(a.toString()), str2, new CommonCallback(aVar));
        }

        @Override // com.ss.android.openbusiness.bot.net.IBotDataService
        /* renamed from: b */
        public void mo202886b(String str, IBotDataService.CallResult aVar) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(aVar, "callResult");
            JsonObject a = m230981a();
            a.addProperty("chat_id", str);
            String str2 = GroupBotApi.f147779b.mo202882a() + "/lark/bot/api/pull_chat_candidate_bots";
            C59558d.m231057a(C59558d.m231059c().mo55528a(str2).mo55533c(a.toString()), str2, new CommonCallback(aVar));
        }

        @Override // com.ss.android.openbusiness.bot.net.IBotDataService
        /* renamed from: a */
        public void mo202885a(String str, String str2, IBotDataService.CallResult aVar) {
            Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
            Intrinsics.checkParameterIsNotNull(str2, "chatId");
            Intrinsics.checkParameterIsNotNull(aVar, "callResult");
            JsonObject a = m230981a();
            a.addProperty("chat_id", str2);
            a.addProperty(SearchIntents.EXTRA_QUERY, str);
            String str3 = GroupBotApi.f147779b.mo202882a() + "/lark/bot/api/search_v2";
            C59558d.m231057a(C59558d.m231059c().mo55528a(str3).mo55533c(a.toString()), str3, new CommonCallback(aVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/ss/android/openbusiness/bot/net/GroupBotApi$CommonCallback;", "Lcom/ss/android/openbusiness/net/Service$ICallback;", "callback", "Lcom/ss/android/openbusiness/bot/net/IBotDataService$CallResult;", "(Lcom/ss/android/openbusiness/bot/net/IBotDataService$CallResult;)V", "getCallback", "()Lcom/ss/android/openbusiness/bot/net/IBotDataService$CallResult;", "setCallback", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "requestContext", "Lcom/ss/android/openbusiness/net/Service$RequestContext;", "onSuccess", "response", "Lcom/bytedance/lark/pb/basic/v1/SendHttpResponse;", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.net.a$a */
    public static final class CommonCallback implements C59558d.AbstractC59560a {

        /* renamed from: a */
        private IBotDataService.CallResult f147780a;

        public CommonCallback(IBotDataService.CallResult aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            this.f147780a = aVar;
        }

        @Override // com.ss.android.openbusiness.p3007d.C59558d.AbstractC59560a
        /* renamed from: a */
        public void mo202859a(ErrorResult errorResult, C59558d.C59561b bVar) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Intrinsics.checkParameterIsNotNull(bVar, "requestContext");
            Log.m165383e("GroupBotApi", "request error, " + errorResult.getDebugMsg() + " requestId: " + bVar.f147844b);
            IBotDataService.CallResult aVar = this.f147780a;
            String debugMsg = errorResult.getDebugMsg();
            if (debugMsg == null) {
                debugMsg = "network error";
            }
            aVar.mo202851a(debugMsg);
        }

        @Override // com.ss.android.openbusiness.p3007d.C59558d.AbstractC59560a
        /* renamed from: a */
        public void mo202858a(SendHttpResponse sendHttpResponse, C59558d.C59561b bVar) {
            Intrinsics.checkParameterIsNotNull(sendHttpResponse, "response");
            Intrinsics.checkParameterIsNotNull(bVar, "requestContext");
            try {
                C59537a aVar = (C59537a) new Gson().fromJson(sendHttpResponse.json_body, C59537a.class);
                Intrinsics.checkExpressionValueIsNotNull(aVar, "bot");
                Integer a = aVar.mo202919a();
                if (a != null) {
                    if (a.intValue() == 0) {
                        this.f147780a.mo202850a(aVar);
                        return;
                    }
                }
                Log.m165383e("GroupBotApi", "request bot fail: " + aVar.mo202920b());
                IBotDataService.CallResult aVar2 = this.f147780a;
                String b = aVar.mo202920b();
                Intrinsics.checkExpressionValueIsNotNull(b, "bot.message");
                aVar2.mo202851a(b);
            } catch (Exception e) {
                Log.m165383e("GroupBotApi", "json error: " + sendHttpResponse.json_body);
                this.f147780a.mo202851a(e.toString());
            }
        }
    }
}
