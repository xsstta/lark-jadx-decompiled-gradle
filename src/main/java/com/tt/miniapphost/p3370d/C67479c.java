package com.tt.miniapphost.p3370d;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.tt.miniapphost.d.c */
public class C67479c {

    /* renamed from: a */
    private List<WeakReference<AbstractC67477a>> f170109a = new LinkedList();

    /* renamed from: b */
    private Locale f170110b;

    /* renamed from: b */
    public Locale mo234228b() {
        return this.f170110b;
    }

    /* renamed from: a */
    public static C67479c m262467a() {
        return ContextSingletonInstance.getInstance().getLocaleManager();
    }

    /* renamed from: c */
    public Locale mo234230c() {
        Locale locale = this.f170110b;
        if (locale != null) {
            return locale;
        }
        return m262468a(AppbrandContext.getInst().getApplicationContext());
    }

    /* renamed from: e */
    public void mo234232e() {
        AppBrandLogger.m52828d("LocaleManager", "syncLocaleSettingWithHostProcess");
        C67556a.m262932a(new AbstractC67565b() {
            /* class com.tt.miniapphost.p3370d.C67479c.C674801 */

            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
            /* renamed from: a */
            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                String b = crossProcessDataEntity.mo234744b("localeLang");
                AppBrandLogger.m52828d("LocaleManager", "got locale from main:" + b);
                if (!TextUtils.isEmpty(b)) {
                    C67479c.this.mo234227a(C67481d.m262479a(b));
                }
            }
        });
    }

    /* renamed from: d */
    public String mo234231d() {
        Locale c = m262467a().mo234230c();
        if (c == null) {
            return "";
        }
        if (TextUtils.isEmpty(c.getCountry())) {
            return c.getLanguage();
        }
        return c.getLanguage() + "_" + c.getCountry();
    }

    /* renamed from: a */
    public static Locale m262468a(Context context) {
        LocaleList localeList;
        if (Build.VERSION.SDK_INT < 24 || (localeList = LocaleList.getDefault()) == null || localeList.isEmpty()) {
            return Locale.getDefault();
        }
        return localeList.get(0);
    }

    /* renamed from: c */
    private boolean m262469c(AbstractC67477a aVar) {
        Iterator<WeakReference<AbstractC67477a>> it = this.f170109a.iterator();
        while (it.hasNext()) {
            AbstractC67477a aVar2 = it.next().get();
            if (aVar2 == null) {
                it.remove();
                AppBrandLogger.m52828d("LocaleManager", "recycle refer");
                continue;
            }
            if (aVar2 == aVar) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public synchronized void mo234226a(AbstractC67477a aVar) {
        if (aVar != null) {
            if (!m262469c(aVar)) {
                AppBrandLogger.m52828d("LocaleManager", "registerLangChangeListener:" + aVar.getClass().getSimpleName());
                this.f170109a.add(new WeakReference<>(aVar));
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo234229b(AbstractC67477a aVar) {
        if (aVar != null) {
            Iterator<WeakReference<AbstractC67477a>> it = this.f170109a.iterator();
            while (it.hasNext()) {
                AbstractC67477a aVar2 = it.next().get();
                if (aVar2 == null) {
                    it.remove();
                    AppBrandLogger.m52828d("LocaleManager", "recycle refer");
                } else if (aVar2 == aVar) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo234227a(Locale locale) {
        if (this.f170110b == null || !TextUtils.equals(locale.toString(), this.f170110b.toString())) {
            this.f170110b = locale;
            AppBrandLogger.m52828d("LocaleManager", "notifyLangChange:" + locale);
            Iterator<WeakReference<AbstractC67477a>> it = this.f170109a.iterator();
            while (it.hasNext()) {
                AbstractC67477a aVar = it.next().get();
                if (aVar == null) {
                    it.remove();
                    AppBrandLogger.m52828d("LocaleManager", "recycle refer");
                } else {
                    aVar.onLanguageChange();
                }
            }
        }
    }
}
