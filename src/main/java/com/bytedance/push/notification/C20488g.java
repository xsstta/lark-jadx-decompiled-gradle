package com.bytedance.push.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.push.C20386c;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.p883e.C20404b;
import com.bytedance.push.settings.C20520j;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.push.utils.C20549a;
import com.ss.android.message.p3002a.C59436a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.notification.g */
public class C20488g {

    /* renamed from: a */
    private static AbstractC20491b f49992a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.push.notification.g$b */
    public interface AbstractC20491b {
        /* renamed from: a */
        JSONArray mo68981a(Context context);

        /* renamed from: a */
        void mo68982a(Context context, C20404b bVar);

        /* renamed from: a */
        boolean mo68983a(Context context, int i);

        /* renamed from: b */
        void mo68985b(Context context, C20404b bVar);
    }

    /* renamed from: com.bytedance.push.notification.g$a */
    private static class C20490a implements AbstractC20491b {

        /* renamed from: a */
        private NotificationManager f49993a;

        @Override // com.bytedance.push.notification.C20488g.AbstractC20491b
        /* renamed from: b */
        public void mo68985b(Context context, C20404b bVar) {
        }

        private C20490a() {
        }

        @Override // com.bytedance.push.notification.C20488g.AbstractC20491b
        /* renamed from: a */
        public JSONArray mo68981a(Context context) {
            return new JSONArray();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public NotificationManager mo68984b(Context context) {
            if (this.f49993a == null) {
                this.f49993a = (NotificationManager) context.getSystemService("notification");
            }
            return this.f49993a;
        }

        @Override // com.bytedance.push.notification.C20488g.AbstractC20491b
        /* renamed from: a */
        public boolean mo68983a(Context context, int i) {
            if (C59436a.m230734c(context) != i) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.push.notification.C20488g.AbstractC20491b
        /* renamed from: a */
        public void mo68982a(Context context, C20404b bVar) {
            C20481d dVar;
            C20386c configuration = PushSupporter.get().getConfiguration();
            if (configuration != null) {
                dVar = configuration.f49775F;
            } else {
                dVar = null;
            }
            C20549a.m74838a(context, dVar, bVar.mo68819l(), bVar.mo68809b(), null);
        }
    }

    /* renamed from: a */
    public static AbstractC20491b m74540a() {
        return f49992a;
    }

    /* renamed from: com.bytedance.push.notification.g$c */
    private static class C20492c extends C20490a {

        /* renamed from: a */
        private List<NotificationChannel> f49994a;

        private C20492c() {
            super();
        }

        @Override // com.bytedance.push.notification.C20488g.C20490a, com.bytedance.push.notification.C20488g.AbstractC20491b
        /* renamed from: a */
        public JSONArray mo68981a(Context context) {
            return m74551a(m74553c(context));
        }

        /* renamed from: a */
        private static Map<String, C20404b> m74550a(JSONArray jSONArray) {
            if (jSONArray == null || jSONArray.length() == 0) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("id"), new C20404b(optJSONObject));
            }
            return hashMap;
        }

        /* renamed from: c */
        private List<NotificationChannel> m74553c(Context context) {
            List<NotificationChannel> list = this.f49994a;
            if (list == null || list.isEmpty()) {
                try {
                    this.f49994a = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannels();
                } catch (Throwable th) {
                    th.printStackTrace();
                    this.f49994a = Collections.emptyList();
                }
            }
            return this.f49994a;
        }

