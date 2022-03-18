package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: androidx.media.session.MediaButtonReceiver$a */
    private static class C1238a extends MediaBrowserCompat.C0091b {

        /* renamed from: c */
        private final Context f4459c;

        /* renamed from: d */
        private final Intent f4460d;

        /* renamed from: e */
        private final BroadcastReceiver.PendingResult f4461e;

        /* renamed from: f */
        private MediaBrowserCompat f4462f;

        @Override // android.support.v4.media.MediaBrowserCompat.C0091b
        /* renamed from: b */
        public void mo168b() {
            m5604d();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0091b
        /* renamed from: c */
        public void mo169c() {
            m5604d();
        }

        /* renamed from: d */
        private void m5604d() {
            this.f4462f.mo154b();
            this.f4461e.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0091b
        /* renamed from: a */
        public void mo166a() {
            try {
                new MediaControllerCompat(this.f4459c, this.f4462f.mo155c()).mo332a((KeyEvent) this.f4460d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException e) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e);
            }
            m5604d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6230a(MediaBrowserCompat mediaBrowserCompat) {
            this.f4462f = mediaBrowserCompat;
        }

        C1238a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f4459c = context;
            this.f4460d = intent;
            this.f4461e = pendingResult;
        }
    }

    /* renamed from: a */
    public static ComponentName m5601a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ResolveInfo resolveInfo = queryBroadcastReceivers.get(0);
            return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        } else if (queryBroadcastReceivers.size() <= 1) {
            return null;
        } else {
            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            return null;
        }
    }

    /* renamed from: a */
    private static void m5603a(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName a = m5602a(context, "android.intent.action.MEDIA_BUTTON");
        if (a != null) {
            intent.setComponent(a);
            m5603a(context, intent);
            return;
        }
        ComponentName a2 = m5602a(context, "android.media.browse.MediaBrowserService");
        if (a2 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C1238a aVar = new C1238a(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a2, aVar, null);
            aVar.mo6230a(mediaBrowserCompat);
            mediaBrowserCompat.mo153a();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }

    /* renamed from: a */
    private static ComponentName m5602a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = queryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }
}
