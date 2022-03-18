package com.bytedance.push;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.push.ThreadPlus;
import com.bytedance.push.interfaze.AbstractC20450m;
import com.bytedance.push.p889j.C20464d;
import com.bytedance.push.settings.AbstractC20511a;
import com.bytedance.push.settings.C20520j;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.third.PushChannelHelper;
import com.bytedance.push.third.PushManager;
import com.bytedance.push.utils.C20552c;
import com.ss.android.message.AppProvider;
import com.ss.android.message.NotifyService;
import com.ss.android.message.p3002a.C59436a;
import com.ss.android.pushmanager.p3019a.C59959a;
import com.ss.android.pushmanager.setting.C59971b;
import com.ss.android.ug.bus.C60442b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.push.f */
public class C20410f implements AbstractC20450m {

    /* renamed from: a */
    public C20464d f49892a = new C20464d(this);

    /* renamed from: b */
    private Map<Integer, Boolean> f49893b = new ConcurrentHashMap();

    @Override // com.bytedance.push.interfaze.AbstractC20450m
    /* renamed from: a */
    public void mo68831a() {
        Application app = AppProvider.getApp();
        mo68835b(app);
        m74350e(app);
    }

    C20410f() {
    }

    /* renamed from: e */
    private void m74350e(final Context context) {
        try {
            ((LocalSettings) C20520j.m74724a(context, LocalSettings.class)).registerValChanged(context, "ali_push_type", "integer", new AbstractC20511a() {
                /* class com.bytedance.push.C20410f.C204122 */

                @Override // com.bytedance.push.settings.AbstractC20511a
                /* renamed from: a */
                public void mo68839a() {
                    C20410f.this.mo68835b(context);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.push.interfaze.AbstractC20450m
    /* renamed from: a */
    public void mo68833a(final boolean z) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPlus.submitRunnable(new Runnable() {
                /* class com.bytedance.push.C20410f.RunnableC204111 */

                public void run() {
                    C20410f.this.f49892a.mo68939a(z);
                }
            });
        } else {
            this.f49892a.mo68939a(z);
        }
    }

    /* renamed from: g */
    private void m74352g(final Context context) {
        Intent intent = new Intent(context, NotifyService.class);
        try {
            if (((C59959a.AbstractC59961b) C60442b.m234863a(C59959a.AbstractC59961b.class)).mo68800b()) {
                context.startService(intent);
            }
            context.bindService(intent, new ServiceConnection() {
                /* class com.bytedance.push.C20410f.ServiceConnectionC204133 */

                public void onServiceDisconnected(ComponentName componentName) {
                }

                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    try {
                        context.unbindService(this);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }, 1);
        } catch (Throwable unused) {
            Log.e("SenderService", "start NotifyService failed");
        }
    }

    @Override // com.bytedance.push.interfaze.AbstractC20450m
    /* renamed from: a */
    public boolean mo68834a(Context context) {
        boolean f = m74351f(context);
        if (C59971b.m232728b().mo204208d()) {
            for (Integer num : PushChannelHelper.inst(context).getChannels()) {
                f |= m74346a(context, num.intValue());
            }
            m74352g(context.getApplicationContext());
        } else {
            mo68836c(context);
        }
        return f;
    }

    /* renamed from: b */
    public void mo68835b(Context context) {
        int j = C59971b.m232728b().mo204214j();
        if (j > -1) {
            C20552c.m74851c("registerAliPush: aliPushType = " + j);
            m74349d(context, j);
        }
    }

    @Override // com.bytedance.push.interfaze.AbstractC20450m
    /* renamed from: c */
    public void mo68836c(Context context) {
        for (Integer num : PushChannelHelper.inst(context).getChannels()) {
            m74348c(context, num.intValue());
        }
        this.f49893b.clear();
    }

    @Override // com.bytedance.push.interfaze.AbstractC20450m
    /* renamed from: d */
    public boolean mo68837d(Context context) {
        return !TextUtils.equals(PushChannelHelper.inst(context).buildApplogHeader().toString(), ((LocalFrequencySettings) C20520j.m74724a(context, LocalFrequencySettings.class)).mo69032g());
    }

    /* renamed from: f */
    private boolean m74351f(Context context) {
        int i;
        boolean z = false;
        try {
            if (PushChannelHelper.isServerSupportChannel(PushChannelHelper.inst(context).getTryRegisterChannelId())) {
                if (C20552c.m74848a()) {
                    C20552c.m74845a("PushStart", "registerUmPush process = " + C59436a.m230725a(context));
                }
                i = PushChannelHelper.inst(context).getTryRegisterChannelId();
                z = m74346a(context, PushChannelHelper.inst(context).getTryRegisterChannelId());
            } else {
                i = -1;
            }
            C59971b.m232728b().mo204202a(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return z;
    }

    /* renamed from: b */
    private boolean m74347b(Context context, int i) {
        if (context == null) {
            return false;
        }
        return PushManager.inst().isPushAvailable(context, i);
    }

    /* renamed from: c */
    private void m74348c(Context context, int i) {
        if (context != null) {
            PushManager.inst().unregisterPush(context.getApplicationContext(), i);
        }
    }

    /* renamed from: d */
    private boolean m74349d(Context context, int i) {
        if (!PushChannelHelper.isServerSupportChannel(i) || context == null) {
            return false;
        }
        PushManager.inst().registerPush(context, i);
        return true;
    }

    /* renamed from: a */
    private boolean m74346a(Context context, int i) {
        if (context == null || C59971b.m232728b().mo204211g()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (!PushChannelHelper.isServerSupportChannel(i) || !m74347b(applicationContext, i)) {
            return false;
        }
        synchronized (this) {
            Boolean bool = this.f49893b.get(Integer.valueOf(i));
            if (bool != null && bool.booleanValue()) {
                return true;
            }
            this.f49893b.put(Integer.valueOf(i), true);
            return m74349d(applicationContext, i);
        }
    }

    @Override // com.bytedance.push.interfaze.AbstractC20450m
    /* renamed from: a */
    public void mo68832a(Context context, String str, int i) {
        PushManager.inst().setAlias(context, str, i);
    }
}
