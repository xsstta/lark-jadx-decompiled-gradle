package com.ss.android.lark.larkconfig.userconfig;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.AppConfig;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.ExternalSearch;
import com.bytedance.lark.pb.basic.v1.GetAppConfigRequest;
import com.bytedance.lark.pb.basic.v1.GetAppConfigResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.biz.core.api.AbstractC29560g;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.ExternalSearchConfig;
import com.ss.android.lark.larkconfig.larksetting.C41164c;
import com.ss.android.lark.larkconfig.universal.UniversalUserSettingService;
import com.ss.android.lark.larkconfig.userconfig.C41223d;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.C57744a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.larkconfig.userconfig.e */
public class C41227e {

    /* renamed from: a */
    public Map<AbstractC29560g, Object> f105000a;

    /* renamed from: b */
    private final Object f105001b;

    /* renamed from: c */
    private final Object f105002c;

    /* renamed from: d */
    private volatile C29550b f105003d;

    /* renamed from: e */
    private volatile String f105004e;

    /* renamed from: f */
    private AbstractC41237g f105005f;

    /* renamed from: g */
    private AtomicBoolean f105006g;

    /* renamed from: h */
    private boolean f105007h;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.larkconfig.userconfig.e$a */
    public static class C41232a {

        /* renamed from: a */
        public static C41227e f105014a = new C41227e();
    }

    /* renamed from: a */
    public static C41227e m163488a() {
        return C41232a.f105014a;
    }

    /* renamed from: e */
    public void mo148584e() {
        m163496l();
    }

    /* renamed from: g */
    private void m163491g() {
        m163496l();
        m163497m();
    }

    /* renamed from: h */
    private void m163492h() {
        C41164c.m163343a().mo148464b();
    }

    /* renamed from: i */
    private void m163493i() {
        C41164c.m163343a().mo148465c();
    }

