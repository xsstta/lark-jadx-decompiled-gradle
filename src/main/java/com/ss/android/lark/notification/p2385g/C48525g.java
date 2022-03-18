package com.ss.android.lark.notification.p2385g;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Notification;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.p2382e.C48452e;
import com.ss.android.lark.sdk.C53248k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.notification.g.g */
public class C48525g {

    /* renamed from: a */
    public List<AbstractC48512b> f122113a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.notification.g.g$a */
    public static class C48528a {

        /* renamed from: a */
        public static final C48525g f122117a = new C48525g();
    }

    /* renamed from: a */
    public static C48525g m191322a() {
        return C48528a.f122117a;
    }

    private C48525g() {
        this.f122113a = new CopyOnWriteArrayList();
    }

    /* renamed from: c */
    private void m191324c() {
        this.f122113a.add(C48452e.m191122b().mo169519c());
    }

    /* renamed from: b */
    public void mo169601b() {
        m191324c();
        C53248k.m205912a().mo181697a(Command.PUSH_NOTIFICATION, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.notification.p2385g.C48525g.C485261 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C48525g.this.mo169600a(bArr);
            }
        });
    }

    /* renamed from: a */
    private void m191323a(final Notification notification) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.notification.p2385g.C48525g.RunnableC485272 */

            public void run() {
                for (AbstractC48512b bVar : C48525g.this.f122113a) {
                    bVar.mo169525a(C48514d.m191305a(notification));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo169600a(byte[] bArr) {
        Notification notification;
        try {
            notification = Notification.ADAPTER.decode(bArr);
        } catch (Exception e) {
            Log.m165385e("NotificationPush", "onPushNotification failed: " + e.getMessage(), e, true);
            notification = null;
        }
        if (notification == null) {
            Log.m165383e("NotificationPush", "onPushNotification failed: notification entity is null");
        } else {
            m191323a(notification);
        }
    }
}
