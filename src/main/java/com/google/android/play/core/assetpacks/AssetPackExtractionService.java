package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.play.core.internal.C22630b;

public class AssetPackExtractionService extends Service {

    /* renamed from: a */
    Context f55642a;

    /* renamed from: b */
    cx f55643b;

    /* renamed from: c */
    C22614x f55644c;

    /* renamed from: d */
    private final C22630b f55645d = new C22630b("AssetPackExtractionService");

    /* renamed from: e */
    private BinderC22586b f55646e;

    /* renamed from: f */
    private NotificationManager f55647f;

    /* renamed from: b */
    private final synchronized void m81921b(Bundle bundle) {
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        Notification.Builder timeoutAfter = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(this.f55642a, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j) : new Notification.Builder(this.f55642a).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(string).setSubText(string2);
        if (Build.VERSION.SDK_INT >= 21) {
            timeoutAfter.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.f55645d.mo78874c("Starting foreground service.", new Object[0]);
        this.f55643b.mo78808a(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f55647f.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, build);
    }

    /* renamed from: a */
    public final synchronized Bundle mo78683a(Bundle bundle) {
        int i = bundle.getInt("action_type");
        C22630b bVar = this.f55645d;
        Integer valueOf = Integer.valueOf(i);
        bVar.mo78871a("updateServiceState: %d", valueOf);
        if (i == 1) {
            m81921b(bundle);
        } else if (i != 2) {
            this.f55645d.mo78873b("Unknown action type received: %d", valueOf);
        } else {
            mo78684a();
        }
        return new Bundle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo78684a() {
        this.f55645d.mo78874c("Stopping service.", new Object[0]);
        this.f55643b.mo78808a(false);
        stopForeground(true);
        stopSelf();
    }

    public final IBinder onBind(Intent intent) {
        return this.f55646e;
    }

    public final void onCreate() {
        super.onCreate();
        this.f55645d.mo78871a("onCreate", new Object[0]);
        bz.m82058a(getApplicationContext()).mo78751a(this);
        this.f55646e = new BinderC22586b(this.f55642a, this, this.f55644c);
        this.f55647f = (NotificationManager) this.f55642a.getSystemService("notification");
    }
}
