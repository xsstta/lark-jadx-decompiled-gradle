package com.ss.android.lark.mm.module.player.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.app.NotificationCompat;
import androidx.media.p046a.C1225a;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.module.player.notification.C46714f;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45859k;

/* renamed from: com.ss.android.lark.mm.module.player.notification.f */
public class C46714f {

    /* renamed from: a */
    public MediaSessionCompat f117514a;

    /* renamed from: b */
    public MediaControllerCompat f117515b;

    /* renamed from: c */
    public MediaSessionCompat.AbstractC0147a f117516c;

    /* renamed from: d */
    public int f117517d = hashCode();

    /* renamed from: e */
    public Notification f117518e;

    /* renamed from: f */
    private NotificationManager f117519f;

    /* renamed from: g */
    private Bitmap f117520g;

    public C46714f() {
        m184888b();
    }

    /* renamed from: a */
    public void mo164084a() {
        m184886a(C45851c.m181646a()).cancel(this.f117517d);
    }

    /* renamed from: c */
    private Bitmap m184889c() {
        if (this.f117520g == null) {
            this.f117520g = BitmapFactory.decodeResource(C45851c.m181649b(), R.drawable.mm_notification_bg);
        }
        return this.f117520g;
    }

    /* renamed from: b */
    private void m184888b() {
        try {
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(C45851c.m181646a(), "MmServiceProxy");
            this.f117514a = mediaSessionCompat;
            mediaSessionCompat.mo363a(new MediaSessionCompat.AbstractC0147a() {
                /* class com.ss.android.lark.mm.module.player.notification.C46714f.C467151 */

                public static /* synthetic */ void lambda$l6XahFs73riQs8GZ8fT6VAKuhVw(C467151 r0, long j) {
                    r0.m184896c(j);
                }

                /* renamed from: c */
                private /* synthetic */ void m184896c(long j) {
                    if (C46714f.this.f117516c != null) {
                        C46714f.this.f117516c.mo437b(j);
                    }
                }

                @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0147a
                /* renamed from: b */
                public void mo437b(long j) {
                    super.mo437b(j);
                    C46714f.this.f117514a.mo365a(C46707c.m184863a(C46714f.this.f117515b.mo331a(), j));
                    C45859k.m181685a(new Runnable(j) {
                        /* class com.ss.android.lark.mm.module.player.notification.$$Lambda$f$1$l6XahFs73riQs8GZ8fT6VAKuhVw */
                        public final /* synthetic */ long f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C46714f.C467151.lambda$l6XahFs73riQs8GZ8fT6VAKuhVw(C46714f.C467151.this, this.f$1);
                        }
                    });
                }
            });
            this.f117514a.mo366a(true);
            this.f117514a.mo361a(3);
            this.f117514a.mo365a(C46707c.m184862a(0, 1.0f, false));
            this.f117515b = new MediaControllerCompat(C45851c.m181646a(), this.f117514a.mo360a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo164086a(MediaSessionCompat.AbstractC0147a aVar) {
        this.f117516c = aVar;
    }

    /* renamed from: a */
    private NotificationManager m184886a(Context context) {
        if (this.f117519f == null) {
            this.f117519f = (NotificationManager) context.getSystemService("notification");
        }
        return this.f117519f;
    }

    /* renamed from: b */
    public void mo164087b(long j) {
        MediaMetadataCompat.C0116a aVar = new MediaMetadataCompat.C0116a();
        aVar.mo244a("android.media.metadata.DURATION", j);
        this.f117514a.mo362a(aVar.mo246a());
    }

    /* renamed from: a */
    public void mo164085a(long j) {
        this.f117514a.mo365a(C46707c.m184863a(this.f117515b.mo331a(), j));
    }

    /* renamed from: a */
    public Notification mo164083a(String str, boolean z) {
        this.f117518e = mo164082a(C45851c.m181646a(), str, z, this.f117514a.mo360a());
        ((NotificationManager) C45851c.m181646a().getSystemService("notification")).notify(this.f117517d, this.f117518e);
        return this.f117518e;
    }

    /* renamed from: a */
    private NotificationCompat.Action m184887a(Context context, int i, String str, String str2) {
        Intent intent = new Intent();
        intent.setAction(str2);
        return new NotificationCompat.Action(i, str, PendingIntent.getBroadcast(context, 1, intent, 0));
    }

    /* renamed from: a */
    public Notification mo164082a(Context context, String str, boolean z, MediaSessionCompat.Token token) {
        NotificationCompat.Action action;
        if (z) {
            action = m184887a(context, R.drawable.mm_notification_pause, "", "pause");
        } else {
            action = m184887a(context, R.drawable.mm_notification_play, "", "resume");
        }
        return new NotificationCompat.Builder(context, C45899c.m181859a().getHostDepend().mo144646n()).setContentTitle(str).setContentText("").setSmallIcon(R.drawable.ic_notify).setLargeIcon(m184889c()).setOngoing(true).setShowWhen(false).setAutoCancel(false).addAction(m184887a(context, R.drawable.mm_notification_prev15s, "", "prev_15s")).addAction(action).addAction(m184887a(context, R.drawable.mm_notification_next15s, "", "next_15s")).setStyle(new C1225a.C1226a().mo6209a(token).mo6210a(1)).build();
    }
}