    /* renamed from: j */
    private void m163494j() {
        UniversalUserSettingService.f104921a.mo148390c();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m163499o() {
        mo148582c();
        mo148580b();
    }

    /* renamed from: d */
    public C29550b mo148583d() {
        return m163495k();
    }

    /* renamed from: k */
    private C29550b m163495k() {
        if (TextUtils.equals(C41222c.m163478a().mo148552a(), this.f105004e)) {
            return this.f105003d;
        }
        return null;
    }

    /* renamed from: f */
    public void mo148585f() {
        C41223d.m163482a().mo148573b();
        C41223d.m163482a().mo148571a(new C41223d.AbstractC41226b() {
            /* class com.ss.android.lark.larkconfig.userconfig.C41227e.C412292 */

            @Override // com.ss.android.lark.larkconfig.userconfig.C41223d.AbstractC41226b
            /* renamed from: a */
            public void mo148574a(GetAppConfigResponse getAppConfigResponse) {
                String a = C41222c.m163478a().mo148552a();
                C29550b a2 = C41227e.this.mo148575a(getAppConfigResponse);
                if (a2 != null) {
                    C41227e.this.mo148579a(a, a2);
                    C41227e.this.mo148576a(a2);
                }
            }
        });
    }

    private C41227e() {
        this.f105001b = new Object();
        this.f105002c = new Object();
        this.f105000a = new ConcurrentHashMap();
        this.f105006g = new AtomicBoolean(false);
        this.f105007h = false;
        this.f105005f = new AbstractC41237g() {
            /* class com.ss.android.lark.larkconfig.userconfig.$$Lambda$e$CjKb6N0P24CwXxi1bgh2SM_kfA */

            @Override // com.ss.android.lark.larkconfig.userconfig.AbstractC41237g
            public final void onAccountChange() {
                C41227e.this.m163499o();
            }
        };
    }

    /* renamed from: l */
    private void m163496l() {
        if (!this.f105006g.get()) {
            synchronized (this.f105001b) {
                if (m163495k() == null) {
                    String a = C41222c.m163478a().mo148552a();
                    this.f105003d = (C29550b) C57744a.m224104a().getJSONObject(m163489a(a), C29550b.class);
                    if (this.f105003d != null) {
                        this.f105004e = a;
                        C53241h.m205898b("AppUserConfigService", "loaded from local");
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private void m163497m() {
        String a = C41222c.m163478a().mo148552a();
        GetAppConfigRequest.C14959a aVar = new GetAppConfigRequest.C14959a();
        aVar.mo54724a(true);
        SdkSender.asynSendRequestNonWrap(Command.GET_APP_CONFIG, aVar, new IGetDataCallback<C29550b>() {
            /* class com.ss.android.lark.larkconfig.userconfig.C41227e.C412281 */

            /* renamed from: a */
            public void onSuccess(C29550b bVar) {
                if (bVar != null) {
                    C53241h.m205898b("AppUserConfigService", "load from server sucess");
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205898b("AppUserConfigService", "load from server error, errorResult is " + errorResult.getDisplayMsg());
            }
        }, new SdkSender.IParser(a) {
            /* class com.ss.android.lark.larkconfig.userconfig.$$Lambda$e$cKhxB40mBJh635r8leFyd58M */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C41227e.this.m163487a((C41227e) this.f$1, (String) bArr);
            }
        });
    }

    /* renamed from: b */
    public void mo148580b() {
        C53241h.m205898b("AppUserConfigService", "init");
        C41216a.m163456b();
        synchronized (this.f105002c) {
            if (!this.f105007h) {
                m163492h();
                m163494j();
                m163491g();
                C41222c.m163478a().mo148553a(this.f105005f);
                this.f105007h = true;
            }
        }
    }

    /* renamed from: c */
    public void mo148582c() {
        synchronized (this.f105002c) {
            m163493i();
            this.f105007h = false;
            this.f105003d = null;
            this.f105004e = null;
            this.f105006g.set(false);
            C41222c.m163478a().mo148554b(this.f105005f);
        }
    }

    /* renamed from: a */
    public void mo148576a(final C29550b bVar) {
        CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
            /* class com.ss.android.lark.larkconfig.userconfig.C41227e.RunnableC412303 */

            public void run() {
                for (final AbstractC29560g gVar : C41227e.this.f105000a.keySet()) {
                    CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                        /* class com.ss.android.lark.larkconfig.userconfig.C41227e.RunnableC412303.RunnableC412311 */

                        public void run() {
                            gVar.notifyCacheUpdated(bVar);
                        }
                    });
                }
            }
        });
    }

    /* renamed from: b */
    public void mo148581b(AbstractC29560g gVar) {
        if (gVar != null) {
            this.f105000a.remove(gVar);
        }
    }

    /* renamed from: a */
    private String m163489a(String str) {
        return String.format("%s_%s", str, "key_app_config_v1");
    }

    /* renamed from: a */
    private List<ExternalSearchConfig> m163490a(List<ExternalSearch> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (ExternalSearch externalSearch : list) {
            if (externalSearch != null) {
                arrayList.add(new ExternalSearchConfig(externalSearch.id, externalSearch.title, externalSearch.icon_url));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo148577a(AbstractC29560g gVar) {
        if (gVar != null) {
            this.f105000a.put(gVar, new Object());
        }
    }

    /* renamed from: a */
    public C29550b mo148575a(GetAppConfigResponse getAppConfigResponse) {
        String str;
        AppConfig appConfig = getAppConfigResponse.app_config;
        if (appConfig == null) {
            return null;
        }
        C29550b bVar = new C29550b();
        if (appConfig.chat_config != null) {
            bVar.mo105626a(appConfig.chat_config.max_member_count.intValue());
            bVar.mo105648e(appConfig.chat_config.withdraw_chatter_expiration_by_hour.intValue());
            bVar.mo105649f(appConfig.chat_config.max_origin_group_chat_user_count_4_create_external_chat.intValue());
        } else {
            bVar.mo105626a(AppConfig.ChatConfig.DEFAULT_MAX_MEMBER_COUNT.intValue());
            bVar.mo105648e(AppConfig.ChatConfig.DEFAULT_WITHDRAW_CHATTER_EXPIRATION_BY_HOUR.intValue());
            bVar.mo105649f(AppConfig.ChatConfig.DEFAULT_MAX_ORIGIN_GROUP_CHAT_USER_COUNT_4_CREATE_EXTERNAL_CHAT.intValue());
        }
        if (appConfig.message_config != null) {
            bVar.mo105627a(appConfig.message_config.max_recall_time_limit.longValue());
        } else {
            bVar.mo105627a(AppConfig.MessageConfig.DEFAULT_MAX_RECALL_TIME_LIMIT.longValue());
        }
        if (appConfig.voice_call_config != null) {
            bVar.mo105632b(appConfig.voice_call_config.heartbeat_cycle.intValue());
            bVar.mo105638c(appConfig.voice_call_config.heartbeat_expired_time.intValue());
        } else {
            bVar.mo105632b(AppConfig.VoiceCallConfig.DEFAULT_HEARTBEAT_CYCLE.intValue());
            bVar.mo105638c(AppConfig.VoiceCallConfig.DEFAULT_HEARTBEAT_EXPIRED_TIME.intValue());
        }
        if (appConfig.url_config != null) {
            if (appConfig.url_config.domain != null) {
                str = appConfig.url_config.domain.domain;
            } else {
                str = "";
            }
            bVar.mo105634b(str);
            List<AppConfig.URLConfig.Domain> list = appConfig.url_config.doc_domains;
            ArrayList arrayList = new ArrayList();
            for (AppConfig.URLConfig.Domain domain : list) {
                arrayList.add(domain.domain);
            }
            bVar.mo105628a(arrayList);
            bVar.mo105639c(appConfig.url_config.create_doc_addr);
        }
        if (appConfig.zendesk != null) {
            if (!TextUtils.isEmpty(appConfig.zendesk.web_form_url)) {
                bVar.mo105645d(appConfig.zendesk.web_form_url);
            }
            if (appConfig.zendesk.oncall_chat != null) {
                bVar.mo105630a(appConfig.zendesk.oncall_chat.booleanValue());
            }
        }
        if (appConfig.resource != null) {
            HashMap hashMap = new HashMap();
            if (!CollectionUtils.isEmpty(appConfig.resource.addrs)) {
                for (String str2 : appConfig.resource.addrs.keySet()) {
                    hashMap.put(str2, appConfig.resource.addrs.get(str2));
                }
            }
            String string = SettingManager.getInstance().getString(ClientDynamicLink.class);
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject.optString(next));
                    }
                } catch (Exception e) {
                    C53241h.m205895a("AppUserConfigService", "parse ClientDynamicLink failed", e);
                }
            }
            bVar.mo105629a(hashMap);
        }
        if (appConfig.android_app_stores != null) {
            bVar.mo105635b(appConfig.android_app_stores);
        }
        if (appConfig.guide_to_rate_delay_hours != null) {
            bVar.mo105644d(appConfig.guide_to_rate_delay_hours.intValue());
        }
        if (appConfig.billing_package != null) {
            bVar.mo105637b(appConfig.billing_package.is_enable_auto_translation.booleanValue());
        }
        if (appConfig.billing_package != null) {
            bVar.mo105646d(appConfig.billing_package.has_secret_chat.booleanValue());
        }
        if (appConfig.billing_package != null) {
            bVar.mo105641c(appConfig.billing_package.is_lark_hongbao_enable.booleanValue());
        }
        if (appConfig.search_config != null) {
            bVar.mo105640c(m163490a(appConfig.search_config.external_searches));
        }
        if (appConfig.banner_config != null) {
            bVar.mo105633b((long) appConfig.banner_config.notification_refresh_time.intValue());
        }
        if (appConfig.url_regex != null) {
            bVar.mo105636b(appConfig.url_regex.regexes);
        }
        if (appConfig.crypto_chat_state != null) {
            bVar.mo105651g(appConfig.crypto_chat_state.getValue());
        }
        return bVar;
    }

    /* renamed from: a */
    public void mo148578a(String str, IGetDataCallback<String> iGetDataCallback) {
        C41216a.m163455a().mo148549a(str, iGetDataCallback);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ C29550b m163487a(String str, byte[] bArr) throws IOException {
        C29550b a = mo148575a(GetAppConfigResponse.ADAPTER.decode(bArr));
        if (a != null) {
            mo148579a(str, a);
            mo148576a(a);
        }
        return a;
    }

    /* renamed from: a */
    public void mo148579a(String str, C29550b bVar) {
        synchronized (this.f105001b) {
            C57744a.m224104a().putJSONObject(m163489a(str), bVar);
            if (TextUtils.equals(C41222c.m163478a().mo148552a(), str)) {
                this.f105003d = bVar;
                this.f105004e = str;
                this.f105006g.set(true);
            }
        }
    }
}
