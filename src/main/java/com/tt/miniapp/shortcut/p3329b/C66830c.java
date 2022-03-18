package com.tt.miniapp.shortcut.p3329b;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import androidx.core.content.ContextCompat;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.net.C66517e;
import com.tt.miniapp.shortcut.C66827b;
import com.tt.miniapp.shortcut.C66844c;
import com.tt.miniapp.shortcut.ShortcutResult;
import com.tt.miniapp.shortcut.ShortcutService;
import com.tt.miniapp.shortcut.dialog.C66845a;
import com.tt.miniapp.shortcut.dialog.C66848b;
import com.tt.miniapp.shortcut.dialog.C66849c;
import com.tt.miniapp.shortcut.dialog.C66857d;
import com.tt.miniapp.shortcut.dialog.C66858e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3370d.AbstractC67477a;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.refer.common.util.C67866g;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.tt.miniapp.shortcut.b.c */
public class C66830c extends AbstractC66828a {

    /* renamed from: e */
    public static C66834a f168587e;

    /* renamed from: com.tt.miniapp.shortcut.b.c$a */
    private static class C66834a implements AbstractC67477a {

        /* renamed from: a */
        public long f168593a;

        /* renamed from: b */
        public volatile Locale f168594b = Locale.ENGLISH;

        @Override // com.tt.miniapphost.p3370d.AbstractC67477a
        public void onLanguageChange() {
            m260760b();
        }

        public C66834a() {
            if (HostDependManager.getInst().isEnableI18nNetRequest()) {
                C67479c.m262467a().mo234226a(this);
                m260760b();
            }
        }

        /* renamed from: b */
        private void m260760b() {
            Locale b = C67479c.m262467a().mo234228b();
            if (b != null) {
                AppbrandConstant.C65701b.m257612c();
                m260759a(String.format("http://s.ipstatp.com/fe_toutiao/helo_instruction_page/%1$s/", b.getLanguage()), b);
            }
        }

        /* renamed from: a */
        public String mo232767a() {
            if (!HostDependManager.getInst().isEnableI18nNetRequest()) {
                AppbrandConstant.C65701b.m257612c();
                return "https://tmaportal.snssdk.com/jssdk/h5/add_to_desktop_learn_more/";
            }
            AppbrandConstant.C65701b.m257612c();
            return String.format("http://s.ipstatp.com/fe_toutiao/helo_instruction_page/%1$s/", this.f168594b.getLanguage());
        }

        /* renamed from: a */
        private void m260759a(final String str, final Locale locale) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f168593a = elapsedRealtime;
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.shortcut.p3329b.C66830c.C66834a.C668351 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    try {
                        Response execute = C66517e.m259917a().newBuilder().connectTimeout(5000, TimeUnit.MILLISECONDS).writeTimeout(5000, TimeUnit.MILLISECONDS).readTimeout(5000, TimeUnit.MILLISECONDS).build().newCall(new Request.Builder().head().url(str).build()).execute();
                        if (execute != null && execute.code() == 200 && elapsedRealtime >= C66834a.this.f168593a) {
                            C66834a.this.f168594b = locale;
                        }
                    } catch (IOException e) {
                        AppBrandLogger.m52829e("ShortcutUrlManager", e);
                    }
                }
            }, Schedulers.shortIO());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.shortcut.p3329b.AbstractC66828a
    /* renamed from: b */
    public ShortcutResult mo232759b() {
        AppbrandContext.getMainHandler().postDelayed(new Runnable() {
            /* class com.tt.miniapp.shortcut.p3329b.C66830c.RunnableC668311 */

            public void run() {
                if (((ShortcutService) AppbrandApplicationImpl.getInst(C66830c.this.f168586d).getService(ShortcutService.class)).isShowDialog()) {
                    C66830c cVar = C66830c.this;
                    cVar.mo232760a(cVar.f168584b);
                }
            }
        }, 150);
        return null;
    }

    /* renamed from: a */
    public void mo232761a(Context context) {
        C66844c.m260775a(context);
    }

    /* renamed from: a */
    public void mo232760a(final Activity activity) {
        C66857d dVar = new C66857d(C66845a.m260784a(activity, activity.getString(R.string.microapp_m_try_add_short_cut)));
        List<C66858e> a = C66845a.m260785a(activity, new String[]{activity.getString(R.string.microapp_m_short_cut_tip1, new Object[]{AppbrandContext.getInst().getInitParams().mo234501a(101, AppbrandUtil.getApplicationName(AppbrandContext.getInst().getApplicationContext()))}), activity.getString(R.string.microapp_m_short_cut_tip2)});
        a.add(new C66858e.C66859a().mo232799a(activity.getString(R.string.microapp_m_short_cut_more)).mo232797a(ContextCompat.getColor(activity, R.color.microapp_m_ssxinlanse2)).mo232796a(activity.getResources().getDimension(R.dimen.microapp_m_text_size_16)).mo232798a(new C66845a.AbstractC66847a() {
            /* class com.tt.miniapp.shortcut.p3329b.C66830c.C668322 */

            @Override // com.tt.miniapp.shortcut.dialog.C66845a.AbstractC66847a
            /* renamed from: a */
            public void mo232763a(String str) {
                C66827b.m260744b("learn_more", C66830c.this.f168586d);
                HostDependManager inst = HostDependManager.getInst();
                Activity activity = activity;
                inst.jumpToWebView(activity, C66830c.f168587e.mo232767a() + "?phoneBrand=" + C66844c.m260773a() + "&aid=" + AppbrandContext.getInst().getInitParams().mo234510j(), activity.getString(R.string.microapp_m_shortcut_tutorial), false);
                C66827b.m260743b(C66830c.this.f168586d);
            }
        }).mo232800a());
        C66849c.m260793a(new C66845a(dVar, new C66848b(a, true, 8388611), activity, new C66857d(new C66858e.C66859a().mo232799a(activity.getString(R.string.microapp_m_setting)).mo232797a(ContextCompat.getColor(activity, R.color.microapp_m_black_1)).mo232796a(activity.getResources().getDimension(R.dimen.microapp_m_text_size_16)).mo232800a()), new C66857d(new C66858e.C66859a().mo232799a(activity.getString(R.string.microapp_m_know)).mo232796a(activity.getResources().getDimension(R.dimen.microapp_m_text_size_16)).mo232797a(ContextCompat.getColor(activity, R.color.microapp_m_black_1)).mo232800a())), new C66849c.AbstractC66856a() {
            /* class com.tt.miniapp.shortcut.p3329b.C66830c.C668333 */

            @Override // com.tt.miniapp.shortcut.dialog.C66849c.AbstractC66856a
            /* renamed from: c */
            public void mo232766c() {
                C66827b.m260740a(C66830c.this.f168586d);
            }

            @Override // com.tt.miniapp.shortcut.dialog.C66849c.AbstractC66856a
            /* renamed from: b */
            public void mo232765b() {
                C66827b.m260744b("back", C66830c.this.f168586d);
            }

            @Override // com.tt.miniapp.shortcut.dialog.C66849c.AbstractC66856a
            /* renamed from: a */
            public void mo232764a() {
                C66827b.m260744b("go_configuration", C66830c.this.f168586d);
                C66830c.this.mo232761a((Context) activity);
                ((ShortcutService) AppbrandApplicationImpl.getInst(C66830c.this.f168586d).getService(ShortcutService.class)).setOpenSettingPage(true);
            }
        });
    }

    C66830c(C66838e eVar, IAppContext iAppContext) {
        super(eVar, iAppContext);
        if (f168587e == null) {
            f168587e = new C66834a();
        }
    }
}
