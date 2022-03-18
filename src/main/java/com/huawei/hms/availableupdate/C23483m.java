package com.huawei.hms.availableupdate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.huawei.hms.ui.SafeIntent;

/* renamed from: com.huawei.hms.availableupdate.m */
public class C23483m extends BroadcastReceiver {

    /* renamed from: a */
    public Handler f57919a;

    public C23483m(Handler handler) {
        this.f57919a = handler;
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            SafeIntent safeIntent = new SafeIntent(intent);
            String action = safeIntent.getAction();
            if ("com.huawei.appmarket.service.downloadservice.Receiver".equals(action)) {
                Bundle extras2 = safeIntent.getExtras();
                if (extras2 != null) {
                    Message message = new Message();
                    message.what = 101;
                    message.obj = extras2;
                    this.f57919a.sendMessage(message);
                }
            } else if ("com.huawei.appmarket.service.downloadservice.progress.Receiver".equals(action)) {
                Bundle extras3 = safeIntent.getExtras();
                if (extras3 != null) {
                    Message message2 = new Message();
                    message2.what = 102;
                    message2.obj = extras3;
                    this.f57919a.sendMessage(message2);
                }
            } else if ("com.huawei.appmarket.service.installerservice.Receiver".equals(action) && (extras = safeIntent.getExtras()) != null) {
                Message message3 = new Message();
                message3.what = 103;
                message3.obj = extras;
                this.f57919a.sendMessage(message3);
            }
        }
    }
}
