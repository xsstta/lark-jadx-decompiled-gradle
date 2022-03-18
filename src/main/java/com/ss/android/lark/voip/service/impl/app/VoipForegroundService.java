package com.ss.android.lark.voip.service.impl.app;

import android.app.Notification;
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
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26253ae;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p3456d.C68279a;
import me.ele.lancet.base.annotations.Skip;

public class VoipForegroundService extends Service {

    /* renamed from: a */
    public static final int f142767a = C26253ae.m94998a(1, Integer.MAX_VALUE);

    /* renamed from: b */
    private static final String f142768b = (VoipForegroundService.class.getCanonicalName().toLowerCase() + ".WakeUpAction");

    /* renamed from: c */
    private BroadcastReceiver f142769c;

    /* renamed from: d */
    private Handler f142770d = new Handler(Looper.getMainLooper());

    public IBinder onBind(Intent intent) {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m225126a() {
        if (!C58103o.m225371a().mo196952i()) {
            stopSelf();
        }
    }

    public void onCreate() {
        m225130a("onCreate", (Intent) null);
        C580341 r0 = new BroadcastReceiver() {
            /* class com.ss.android.lark.voip.service.impl.app.VoipForegroundService.C580341 */

            public void onReceive(Context context, Intent intent) {
                boolean i = C58103o.m225371a().mo196952i();
                C58151d.m225577a("VoipForegroundService", String.format("clickForegroundServiceNotification: hasMeetingOngoing=%b", Boolean.valueOf(i)));
                if (i && C58103o.m225371a().mo196949f().mo196802a() != null) {
                    if (VoIPFloatIcon.m225001a().mo196672b()) {
                        VoIPFloatIcon.m225001a().mo196679i();
                    } else if (VoIpDialogHelper.m225111a().mo196764c()) {
                        VoIpDialogHelper.m225111a().mo196765d();
                    } else {
                        Intent intent2 = new Intent(VoipForegroundService.this.getApplicationContext(), VoIpCallActivity.class);
                        intent2.addFlags(268435456);
                        intent2.putExtra("open_and_do_nothing", true);
                        context.startActivity(intent2);
                    }
                }
            }
        };
        this.f142769c = r0;
        m225125a(this, r0, new IntentFilter(f142768b));
    }

    public void onDestroy() {
        C58151d.m225577a("VoipForegroundService", "onDestroy: ");
        BroadcastReceiver broadcastReceiver = this.f142769c;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        this.f142770d.removeCallbacksAndMessages(null);
        stopForeground(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m225131b(Context context) {
        if (!C58103o.m225371a().mo196952i()) {
            context.stopService(new Intent(context, VoipForegroundService.class));
        }
    }

    /* renamed from: a */
    private void m225127a(int i) {
        this.f142770d.postDelayed(new Runnable() {
            /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$VoipForegroundService$Af0x0FKCrCMSD_yuA_yCcSahqE */

            public final void run() {
                VoipForegroundService.m271070lambda$Af0x0FKCrCMSD_yuA_yCcSahqE(VoipForegroundService.this);
            }
        }, (long) i);
    }

    /* renamed from: a */
    public static void m225128a(Context context) {
        UICallbackExecutor.executeDelayed(new Runnable(context) {
            /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$VoipForegroundService$t9Nk_H9pwcn1pUZfH_8FAjCmbgk */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                VoipForegroundService.lambda$t9Nk_H9pwcn1pUZfH_8FAjCmbgk(this.f$0);
            }
        }, 200);
    }

    /* renamed from: a */
    public static void m225129a(final Context context, VoiceCall voiceCall) {
        C58151d.m225577a("VoipForegroundService", String.format("startDisplay:currentVoiceCall=%s", voiceCall));
        if (voiceCall != null) {
            String fromUserId = voiceCall.getFromUserId();
            if (TextUtils.equals(voiceCall.getFromUserId(), C57977a.m224905c().getUserId())) {
                fromUserId = voiceCall.getToUserId();
            }
            Observable.just(fromUserId).map(new Function<String, String>() {
                /* class com.ss.android.lark.voip.service.impl.app.VoipForegroundService.C580363 */

                /* renamed from: a */
                public String apply(String str) throws Exception {
                    C58151d.m225577a("VoipForegroundService", "getDisplayAliasName");
                    return C57977a.m224905c().getChatDependency().mo145505a((OpenChatter) C57977a.m224905c().getChatDependency().mo145503a(str));
                }
            }).subscribeOn(C68279a.m265023b()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<String>() {
                /* class com.ss.android.lark.voip.service.impl.app.VoipForegroundService.C580352 */

                /* renamed from: a */
                public void accept(String str) throws Exception {
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            Intent intent = new Intent(context, VoipForegroundService.class);
                            intent.putExtra("title", str);
                            if (Build.VERSION.SDK_INT >= 26) {
                                context.startForegroundService(intent);
                            } else {
                                context.startService(intent);
                            }
                        } catch (Exception e) {
                            C58151d.m225579b(null, null, null, "VoipForegroundService: " + e.getMessage());
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private boolean m225130a(String str, Intent intent) {
        String str2;
        Notification notification;
        Intent intent2 = new Intent();
        intent2.setAction(f142768b);
        intent2.addFlags(268435456);
        PendingIntent broadcast = PendingIntent.getBroadcast(getApplication(), 0, intent2, 134217728);
        boolean i = C58103o.m225371a().mo196952i();
        String str3 = "";
        if (i) {
            if (intent != null) {
                str3 = intent.getStringExtra("title");
            }
            str2 = getString(R.string.View_G_CallInProgress);
        } else {
            str2 = str3;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            notification = new NotificationCompat.Builder(getApplication(), "vc_foreground").setContentTitle(str3).setPriority(0).setContentText(str2).setContentIntent(broadcast).setSmallIcon(R.drawable.ic_notify).build();
        } else {
            notification = new Notification.Builder(getApplication()).setContentTitle(str3).setPriority(0).setContentText(str2).setContentIntent(broadcast).setSmallIcon(R.drawable.ic_notify).build();
        }
        startForeground(f142767a, notification);
        C58151d.m225577a("VoipForegroundService", String.format("%s: hasMeetingOnGoing=%b,notification_title=%s", str, Boolean.valueOf(i), str3));
        return i;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (m225130a("onStartCommand", intent)) {
            return 2;
        }
        m225127a(LocationRequest.PRIORITY_INDOOR);
        return 2;
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m225125a(VoipForegroundService voipForegroundService, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return voipForegroundService.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
