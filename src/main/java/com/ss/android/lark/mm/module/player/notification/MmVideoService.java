package com.ss.android.lark.mm.module.player.notification;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;

public class MmVideoService extends Service {

    /* renamed from: a */
    public AbstractBinderC46708d f117496a;

    /* renamed from: b */
    public C46714f f117497b;

    /* renamed from: c */
    public String f117498c;

    /* renamed from: d */
    private long f117499d;

    public void onCreate() {
        super.onCreate();
        C45855f.m181663b("MmVideoService@", "onCreate");
        m184846a();
    }

    /* renamed from: a */
    private void m184846a() {
        C46714f fVar = new C46714f();
        this.f117497b = fVar;
        fVar.mo164086a(new MediaSessionCompat.AbstractC0147a() {
            /* class com.ss.android.lark.mm.module.player.notification.MmVideoService.C467031 */

            @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0147a
            /* renamed from: b */
            public void mo437b(long j) {
                AbstractC46705a c;
                if (MmVideoService.this.f117496a != null && (c = MmVideoService.this.f117496a.mo164067c()) != null) {
                    c.mo164064a(j);
                }
            }
        });
        this.f117496a = new AbstractBinderC46708d() {
            /* class com.ss.android.lark.mm.module.player.notification.MmVideoService.BinderC467042 */

            @Override // com.ss.android.lark.mm.module.player.notification.AbstractBinderC46708d
            /* renamed from: a */
            public void mo164059a() {
                MmVideoService.this.f117497b.mo164083a(MmVideoService.this.f117498c, false);
            }

            @Override // com.ss.android.lark.mm.module.player.notification.AbstractBinderC46708d
            /* renamed from: b */
            public void mo164062b() {
                MmVideoService.this.f117497b.mo164083a(MmVideoService.this.f117498c, true);
            }

            @Override // com.ss.android.lark.mm.module.player.notification.AbstractBinderC46708d
            /* renamed from: a */
            public void mo164060a(long j) {
                MmVideoService.this.f117497b.mo164085a(j);
            }

            @Override // com.ss.android.lark.mm.module.player.notification.AbstractBinderC46708d
            /* renamed from: a */
            public void mo164061a(AbstractC46705a aVar) {
                if (!(this.f117502a == null || this.f117502a == aVar)) {
                    this.f117502a.mo164063a();
                }
                this.f117502a = aVar;
            }
        };
    }

    public void onDestroy() {
        C45855f.m181663b("MmVideoService@", "onDestroy");
        super.onDestroy();
        AbstractBinderC46708d dVar = this.f117496a;
        if (dVar != null) {
            dVar.mo164061a((AbstractC46705a) null);
            this.f117496a = null;
            stopForeground(true);
            this.f117497b.mo164086a((MediaSessionCompat.AbstractC0147a) null);
            this.f117497b.mo164084a();
        }
    }

    public IBinder onBind(Intent intent) {
        C45855f.m181663b("MmVideoService@", "onBind");
        return this.f117496a;
    }

    public void unbindService(ServiceConnection serviceConnection) {
        C45855f.m181663b("MmVideoService@", "unbindService");
        super.unbindService(serviceConnection);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m184847a(String str, Intent intent) {
        if ("foreground".equals(str)) {
            startForeground(this.f117497b.f117517d, this.f117497b.f117518e);
        } else if ("pause".equals(str)) {
            this.f117497b.mo164083a(this.f117498c, false);
            AbstractBinderC46708d dVar = this.f117496a;
            if (dVar != null && dVar.mo164067c() != null) {
                this.f117496a.mo164067c().mo164063a();
            }
        } else if ("resume".equals(str)) {
            this.f117497b.mo164083a(this.f117498c, true);
            AbstractBinderC46708d dVar2 = this.f117496a;
            if (dVar2 != null && dVar2.mo164067c() != null) {
                this.f117496a.mo164067c().mo164065b();
            }
        } else if ("update_mm_meta".equals(str)) {
            this.f117498c = intent.getStringExtra("key_title");
            this.f117499d = intent.getLongExtra("key_duration", 0);
            long longExtra = intent.getLongExtra("key_position", 0);
            this.f117497b.mo164087b(this.f117499d);
            this.f117497b.mo164085a(longExtra);
            this.f117497b.mo164083a(this.f117498c, false);
        } else if ("stop_service".equals(str)) {
            stopSelf();
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            return super.onStartCommand(intent, i, i2);
        }
        String action = intent.getAction();
        C45855f.m181663b("MmVideoService@", "onStartCommand " + action);
        C45859k.m181685a(new Runnable(action, intent) {
            /* class com.ss.android.lark.mm.module.player.notification.$$Lambda$MmVideoService$oR1LFXM7qjRA3ptgTVk9VCrnXMM */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Intent f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                MmVideoService.lambda$oR1LFXM7qjRA3ptgTVk9VCrnXMM(MmVideoService.this, this.f$1, this.f$2);
            }
        });
        return super.onStartCommand(intent, i, i2);
    }
}
