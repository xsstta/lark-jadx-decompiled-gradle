package com.ss.android.vc.meeting.module.foregroundservice;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.utils.C26253ae;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.business.bytertc.meeting.ByteRTCMeetingDesktopActivity;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.irtc.AbstractC61023b;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61373b;
import com.ss.android.vc.meeting.module.foregroundservice.C61869a;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivityInstance;
import com.ss.android.vc.meeting.module.p3151p.C62614c;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.C63685a;
import com.ss.android.vc.statistics.event.C63766o;
import com.ss.android.vc.statistics.p3182c.C63726b;
import com.ss.android.vcxp.C63791b;
import java.util.List;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONException;
import org.json.JSONObject;

public class ForegroundService extends Service {

    /* renamed from: a */
    public static final int f155312a = C26253ae.m94998a(1, Integer.MAX_VALUE);

    /* renamed from: c */
    private static final String f155313c = (ForegroundService.class.getCanonicalName().toLowerCase() + ".WakeUpAction");

    /* renamed from: b */
    public volatile String f155314b = "";

    /* renamed from: d */
    private IMeetingsSizeChangeListener f155315d;

    /* renamed from: e */
    private BroadcastReceiver f155316e;

    /* renamed from: f */
    private final Handler f155317f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private volatile C61868a f155318g;

    /* renamed from: h */
    private C61373b.AbstractC61374a f155319h;

    public IBinder onBind(Intent intent) {
        return null;
    }

    /* renamed from: com.ss.android.vc.meeting.module.foregroundservice.ForegroundService$a */
    private static class C61868a {

        /* renamed from: a */
        private volatile boolean f155328a;

        private C61868a() {
        }

