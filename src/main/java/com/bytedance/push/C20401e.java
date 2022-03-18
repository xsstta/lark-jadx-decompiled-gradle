package com.bytedance.push;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.push.interfaze.AbstractC20446i;
import com.bytedance.push.interfaze.AbstractC20452o;
import com.bytedance.push.log.C20473b;
import com.bytedance.push.p879a.C20381a;
import com.bytedance.push.p882d.C20397a;
import com.bytedance.push.p882d.C20398b;
import com.bytedance.push.p884f.p885a.AbstractC20415a;
import com.bytedance.push.p886g.C20433a;
import com.bytedance.push.p890k.C20468b;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.bytedance.push.settings.C20520j;
import com.bytedance.push.third.C20547e;
import com.bytedance.push.third.PushManager;
import com.bytedance.push.utils.C20552c;
import com.ss.android.message.AppProvider;
import com.ss.android.message.C59438c;
import com.ss.android.message.p3002a.C59436a;
import com.ss.android.pushmanager.C59958a;
import com.ss.android.pushmanager.setting.C59971b;
import com.ss.android.ug.bus.C60442b;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.e */
public class C20401e implements AbstractC20446i {

    /* renamed from: a */
    private C20386c f49856a;

    /* renamed from: b */
    private final AtomicBoolean f49857b = new AtomicBoolean(false);

    /* renamed from: c */
    private final AtomicBoolean f49858c = new AtomicBoolean(false);

    @Override // com.bytedance.push.interfaze.AbstractC20446i
    /* renamed from: a */
    public AbstractC20452o mo68801a() {
        return PushSupporter.get();
    }

    /* renamed from: b */
    private void m74318b(Context context) {
        AliveOnlineSettings aliveOnlineSettings = (AliveOnlineSettings) C20520j.m74724a(context, AliveOnlineSettings.class);
        aliveOnlineSettings.mo69007e(false);
        aliveOnlineSettings.mo69005c(false);
        aliveOnlineSettings.mo69006d(true);
        aliveOnlineSettings.mo69004b(false);
    }

    /* renamed from: a */
    private boolean m74317a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        String str = map.get("device_id");
        String str2 = map.get("device_login_id");
        String str3 = map.get("install_id");
        if (StringUtils.isEmpty(map.get("clientudid")) || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            return false;
        }
        C59971b.m232728b().mo204204a(map);
        return true;
    }

    /* renamed from: a */
    public void mo68802a(Context context) {
        try {
            String f = C59971b.m232728b().mo204210f();
            if (!StringUtils.isEmpty(f)) {
                PushSupporter.thirdService().sendMonitor(context, "ss_push", new JSONObject(f));
                C59971b.m232728b().mo204203a("");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.push.interfaze.AbstractC20446i
    /* renamed from: a */
    public void mo68804a(C20386c cVar) {
        if (!this.f49857b.getAndSet(true)) {
            if (cVar.f49770A != null) {
                C60442b.m234864a(AbstractC20415a.class, cVar.f49770A);
                cVar.f49770A.mo68843a();
            }
            this.f49856a = cVar;
            C20552c.m74847a(cVar.f49784f);
            C20552c.m74842a(cVar.f49785g);
            if (!TextUtils.isEmpty(cVar.f49793o)) {
                C59958a.m232687b(cVar.f49793o);
            }
            C59436a.m230736c(this.f49856a.f49787i);
            AppProvider.initApp(this.f49856a.f49779a);
            C20433a aVar = new C20433a(this.f49856a);
            PushSupporter.get().init(cVar, aVar);
            C20397a aVar2 = new C20397a(this.f49856a);
            C20398b.m74309a(cVar, aVar, aVar2);
            C20547e.m74826a().mo69184a(cVar.f49790l);
            C20547e.m74826a().mo69180a(this.f49856a.f49779a, aVar2);
            if (TextUtils.equals(cVar.f49787i, this.f49856a.f49779a.getPackageName())) {
                if (cVar.f49803y) {
                    m74318b(cVar.f49779a);
                }
            } else if (cVar.f49787i.endsWith(":pushservice")) {
                mo68801a().getSenderService().mo68831a();
                C20381a.m74252a(this.f49856a.f49779a).mo68748a();
            } else if (cVar.f49787i.endsWith(":push")) {
                C20381a.m74252a(this.f49856a.f49779a).mo68748a();
            }
            PushSupporter.monitor().init();
        }
    }

    /* renamed from: a */
    private boolean m74316a(String str, Context context) {
        boolean checkThirdPushConfig = PushManager.inst().checkThirdPushConfig(str, context);
        if (checkThirdPushConfig) {
            C20552c.m74852c(str, "configuration correct");
        } else {
            C20552c.m74850b(str, "configuration error!!!");
        }
        return checkThirdPushConfig;
    }

    /* renamed from: a */
    private void m74315a(final Context context, final AbstractC20452o oVar) {
        if (C20552c.m74848a() && !m74316a("BDPush", this.f49856a.f49779a)) {
            C20552c.m74846a("BDPush", "startOnce", new IllegalArgumentException("configuration error，please filter \"BDPush\" in logcat to correct the error"));
        }
        oVar.getNotificationService().mo68916a(context, this.f49856a.f49789k);
        C59438c.m230748a().mo202704a(new Runnable() {
            /* class com.bytedance.push.C20401e.RunnableC204021 */

            public void run() {
                oVar.getNotificationService().mo68915a(context);
                C20473b.m74509a(context);
                C20401e.this.mo68802a(context);
            }
        }, TimeUnit.SECONDS.toMillis(15));
    }

    @Override // com.bytedance.push.interfaze.AbstractC20446i
    /* renamed from: a */
    public void mo68805a(Map<String, String> map, boolean z) {
        Application application = this.f49856a.f49779a;
        if (C59436a.m230732b(application)) {
            C20552c.m74853d("Start", "ssidsMap = [" + map + "] forceUpdate = " + z);
            if (m74317a(map)) {
                AbstractC20452o a = mo68801a();
                if (this.f49858c.compareAndSet(false, true)) {
                    AbstractC20415a aVar = (AbstractC20415a) C60442b.m234863a(AbstractC20415a.class);
                    if (aVar != null) {
                        aVar.mo68850c();
                    }
                    C20381a.m74252a(this.f49856a.f49779a).mo68750b();
                    m74315a(application, a);
                    new C20468b(a, this.f49856a.f49804z).mo68941a();
                }
                a.getMonitor().monitorStart();
                a.getSenderService().mo68833a(z);
                C20547e.m74826a().mo69181a(application, map);
            }
        }
    }

    @Override // com.bytedance.push.interfaze.AbstractC20446i
    /* renamed from: a */
    public void mo68803a(Context context, long j, String str, String str2, boolean z, JSONObject jSONObject) {
        mo68801a().getPushHandler().trackClickPush(context, j, str, str2, z, jSONObject);
    }
}
