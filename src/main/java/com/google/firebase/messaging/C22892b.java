package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C22890a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.b */
public class C22892b {

    /* renamed from: a */
    private final Executor f56595a;

    /* renamed from: b */
    private final Context f56596b;

    /* renamed from: c */
    private final C22907n f56597c;

    /* renamed from: c */
    private C22904k m83166c() {
        C22904k a = C22904k.m83181a(this.f56597c.mo79506a("gcm.n.image"));
        if (a != null) {
            a.mo79500a(this.f56595a);
        }
        return a;
    }

    /* renamed from: b */
    private boolean m83165b() {
        if (((KeyguardManager) this.f56596b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f56596b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo79491a() {
        if (this.f56597c.mo79509b("gcm.n.noui")) {
            return true;
        }
        if (m83165b()) {
            return false;
        }
        C22904k c = m83166c();
        C22890a.C22891a a = C22890a.m83154a(this.f56596b, this.f56597c);
        m83163a(a.f56592a, c);
        m83164a(a);
        return true;
    }

    /* renamed from: a */
    private void m83164a(C22890a.C22891a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f56596b.getSystemService("notification")).notify(aVar.f56593b, aVar.f56594c, aVar.f56592a.build());
    }

    /* renamed from: a */
    private void m83163a(NotificationCompat.Builder builder, C22904k kVar) {
        if (kVar != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.await(kVar.mo79499a(), 5, TimeUnit.SECONDS);
                builder.setLargeIcon(bitmap);
                builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon(null));
            } catch (ExecutionException e) {
                String valueOf = String.valueOf(e.getCause());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Failed to download image: ");
                sb.append(valueOf);
                Log.w("FirebaseMessaging", sb.toString());
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                kVar.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                kVar.close();
            }
        }
    }

    public C22892b(Context context, C22907n nVar, Executor executor) {
        this.f56595a = executor;
        this.f56596b = context;
        this.f56597c = nVar;
    }
}
