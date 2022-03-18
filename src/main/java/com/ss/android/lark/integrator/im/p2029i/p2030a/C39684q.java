package com.ss.android.lark.integrator.im.p2029i.p2030a;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.biz.core.api.AbstractC29540ab;
import com.ss.android.lark.biz.core.api.BadgeStyle;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.im.i.a.q */
public class C39684q implements AbstractC38037a.AbstractC38062v {

    /* renamed from: a */
    private final Map<AbstractC38037a.AbstractC38059s, AbstractC29540ab> f101217a = new HashMap();

    /* renamed from: b */
    private final Map<C37030f.AbstractC37033c, ComponentCallbacks2> f101218b = new HashMap();

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38062v
    /* renamed from: a */
    public void mo139293a() {
        C39603g.m157159a().getCoreDependency().mo143594j();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38062v
    /* renamed from: c */
    public boolean mo139300c() {
        return C39603g.m157159a().getCoreDependency().mo143599l();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38062v
    /* renamed from: f */
    public boolean mo139303f() {
        return C39603g.m157159a().getCoreDependency().mo143601m();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38062v
    /* renamed from: g */
    public boolean mo139304g() {
        return C39603g.m157159a().getCoreDependency().mo143603n();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38062v
    /* renamed from: d */
    public boolean mo139301d() {
        if (C39603g.m157159a().getCoreDependency().mo143596k() == BadgeStyle.WEAK_REMIND) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38062v
    /* renamed from: e */
    public int mo139302e() {
        return C39603g.m157159a().getCoreDependency().mo143579e().mo105510a().getNumber();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38062v
    /* renamed from: b */
    public boolean mo139299b() {
        if (C39603g.m157159a().getCoreDependency().mo143596k() == BadgeStyle.STRONG_REMIND) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38062v
    /* renamed from: a */
    public void mo139294a(final IGetDataCallback<Integer> iGetDataCallback) {
        C39603g.m157159a().getCoreDependency().mo143462a(new IGetDataCallback<TimeFormatSetting>() {
            /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39684q.C396851 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(TimeFormatSetting timeFormatSetting) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(Integer.valueOf(timeFormatSetting.mo105510a().getNumber()));
                }
            }
        });
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38062v
    /* renamed from: b */
    public void mo139298b(AbstractC38037a.AbstractC38059s sVar) {
        AbstractC29540ab abVar = this.f101217a.get(sVar);
        if (abVar != null) {
            C39603g.m157159a().getCoreDependency().mo143535b(abVar);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38062v
    /* renamed from: a */
    public void mo139295a(final C37030f.AbstractC37033c cVar) {
        ComponentCallbacks2C396862 r0 = new ComponentCallbacks2() {
            /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39684q.ComponentCallbacks2C396862 */

            /* renamed from: c */
            private int f101223c;

            public void onLowMemory() {
            }

            public void onTrimMemory(int i) {
            }

            public void onConfigurationChanged(Configuration configuration) {
                int i = configuration.uiMode & 48;
                Log.m165379d("SettingDependency", "onConfigurationChanged:" + this.f101223c + "/" + i);
                if (this.f101223c != i) {
                    this.f101223c = i;
                    C37030f.AbstractC37033c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo134316a(i);
                    }
                }
            }
        };
        this.f101218b.put(cVar, r0);
        C39603g.m157159a().getCoreDependency().mo143421a(r0);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38062v
    /* renamed from: a */
    public void mo139296a(AbstractC38037a.AbstractC38059s sVar) {
        $$Lambda$q$xinQKobGroUOLTHSdhHvBMjQz1g r0 = new AbstractC29540ab() {
            /* class com.ss.android.lark.integrator.im.p2029i.p2030a.$$Lambda$q$xinQKobGroUOLTHSdhHvBMjQz1g */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29540ab
            public final void onLanguageChange(Locale locale, Locale locale2) {
                C39684q.lambda$xinQKobGroUOLTHSdhHvBMjQz1g(AbstractC38037a.AbstractC38059s.this, locale, locale2);
            }
        };
        this.f101217a.put(sVar, r0);
        C39603g.m157159a().getCoreDependency().mo143465a(r0);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38062v
    /* renamed from: a */
    public boolean mo139297a(long j) {
        return C39603g.m157159a().getCoreDependency().mo143499a(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m157535a(AbstractC38037a.AbstractC38059s sVar, Locale locale, Locale locale2) {
        if (sVar != null) {
            sVar.mo137914a(locale, locale2);
        }
    }
}
