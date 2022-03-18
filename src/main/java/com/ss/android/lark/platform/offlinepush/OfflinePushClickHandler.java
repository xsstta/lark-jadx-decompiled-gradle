package com.ss.android.lark.platform.offlinepush;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.offline.C48544a;
import com.ss.android.lark.utils.LarkContext;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

public class OfflinePushClickHandler {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Direct {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NoticeType {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m201277a(Bundle bundle) {
        bundle.putBoolean("key_param_from_offline_push", true);
        bundle.putBoolean("switch_to_inbox", true);
        bundle.putInt("open_fragment_id", 4098);
    }

    /* renamed from: a */
    private static String m201274a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("belong_to", 1);
            String string = jSONObject.getString("biz");
            String string2 = jSONObject.getString("channel");
            if ("calendar".equals(string)) {
                return "calendar";
            }
            if (optInt == 2) {
                return "mail";
            }
            if ("docs".equals(string)) {
                return "doc";
            }
            if ("openapp_chat".equals(string)) {
                return "open_app_chat";
            }
            if ("thread".equals(string2)) {
                return "thread";
            }
            if ("todo".equals(string)) {
                return "todo";
            }
            return "chat";
        } catch (JSONException e) {
            Log.m165383e("OfflinePushClickHandler", "getNoticeType: jsonStr = " + str + " exception = " + e);
            return "chat";
        }
    }

