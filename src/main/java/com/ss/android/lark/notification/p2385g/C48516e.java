package com.ss.android.lark.notification.p2385g;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Notice;
import com.bytedance.lark.pb.basic.v1.PushBannerNotificationExtraBody;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.p2382e.C48452e;
import com.ss.android.lark.notification.p2387i.C48537a;
import com.ss.android.lark.notification.p2387i.C48538b;
import com.ss.android.lark.sdk.C53248k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.notification.g.e */
public class C48516e {

    /* renamed from: a */
    public List<AbstractC48512b> f122104a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.notification.g.e$a */
    public static class C48521a {

        /* renamed from: a */
        public static final C48516e f122111a = new C48516e();
    }

    /* renamed from: a */
    public static final C48516e m191313a() {
        return C48521a.f122111a;
    }

    private C48516e() {
        this.f122104a = new CopyOnWriteArrayList();
    }

    /* renamed from: c */
    private void m191316c() {
        this.f122104a.add(C48452e.m191122b().mo169519c());
        this.f122104a.add(C48538b.m191361a());
    }

    /* renamed from: b */
    public void mo169596b() {
        m191316c();
        C53248k.m205912a().mo181697a(Command.PUSH_NOTICE, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.notification.p2385g.C48516e.C485171 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C48516e.this.mo169595a(bArr);
            }
        });
        C53248k.m205912a().mo181697a(Command.PUSH_BANNER_NOTIFICATION_EXTRA, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.notification.p2385g.C48516e.C485182 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C48516e.this.mo169597b(bArr);
            }
        });
    }

    /* renamed from: a */
    private void m191314a(final Notice notice) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.notification.p2385g.C48516e.RunnableC485193 */

            public void run() {
                for (AbstractC48512b bVar : C48516e.this.f122104a) {
                    bVar.mo169525a(C48513c.m191302a(notice));
                }
            }
        });
    }

    /* renamed from: a */
    private void m191315a(final PushBannerNotificationExtraBody pushBannerNotificationExtraBody) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.notification.p2385g.C48516e.RunnableC485204 */

            public void run() {
                for (AbstractC48512b bVar : C48516e.this.f122104a) {
                    bVar.mo169526a(C48537a.m191359a(pushBannerNotificationExtraBody));
                }
            }
        });
    }

    /* renamed from: b */
    public void mo169597b(byte[] bArr) {
        PushBannerNotificationExtraBody pushBannerNotificationExtraBody;
        try {
            pushBannerNotificationExtraBody = PushBannerNotificationExtraBody.ADAPTER.decode(bArr);
        } catch (Exception e) {
            Log.m165385e("PUSH_NOTICE_API", "Push tenant notice: " + e.getMessage(), e, true);
            pushBannerNotificationExtraBody = null;
        }
        if (pushBannerNotificationExtraBody != null) {
            m191315a(pushBannerNotificationExtraBody);
        }
    }

    /* renamed from: a */
    public void mo169595a(byte[] bArr) {
        Notice notice;
        try {
            notice = Notice.ADAPTER.decode(bArr);
        } catch (Exception e) {
            Log.m165385e("PUSH_NOTICE_API", "Push notice: " + e.getMessage(), e, true);
            notice = null;
        }
        if (notice != null) {
            m191314a(notice);
        }
    }
}