        /* renamed from: d */
        private boolean m74554d(Context context) {
            try {
                List<NotificationChannel> c = m74553c(context);
                String j = ((LocalFrequencySettings) C20520j.m74724a(context, LocalFrequencySettings.class)).mo69036j();
                if (!TextUtils.isEmpty(j)) {
                    return !m74552a(c, m74550a(new JSONArray(j)));
                }
                if (c != null) {
                    if (!c.isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: a */
        private static JSONArray m74551a(List<NotificationChannel> list) {
            JSONArray jSONArray = new JSONArray();
            if (list == null) {
                return jSONArray;
            }
            for (NotificationChannel notificationChannel : list) {
                try {
                    jSONArray.put(new C20404b(notificationChannel).mo68808a());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return jSONArray;
        }

        /* renamed from: a */
        public void mo68986a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            try {
                notificationManager.createNotificationChannel(notificationChannel);
            } catch (Throwable unused) {
            }
        }

        @Override // com.bytedance.push.notification.C20488g.C20490a, com.bytedance.push.notification.C20488g.AbstractC20491b
        /* renamed from: a */
        public boolean mo68983a(Context context, int i) {
            if (super.mo68983a(context, i)) {
                return true;
            }
            return m74554d(context);
        }

        @Override // com.bytedance.push.notification.C20488g.C20490a, com.bytedance.push.notification.C20488g.AbstractC20491b
        /* renamed from: b */
        public void mo68985b(Context context, C20404b bVar) {
            NotificationManager b;
            if (bVar != null && (b = mo68984b(context)) != null && !TextUtils.isEmpty(bVar.mo68809b()) && b.getNotificationChannel(bVar.mo68809b()) != null) {
                b.deleteNotificationChannel(bVar.mo68809b());
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m74552a(java.util.List<android.app.NotificationChannel> r5, java.util.Map<java.lang.String, com.bytedance.push.p883e.C20404b> r6) {
            /*
                int r0 = r5.size()
                int r1 = r6.size()
                r2 = 0
                if (r0 == r1) goto L_0x000c
                return r2
            L_0x000c:
                java.util.Iterator r5 = r5.iterator()
            L_0x0010:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x0060
                java.lang.Object r0 = r5.next()
                android.app.NotificationChannel r0 = (android.app.NotificationChannel) r0
                java.lang.String r1 = r0.getId()
                java.lang.Object r1 = r6.get(r1)
                com.bytedance.push.e.b r1 = (com.bytedance.push.p883e.C20404b) r1
                if (r1 != 0) goto L_0x0029
                return r2
            L_0x0029:
                int r3 = r1.mo68811d()
                int r4 = r0.getImportance()
                if (r3 == r4) goto L_0x0034
                return r2
            L_0x0034:
                int r3 = r1.mo68812e()
                int r4 = r0.getLockscreenVisibility()
                if (r3 == r4) goto L_0x003f
                return r2
            L_0x003f:
                boolean r3 = r1.mo68813f()
                boolean r4 = r0.canBypassDnd()
                if (r3 == r4) goto L_0x004a
                return r2
            L_0x004a:
                boolean r3 = r1.mo68814g()
                boolean r4 = r0.shouldShowLights()
                if (r3 == r4) goto L_0x0055
                return r2
            L_0x0055:
                boolean r1 = r1.mo68815h()
                boolean r0 = r0.shouldVibrate()
                if (r1 == r0) goto L_0x0010
                return r2
            L_0x0060:
                r5 = 1
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.C20488g.C20492c.m74552a(java.util.List, java.util.Map):boolean");
        }

        @Override // com.bytedance.push.notification.C20488g.C20490a, com.bytedance.push.notification.C20488g.AbstractC20491b
        /* renamed from: a */
        public void mo68982a(Context context, C20404b bVar) {
            NotificationManager b;
            if (bVar != null && (b = mo68984b(context)) != null && !TextUtils.isEmpty(bVar.mo68809b()) && !TextUtils.isEmpty(bVar.mo68810c()) && b.getNotificationChannel(bVar.mo68809b()) == null) {
                int d = bVar.mo68811d();
                if (d < 0 || d > 5) {
                    d = 3;
                }
                NotificationChannel notificationChannel = new NotificationChannel(bVar.mo68809b(), bVar.mo68810c(), d);
                notificationChannel.setShowBadge(bVar.mo68816i());
                notificationChannel.setDescription(bVar.mo68818k());
                notificationChannel.enableVibration(bVar.mo68815h());
                notificationChannel.setBypassDnd(bVar.mo68813f());
                notificationChannel.enableLights(bVar.mo68814g());
                notificationChannel.setLockscreenVisibility(bVar.mo68812e());
                if (!mo68987a(context, b, notificationChannel, bVar.mo68819l())) {
                    mo68986a(b, notificationChannel);
                }
            }
        }

        /* renamed from: a */
        public boolean mo68987a(final Context context, final NotificationManager notificationManager, final NotificationChannel notificationChannel, String str) {
            C20481d dVar;
            int a;
            C20386c configuration = PushSupporter.get().getConfiguration();
            if (configuration != null) {
                dVar = configuration.f49775F;
            } else {
                dVar = null;
            }
            if (C20549a.m74838a(context, dVar, str, notificationChannel.getId(), new AbstractC20503k() {
                /* class com.bytedance.push.notification.C20488g.C20492c.C204931 */

                @Override // com.bytedance.push.notification.AbstractC20503k
                /* renamed from: a */
                public void mo68988a() {
                    C20492c.this.mo68986a(notificationManager, notificationChannel);
                }

                @Override // com.bytedance.push.notification.AbstractC20503k
                /* renamed from: a */
                public void mo68989a(String str) {
                    notificationChannel.setSound(C20549a.m74840b(context, str), Notification.AUDIO_ATTRIBUTES_DEFAULT);
                    C20492c.this.mo68986a(notificationManager, notificationChannel);
                }
            })) {
                return true;
            }
            if (configuration == null || (a = C20549a.m74835a(notificationChannel.getId(), configuration.f49776G, str)) == -1) {
                return false;
            }
            notificationChannel.setSound(C20549a.m74836a(context, a), Notification.AUDIO_ATTRIBUTES_DEFAULT);
            mo68986a(notificationManager, notificationChannel);
            return true;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            f49992a = new C20492c();
        } else {
            f49992a = new C20490a();
        }
    }
}