    /* renamed from: c */
    private static void m201280c(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String l = Long.toString(jSONObject.optLong("chat_id", -1));
            String l2 = Long.toString(jSONObject.optLong("message_id", -1));
            String l3 = Long.toString(jSONObject.optLong("thread_id", 0));
            int optInt = jSONObject.optInt("position", -1);
            ChatBundle.C29590a a = ChatBundle.m109259a();
            if (!"-1".equals(l)) {
                a.mo105927a(l);
            }
            if (!"-1".equals(l2)) {
                a.mo105937e(l2);
            }
            C36149a.m142162a().mo157098b().mo105707b(context, "switch_to_inbox", a.mo105932b(true).mo105933c("notification").mo105929a().mo105916a(new ChatBundle.AbstractC29591b(l3, optInt) {
                /* class com.ss.android.lark.platform.offlinepush.$$Lambda$OfflinePushClickHandler$aSGY2nAzjekmNnqSK6PKrUBFr8 */
                public final /* synthetic */ String f$0;
                public final /* synthetic */ int f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.biz.im.api.ChatBundle.AbstractC29591b
                public final void inject(Bundle bundle) {
                    OfflinePushClickHandler.m201278a(this.f$0, this.f$1, bundle);
                }
            }));
            Log.m165389i("OfflinePushClickHandler", "receive offline notice parse Thread messageId: " + l2 + " threadId: " + l3);
        } catch (JSONException e) {
            Log.m165383e("OfflinePushClickHandler", "notification click catch = " + e);
        }
    }

    /* renamed from: a */
    public static void m201276a(Context context, String str) {
        String a = m201274a(str);
        Log.m165389i("OfflinePushClickHandler", "notification click parse type: " + a);
        a.hashCode();
        char c = 65535;
        switch (a.hashCode()) {
            case -917865205:
                if (a.equals("open_app_chat")) {
                    c = 0;
                    break;
                }
                break;
            case -874443254:
                if (a.equals("thread")) {
                    c = 1;
                    break;
                }
                break;
            case -178324674:
                if (a.equals("calendar")) {
                    c = 2;
                    break;
                }
                break;
            case 99640:
                if (a.equals("doc")) {
                    c = 3;
                    break;
                }
                break;
            case 3052376:
                if (a.equals("chat")) {
                    c = 4;
                    break;
                }
                break;
            case 3343799:
                if (a.equals("mail")) {
                    c = 5;
                    break;
                }
                break;
            case 3565638:
                if (a.equals("todo")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C36083a.m141486a().getOpenPlatformDependency().mo133033b(context, str);
                return;
            case 1:
                m201280c(context, str);
                return;
            case 2:
                C36083a.m141486a().getCalendarDependency().mo132735a(context, str);
                return;
            case 3:
                C36083a.m141486a().getCCMDependency().mo132703a(context, str);
                return;
            case 4:
                m201279b(context, str);
                return;
            case 5:
                C36083a.m141486a().getMailDependency().mo132968a(context, str);
                return;
            case 6:
                C36083a.m141486a().getTodoDependency().mo133125a(context, str);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private static void m201279b(final Context context, final String str) {
        RunnableC518921 r1;
        ExecutorService executorService;
        ChatBundle chatBundle;
        final Intent intent = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String l = Long.toString(jSONObject.optLong("chat_id", -1));
            int optInt = jSONObject.optInt("direct");
            String optString = jSONObject.optString("user_id");
            if (optInt == 2) {
                chatBundle = ChatBundle.m109259a().mo105927a(l).mo105929a();
            } else if (optInt == 3) {
                chatBundle = ChatBundle.m109259a().mo105927a(l).mo105932b(true).mo105920a(jSONObject.getInt("position")).mo105929a();
            } else {
                chatBundle = null;
            }
            if (chatBundle != null) {
                Bundle a = chatBundle.mo105916a($$Lambda$OfflinePushClickHandler$A0tfzhX7_5FOZOoNAPdMRysKZTQ.INSTANCE);
                a.putString("user_id", optString);
                intent = C36149a.m142162a().mo157098b().mo105696a(LarkContext.getApplication(), a, 335544320);
            }
            Log.m165389i("OfflinePushClickHandler", "receive offline notice parse Chat messageId: " + Long.toString(jSONObject.optLong("message_id", -1)));
            if (intent == null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("switch_to_inbox", true);
                intent = C36149a.m142162a().mo157098b().mo105698a(LarkContext.getApplication(), C36083a.m141486a().getIMDependency().mo132944i(), bundle);
            }
            intent.putExtra("gochatwin_from", "notification");
            executorService = CoreThreadPool.getDefault().getCachedThreadPool();
            r1 = new Runnable() {
                /* class com.ss.android.lark.platform.offlinepush.OfflinePushClickHandler.RunnableC518921 */

                public void run() {
                    OfflinePushClickHandler.m201275a(context, intent, str);
                }
            };
        } catch (JSONException e) {
            Log.m165383e("OfflinePushClickHandler", "notification click catch = " + e);
            if (0 == 0) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("switch_to_inbox", true);
                intent = C36149a.m142162a().mo157098b().mo105698a(LarkContext.getApplication(), C36083a.m141486a().getIMDependency().mo132944i(), bundle2);
            }
            intent.putExtra("gochatwin_from", "notification");
            executorService = CoreThreadPool.getDefault().getCachedThreadPool();
            r1 = new Runnable() {
                /* class com.ss.android.lark.platform.offlinepush.OfflinePushClickHandler.RunnableC518921 */

                public void run() {
                    OfflinePushClickHandler.m201275a(context, intent, str);
                }
            };
        } catch (Throwable th) {
            if (0 == 0) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("switch_to_inbox", true);
                intent = C36149a.m142162a().mo157098b().mo105698a(LarkContext.getApplication(), C36083a.m141486a().getIMDependency().mo132944i(), bundle3);
            }
            intent.putExtra("gochatwin_from", "notification");
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.platform.offlinepush.OfflinePushClickHandler.RunnableC518921 */

                public void run() {
                    OfflinePushClickHandler.m201275a(context, intent, str);
                }
            });
            throw th;
        }
        executorService.execute(r1);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m201278a(String str, int i, Bundle bundle) {
        bundle.putBoolean("switch_to_inbox", true);
        bundle.putString("key_thread_id", str);
        bundle.putInt("key_message_position", i);
        if (i == -1) {
            bundle.putInt("open_fragment_id", 4098);
        } else {
            bundle.putInt("open_fragment_id", 4100);
        }
    }

    /* renamed from: a */
    public static void m201275a(final Context context, final Intent intent, String str) {
        boolean a = C37239a.m146648b().mo136951a("lark.switch.tenant.offline.enable");
        Log.m165388i("isSwitchTenantOfflineEnable = " + a);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (!a) {
            context.startActivity(intent);
            return;
        }
        String str2 = null;
        try {
            str2 = new JSONObject(str).optString("user_id");
        } catch (Exception e) {
            Log.m165383e("OfflinePushClickHandler", e.getMessage());
        }
        if (C48544a.m191373a(str2)) {
            C36083a.m141486a().getPassportDependency().mo133070a(str2, new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.platform.offlinepush.OfflinePushClickHandler.C518932 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    context.startActivity(intent);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    context.startActivity(intent);
                }
            });
        } else {
            context.startActivity(intent);
        }
    }
}
