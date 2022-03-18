package com.ss.android.lark.setting.service.impl;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.settings.v1.PushUserSetting;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.BadgeStyle;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.setting.dto.BadgeSetting;
import com.ss.android.lark.setting.dto.NotificationSetting;
import com.ss.android.lark.setting.dto.NotificationSettingV2;
import com.ss.android.lark.setting.dto.NotificationSettingWrapper;
import com.ss.android.lark.setting.service.usersetting.base.C54666b;
import com.ss.android.lark.setting.service.usersetting.base.UserSetting;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.setting.service.impl.c */
public class C54611c {

    /* renamed from: a */
    private static Object f134933a = new Object();

    /* renamed from: b */
    private List<AbstractC54614a> f134934b;

    /* renamed from: c */
    private Map<AbstractC54615b, Object> f134935c;

    /* renamed from: com.ss.android.lark.setting.service.impl.c$a */
    public interface AbstractC54614a {
        /* renamed from: a */
        void mo186586a(TimeFormatSetting timeFormatSetting);

        /* renamed from: a */
        void mo186587a(NotificationSettingWrapper notificationSettingWrapper);

        /* renamed from: a */
        void mo186588a(BadgeSetting aVar);

        /* renamed from: a */
        void mo186589a(Long l);

        /* renamed from: a */
        void mo186590a(boolean z);
    }

    /* renamed from: com.ss.android.lark.setting.service.impl.c$b */
    public interface AbstractC54615b {
        /* renamed from: a */
        void mo186591a(UserSetting userSetting);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.service.impl.c$c */
    public static class C54616c {

        /* renamed from: a */
        static C54611c f134940a = new C54611c();
    }

    /* renamed from: a */
    public static C54611c m211920a() {
        return C54616c.f134940a;
    }

    /* renamed from: b */
    public void mo186583b() {
        C53248k.m205912a().mo181697a(Command.PUSH_USER_SETTING, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.setting.service.impl.C54611c.C546121 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C54611c.this.mo186581a(bArr);
                C54611c.this.mo186582a(bArr, str, z, z2);
            }
        });
    }

    private C54611c() {
        this.f134934b = new CopyOnWriteArrayList();
        this.f134935c = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public void mo186579a(AbstractC54614a aVar) {
        this.f134934b.add(aVar);
    }

    /* renamed from: a */
    public void mo186580a(AbstractC54615b bVar) {
        if (bVar != null) {
            this.f134935c.put(bVar, f134933a);
        }
    }

    /* renamed from: a */
    public void mo186578a(TimeFormatSetting timeFormatSetting) {
        for (AbstractC54614a aVar : this.f134934b) {
            if (aVar != null) {
                aVar.mo186586a(timeFormatSetting);
            }
        }
    }

    /* renamed from: b */
    public void mo186584b(AbstractC54615b bVar) {
        if (bVar != null) {
            this.f134935c.remove(bVar);
        }
    }

    /* renamed from: a */
    public void mo186581a(byte[] bArr) {
        try {
            final UserSetting a = C54666b.m212227a(PushUserSetting.ADAPTER.decode(bArr));
            for (final AbstractC54615b bVar : this.f134935c.keySet()) {
                CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                    /* class com.ss.android.lark.setting.service.impl.C54611c.RunnableC546132 */

                    public void run() {
                        bVar.mo186591a(a);
                    }
                });
            }
        } catch (IOException e) {
            Log.m165387e(e.getMessage(), (Throwable) e, true);
        }
    }

    /* renamed from: a */
    public void mo186582a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushUserSetting decode = PushUserSetting.ADAPTER.decode(bArr);
            BadgeStyle valueOf = BadgeStyle.valueOf(decode.badge_style.getValue());
            boolean booleanValue = decode.navigation_show_mute_badge.booleanValue();
            NotificationSetting a = C54607a.m211914a(decode.notification_setting);
            NotificationSettingV2 a2 = C54607a.m211915a(decode.notification_setting_v2);
            TimeFormatSetting timeFormatSetting = new TimeFormatSetting();
            timeFormatSetting.mo105511a(TimeFormatSetting.TimeFormat.forNumber(decode.time_format.time_format.getValue()));
            long longValue = decode.do_not_disturb_end_time.longValue();
            boolean booleanValue2 = decode.message_notifications_off_during_calls.booleanValue();
            for (AbstractC54614a aVar : this.f134934b) {
                if (aVar != null) {
                    aVar.mo186588a(new BadgeSetting(valueOf, booleanValue));
                    aVar.mo186587a(new NotificationSettingWrapper(a, a2));
                    aVar.mo186586a(timeFormatSetting);
                    aVar.mo186589a(Long.valueOf(longValue));
                    aVar.mo186590a(booleanValue2);
                }
            }
        } catch (Exception e) {
            Log.m165387e(e.getMessage(), (Throwable) e, true);
        }
    }
}
