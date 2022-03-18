package com.ss.android.lark.passport.infra.base.architecture;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatDelegate;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.air.AirActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.p2069j.p2070a.C40633aa;
import com.ss.android.lark.p2069j.p2070a.C40652s;
import com.ss.android.lark.passport.infra.base.architecture.C49018a;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.log.MonitorUtil;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.p2438d.AbstractC49113a;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.statistics.AbstractC49137a;
import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import com.ss.android.lark.passport.infra.util.C49145aa;
import com.ss.android.lark.passport.infra.util.C49146ab;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.C49217t;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.infra.widget.DialogC49246b;
import com.ss.android.lark.passport.infra.widget.p2450d.C49266a;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.p2455a.AbstractC49343a;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.android.lark.statistics.Statistics;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class BaseActivity<T extends AbstractC49021b> extends AirActivity implements AbstractC49137a {

    /* renamed from: a */
    protected T f123050a;

    /* renamed from: b */
    public DialogC49246b f123051b;

    /* renamed from: c */
    public final PassportLog f123052c = PassportLog.m193684a(mo171150v());

    /* renamed from: d */
    public String f123053d = getClass().getSimpleName();

    /* renamed from: e */
    protected boolean f123054e = true;

    /* renamed from: f */
    public UniContext f123055f;

    /* renamed from: g */
    protected final AbstractC49343a f123056g = new C49017a();

    /* renamed from: h */
    private boolean f123057h = true;

    /* access modifiers changed from: protected */
    public boolean cA_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo171132e() {
        this.f123054e = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo171133f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo171135g() {
        this.f123057h = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo171136h() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public UniContext mo171147s() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo171149u() {
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.passport.infra.base.architecture.BaseActivity$a */
    public static class C49017a implements AbstractC49343a {

        /* renamed from: a */
        private AbstractC49113a f123061a;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2455a.AbstractC49343a
        /* renamed from: e */
        public void mo171160e(Context context) {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2455a.AbstractC49343a
        /* renamed from: f */
        public void mo171161f(Context context) {
        }

        private C49017a() {
        }

        /* renamed from: a */
        public void mo171156a(AbstractC49113a aVar) {
            this.f123061a = aVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2455a.AbstractC49343a
        /* renamed from: b */
        public void mo171157b(Context context) {
            Statistics.onResume(context);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2455a.AbstractC49343a
        /* renamed from: c */
        public void mo171158c(Context context) {
            Statistics.onPause(context);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2455a.AbstractC49343a
        /* renamed from: a */
        public void mo171155a(Context context) {
            Statistics.onCreate(context);
            if (this.f123061a != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("step_name", this.f123061a.mo171152b());
                hashMap.put("stage_name", "onCreate");
                hashMap.put("tag_name", this.f123061a.mo171153c());
                WatcherHelper.m193665a(this.f123061a.mo171151a(), C40652s.f103162e, hashMap);
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2455a.AbstractC49343a
        /* renamed from: d */
        public void mo171159d(Context context) {
            if (this.f123061a != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("step_name", this.f123061a.mo171152b());
                hashMap.put("stage_name", "onDestroy");
                hashMap.put("tag_name", this.f123061a.mo171153c());
                WatcherHelper.m193665a(this.f123061a.mo171151a(), C40652s.f103162e, hashMap);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public PassportLog mo171148t() {
        return this.f123052c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public OPMonitorCode mo171150v() {
        return C40633aa.f103061a;
    }

    static {
        AppCompatDelegate.m728a(true);
    }

    /* renamed from: o */
    public void mo171143o() {
        DialogC49246b bVar = this.f123051b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* renamed from: p */
    public void mo171144p() {
        T t = this.f123050a;
        if (t != null) {
            t.mo171183f();
        }
    }

    /* renamed from: q */
    public C49018a.C49019a mo171145q() {
        return new C49018a.C49019a(C49018a.f123065a);
    }

    /* renamed from: r */
    public C49018a.C49019a mo171146r() {
        return new C49018a.C49019a(C49018a.f123067c);
    }

    /* renamed from: c */
    private void mo170970c() {
        if (this.f123057h) {
            mo171130c(R.color.bg_body);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo171137i() {
        return !ServiceFinder.m193748c().isLogin();
    }

    @Override // com.ss.android.lark.passport.infra.statistics.AbstractC49137a
    /* renamed from: k */
    public String mo171139k() {
        return C49146ab.m193803a(getIntent());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        this.f123056g.mo171161f(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        this.f123056g.mo171160e(this);
        super.onStop();
    }

    /* renamed from: a */
    private String mo170967a() {
        Map map;
        Intent intent = getIntent();
        if (intent == null || (map = (Map) intent.getSerializableExtra("step_info")) == null) {
            return "";
        }
        return new JSONObject(map).getString("flow_type");
    }

    /* renamed from: b */
    private void mo170969b() {
        int i;
        if (!mo171136h()) {
            if (mo171137i()) {
                i = R.drawable.signin_sdk_common_bg;
            } else {
                i = R.drawable.signin_theme_background;
            }
            getWindow().setBackgroundDrawableResource(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo171140l() {
        RouterAnno routerAnno = (RouterAnno) getClass().getAnnotation(RouterAnno.class);
        if (routerAnno != null) {
            return routerAnno.name();
        }
        return "";
    }

    /* renamed from: m */
    public DialogC49246b mo171141m() {
        if (this.f123051b == null) {
            mo171142n();
        }
        if (!this.f123051b.isShowing()) {
            this.f123051b.show();
        }
        return this.f123051b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo171142n() {
        DialogC49246b bVar = new DialogC49246b(this, this.f123054e);
        this.f123051b = bVar;
        bVar.setOnKeyListener(new DialogInterface.OnKeyListener() {
            /* class com.ss.android.lark.passport.infra.base.architecture.BaseActivity.DialogInterface$OnKeyListenerC490162 */

            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                BaseActivity.this.mo171144p();
                return false;
            }
        });
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (C49154ag.m193835a((Activity) this)) {
            try {
                super.onBackPressed();
            } catch (IllegalStateException e) {
                e.printStackTrace();
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        mo171143o();
        mo171148t().mo171465b(this.f123053d, "onDestroy");
        this.f123056g.mo171159d(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onPause() {
        super.onPause();
        C49266a.m194145a();
        mo171148t().mo171465b(this.f123053d, "onPause");
        this.f123056g.mo171158c(this);
        C49203q.m193972a((Activity) this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        mo171138j();
        mo171148t().mo171465b(this.f123053d, "onResume");
        C49266a.m194149b();
        this.f123056g.mo171157b(this);
    }

    /* renamed from: j */
    public void mo171138j() {
        String str;
        RouterAnno routerAnno = (RouterAnno) getClass().getAnnotation(RouterAnno.class);
        if (routerAnno != null) {
            str = routerAnno.teaName();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent(str).mo171607a("flow_type", mo170967a()));
        }
    }

    public void finish() {
        boolean z;
        super.finish();
        if ((getIntent().getFlags() & 65536) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (cA_() && !z) {
            SigninParams signinParams = (SigninParams) getIntent().getSerializableExtra("tag_signin_params");
            if (signinParams == null || !signinParams.isShowDefaultAnimation()) {
                C49018a.m193089a(this, mo171146r(), new C49018a.C49019a(C49018a.f123066b));
            } else {
                C49018a.m193088a(this, new C49018a.C49019a(C49018a.f123066b));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo171130c(int i) {
        C49217t.m194040a(this, i);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo171128a(int i) {
        if (this.f123054e) {
            mo171129b(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(mo170968a(context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo171129b(int i) {
        C49145aa.m193799b(this, getWindow(), i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            bundle.putAll(extras);
        }
    }

    /* renamed from: a */
    private Context mo170968a(Context context) {
        Locale locale = ServiceFinder.m193752g().getCommonEnv().getLanguageEnv().getLocale();
        Configuration configuration = new Configuration();
        if (Build.VERSION.SDK_INT >= 24) {
            configuration.setLocale(locale);
        } else {
            configuration.locale = locale;
        }
        context.getResources().updateConfiguration(context.getResources().getConfiguration(), context.getResources().getDisplayMetrics());
        return context.createConfigurationContext(configuration);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo171127a(Intent intent) {
        if (intent == null) {
            return Bundle.EMPTY;
        }
        if (intent.getExtras() == null) {
            return Bundle.EMPTY;
        }
        return intent.getExtras();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (bundle != null) {
            getIntent().putExtras(bundle);
        }
        try {
            this.f123055f = (UniContext) getIntent().getSerializableExtra("key_of_uni_context");
        } catch (Throwable th) {
            PassportLog passportLog = this.f123052c;
            String str = this.f123053d;
            passportLog.mo171462a(str, "read UniContext from intent failed: " + getClass().getSimpleName(), th);
        }
        if (this.f123055f == null) {
            this.f123055f = mo171147s();
        }
        if ((getIntent().getFlags() & 65536) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (cA_() && !z) {
            SigninParams signinParams = (SigninParams) getIntent().getSerializableExtra("tag_signin_params");
            if (signinParams == null || !signinParams.isShowDefaultAnimation()) {
                C49018a.m193089a(this, mo171145q(), new C49018a.C49019a(C49018a.f123065a));
            } else {
                C49018a.m193088a(this, new C49018a.C49019a(C49018a.f123065a));
            }
        }
        if (!mo171133f()) {
            mo170969b();
        }
        mo171128a((int) R.color.transparent);
        mo170970c();
        final String simpleName = getClass().getSimpleName();
        C490151 r0 = new AbstractC49113a() {
            /* class com.ss.android.lark.passport.infra.base.architecture.BaseActivity.C490151 */

            @Override // com.ss.android.lark.passport.infra.p2438d.AbstractC49113a
            /* renamed from: c */
            public String mo171153c() {
                return simpleName;
            }

            @Override // com.ss.android.lark.passport.infra.p2438d.AbstractC49113a
            /* renamed from: a */
            public UniContext mo171151a() {
                return BaseActivity.this.f123055f;
            }

            @Override // com.ss.android.lark.passport.infra.p2438d.AbstractC49113a
            /* renamed from: b */
            public String mo171152b() {
                return BaseActivity.this.mo171140l();
            }
        };
        AbstractC49343a aVar = this.f123056g;
        if (aVar instanceof C49017a) {
            ((C49017a) aVar).mo171156a(r0);
        }
        this.f123056g.mo171155a(this);
        mo171148t().mo171465b(this.f123053d, "onCreate");
        MonitorUtil.m193720d(mo171140l());
        String u = mo171149u();
        if (!TextUtils.isEmpty(u)) {
            this.f123052c.mo171460a(u);
        }
    }
}
