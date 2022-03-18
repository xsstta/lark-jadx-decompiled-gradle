package com.bytedance.platform.horae.p874a.p875a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.platform.horae.AbstractC20367b;
import com.bytedance.platform.horae.common.Logger;
import com.bytedance.platform.horae.p874a.C20345a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.platform.horae.a.a.b */
public class HandlerC20347b extends Handler {

    /* renamed from: a */
    private Map<String, List<Message>> f49653a = new HashMap();

    public HandlerC20347b(Looper looper) {
        super(looper);
    }

    /* renamed from: a */
    private void m74161a(C20345a aVar) {
        try {
            C20352d.m74166a().mo68660a(aVar);
            if (C20352d.m74166a().mo68662c().size() > 100) {
                C20352d.m74166a().mo68662c().subList(0, 50).clear();
            }
        } catch (Throwable unused) {
        }
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.obj instanceof Message) {
            final Message message2 = (Message) message.obj;
            if (C20346a.m74158b(message2)) {
                C20345a a = C20345a.m74155a(message2);
                if (TextUtils.isEmpty(a.f49641a)) {
                    List<Message> list = this.f49653a.get(a.f49642b);
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(message2);
                    this.f49653a.put(a.f49642b, list);
                    Logger.m74201a("AsyncScheduleCenter", "Hint reversed message , first store it!");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                int i = message2.what;
                AbstractC20367b b = RunnableC20349c.m74162a().mo68656b();
                C20346a.m74156a(message2);
                m74161a(a);
                if (b != null) {
                    b.mo68706a(a.f49641a, i, System.currentTimeMillis() - currentTimeMillis);
                }
                List<Message> list2 = this.f49653a.get(a.f49642b);
                if (list2 != null && message2.what == 114) {
                    for (Message message3 : list2) {
                        Logger.m74201a("AsyncScheduleCenter", "Hint reverse message's father = " + a + "so fix it!");
                        a = C20345a.m74155a(message3);
                        Logger.m74201a("AsyncScheduleCenter", "After father message now service follow bean is " + a);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        int i2 = message3.what;
                        C20346a.m74156a(message3);
                        if (b != null) {
                            b.mo68706a(a.f49641a, i2, System.currentTimeMillis() - currentTimeMillis2);
                        }
                        m74161a(a);
                    }
                    list2.clear();
                }
                Logger.m74201a("AsyncScheduleCenter", "Handle message " + message2);
                return;
            }
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() {
                /* class com.bytedance.platform.horae.p874a.p875a.HandlerC20347b.RunnableC203481 */

                public void run() {
                    C20346a.m74156a(message2);
                }
            });
        }
    }
}
