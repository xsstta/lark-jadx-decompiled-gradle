package com.ss.android.newmedia.message;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.utils.C20552c;
import com.ss.android.message.C59438c;
import com.ss.android.pushmanager.setting.C59971b;
import java.lang.reflect.Field;

public class MessageReceiverService extends IntentService implements WeakHandler.IHandler {

    /* renamed from: a */
    private WeakHandler f147582a;

    /* renamed from: b */
    private Messenger f147583b;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public void onCreate() {
        super.onCreate();
    }

    public MessageReceiverService() {
        super("MessageReceiverService");
    }

    /* renamed from: a */
    private Handler m230759a() {
        try {
            Field declaredField = IntentService.class.getDeclaredField("mServiceHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(this);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private Messenger m230761b() {
        if (this.f147583b == null) {
            this.f147582a = new WeakHandler(this);
            this.f147583b = new Messenger(this.f147582a);
        }
        return this.f147583b;
    }

    /* renamed from: c */
    private void m230762c() {
        boolean z;
        PowerManager powerManager = (PowerManager) getSystemService("power");
        if (C59971b.m232728b().mo204216l()) {
            if (Build.VERSION.SDK_INT >= 20) {
                z = powerManager.isInteractive();
            } else {
                z = powerManager.isScreenOn();
            }
            C20552c.m74845a("MessageReceiverService", "tryWakeupScreen isScreenOn = " + z);
            if (!z) {
                powerManager.newWakeLock(268435462, "MessageReceiverService").acquire((long) C59971b.m232728b().mo204217m());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        try {
            mo201539a(this, intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public IBinder onBind(final Intent intent) {
        C20552c.m74845a("MessageReceiverService", "onBind");
        if (intent != null) {
            C59438c.m230748a().mo202703a(new Runnable() {
                /* class com.ss.android.newmedia.message.MessageReceiverService.RunnableC594452 */

                public void run() {
                    MessageReceiverService.this.onHandleIntent(intent);
                    MessageReceiverService.this.stopSelf();
                }
            });
        }
        return m230761b().getBinder();
    }

    /* renamed from: a */
    private String m230760a(Intent intent) {
        if (intent != null && "com.ss.android.message".equals(intent.getAction())) {
            return intent.getStringExtra("message_data");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo201539a(Context context, Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            if (action != null) {
                C20552c.m74845a("MessageReceiverService", "action = " + action);
            }
            if (!C59971b.m232728b().mo204208d()) {
                C20552c.m74852c("MessageReceiverService", "notify enable = " + C59971b.m232728b().mo204208d());
                return;
            }
            try {
                if ("com.ss.android.message".equals(action)) {
                    String a = m230760a(intent);
                    if (!StringUtils.isEmpty(a)) {
                        C20552c.m74845a("MessageReceiverService", "message received, msg is: " + a);
                        PushSupporter.pushHandler().handlePassThroughMsg(a, 2, (String) null);
                        m230762c();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int onStartCommand(final Intent intent, int i, final int i2) {
        try {
            return super.onStartCommand(intent, i, i2);
        } catch (NullPointerException e) {
            e.printStackTrace();
            if (m230759a() != null) {
                return 2;
            }
            C59438c.m230748a().mo202703a(new Runnable() {
                /* class com.ss.android.newmedia.message.MessageReceiverService.RunnableC594441 */

                public void run() {
                    try {
                        MessageReceiverService.this.onHandleIntent(intent);
                        MessageReceiverService.this.stopSelf(i2);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
            return 2;
        } catch (Throwable th) {
            th.printStackTrace();
            return 2;
        }
    }
}
