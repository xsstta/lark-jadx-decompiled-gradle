package com.ss.android.ad.splash.core.video2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ad.splash.p1244b.C27234a;
import java.lang.ref.WeakReference;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.ss.android.ad.splash.core.video2.i */
public class C27439i {

    /* renamed from: a */
    private AbstractC27441b f68590a;

    /* renamed from: b */
    private C27440a f68591b;

    /* renamed from: c */
    private Context f68592c;

    /* renamed from: d */
    private AudioManager f68593d;

    /* renamed from: e */
    private boolean f68594e;

    /* renamed from: com.ss.android.ad.splash.core.video2.i$b */
    public interface AbstractC27441b {
        /* renamed from: a */
        void mo97981a(int i);
    }

    /* renamed from: c */
    public AbstractC27441b mo97986c() {
        return this.f68590a;
    }

    /* renamed from: b */
    public int mo97985b() {
        AudioManager audioManager = this.f68593d;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(3);
        }
        return 15;
    }

    /* renamed from: d */
    public void mo97987d() {
        this.f68591b = new C27440a(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        m100157a(this.f68592c, this.f68591b, intentFilter);
        this.f68594e = true;
    }

    /* renamed from: e */
    public void mo97988e() {
        if (this.f68594e) {
            try {
                this.f68592c.unregisterReceiver(this.f68591b);
                this.f68590a = null;
                this.f68594e = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public int mo97983a() {
        try {
            AudioManager audioManager = this.f68593d;
            if (audioManager != null) {
                return audioManager.getStreamVolume(3);
            }
            return -1;
        } catch (Exception e) {
            C27234a.m98988a().mo97120a(e, "key_exception_volume_npe");
            return -1;
        }
    }

    /* renamed from: a */
    public void mo97984a(AbstractC27441b bVar) {
        this.f68590a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ad.splash.core.video2.i$a */
    public static class C27440a extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<C27439i> f68595a;

        public C27440a(C27439i iVar) {
            this.f68595a = new WeakReference<>(iVar);
        }

        public void onReceive(Context context, Intent intent) {
            C27439i iVar;
            AbstractC27441b c;
            int a;
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (iVar = this.f68595a.get()) != null && (c = iVar.mo97986c()) != null && (a = iVar.mo97983a()) >= 0) {
                c.mo97981a(a);
            }
        }
    }

    public C27439i(Context context) {
        this.f68592c = context;
        this.f68593d = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m100157a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
