package com.bytedance.push.notification;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.push.ThreadPlus;
import com.bytedance.push.C20386c;
import com.bytedance.push.PushBody;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.interfaze.AbstractC20439b;
import com.bytedance.push.interfaze.AbstractC20442e;
import com.bytedance.push.interfaze.AbstractC20454q;
import com.bytedance.push.interfaze.IPushMsgHandler;
import com.bytedance.push.log.ILogger;
import com.bytedance.push.p887h.AbstractC20434a;
import com.bytedance.push.p889j.RunnableC20465e;
import com.bytedance.push.utils.C20552c;
import com.ss.android.message.AppProvider;
import com.ss.android.push.C59957a;
import com.ss.android.ug.bus.C60442b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.notification.i */
public class C20497i implements IPushMsgHandler {

    /* renamed from: a */
    public final AbstractC20442e f50005a;

    /* renamed from: b */
    public final List<Long> f50006b = new ArrayList();

    /* renamed from: c */
    private final C20500j f50007c;

    /* renamed from: d */
    private final AbstractC20454q f50008d;

    /* renamed from: e */
    private final C20484e f50009e;

    /* renamed from: f */
    private final C20386c f50010f;

    /* renamed from: a */
    public static String m74572a() {
        AbstractC20439b bVar = PushSupporter.get().getConfiguration().f49804z;
        if (bVar == null) {
            return "";
        }
        String a = bVar.mo68906a();
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return "";
    }

    public C20497i(C20386c cVar) {
        this.f50007c = cVar.f49792n;
        this.f50005a = cVar.f49791m;
        this.f50008d = cVar.f49798t;
        this.f50009e = new C20484e();
        this.f50010f = cVar;
    }

    /* renamed from: a */
    private long m74571a(Intent intent) {
        long a = C59957a.m232683a(intent, "msg_id", 0L);
        if (a <= 0) {
            return (long) C59957a.m232682a(intent, "msg_id", 0);
        }
        return a;
    }

