package com.ss.android.lark.wschannelnotification.offline;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import com.bytedance.common.utility.StringUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.wschannelnotification.WsNotificationProcessor;
import com.ss.android.newmedia.message.MessageReceiverService;
import com.ss.android.pushmanager.setting.C59971b;

public class WschannelMessageHandler extends MessageReceiverService {
    /* renamed from: a */
    private void m230226a() {
        boolean z;
        PowerManager powerManager = (PowerManager) getSystemService("power");
        if (C59971b.m232728b().mo204216l()) {
            if (Build.VERSION.SDK_INT >= 20) {
                z = powerManager.isInteractive();
            } else {
                z = powerManager.isScreenOn();
            }
            Log.m165379d("WschannelMessageHandler", "tryWakeupScreen isScreenOn = " + z);
            if (!z) {
                powerManager.newWakeLock(268435462, "MessageReceiverService").acquire((long) C59971b.m232728b().mo204217m());
            }
        }
    }

    /* renamed from: a */
    private String m230225a(Intent intent) {
        if (intent != null && "com.ss.android.message".equals(intent.getAction())) {
            return intent.getStringExtra("message_data");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.newmedia.message.MessageReceiverService
    /* renamed from: a */
    public void mo201539a(final Context context, Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            if (action != null) {
                Log.m165379d("WschannelMessageHandler", "action = " + action);
            }
            if (!C59971b.m232728b().mo204208d()) {
                Log.m165389i("WschannelMessageHandler", "notify enable = " + C59971b.m232728b().mo204208d());
                return;
            }
            try {
                if ("com.ss.android.message".equals(action)) {
                    final String a = m230225a(intent);
                    if (!StringUtils.isEmpty(a)) {
                        Log.m165389i("WschannelMessageHandler", "receive offline msg");
                        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                            /* class com.ss.android.lark.wschannelnotification.offline.WschannelMessageHandler.RunnableC592821 */

                            public void run() {
                                Log.m165379d("WschannelMessageHandler", "message received, msg is: " + a);
                                WsNotificationProcessor.m230212a().mo201532a(context, a, 2, null);
                            }
                        });
                        m230226a();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
