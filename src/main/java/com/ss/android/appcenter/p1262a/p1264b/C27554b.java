package com.ss.android.appcenter.p1262a.p1264b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.business.activity.appsetting.AppSettingActivity;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.C27724c;
import com.ss.android.appcenter.common.util.C28180d;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28196n;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.appcenter.p1262a.p1264b.C27552a;
import com.ss.android.appcenter.p1262a.p1264b.C27554b;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.appcenter.a.b.b */
public final class C27554b {

    /* renamed from: com.ss.android.appcenter.a.b.b$b */
    public interface AbstractC27562b {
        void onSuccess(C27552a aVar);
    }

    /* renamed from: com.ss.android.appcenter.a.b.b$a */
    public static class C27560a {
        @SerializedName("code")

        /* renamed from: a */
        public int f68777a;
        @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)

        /* renamed from: b */
        public C27561a f68778b;
        @SerializedName("msg")

        /* renamed from: c */
        private String f68779c;

        public String toString() {
            return "BotIdBean{code=" + this.f68777a + ", msg='" + this.f68779c + '\'' + ", data=" + this.f68778b + '}';
        }

        /* renamed from: com.ss.android.appcenter.a.b.b$a$a */
        public static class C27561a {
            @SerializedName("bot_id")

            /* renamed from: a */
            public String f68780a;
            @SerializedName("chat_type")

            /* renamed from: b */
            int f68781b;
            @SerializedName("name")

            /* renamed from: c */
            public String f68782c;
            @SerializedName("avatar_url")

            /* renamed from: d */
            public String f68783d;
            @SerializedName("avatar_key")

            /* renamed from: e */
            public String f68784e;
            @SerializedName("i18n_names")

            /* renamed from: f */
            private JsonObject f68785f;

            public String toString() {
                return "BotIdData{bot_id='" + this.f68780a + '\'' + ", mChatType=" + this.f68781b + ", appName = " + this.f68782c + ", iconUrl = " + this.f68783d + ", iconKey = " + this.f68784e + ", i18nNames = " + this.f68785f + '}';
            }
        }
    }

    /* renamed from: a */
    public static List<C27552a> m100573a(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        if (!(C27548m.m100547m().mo98218b() == null || C27528a.m100471a().mo98143b() == null || context == null)) {
            arrayList.add(new C27552a(context.getString(R.string.AppDetail_H5_About_PageName), 6, false, new C27552a.AbstractC27553a(context, str) {
                /* class com.ss.android.appcenter.p1262a.p1264b.$$Lambda$b$g4RqylgB9bFplnGYnfzyYslargc */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // com.ss.android.appcenter.p1262a.p1264b.C27552a.AbstractC27553a
                public final void onClick(Bundle bundle) {
                    AppSettingActivity.m101030a(this.f$0, this.f$1, true, 0);
                }
            }));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m100575a(final String str, final AbstractC27562b bVar) {
        if (bVar != null && C27528a.m100471a().mo98143b() != null) {
            if (TextUtils.isEmpty(str)) {
                bVar.onSuccess(null);
                return;
            }
            C27563c.m100585a().mo98242b();
            C28196n.m103278b(new C28196n.AbstractC28200a<String>() {
                /* class com.ss.android.appcenter.p1262a.p1264b.C27554b.C275551 */

                /* renamed from: a */
                public String mo98233b() {
                    return null;
                }

                /* renamed from: a */
                public void mo98231a(String str) {
                    C27554b.m100577b(str, bVar);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m100576a(String str, String str2) {
        if (C27548m.m100547m().mo98222f() != null) {
            C27563c.m100585a().mo98241a(true);
            if (C27548m.m100547m().mo98225i().mo98187a("lark.feed.openapp.v2")) {
                C27548m.m100547m().mo98222f().mo98209f(C27528a.m100471a().mo98143b(), str2);
            } else {
                C27548m.m100547m().mo98222f().mo98207d(C27528a.m100471a().mo98143b(), str2);
            }
            C27710b.m101256a(str);
        }
    }

    /* renamed from: b */
    public static void m100577b(final String str, final AbstractC27562b bVar) {
        if (C27548m.m100547m().mo98221e() == null || C27548m.m100547m().mo98218b() == null) {
            bVar.onSuccess(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "session=" + C27548m.m100547m().mo98221e().mo98211a());
        SendHttpRequest.C15253a aVar = new SendHttpRequest.C15253a();
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, aVar.mo55528a(C27724c.m101391j() + "?cli_id=" + str + "&need_chatable=true&need_meta_info=true").mo55526a(SendHttpRequest.Method.GET).mo55529a(hashMap), new IGetDataCallback<C27560a>() {
            /* class com.ss.android.appcenter.p1262a.p1264b.C27554b.C275562 */

            /* renamed from: a */
            public void onSuccess(final C27560a aVar) {
                C28196n.m103274a(new Runnable() {
                    /* class com.ss.android.appcenter.p1262a.p1264b.C27554b.C275562.RunnableC275571 */

                    public void run() {
                        C27560a aVar = aVar;
                        if (aVar == null || aVar.f68778b == null || aVar.f68777a != 0 || C28180d.m103230a() == null) {
                            bVar.onSuccess(null);
                        } else {
                            bVar.onSuccess(new C27552a(C28180d.m103230a().getString(R.string.lark_brand_enter_bot), 5, !C27563c.m100585a().mo98242b(), aVar.f68778b.f68780a, aVar.f68778b.f68782c, aVar.f68778b.f68783d, aVar.f68778b.f68784e, new C27552a.AbstractC27553a(str, aVar) {
                                /* class com.ss.android.appcenter.p1262a.p1264b.$$Lambda$b$2$1$NLhr8QOf2uxWE2OblcYbv5Y3J7I */
                                public final /* synthetic */ String f$0;
                                public final /* synthetic */ C27554b.C27560a f$1;

                                {
                                    this.f$0 = r1;
                                    this.f$1 = r2;
                                }

                                @Override // com.ss.android.appcenter.p1262a.p1264b.C27552a.AbstractC27553a
                                public final void onClick(Bundle bundle) {
                                    C27554b.C275562.RunnableC275571.m100583a(this.f$0, this.f$1, bundle);
                                }
                            }));
                        }
                        C28184h.m103250d("AppInfoDataSource", "path request appbotid data:" + aVar);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m100583a(String str, C27560a aVar, Bundle bundle) {
                        C27554b.m100576a(str, aVar.f68778b.f68780a);
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(final ErrorResult errorResult) {
                C28196n.m103274a(new Runnable() {
                    /* class com.ss.android.appcenter.p1262a.p1264b.C27554b.C275562.RunnableC275582 */

                    public void run() {
                        C28184h.m103248b("AppInfoDataSource", "onError: " + errorResult.getErrorMsg());
                        bVar.onSuccess(null);
                    }
                });
            }
        }, new SdkSender.IParser<C27560a>() {
            /* class com.ss.android.appcenter.p1262a.p1264b.C27554b.C275593 */

            /* renamed from: a */
            public C27560a parse(byte[] bArr) throws IOException {
                try {
                    return (C27560a) new Gson().fromJson(SendHttpResponse.ADAPTER.decode(bArr).json_body, C27560a.class);
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }
}