    /* renamed from: a */
    private boolean m74575a(PushBody pushBody) {
        if (pushBody == null) {
            C20552c.m74845a("Show", "PushBody is null,filter");
            return true;
        } else if (TextUtils.isEmpty(pushBody.f49738f)) {
            return false;
        } else {
            AbstractC20439b bVar = PushSupporter.get().getConfiguration().f49804z;
            if (bVar == null) {
                C20552c.m74845a("Show", "account service is null，not filter");
                return false;
            } else if (!pushBody.f49739g || TextUtils.equals(bVar.mo68906a(), pushBody.f49738f)) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: a */
    static boolean m74576a(String str) {
        AbstractC20439b bVar = (AbstractC20439b) C60442b.m234863a(AbstractC20439b.class);
        if (bVar == null || TextUtils.isEmpty(str)) {
            C20552c.m74845a("Show", "account service is null，hasLoggedInBefore return false");
            return false;
        } else if (TextUtils.equals(str, m74572a())) {
            return true;
        } else {
            List<String> b = bVar.mo68908b();
            if (b == null || !b.contains(str)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    private JSONObject m74573a(PushBody pushBody, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(jSONObject.optString("rule_id64"))) {
            jSONObject.put("rule_id64", pushBody.f49735c);
        }
        return jSONObject;
    }

    @Override // com.bytedance.push.interfaze.IPushMsgHandler
    public void handlePassThroughMsg(String str, int i, String str2) {
        try {
            handlePassThroughMsg(new JSONObject(str), i, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.push.interfaze.IPushMsgHandler
    public void handlePassThroughMsg(JSONObject jSONObject, int i, String str) {
        Throwable th;
        PushBody pushBody = null;
        try {
            PushBody pushBody2 = new PushBody(jSONObject);
            try {
                ((AbstractC20434a) C60442b.m234863a(AbstractC20434a.class)).mo68896a(pushBody2, i);
                if (!pushBody2.mo68712c()) {
                    PushSupporter.logger().mo68952e("Show", "PushBody error");
                }
                boolean a = m74575a(pushBody2);
                C20500j jVar = this.f50007c;
                if (jVar != null && !a) {
                    jVar.mo68961a(AppProvider.getApp(), i, pushBody2);
                }
                if (!TextUtils.isEmpty(pushBody2.f49738f) && !TextUtils.equals(pushBody2.f49738f, m74572a())) {
                    ThreadPlus.submitRunnable(new RunnableC20465e(i, pushBody2));
                }
                m74574a(i, pushBody2, a);
            } catch (Throwable th2) {
                th = th2;
                pushBody = pushBody2;
                if (pushBody != null && !TextUtils.isEmpty(pushBody.f49738f) && !TextUtils.equals(pushBody.f49738f, m74572a())) {
                    ThreadPlus.submitRunnable(new RunnableC20465e(i, pushBody));
                }
                m74574a(i, pushBody, false);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            ThreadPlus.submitRunnable(new RunnableC20465e(i, pushBody));
            m74574a(i, pushBody, false);
            throw th;
        }
    }

    @Override // com.bytedance.push.interfaze.IPushMsgHandler
    public void onClickMsg(Context context, String str, int i) {
        if (this.f50009e.mo68975a(str, i)) {
            ILogger logger = PushSupporter.logger();
            logger.mo68952e("Click", "onClickMsg#repeat click:" + str + ", from = " + i);
            return;
        }
        JSONObject jSONObject = null;
        try {
            PushBody pushBody = new PushBody(new JSONObject(str));
            AbstractC20454q qVar = this.f50008d;
            if (qVar != null) {
                jSONObject = qVar.onClickPush(context, i, pushBody);
            } else {
                PushSupporter.logger().mo68952e("Click", "mOnPushClickListener = null!!");
            }
            if (!this.f50010f.f49771B) {
                trackClickPush(context, pushBody, true, jSONObject);
            }
        } catch (JSONException e) {
            PushSupporter.logger().mo68953e("Click", "onClickMsg", e);
        }
    }

    /* renamed from: a */
    private void m74574a(final int i, final PushBody pushBody, final boolean z) {
        RunnableC204981 r0 = new Runnable() {
            /* class com.bytedance.push.notification.C20497i.RunnableC204981 */

            public void run() {
                String str;
                if (pushBody != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("rule_id", pushBody.f49734b);
                        jSONObject.put("rule_id64", pushBody.f49735c);
                        jSONObject.put("sender", i);
                        jSONObject.put("push_sdk_version", String.valueOf(30406));
                        jSONObject.put("push_sdk_version_name", "3.4.6-lark");
                        jSONObject.put("ttpush_sec_target_uid", pushBody.f49738f);
                        jSONObject.put("local_sec_uid", C20497i.m74572a());
                        String str2 = "1";
                        if (C20497i.m74576a(pushBody.f49738f)) {
                            str = str2;
                        } else {
                            str = "0";
                        }
                        jSONObject.put("is_self", str);
                        jSONObject.put("client_time", System.currentTimeMillis());
                        if (!z) {
                            str2 = "0";
                        }
                        jSONObject.put("real_filter", str2);
                        if (pushBody.f49753u != null) {
                            jSONObject.put("push_style", pushBody.f49753u.f49370a);
                        }
                        if (!TextUtils.isEmpty(pushBody.f49736d)) {
                            jSONObject.put("ttpush_group_id", pushBody.f49736d);
                        }
                        if (pushBody.f49754v != null) {
                            jSONObject.put("ttpush_event_extra", pushBody.f49754v);
                        }
                        C20497i.this.f50005a.mo68914a("push_show_ug", jSONObject);
                        ILogger logger = PushSupporter.logger();
                        logger.mo68949d("Show", "push_show_ug:" + pushBody.f49734b);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPlus.submitRunnable(r0);
        } else {
            r0.run();
        }
    }

    @Override // com.bytedance.push.interfaze.IPushMsgHandler
    public void trackClickPush(Context context, Intent intent, String str, JSONObject jSONObject) {
        String stringExtra = intent.getStringExtra("push_body");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                PushBody pushBody = new PushBody(new JSONObject(stringExtra));
                trackClickPush(context, pushBody, true, m74573a(pushBody, jSONObject));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            trackClickPush(context, m74571a(intent), null, str, true, jSONObject);
        }
    }

    @Override // com.bytedance.push.interfaze.IPushMsgHandler
    public void trackClickPush(Context context, PushBody pushBody, boolean z, JSONObject jSONObject) {
        if (pushBody != null) {
            trackClickPush(context, pushBody.f49734b, pushBody.f49736d, pushBody.f49738f, z, m74573a(pushBody, jSONObject));
        }
    }

    @Override // com.bytedance.push.interfaze.IPushMsgHandler
    public void trackClickPush(Context context, final long j, final String str, final String str2, final boolean z, final JSONObject jSONObject) {
        RunnableC204992 r9 = new Runnable() {
            /* class com.bytedance.push.notification.C20497i.RunnableC204992 */

            /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dc, code lost:
                r5.f50020f.f50005a.mo68914a("push_click", r0);
                r0 = com.bytedance.push.PushSupporter.logger();
                r0.mo68949d("Click", "push_click:" + r10);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x0107, code lost:
                if (r10 > 0) goto L_?;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x0109, code lost:
                r0 = com.bytedance.push.PushSupporter.logger();
                r0.mo68952e("Click", "error ruleId:" + r10);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                // Method dump skipped, instructions count: 297
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.C20497i.RunnableC204992.run():void");
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPlus.submitRunnable(r9);
        } else {
            r9.run();
        }
    }
}
