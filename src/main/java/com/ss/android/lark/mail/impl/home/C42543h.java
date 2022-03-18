package com.ss.android.lark.mail.impl.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.lark.pb.basic.v1.Notice;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.recall.p2209a.C42981a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.mail.impl.home.h */
public class C42543h {

    /* renamed from: a */
    private final ArrayList<String> f108308a;

    /* renamed from: b */
    private final ArrayList<String> f108309b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.home.h$a */
    public static class C42550a {

        /* renamed from: a */
        public static final C42543h f108333a = new C42543h();
    }

    /* renamed from: a */
    public static C42543h m169819a() {
        return C42550a.f108333a;
    }

    private C42543h() {
        this.f108308a = new ArrayList<>();
        this.f108309b = new ArrayList<>();
    }

    /* renamed from: a */
    public void mo153017a(Context context, Intent intent) {
        Bundle bundle;
        if (intent == null) {
            bundle = null;
        } else {
            bundle = intent.getExtras();
        }
        if (bundle != null) {
            if (!TextUtils.isEmpty(bundle.getString("mail_jump_target"))) {
                mo153019c(context, intent);
            } else {
                mo153018b(context, intent);
            }
        }
    }

    /* renamed from: b */
    public void mo153018b(final Context context, final Intent intent) {
        Bundle bundle;
        final String str;
        Log.m165389i("MailIntentProcessor", "handleGotoMessageIntent start");
        if (intent == null) {
            bundle = null;
        } else {
            bundle = intent.getExtras();
        }
        if (bundle == null) {
            Log.m165389i("MailIntentProcessor", "handleGoToMessageIntent, ignore null intent or bundle");
            return;
        }
        String string = bundle.getString("mail_account_id");
        final String string2 = bundle.getString("mail_message_id");
        final String string3 = bundle.getString("mail_label_id");
        Boolean b = C43350d.m172098a().mo155055u().mo5927b();
        final long currentTimeMillis = System.currentTimeMillis();
        if (b == null) {
            Log.m165389i("MailIntentProcessor", "handleGoToMessageIntent, wait for setting");
            C43350d.m172098a().mo155055u().mo5925a(new AbstractC1178x<Boolean>() {
                /* class com.ss.android.lark.mail.impl.home.C42543h.C425441 */

                /* renamed from: a */
                public void onChanged(Boolean bool) {
                    C43350d.m172098a().mo155055u().mo5928b(this);
                    if (System.currentTimeMillis() - currentTimeMillis > 10000) {
                        Log.m165389i("MailIntentProcessor", "handleGoToMessageIntent, ignore when timeout");
                        return;
                    }
                    Log.m165389i("MailIntentProcessor", "handleGoToMessageIntent, handle with setting");
                    C42543h.this.mo153018b(context, intent);
                }
            });
            return;
        }
        if (b.booleanValue() || TextUtils.isEmpty(string2)) {
            str = bundle.getString("mail_thread_id");
        } else {
            str = string2;
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(string3)) {
            Log.m165389i("MailIntentProcessor", "handleGoToMessageIntent tid:" + str + " mid:" + string2 + " label id:" + string3 + " accountId:" + string);
            intent.removeExtra("mail_account_id");
            final RunnableC425452 r0 = new Runnable() {
                /* class com.ss.android.lark.mail.impl.home.C42543h.RunnableC425452 */

                public void run() {
                    Log.m165389i("MailIntentProcessor", "handleGoToMessageIntent, jump");
                    C42699a.m170237a(context, str, string2, string3, true);
                }
            };
            C42699a.m170255a(string, new IGetDataCallback<String>() {
                /* class com.ss.android.lark.mail.impl.home.C42543h.C425463 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("MailIntentProcessor", "handleGoToMessageIntent, switch account error");
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    Log.m165389i("MailIntentProcessor", "handleGoToMessageIntent, switch account success");
                    r0.run();
                }
            });
        }
    }

    /* renamed from: c */
    public void mo153019c(final Context context, final Intent intent) {
        final String str;
        Log.m165389i("MailIntentProcessor", "handleNotifyIntent");
        if (intent == null) {
            Log.m165389i("MailIntentProcessor", "handleNotifyIntent intent null return");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Log.m165389i("MailIntentProcessor", "handleNotifyIntent bundle null return");
            return;
        }
        String string = extras.getString("mail_jump_target");
        Log.m165389i("MailIntentProcessor", "handleNotifyIntent jumpTarget:" + string);
        if (!TextUtils.isEmpty(string) && "MessageList".equals(string)) {
            final String string2 = extras.getString("mail_message_id");
            final String string3 = extras.getString("mail_label_id");
            final int i = extras.getInt("mail_jump_state", 0);
            String string4 = extras.getString("mail_account_id");
            if (!C42871i.m170783d()) {
                Boolean b = C43350d.m172098a().mo155055u().mo5927b();
                final long currentTimeMillis = System.currentTimeMillis();
                if (b == null) {
                    Log.m165389i("MailIntentProcessor", "handleNotifyIntent, wait for setting");
                    C43350d.m172098a().mo155055u().mo5925a(new AbstractC1178x<Boolean>() {
                        /* class com.ss.android.lark.mail.impl.home.C42543h.C425474 */

                        /* renamed from: a */
                        public void onChanged(Boolean bool) {
                            if (System.currentTimeMillis() - currentTimeMillis > 10000) {
                                Log.m165389i("MailIntentProcessor", "handleNotifyIntent, ignore when timeout");
                                return;
                            }
                            Log.m165389i("MailIntentProcessor", "handleNotifyIntent, handle with setting");
                            C43350d.m172098a().mo155055u().mo5928b(this);
                            C42543h.this.mo153019c(context, intent);
                        }
                    });
                    return;
                }
                if (b.booleanValue() || TextUtils.isEmpty(string2)) {
                    str = extras.getString("mail_thread_id");
                } else {
                    str = string2;
                }
                Log.m165389i("MailIntentProcessor", "handleNotifyIntent tid:" + str + " mid:" + string2 + " label id:" + string3 + " state:" + i + " accountId:" + string4);
                if (!this.f108308a.contains(string2)) {
                    Log.m165389i("MailIntentProcessor", "handle first time");
                    this.f108308a.add(string2);
                    String n = C43277a.m171921a().mo154950n();
                    final RunnableC425485 r10 = new Runnable() {
                        /* class com.ss.android.lark.mail.impl.home.C42543h.RunnableC425485 */

                        public void run() {
                            if (i == Notice.State.RECALL.getValue()) {
                                Log.m165389i("MailIntentProcessor", "handleNotifyIntent, show recall tips");
                                C42981a.m171084a().mo154135a(context, 1, null);
                                C42209j.m168613a("has_been_recall", "alert", "notification");
                                return;
                            }
                            Log.m165389i("MailIntentProcessor", "handleNotifyIntent, jump");
                            C42699a.m170237a(context, str, string2, string3, false);
                        }
                    };
                    if (TextUtils.isEmpty(string4) || TextUtils.equals(string4, n)) {
                        r10.run();
                        return;
                    }
                    Log.m165389i("MailIntentProcessor", "handleNotifyIntent , switch account");
                    C43277a.m171921a().mo154931a(string4, new IGetDataCallback<C42088b>() {
                        /* class com.ss.android.lark.mail.impl.home.C42543h.C425496 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165389i("MailIntentProcessor", "handleNotifyIntent, switch account error");
                        }

                        /* renamed from: a */
                        public void onSuccess(C42088b bVar) {
                            Log.m165389i("MailIntentProcessor", "handleNotifyIntent, switch account success");
                            r10.run();
                        }
                    });
                }
            } else if (!this.f108308a.contains(string2)) {
                String string5 = extras.getString("mail_thread_id");
                this.f108308a.add(string2);
                C42871i.f109173e = string4;
                C42871i.f109174f = true;
                C42699a.m170237a(context, string5, string2, string3, false);
            }
        }
    }
}
