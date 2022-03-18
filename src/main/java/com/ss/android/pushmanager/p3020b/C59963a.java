package com.ss.android.pushmanager.p3020b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.ArrayUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.push.utils.C20552c;
import com.ss.android.message.C59438c;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.ss.android.pushmanager.b.a */
public class C59963a implements WeakHandler.IHandler {

    /* renamed from: f */
    private static C59963a f149476f;

    /* renamed from: a */
    public Messenger f149477a;

    /* renamed from: b */
    private WeakReference<Context> f149478b;

    /* renamed from: c */
    private Handler f149479c;

    /* renamed from: d */
    private Messenger f149480d;

    /* renamed from: e */
    private long f149481e;

    /* renamed from: g */
    private ServiceConnection f149482g = new ServiceConnection() {
        /* class com.ss.android.pushmanager.p3020b.C59963a.ServiceConnectionC599641 */

        public void onServiceDisconnected(ComponentName componentName) {
            C59963a.this.f149477a = null;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C59963a.this.f149477a = new Messenger(iBinder);
            C59963a.this.mo204182a();
        }
    };

    /* renamed from: c */
    private void m232698c() {
        try {
            if (this.f149477a != null && this.f149478b.get() != null) {
                this.f149478b.get().unbindService(this.f149482g);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private void m232699d() {
        if (C20552c.m74848a()) {
            C20552c.m74845a("PushLog", "hanldeEnd");
        }
        if (this.f149477a != null) {
            try {
                m232698c();
                this.f149477a = null;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private void m232697b() {
        WeakReference<Context> weakReference = this.f149478b;
        if (weakReference != null && weakReference.get() != null) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(this.f149478b.get(), "com.ss.android.message.log.LogService"));
                this.f149478b.get().bindService(intent, this.f149482g, 1);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo204182a() {
        try {
            Message obtain = Message.obtain((Handler) null, 0);
            obtain.replyTo = this.f149480d;
            Bundle bundle = new Bundle();
            bundle.putLong("start_id", this.f149481e);
            if (C20552c.m74848a()) {
                C20552c.m74845a("PushLog", "start_id = " + this.f149481e);
            }
            obtain.obj = bundle;
            this.f149477a.send(obtain);
        } catch (Throwable th) {
            th.printStackTrace();
            m232699d();
        }
    }

    /* renamed from: a */
    public static void m232695a(Context context) {
        if (context != null) {
            C59963a aVar = f149476f;
            if (aVar == null) {
                f149476f = new C59963a(context);
            } else if (aVar.f149477a == null) {
                aVar.m232697b();
            }
        }
    }

    private C59963a(Context context) {
        this.f149478b = new WeakReference<>(context.getApplicationContext());
        Looper b = C59438c.m230748a().mo202705b();
        this.f149479c = new WeakHandler(b == null ? Looper.getMainLooper() : b, this);
        this.f149480d = new Messenger(this.f149479c);
        m232697b();
    }

    /* renamed from: a */
    private void m232696a(List<Long> list) {
        if (list != null && list.size() > 0) {
            try {
                Message obtain = Message.obtain((Handler) null, 1);
                obtain.replyTo = this.f149480d;
                Bundle bundle = new Bundle();
                bundle.putLongArray("event_ids", ArrayUtils.toLongArray(list));
                if (C20552c.m74848a()) {
                    C20552c.m74845a("PushLog", "event_ids = " + list);
                }
                obtain.obj = bundle;
                this.f149477a.send(obtain);
            } catch (Throwable th) {
                th.printStackTrace();
                m232699d();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0122  */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r20) {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.p3020b.C59963a.handleMsg(android.os.Message):void");
    }
}
