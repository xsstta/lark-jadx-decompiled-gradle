package com.ss.android.lark.notification.p2385g;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.client.v1.MailNotificationSettingPushResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.common.C48435b;
import com.ss.android.lark.notification.dto.MailNotificationSetting;
import com.ss.android.lark.notification.p2385g.C48529h;
import com.ss.android.lark.notification.setting.p2388a.p2390b.AbstractC48570a;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.notification.g.h */
public class C48529h {

    /* renamed from: a */
    public final List<AbstractC48570a> f122118a;

    /* renamed from: com.ss.android.lark.notification.g.h$a */
    private static class C48533a {

        /* renamed from: a */
        static C48529h f122123a = new C48529h();
    }

    /* renamed from: a */
    public static C48529h m191327a() {
        return C48533a.f122123a;
    }

    private C48529h() {
        this.f122118a = new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public void mo169603a(AbstractC48570a aVar) {
        C53246j.m205910a(this.f122118a, aVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.notification.p2385g.C48529h.C485301 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.MAIL_NOTIFICATION_SETTINGS_PUSH, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.notification.p2385g.$$Lambda$h$1$N2LUNqhwCeXvrKTc3O0jE94tTog */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C48529h.C485301.lambda$N2LUNqhwCeXvrKTc3O0jE94tTog(C48529h.this, bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo169605b(AbstractC48570a aVar) {
        C53246j.m205911b(this.f122118a, aVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.notification.p2385g.C48529h.C485312 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.MAIL_NOTIFICATION_SETTINGS_PUSH);
            }
        });
    }

    /* renamed from: a */
    private void m191328a(final MailNotificationSetting mailNotificationSetting) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.notification.p2385g.C48529h.RunnableC485323 */

            public void run() {
                for (AbstractC48570a aVar : C48529h.this.f122118a) {
                    aVar.mo169651a(mailNotificationSetting);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo169604a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            MailNotificationSettingPushResponse decode = MailNotificationSettingPushResponse.ADAPTER.decode(bArr);
            if (decode == null) {
                Log.m165383e("NotificationSettingPush", "onPushMailNotificationSetting failed: mailPushResponse is null");
            } else if (decode.notification_settings == null) {
                Log.m165383e("NotificationSettingPush", "onPushMailNotificationSetting failed: notification_settings is null");
            } else {
                m191328a(C48435b.m191078a(decode.notification_settings));
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.m165383e("NotificationSettingPush", "onPushMailNotificationSetting exception: " + e.getMessage());
        }
    }
}
