package com.ss.android.lark.integrator.p1999b;

import android.app.Application;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.autoinit.p1381a.C29406a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail_api.IMailApi;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.vc.api.IVCApi;
import dalvik.system.PathClassLoader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.b.a */
public class C39113a extends PathClassLoader {

    /* renamed from: a */
    Map<EnumC39124b, Map<String, String>> f100407a = new ConcurrentHashMap();

    /* renamed from: b */
    Map<EnumC39124b, Map<String, String>> f100408b = new ConcurrentHashMap();

    /* renamed from: c */
    Map<EnumC39124b, Map<String, String>> f100409c = new ConcurrentHashMap();

    /* renamed from: d */
    Map<EnumC39124b, AbstractC39123a> f100410d = new ConcurrentHashMap();

    /* renamed from: e */
    private volatile Set<String> f100411e = Collections.synchronizedSet(new HashSet());

    /* renamed from: f */
    private volatile boolean f100412f = false;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.b.a$a */
    public interface AbstractC39123a {
        /* renamed from: a */
        void mo143003a(String str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.b.a$b */
    public enum EnumC39124b {
        DEFAULT,
        IM,
        CORE,
        PASSPORT,
        MAIL,
        OPEN_PLATFORM,
        VC,
        CALENDAR,
        CCM,
        IMF
    }

    /* renamed from: a */
    private synchronized void m154416a() {
        if (!this.f100412f) {
            this.f100412f = true;
            this.f100407a.put(EnumC39124b.IM, ((IIMApi) ApiUtils.getApi(IIMApi.class)).getAutoInitModuleConfigMap());
            this.f100408b.put(EnumC39124b.IM, ((IIMApi) ApiUtils.getApi(IIMApi.class)).getThirdPartyModuleConfigMap());
            this.f100409c.put(EnumC39124b.IM, ((IIMApi) ApiUtils.getApi(IIMApi.class)).getThirdPartyPrefixModuleConfigMap());
            this.f100410d.put(EnumC39124b.IM, new AbstractC39123a() {
                /* class com.ss.android.lark.integrator.p1999b.C39113a.C391141 */

                @Override // com.ss.android.lark.integrator.p1999b.C39113a.AbstractC39123a
                /* renamed from: a */
                public void mo143003a(String str) {
                    ((IIMApi) ApiUtils.getApi(IIMApi.class)).initProcessorDoInit(str);
                }
            });
            this.f100407a.put(EnumC39124b.IMF, ((IIMApi) ApiUtils.getApi(IIMApi.class)).getIMFAutoInitModuleConfigMap());
            this.f100408b.put(EnumC39124b.IMF, ((IIMApi) ApiUtils.getApi(IIMApi.class)).getIMFThirdPartyModuleConfigMap());
            this.f100409c.put(EnumC39124b.IMF, ((IIMApi) ApiUtils.getApi(IIMApi.class)).getIMFThirdPartyPrefixModuleConfigMap());
            this.f100410d.put(EnumC39124b.IMF, new AbstractC39123a() {
                /* class com.ss.android.lark.integrator.p1999b.C39113a.C391152 */

                @Override // com.ss.android.lark.integrator.p1999b.C39113a.AbstractC39123a
                /* renamed from: a */
                public void mo143003a(String str) {
                    ((IIMApi) ApiUtils.getApi(IIMApi.class)).imfInitProcessorDoInit(str);
                }
            });
            this.f100407a.put(EnumC39124b.CORE, ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getAutoInitModuleConfigMap());
            this.f100408b.put(EnumC39124b.CORE, ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getThirdPartyModuleConfigMap());
            this.f100409c.put(EnumC39124b.CORE, ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getThirdPartyPrefixModuleConfigMap());
            this.f100410d.put(EnumC39124b.CORE, new AbstractC39123a() {
                /* class com.ss.android.lark.integrator.p1999b.C39113a.C391163 */

                @Override // com.ss.android.lark.integrator.p1999b.C39113a.AbstractC39123a
                /* renamed from: a */
                public void mo143003a(String str) {
                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initProcessorDoInit(str);
                }
            });
            this.f100407a.put(EnumC39124b.PASSPORT, ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getAutoInitModuleConfigMap());
            this.f100408b.put(EnumC39124b.PASSPORT, ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getThirdPartyModuleConfigMap());
            this.f100409c.put(EnumC39124b.PASSPORT, ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getThirdPartyPrefixModuleConfigMap());
            this.f100410d.put(EnumC39124b.PASSPORT, new AbstractC39123a() {
                /* class com.ss.android.lark.integrator.p1999b.C39113a.C391174 */

                @Override // com.ss.android.lark.integrator.p1999b.C39113a.AbstractC39123a
                /* renamed from: a */
                public void mo143003a(String str) {
                    ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).initProcessorDoInit(str);
                }
            });
            this.f100407a.put(EnumC39124b.MAIL, ((IMailApi) ApiUtils.getApi(IMailApi.class)).getAutoInitModuleConfigMap());
            this.f100408b.put(EnumC39124b.MAIL, ((IMailApi) ApiUtils.getApi(IMailApi.class)).getThirdPartyModuleConfigMap());
            this.f100409c.put(EnumC39124b.MAIL, ((IMailApi) ApiUtils.getApi(IMailApi.class)).getThirdPartyPrefixModuleConfigMap());
            this.f100410d.put(EnumC39124b.MAIL, new AbstractC39123a() {
                /* class com.ss.android.lark.integrator.p1999b.C39113a.C391185 */

                @Override // com.ss.android.lark.integrator.p1999b.C39113a.AbstractC39123a
                /* renamed from: a */
                public void mo143003a(String str) {
                    ((IMailApi) ApiUtils.getApi(IMailApi.class)).initProcessorDoInit(str);
                }
            });
            this.f100407a.put(EnumC39124b.OPEN_PLATFORM, ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getAutoInitModuleConfigMap());
            this.f100408b.put(EnumC39124b.OPEN_PLATFORM, ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getThirdPartyModuleConfigMap());
            this.f100409c.put(EnumC39124b.OPEN_PLATFORM, ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getThirdPartyPrefixModuleConfigMap());
            this.f100410d.put(EnumC39124b.OPEN_PLATFORM, new AbstractC39123a() {
                /* class com.ss.android.lark.integrator.p1999b.C39113a.C391196 */

                @Override // com.ss.android.lark.integrator.p1999b.C39113a.AbstractC39123a
                /* renamed from: a */
                public void mo143003a(String str) {
                    ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).initProcessorDoInit(str);
                }
            });
            this.f100407a.put(EnumC39124b.VC, ((IVCApi) ApiUtils.getApi(IVCApi.class)).getAutoInitModuleConfigMap());
            this.f100408b.put(EnumC39124b.VC, ((IVCApi) ApiUtils.getApi(IVCApi.class)).getThirdPartyModuleConfigMap());
            this.f100409c.put(EnumC39124b.VC, ((IVCApi) ApiUtils.getApi(IVCApi.class)).getThirdPartyPrefixModuleConfigMap());
            this.f100410d.put(EnumC39124b.VC, new AbstractC39123a() {
                /* class com.ss.android.lark.integrator.p1999b.C39113a.C391207 */

                @Override // com.ss.android.lark.integrator.p1999b.C39113a.AbstractC39123a
                /* renamed from: a */
                public void mo143003a(String str) {
                    ((IVCApi) ApiUtils.getApi(IVCApi.class)).initProcessorDoInit(str);
                }
            });
            this.f100407a.put(EnumC39124b.CALENDAR, ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getAutoInitModuleConfigMap());
            this.f100408b.put(EnumC39124b.CALENDAR, ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getThirdPartyModuleConfigMap());
            this.f100409c.put(EnumC39124b.CALENDAR, ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getThirdPartyPrefixModuleConfigMap());
            this.f100410d.put(EnumC39124b.CALENDAR, new AbstractC39123a() {
                /* class com.ss.android.lark.integrator.p1999b.C39113a.C391218 */

                @Override // com.ss.android.lark.integrator.p1999b.C39113a.AbstractC39123a
                /* renamed from: a */
                public void mo143003a(String str) {
                    ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).initProcessorDoInit(str);
                }
            });
            this.f100407a.put(EnumC39124b.CCM, ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getAutoInitModuleConfigMap());
            this.f100408b.put(EnumC39124b.CCM, ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getThirdPartyModuleConfigMap());
            this.f100409c.put(EnumC39124b.CCM, ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getThirdPartyPrefixModuleConfigMap());
            this.f100410d.put(EnumC39124b.CCM, new AbstractC39123a() {
                /* class com.ss.android.lark.integrator.p1999b.C39113a.C391229 */

                @Override // com.ss.android.lark.integrator.p1999b.C39113a.AbstractC39123a
                /* renamed from: a */
                public void mo143003a(String str) {
                    ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).initProcessorDoInit(str);
                }
            });
        }
    }

    public C39113a(ClassLoader classLoader) {
        super("", "", classLoader);
    }

    /* renamed from: a */
    private void m154417a(EnumC39124b bVar, String str) {
        if (str != null) {
            try {
                this.f100410d.get(bVar).mo143003a(str);
            } catch (Exception e) {
                if (C26284k.m95185a(LarkContext.getApplication())) {
                    Application application = LarkContext.getApplication();
                    LKUIToast.show(application, "messenger module init failed - " + str);
                }
                Log.m165387e("ModuleAutoInitClassLoader", (Throwable) e, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        Class<?> loadClass = super.loadClass(str, z);
        if (this.f100411e.contains(str)) {
            return loadClass;
        }
        this.f100411e.add(str);
        m154416a();
        for (Map.Entry<EnumC39124b, Map<String, String>> entry : this.f100408b.entrySet()) {
            if (entry.getValue().containsKey(str)) {
                m154417a(entry.getKey(), entry.getValue().get(str));
                return loadClass;
            }
        }
        String a = C29406a.m108180a(str);
        if (a != null) {
            for (Map.Entry<EnumC39124b, Map<String, String>> entry2 : this.f100407a.entrySet()) {
                if (entry2.getValue().containsKey(a)) {
                    m154417a(entry2.getKey(), entry2.getValue().get(a));
                    return loadClass;
                }
            }
        }
        Iterator<Map.Entry<EnumC39124b, Map<String, String>>> it = this.f100409c.entrySet().iterator();
        loop2:
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<EnumC39124b, Map<String, String>> next = it.next();
            Iterator<Map.Entry<String, String>> it2 = next.getValue().entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry<String, String> next2 = it2.next();
                    String key = next2.getKey();
                    if (!(TextUtils.isEmpty(key) || TextUtils.isEmpty(str) || !str.startsWith(key))) {
                        m154417a(next.getKey(), next2.getValue());
                        break loop2;
                    }
                }
            }
        }
        return loadClass;
    }
}
