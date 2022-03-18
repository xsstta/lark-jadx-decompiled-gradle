package com.ss.android.message;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.push.p879a.C20381a;
import com.bytedance.push.third.C20547e;
import com.bytedance.push.utils.C20552c;
import com.ss.android.pushmanager.p3019a.C59959a;
import com.ss.android.ug.bus.C60442b;

public class NotifyService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* renamed from: a */
    public void mo202694a() {
        try {
            C20547e.m74826a().mo69179a(getApplicationContext());
        } catch (Throwable unused) {
        }
        C20552c.m74845a("NotifyService", "do onCreate end");
    }

    public void onCreate() {
        super.onCreate();
        C20381a.m74252a(getApplicationContext()).mo68748a();
        C59438c.m230748a().mo202703a(new Runnable() {
            /* class com.ss.android.message.NotifyService.RunnableC594321 */

            public void run() {
                NotifyService.this.mo202694a();
            }
        });
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            C20547e.m74826a().mo69185b();
        } catch (Exception e) {
            try {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public int onStartCommand(final Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (C20552c.m74848a()) {
            C20552c.m74845a("PushService NotifyService", "onStartCommand");
        }
        C59438c.m230748a().mo202703a(new Runnable() {
            /* class com.ss.android.message.NotifyService.RunnableC594332 */

            public void run() {
                try {
                    C20552c.m74845a("NotifyService", "do handleIntent start");
                    try {
                        C20547e.m74826a().mo69182a(intent);
                    } catch (Throwable unused) {
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        if (((C59959a.AbstractC59961b) C60442b.m234863a(C59959a.AbstractC59961b.class)).mo68800b()) {
            return 2;
        }
        return onStartCommand;
    }
}
