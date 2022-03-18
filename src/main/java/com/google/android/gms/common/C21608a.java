package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC21667e;
import com.google.android.gms.common.api.internal.be;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC21744e;
import com.google.android.gms.common.internal.C21743d;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.C21810d;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.HandlerC21909h;
import com.larksuite.suite.R;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.ss.android.vesdk.C64034n;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.google.android.gms.common.a */
public class C21608a extends GoogleApiAvailabilityLight {

    /* renamed from: a */
    public static final int f52547a = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: b */
    private static final Object f52548b = new Object();

    /* renamed from: c */
    private static final C21608a f52549c = new C21608a();

    /* renamed from: d */
    private String f52550d;

    /* renamed from: a */
    public static C21608a m78228a() {
        return f52549c;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.a$a */
    public class HandlerC21609a extends HandlerC21909h {

        /* renamed from: a */
        private final Context f52551a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HandlerC21609a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f52551a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            if (message.what != 1) {
                int i = message.what;
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int isGooglePlayServicesAvailable = C21608a.this.isGooglePlayServicesAvailable(this.f52551a);
            if (C21608a.this.isUserResolvableError(isGooglePlayServicesAvailable)) {
                C21608a.this.mo73180a(this.f52551a, isGooglePlayServicesAvailable);
            }
        }
    }

    /* renamed from: a */
    public Dialog mo73176a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m78226a(activity, i, AbstractDialogInterface$OnClickListenerC21744e.m78974a(activity, getErrorResolutionIntent(activity, i, C63690d.f160779a), i2), onCancelListener);
    }

    /* renamed from: a */
    public final boolean mo73181a(Activity activity, AbstractC21667e eVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a = m78226a(activity, i, AbstractDialogInterface$OnClickListenerC21744e.m78975a(eVar, getErrorResolutionIntent(activity, i, C63690d.f160779a), 2), onCancelListener);
        if (a == null) {
            return false;
        }
        m78229a(activity, a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m78227a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* renamed from: b */
    public boolean mo73183b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a = mo73176a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        m78229a(activity, a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: a */
    public void mo73180a(Context context, int i) {
        m78230a(context, i, (String) null, getErrorResolutionPendingIntent(context, i, 0, C64034n.f161683a));
    }

    /* renamed from: a */
    public final boolean mo73182a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent a = mo73177a(context, connectionResult);
        if (a == null) {
            return false;
        }
        m78230a(context, connectionResult.getErrorCode(), (String) null, GoogleApiActivity.m78244a(context, a, i));
        return true;
    }

    /* renamed from: a */
    public static Dialog m78225a(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C21743d.m78971c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m78229a(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: a */
    public final zabq mo73178a(Context context, be beVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabq zabq = new zabq(beVar);
        m78227a(context, zabq, intentFilter);
        zabq.mo73511a(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabq;
        }
        beVar.mo73361a();
        zabq.mo73510a();
        return null;
    }

    /* renamed from: b */
    private final String m78231b() {
        String str;
        synchronized (f52548b) {
            str = this.f52550d;
        }
        return str;
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    /* renamed from: a */
    public PendingIntent mo73177a(Context context, ConnectionResult connectionResult) {
        if (connectionResult.hasResolution()) {
            return connectionResult.getResolution();
        }
        return getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int getClientVersion(Context context) {
        return super.getClientVersion(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final String getErrorString(int i) {
        return super.getErrorString(i);
    }

    /* renamed from: a */
    static Dialog m78226a(Context context, int i, AbstractDialogInterface$OnClickListenerC21744e eVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C21743d.m78971c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e = C21743d.m78973e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, eVar);
        }
        String a = C21743d.m78966a(context, i);
        if (a != null) {
            builder.setTitle(a);
        }
        return builder.create();
    }

    /* renamed from: a */
    static void m78229a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            C21701c.m78853a(dialog, onCancelListener).mo5511a(((FragmentActivity) activity).getSupportFragmentManager(), str);
            return;
        }
        ErrorDialogFragment.m78221a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* renamed from: a */
    private final void m78230a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            mo73179a(context);
        } else if (pendingIntent != null) {
            String b = C21743d.m78970b(context, i);
            String d = C21743d.m78972d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(b).setStyle(new NotificationCompat.BigTextStyle().bigText(d));
            if (C21810d.m79084a(context)) {
                Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
                style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
                if (C21810d.m79085b(context)) {
                    style.addAction(2131231764, resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    style.setContentIntent(pendingIntent);
                }
            } else {
                style.setSmallIcon(17301642).setTicker(resources.getString(R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(d);
            }
            if (PlatformVersion.isAtLeastO()) {
                Preconditions.checkState(PlatformVersion.isAtLeastO());
                String b2 = m78231b();
                if (b2 == null) {
                    b2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(b2);
                    String b3 = C21743d.m78969b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(b2, b3, 4));
                    } else if (!b3.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b3);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                style.setChannelId(b2);
            }
            Notification build = style.build();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, build);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73179a(Context context) {
        new HandlerC21609a(context).sendEmptyMessageDelayed(1, 120000);
    }
}
