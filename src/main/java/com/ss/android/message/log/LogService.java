package com.ss.android.message.log;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.ArrayUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.push.utils.C20552c;
import com.ss.android.message.C59438c;
import com.ss.android.pushmanager.p3019a.C59959a;
import org.json.JSONArray;

public class LogService extends Service implements WeakHandler.IHandler {

    /* renamed from: a */
    private Messenger f147564a;

    public void onCreate() {
        super.onCreate();
        C20552c.m74845a("PushLog", "onCreate " + this);
        try {
            C59959a.AbstractC59960a a = C59959a.m232688a();
            if (a != null) {
                a.mo68796a(this);
            }
        } catch (Throwable unused) {
        }
        this.f147564a = new Messenger(new WeakHandler(C59438c.m230748a().mo202705b(), this));
    }

    public IBinder onBind(Intent intent) {
        C20552c.m74845a("PushLog", "onBind " + this);
        return this.f147564a.getBinder();
    }

    public boolean onUnbind(Intent intent) {
        C20552c.m74845a("PushLog", "onUnBind " + this);
        return super.onUnbind(intent);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        C59439a aVar;
        try {
            aVar = C59439a.m230753a(this);
        } catch (Exception e) {
            e.printStackTrace();
            aVar = null;
        } catch (Throwable th) {
            th.printStackTrace();
            return;
        }
        C20552c.m74845a("PushLog", "handleMsg msg.what = " + message.what);
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                if (message.replyTo != null) {
                    Messenger messenger = message.replyTo;
                    long[] longArray = ((Bundle) message.obj).getLongArray("event_ids");
                    if (longArray != null) {
                        C20552c.m74845a("PushLog", "event_ids = " + ArrayUtils.toList(longArray));
                        if (aVar == null) {
                            messenger.send(Message.obtain((Handler) null, 2));
                            return;
                        }
                        for (long j : longArray) {
                            aVar.mo202713a(j);
                        }
                    }
                }
            }
        } else if (message.replyTo != null) {
            Messenger messenger2 = message.replyTo;
            long j2 = ((Bundle) message.obj).getLong("start_id", 0);
            if (aVar == null) {
                messenger2.send(Message.obtain((Handler) null, 2));
                return;
            }
            JSONArray a = aVar.mo202712a(j2, 5);
            if (a == null) {
                messenger2.send(Message.obtain((Handler) null, 2));
                return;
            }
            Message obtain = Message.obtain((Handler) null, 0);
            Bundle bundle = new Bundle();
            bundle.putString("events", a.toString());
            if (a.length() >= 5) {
                bundle.putBoolean("has_more", true);
            } else {
                bundle.putBoolean("has_more", false);
            }
            C20552c.m74845a("PushLog", "events = " + bundle.get("events") + " has_more = " + bundle.get("has_more"));
            obtain.obj = bundle;
            messenger2.send(obtain);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        C59959a.AbstractC59961b b = C59959a.m232689b();
        if (b == null || !b.mo68800b()) {
            return onStartCommand;
        }
        return 2;
    }
}
