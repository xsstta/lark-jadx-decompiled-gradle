package com.bytedance.push.p889j;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.push.ThreadPlus;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.log.ILogger;
import com.bytedance.push.p883e.C20409d;
import com.bytedance.push.third.AbstractC20545c;
import com.bytedance.push.third.PushChannelHelper;
import com.ss.android.message.C59438c;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.push.j.a */
public class RunnableC20459a implements Runnable {

    /* renamed from: a */
    static final Object f49934a = new Object();

    /* renamed from: b */
    private final AbstractC20545c f49935b;

    /* renamed from: c */
    private int f49936c = 10;

    /* renamed from: d */
    private Context f49937d;

    /* renamed from: e */
    private final Handler f49938e = new Handler(C59438c.m230748a().mo202705b()) {
        /* class com.bytedance.push.p889j.RunnableC20459a.HandlerC204601 */

        public void handleMessage(Message message) {
            super.handleMessage(message);
            RunnableC20459a.this.mo68934a(message);
        }
    };

    /* renamed from: f */
    private int f49939f = 0;

    public void run() {
        if (this.f49937d != null && this.f49935b != null) {
            synchronized (f49934a) {
                m74467a(this.f49935b);
            }
        }
    }

    /* renamed from: a */
    private boolean m74469a(int i) {
        return PushChannelHelper.isServerSupportChannel(i);
    }

    /* renamed from: b */
    private void m74470b(Message message) {
        String str;
        try {
            int i = message.arg1;
            boolean z = false;
            if (i != 10) {
                if (i == 11) {
                    z = true;
                }
            }
            ILogger logger = PushSupporter.logger();
            StringBuilder sb = new StringBuilder();
            sb.append("Send token ");
            if (z) {
                str = "success";
            } else {
                str = "fail";
            }
            sb.append(str);
            logger.mo68955i("SendTokenTask", sb.toString());
            if (!z) {
                m74468a((String) message.obj);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo68934a(Message message) {
        if (message.what == 1) {
            m74470b(message);
        }
    }

    /* renamed from: a */
    private void m74468a(String str) {
        try {
            int i = this.f49939f + 1;
            this.f49939f = i;
            if (i <= 3 && !TextUtils.isEmpty(str)) {
                ILogger logger = PushSupporter.logger();
                logger.mo68955i("SendTokenTask", "token fail, token = " + str + ". retry = " + this.f49939f);
                C59438c.m230748a().mo202704a(new Runnable() {
                    /* class com.bytedance.push.p889j.RunnableC20459a.RunnableC204612 */

                    public void run() {
                        RunnableC20459a.this.run();
                    }
                }, TimeUnit.SECONDS.toMillis(4) * ((long) this.f49939f));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x026e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m74467a(com.bytedance.push.third.AbstractC20545c r22) {
        /*
        // Method dump skipped, instructions count: 685
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.p889j.RunnableC20459a.m74467a(com.bytedance.push.third.c):void");
    }

    /* renamed from: a */
    public static String m74465a(Context context, int i) {
        C20409d a = C20463c.m74473a(context, i);
        if (a == null) {
            return null;
        }
        return a.f49887b;
    }

    private RunnableC20459a(Context context, AbstractC20545c cVar) {
        this.f49937d = context;
        this.f49935b = cVar;
    }

    /* renamed from: a */
    public static void m74466a(Context context, AbstractC20545c cVar) {
        ThreadPlus.submitRunnable(new RunnableC20459a(context, cVar));
    }
}