        /* renamed from: a */
        public final void mo214242a() {
            if (this.f155328a) {
                ForegroundService.m241667b("stopScreenCapturer");
                try {
                    C61237h.m238223a().mo210564v();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C61237h.m238223a().mo210507a((AbstractC61023b) null);
                this.f155328a = false;
            }
        }

        /* renamed from: a */
        public void mo214244a(Intent intent, boolean z) {
            int i;
            int i2;
            C60776r.C60777a a = C60776r.m236140a((C61303k) MeetingManager.m238341a().mo211908l());
            if (z) {
                i = a.f151975a;
                i2 = a.f151976b;
            } else {
                i = a.f151976b;
                i2 = a.f151975a;
            }
            mo214243a(intent, i, i2);
        }

        /* renamed from: a */
        public void mo214243a(Intent intent, int i, int i2) {
            ForegroundService.m241667b("startScreenCapturer");
            try {
                C61303k kVar = (C61303k) MeetingManager.m238341a().mo211908l();
                if (!(kVar == null || kVar.mo212056e() == null || kVar.mo212056e().getVideoChatSettings() == null || kVar.mo212056e().getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE)) {
                    C63766o.m250329b(kVar.mo212056e(), kVar.aj().mo216419i(), kVar.mo212093K());
                }
                C61237h.m238223a().mo210498a(intent, i, i2, kVar.aj().mo216416f(), 2);
                this.f155328a = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m241663a() {
        m241666a(null, false, false, false);
    }

    /* renamed from: com.ss.android.vc.meeting.module.foregroundservice.ForegroundService$5 */
    static /* synthetic */ class C618675 {

        /* renamed from: a */
        static final /* synthetic */ int[] f155327a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.vc.meeting.framework.meeting.DisplayMode[] r0 = com.ss.android.vc.meeting.framework.meeting.DisplayMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.foregroundservice.ForegroundService.C618675.f155327a = r0
                com.ss.android.vc.meeting.framework.meeting.DisplayMode r1 = com.ss.android.vc.meeting.framework.meeting.DisplayMode.ACTIVITY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.foregroundservice.ForegroundService.C618675.f155327a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.framework.meeting.DisplayMode r1 = com.ss.android.vc.meeting.framework.meeting.DisplayMode.WINDOW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.foregroundservice.ForegroundService.C618675.f155327a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.framework.meeting.DisplayMode r1 = com.ss.android.vc.meeting.framework.meeting.DisplayMode.FAST_ENTRY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.foregroundservice.ForegroundService.C618675.f155327a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.meeting.framework.meeting.DisplayMode r1 = com.ss.android.vc.meeting.framework.meeting.DisplayMode.NONE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.foregroundservice.ForegroundService.C618675.<clinit>():void");
        }
    }

    public void onCreate() {
        m241667b("[onCreate]: ");
        m241668c("onCreate");
        C618631 r0 = new BroadcastReceiver() {
            /* class com.ss.android.vc.meeting.module.foregroundservice.ForegroundService.C618631 */

            public void onReceive(Context context, Intent intent) {
                Class cls;
                boolean a = MeetingManager.m238341a().mo211892a(true);
                ForegroundService.m241667b(String.format("clickForegroundServiceNotification: hasMeetingOngoing=%b", Boolean.valueOf(a)));
                if (a) {
                    C61303k kVar = (C61303k) MeetingManager.m238341a().mo211908l();
                    if (kVar != null) {
                        ForegroundService.m241667b("displayMode=" + kVar.mo212067p());
                        int i = C618675.f155327a[kVar.mo212067p().ordinal()];
                        if (i == 1) {
                            if (DesktopUtil.m144307b()) {
                                cls = ByteRTCMeetingDesktopActivity.class;
                            } else if (kVar.aE().mo208293c()) {
                                cls = ByteRTCMeetingActivityInstance.class;
                            } else {
                                cls = ByteRTCMeetingActivity.class;
                            }
                            Intent intent2 = new Intent(context, cls);
                            intent2.addFlags(268435456);
                            intent2.putExtra("open_and_do_nothing", true);
                            context.startActivity(intent2);
                        } else if (i == 2) {
                            kVar.ae().mo213809b();
                        } else if (i == 3) {
                            kVar.at().mo213575c();
                        } else if (i == 4) {
                            ByteRTCMeetingActivity.m244042c(kVar);
                        }
                    }
                } else {
                    ForegroundService.this.mo214236a("onStartCommand", LocationRequest.PRIORITY_HD_ACCURACY);
                }
            }
        };
        this.f155316e = r0;
        m241662a(this, r0, new IntentFilter(f155313c));
        this.f155315d = new IMeetingsSizeChangeListener() {
            /* class com.ss.android.vc.meeting.module.foregroundservice.ForegroundService.C618642 */

            @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
            /* renamed from: a */
            public /* synthetic */ void mo208172a(List list) {
                IMeetingsSizeChangeListener.CC.$default$a(this, list);
            }

            @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
            public void onMeetingsBegin(boolean z) {
            }

            @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
            public void onMeetingsEnd() {
                ForegroundService.this.mo214236a("clickNotification", LocationRequest.PRIORITY_HD_ACCURACY);
            }
        };
        MeetingManager.m238341a().addMeetingsSizeChangeListener(this.f155315d);
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211908l();
        if (kVar != null) {
            this.f155319h = new C61373b.AbstractC61374a() {
                /* class com.ss.android.vc.meeting.module.foregroundservice.ForegroundService.C618653 */

                @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                /* renamed from: b */
                public /* synthetic */ void mo212445b(boolean z) {
                    C61373b.AbstractC61374a.CC.$default$b(this, z);
                }

                @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                public /* synthetic */ void bC_() {
                    C61373b.AbstractC61374a.CC.$default$bC_(this);
                }

                @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                public /* synthetic */ void bF_() {
                    C61373b.AbstractC61374a.CC.$default$bF_(this);
                }

                @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                public /* synthetic */ void bX_() {
                    C61373b.AbstractC61374a.CC.$default$bX_(this);
                }

                @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                /* renamed from: c */
                public /* synthetic */ void mo212449c(boolean z) {
                    C61373b.AbstractC61374a.CC.$default$c(this, z);
                }

                @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                /* renamed from: d */
                public /* synthetic */ void mo212451d(boolean z) {
                    C61373b.AbstractC61374a.CC.$default$d(this, z);
                }

                @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                public /* synthetic */ void i_(boolean z) {
                    C61373b.AbstractC61374a.CC.$default$i_(this, z);
                }

                @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                public /* synthetic */ void onOnlyPresenterCanAnnotateChanged(boolean z) {
                    C61373b.AbstractC61374a.CC.$default$onOnlyPresenterCanAnnotateChanged(this, z);
                }

                @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                public void c_(String str, String str2) {
                    if (MeetingManager.m238341a().mo211892a(true) && !TextUtils.equals(ForegroundService.this.f155314b, str2)) {
                        ForegroundService.this.f155314b = str2;
                        ForegroundService.this.mo214235a(str2);
                    }
                }
            };
            kVar.mo212091I().mo212498e().mo212443a(this.f155319h);
        }
    }

    public void onDestroy() {
        m241667b("onDestroy");
        if (this.f155315d != null) {
            MeetingManager.m238341a().removeMeetingsSizeChangeListener(this.f155315d);
        }
        BroadcastReceiver broadcastReceiver = this.f155316e;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211908l();
        if (kVar != null) {
            kVar.mo212091I().mo212498e().mo212444b(this.f155319h);
        }
        this.f155317f.removeCallbacksAndMessages(null);
        stopForeground(true);
        this.f155314b = "";
        if (this.f155318g != null) {
            this.f155318g.mo214242a();
        }
    }

    /* renamed from: b */
    public static void m241667b(String str) {
        C60700b.m235851b("ForegroundService", "[monitorCommonLog]", str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg", str);
        } catch (JSONException e) {
            C60700b.m235864f("ForegroundService", "monitorCommonLog2", e.getMessage());
        }
        C63685a.m249657b("ForegroundService", jSONObject);
    }

    /* renamed from: a */
    private void m241664a(Intent intent) {
        if (Build.VERSION.SDK_INT >= 29 && C62614c.m244945q()) {
            C61237h.m238223a().mo210497a(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m241669d(String str) {
        boolean a = MeetingManager.m238341a().mo211892a(true);
        m241667b(String.format("[%s]stopForegroundService:hasMeetingOnGoingBeforeStop=%b", str, Boolean.valueOf(a)));
        if (!a) {
            stopSelf();
        }
    }

    /* renamed from: c */
    private boolean m241668c(String str) {
        String str2;
        Notification notification;
        Intent intent = new Intent();
        intent.setAction(f155313c);
        intent.addFlags(268435456);
        PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 0, intent, 134217728);
        boolean a = MeetingManager.m238341a().mo211892a(true);
        String str3 = "";
        if (a) {
            C61303k kVar = (C61303k) MeetingManager.m238341a().mo211908l();
            if (kVar.f153550c == VideoChat.Type.MEET) {
                VideoChatSettings videoChatSettings = kVar.mo212056e().getVideoChatSettings();
                if (videoChatSettings != null) {
                    str3 = videoChatSettings.getTopic();
                    if (TextUtils.isEmpty(str3)) {
                        str3 = C60773o.m236119a((int) R.string.View_G_ServerNoTitle);
                    }
                }
                if (MeetingManager.m238341a().mo211900g()) {
                    str2 = getString(R.string.View_M_WaitingInTheLobby);
                } else {
                    str2 = getString(R.string.View_M_MeetingInProgress);
                }
            } else {
                VideoChatUser singleRemoteUser = kVar.mo212088F().getSingleRemoteUser();
                if (singleRemoteUser != null) {
                    str3 = singleRemoteUser.getName();
                }
                str2 = getString(R.string.View_G_CallInProgress);
            }
        } else {
            str2 = str3;
        }
        this.f155314b = str3;
        if (Build.VERSION.SDK_INT >= 26) {
            notification = new NotificationCompat.Builder(getApplication(), "vc_foreground").setContentTitle(str3).setPriority(0).setContentText(str2).setContentIntent(broadcast).setSmallIcon(R.drawable.ic_notify).build();
        } else {
            notification = new Notification.Builder(getApplication()).setContentTitle(str3).setContentText(str2).setPriority(0).setContentIntent(broadcast).setSmallIcon(R.drawable.ic_notify).build();
        }
        startForeground(f155312a, notification);
        m241667b(String.format("[%s]callStartForeground:hasMeetingOnGoing=%b,notification_title=%s", str, Boolean.valueOf(a), str3));
        return a;
    }

    /* renamed from: a */
    public void mo214235a(String str) {
        String str2;
        Notification notification;
        C60700b.m235851b("ForegroundService", "[updateNotificationTopic]", String.format("[updateNotificationTopic]topic = %s", str));
        Intent intent = new Intent();
        intent.setAction(f155313c);
        intent.addFlags(268435456);
        PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 0, intent, 134217728);
        if (TextUtils.isEmpty(str)) {
            str = C60773o.m236119a((int) R.string.View_G_ServerNoTitle);
        }
        if (MeetingManager.m238341a().mo211900g()) {
            str2 = getString(R.string.View_M_WaitingInTheLobby);
        } else {
            str2 = getString(R.string.View_M_MeetingInProgress);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            notification = new NotificationCompat.Builder(getApplication(), "vc_foreground").setContentTitle(str).setPriority(0).setContentText(str2).setContentIntent(broadcast).setSmallIcon(R.drawable.ic_notify).build();
        } else {
            notification = new Notification.Builder(getApplication()).setContentTitle(str).setContentText(str2).setPriority(0).setContentIntent(broadcast).setSmallIcon(R.drawable.ic_notify).build();
        }
        ((NotificationManager) getSystemService("notification")).notify(f155312a, notification);
    }

    /* renamed from: a */
    public void mo214236a(String str, int i) {
        this.f155317f.postDelayed(new Runnable(str) {
            /* class com.ss.android.vc.meeting.module.foregroundservice.$$Lambda$ForegroundService$vw6vnktnIbJOGYyud57o_MRvqes */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                ForegroundService.this.m241669d(this.f$1);
            }
        }, (long) i);
    }

    /* renamed from: a */
    public static void m241665a(Intent intent, boolean z, boolean z2) {
        m241666a(intent, true, z, z2);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m241662a(ForegroundService foregroundService, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return foregroundService.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        VideoChat videoChat;
        if (intent == null) {
            return 2;
        }
        String stringExtra = intent.getStringExtra("from");
        long longExtra = intent.getLongExtra("start_stamp", 0);
        if (longExtra != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", System.currentTimeMillis() - longExtra);
                C61303k kVar = (C61303k) MeetingManager.m238341a().mo211908l();
                if (kVar != null) {
                    videoChat = kVar.mo212056e();
                } else {
                    videoChat = null;
                }
                C63726b.m249915a("vc_monitor_foreground_service", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (!m241668c("onStartCommand")) {
            mo214236a("onStartCommand", LocationRequest.PRIORITY_INDOOR);
            return 2;
        } else if (!"share_screen".equals(stringExtra)) {
            return 2;
        } else {
            Intent intent2 = (Intent) intent.getParcelableExtra("intent");
            boolean booleanExtra = intent.getBooleanExtra("is_landcape", false);
            boolean booleanExtra2 = intent.getBooleanExtra("start_audio_share", true);
            if (this.f155318g == null) {
                this.f155318g = new C61868a();
            }
            this.f155318g.mo214244a(intent2, booleanExtra);
            if (!booleanExtra2) {
                return 2;
            }
            m241664a(intent2);
            return 2;
        }
    }

    /* renamed from: a */
    private static void m241666a(final Intent intent, final boolean z, final boolean z2, final boolean z3) {
        C61869a.m241680a().mo214246a(new C61869a.AbstractC61872b() {
            /* class com.ss.android.vc.meeting.module.foregroundservice.ForegroundService.C618664 */

            @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
            /* renamed from: a */
            public void mo212169a(boolean z, long j) {
                Class cls;
                int i;
                boolean a = MeetingManager.m238341a().mo211892a(true);
                if (a) {
                    C61303k kVar = (C61303k) MeetingManager.m238341a().mo211908l();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (z) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        jSONObject.put("timeout", i);
                        C63726b.m249915a("vc_monitor_foreground_service", jSONObject, kVar.mo212056e());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    Context a2 = ar.m236694a();
                    if (C63791b.m250468b()) {
                        cls = XForegroundService.class;
                    } else {
                        cls = ForegroundService.class;
                    }
                    Intent intent = new Intent(a2, cls);
                    intent.putExtra("start_stamp", System.currentTimeMillis());
                    if (z) {
                        intent.putExtra("intent", intent);
                        intent.putExtra("from", "share_screen");
                        intent.putExtra("is_landcape", z2);
                        intent.putExtra("start_audio_share", z3);
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 26) {
                            a2.startForegroundService(intent);
                        } else {
                            a2.startService(intent);
                        }
                    } catch (Exception e2) {
                        C60700b.m235864f("ForegroundService", "[start]", e2.getMessage());
                    }
                }
                ForegroundService.m241667b(String.format("[startService]hasMeetingOnGoing=%b", Boolean.valueOf(a)));
            }
        });
    }
}
