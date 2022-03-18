package com.bytedance.push.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.push.ThreadPlus;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.push.C20386c;
import com.bytedance.push.interfaze.AbstractC20443f;
import com.bytedance.push.interfaze.AbstractC20452o;
import com.bytedance.push.p883e.C20404b;
import com.bytedance.push.settings.C20520j;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.larksuite.suite.R;
import com.ss.android.message.p3002a.C59436a;
import com.ss.android.pushmanager.setting.C59971b;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.notification.h */
public final class C20494h implements AbstractC20443f {

    /* renamed from: a */
    private final AbstractC20452o f49999a;

    public C20494h(AbstractC20452o oVar) {
        this.f49999a = oVar;
    }

    @Override // com.bytedance.push.interfaze.AbstractC20443f
    /* renamed from: a */
    public void mo68915a(Context context) {
        if (C59971b.m232728b().mo204209e()) {
            mo68991b(context);
        }
    }

    /* renamed from: b */
    public void mo68991b(final Context context) {
        ThreadPlus.submitRunnable(new Runnable() {
            /* class com.bytedance.push.notification.C20494h.RunnableC204951 */

            public void run() {
                boolean z;
                boolean d = C59971b.m232728b().mo204208d();
                LocalFrequencySettings localFrequencySettings = (LocalFrequencySettings) C20520j.m74724a(context, LocalFrequencySettings.class);
                if (Math.abs(System.currentTimeMillis() - localFrequencySettings.mo69038l()) > ((PushOnlineSettings) C20520j.m74724a(context, PushOnlineSettings.class)).mo69057h()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || !localFrequencySettings.mo69034h() || C20494h.this.mo68993c(context)) {
                    C20494h.this.mo68990a(context, d);
                }
                C20494h.this.mo68992b(context, d);
            }
        });
    }

    /* renamed from: c */
    public boolean mo68993c(Context context) {
        return C20488g.m74540a().mo68983a(context, ((LocalFrequencySettings) C20520j.m74724a(context, LocalFrequencySettings.class)).mo69035i());
    }

    @Override // com.bytedance.push.interfaze.AbstractC20443f
    /* renamed from: a */
    public void mo68916a(final Context context, final C20386c.C20389b bVar) {
        if (context != null && Build.VERSION.SDK_INT >= 26) {
            ThreadPlus.submitRunnable(new Runnable() {
                /* class com.bytedance.push.notification.C20494h.RunnableC204962 */

                public void run() {
                    C20386c.C20389b bVar = bVar;
                    String string = context.getString(R.string.push_notification_channel_name);
                    if (bVar == null) {
                        bVar = new C20386c.C20389b("push", string);
                    } else if (!bVar.mo68774a()) {
                        if (TextUtils.isEmpty(bVar.f49839b)) {
                            bVar.f49839b = "push";
                        }
                        if (TextUtils.isEmpty(bVar.f49838a)) {
                            bVar.f49838a = string;
                        }
                    }
                    String str = bVar.f49839b;
                    String str2 = bVar.f49838a;
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null && notificationManager.getNotificationChannel(str) == null) {
                        NotificationChannel notificationChannel = new NotificationChannel(str, str2, 4);
                        notificationChannel.setShowBadge(true);
                        notificationChannel.enableVibration(true);
                        notificationChannel.enableLights(true);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    static boolean m74563a(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return true;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                return false;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (notificationManager.getNotificationChannel(str) != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public void mo68992b(Context context, boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        String str2 = "open";
        if (z) {
            str = str2;
        } else {
            str = "close";
        }
        jSONObject.put("in_status", str);
        if (1 != C59436a.m230734c(context)) {
            str2 = "close";
        }
        jSONObject.put("out_status", str2);
        this.f49999a.getStatisticsService().mo68914a("ttpush_push_notification_status", jSONObject);
    }

    @Override // com.bytedance.push.interfaze.AbstractC20443f
    /* renamed from: a */
    public void mo68917a(Context context, List<C20404b> list) {
        if (!CollectionUtils.isEmpty(list)) {
            for (C20404b bVar : list) {
                if (bVar != null) {
                    try {
                        if (bVar.mo68817j()) {
                            C20488g.m74540a().mo68982a(context, bVar);
                        } else if (!TextUtils.equals(bVar.mo68809b(), "push")) {
                            C20488g.m74540a().mo68985b(context, bVar);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo68990a(Context context, boolean z) {
        LocalFrequencySettings localFrequencySettings = (LocalFrequencySettings) C20520j.m74724a(context, LocalFrequencySettings.class);
        if (!NetworkUtils.isNetworkAvailable(context)) {
            localFrequencySettings.mo69019a(false);
            return;
        }
        RunnableC20504l lVar = new RunnableC20504l(context, this.f49999a, z, null, null);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPlus.submitRunnable(lVar);
        } else {
            lVar.run();
        }
    }
}
